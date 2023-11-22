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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StructuredLongPostalAddress1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StructuredLongPostalAddress1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BldgNm" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="StrtNm" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="StrtBldgId" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Flr" type="{urn:swift:xsd:semt.005.001.02}Max16Text" minOccurs="0"/>
 *         <element name="TwnNm" type="{urn:swift:xsd:semt.005.001.02}Max35Text"/>
 *         <element name="DstrctNm" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RgnId" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Stat" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="CtyId" type="{urn:swift:xsd:semt.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:swift:xsd:semt.005.001.02}CountryCode"/>
 *         <element name="PstCdId" type="{urn:swift:xsd:semt.005.001.02}Max16Text"/>
 *         <element name="POB" type="{urn:swift:xsd:semt.005.001.02}Max16Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredLongPostalAddress1", propOrder = {
    "bldgNm",
    "strtNm",
    "strtBldgId",
    "flr",
    "twnNm",
    "dstrctNm",
    "rgnId",
    "stat",
    "ctyId",
    "ctry",
    "pstCdId",
    "pob"
})
public class StructuredLongPostalAddress1 {

    @XmlElement(name = "BldgNm")
    protected String bldgNm;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "StrtBldgId")
    protected String strtBldgId;
    @XmlElement(name = "Flr")
    protected String flr;
    @XmlElement(name = "TwnNm", required = true)
    protected String twnNm;
    @XmlElement(name = "DstrctNm")
    protected String dstrctNm;
    @XmlElement(name = "RgnId")
    protected String rgnId;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "CtyId")
    protected String ctyId;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "PstCdId", required = true)
    protected String pstCdId;
    @XmlElement(name = "POB")
    protected String pob;

    /**
     * Gets the value of the bldgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNm() {
        return bldgNm;
    }

    /**
     * Sets the value of the bldgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNm(String value) {
        this.bldgNm = value;
    }

    /**
     * Gets the value of the strtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtNm() {
        return strtNm;
    }

    /**
     * Sets the value of the strtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtNm(String value) {
        this.strtNm = value;
    }

    /**
     * Gets the value of the strtBldgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrtBldgId() {
        return strtBldgId;
    }

    /**
     * Sets the value of the strtBldgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrtBldgId(String value) {
        this.strtBldgId = value;
    }

    /**
     * Gets the value of the flr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlr() {
        return flr;
    }

    /**
     * Sets the value of the flr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlr(String value) {
        this.flr = value;
    }

    /**
     * Gets the value of the twnNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwnNm() {
        return twnNm;
    }

    /**
     * Sets the value of the twnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwnNm(String value) {
        this.twnNm = value;
    }

    /**
     * Gets the value of the dstrctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstrctNm() {
        return dstrctNm;
    }

    /**
     * Sets the value of the dstrctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstrctNm(String value) {
        this.dstrctNm = value;
    }

    /**
     * Gets the value of the rgnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnId() {
        return rgnId;
    }

    /**
     * Sets the value of the rgnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgnId(String value) {
        this.rgnId = value;
    }

    /**
     * Gets the value of the stat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStat() {
        return stat;
    }

    /**
     * Sets the value of the stat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStat(String value) {
        this.stat = value;
    }

    /**
     * Gets the value of the ctyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtyId() {
        return ctyId;
    }

    /**
     * Sets the value of the ctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtyId(String value) {
        this.ctyId = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the pstCdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCdId() {
        return pstCdId;
    }

    /**
     * Sets the value of the pstCdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCdId(String value) {
        this.pstCdId = value;
    }

    /**
     * Gets the value of the pob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOB() {
        return pob;
    }

    /**
     * Sets the value of the pob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOB(String value) {
        this.pob = value;
    }

}
