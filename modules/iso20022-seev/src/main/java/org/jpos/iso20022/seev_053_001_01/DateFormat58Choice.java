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

package org.jpos.iso20022.seev_053_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateFormat58Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DateFormat58Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DtOrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}DateAndDateTime2Choice"/>
 *         <element name="DtCd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}DateType1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateFormat58Choice", propOrder = {
    "dtOrDtTm",
    "dtCd"
})
public class DateFormat58Choice {

    @XmlElement(name = "DtOrDtTm")
    protected DateAndDateTime2Choice dtOrDtTm;
    @XmlElement(name = "DtCd")
    @XmlSchemaType(name = "string")
    protected DateType1Code dtCd;

    /**
     * Gets the value of the dtOrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDtOrDtTm() {
        return dtOrDtTm;
    }

    /**
     * Sets the value of the dtOrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDtOrDtTm(DateAndDateTime2Choice value) {
        this.dtOrDtTm = value;
    }

    /**
     * Gets the value of the dtCd property.
     * 
     * @return
     *     possible object is
     *     {@link DateType1Code }
     *     
     */
    public DateType1Code getDtCd() {
        return dtCd;
    }

    /**
     * Sets the value of the dtCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType1Code }
     *     
     */
    public void setDtCd(DateType1Code value) {
        this.dtCd = value;
    }

}
