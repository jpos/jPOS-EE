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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalance3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesBalance3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SecurityIdentification19"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BalanceQuantity13Choice"/>
 *         <element name="CollInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SafeKeepingPlace3" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}PartyIdentification232" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}SecuritiesSettlementStatus3Code" minOccurs="0"/>
 *         <element name="DnmtnCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="RatgDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}Rating2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ForeignExchangeTerms19" minOccurs="0"/>
 *         <element name="ValtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ValuationsDetails1" minOccurs="0"/>
 *         <element name="TxLotNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification178" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalance3", propOrder = {
    "finInstrmId",
    "qty",
    "collInd",
    "sfkpgPlc",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "sttlmSts",
    "dnmtnCcy",
    "ratgDtls",
    "fxDtls",
    "valtnDtls",
    "txLotNb"
})
public class SecuritiesBalance3 {

    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty", required = true)
    protected BalanceQuantity13Choice qty;
    @XmlElement(name = "CollInd")
    protected Boolean collInd;
    @XmlElement(name = "SfkpgPlc")
    protected SafeKeepingPlace3 sfkpgPlc;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification232 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "SttlmSts")
    @XmlSchemaType(name = "string")
    protected SecuritiesSettlementStatus3Code sttlmSts;
    @XmlElement(name = "DnmtnCcy")
    protected String dnmtnCcy;
    @XmlElement(name = "RatgDtls")
    protected List<Rating2> ratgDtls;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms19 fxDtls;
    @XmlElement(name = "ValtnDtls")
    protected ValuationsDetails1 valtnDtls;
    @XmlElement(name = "TxLotNb")
    protected List<GenericIdentification178> txLotNb;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceQuantity13Choice }
     *     
     */
    public BalanceQuantity13Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceQuantity13Choice }
     *     
     */
    public void setQty(BalanceQuantity13Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the collInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollInd() {
        return collInd;
    }

    /**
     * Sets the value of the collInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollInd(Boolean value) {
        this.collInd = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public SafeKeepingPlace3 getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafeKeepingPlace3 }
     *     
     */
    public void setSfkpgPlc(SafeKeepingPlace3 value) {
        this.sfkpgPlc = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification232 }
     *     
     */
    public PartyIdentification232 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification232 }
     *     
     */
    public void setAcctOwnr(PartyIdentification232 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSettlementStatus3Code }
     *     
     */
    public SecuritiesSettlementStatus3Code getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSettlementStatus3Code }
     *     
     */
    public void setSttlmSts(SecuritiesSettlementStatus3Code value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the dnmtnCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnmtnCcy() {
        return dnmtnCcy;
    }

    /**
     * Sets the value of the dnmtnCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnmtnCcy(String value) {
        this.dnmtnCcy = value;
    }

    /**
     * Gets the value of the ratgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ratgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rating2 }
     * 
     * 
     * @return
     *     The value of the ratgDtls property.
     */
    public List<Rating2> getRatgDtls() {
        if (ratgDtls == null) {
            ratgDtls = new ArrayList<>();
        }
        return this.ratgDtls;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms19 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the valtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationsDetails1 }
     *     
     */
    public ValuationsDetails1 getValtnDtls() {
        return valtnDtls;
    }

    /**
     * Sets the value of the valtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationsDetails1 }
     *     
     */
    public void setValtnDtls(ValuationsDetails1 value) {
        this.valtnDtls = value;
    }

    /**
     * Gets the value of the txLotNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txLotNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxLotNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification178 }
     * 
     * 
     * @return
     *     The value of the txLotNb property.
     */
    public List<GenericIdentification178> getTxLotNb() {
        if (txLotNb == null) {
            txLotNb = new ArrayList<>();
        }
        return this.txLotNb;
    }

}
