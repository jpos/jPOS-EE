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

package org.jpos.iso20022.acmt_003_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddress21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostalAddress21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AddressType2Choice" minOccurs="0"/>
 *         <element name="MlngInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="RegnAdrInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="CareOf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" minOccurs="0"/>
 *         <element name="AdrLine" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" maxOccurs="5" minOccurs="0"/>
 *         <element name="StrtNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" minOccurs="0"/>
 *         <element name="BldgNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max16Text" minOccurs="0"/>
 *         <element name="BldgNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="PstBx" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max10Text" minOccurs="0"/>
 *         <element name="SdInBldg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Flr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" minOccurs="0"/>
 *         <element name="SuiteId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max10Text" minOccurs="0"/>
 *         <element name="PstCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max16Text" minOccurs="0"/>
 *         <element name="DstrctNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Vllg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" minOccurs="0"/>
 *         <element name="TwnNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Stat" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max70Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}CountryCode"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress21", propOrder = {
    "adrTp",
    "mlngInd",
    "regnAdrInd",
    "careOf",
    "adrLine",
    "strtNm",
    "bldgNb",
    "bldgNm",
    "pstBx",
    "sdInBldg",
    "flr",
    "suiteId",
    "pstCd",
    "dstrctNm",
    "vllg",
    "twnNm",
    "stat",
    "ctry"
})
public class PostalAddress21 {

    @XmlElement(name = "AdrTp")
    protected AddressType2Choice adrTp;
    @XmlElement(name = "MlngInd")
    protected Boolean mlngInd;
    @XmlElement(name = "RegnAdrInd")
    protected Boolean regnAdrInd;
    @XmlElement(name = "CareOf")
    protected String careOf;
    @XmlElement(name = "AdrLine")
    protected List<String> adrLine;
    @XmlElement(name = "StrtNm")
    protected String strtNm;
    @XmlElement(name = "BldgNb")
    protected String bldgNb;
    @XmlElement(name = "BldgNm")
    protected String bldgNm;
    @XmlElement(name = "PstBx")
    protected String pstBx;
    @XmlElement(name = "SdInBldg")
    protected String sdInBldg;
    @XmlElement(name = "Flr")
    protected String flr;
    @XmlElement(name = "SuiteId")
    protected String suiteId;
    @XmlElement(name = "PstCd")
    protected String pstCd;
    @XmlElement(name = "DstrctNm")
    protected String dstrctNm;
    @XmlElement(name = "Vllg")
    protected String vllg;
    @XmlElement(name = "TwnNm")
    protected String twnNm;
    @XmlElement(name = "Stat")
    protected String stat;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType2Choice }
     *     
     */
    public AddressType2Choice getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType2Choice }
     *     
     */
    public void setAdrTp(AddressType2Choice value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the mlngInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMlngInd() {
        return mlngInd;
    }

    /**
     * Sets the value of the mlngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMlngInd(Boolean value) {
        this.mlngInd = value;
    }

    /**
     * Gets the value of the regnAdrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegnAdrInd() {
        return regnAdrInd;
    }

    /**
     * Sets the value of the regnAdrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegnAdrInd(Boolean value) {
        this.regnAdrInd = value;
    }

    /**
     * Gets the value of the careOf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareOf() {
        return careOf;
    }

    /**
     * Sets the value of the careOf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareOf(String value) {
        this.careOf = value;
    }

    /**
     * Gets the value of the adrLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adrLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdrLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the adrLine property.
     */
    public List<String> getAdrLine() {
        if (adrLine == null) {
            adrLine = new ArrayList<>();
        }
        return this.adrLine;
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
     * Gets the value of the bldgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBldgNb() {
        return bldgNb;
    }

    /**
     * Sets the value of the bldgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBldgNb(String value) {
        this.bldgNb = value;
    }

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
     * Gets the value of the pstBx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstBx() {
        return pstBx;
    }

    /**
     * Sets the value of the pstBx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstBx(String value) {
        this.pstBx = value;
    }

    /**
     * Gets the value of the sdInBldg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdInBldg() {
        return sdInBldg;
    }

    /**
     * Sets the value of the sdInBldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdInBldg(String value) {
        this.sdInBldg = value;
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
     * Gets the value of the suiteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuiteId() {
        return suiteId;
    }

    /**
     * Sets the value of the suiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuiteId(String value) {
        this.suiteId = value;
    }

    /**
     * Gets the value of the pstCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPstCd() {
        return pstCd;
    }

    /**
     * Sets the value of the pstCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPstCd(String value) {
        this.pstCd = value;
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
     * Gets the value of the vllg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVllg() {
        return vllg;
    }

    /**
     * Sets the value of the vllg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVllg(String value) {
        this.vllg = value;
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

}
