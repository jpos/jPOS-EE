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

package org.jpos.http;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jpos.iso.ISOChannel;
import org.jpos.iso.ISOException;
import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;

public class ISOResponse implements ISOSource {
    ISOChannel channel;
    ByteArrayOutputStream out;
    boolean timedout = false;

    public List<ISOMsg> request;
    public List<ISOMsg> response;

    public ISOResponse(ISOChannel channel, List<ISOMsg> request, ByteArrayOutputStream out) {
        super();
        this.channel = channel;
        this.request = request;
        this.out = out;
        response = new ArrayList<ISOMsg>(request.size());
    }

    @Override
    public synchronized void send(ISOMsg m) throws IOException, ISOException {
        response.add(m);
        channel.send(m);
        notifyAll();
    }

    @Override
    public boolean isConnected() {
        return !timedout && !hasResponse();
    }

    public boolean hasResponse() {
        return response.size() >= request.size();
    }

    public synchronized byte[] getResponse(long timeoutMs) {
        long timeout = System.currentTimeMillis() + timeoutMs;
        while (!hasResponse() && timeout > System.currentTimeMillis()) {
            try {
                wait(timeout - System.currentTimeMillis());
            } catch (Exception ignore) {
            }
        }
        if (!hasResponse()) {
            timedout = true;
        }
        
        if (response.isEmpty()) {
            return null;
        } else {
            return out.toByteArray();
        }
    }

    public byte[] getResponse() {
        return (!response.isEmpty() ? out.toByteArray() : null);
    }

}
