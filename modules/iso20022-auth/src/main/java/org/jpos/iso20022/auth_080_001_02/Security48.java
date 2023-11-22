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

package org.jpos.iso20022.auth_080_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Security48 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Security48">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareISINIdentifier4" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareCFIIdentifier3" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDecimalNumber3" minOccurs="0"/>
 *         <element name="NmnlVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareAmountAndDirection2" minOccurs="0"/>
 *         <element name="Qlty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareCollateralQualityType3" minOccurs="0"/>
 *         <element name="Mtrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareDate3" minOccurs="0"/>
 *         <element name="IssrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareOrganisationIdentification6" minOccurs="0"/>
 *         <element name="IssrCtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareCountryCode3" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareSecuritiesLendingType3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareUnitPrice6" minOccurs="0"/>
 *         <element name="ExclsvArrgmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareAmountAndDirection2" minOccurs="0"/>
 *         <element name="AvlblForCollReuse" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}CompareTrueFalseIndicator3" minOccurs="0"/>
 *         <element name="HrcutOrMrgn" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}ComparePercentageRate3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Security48", propOrder = {
    "id",
    "clssfctnTp",
    "qty",
    "nmnlVal",
    "qlty",
    "mtrty",
    "issrId",
    "issrCtry",
    "tp",
    "unitPric",
    "exclsvArrgmnt",
    "mktVal",
    "avlblForCollReuse",
    "hrcutOrMrgn"
})
public class Security48 {

    @XmlElement(name = "Id")
    protected CompareISINIdentifier4 id;
    @XmlElement(name = "ClssfctnTp")
    protected CompareCFIIdentifier3 clssfctnTp;
    @XmlElement(name = "Qty")
    protected CompareDecimalNumber3 qty;
    @XmlElement(name = "NmnlVal")
    protected CompareAmountAndDirection2 nmnlVal;
    @XmlElement(name = "Qlty")
    protected CompareCollateralQualityType3 qlty;
    @XmlElement(name = "Mtrty")
    protected CompareDate3 mtrty;
    @XmlElement(name = "IssrId")
    protected CompareOrganisationIdentification6 issrId;
    @XmlElement(name = "IssrCtry")
    protected CompareCountryCode3 issrCtry;
    @XmlElement(name = "Tp")
    protected List<CompareSecuritiesLendingType3> tp;
    @XmlElement(name = "UnitPric")
    protected CompareUnitPrice6 unitPric;
    @XmlElement(name = "ExclsvArrgmnt")
    protected CompareTrueFalseIndicator3 exclsvArrgmnt;
    @XmlElement(name = "MktVal")
    protected CompareAmountAndDirection2 mktVal;
    @XmlElement(name = "AvlblForCollReuse")
    protected CompareTrueFalseIndicator3 avlblForCollReuse;
    @XmlElement(name = "HrcutOrMrgn")
    protected ComparePercentageRate3 hrcutOrMrgn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public CompareISINIdentifier4 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareISINIdentifier4 }
     *     
     */
    public void setId(CompareISINIdentifier4 value) {
        this.id = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public CompareCFIIdentifier3 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCFIIdentifier3 }
     *     
     */
    public void setClssfctnTp(CompareCFIIdentifier3 value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public CompareDecimalNumber3 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDecimalNumber3 }
     *     
     */
    public void setQty(CompareDecimalNumber3 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the nmnlVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getNmnlVal() {
        return nmnlVal;
    }

    /**
     * Sets the value of the nmnlVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public void setNmnlVal(CompareAmountAndDirection2 value) {
        this.nmnlVal = value;
    }

    /**
     * Gets the value of the qlty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCollateralQualityType3 }
     *     
     */
    public CompareCollateralQualityType3 getQlty() {
        return qlty;
    }

    /**
     * Sets the value of the qlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCollateralQualityType3 }
     *     
     */
    public void setQlty(CompareCollateralQualityType3 value) {
        this.qlty = value;
    }

    /**
     * Gets the value of the mtrty property.
     * 
     * @return
     *     possible object is
     *     {@link CompareDate3 }
     *     
     */
    public CompareDate3 getMtrty() {
        return mtrty;
    }

    /**
     * Sets the value of the mtrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareDate3 }
     *     
     */
    public void setMtrty(CompareDate3 value) {
        this.mtrty = value;
    }

    /**
     * Gets the value of the issrId property.
     * 
     * @return
     *     possible object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public CompareOrganisationIdentification6 getIssrId() {
        return issrId;
    }

    /**
     * Sets the value of the issrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareOrganisationIdentification6 }
     *     
     */
    public void setIssrId(CompareOrganisationIdentification6 value) {
        this.issrId = value;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link CompareCountryCode3 }
     *     
     */
    public CompareCountryCode3 getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareCountryCode3 }
     *     
     */
    public void setIssrCtry(CompareCountryCode3 value) {
        this.issrCtry = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompareSecuritiesLendingType3 }
     * 
     * 
     * @return
     *     The value of the tp property.
     */
    public List<CompareSecuritiesLendingType3> getTp() {
        if (tp == null) {
            tp = new ArrayList<>();
        }
        return this.tp;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public CompareUnitPrice6 getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareUnitPrice6 }
     *     
     */
    public void setUnitPric(CompareUnitPrice6 value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the exclsvArrgmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getExclsvArrgmnt() {
        return exclsvArrgmnt;
    }

    /**
     * Sets the value of the exclsvArrgmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setExclsvArrgmnt(CompareTrueFalseIndicator3 value) {
        this.exclsvArrgmnt = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public CompareAmountAndDirection2 getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareAmountAndDirection2 }
     *     
     */
    public void setMktVal(CompareAmountAndDirection2 value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the avlblForCollReuse property.
     * 
     * @return
     *     possible object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public CompareTrueFalseIndicator3 getAvlblForCollReuse() {
        return avlblForCollReuse;
    }

    /**
     * Sets the value of the avlblForCollReuse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompareTrueFalseIndicator3 }
     *     
     */
    public void setAvlblForCollReuse(CompareTrueFalseIndicator3 value) {
        this.avlblForCollReuse = value;
    }

    /**
     * Gets the value of the hrcutOrMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public ComparePercentageRate3 getHrcutOrMrgn() {
        return hrcutOrMrgn;
    }

    /**
     * Sets the value of the hrcutOrMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparePercentageRate3 }
     *     
     */
    public void setHrcutOrMrgn(ComparePercentageRate3 value) {
        this.hrcutOrMrgn = value;
    }

}
