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

package org.jpos.iso20022.cain_025_001_02;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingService1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>{@code
 * <simpleType name="LodgingService1Code">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ACCO"/>
 *     <enumeration value="AUDI"/>
 *     <enumeration value="BANQ"/>
 *     <enumeration value="BREK"/>
 *     <enumeration value="BUSS"/>
 *     <enumeration value="CONC"/>
 *     <enumeration value="EARA"/>
 *     <enumeration value="EARD"/>
 *     <enumeration value="ENTR"/>
 *     <enumeration value="FCAA"/>
 *     <enumeration value="GAME"/>
 *     <enumeration value="GARA"/>
 *     <enumeration value="GIFT"/>
 *     <enumeration value="HEAL"/>
 *     <enumeration value="INTE"/>
 *     <enumeration value="LAUN"/>
 *     <enumeration value="LONG"/>
 *     <enumeration value="MINI"/>
 *     <enumeration value="NOSH"/>
 *     <enumeration value="OTHR"/>
 *     <enumeration value="PARK"/>
 *     <enumeration value="PHON"/>
 *     <enumeration value="REST"/>
 *     <enumeration value="RMSE"/>
 *     <enumeration value="SPAS"/>
 *     <enumeration value="THRD"/>
 *     <enumeration value="TRAN"/>
 *     <enumeration value="VODS"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "LodgingService1Code")
@XmlEnum
public enum LodgingService1Code {

    ACCO,
    AUDI,
    BANQ,
    BREK,
    BUSS,
    CONC,
    EARA,
    EARD,
    ENTR,
    FCAA,
    GAME,
    GARA,
    GIFT,
    HEAL,
    INTE,
    LAUN,
    LONG,
    MINI,
    NOSH,
    OTHR,
    PARK,
    PHON,
    REST,
    RMSE,
    SPAS,
    THRD,
    TRAN,
    VODS;

    public String value() {
        return name();
    }

    public static LodgingService1Code fromValue(String v) {
        return valueOf(v);
    }

}
