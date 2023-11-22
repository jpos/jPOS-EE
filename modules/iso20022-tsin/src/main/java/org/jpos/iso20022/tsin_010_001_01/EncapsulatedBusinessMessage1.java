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

package org.jpos.iso20022.tsin_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EncapsulatedBusinessMessage1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EncapsulatedBusinessMessage1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}BusinessApplicationHeader1" minOccurs="0"/>
 *         <element name="Prfx" type="{http://www.w3.org/2001/XMLSchema}ID" minOccurs="0"/>
 *         <element name="Prtl" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}YesNoIndicator"/>
 *         <element name="Msg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.010.001.01}StrictPayload"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncapsulatedBusinessMessage1", propOrder = {
    "hdr",
    "prfx",
    "prtl",
    "msg"
})
public class EncapsulatedBusinessMessage1 {

    @XmlElement(name = "Hdr")
    protected BusinessApplicationHeader1 hdr;
    @XmlElement(name = "Prfx")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String prfx;
    @XmlElement(name = "Prtl")
    protected boolean prtl;
    @XmlElement(name = "Msg", required = true)
    protected StrictPayload msg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public BusinessApplicationHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessApplicationHeader1 }
     *     
     */
    public void setHdr(BusinessApplicationHeader1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the prfx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrfx() {
        return prfx;
    }

    /**
     * Sets the value of the prfx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrfx(String value) {
        this.prfx = value;
    }

    /**
     * Gets the value of the prtl property.
     * 
     */
    public boolean isPrtl() {
        return prtl;
    }

    /**
     * Sets the value of the prtl property.
     * 
     */
    public void setPrtl(boolean value) {
        this.prtl = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link StrictPayload }
     *     
     */
    public StrictPayload getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrictPayload }
     *     
     */
    public void setMsg(StrictPayload value) {
        this.msg = value;
    }

}
