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

package org.jpos.iso20022.acmt_006_001_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountManagementStatusAndReason5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountManagementStatusAndReason5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}Status25Choice"/>
 *         <element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}AcceptedStatusReason1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctApplId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}Max35Text" minOccurs="0"/>
 *         <element name="ExstgAcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}Account23" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}Max35Text" minOccurs="0"/>
 *         <element name="AcctSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}AccountStatus2" minOccurs="0"/>
 *         <element name="BlckdSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}BlockedStatusReason2Choice" minOccurs="0"/>
 *         <element name="FATCARptgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}ISODate" minOccurs="0"/>
 *         <element name="CRSRptgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountManagementStatusAndReason5", propOrder = {
    "sts",
    "stsRsn",
    "acctApplId",
    "exstgAcctId",
    "acctId",
    "acctSts",
    "blckdSts",
    "fatcaRptgDt",
    "crsRptgDt"
})
public class AccountManagementStatusAndReason5 {

    @XmlElement(name = "Sts", required = true)
    protected Status25Choice sts;
    @XmlElement(name = "StsRsn")
    protected List<AcceptedStatusReason1Choice> stsRsn;
    @XmlElement(name = "AcctApplId")
    protected String acctApplId;
    @XmlElement(name = "ExstgAcctId")
    protected List<Account23> exstgAcctId;
    @XmlElement(name = "AcctId")
    protected String acctId;
    @XmlElement(name = "AcctSts")
    protected AccountStatus2 acctSts;
    @XmlElement(name = "BlckdSts")
    protected BlockedStatusReason2Choice blckdSts;
    @XmlElement(name = "FATCARptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fatcaRptgDt;
    @XmlElement(name = "CRSRptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar crsRptgDt;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link Status25Choice }
     *     
     */
    public Status25Choice getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status25Choice }
     *     
     */
    public void setSts(Status25Choice value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcceptedStatusReason1Choice }
     * 
     * 
     * @return
     *     The value of the stsRsn property.
     */
    public List<AcceptedStatusReason1Choice> getStsRsn() {
        if (stsRsn == null) {
            stsRsn = new ArrayList<>();
        }
        return this.stsRsn;
    }

    /**
     * Gets the value of the acctApplId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctApplId() {
        return acctApplId;
    }

    /**
     * Sets the value of the acctApplId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctApplId(String value) {
        this.acctApplId = value;
    }

    /**
     * Gets the value of the exstgAcctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exstgAcctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExstgAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account23 }
     * 
     * 
     * @return
     *     The value of the exstgAcctId property.
     */
    public List<Account23> getExstgAcctId() {
        if (exstgAcctId == null) {
            exstgAcctId = new ArrayList<>();
        }
        return this.exstgAcctId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctId() {
        return acctId;
    }

    /**
     * Sets the value of the acctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctId(String value) {
        this.acctId = value;
    }

    /**
     * Gets the value of the acctSts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus2 }
     *     
     */
    public AccountStatus2 getAcctSts() {
        return acctSts;
    }

    /**
     * Sets the value of the acctSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus2 }
     *     
     */
    public void setAcctSts(AccountStatus2 value) {
        this.acctSts = value;
    }

    /**
     * Gets the value of the blckdSts property.
     * 
     * @return
     *     possible object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public BlockedStatusReason2Choice getBlckdSts() {
        return blckdSts;
    }

    /**
     * Sets the value of the blckdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockedStatusReason2Choice }
     *     
     */
    public void setBlckdSts(BlockedStatusReason2Choice value) {
        this.blckdSts = value;
    }

    /**
     * Gets the value of the fatcaRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFATCARptgDt() {
        return fatcaRptgDt;
    }

    /**
     * Sets the value of the fatcaRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFATCARptgDt(XMLGregorianCalendar value) {
        this.fatcaRptgDt = value;
    }

    /**
     * Gets the value of the crsRptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCRSRptgDt() {
        return crsRptgDt;
    }

    /**
     * Sets the value of the crsRptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCRSRptgDt(XMLGregorianCalendar value) {
        this.crsRptgDt = value;
    }

}
