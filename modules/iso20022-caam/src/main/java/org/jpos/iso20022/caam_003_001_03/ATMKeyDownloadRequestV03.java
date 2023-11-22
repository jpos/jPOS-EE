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

package org.jpos.iso20022.caam_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMKeyDownloadRequestV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMKeyDownloadRequestV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Header31"/>
 *         <element name="PrtctdATMKeyDwnldReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ContentInformationType10" minOccurs="0"/>
 *         <element name="ATMKeyDwnldReq" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMKeyDownloadRequest4" minOccurs="0"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ContentInformationType13" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMKeyDownloadRequestV03", propOrder = {
    "hdr",
    "prtctdATMKeyDwnldReq",
    "atmKeyDwnldReq",
    "sctyTrlr"
})
public class ATMKeyDownloadRequestV03 {

    @XmlElement(name = "Hdr", required = true)
    protected Header31 hdr;
    @XmlElement(name = "PrtctdATMKeyDwnldReq")
    protected ContentInformationType10 prtctdATMKeyDwnldReq;
    @XmlElement(name = "ATMKeyDwnldReq")
    protected ATMKeyDownloadRequest4 atmKeyDwnldReq;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType13 sctyTrlr;

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
     * Gets the value of the prtctdATMKeyDwnldReq property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getPrtctdATMKeyDwnldReq() {
        return prtctdATMKeyDwnldReq;
    }

    /**
     * Sets the value of the prtctdATMKeyDwnldReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setPrtctdATMKeyDwnldReq(ContentInformationType10 value) {
        this.prtctdATMKeyDwnldReq = value;
    }

    /**
     * Gets the value of the atmKeyDwnldReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMKeyDownloadRequest4 }
     *     
     */
    public ATMKeyDownloadRequest4 getATMKeyDwnldReq() {
        return atmKeyDwnldReq;
    }

    /**
     * Sets the value of the atmKeyDwnldReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMKeyDownloadRequest4 }
     *     
     */
    public void setATMKeyDwnldReq(ATMKeyDownloadRequest4 value) {
        this.atmKeyDwnldReq = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType13 }
     *     
     */
    public ContentInformationType13 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType13 }
     *     
     */
    public void setSctyTrlr(ContentInformationType13 value) {
        this.sctyTrlr = value;
    }

}
