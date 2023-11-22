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

package org.jpos.iso20022.sese_030_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformation26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalInformation26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}Max35Text" minOccurs="0"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}ClassificationType32Choice" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}SecurityIdentification19" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CutOffDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="Invstr" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}PartyIdentification136" minOccurs="0"/>
 *         <element name="DlvrgPty1" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}PartyIdentificationAndAccount195" minOccurs="0"/>
 *         <element name="RcvgPty1" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}PartyIdentificationAndAccount195" minOccurs="0"/>
 *         <element name="TxSbjtToBuyIn" type="{urn:iso:std:iso:20022:tech:xsd:sese.030.001.09}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation26", propOrder = {
    "acctOwnrTxId",
    "clssfctnTp",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "finInstrmId",
    "qty",
    "fctvDt",
    "xpryDt",
    "cutOffDt",
    "invstr",
    "dlvrgPty1",
    "rcvgPty1",
    "txSbjtToBuyIn"
})
public class AdditionalInformation26 {

    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTime2Choice fctvDt;
    @XmlElement(name = "XpryDt")
    protected DateAndDateTime2Choice xpryDt;
    @XmlElement(name = "CutOffDt")
    protected DateAndDateTime2Choice cutOffDt;
    @XmlElement(name = "Invstr")
    protected PartyIdentification136 invstr;
    @XmlElement(name = "DlvrgPty1")
    protected PartyIdentificationAndAccount195 dlvrgPty1;
    @XmlElement(name = "RcvgPty1")
    protected PartyIdentificationAndAccount195 rcvgPty1;
    @XmlElement(name = "TxSbjtToBuyIn")
    protected Boolean txSbjtToBuyIn;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
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
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvDt(DateAndDateTime2Choice value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setXpryDt(DateAndDateTime2Choice value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the cutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getCutOffDt() {
        return cutOffDt;
    }

    /**
     * Sets the value of the cutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setCutOffDt(DateAndDateTime2Choice value) {
        this.cutOffDt = value;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setInvstr(PartyIdentification136 value) {
        this.invstr = value;
    }

    /**
     * Gets the value of the dlvrgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount195 }
     *     
     */
    public PartyIdentificationAndAccount195 getDlvrgPty1() {
        return dlvrgPty1;
    }

    /**
     * Sets the value of the dlvrgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount195 }
     *     
     */
    public void setDlvrgPty1(PartyIdentificationAndAccount195 value) {
        this.dlvrgPty1 = value;
    }

    /**
     * Gets the value of the rcvgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount195 }
     *     
     */
    public PartyIdentificationAndAccount195 getRcvgPty1() {
        return rcvgPty1;
    }

    /**
     * Sets the value of the rcvgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount195 }
     *     
     */
    public void setRcvgPty1(PartyIdentificationAndAccount195 value) {
        this.rcvgPty1 = value;
    }

    /**
     * Gets the value of the txSbjtToBuyIn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxSbjtToBuyIn() {
        return txSbjtToBuyIn;
    }

    /**
     * Sets the value of the txSbjtToBuyIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxSbjtToBuyIn(Boolean value) {
        this.txSbjtToBuyIn = value;
    }

}
