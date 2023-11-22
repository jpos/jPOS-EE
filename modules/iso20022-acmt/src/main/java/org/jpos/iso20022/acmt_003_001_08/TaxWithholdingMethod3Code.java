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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxWithholdingMethod3Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="TaxWithholdingMethod3Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="MITX"/>
 *     <enumeration value="INVE"/>
 *     <enumeration value="ACCT"/>
 *     <enumeration value="EXMT"/>
 *     <enumeration value="REPT"/>
 *     <enumeration value="CRTF"/>
 *     <enumeration value="WHCO"/>
 *     <enumeration value="WTHD"/>
 *     <enumeration value="WTRE"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TaxWithholdingMethod3Code")
@XmlEnum
public enum TaxWithholdingMethod3Code {

    MITX,
    INVE,
    ACCT,
    EXMT,
    REPT,
    CRTF,
    WHCO,
    WTHD,
    WTRE;

    public String value() {
        return name();
    }

    public static TaxWithholdingMethod3Code fromValue(String v) {
        return valueOf(v);
    }

}
