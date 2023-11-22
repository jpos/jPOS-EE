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

package org.jpos.iso20022.camt_079_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceMovement6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceMovement6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}CashSubBalanceTypeAndQuantityBreakdown3"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}CashSubBalanceTypeAndQuantityBreakdown3"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Amount2Choice"/>
 *         <element name="SttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="PrevslySttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="RmngSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="IntnddSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}DateAndDateTime2Choice"/>
 *         <element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="StsDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="CshSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}GenericIdentification37" minOccurs="0"/>
 *         <element name="Lnkgs" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Linkages57" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}PriorityNumeric4Choice" minOccurs="0"/>
 *         <element name="MsgOrgtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}SystemPartyIdentification8" minOccurs="0"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}ISODateTime"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}Max350Text" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceMovement6", propOrder = {
    "balFr",
    "balTo",
    "sttlmAmt",
    "sttldAmt",
    "prevslySttldAmt",
    "rmngSttlmAmt",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "stsDt",
    "cshSubBalId",
    "lnkgs",
    "prty",
    "msgOrgtr",
    "creDtTm",
    "instrPrcgAddtlDtls",
    "splmtryData"
})
public class IntraBalanceMovement6 {

    @XmlElement(name = "BalFr", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balTo;
    @XmlElement(name = "SttlmAmt", required = true)
    protected Amount2Choice sttlmAmt;
    @XmlElement(name = "SttldAmt")
    protected Amount2Choice sttldAmt;
    @XmlElement(name = "PrevslySttldAmt")
    protected Amount2Choice prevslySttldAmt;
    @XmlElement(name = "RmngSttlmAmt")
    protected Amount2Choice rmngSttlmAmt;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected DateAndDateTime2Choice intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTime2Choice fctvSttlmDt;
    @XmlElement(name = "StsDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsDt;
    @XmlElement(name = "CshSubBalId")
    protected GenericIdentification37 cshSubBalId;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages57> lnkgs;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "MsgOrgtr")
    protected SystemPartyIdentification8 msgOrgtr;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public void setBalFr(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public void setBalTo(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balTo = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setSttlmAmt(Amount2Choice value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setSttldAmt(Amount2Choice value) {
        this.sttldAmt = value;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setPrevslySttldAmt(Amount2Choice value) {
        this.prevslySttldAmt = value;
    }

    /**
     * Gets the value of the rmngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getRmngSttlmAmt() {
        return rmngSttlmAmt;
    }

    /**
     * Sets the value of the rmngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setRmngSttlmAmt(Amount2Choice value) {
        this.rmngSttlmAmt = value;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setIntnddSttlmDt(DateAndDateTime2Choice value) {
        this.intnddSttlmDt = value;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvSttlmDt(DateAndDateTime2Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsDt(XMLGregorianCalendar value) {
        this.stsDt = value;
    }

    /**
     * Gets the value of the cshSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getCshSubBalId() {
        return cshSubBalId;
    }

    /**
     * Sets the value of the cshSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setCshSubBalId(GenericIdentification37 value) {
        this.cshSubBalId = value;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages57 }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages57> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setMsgOrgtr(SystemPartyIdentification8 value) {
        this.msgOrgtr = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the instrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrcgAddtlDtls() {
        return instrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the instrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrPrcgAddtlDtls(String value) {
        this.instrPrcgAddtlDtls = value;
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
