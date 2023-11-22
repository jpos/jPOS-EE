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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat54Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateFormat54Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DateAndDateTime2Choice"/>
 *         <element name="DtCdAndTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DateCodeAndTimeFormat4"/>
 *         <element name="DtCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}DateCode22Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat54Choice", propOrder = {
    "dt",
    "dtCdAndTm",
    "dtCd"
})
public class DateFormat54Choice {

    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;
    @XmlElement(name = "DtCdAndTm")
    protected DateCodeAndTimeFormat4 dtCdAndTm;
    @XmlElement(name = "DtCd")
    protected DateCode22Choice dtCd;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDt(DateAndDateTime2Choice value) {
        this.dt = value;
    }

    /**
     * Gets the value of the dtCdAndTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateCodeAndTimeFormat4 }
     *     
     */
    public DateCodeAndTimeFormat4 getDtCdAndTm() {
        return dtCdAndTm;
    }

    /**
     * Sets the value of the dtCdAndTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCodeAndTimeFormat4 }
     *     
     */
    public void setDtCdAndTm(DateCodeAndTimeFormat4 value) {
        this.dtCdAndTm = value;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateCode22Choice }
     *     
     */
    public DateCode22Choice getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateCode22Choice }
     *     
     */
    public void setDtCd(DateCode22Choice value) {
        this.dtCd = value;
    }

}
