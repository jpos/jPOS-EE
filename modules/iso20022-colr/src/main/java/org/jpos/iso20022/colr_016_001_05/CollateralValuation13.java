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

package org.jpos.iso20022.colr_016_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValuation13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValuation13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollId" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CollTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralType8Code"/>
 *         <element name="CollDrctn" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralDirection1Code" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SettlementStatus3Code"/>
 *         <element name="ApldXcssInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralAppliedExcess1Code" minOccurs="0"/>
 *         <element name="NbOfDaysAcrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Number" minOccurs="0"/>
 *         <element name="ValtnAmts" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralAmount1"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}InterestComputationMethod2Code" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}BaseOneRate" minOccurs="0"/>
 *         <element name="CcyHrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}BaseOneRate" minOccurs="0"/>
 *         <element name="AdjstdRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}BaseOneRate" minOccurs="0"/>
 *         <element name="SctiesColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SecuritiesCollateral13" minOccurs="0"/>
 *         <element name="CshColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CashCollateral4" minOccurs="0"/>
 *         <element name="OthrColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}OtherCollateral10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValuation13", propOrder = {
    "collId",
    "collTp",
    "collDrctn",
    "sttlmSts",
    "apldXcssInd",
    "nbOfDaysAcrd",
    "valtnAmts",
    "dayCntBsis",
    "xchgRate",
    "ccyHrcut",
    "adjstdRate",
    "sctiesColl",
    "cshColl",
    "othrColl"
})
public class CollateralValuation13 {

    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "CollTp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralType8Code collTp;
    @XmlElement(name = "CollDrctn")
    @XmlSchemaType(name = "string")
    protected CollateralDirection1Code collDrctn;
    @XmlElement(name = "SttlmSts", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementStatus3Code sttlmSts;
    @XmlElement(name = "ApldXcssInd")
    @XmlSchemaType(name = "string")
    protected CollateralAppliedExcess1Code apldXcssInd;
    @XmlElement(name = "NbOfDaysAcrd")
    protected BigDecimal nbOfDaysAcrd;
    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount1 valtnAmts;
    @XmlElement(name = "DayCntBsis")
    @XmlSchemaType(name = "string")
    protected InterestComputationMethod2Code dayCntBsis;
    @XmlElement(name = "XchgRate")
    protected BigDecimal xchgRate;
    @XmlElement(name = "CcyHrcut")
    protected BigDecimal ccyHrcut;
    @XmlElement(name = "AdjstdRate")
    protected BigDecimal adjstdRate;
    @XmlElement(name = "SctiesColl")
    protected SecuritiesCollateral13 sctiesColl;
    @XmlElement(name = "CshColl")
    protected CashCollateral4 cshColl;
    @XmlElement(name = "OthrColl")
    protected OtherCollateral10 othrColl;

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollId(String value) {
        this.collId = value;
    }

    /**
     * Gets the value of the collTp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralType8Code }
     *     
     */
    public CollateralType8Code getCollTp() {
        return collTp;
    }

    /**
     * Sets the value of the collTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralType8Code }
     *     
     */
    public void setCollTp(CollateralType8Code value) {
        this.collTp = value;
    }

    /**
     * Gets the value of the collDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDirection1Code }
     *     
     */
    public CollateralDirection1Code getCollDrctn() {
        return collDrctn;
    }

    /**
     * Sets the value of the collDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDirection1Code }
     *     
     */
    public void setCollDrctn(CollateralDirection1Code value) {
        this.collDrctn = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus3Code }
     *     
     */
    public SettlementStatus3Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus3Code }
     *     
     */
    public void setSttlmSts(SettlementStatus3Code value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the apldXcssInd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAppliedExcess1Code }
     *     
     */
    public CollateralAppliedExcess1Code getApldXcssInd() {
        return apldXcssInd;
    }

    /**
     * Sets the value of the apldXcssInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAppliedExcess1Code }
     *     
     */
    public void setApldXcssInd(CollateralAppliedExcess1Code value) {
        this.apldXcssInd = value;
    }

    /**
     * Gets the value of the nbOfDaysAcrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDaysAcrd() {
        return nbOfDaysAcrd;
    }

    /**
     * Sets the value of the nbOfDaysAcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDaysAcrd(BigDecimal value) {
        this.nbOfDaysAcrd = value;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount1 }
     *     
     */
    public CollateralAmount1 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount1 }
     *     
     */
    public void setValtnAmts(CollateralAmount1 value) {
        this.valtnAmts = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public InterestComputationMethod2Code getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethod2Code }
     *     
     */
    public void setDayCntBsis(InterestComputationMethod2Code value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the ccyHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCcyHrcut() {
        return ccyHrcut;
    }

    /**
     * Sets the value of the ccyHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCcyHrcut(BigDecimal value) {
        this.ccyHrcut = value;
    }

    /**
     * Gets the value of the adjstdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjstdRate() {
        return adjstdRate;
    }

    /**
     * Sets the value of the adjstdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjstdRate(BigDecimal value) {
        this.adjstdRate = value;
    }

    /**
     * Gets the value of the sctiesColl property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCollateral13 }
     *     
     */
    public SecuritiesCollateral13 getSctiesColl() {
        return sctiesColl;
    }

    /**
     * Sets the value of the sctiesColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCollateral13 }
     *     
     */
    public void setSctiesColl(SecuritiesCollateral13 value) {
        this.sctiesColl = value;
    }

    /**
     * Gets the value of the cshColl property.
     * 
     * @return
     *     possible object is
     *     {@link CashCollateral4 }
     *     
     */
    public CashCollateral4 getCshColl() {
        return cshColl;
    }

    /**
     * Sets the value of the cshColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCollateral4 }
     *     
     */
    public void setCshColl(CashCollateral4 value) {
        this.cshColl = value;
    }

    /**
     * Gets the value of the othrColl property.
     * 
     * @return
     *     possible object is
     *     {@link OtherCollateral10 }
     *     
     */
    public OtherCollateral10 getOthrColl() {
        return othrColl;
    }

    /**
     * Sets the value of the othrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherCollateral10 }
     *     
     */
    public void setOthrColl(OtherCollateral10 value) {
        this.othrColl = value;
    }

}
