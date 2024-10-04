/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2024 jPOS Software SRL
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

import io.netty.handler.codec.http.HttpResponseStatus;

public class Response {
    private HttpResponseStatus status;
    private Object body;
    private String contentType;

    public Response(HttpResponseStatus status, Object body) {
        this(status, body, null);
    }

    public Response(HttpResponseStatus status, Object body, String contentType) {
        this.status = status;
        this.body = body;
        this.contentType = contentType;
    }

    public HttpResponseStatus status() {
        return status;
    }

    public Object body() {
        return body;
    }

    public String contentType() {
        return contentType;
    }

    @Override
    public String toString() {
        return "Response{" +
          "status=" + status +
          "contentType="+ contentType +
          ", body=" + body +
          '}';
    }
}

