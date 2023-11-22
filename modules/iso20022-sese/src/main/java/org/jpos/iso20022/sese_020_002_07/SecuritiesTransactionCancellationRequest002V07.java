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

package org.jpos.iso20022.sese_020_002_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesTransactionCancellationRequest002V07 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesTransactionCancellationRequest002V07">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}References60Choice"/>
 *         <element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}RestrictedFINXMax16Text" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}PartyIdentification156" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}SecuritiesAccount30" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}BlockChainAddressWallet7" minOccurs="0"/>
 *         <element name="TxDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}TransactionDetails160" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}CancellationReason27" minOccurs="0"/>
 *         <element name="FxCxl" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}FXCancellation4Choice" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:sese.020.002.07}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionCancellationRequest002V07", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "acctOwnr",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "txDtls",
    "cxlRsn",
    "fxCxl",
    "splmtryData"
})
public class SecuritiesTransactionCancellationRequest002V07 {

    @XmlElement(name = "AcctOwnrTxId", required = true)
    protected References60Choice acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "AcctOwnr")
    protected PartyIdentification156 acctOwnr;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount30 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet7 blckChainAdrOrWllt;
    @XmlElement(name = "TxDtls")
    protected TransactionDetails160 txDtls;
    @XmlElement(name = "CxlRsn")
    protected CancellationReason27 cxlRsn;
    @XmlElement(name = "FxCxl")
    protected FXCancellation4Choice fxCxl;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link References60Choice }
     *     
     */
    public References60Choice getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link References60Choice }
     *     
     */
    public void setAcctOwnrTxId(References60Choice value) {
        this.acctOwnrTxId = value;
    }

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrTxId(String value) {
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
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
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
     *     {@link TransactionDetails160 }
     *     
     */
    public TransactionDetails160 getTxDtls() {
        return txDtls;
    }

    /**
     * Sets the value of the txDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionDetails160 }
     *     
     */
    public void setTxDtls(TransactionDetails160 value) {
        this.txDtls = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason27 }
     *     
     */
    public CancellationReason27 getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason27 }
     *     
     */
    public void setCxlRsn(CancellationReason27 value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the fxCxl property.
     * 
     * @return
     *     possible object is
     *     {@link FXCancellation4Choice }
     *     
     */
    public FXCancellation4Choice getFxCxl() {
        return fxCxl;
    }

    /**
     * Sets the value of the fxCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FXCancellation4Choice }
     *     
     */
    public void setFxCxl(FXCancellation4Choice value) {
        this.fxCxl = value;
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
