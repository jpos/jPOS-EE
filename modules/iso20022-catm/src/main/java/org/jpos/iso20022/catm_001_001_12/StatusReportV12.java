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

package org.jpos.iso20022.catm_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusReportV12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusReportV12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}TMSHeader1"/>
 *         <element name="StsRpt" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}StatusReport12"/>
 *         <element name="SctyTrlr" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ContentInformationType33" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusReportV12", propOrder = {
    "hdr",
    "stsRpt",
    "sctyTrlr"
})
public class StatusReportV12 {

    @XmlElement(name = "Hdr", required = true)
    protected TMSHeader1 hdr;
    @XmlElement(name = "StsRpt", required = true)
    protected StatusReport12 stsRpt;
    @XmlElement(name = "SctyTrlr")
    protected ContentInformationType33 sctyTrlr;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link TMSHeader1 }
     *     
     */
    public TMSHeader1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSHeader1 }
     *     
     */
    public void setHdr(TMSHeader1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the stsRpt property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReport12 }
     *     
     */
    public StatusReport12 getStsRpt() {
        return stsRpt;
    }

    /**
     * Sets the value of the stsRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReport12 }
     *     
     */
    public void setStsRpt(StatusReport12 value) {
        this.stsRpt = value;
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
