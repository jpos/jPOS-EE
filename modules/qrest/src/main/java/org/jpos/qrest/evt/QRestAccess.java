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

package org.jpos.qrest.evt;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.jpos.log.AuditLogEvent;

import java.time.Instant;

/**
 * Structured access-log entry emitted once per QRest HTTP request.
 *
 * <p>Carries only metadata that is cheap to compute and safe to log:
 * never request/response bodies, headers, query strings, or credentials.
 * Bodies are sized via {@code requestBytes}/{@code responseBytes} only.</p>
 */
@JacksonXmlRootElement(localName = "qrest-access")
@JsonInclude(JsonInclude.Include.NON_NULL)
public record QRestAccess(
    Instant ts,
    String method,
    String path,
    Integer status,
    Long elapsed,
    String remote,
    String queue,
    Long requestBytes,
    Long responseBytes
) implements AuditLogEvent { }
