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

package org.jpos.iso20022.camt_057_001_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountNotification18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountNotification18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}Max35Text"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}CashAccount40" minOccurs="0"/>
 *         <element name="AcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}Party40Choice" minOccurs="0"/>
 *         <element name="AcctSvcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="RltdAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}CashAccount40" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpctdValDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}ISODate" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}Party40Choice" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="IntrmyAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="Itm" type="{urn:iso:std:iso:20022:tech:xsd:camt.057.001.07}NotificationItem8" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountNotification18", propOrder = {
    "id",
    "acct",
    "acctOwnr",
    "acctSvcr",
    "rltdAcct",
    "ttlAmt",
    "xpctdValDt",
    "dbtr",
    "dbtrAgt",
    "intrmyAgt",
    "itm"
})
public class AccountNotification18 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Acct")
    protected CashAccount40 acct;
    @XmlElement(name = "AcctOwnr")
    protected Party40Choice acctOwnr;
    @XmlElement(name = "AcctSvcr")
    protected BranchAndFinancialInstitutionIdentification6 acctSvcr;
    @XmlElement(name = "RltdAcct")
    protected CashAccount40 rltdAcct;
    @XmlElement(name = "TtlAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlAmt;
    @XmlElement(name = "XpctdValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdValDt;
    @XmlElement(name = "Dbtr")
    protected Party40Choice dbtr;
    @XmlElement(name = "DbtrAgt")
    protected BranchAndFinancialInstitutionIdentification6 dbtrAgt;
    @XmlElement(name = "IntrmyAgt")
    protected BranchAndFinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "Itm", required = true)
    protected List<NotificationItem8> itm;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setAcct(CashAccount40 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the acctOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getAcctOwnr() {
        return acctOwnr;
    }

    /**
     * Sets the value of the acctOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setAcctOwnr(Party40Choice value) {
        this.acctOwnr = value;
    }

    /**
     * Gets the value of the acctSvcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getAcctSvcr() {
        return acctSvcr;
    }

    /**
     * Sets the value of the acctSvcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setAcctSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.acctSvcr = value;
    }

    /**
     * Gets the value of the rltdAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getRltdAcct() {
        return rltdAcct;
    }

    /**
     * Sets the value of the rltdAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setRltdAcct(CashAccount40 value) {
        this.rltdAcct = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the xpctdValDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdValDt() {
        return xpctdValDt;
    }

    /**
     * Sets the value of the xpctdValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdValDt(XMLGregorianCalendar value) {
        this.xpctdValDt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setDbtr(Party40Choice value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
    }

    /**
     * Gets the value of the itm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the itm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationItem8 }
     * 
     * 
     * @return
     *     The value of the itm property.
     */
    public List<NotificationItem8> getItm() {
        if (itm == null) {
            itm = new ArrayList<>();
        }
        return this.itm;
    }

}
