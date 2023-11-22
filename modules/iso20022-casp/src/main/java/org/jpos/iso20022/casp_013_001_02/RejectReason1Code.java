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

package org.jpos.iso20022.casp_013_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectReason1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="RejectReason1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="UNPR"/>
 *     <enumeration value="IMSG"/>
 *     <enumeration value="PARS"/>
 *     <enumeration value="SECU"/>
 *     <enumeration value="INTP"/>
 *     <enumeration value="RCPP"/>
 *     <enumeration value="DPMG"/>
 *     <enumeration value="VERS"/>
 *     <enumeration value="MSGT"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "RejectReason1Code")
@XmlEnum
public enum RejectReason1Code {

    UNPR,
    IMSG,
    PARS,
    SECU,
    INTP,
    RCPP,
    DPMG,
    VERS,
    MSGT;

    public String value() {
        return name();
    }

    public static RejectReason1Code fromValue(String v) {
        return valueOf(v);
    }

}
