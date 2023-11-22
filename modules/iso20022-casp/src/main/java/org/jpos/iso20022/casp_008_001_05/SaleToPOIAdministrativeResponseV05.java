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

package org.jpos.iso20022.casp_008_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleToPOIAdministrativeResponseV05 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleToPOIAdministrativeResponseV05">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.008.001.05}Header41"/>
 *         <element name="AdmstvRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.008.001.05}AdministrativeResponse6"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:casp.008.001.05}ContentInformationType33" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleToPOIAdministrativeResponseV05", propOrder = {
    "hdr",
    "admstvRspn",
    "sctyTrlr"
})
public class SaleToPOIAdministrativeResponseV05 {

    @XmlElement(name = "Hdr", required = true)
    protected Header41 hdr;
    @XmlElement(name = "AdmstvRspn", required = true)
    protected AdministrativeResponse6 admstvRspn;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType33 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header41 }
     *     
     */
    public Header41 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header41 }
     *     
     */
    public void setHdr(Header41 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the admstvRspn property.
     * 
     * @return
     *     possible object is
     *     {@link AdministrativeResponse6 }
     *     
     */
    public AdministrativeResponse6 getAdmstvRspn() {
        return admstvRspn;
    }

    /**
     * Sets the value of the admstvRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdministrativeResponse6 }
     *     
     */
    public void setAdmstvRspn(AdministrativeResponse6 value) {
        this.admstvRspn = value;
    }

    /**
     * Gets the value of the sctyTrlr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType33 }
     *     
     */
    public ContentInformationType33 getSctyTrlr() {
        return sctyTrlr;
    }

    /**
     * Sets the value of the sctyTrlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType33 }
     *     
     */
    public void setSctyTrlr(ContentInformationType33 value) {
        this.sctyTrlr = value;
    }

}
