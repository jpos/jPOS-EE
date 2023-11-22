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

package org.jpos.iso20022.colr_022_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction124 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction124">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClntTrptyCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCollTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max35Text"/>
 *         <element name="CtrPtyCollTxRef" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max35Text" minOccurs="0"/>
 *         <element name="CmonTxId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Max52Text" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ExposureType23Choice"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}OptionType6Choice" minOccurs="0"/>
 *         <element name="TermntnOptn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}RepoTerminationOption1Code" minOccurs="0"/>
 *         <element name="BsktIdAndElgbltySetPrfl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BasketIdentificationAndEligibilitySetProfile1" minOccurs="0"/>
 *         <element name="CollPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralParties11"/>
 *         <element name="ExctnReqdDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ClosingDate4Choice"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ClosingDate4Choice"/>
 *         <element name="ValtnAmts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralAmount17"/>
 *         <element name="PricgRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}RateOrName4Choice" minOccurs="0"/>
 *         <element name="MrgnRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="SprdRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PercentageRate" minOccurs="0"/>
 *         <element name="DayCntBsis" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}InterestComputationMethodFormat4Choice" minOccurs="0"/>
 *         <element name="AutomtcAllcn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}TransactionStatus6" maxOccurs="2" minOccurs="0"/>
 *         <element name="SctiesBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SecuritiesBalance3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CshBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CashBalance15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction124", propOrder = {
    "clntTrptyCollTxId",
    "trptyAgtSvcPrvdrCollTxId",
    "ctrPtyCollTxRef",
    "cmonTxId",
    "xpsrTp",
    "optnTp",
    "termntnOptn",
    "bsktIdAndElgbltySetPrfl",
    "collPties",
    "exctnReqdDt",
    "clsgDt",
    "valtnAmts",
    "pricgRate",
    "mrgnRate",
    "sprdRate",
    "dayCntBsis",
    "automtcAllcn",
    "txSts",
    "sctiesBal",
    "cshBal"
})
public class Transaction124 {

    @XmlElement(name = "ClntTrptyCollTxId")
    protected String clntTrptyCollTxId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCollTxId", required = true)
    protected String trptyAgtSvcPrvdrCollTxId;
    @XmlElement(name = "CtrPtyCollTxRef")
    protected String ctrPtyCollTxRef;
    @XmlElement(name = "CmonTxId")
    protected String cmonTxId;
    @XmlElement(name = "XpsrTp", required = true)
    protected ExposureType23Choice xpsrTp;
    @XmlElement(name = "OptnTp")
    protected OptionType6Choice optnTp;
    @XmlElement(name = "TermntnOptn")
    @XmlSchemaType(name = "string")
    protected RepoTerminationOption1Code termntnOptn;
    @XmlElement(name = "BsktIdAndElgbltySetPrfl")
    protected BasketIdentificationAndEligibilitySetProfile1 bsktIdAndElgbltySetPrfl;
    @XmlElement(name = "CollPties", required = true)
    protected CollateralParties11 collPties;
    @XmlElement(name = "ExctnReqdDt", required = true)
    protected ClosingDate4Choice exctnReqdDt;
    @XmlElement(name = "ClsgDt", required = true)
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "ValtnAmts", required = true)
    protected CollateralAmount17 valtnAmts;
    @XmlElement(name = "PricgRate")
    protected RateOrName4Choice pricgRate;
    @XmlElement(name = "MrgnRate")
    protected BigDecimal mrgnRate;
    @XmlElement(name = "SprdRate")
    protected BigDecimal sprdRate;
    @XmlElement(name = "DayCntBsis")
    protected InterestComputationMethodFormat4Choice dayCntBsis;
    @XmlElement(name = "AutomtcAllcn")
    protected Boolean automtcAllcn;
    @XmlElement(name = "TxSts")
    protected List<TransactionStatus6> txSts;
    @XmlElement(name = "SctiesBal")
    protected List<SecuritiesBalance3> sctiesBal;
    @XmlElement(name = "CshBal")
    protected List<CashBalance15> cshBal;

    /**
     * Gets the value of the clntTrptyCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntTrptyCollTxId() {
        return clntTrptyCollTxId;
    }

    /**
     * Sets the value of the clntTrptyCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntTrptyCollTxId(String value) {
        this.clntTrptyCollTxId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCollTxId() {
        return trptyAgtSvcPrvdrCollTxId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCollTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCollTxId(String value) {
        this.trptyAgtSvcPrvdrCollTxId = value;
    }

    /**
     * Gets the value of the ctrPtyCollTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyCollTxRef() {
        return ctrPtyCollTxRef;
    }

    /**
     * Sets the value of the ctrPtyCollTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyCollTxRef(String value) {
        this.ctrPtyCollTxRef = value;
    }

    /**
     * Gets the value of the cmonTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmonTxId() {
        return cmonTxId;
    }

    /**
     * Sets the value of the cmonTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmonTxId(String value) {
        this.cmonTxId = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType23Choice }
     *     
     */
    public ExposureType23Choice getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType23Choice }
     *     
     */
    public void setXpsrTp(ExposureType23Choice value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType6Choice }
     *     
     */
    public OptionType6Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType6Choice }
     *     
     */
    public void setOptnTp(OptionType6Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the termntnOptn property.
     * 
     * @return
     *     possible object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public RepoTerminationOption1Code getTermntnOptn() {
        return termntnOptn;
    }

    /**
     * Sets the value of the termntnOptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepoTerminationOption1Code }
     *     
     */
    public void setTermntnOptn(RepoTerminationOption1Code value) {
        this.termntnOptn = value;
    }

    /**
     * Gets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public BasketIdentificationAndEligibilitySetProfile1 getBsktIdAndElgbltySetPrfl() {
        return bsktIdAndElgbltySetPrfl;
    }

    /**
     * Sets the value of the bsktIdAndElgbltySetPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasketIdentificationAndEligibilitySetProfile1 }
     *     
     */
    public void setBsktIdAndElgbltySetPrfl(BasketIdentificationAndEligibilitySetProfile1 value) {
        this.bsktIdAndElgbltySetPrfl = value;
    }

    /**
     * Gets the value of the collPties property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralParties11 }
     *     
     */
    public CollateralParties11 getCollPties() {
        return collPties;
    }

    /**
     * Sets the value of the collPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralParties11 }
     *     
     */
    public void setCollPties(CollateralParties11 value) {
        this.collPties = value;
    }

    /**
     * Gets the value of the exctnReqdDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getExctnReqdDt() {
        return exctnReqdDt;
    }

    /**
     * Sets the value of the exctnReqdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setExctnReqdDt(ClosingDate4Choice value) {
        this.exctnReqdDt = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the valtnAmts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAmount17 }
     *     
     */
    public CollateralAmount17 getValtnAmts() {
        return valtnAmts;
    }

    /**
     * Sets the value of the valtnAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAmount17 }
     *     
     */
    public void setValtnAmts(CollateralAmount17 value) {
        this.valtnAmts = value;
    }

    /**
     * Gets the value of the pricgRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateOrName4Choice }
     *     
     */
    public RateOrName4Choice getPricgRate() {
        return pricgRate;
    }

    /**
     * Sets the value of the pricgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateOrName4Choice }
     *     
     */
    public void setPricgRate(RateOrName4Choice value) {
        this.pricgRate = value;
    }

    /**
     * Gets the value of the mrgnRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMrgnRate() {
        return mrgnRate;
    }

    /**
     * Sets the value of the mrgnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMrgnRate(BigDecimal value) {
        this.mrgnRate = value;
    }

    /**
     * Gets the value of the sprdRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprdRate() {
        return sprdRate;
    }

    /**
     * Sets the value of the sprdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSprdRate(BigDecimal value) {
        this.sprdRate = value;
    }

    /**
     * Gets the value of the dayCntBsis property.
     * 
     * @return
     *     possible object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public InterestComputationMethodFormat4Choice getDayCntBsis() {
        return dayCntBsis;
    }

    /**
     * Sets the value of the dayCntBsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestComputationMethodFormat4Choice }
     *     
     */
    public void setDayCntBsis(InterestComputationMethodFormat4Choice value) {
        this.dayCntBsis = value;
    }

    /**
     * Gets the value of the automtcAllcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtcAllcn() {
        return automtcAllcn;
    }

    /**
     * Sets the value of the automtcAllcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomtcAllcn(Boolean value) {
        this.automtcAllcn = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionStatus6 }
     * 
     * 
     * @return
     *     The value of the txSts property.
     */
    public List<TransactionStatus6> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<>();
        }
        return this.txSts;
    }

    /**
     * Gets the value of the sctiesBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctiesBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctiesBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesBalance3 }
     * 
     * 
     * @return
     *     The value of the sctiesBal property.
     */
    public List<SecuritiesBalance3> getSctiesBal() {
        if (sctiesBal == null) {
            sctiesBal = new ArrayList<>();
        }
        return this.sctiesBal;
    }

    /**
     * Gets the value of the cshBal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshBal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashBalance15 }
     * 
     * 
     * @return
     *     The value of the cshBal property.
     */
    public List<CashBalance15> getCshBal() {
        if (cshBal == null) {
            cshBal = new ArrayList<>();
        }
        return this.cshBal;
    }

}
