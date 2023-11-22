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

package org.jpos.iso20022.camt_086_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingStatement4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingStatement4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StmtId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text"/>
 *         <element name="FrToDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DatePeriod1"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODateTime"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingStatementStatus1Code"/>
 *         <element name="AcctChrtcs" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}CashAccountCharacteristics4"/>
 *         <element name="RateData" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingRate1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CcyXchg" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}CurrencyExchange6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingBalance1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Compstn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingCompensation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Svc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingService2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxRgn" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingTaxRegion2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="BalAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BalanceAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcAdjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceAdjustment1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingStatement4", propOrder = {
    "stmtId",
    "frToDt",
    "creDtTm",
    "sts",
    "acctChrtcs",
    "rateData",
    "ccyXchg",
    "bal",
    "compstn",
    "svc",
    "taxRgn",
    "balAdjstmnt",
    "svcAdjstmnt"
})
public class BillingStatement4 {

    @XmlElement(name = "StmtId", required = true)
    protected String stmtId;
    @XmlElement(name = "FrToDt", required = true)
    protected DatePeriod1 frToDt;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected BillingStatementStatus1Code sts;
    @XmlElement(name = "AcctChrtcs", required = true)
    protected CashAccountCharacteristics4 acctChrtcs;
    @XmlElement(name = "RateData")
    protected List<BillingRate1> rateData;
    @XmlElement(name = "CcyXchg")
    protected List<CurrencyExchange6> ccyXchg;
    @XmlElement(name = "Bal")
    protected List<BillingBalance1> bal;
    @XmlElement(name = "Compstn")
    protected List<BillingCompensation1> compstn;
    @XmlElement(name = "Svc")
    protected List<BillingService2> svc;
    @XmlElement(name = "TaxRgn")
    protected List<BillingTaxRegion2> taxRgn;
    @XmlElement(name = "BalAdjstmnt")
    protected List<BalanceAdjustment1> balAdjstmnt;
    @XmlElement(name = "SvcAdjstmnt")
    protected List<BillingServiceAdjustment1> svcAdjstmnt;

    /**
     * Gets the value of the stmtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStmtId() {
        return stmtId;
    }

    /**
     * Sets the value of the stmtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStmtId(String value) {
        this.stmtId = value;
    }

    /**
     * Gets the value of the frToDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod1 }
     *     
     */
    public DatePeriod1 getFrToDt() {
        return frToDt;
    }

    /**
     * Sets the value of the frToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod1 }
     *     
     */
    public void setFrToDt(DatePeriod1 value) {
        this.frToDt = value;
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
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BillingStatementStatus1Code }
     *     
     */
    public BillingStatementStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingStatementStatus1Code }
     *     
     */
    public void setSts(BillingStatementStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the acctChrtcs property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountCharacteristics4 }
     *     
     */
    public CashAccountCharacteristics4 getAcctChrtcs() {
        return acctChrtcs;
    }

    /**
     * Sets the value of the acctChrtcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountCharacteristics4 }
     *     
     */
    public void setAcctChrtcs(CashAccountCharacteristics4 value) {
        this.acctChrtcs = value;
    }

    /**
     * Gets the value of the rateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingRate1 }
     * 
     * 
     * @return
     *     The value of the rateData property.
     */
    public List<BillingRate1> getRateData() {
        if (rateData == null) {
            rateData = new ArrayList<>();
        }
        return this.rateData;
    }

    /**
     * Gets the value of the ccyXchg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyXchg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyXchg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyExchange6 }
     * 
     * 
     * @return
     *     The value of the ccyXchg property.
     */
    public List<CurrencyExchange6> getCcyXchg() {
        if (ccyXchg == null) {
            ccyXchg = new ArrayList<>();
        }
        return this.ccyXchg;
    }

    /**
     * Gets the value of the bal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingBalance1 }
     * 
     * 
     * @return
     *     The value of the bal property.
     */
    public List<BillingBalance1> getBal() {
        if (bal == null) {
            bal = new ArrayList<>();
        }
        return this.bal;
    }

    /**
     * Gets the value of the compstn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the compstn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompstn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingCompensation1 }
     * 
     * 
     * @return
     *     The value of the compstn property.
     */
    public List<BillingCompensation1> getCompstn() {
        if (compstn == null) {
            compstn = new ArrayList<>();
        }
        return this.compstn;
    }

    /**
     * Gets the value of the svc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingService2 }
     * 
     * 
     * @return
     *     The value of the svc property.
     */
    public List<BillingService2> getSvc() {
        if (svc == null) {
            svc = new ArrayList<>();
        }
        return this.svc;
    }

    /**
     * Gets the value of the taxRgn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRgn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRgn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingTaxRegion2 }
     * 
     * 
     * @return
     *     The value of the taxRgn property.
     */
    public List<BillingTaxRegion2> getTaxRgn() {
        if (taxRgn == null) {
            taxRgn = new ArrayList<>();
        }
        return this.taxRgn;
    }

    /**
     * Gets the value of the balAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the balAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BalanceAdjustment1 }
     * 
     * 
     * @return
     *     The value of the balAdjstmnt property.
     */
    public List<BalanceAdjustment1> getBalAdjstmnt() {
        if (balAdjstmnt == null) {
            balAdjstmnt = new ArrayList<>();
        }
        return this.balAdjstmnt;
    }

    /**
     * Gets the value of the svcAdjstmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcAdjstmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcAdjstmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillingServiceAdjustment1 }
     * 
     * 
     * @return
     *     The value of the svcAdjstmnt property.
     */
    public List<BillingServiceAdjustment1> getSvcAdjstmnt() {
        if (svcAdjstmnt == null) {
            svcAdjstmnt = new ArrayList<>();
        }
        return this.svcAdjstmnt;
    }

}
