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

package org.jpos.iso20022.caam_007_001_01;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Algorithm7Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="Algorithm7Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ERSA"/>
 *     <enumeration value="RSAO"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "Algorithm7Code")
@XmlEnum
public enum Algorithm7Code {


    /**
     * RSA encryption algorithm - (ASN.1 Object Identifier: rsaEncryption).
     * 
     */
    ERSA,

    /**
     * RSA encryption scheme based on Optimal Asymmetric Encryption scheme (PKCS #1 version 2.1) - (ASN.1 Object Identifier: id-RSAES-OAEP).
     * 
     */
    RSAO;

    public String value() {
        return name();
    }

    public static Algorithm7Code fromValue(String v) {
        return valueOf(v);
    }

}
