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
import java.util.StringJoiner;

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
) implements AuditLogEvent {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
          .append(display(method))
          .append(' ')
          .append(display(path));
        if (status != null)
            sb.append(' ').append(status);
        if (elapsed != null)
            sb.append(' ').append(elapsed).append("ms");

        StringJoiner details = new StringJoiner(" ");
        add(details, "remote", normalizedRemote(remote));
        add(details, "queue", queue);
        add(details, "in", bytes(requestBytes));
        add(details, "out", bytes(responseBytes));
        String detailString = details.toString();
        if (!detailString.isEmpty())
            sb.append(" [").append(detailString).append(']');
        return sb.toString();
    }

    private static void add(StringJoiner joiner, String name, String value) {
        if (value != null && !value.isBlank())
            joiner.add(name + '=' + value);
    }

    private static String display(String value) {
        return value != null && !value.isBlank() ? value : "-";
    }

    private static String bytes(Long value) {
        return value != null ? value + "B" : null;
    }

    private static String normalizedRemote(String value) {
        if (value == null)
            return null;
        return switch (value) {
            case "0:0:0:0:0:0:0:0" -> "::";
            case "0:0:0:0:0:0:0:1" -> "::1";
            default -> value;
        };
    }
}
