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

package org.jpos.iso20022.acmt_007_001_04;

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
 * <p>Java class for CustomerAccount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerAccount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}Max70Text" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}AccountStatus3Code" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}CashAccountType2Choice" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ActiveCurrencyCode"/>
 *         <element name="MnthlyPmtVal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MnthlyRcvdVal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MnthlyTxNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}Max5NumericText" minOccurs="0"/>
 *         <element name="AvrgBal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AcctPurp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}Max140Text" minOccurs="0"/>
 *         <element name="FlrNtfctnAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ClngNtfctnAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StmtFrqcyAndFrmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}StatementFrequencyAndForm1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}ISODate" minOccurs="0"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.007.001.04}Restriction1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccount4", propOrder = {
    "id",
    "nm",
    "sts",
    "tp",
    "ccy",
    "mnthlyPmtVal",
    "mnthlyRcvdVal",
    "mnthlyTxNb",
    "avrgBal",
    "acctPurp",
    "flrNtfctnAmt",
    "clngNtfctnAmt",
    "stmtFrqcyAndFrmt",
    "clsgDt",
    "rstrctn"
})
public class CustomerAccount4 {

    @XmlElement(name = "Id")
    protected AccountIdentification4Choice id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected AccountStatus3Code sts;
    @XmlElement(name = "Tp")
    protected CashAccountType2Choice tp;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "MnthlyPmtVal")
    protected BigDecimal mnthlyPmtVal;
    @XmlElement(name = "MnthlyRcvdVal")
    protected BigDecimal mnthlyRcvdVal;
    @XmlElement(name = "MnthlyTxNb")
    protected String mnthlyTxNb;
    @XmlElement(name = "AvrgBal")
    protected BigDecimal avrgBal;
    @XmlElement(name = "AcctPurp")
    protected String acctPurp;
    @XmlElement(name = "FlrNtfctnAmt")
    protected BigDecimal flrNtfctnAmt;
    @XmlElement(name = "ClngNtfctnAmt")
    protected BigDecimal clngNtfctnAmt;
    @XmlElement(name = "StmtFrqcyAndFrmt")
    protected List<StatementFrequencyAndForm1> stmtFrqcyAndFrmt;
    @XmlElement(name = "ClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "Rstrctn")
    protected List<Restriction1> rstrctn;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setId(AccountIdentification4Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatus3Code }
     *     
     */
    public AccountStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatus3Code }
     *     
     */
    public void setSts(AccountStatus3Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public CashAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountType2Choice }
     *     
     */
    public void setTp(CashAccountType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the mnthlyPmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthlyPmtVal() {
        return mnthlyPmtVal;
    }

    /**
     * Sets the value of the mnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMnthlyPmtVal(BigDecimal value) {
        this.mnthlyPmtVal = value;
    }

    /**
     * Gets the value of the mnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMnthlyRcvdVal() {
        return mnthlyRcvdVal;
    }

    /**
     * Sets the value of the mnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMnthlyRcvdVal(BigDecimal value) {
        this.mnthlyRcvdVal = value;
    }

    /**
     * Gets the value of the mnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMnthlyTxNb() {
        return mnthlyTxNb;
    }

    /**
     * Sets the value of the mnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMnthlyTxNb(String value) {
        this.mnthlyTxNb = value;
    }

    /**
     * Gets the value of the avrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvrgBal() {
        return avrgBal;
    }

    /**
     * Sets the value of the avrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvrgBal(BigDecimal value) {
        this.avrgBal = value;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctPurp(String value) {
        this.acctPurp = value;
    }

    /**
     * Gets the value of the flrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFlrNtfctnAmt() {
        return flrNtfctnAmt;
    }

    /**
     * Sets the value of the flrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFlrNtfctnAmt(BigDecimal value) {
        this.flrNtfctnAmt = value;
    }

    /**
     * Gets the value of the clngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClngNtfctnAmt() {
        return clngNtfctnAmt;
    }

    /**
     * Sets the value of the clngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClngNtfctnAmt(BigDecimal value) {
        this.clngNtfctnAmt = value;
    }

    /**
     * Gets the value of the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stmtFrqcyAndFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStmtFrqcyAndFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatementFrequencyAndForm1 }
     * 
     * 
     * @return
     *     The value of the stmtFrqcyAndFrmt property.
     */
    public List<StatementFrequencyAndForm1> getStmtFrqcyAndFrmt() {
        if (stmtFrqcyAndFrmt == null) {
            stmtFrqcyAndFrmt = new ArrayList<>();
        }
        return this.stmtFrqcyAndFrmt;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsgDt(XMLGregorianCalendar value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the rstrctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rstrctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRstrctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Restriction1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<Restriction1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

}
