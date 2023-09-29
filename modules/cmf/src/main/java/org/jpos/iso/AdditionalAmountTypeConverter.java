/*
 * jPOS Project [http://jpos.org]
 * Copyright (C) 2000-2023 jPOS Software SRL
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

public interface AdditionalAmountTypeConverter {
    /**
     * Convert from an Additional Amount Type 2-digit code in an 8583 spec into the equivalent jPOS-CMF spec.
     * @return may return null if this code is not mapped by CMF.
     */
    String toCMF(String code);

    /**
     * Convert from an Additional Amount Type  2-digit code in an jPOS-CMF into the equivalent of another 8583 spec.
     * @return may return null if the CMF code is not mapped by the external 8583 spec.
     */
    String fromCMF(String cmfCode);
}
