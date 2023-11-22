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

package org.jpos.iso20022.reda_061_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CutOff1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CutOff1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CutOffUpdId" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}Max35Text"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}ActiveCurrencyCode"/>
 *         <element name="CutOffTm" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}ISOTime"/>
 *         <element name="ValDtOffset" type="{urn:iso:std:iso:20022:tech:xsd:reda.061.001.02}DateOffsetText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutOff1", propOrder = {
    "cutOffUpdId",
    "ccy",
    "cutOffTm",
    "valDtOffset"
})
public class CutOff1 {

    @XmlElement(name = "CutOffUpdId", required = true)
    protected String cutOffUpdId;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "CutOffTm", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar cutOffTm;
    @XmlElement(name = "ValDtOffset", required = true)
    protected String valDtOffset;

    /**
     * Gets the value of the cutOffUpdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCutOffUpdId() {
        return cutOffUpdId;
    }

    /**
     * Sets the value of the cutOffUpdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCutOffUpdId(String value) {
        this.cutOffUpdId = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the cutOffTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCutOffTm() {
        return cutOffTm;
    }

    /**
     * Sets the value of the cutOffTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCutOffTm(XMLGregorianCalendar value) {
        this.cutOffTm = value;
    }

    /**
     * Gets the value of the valDtOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValDtOffset() {
        return valDtOffset;
    }

    /**
     * Sets the value of the valDtOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValDtOffset(String value) {
        this.valDtOffset = value;
    }

}
