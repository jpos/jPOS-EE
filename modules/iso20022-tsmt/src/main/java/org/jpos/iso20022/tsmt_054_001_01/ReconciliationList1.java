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

package org.jpos.iso20022.tsmt_054_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationList1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}ISODate"/>
 *         <element name="RltdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rcpt" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="Advsr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="Params" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}FinancialItemParameters1"/>
 *         <element name="PmtRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PaymentIdentification1"/>
 *         <element name="PmtMeans" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PaymentMeans1"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}ISODate"/>
 *         <element name="PmtTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}PaymentTerms6"/>
 *         <element name="PmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}CurrencyAndAmount"/>
 *         <element name="Itm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}FinancialItem1" maxOccurs="unbounded"/>
 *         <element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Max15NumericText"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="AssoctdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationList1", propOrder = {
    "dt",
    "rltdDoc",
    "rcpt",
    "advsr",
    "params",
    "pmtRef",
    "pmtMeans",
    "pmtDt",
    "pmtTerms",
    "pmtAmt",
    "itm",
    "itmCnt",
    "ctrlSum",
    "assoctdDoc",
    "addtlInf",
    "vldtnStsInf"
})
public class ReconciliationList1 {

    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "Rcpt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object rcpt;
    @XmlElement(name = "Advsr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object advsr;
    @XmlElement(name = "Params", required = true)
    protected FinancialItemParameters1 params;
    @XmlElement(name = "PmtRef", required = true)
    protected PaymentIdentification1 pmtRef;
    @XmlElement(name = "PmtMeans", required = true)
    protected PaymentMeans1 pmtMeans;
    @XmlElement(name = "PmtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDt;
    @XmlElement(name = "PmtTerms", required = true)
    protected PaymentTerms6 pmtTerms;
    @XmlElement(name = "PmtAmt", required = true)
    protected CurrencyAndAmount pmtAmt;
    @XmlElement(name = "Itm", required = true)
    protected List<FinancialItem1> itm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElementRef(name = "AssoctdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> assoctdDoc;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the rltdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the rltdDoc property.
     */
    public List<JAXBElement<Object>> getRltdDoc() {
        if (rltdDoc == null) {
            rltdDoc = new ArrayList<>();
        }
        return this.rltdDoc;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRcpt(Object value) {
        this.rcpt = value;
    }

    /**
     * Gets the value of the advsr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAdvsr() {
        return advsr;
    }

    /**
     * Sets the value of the advsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAdvsr(Object value) {
        this.advsr = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public FinancialItemParameters1 getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialItemParameters1 }
     *     
     */
    public void setParams(FinancialItemParameters1 value) {
        this.params = value;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public PaymentIdentification1 getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification1 }
     *     
     */
    public void setPmtRef(PaymentIdentification1 value) {
        this.pmtRef = value;
    }

    /**
     * Gets the value of the pmtMeans property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMeans1 }
     *     
     */
    public PaymentMeans1 getPmtMeans() {
        return pmtMeans;
    }

    /**
     * Sets the value of the pmtMeans property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMeans1 }
     *     
     */
    public void setPmtMeans(PaymentMeans1 value) {
        this.pmtMeans = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the pmtTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms6 }
     *     
     */
    public PaymentTerms6 getPmtTerms() {
        return pmtTerms;
    }

    /**
     * Sets the value of the pmtTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms6 }
     *     
     */
    public void setPmtTerms(PaymentTerms6 value) {
        this.pmtTerms = value;
    }

    /**
     * Gets the value of the pmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getPmtAmt() {
        return pmtAmt;
    }

    /**
     * Sets the value of the pmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setPmtAmt(CurrencyAndAmount value) {
        this.pmtAmt = value;
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
     * {@link FinancialItem1 }
     * 
     * 
     * @return
     *     The value of the itm property.
     */
    public List<FinancialItem1> getItm() {
        if (itm == null) {
            itm = new ArrayList<>();
        }
        return this.itm;
    }

    /**
     * Gets the value of the itmCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Sets the value of the itmCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmCnt(String value) {
        this.itmCnt = value;
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
     * Gets the value of the assoctdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the assoctdDoc property.
     */
    public List<JAXBElement<Object>> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the vldtnStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Sets the value of the vldtnStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
    }

}
