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

package org.jpos.iso20022.semt_019_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesFinancingTransactionDetails45 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesFinancingTransactionDetails45">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesFincgTradId" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}Max52Text" minOccurs="0"/>
 *         <element name="ClsgLegId" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}Max35Text" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}TerminationDate6Choice" minOccurs="0"/>
 *         <element name="RateTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}RateType35Choice" minOccurs="0"/>
 *         <element name="LglFrmwk" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}LegalFramework3Choice" minOccurs="0"/>
 *         <element name="MtrtyDtMod" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="IntrstPmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}YesNoIndicator" minOccurs="0"/>
 *         <element name="VarblRateSpprt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}RateName1" minOccurs="0"/>
 *         <element name="RpRate" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}Rate2" minOccurs="0"/>
 *         <element name="TxCallDely" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}Exact3NumericText" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}AmountAndDirection21" minOccurs="0"/>
 *         <element name="TermntnTxAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}AmountAndDirection21" minOccurs="0"/>
 *         <element name="ScndLegNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:semt.019.001.10}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesFinancingTransactionDetails45", propOrder = {
    "sctiesFincgTradId",
    "clsgLegId",
    "termntnDt",
    "rateTp",
    "lglFrmwk",
    "mtrtyDtMod",
    "intrstPmt",
    "varblRateSpprt",
    "rpRate",
    "txCallDely",
    "acrdIntrstAmt",
    "termntnTxAmt",
    "scndLegNrrtv"
})
public class SecuritiesFinancingTransactionDetails45 {

    @XmlElement(name = "SctiesFincgTradId")
    protected String sctiesFincgTradId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "TermntnDt")
    protected TerminationDate6Choice termntnDt;
    @XmlElement(name = "RateTp")
    protected RateType35Choice rateTp;
    @XmlElement(name = "LglFrmwk")
    protected LegalFramework3Choice lglFrmwk;
    @XmlElement(name = "MtrtyDtMod")
    protected Boolean mtrtyDtMod;
    @XmlElement(name = "IntrstPmt")
    protected Boolean intrstPmt;
    @XmlElement(name = "VarblRateSpprt")
    protected RateName1 varblRateSpprt;
    @XmlElement(name = "RpRate")
    protected Rate2 rpRate;
    @XmlElement(name = "TxCallDely")
    protected String txCallDely;
    @XmlElement(name = "AcrdIntrstAmt")
    protected AmountAndDirection21 acrdIntrstAmt;
    @XmlElement(name = "TermntnTxAmt")
    protected AmountAndDirection21 termntnTxAmt;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;

    /**
     * Gets the value of the sctiesFincgTradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctiesFincgTradId() {
        return sctiesFincgTradId;
    }

    /**
     * Sets the value of the sctiesFincgTradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctiesFincgTradId(String value) {
        this.sctiesFincgTradId = value;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsgLegId(String value) {
        this.clsgLegId = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public TerminationDate6Choice getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminationDate6Choice }
     *     
     */
    public void setTermntnDt(TerminationDate6Choice value) {
        this.termntnDt = value;
    }

    /**
     * Gets the value of the rateTp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType35Choice }
     *     
     */
    public RateType35Choice getRateTp() {
        return rateTp;
    }

    /**
     * Sets the value of the rateTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType35Choice }
     *     
     */
    public void setRateTp(RateType35Choice value) {
        this.rateTp = value;
    }

    /**
     * Gets the value of the lglFrmwk property.
     * 
     * @return
     *     possible object is
     *     {@link LegalFramework3Choice }
     *     
     */
    public LegalFramework3Choice getLglFrmwk() {
        return lglFrmwk;
    }

    /**
     * Sets the value of the lglFrmwk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalFramework3Choice }
     *     
     */
    public void setLglFrmwk(LegalFramework3Choice value) {
        this.lglFrmwk = value;
    }

    /**
     * Gets the value of the mtrtyDtMod property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMtrtyDtMod() {
        return mtrtyDtMod;
    }

    /**
     * Sets the value of the mtrtyDtMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMtrtyDtMod(Boolean value) {
        this.mtrtyDtMod = value;
    }

    /**
     * Gets the value of the intrstPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntrstPmt() {
        return intrstPmt;
    }

    /**
     * Sets the value of the intrstPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntrstPmt(Boolean value) {
        this.intrstPmt = value;
    }

    /**
     * Gets the value of the varblRateSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link RateName1 }
     *     
     */
    public RateName1 getVarblRateSpprt() {
        return varblRateSpprt;
    }

    /**
     * Sets the value of the varblRateSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateName1 }
     *     
     */
    public void setVarblRateSpprt(RateName1 value) {
        this.varblRateSpprt = value;
    }

    /**
     * Gets the value of the rpRate property.
     * 
     * @return
     *     possible object is
     *     {@link Rate2 }
     *     
     */
    public Rate2 getRpRate() {
        return rpRate;
    }

    /**
     * Sets the value of the rpRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rate2 }
     *     
     */
    public void setRpRate(Rate2 value) {
        this.rpRate = value;
    }

    /**
     * Gets the value of the txCallDely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCallDely() {
        return txCallDely;
    }

    /**
     * Sets the value of the txCallDely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCallDely(String value) {
        this.txCallDely = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection21 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the termntnTxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public AmountAndDirection21 getTermntnTxAmt() {
        return termntnTxAmt;
    }

    /**
     * Sets the value of the termntnTxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection21 }
     *     
     */
    public void setTermntnTxAmt(AmountAndDirection21 value) {
        this.termntnTxAmt = value;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
    }

}
