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

package org.jpos.iso20022.caad_009_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vehicle5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vehicle5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VhclNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="VhclIdNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="FleetNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max10Text" minOccurs="0"/>
 *         <element name="SubFleetNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="UnitNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="TrlrNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35NumericText" minOccurs="0"/>
 *         <element name="VhclTag" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="VhclTagNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}CardDataReading5Code" minOccurs="0"/>
 *         <element name="RplcmntVhclInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Odmtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="Hbmtr" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="MntncId" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="OnBrdDgnstcs" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}OnBoardDiagnostics1" minOccurs="0"/>
 *         <element name="AddtlVhclData" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Vehicle2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vehicle5", propOrder = {
    "vhclNb",
    "vhclIdNb",
    "fleetNb",
    "subFleetNb",
    "unitNb",
    "trlrNb",
    "vhclTag",
    "vhclTagNtryMd",
    "rplcmntVhclInd",
    "odmtr",
    "hbmtr",
    "mntncId",
    "onBrdDgnstcs",
    "addtlVhclData"
})
public class Vehicle5 {

    @XmlElement(name = "VhclNb")
    protected String vhclNb;
    @XmlElement(name = "VhclIdNb")
    protected String vhclIdNb;
    @XmlElement(name = "FleetNb")
    protected String fleetNb;
    @XmlElement(name = "SubFleetNb")
    protected String subFleetNb;
    @XmlElement(name = "UnitNb")
    protected String unitNb;
    @XmlElement(name = "TrlrNb")
    protected String trlrNb;
    @XmlElement(name = "VhclTag")
    protected String vhclTag;
    @XmlElement(name = "VhclTagNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading5Code vhclTagNtryMd;
    @XmlElement(name = "RplcmntVhclInd")
    protected Boolean rplcmntVhclInd;
    @XmlElement(name = "Odmtr")
    protected BigDecimal odmtr;
    @XmlElement(name = "Hbmtr")
    protected BigDecimal hbmtr;
    @XmlElement(name = "MntncId")
    protected String mntncId;
    @XmlElement(name = "OnBrdDgnstcs")
    protected OnBoardDiagnostics1 onBrdDgnstcs;
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
     * Gets the value of the vhclIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVhclIdNb() {
        return vhclIdNb;
    }

    /**
     * Sets the value of the vhclIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVhclIdNb(String value) {
        this.vhclIdNb = value;
    }

    /**
     * Gets the value of the fleetNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFleetNb() {
        return fleetNb;
    }

    /**
     * Sets the value of the fleetNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFleetNb(String value) {
        this.fleetNb = value;
    }

    /**
     * Gets the value of the subFleetNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFleetNb() {
        return subFleetNb;
    }

    /**
     * Sets the value of the subFleetNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFleetNb(String value) {
        this.subFleetNb = value;
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
     * Gets the value of the rplcmntVhclInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRplcmntVhclInd() {
        return rplcmntVhclInd;
    }

    /**
     * Sets the value of the rplcmntVhclInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRplcmntVhclInd(Boolean value) {
        this.rplcmntVhclInd = value;
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
     * Gets the value of the onBrdDgnstcs property.
     * 
     * @return
     *     possible object is
     *     {@link OnBoardDiagnostics1 }
     *     
     */
    public OnBoardDiagnostics1 getOnBrdDgnstcs() {
        return onBrdDgnstcs;
    }

    /**
     * Sets the value of the onBrdDgnstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnBoardDiagnostics1 }
     *     
     */
    public void setOnBrdDgnstcs(OnBoardDiagnostics1 value) {
        this.onBrdDgnstcs = value;
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
