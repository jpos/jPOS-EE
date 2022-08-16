/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2021 jPOS Software SRL
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.jpos.qrest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.URI;
import java.security.*;
import java.util.*;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.*;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.timeout.IdleStateHandler;
import org.jdom2.Element;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.core.XmlConfigurable;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;
import org.jpos.util.LogEvent;
import org.jpos.util.Logger;
import org.jpos.util.NameRegistrar;

import javax.net.ssl.*;

import static io.netty.handler.codec.http.HttpObjectDecoder.*;

public class RestServer extends QBeanSupport implements Runnable, XmlConfigurable {
    private ServerBootstrap serverBootstrap;
    private ChannelFuture cf;
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private Space sp;
    private Thread initializerThread;

    private String password=null;
    private String keyPassword=null;
    private String keyStore=null;
    private boolean serverAuthNeeded;

    private boolean enableTLS=false;
    private boolean clientAuthNeeded=false;
    private String[] enabledCipherSuites;
    private String[] enabledProtocols;
    private String queue;
    private Map<String,List<Route<String>>> routes = new HashMap<>();

    private int maxHeaderSize;
    private int maxContentLength;
    private int maxInitialLineLength;
    private int maxChunkSize;
    private boolean validateHeaders;

    public static final int DEFAULT_MAX_CONTENT_LENGTH = 512*1024;

    @Override
    protected void initService() throws GeneralSecurityException, IOException {
        sp = SpaceFactory.getSpace();
        final SSLContext sslContext = enableTLS ? getSSLContext() : null;
        bossGroup = new NioEventLoopGroup();
        workerGroup = new NioEventLoopGroup();
        serverBootstrap = new ServerBootstrap();
        serverBootstrap
          .group(bossGroup, workerGroup)
          .channel(NioServerSocketChannel.class)
          .childHandler(new ChannelInitializer<SocketChannel>() {
              @Override
              public void initChannel(SocketChannel ch) throws Exception {
                  int timeout = cfg.getInt("timeout", 300);
                  ch.pipeline().addLast(new IdleStateHandler(timeout,timeout,timeout));
                  if (enableTLS) {
                      ch.pipeline().addLast(new SslHandler(getSSLEngine(sslContext), true));
                  }
                  ch.pipeline().addLast(new HttpServerCodec(maxInitialLineLength, maxHeaderSize, maxChunkSize, validateHeaders));
                  ch.pipeline().addLast(new HttpObjectAggregator(maxContentLength));
                  ch.pipeline().addLast(new RestSession(RestServer.this));
              }
          })
          .option(ChannelOption.SO_BACKLOG, 128)
          .option(ChannelOption.SO_REUSEADDR, true)
          .childOption(ChannelOption.SO_KEEPALIVE, true);

        if (enableTLS) {
            logSSLEngineInfo(getSSLEngine(sslContext));
        }
    }

    @Override
    protected void startService () {
        initializerThread = new Thread(this, getName());
        initializerThread.start();
    }

    @Override
    protected void stopService() {
        if (initializerThread != null) {
            initializerThread.interrupt();
            NameRegistrar.unregister(getName());
            if (cf != null && cf.channel() != null)
                cf.channel().close();
        }
    }

    @Override
    protected void destroyService() {
        if (workerGroup != null) {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }

    @Override
    public void run() {
        int port = cfg.getInt("port", 8080);
        while (running()) {
            try {
                cf = serverBootstrap.bind(port).sync();
                if (cf.isSuccess()) {
                    getLog().info (getName() + " ready - port " + port);
                    NameRegistrar.register(getName(), this);
                    break;
                }
            } catch (Throwable t) {
                if (t instanceof BindException) {
                    getLog().warn (t.getMessage() + " port (" + port + ") --- retrying");
                } else {
                    getLog().warn(t);
                    break;
                }
                ISOUtil.sleep(5000L);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void queue (FullHttpRequest request, Context ctx) {
        sp.out(getQueue(request), ctx, 60000L);
    }

    @Override
    public void setConfiguration (Configuration cfg) throws ConfigurationException {
        super.setConfiguration(cfg);
        enableTLS = cfg.getBoolean("TLS", false);
        keyStore = cfg.get("keystore");
        password = cfg.get("storepassword", getPassword());
        keyPassword = cfg.get("keypassword", getKeyPassword());
        clientAuthNeeded = cfg.getBoolean("client-auth", false);
        serverAuthNeeded = cfg.getBoolean("server-auth", false);
        enabledCipherSuites = cfg.getAll("enabled-cipher");
        enabledProtocols = cfg.getAll("enable-protocol");
        queue = cfg.get("queue");

        maxHeaderSize = cfg.getInt("maxHeaderSize", DEFAULT_MAX_HEADER_SIZE);
        maxContentLength = cfg.getInt("maxContentLength", DEFAULT_MAX_CONTENT_LENGTH);
        maxInitialLineLength = cfg.getInt("maxInitialLineLength", DEFAULT_MAX_INITIAL_LINE_LENGTH);
        maxChunkSize = cfg.getInt("maxChunkSize", DEFAULT_MAX_CHUNK_SIZE);
        validateHeaders = cfg.getBoolean("validateHeaders", DEFAULT_CHUNKED_SUPPORTED);
    }

    @Override
    public void setConfiguration(Element e) throws ConfigurationException {
        try {
            for (Element r : e.getChildren("route")) {
                routes.computeIfAbsent(
                  r.getAttributeValue("method"),
                  k -> new ArrayList<>()).add(
                  new Route<>(
                    r.getAttributeValue("path"),
                    r.getAttributeValue("method"),
                    (t, s) -> r.getAttributeValue("queue"))
                );
            }
        } catch (Throwable t) {
            throw new ConfigurationException(t);
        }
    }

    private SSLEngine getSSLEngine(SSLContext sslContext) throws IOException {
        SSLEngine engine = null;
        engine = sslContext.createSSLEngine();
        if (enabledCipherSuites != null && enabledCipherSuites.length > 0) {
            engine.setEnabledCipherSuites(enabledCipherSuites);
        }
        if (enabledProtocols != null && enabledProtocols.length > 0) {
            engine.setEnabledProtocols(enabledProtocols);
        }
        engine.setNeedClientAuth(clientAuthNeeded);
        engine.setUseClientMode(false);
        engine.beginHandshake();
        return engine;
    }

    private SSLContext getSSLContext() throws GeneralSecurityException, IOException {
        KeyStore ks = KeyStore.getInstance("JKS");
        if (keyStore == null || keyStore.length() == 0) {
            keyStore = System.getProperty("user.home") + File.separator + ".keystore";
        }
        try (FileInputStream fis = new FileInputStream(new File(keyStore))) {
            ks.load(fis, password.toCharArray());
        }
        KeyManagerFactory km = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        km.init(ks, keyPassword.toCharArray());
        KeyManager[] kma = km.getKeyManagers();
        TrustManager[] tma = getTrustManagers(ks);
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(kma, tma, new SecureRandom());

        return sslContext;
    }

    private TrustManager[] getTrustManagers(KeyStore ks)
      throws GeneralSecurityException {
        if (serverAuthNeeded) {
            TrustManagerFactory tm = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tm.init( ks );
            return tm.getTrustManagers();
        } else {
            // Create a trust manager that does not validate certificate chains
            return new TrustManager[]{
              new X509TrustManager() {
                  public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                      return new java.security.cert.X509Certificate[] {};
                  }
                  public void checkClientTrusted(
                    java.security.cert.X509Certificate[] certs, String authType) {
                  }
                  public void checkServerTrusted(
                    java.security.cert.X509Certificate[] certs, String authType) {
                  }
              }
            };
        }
    }

    private void logSSLEngineInfo (SSLEngine engine) {
        LogEvent evt = getLog().createInfo();
        evt.addMessage("ciphersuites: " + Arrays.toString(engine.getEnabledCipherSuites()));
        evt.addMessage("   protocols: " + Arrays.toString(engine.getEnabledProtocols()));
        Logger.log(evt);
    }

    // Have custom hooks get passwords
    // You really need to modify these two implementations
    protected String getPassword() {
        return System.getProperty("jpos.ssl.storepass", null);
    }

    protected String getKeyPassword() {
        return System.getProperty("jpos.ssl.keypass", null);
    }

    private String getQueue(FullHttpRequest request) {
        List<Route<String>> routesByMethod = routes.get(request.method().name());
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri());

        if (routesByMethod != null) {
            Optional<Route<String>> route = routesByMethod.stream().filter(r -> r.matches(decoder.uri())).findFirst();
            String path = URI.create(decoder.uri()).getPath();
            if (route.isPresent()) {
                return route.get().apply(route.get(), path);
            }
        }
        return cfg.get("queue");
    }
}
