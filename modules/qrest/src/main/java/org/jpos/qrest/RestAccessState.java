/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2026 jPOS Software SRL
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

import org.jpos.qrest.evt.QRestAccess;

import java.time.Instant;

/**
 * Per-request access metadata, shared by the Context and the channel's pending
 * set. Completion and deadline cancellation are serialized on this object.
 * It deliberately holds no request body or Context reference.
 */
final class RestAccessState {
    Instant ts;
    Long startNanos;
    String method;
    String path;
    Integer status;
    String remote;
    String queue;
    String route;
    String scheme;
    String protocolVersion;
    Long requestBytes;
    Long responseBytes;
    boolean recorded;
    boolean completed;
    java.util.concurrent.ScheduledFuture<?> deadline;

    QRestAccess toAccess() {
        Long elapsed = startNanos != null
          ? (System.nanoTime() - startNanos) / 1_000_000L
          : null;
        return new QRestAccess(
          ts, method, path, status, elapsed, remote, queue, requestBytes, responseBytes
        );
    }
}
