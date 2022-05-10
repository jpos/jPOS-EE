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

package org.jpos.qrest.participant;

import java.io.*;
import java.net.URI;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.*;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import javax.activation.MimetypesFileTypeMap;

import static io.netty.handler.codec.http.HttpHeaderNames.*;
import static io.netty.handler.codec.http.HttpResponseStatus.OK;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static org.jpos.qrest.Constants.REQUEST;
import static org.jpos.qrest.Constants.RESPONSE;

public class StaticContent implements TransactionParticipant, Configurable {
    protected File content;
    protected File documentRoot;
    private MimetypesFileTypeMap mimeTypesMap = new MimetypesFileTypeMap();
    private SimpleDateFormat dateFormatter = new SimpleDateFormat(HTTP_DATE_FORMAT, Locale.US);

    private static final String HTTP_DATE_FORMAT = "EEE, dd MMM yyyy HH:mm:ss zzz";
    private static final String HTTP_DATE_GMT_TIMEZONE = "GMT";
    private static final int HTTP_CACHE_SECONDS = 60;

    public StaticContent() {
        dateFormatter.setTimeZone(TimeZone.getTimeZone(HTTP_DATE_GMT_TIMEZONE));
    }

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);
        QueryStringDecoder decoder = new QueryStringDecoder(request.uri());
        String path = URI.create(decoder.uri()).getPath();

        try {
            File bodyFile = content != null ? content : jailedFile(documentRoot.getCanonicalFile(), path);
            if (!bodyFile.canRead() || !bodyFile.isFile())
                throw new IOException ("Unable to read '" + bodyFile + "'");
            ByteBuf body = toByteBuf(ctx, bodyFile);
            HttpResponse response = new DefaultFullHttpResponse(HTTP_1_1, OK, body);
            setHeaders(response, bodyFile);
            ctx.put(RESPONSE, response);
        }
        catch (AccessDeniedException e) {
            ctx.log(e.getMessage());
            ctx.put(RESPONSE, new DefaultFullHttpResponse(HTTP_1_1, HttpResponseStatus.FORBIDDEN));
        }
        catch (IOException e) {
            ctx.log(e.getMessage());
            ctx.put(RESPONSE, new DefaultFullHttpResponse(HTTP_1_1, HttpResponseStatus.NOT_FOUND));
        }
        return PREPARED | NO_JOIN | READONLY;
    }


    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.documentRoot = toFile(cfg.get("documentRoot", null));
        this.content = toFile(documentRoot, cfg.get("content", null));

        if (documentRoot == null)
            throw new ConfigurationException ("no documentRoot");
    }

    protected File toFile (String s) throws ConfigurationException {
        File f = null;
        if (s != null) {
            f = new File(s);
            if (!f.canRead())
                throw new ConfigurationException ("Can't access '" + f.toString() + "'");
        }
        return f;
    }
    protected File toFile (File parent, String s) throws ConfigurationException {
        File f = null;
        if (s != null) {
            f = new File(parent, s);
            if (!f.canRead())
                throw new ConfigurationException ("Can't access '" + f.toString() + "'");
        }
        return f;
    }

    protected ByteBuf toByteBuf (Context ctx, File f) throws IOException {
        return Unpooled.wrappedBuffer(Files.readAllBytes(f.toPath()));
    }
    
    private void setHeaders(HttpResponse response, File f) {
        Calendar time = new GregorianCalendar();
        time.add(Calendar.SECOND, HTTP_CACHE_SECONDS);
        response.headers().set(DATE, dateFormatter.format(time.getTime()));
        response.headers().set(EXPIRES, dateFormatter.format(time.getTime()));
        response.headers().set(CACHE_CONTROL, "private, max-age=" + HTTP_CACHE_SECONDS);
        response.headers().set(LAST_MODIFIED, dateFormatter.format(f.lastModified()));
        response.headers().set(CONTENT_TYPE, mimeTypesMap.getContentType(f.getPath()));
    }

    private File jailedFile (File parent, String path) throws IOException {
        File f = new File(parent, path);
        if (!isInTree(parent, f))
            throw new AccessDeniedException("Invalid path '" + f.getCanonicalPath() + " not child of " + parent);
        return f;

    }

    private boolean isInTree (File parent, File f) throws IOException {
        f = f.getCanonicalFile();
        if (f.getParentFile() == null)
            return false;
        else if (f.getCanonicalFile().getParentFile().equals(parent))
            return true;
        else
            return isInTree (parent, f.getParentFile());
    }
}
