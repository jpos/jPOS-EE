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

package org.jpos.iso20022.acmt_028_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSwitchInformationResponseV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSwitchInformationResponseV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}MessageIdentification1"/>
 *         <element name="AcctSwtchDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}AccountSwitchDetails1"/>
 *         <element name="NewAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}CashAccount41"/>
 *         <element name="OdAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}CashAccount41"/>
 *         <element name="PmtInstr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}PaymentInstruction38" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DrctDbtInstr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}DirectDebitInstructionDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchInformationResponseV04", propOrder = {
    "msgId",
    "acctSwtchDtls",
    "newAcct",
    "odAcct",
    "pmtInstr",
    "drctDbtInstr",
    "splmtryData"
})
public class AccountSwitchInformationResponseV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "AcctSwtchDtls", required = true)
    protected AccountSwitchDetails1 acctSwtchDtls;
    @XmlElement(name = "NewAcct", required = true)
    protected CashAccount41 newAcct;
    @XmlElement(name = "OdAcct", required = true)
    protected CashAccount41 odAcct;
    @XmlElement(name = "PmtInstr")
    protected List<PaymentInstruction38> pmtInstr;
    @XmlElement(name = "DrctDbtInstr")
    protected List<DirectDebitInstructionDetails2> drctDbtInstr;
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
     * Gets the value of the newAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount41 }
     *     
     */
    public CashAccount41 getNewAcct() {
        return newAcct;
    }

    /**
     * Sets the value of the newAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount41 }
     *     
     */
    public void setNewAcct(CashAccount41 value) {
        this.newAcct = value;
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
     * Gets the value of the pmtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmtInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmtInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInstruction38 }
     * 
     * 
     * @return
     *     The value of the pmtInstr property.
     */
    public List<PaymentInstruction38> getPmtInstr() {
        if (pmtInstr == null) {
            pmtInstr = new ArrayList<>();
        }
        return this.pmtInstr;
    }

    /**
     * Gets the value of the drctDbtInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the drctDbtInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrctDbtInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DirectDebitInstructionDetails2 }
     * 
     * 
     * @return
     *     The value of the drctDbtInstr property.
     */
    public List<DirectDebitInstructionDetails2> getDrctDbtInstr() {
        if (drctDbtInstr == null) {
            drctDbtInstr = new ArrayList<>();
        }
        return this.drctDbtInstr;
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
