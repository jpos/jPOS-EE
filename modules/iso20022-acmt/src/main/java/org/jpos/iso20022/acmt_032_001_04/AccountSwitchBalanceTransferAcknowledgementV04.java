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

package org.jpos.iso20022.acmt_032_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSwitchBalanceTransferAcknowledgementV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSwitchBalanceTransferAcknowledgementV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}MessageIdentification1"/>
 *         <element name="AcctSwtchDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}AccountSwitchDetails1"/>
 *         <element name="OdAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}CashAccount41"/>
 *         <element name="OdAcctBal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}AmountAndDirection5"/>
 *         <element name="BalTrf" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}BalanceTransfer4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.032.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchBalanceTransferAcknowledgementV04", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "odAcct",
    "odAcctBal",
    "balTrf",
    "splmtryData"
})
public class AccountSwitchBalanceTransferAcknowledgementV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount41 odAcct;
    @XmlElement(name = "OdAcctBal", required = true)
    protected AmountAndDirection5 odAcctBal;
    @XmlElement(name = "BalTrf")
    protected List<BalanceTransfer4> balTrf;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the acctSwtchDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSwitchDetails1 }
     *     
     */
    public AccountSwitchDetails1 getAcctSwtchDtls() {
        return acctSwtchDtls;
    }

    /**
     * Sets the value of the acctSwtchDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSwitchDetails1 }
     *     
     */
    public void setAcctSwtchDtls(AccountSwitchDetails1 value) {
        this.acctSwtchDtls = value;
    }

    /**
     * Gets the value of the odAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getOdAcct() {
        return odAcct;
    }

    /**
     * Sets the value of the odAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public void setOdAcct(CashAccount41 value) {
        this.odAcct = value;
    }

    /**
     * Gets the value of the odAcctBal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getOdAcctBal() {
        return odAcctBal;
    }

    /**
     * Sets the value of the odAcctBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setOdAcctBal(AmountAndDirection5 value) {
        this.odAcctBal = value;
    }

    /**
     * Gets the value of the balTrf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balTrf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalTrf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceTransfer4 }
     * 
     * 
     * @return
     *     The value of the balTrf property.
     */
    public List<BalanceTransfer4> getBalTrf() {
        if (balTrf == null) {
            balTrf = new ArrayList<>();
        }
        return this.balTrf;
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
