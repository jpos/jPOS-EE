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

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import org.jpos.log.AuditLogEvent;

import java.util.List;
import java.util.Map;

/**
 * Structured, already-masked snapshot of an HTTP parameter map
 * ({@code FORMPARAMS}/{@code QUERYPARAMS}) for typed log writers.
 *
 * <p>Produced by {@link org.jpos.qrest.HttpParams#toAuditEvent()}; values of
 * sensitive parameters arrive here replaced by
 * {@link org.jpos.qrest.HttpParams#MASK}, so this event never carries
 * credentials regardless of the log writer in use.</p>
 *
 * @param params parameter name to values, sensitive values masked
 *
 * @since 3.0.2
 */
@JacksonXmlRootElement(localName = "http-params")
public record HttpParamsEvt(
    Map<String, List<String>> params
) implements AuditLogEvent { }
