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

package org.jpos.iso20022.camt_088_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetObligation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetObligation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OblgtnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Max35Text"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}ActiveCurrencyAndAmount"/>
 *         <element name="PtcptNetgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}NettingIdentification2Choice"/>
 *         <element name="OblgtnDrctn" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PaymentReceipt1Code"/>
 *         <element name="CtrPtyNetgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}NettingIdentification2Choice"/>
 *         <element name="NetSvcCtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="CtrPtySttlmInstrs" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}SettlementParties120" minOccurs="0"/>
 *         <element name="TxsNb" type="{urn:iso:std:iso:20022:tech:xsd:camt.088.001.02}Max10NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetObligation2", propOrder = {
    "oblgtnId",
    "amt",
    "ptcptNetgId",
    "oblgtnDrctn",
    "ctrPtyNetgId",
    "netSvcCtrPtyId",
    "ctrPtySttlmInstrs",
    "txsNb"
})
public class NetObligation2 {

    @XmlElement(name = "OblgtnId", required = true)
    protected String oblgtnId;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "PtcptNetgId", required = true)
    protected NettingIdentification2Choice ptcptNetgId;
    @XmlElement(name = "OblgtnDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected PaymentReceipt1Code oblgtnDrctn;
    @XmlElement(name = "CtrPtyNetgId", required = true)
    protected NettingIdentification2Choice ctrPtyNetgId;
    @XmlElement(name = "NetSvcCtrPtyId")
    protected PartyIdentification242Choice netSvcCtrPtyId;
    @XmlElement(name = "CtrPtySttlmInstrs")
    protected SettlementParties120 ctrPtySttlmInstrs;
    @XmlElement(name = "TxsNb")
    protected String txsNb;

    /**
     * Gets the value of the oblgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOblgtnId() {
        return oblgtnId;
    }

    /**
     * Sets the value of the oblgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOblgtnId(String value) {
        this.oblgtnId = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the ptcptNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NettingIdentification2Choice getPtcptNetgId() {
        return ptcptNetgId;
    }

    /**
     * Sets the value of the ptcptNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public void setPtcptNetgId(NettingIdentification2Choice value) {
        this.ptcptNetgId = value;
    }

    /**
     * Gets the value of the oblgtnDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReceipt1Code }
     *     
     */
    public PaymentReceipt1Code getOblgtnDrctn() {
        return oblgtnDrctn;
    }

    /**
     * Sets the value of the oblgtnDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReceipt1Code }
     *     
     */
    public void setOblgtnDrctn(PaymentReceipt1Code value) {
        this.oblgtnDrctn = value;
    }

    /**
     * Gets the value of the ctrPtyNetgId property.
     * 
     * @return
     *     possible object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public NettingIdentification2Choice getCtrPtyNetgId() {
        return ctrPtyNetgId;
    }

    /**
     * Sets the value of the ctrPtyNetgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingIdentification2Choice }
     *     
     */
    public void setCtrPtyNetgId(NettingIdentification2Choice value) {
        this.ctrPtyNetgId = value;
    }

    /**
     * Gets the value of the netSvcCtrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getNetSvcCtrPtyId() {
        return netSvcCtrPtyId;
    }

    /**
     * Sets the value of the netSvcCtrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setNetSvcCtrPtyId(PartyIdentification242Choice value) {
        this.netSvcCtrPtyId = value;
    }

    /**
     * Gets the value of the ctrPtySttlmInstrs property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties120 }
     *     
     */
    public SettlementParties120 getCtrPtySttlmInstrs() {
        return ctrPtySttlmInstrs;
    }

    /**
     * Sets the value of the ctrPtySttlmInstrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties120 }
     *     
     */
    public void setCtrPtySttlmInstrs(SettlementParties120 value) {
        this.ctrPtySttlmInstrs = value;
    }

    /**
     * Gets the value of the txsNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxsNb() {
        return txsNb;
    }

    /**
     * Sets the value of the txsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxsNb(String value) {
        this.txsNb = value;
    }

}
