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

package org.jpos.iso20022.catp_017_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransferResponseV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransferResponseV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}Header31"/>
 *         <element name="PrtctdATMTrfRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType10" minOccurs="0"/>
 *         <element name="ATMTrfRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMTransferResponse1" minOccurs="0"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ContentInformationType15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransferResponseV01", propOrder = {
    "hdr",
    "prtctdATMTrfRspn",
    "atmTrfRspn",
    "sctyTrlr"
})
public class ATMTransferResponseV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMTrfRspn")
    protected ContentInformationType10 prtctdATMTrfRspn;
    @XmlElement(name = "ATMTrfRspn")
    protected ATMTransferResponse1 atmTrfRspn;
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
     * Gets the value of the prtctdATMTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMTrfRspn() {
        return prtctdATMTrfRspn;
    }

    /**
     * Sets the value of the prtctdATMTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMTrfRspn(ContentInformationType10 value) {
        this.prtctdATMTrfRspn = value;
    }

    /**
     * Gets the value of the atmTrfRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public ATMTransferResponse1 getATMTrfRspn() {
        return atmTrfRspn;
    }

    /**
     * Sets the value of the atmTrfRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransferResponse1 }
     *     
     */
    public void setATMTrfRspn(ATMTransferResponse1 value) {
        this.atmTrfRspn = value;
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
