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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDate85 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDate85">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RcrdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat30Choice" minOccurs="0"/>
 *         <element name="ExDvddDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat30Choice" minOccurs="0"/>
 *         <element name="LtryDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}DateFormat30Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDate85", propOrder = {
    "rcrdDt",
    "exDvddDt",
    "ltryDt"
})
public class CorporateActionDate85 {

    @XmlElement(name = "RcrdDt")
    protected DateFormat30Choice rcrdDt;
    @XmlElement(name = "ExDvddDt")
    protected DateFormat30Choice exDvddDt;
    @XmlElement(name = "LtryDt")
    protected DateFormat30Choice ltryDt;

    /**
     * Gets the value of the rcrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getRcrdDt() {
        return rcrdDt;
    }

    /**
     * Sets the value of the rcrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setRcrdDt(DateFormat30Choice value) {
        this.rcrdDt = value;
    }

    /**
     * Gets the value of the exDvddDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getExDvddDt() {
        return exDvddDt;
    }

    /**
     * Sets the value of the exDvddDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setExDvddDt(DateFormat30Choice value) {
        this.exDvddDt = value;
    }

    /**
     * Gets the value of the ltryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat30Choice }
     *     
     */
    public DateFormat30Choice getLtryDt() {
        return ltryDt;
    }

    /**
     * Sets the value of the ltryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat30Choice }
     *     
     */
    public void setLtryDt(DateFormat30Choice value) {
        this.ltryDt = value;
    }

}
