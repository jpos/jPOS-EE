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

package org.jpos.iso20022.caam_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMDiagnosticRequestV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMDiagnosticRequestV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}Header31"/>
 *         <element name="PrtctdATMDgnstcReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}ContentInformationType10" minOccurs="0"/>
 *         <element name="ATMDgnstcReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}ATMDiagnosticRequest2" minOccurs="0"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caam.005.001.02}ContentInformationType15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMDiagnosticRequestV02", propOrder = {
    "hdr",
    "prtctdATMDgnstcReq",
    "atmDgnstcReq",
    "sctyTrlr"
})
public class ATMDiagnosticRequestV02 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMDgnstcReq")
    protected ContentInformationType10 prtctdATMDgnstcReq;
    @XmlElement(name = "ATMDgnstcReq")
    protected ATMDiagnosticRequest2 atmDgnstcReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType15 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header31 }
     *     
     */
    public Header31 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header31 }
     *     
     */
    public void setHdr(Header31 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the prtctdATMDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMDgnstcReq() {
        return prtctdATMDgnstcReq;
    }

    /**
     * Sets the value of the prtctdATMDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMDgnstcReq(ContentInformationType10 value) {
        this.prtctdATMDgnstcReq = value;
    }

    /**
     * Gets the value of the atmDgnstcReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDiagnosticRequest2 }
     *     
     */
    public ATMDiagnosticRequest2 getATMDgnstcReq() {
        return atmDgnstcReq;
    }

    /**
     * Sets the value of the atmDgnstcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDiagnosticRequest2 }
     *     
     */
    public void setATMDgnstcReq(ATMDiagnosticRequest2 value) {
        this.atmDgnstcReq = value;
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
