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

package org.jpos.iso20022.semt_002_002_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesBalanceCustodyReport002V11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesBalanceCustodyReport002V11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pgntn" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}Pagination1"/>
 *         <element name="StmtGnlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}Statement77"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}PartyIdentification156" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}PartyIdentification157" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}SecuritiesAccount42" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}BlockChainAddressWallet10" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}Intermediary45" maxOccurs="10" minOccurs="0"/>
 *         <element name="BalForAcct" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}AggregateBalanceInformation44" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SubAcctDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}SubAccountIdentification69" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctBaseCcyTtlAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.002.11}TotalValueInPageAndStatement3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesBalanceCustodyReport002V11", propOrder = {
    "pgntn",
    "stmtGnlDtls",
    "acctOwnr",
    "acctSvcr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "intrmyInf",
    "balForAcct",
    "subAcctDtls",
    "acctBaseCcyTtlAmts"
})
public class SecuritiesBalanceCustodyReport002V11 {

    @XmlElement(name = "Pgntn", required = true)
    protected Pagination1 pgntn;
    @XmlElement(name = "StmtGnlDtls", required = true)
    protected Statement77 stmtGnlDtls;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected PartyIdentification157 acctSvcr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount42 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet10 blckChainAdrOrWllt;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary45> intrmyInf;
    @XmlElement(name = "BalForAcct")
    protected List<AggregateBalanceInformation44> balForAcct;
    @XmlElement(name = "SubAcctDtls")
    protected List<SubAccountIdentification69> subAcctDtls;
    @XmlElement(name = "AcctBaseCcyTtlAmts")
    protected TotalValueInPageAndStatement3 acctBaseCcyTtlAmts;

    /**
     * Gets the value of the pgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination1 }
     *     
     */
    public Pagination1 getPgntn() {
        return pgntn;
    }

    /**
     * Sets the value of the pgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination1 }
     *     
     */
    public void setPgntn(Pagination1 value) {
        this.pgntn = value;
    }

    /**
     * Gets the value of the stmtGnlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Statement77 }
     *     
     */
    public Statement77 getStmtGnlDtls() {
        return stmtGnlDtls;
    }

    /**
     * Sets the value of the stmtGnlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement77 }
     *     
     */
    public void setStmtGnlDtls(Statement77 value) {
        this.stmtGnlDtls = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification156 }
     *     
     */
    public PartyIdentification156 getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification156 }
     *     
     */
    public void setAcctOwnr(PartyIdentification156 value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification157 }
     *     
     */
    public PartyIdentification157 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification157 }
     *     
     */
    public void setAcctSvcr(PartyIdentification157 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount42 }
     *     
     */
    public SecuritiesAccount42 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount42 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount42 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet10 }
     *     
     */
    public BlockChainAddressWallet10 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet10 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet10 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary45 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary45> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the balForAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balForAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalForAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregateBalanceInformation44 }
     * 
     * 
     * @return
     *     The value of the balForAcct property.
     */
    public List<AggregateBalanceInformation44> getBalForAcct() {
        if (balForAcct == null) {
            balForAcct = new ArrayList<>();
        }
        return this.balForAcct;
    }

    /**
     * Gets the value of the subAcctDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subAcctDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubAcctDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubAccountIdentification69 }
     * 
     * 
     * @return
     *     The value of the subAcctDtls property.
     */
    public List<SubAccountIdentification69> getSubAcctDtls() {
        if (subAcctDtls == null) {
            subAcctDtls = new ArrayList<>();
        }
        return this.subAcctDtls;
    }

    /**
     * Gets the value of the acctBaseCcyTtlAmts property.
     * 
     * @return
     *     possible object is
     *     {@link TotalValueInPageAndStatement3 }
     *     
     */
    public TotalValueInPageAndStatement3 getAcctBaseCcyTtlAmts() {
        return acctBaseCcyTtlAmts;
    }

    /**
     * Sets the value of the acctBaseCcyTtlAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalValueInPageAndStatement3 }
     *     
     */
    public void setAcctBaseCcyTtlAmts(TotalValueInPageAndStatement3 value) {
        this.acctBaseCcyTtlAmts = value;
    }

}
