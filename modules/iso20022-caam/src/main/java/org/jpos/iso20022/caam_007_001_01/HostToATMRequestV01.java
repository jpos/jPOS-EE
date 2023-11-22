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

package org.jpos.iso20022.caam_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The HostToATMRequest message is sent by a host to an ATM to request the ATM to contact a host by sending of a maintenance messages.
 * 
 * <p>Java class for HostToATMRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HostToATMRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}Header20"/>
 *         <element name="PrtctdHstToATMReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="HstToATMReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}HostToATMRequest1" minOccurs="0"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}ContentInformationType15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostToATMRequestV01", propOrder = {
    "hdr",
    "prtctdHstToATMReq",
    "hstToATMReq",
    "sctyTrlr"
})
public class HostToATMRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header20 hdr;
    @XmlElement(name = "PrtctdHstToATMReq")
    protected ContentInformationType10 prtctdHstToATMReq;
    @XmlElement(name = "HstToATMReq")
    protected HostToATMRequest1 hstToATMReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header20 }
     *     
     */
    public Header20 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header20 }
     *     
     */
    public void setHdr(Header20 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the prtctdHstToATMReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdHstToATMReq() {
        return prtctdHstToATMReq;
    }

    /**
     * Sets the value of the prtctdHstToATMReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdHstToATMReq(ContentInformationType10 value) {
        this.prtctdHstToATMReq = value;
    }

    /**
     * Gets the value of the hstToATMReq property.
     * 
     * @return
     *     possible object is
     *     {@link HostToATMRequest1 }
     *     
     */
    public HostToATMRequest1 getHstToATMReq() {
        return hstToATMReq;
    }

    /**
     * Sets the value of the hstToATMReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostToATMRequest1 }
     *     
     */
    public void setHstToATMReq(HostToATMRequest1 value) {
        this.hstToATMReq = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType15 }
     *     
     */
    public ContentInformationType15 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType15 }
     *     
     */
    public void setSctyTrlr(ContentInformationType15 value) {
        this.sctyTrlr = value;
    }

}
