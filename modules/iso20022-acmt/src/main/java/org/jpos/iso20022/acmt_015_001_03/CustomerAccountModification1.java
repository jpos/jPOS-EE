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

package org.jpos.iso20022.acmt_015_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAccountModification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CustomerAccountModification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AccountIdentification4Choice" maxOccurs="unbounded"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}NameModification1" minOccurs="0"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AccountStatusModification1" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}TypeModification1" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}ActiveCurrencyCode"/>
 *         <element name="MnthlyPmtVal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AmountModification1" minOccurs="0"/>
 *         <element name="MnthlyRcvdVal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AmountModification1" minOccurs="0"/>
 *         <element name="MnthlyTxNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}NumberModification1" minOccurs="0"/>
 *         <element name="AvrgBal" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AmountModification1" minOccurs="0"/>
 *         <element name="AcctPurp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}PurposeModification1" minOccurs="0"/>
 *         <element name="FlrNtfctnAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AmountModification1" minOccurs="0"/>
 *         <element name="ClngNtfctnAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}AmountModification1" minOccurs="0"/>
 *         <element name="StmtFrqcyAndFrmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}StatementFrequencyAndFormModification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}DateModification1" minOccurs="0"/>
 *         <element name="Rstrctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.015.001.03}RestrictionModification1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAccountModification1", propOrder = {
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
public class CustomerAccountModification1 {

    @XmlElement(name = "Id", required = true)
    protected List<AccountIdentification4Choice> id;
    @XmlElement(name = "Nm")
    protected NameModification1 nm;
    @XmlElement(name = "Sts")
    protected AccountStatusModification1 sts;
    @XmlElement(name = "Tp")
    protected TypeModification1 tp;
    @XmlElement(name = "Ccy", required = true)
    protected String ccy;
    @XmlElement(name = "MnthlyPmtVal")
    protected AmountModification1 mnthlyPmtVal;
    @XmlElement(name = "MnthlyRcvdVal")
    protected AmountModification1 mnthlyRcvdVal;
    @XmlElement(name = "MnthlyTxNb")
    protected NumberModification1 mnthlyTxNb;
    @XmlElement(name = "AvrgBal")
    protected AmountModification1 avrgBal;
    @XmlElement(name = "AcctPurp")
    protected PurposeModification1 acctPurp;
    @XmlElement(name = "FlrNtfctnAmt")
    protected AmountModification1 flrNtfctnAmt;
    @XmlElement(name = "ClngNtfctnAmt")
    protected AmountModification1 clngNtfctnAmt;
    @XmlElement(name = "StmtFrqcyAndFrmt")
    protected List<StatementFrequencyAndFormModification1> stmtFrqcyAndFrmt;
    @XmlElement(name = "ClsgDt")
    protected DateModification1 clsgDt;
    @XmlElement(name = "Rstrctn")
    protected List<RestrictionModification1> rstrctn;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification4Choice }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<AccountIdentification4Choice> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link NameModification1 }
     *     
     */
    public NameModification1 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameModification1 }
     *     
     */
    public void setNm(NameModification1 value) {
        this.nm = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusModification1 }
     *     
     */
    public AccountStatusModification1 getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusModification1 }
     *     
     */
    public void setSts(AccountStatusModification1 value) {
        this.sts = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeModification1 }
     *     
     */
    public TypeModification1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeModification1 }
     *     
     */
    public void setTp(TypeModification1 value) {
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
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getMnthlyPmtVal() {
        return mnthlyPmtVal;
    }

    /**
     * Sets the value of the mnthlyPmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public void setMnthlyPmtVal(AmountModification1 value) {
        this.mnthlyPmtVal = value;
    }

    /**
     * Gets the value of the mnthlyRcvdVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getMnthlyRcvdVal() {
        return mnthlyRcvdVal;
    }

    /**
     * Sets the value of the mnthlyRcvdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public void setMnthlyRcvdVal(AmountModification1 value) {
        this.mnthlyRcvdVal = value;
    }

    /**
     * Gets the value of the mnthlyTxNb property.
     * 
     * @return
     *     possible object is
     *     {@link NumberModification1 }
     *     
     */
    public NumberModification1 getMnthlyTxNb() {
        return mnthlyTxNb;
    }

    /**
     * Sets the value of the mnthlyTxNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberModification1 }
     *     
     */
    public void setMnthlyTxNb(NumberModification1 value) {
        this.mnthlyTxNb = value;
    }

    /**
     * Gets the value of the avrgBal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getAvrgBal() {
        return avrgBal;
    }

    /**
     * Sets the value of the avrgBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public void setAvrgBal(AmountModification1 value) {
        this.avrgBal = value;
    }

    /**
     * Gets the value of the acctPurp property.
     * 
     * @return
     *     possible object is
     *     {@link PurposeModification1 }
     *     
     */
    public PurposeModification1 getAcctPurp() {
        return acctPurp;
    }

    /**
     * Sets the value of the acctPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurposeModification1 }
     *     
     */
    public void setAcctPurp(PurposeModification1 value) {
        this.acctPurp = value;
    }

    /**
     * Gets the value of the flrNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getFlrNtfctnAmt() {
        return flrNtfctnAmt;
    }

    /**
     * Sets the value of the flrNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public void setFlrNtfctnAmt(AmountModification1 value) {
        this.flrNtfctnAmt = value;
    }

    /**
     * Gets the value of the clngNtfctnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountModification1 }
     *     
     */
    public AmountModification1 getClngNtfctnAmt() {
        return clngNtfctnAmt;
    }

    /**
     * Sets the value of the clngNtfctnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountModification1 }
     *     
     */
    public void setClngNtfctnAmt(AmountModification1 value) {
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
     * {@link StatementFrequencyAndFormModification1 }
     * 
     * 
     * @return
     *     The value of the stmtFrqcyAndFrmt property.
     */
    public List<StatementFrequencyAndFormModification1> getStmtFrqcyAndFrmt() {
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
     *     {@link DateModification1 }
     *     
     */
    public DateModification1 getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateModification1 }
     *     
     */
    public void setClsgDt(DateModification1 value) {
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
     * {@link RestrictionModification1 }
     * 
     * 
     * @return
     *     The value of the rstrctn property.
     */
    public List<RestrictionModification1> getRstrctn() {
        if (rstrctn == null) {
            rstrctn = new ArrayList<>();
        }
        return this.rstrctn;
    }

}
