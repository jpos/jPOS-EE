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

package org.jpos.iso20022.camt_054_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TotalsPerBankTransactionCode5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TotalsPerBankTransactionCode5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}Max15NumericText" minOccurs="0"/>
 *         <element name="Sum" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlNetNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}AmountAndDirection35" minOccurs="0"/>
 *         <element name="CdtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         <element name="DbtNtries" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}NumberAndSumOfTransactions1" minOccurs="0"/>
 *         <element name="FcstInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}BankTransactionCodeStructure4"/>
 *         <element name="Avlbty" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}CashAvailability1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:camt.054.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalsPerBankTransactionCode5", propOrder = {
    "nbOfNtries",
    "sum",
    "ttlNetNtry",
    "cdtNtries",
    "dbtNtries",
    "fcstInd",
    "bkTxCd",
    "avlbty",
    "dt"
})
public class TotalsPerBankTransactionCode5 {

    @XmlElement(name = "NbOfNtries")
    protected String nbOfNtries;
    @XmlElement(name = "Sum")
    protected BigDecimal sum;
    @XmlElement(name = "TtlNetNtry")
    protected AmountAndDirection35 ttlNetNtry;
    @XmlElement(name = "CdtNtries")
    protected NumberAndSumOfTransactions1 cdtNtries;
    @XmlElement(name = "DbtNtries")
    protected NumberAndSumOfTransactions1 dbtNtries;
    @XmlElement(name = "FcstInd")
    protected Boolean fcstInd;
    @XmlElement(name = "BkTxCd", required = true)
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "Avlbty")
    protected List<CashAvailability1> avlbty;
    @XmlElement(name = "Dt")
    protected DateAndDateTime2Choice dt;

    /**
     * Gets the value of the nbOfNtries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfNtries() {
        return nbOfNtries;
    }

    /**
     * Sets the value of the nbOfNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfNtries(String value) {
        this.nbOfNtries = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSum(BigDecimal value) {
        this.sum = value;
    }

    /**
     * Gets the value of the ttlNetNtry property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection35 }
     *     
     */
    public AmountAndDirection35 getTtlNetNtry() {
        return ttlNetNtry;
    }

    /**
     * Sets the value of the ttlNetNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection35 }
     *     
     */
    public void setTtlNetNtry(AmountAndDirection35 value) {
        this.ttlNetNtry = value;
    }

    /**
     * Gets the value of the cdtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getCdtNtries() {
        return cdtNtries;
    }

    /**
     * Sets the value of the cdtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setCdtNtries(NumberAndSumOfTransactions1 value) {
        this.cdtNtries = value;
    }

    /**
     * Gets the value of the dbtNtries property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public NumberAndSumOfTransactions1 getDbtNtries() {
        return dbtNtries;
    }

    /**
     * Sets the value of the dbtNtries property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions1 }
     *     
     */
    public void setDbtNtries(NumberAndSumOfTransactions1 value) {
        this.dbtNtries = value;
    }

    /**
     * Gets the value of the fcstInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFcstInd() {
        return fcstInd;
    }

    /**
     * Sets the value of the fcstInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFcstInd(Boolean value) {
        this.fcstInd = value;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the avlbty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the avlbty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvlbty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAvailability1 }
     * 
     * 
     * @return
     *     The value of the avlbty property.
     */
    public List<CashAvailability1> getAvlbty() {
        if (avlbty == null) {
            avlbty = new ArrayList<>();
        }
        return this.avlbty;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDt(DateAndDateTime2Choice value) {
        this.dt = value;
    }

}
