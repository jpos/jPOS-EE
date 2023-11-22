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

package org.jpos.iso20022.reda_012_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentName2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentName2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISOShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ISOLngNm" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}Max350Text" minOccurs="0"/>
 *         <element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:reda.012.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentName2", propOrder = {
    "isoShrtNm",
    "isoLngNm",
    "vldFr"
})
public class FinancialInstrumentName2 {

    @XmlElement(name = "ISOShrtNm")
    protected String isoShrtNm;
    @XmlElement(name = "ISOLngNm")
    protected String isoLngNm;
    @XmlElement(name = "VldFr")
    protected DateAndDateTime2Choice vldFr;

    /**
     * Gets the value of the isoShrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOShrtNm() {
        return isoShrtNm;
    }

    /**
     * Sets the value of the isoShrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOShrtNm(String value) {
        this.isoShrtNm = value;
    }

    /**
     * Gets the value of the isoLngNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOLngNm() {
        return isoLngNm;
    }

    /**
     * Sets the value of the isoLngNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOLngNm(String value) {
        this.isoLngNm = value;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setVldFr(DateAndDateTime2Choice value) {
        this.vldFr = value;
    }

}
