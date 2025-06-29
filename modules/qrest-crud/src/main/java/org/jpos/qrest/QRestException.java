/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2025 jPOS Software SRL
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

public class QRestException extends Exception {
    Response r;

    public QRestException(Response r) {
        super(r.status().reasonPhrase());
        this.r = r;
    }

    public QRestException(String message, Response r) {
        super(message);
        this.r = r;
    }

    public QRestException(String message, Throwable cause, Response r) {
        super(message, cause);
        this.r = r;
    }

    public QRestException(Throwable cause, Response r) {
        super(cause);
        this.r = r;
    }

    public QRestException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, Response r) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.r = r;
    }

    public Response getResponse() {
        return r;
    }
}

