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

package org.jpos.iso20022.casp_002_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vehicle1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VhclNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35NumericText" minOccurs="0"/>
 *         <element name="TrlrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35NumericText" minOccurs="0"/>
 *         <element name="VhclTag" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *         <element name="VhclTagNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}CardDataReading5Code" minOccurs="0"/>
 *         <element name="UnitNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35NumericText" minOccurs="0"/>
 *         <element name="RplcmntCar" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Odmtr" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}DecimalNumber" minOccurs="0"/>
 *         <element name="Hbmtr" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}DecimalNumber" minOccurs="0"/>
 *         <element name="TrlrHrs" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RefrHrs" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *         <element name="MntncId" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DrvrOrVhclCard" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}PlainCardData17" minOccurs="0"/>
 *         <element name="AddtlVhclData" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}Vehicle2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle1", propOrder = {
    "vhclNb",
    "trlrNb",
    "vhclTag",
    "vhclTagNtryMd",
    "unitNb",
    "rplcmntCar",
    "odmtr",
    "hbmtr",
    "trlrHrs",
    "refrHrs",
    "mntncId",
    "drvrOrVhclCard",
    "addtlVhclData"
})
public class Vehicle1 {

    @XmlElement(name = "VhclNb")
    protected String vhclNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "VhclTag")
    protected String vhclTag;
    @XmlElement(name = "VhclTagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code vhclTagNtryMd;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "RplcmntCar")
    protected Boolean rplcmntCar;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "TrlrHrs")
    protected String trlrHrs;
    @XmlElement(name = "RefrHrs")
    protected String refrHrs;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "DrvrOrVhclCard")
    protected PlainCardData17 drvrOrVhclCard;
    @XmlElement(name = "AddtlVhclData")
    protected List<Vehicle2> addtlVhclData;

    /**
     * Gets the value of the vhclNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclNb() {
        return vhclNb;
    }

    /**
     * Sets the value of the vhclNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclNb(String value) {
        this.vhclNb = value;
    }

    /**
     * Gets the value of the trlrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrNb() {
        return trlrNb;
    }

    /**
     * Sets the value of the trlrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrlrNb(String value) {
        this.trlrNb = value;
    }

    /**
     * Gets the value of the vhclTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclTag() {
        return vhclTag;
    }

    /**
     * Sets the value of the vhclTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclTag(String value) {
        this.vhclTag = value;
    }

    /**
     * Gets the value of the vhclTagNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading5Code }
     *     
     */
    public CardDataReading5Code getVhclTagNtryMd() {
        return vhclTagNtryMd;
    }

    /**
     * Sets the value of the vhclTagNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading5Code }
     *     
     */
    public void setVhclTagNtryMd(CardDataReading5Code value) {
        this.vhclTagNtryMd = value;
    }

    /**
     * Gets the value of the unitNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNb() {
        return unitNb;
    }

    /**
     * Sets the value of the unitNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNb(String value) {
        this.unitNb = value;
    }

    /**
     * Gets the value of the rplcmntCar property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmntCar() {
        return rplcmntCar;
    }

    /**
     * Sets the value of the rplcmntCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRplcmntCar(Boolean value) {
        this.rplcmntCar = value;
    }

    /**
     * Gets the value of the odmtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOdmtr() {
        return odmtr;
    }

    /**
     * Sets the value of the odmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOdmtr(BigDecimal value) {
        this.odmtr = value;
    }

    /**
     * Gets the value of the hbmtr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHbmtr() {
        return hbmtr;
    }

    /**
     * Sets the value of the hbmtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHbmtr(BigDecimal value) {
        this.hbmtr = value;
    }

    /**
     * Gets the value of the trlrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrlrHrs() {
        return trlrHrs;
    }

    /**
     * Sets the value of the trlrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrlrHrs(String value) {
        this.trlrHrs = value;
    }

    /**
     * Gets the value of the refrHrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefrHrs() {
        return refrHrs;
    }

    /**
     * Sets the value of the refrHrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefrHrs(String value) {
        this.refrHrs = value;
    }

    /**
     * Gets the value of the mntncId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMntncId() {
        return mntncId;
    }

    /**
     * Sets the value of the mntncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMntncId(String value) {
        this.mntncId = value;
    }

    /**
     * Gets the value of the drvrOrVhclCard property.
     * 
     * @return
     *     possible object is
     *     {@link PlainCardData17 }
     *     
     */
    public PlainCardData17 getDrvrOrVhclCard() {
        return drvrOrVhclCard;
    }

    /**
     * Sets the value of the drvrOrVhclCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlainCardData17 }
     *     
     */
    public void setDrvrOrVhclCard(PlainCardData17 value) {
        this.drvrOrVhclCard = value;
    }

    /**
     * Gets the value of the addtlVhclData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlVhclData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlVhclData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vehicle2 }
     * 
     * 
     * @return
     *     The value of the addtlVhclData property.
     */
    public List<Vehicle2> getAddtlVhclData() {
        if (addtlVhclData == null) {
            addtlVhclData = new ArrayList<>();
        }
        return this.addtlVhclData;
    }

}
