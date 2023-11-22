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

package org.jpos.iso20022.caaa_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcceptorNonFinancialRequestV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AcceptorNonFinancialRequestV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Header59"/>
 *         <element name="NonFinReq" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}NonFinancialRequestComponent2"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}ContentInformationType31" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptorNonFinancialRequestV02", propOrder = {
    "hdr",
    "nonFinReq",
    "sctyTrlr"
})
public class AcceptorNonFinancialRequestV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header59 hdr;
    @XmlElement(name = "NonFinReq", required = true)
    protected NonFinancialRequestComponent2 nonFinReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType31 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header59 }
     *     
     */
    public Header59 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header59 }
     *     
     */
    public void setHdr(Header59 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the nonFinReq property.
     * 
     * @return
     *     possible object is
     *     {@link NonFinancialRequestComponent2 }
     *     
     */
    public NonFinancialRequestComponent2 getNonFinReq() {
        return nonFinReq;
    }

    /**
     * Sets the value of the nonFinReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonFinancialRequestComponent2 }
     *     
     */
    public void setNonFinReq(NonFinancialRequestComponent2 value) {
        this.nonFinReq = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType31 }
     *     
     */
    public ContentInformationType31 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType31 }
     *     
     */
    public void setSctyTrlr(ContentInformationType31 value) {
        this.sctyTrlr = value;
    }

}
