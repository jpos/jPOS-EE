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

package org.jpos.iso20022.sese_029_002_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSettlementAllegementRemovalAdvice002V06 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSettlementAllegementRemovalAdvice002V06">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}SettlementTypeAndIdentification22"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="CtrPtyMktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}PartyIdentification156" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}TransactionDetails156" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.029.002.06}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSettlementAllegementRemovalAdvice002V06", propOrder = {
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "ctrPtyMktInfrstrctrTxId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "txDtls",
    "splmtryData"
})
public class SecuritiesSettlementAllegementRemovalAdvice002V06 {

    @XmlElement(name = "AcctSvcrTxId", required = true)
    protected SettlementTypeAndIdentification22 acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "CtrPtyMktInfrstrctrTxId")
    protected String ctrPtyMktInfrstrctrTxId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails156 txDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public SettlementTypeAndIdentification22 getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeAndIdentification22 }
     *     
     */
    public void setAcctSvcrTxId(SettlementTypeAndIdentification22 value) {
        this.acctSvcrTxId = value;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the ctrPtyMktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrPtyMktInfrstrctrTxId() {
        return ctrPtyMktInfrstrctrTxId;
    }

    /**
     * Sets the value of the ctrPtyMktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrPtyMktInfrstrctrTxId(String value) {
        this.ctrPtyMktInfrstrctrTxId = value;
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
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public SecuritiesAccount30 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount30 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount30 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public BlockChainAddressWallet7 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet7 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet7 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the txDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionDetails156 }
     *     
     */
    public TransactionDetails156 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails156 }
     *     
     */
    public void setTxDtls(TransactionDetails156 value) {
        this.txDtls = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
