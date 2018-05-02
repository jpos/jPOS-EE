/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2018 jPOS Software SRL
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

import java.net.BindException;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.timeout.IdleStateHandler;
import org.jpos.iso.ISOUtil;
import org.jpos.q2.QBeanSupport;
import org.jpos.space.Space;
import org.jpos.space.SpaceFactory;
import org.jpos.transaction.Context;
import org.jpos.util.NameRegistrar;

public class RestServer extends QBeanSupport implements Runnable {
    private ServerBootstrap serverBootstrap;
    private ChannelFuture cf;
    private EventLoopGroup bossGroup;
    private EventLoopGroup workerGroup;
    private Space sp;
    private Thread initializerThread;

    @Override
    protected void initService() {
        sp = SpaceFactory.getSpace();
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
                  ch.pipeline().addLast(new HttpServerCodec()) ;
                  ch.pipeline().addLast(new HttpObjectAggregator(512*1024));
                  ch.pipeline().addLast(new RestSession(RestServer.this));
              }
          })
          .option(ChannelOption.SO_BACKLOG, 128)
          .option(ChannelOption.SO_REUSEADDR, true)
          .childOption(ChannelOption.SO_KEEPALIVE, true);
    }

    @Override
    protected void startService () throws Exception {
        initializerThread = new Thread(this, getName());
        initializerThread.start();
    }

    @Override
    protected void stopService() {
        if (initializerThread != null) {
            initializerThread.interrupt();
            NameRegistrar.unregister(getName());
            cf.channel().close();
        }
    }

    @Override
    protected void destroyService() {
        workerGroup.shutdownGracefully();
        bossGroup.shutdownGracefully();
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

    public void queue (Context ctx) {
        sp.out(cfg.get("queue"), ctx, 60000L);
    }
}
