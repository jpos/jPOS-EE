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

package org.jpos.security.paymentcrypto;

import org.jpos.log.AuditLogEventProvider;
import org.jpos.log.AuditLogEventType;
import org.jpos.util.Kind;

import java.util.Collection;
import java.util.List;

/**
 * Registers the log kinds emitted by the AWS Payment Cryptography adapter
 * via {@link java.util.ServiceLoader}.
 */
public class PaymentCryptographyLogEventProvider implements AuditLogEventProvider {
    /** Kind of the adapter's AWS-specific operations (the generic ones use {@link Kind#S_M_OPERATION}). */
    public static final String APC_OPERATION = "apc-operation";

    @Override
    public Collection<AuditLogEventType> types() {
        return List.of();
    }

    @Override
    public Collection<Kind.Def> kinds() {
        return List.of(new Kind.Def(APC_OPERATION, Kind.Family.SECURITY));
    }
}
