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

package org.jpos.iso20022.casp_009_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalFilter1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalFilter1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIId" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CshrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}Max35Text" minOccurs="0"/>
 *         <element name="ShftNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}Max35Text" minOccurs="0"/>
 *         <element name="TtlsGrpId" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalFilter1", propOrder = {
    "poiId",
    "saleId",
    "cshrId",
    "shftNb",
    "ttlsGrpId"
})
public class TotalFilter1 {

    @XmlElement(name = "POIId")
    protected String poiId;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "TtlsGrpId")
    protected String ttlsGrpId;

    /**
     * Gets the value of the poiId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIId() {
        return poiId;
    }

    /**
     * Sets the value of the poiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIId(String value) {
        this.poiId = value;
    }

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrId(String value) {
        this.cshrId = value;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShftNb(String value) {
        this.shftNb = value;
    }

    /**
     * Gets the value of the ttlsGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlsGrpId() {
        return ttlsGrpId;
    }

    /**
     * Sets the value of the ttlsGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlsGrpId(String value) {
        this.ttlsGrpId = value;
    }

}
