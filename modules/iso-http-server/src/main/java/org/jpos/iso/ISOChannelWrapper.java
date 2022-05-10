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

package org.jpos.iso;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

import org.jpos.http.ClientRequestDetails;

public class ISOChannelWrapper {
    private BaseChannel channel;

    public BaseChannel getChannel(InputStream in, OutputStream out, ClientRequestDetails requestDetails)
            throws IOException {
        BaseChannel c = (BaseChannel) channel.clone();
        FakeSocket s = new FakeSocket(in, out);
        s.setRequest(requestDetails);
        c.connect(s);

        return c;
    }

    public BaseChannel getChannel() {
        return channel;
    }

    public void setChannel(BaseChannel channel) {
        this.channel = channel;
    }

    public void setPackager(ISOPackager p) {
        channel.setPackager(p);
    }

    public ISOPackager getPackager() {
        return channel != null ?  channel.getPackager() : null;
    }
    
    static class FakeSocket extends Socket {
        InputStream in;
        OutputStream out;
        boolean isConnected = false;
        ClientRequestDetails requestDetails;

        public FakeSocket(InputStream in, OutputStream out) {
            this.in = in;
            this.out = out;
            isConnected = true;
        }

        public void setRequest(ClientRequestDetails requestDetails) {
            this.requestDetails = requestDetails;
        }

        @Override
        public boolean isConnected() {
            return isConnected;
        }

        @Override
        public InputStream getInputStream() {
            return in;
        }

        @Override
        public OutputStream getOutputStream() {
            return out;
        }

        @Override
        public InetAddress getInetAddress() {
            try {
                return (requestDetails != null && requestDetails.getHost() != null)
                        ? InetAddress.getByName(requestDetails.getHost()) : InetAddress.getLoopbackAddress();
            } catch (Exception ignore) {

            }
            return InetAddress.getLoopbackAddress();
        }

        @Override
        public int getPort() {
            return (requestDetails != null && requestDetails.getHost() != null) ? requestDetails.getPort() : 0;
        }

        @Override
        public void setSoLinger(boolean on, int linger) throws SocketException {
        }

        @Override
        public synchronized void setSoTimeout(int timeout) throws SocketException {
        }

        @Override
        public void setKeepAlive(boolean on) throws SocketException {
        }

        @Override
        public synchronized void close() throws IOException {
            this.isConnected = false;
            super.close();
        }
    }
}
