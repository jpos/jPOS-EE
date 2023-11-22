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

package org.jpos.iso20022.caaa_003_001_12;

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
 * <p>Java class for CardPaymentTransactionDetails52 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentTransactionDetails52">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount"/>
 *         <element name="CmltvAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AmtQlfr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}TypeOfAmount8Code" minOccurs="0"/>
 *         <element name="DtldAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}DetailedAmount15" minOccurs="0"/>
 *         <element name="ReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AuthrsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VldtyDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ISODate" minOccurs="0"/>
 *         <element name="OnLineRsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}OnLineReason2Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UattnddLvlCtgy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max35NumericText" minOccurs="0"/>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}CardAccountType3Code" minOccurs="0"/>
 *         <element name="CcyConvsRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}CurrencyConversion27" minOccurs="0"/>
 *         <element name="Instlmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}RecurringTransaction5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AggtnTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}AggregationTransaction3" minOccurs="0"/>
 *         <element name="PdctCdSetId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max10Text" minOccurs="0"/>
 *         <element name="SaleItm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Product6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DlvryLctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="ReSubmissnCntr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}PositiveNumber" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ExternallyDefinedData4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransactionDetails52", propOrder = {
    "ccy",
    "ttlAmt",
    "cmltvAmt",
    "amtQlfr",
    "dtldAmt",
    "reqdAmt",
    "authrsdAmt",
    "invcAmt",
    "vldtyDt",
    "onLineRsn",
    "uattnddLvlCtgy",
    "acctTp",
    "ccyConvsRslt",
    "instlmt",
    "aggtnTx",
    "pdctCdSetId",
    "saleItm",
    "dlvryLctn",
    "reSubmissnCntr",
    "addtlInf",
    "iccRltdData"
})
public class CardPaymentTransactionDetails52 {

    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TtlAmt", required = true)
    protected BigDecimal ttlAmt;
    @XmlElement(name = "CmltvAmt")
    protected BigDecimal cmltvAmt;
    @XmlElement(name = "AmtQlfr")
    @XmlSchemaType(name = "string")
    protected TypeOfAmount8Code amtQlfr;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;
    @XmlElement(name = "ReqdAmt")
    protected BigDecimal reqdAmt;
    @XmlElement(name = "AuthrsdAmt")
    protected BigDecimal authrsdAmt;
    @XmlElement(name = "InvcAmt")
    protected BigDecimal invcAmt;
    @XmlElement(name = "VldtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldtyDt;
    @XmlElement(name = "OnLineRsn")
    @XmlSchemaType(name = "string")
    protected List<OnLineReason2Code> onLineRsn;
    @XmlElement(name = "UattnddLvlCtgy")
    protected String uattnddLvlCtgy;
    @XmlElement(name = "AcctTp")
    @XmlSchemaType(name = "string")
    protected CardAccountType3Code acctTp;
    @XmlElement(name = "CcyConvsRslt")
    protected CurrencyConversion27 ccyConvsRslt;
    @XmlElement(name = "Instlmt")
    protected List<RecurringTransaction5> instlmt;
    @XmlElement(name = "AggtnTx")
    protected AggregationTransaction3 aggtnTx;
    @XmlElement(name = "PdctCdSetId")
    protected String pdctCdSetId;
    @XmlElement(name = "SaleItm")
    protected List<Product6> saleItm;
    @XmlElement(name = "DlvryLctn")
    protected String dlvryLctn;
    @XmlElement(name = "ReSubmissnCntr")
    protected BigDecimal reSubmissnCntr;
    @XmlElement(name = "AddtlInf")
    protected List<ExternallyDefinedData4> addtlInf;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;

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
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlAmt(BigDecimal value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the cmltvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvAmt() {
        return cmltvAmt;
    }

    /**
     * Sets the value of the cmltvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
    }

    /**
     * Gets the value of the amtQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public TypeOfAmount8Code getAmtQlfr() {
        return amtQlfr;
    }

    /**
     * Sets the value of the amtQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount8Code }
     *     
     */
    public void setAmtQlfr(TypeOfAmount8Code value) {
        this.amtQlfr = value;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount15 }
     *     
     */
    public DetailedAmount15 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount15 }
     *     
     */
    public void setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReqdAmt(BigDecimal value) {
        this.reqdAmt = value;
    }

    /**
     * Gets the value of the authrsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAuthrsdAmt() {
        return authrsdAmt;
    }

    /**
     * Sets the value of the authrsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAuthrsdAmt(BigDecimal value) {
        this.authrsdAmt = value;
    }

    /**
     * Gets the value of the invcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvcAmt() {
        return invcAmt;
    }

    /**
     * Sets the value of the invcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvcAmt(BigDecimal value) {
        this.invcAmt = value;
    }

    /**
     * Gets the value of the vldtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldtyDt() {
        return vldtyDt;
    }

    /**
     * Sets the value of the vldtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldtyDt(XMLGregorianCalendar value) {
        this.vldtyDt = value;
    }

    /**
     * Gets the value of the onLineRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the onLineRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnLineRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OnLineReason2Code }
     * 
     * 
     * @return
     *     The value of the onLineRsn property.
     */
    public List<OnLineReason2Code> getOnLineRsn() {
        if (onLineRsn == null) {
            onLineRsn = new ArrayList<>();
        }
        return this.onLineRsn;
    }

    /**
     * Gets the value of the uattnddLvlCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUattnddLvlCtgy() {
        return uattnddLvlCtgy;
    }

    /**
     * Sets the value of the uattnddLvlCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUattnddLvlCtgy(String value) {
        this.uattnddLvlCtgy = value;
    }

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardAccountType3Code }
     *     
     */
    public CardAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAccountType3Code }
     *     
     */
    public void setAcctTp(CardAccountType3Code value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the ccyConvsRslt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion27 }
     *     
     */
    public CurrencyConversion27 getCcyConvsRslt() {
        return ccyConvsRslt;
    }

    /**
     * Sets the value of the ccyConvsRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion27 }
     *     
     */
    public void setCcyConvsRslt(CurrencyConversion27 value) {
        this.ccyConvsRslt = value;
    }

    /**
     * Gets the value of the instlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringTransaction5 }
     * 
     * 
     * @return
     *     The value of the instlmt property.
     */
    public List<RecurringTransaction5> getInstlmt() {
        if (instlmt == null) {
            instlmt = new ArrayList<>();
        }
        return this.instlmt;
    }

    /**
     * Gets the value of the aggtnTx property.
     * 
     * @return
     *     possible object is
     *     {@link AggregationTransaction3 }
     *     
     */
    public AggregationTransaction3 getAggtnTx() {
        return aggtnTx;
    }

    /**
     * Sets the value of the aggtnTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregationTransaction3 }
     *     
     */
    public void setAggtnTx(AggregationTransaction3 value) {
        this.aggtnTx = value;
    }

    /**
     * Gets the value of the pdctCdSetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctCdSetId() {
        return pdctCdSetId;
    }

    /**
     * Sets the value of the pdctCdSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctCdSetId(String value) {
        this.pdctCdSetId = value;
    }

    /**
     * Gets the value of the saleItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the saleItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product6 }
     * 
     * 
     * @return
     *     The value of the saleItm property.
     */
    public List<Product6> getSaleItm() {
        if (saleItm == null) {
            saleItm = new ArrayList<>();
        }
        return this.saleItm;
    }

    /**
     * Gets the value of the dlvryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryLctn() {
        return dlvryLctn;
    }

    /**
     * Sets the value of the dlvryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryLctn(String value) {
        this.dlvryLctn = value;
    }

    /**
     * Gets the value of the reSubmissnCntr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReSubmissnCntr() {
        return reSubmissnCntr;
    }

    /**
     * Sets the value of the reSubmissnCntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReSubmissnCntr(BigDecimal value) {
        this.reSubmissnCntr = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternallyDefinedData4 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<ExternallyDefinedData4> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

}
