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

package org.jpos.iso20022.tsin_009_001_01;

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
 * <p>Java class for FinancingAgreementList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingAgreementList1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}Max35Text"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}ISODate"/>
 *         <element name="RltdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AgrmtRqstr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="AgrmtRspndr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="GrntApplcnt" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="GrntNbfcry" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="GrntIssr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="NtfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}FinancingNotificationParties1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Itm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}FinancingAgreementItem1" maxOccurs="unbounded"/>
 *         <element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}Max15NumericText"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingAgreementList1", propOrder = {
    "idr",
    "dt",
    "rltdDoc",
    "agrmtRqstr",
    "agrmtRspndr",
    "grntApplcnt",
    "grntNbfcry",
    "grntIssr",
    "ntfctnInf",
    "itm",
    "itmCnt",
    "ctrlSum",
    "addtlInf",
    "vldtnStsInf"
})
public class FinancingAgreementList1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AgrmtRqstr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agrmtRqstr;
    @XmlElement(name = "AgrmtRspndr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object agrmtRspndr;
    @XmlElement(name = "GrntApplcnt", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntApplcnt;
    @XmlElement(name = "GrntNbfcry", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntNbfcry;
    @XmlElement(name = "GrntIssr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object grntIssr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1> ntfctnInf;
    @XmlElement(name = "Itm", required = true)
    protected List<FinancingAgreementItem1> itm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;

    /**
     * Gets the value of the idr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdr() {
        return idr;
    }

    /**
     * Sets the value of the idr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdr(String value) {
        this.idr = value;
    }

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
     * Gets the value of the agrmtRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgrmtRqstr() {
        return agrmtRqstr;
    }

    /**
     * Sets the value of the agrmtRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAgrmtRqstr(Object value) {
        this.agrmtRqstr = value;
    }

    /**
     * Gets the value of the agrmtRspndr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAgrmtRspndr() {
        return agrmtRspndr;
    }

    /**
     * Sets the value of the agrmtRspndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAgrmtRspndr(Object value) {
        this.agrmtRspndr = value;
    }

    /**
     * Gets the value of the grntApplcnt property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntApplcnt() {
        return grntApplcnt;
    }

    /**
     * Sets the value of the grntApplcnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGrntApplcnt(Object value) {
        this.grntApplcnt = value;
    }

    /**
     * Gets the value of the grntNbfcry property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntNbfcry() {
        return grntNbfcry;
    }

    /**
     * Sets the value of the grntNbfcry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGrntNbfcry(Object value) {
        this.grntNbfcry = value;
    }

    /**
     * Gets the value of the grntIssr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getGrntIssr() {
        return grntIssr;
    }

    /**
     * Sets the value of the grntIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setGrntIssr(Object value) {
        this.grntIssr = value;
    }

    /**
     * Gets the value of the ntfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingNotificationParties1 }
     * 
     * 
     * @return
     *     The value of the ntfctnInf property.
     */
    public List<FinancingNotificationParties1> getNtfctnInf() {
        if (ntfctnInf == null) {
            ntfctnInf = new ArrayList<>();
        }
        return this.ntfctnInf;
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
     * {@link FinancingAgreementItem1 }
     * 
     * 
     * @return
     *     The value of the itm property.
     */
    public List<FinancingAgreementItem1> getItm() {
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
