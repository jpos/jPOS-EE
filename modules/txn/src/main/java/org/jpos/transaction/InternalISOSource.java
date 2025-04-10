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

package org.jpos.transaction;

import org.jpos.iso.ISOMsg;
import org.jpos.iso.ISOSource;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author jpaoletti, apr
 */
public class InternalISOSource implements ISOSource {
    private final BlockingQueue<ISOMsg> queue = new LinkedBlockingQueue<>(1);

    public void send(ISOMsg m) {
        try {
            queue.put(m);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore the interrupt status
        }
    }

    public boolean isConnected() {
        return true;
    }

    public ISOMsg getResponse(long timeout) {
        try {
            return queue.poll(timeout, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return null;
        }
    }
}
