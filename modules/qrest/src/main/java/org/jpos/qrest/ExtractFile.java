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

import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.multipart.DefaultHttpDataFactory;
import io.netty.handler.codec.http.multipart.FileUpload;
import io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.netty.handler.codec.http.multipart.InterfaceHttpData;
import io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType;
import org.jpos.core.Configurable;
import org.jpos.core.Configuration;
import org.jpos.core.ConfigurationException;
import org.jpos.transaction.Context;
import org.jpos.transaction.TransactionParticipant;

import java.io.*;
import java.nio.channels.FileChannel;

import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;
import static org.jpos.qrest.Constants.REQUEST;
import static org.jpos.qrest.Constants.RESPONSE;

/**
 * Extracts a file from the request
 */
public class ExtractFile implements TransactionParticipant, Configurable {

    private String ctxKey;

    @Override
    public int prepare(long id, Serializable context) {
        Context ctx = (Context) context;
        FullHttpRequest request = ctx.get(REQUEST);

        try {
            ctx.put(ctxKey, getFileFromRequest(request));
        } catch (IOException e) {
            ctx.log(e);
            ctx.put(RESPONSE, new DefaultFullHttpResponse(HTTP_1_1, HttpResponseStatus.NOT_FOUND));
            return ABORTED;
        }

        return PREPARED | READONLY | NO_JOIN;
    }

    protected File getFileFromRequest(FullHttpRequest httpRequest) throws IOException {

        HttpPostRequestDecoder httpDecoder = new HttpPostRequestDecoder(new DefaultHttpDataFactory(true), httpRequest);
        httpDecoder.setDiscardThreshold(0);

        httpDecoder.offer(httpRequest);
        return readChunk(httpDecoder);

    }

    private File readChunk(HttpPostRequestDecoder httpDecoder) throws IOException {

        for (InterfaceHttpData data : httpDecoder.getBodyHttpDatas()) {
            if (data == null) continue;
            try {
                HttpDataType httpDataType = data.getHttpDataType();
                if (httpDataType == HttpDataType.FileUpload) {
                    final FileUpload fileUpload = (FileUpload) data;
                    final File file = File.createTempFile(fileUpload.getFilename(), ".qrest.extract_file");
                    if (!file.exists() && !file.createNewFile()) {
                        throw new IOException("Can't create file " + file.getAbsolutePath());
                    }
                    try (FileInputStream fis = new FileInputStream(fileUpload.getFile());
                         FileChannel inputChannel = fis.getChannel();
                         FileOutputStream fos = new FileOutputStream(file);
                         FileChannel outputChannel = fos.getChannel()) {
                        outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
                    }
                    return file;
                }
            } finally {
                data.release();
            }
        }
        return null;
    }

    @Override
    public void setConfiguration(Configuration cfg) throws ConfigurationException {
        this.ctxKey = cfg.get("CTX_KEY", "FILE_FROM_REQUEST");
    }
}
