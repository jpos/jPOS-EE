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

package org.jpos.iso20022.pacs_007_001_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GroupHeader97 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GroupHeader97">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ISODateTime"/>
 *         <element name="Authstn" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}Authorisation1Choice" maxOccurs="2" minOccurs="0"/>
 *         <element name="BtchBookg" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}BatchBookingIndicator" minOccurs="0"/>
 *         <element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}Max15NumericText"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}DecimalNumber" minOccurs="0"/>
 *         <element name="GrpRvsl" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TtlRvsdIntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}ISODate" minOccurs="0"/>
 *         <element name="SttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}SettlementInstruction11"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:pacs.007.001.12}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupHeader97", propOrder = {
    "msgId",
    "creDtTm",
    "authstn",
    "btchBookg",
    "nbOfTxs",
    "ctrlSum",
    "grpRvsl",
    "ttlRvsdIntrBkSttlmAmt",
    "intrBkSttlmDt",
    "sttlmInf",
    "instgAgt",
    "instdAgt"
})
public class GroupHeader97 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Authstn")
    protected List<Authorisation1Choice> authstn;
    @XmlElement(name = "BtchBookg")
    protected Boolean btchBookg;
    @XmlElement(name = "NbOfTxs", required = true)
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "GrpRvsl")
    protected Boolean grpRvsl;
    @XmlElement(name = "TtlRvsdIntrBkSttlmAmt")
    protected ActiveCurrencyAndAmount ttlRvsdIntrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "SttlmInf", required = true)
    protected SettlementInstruction11 sttlmInf;
    @XmlElement(name = "InstgAgt")
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt")
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
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
     * Gets the value of the authstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorisation1Choice }
     * 
     * 
     * @return
     *     The value of the authstn property.
     */
    public List<Authorisation1Choice> getAuthstn() {
        if (authstn == null) {
            authstn = new ArrayList<>();
        }
        return this.authstn;
    }

    /**
     * Gets the value of the btchBookg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBtchBookg() {
        return btchBookg;
    }

    /**
     * Sets the value of the btchBookg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBtchBookg(Boolean value) {
        this.btchBookg = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Gets the value of the grpRvsl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrpRvsl() {
        return grpRvsl;
    }

    /**
     * Sets the value of the grpRvsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrpRvsl(Boolean value) {
        this.grpRvsl = value;
    }

    /**
     * Gets the value of the ttlRvsdIntrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlRvsdIntrBkSttlmAmt() {
        return ttlRvsdIntrBkSttlmAmt;
    }

    /**
     * Sets the value of the ttlRvsdIntrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlRvsdIntrBkSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlRvsdIntrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the sttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInstruction11 }
     *     
     */
    public SettlementInstruction11 getSttlmInf() {
        return sttlmInf;
    }

    /**
     * Sets the value of the sttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInstruction11 }
     *     
     */
    public void setSttlmInf(SettlementInstruction11 value) {
        this.sttlmInf = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

}
