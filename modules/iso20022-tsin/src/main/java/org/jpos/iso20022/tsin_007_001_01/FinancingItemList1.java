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

package org.jpos.iso20022.tsin_007_001_01;

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
 * <p>Java class for FinancingItemList1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingItemList1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Idr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}Max35Text"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}ISODate"/>
 *         <element name="RltdDoc" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AmtCutOffDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}ISODate" minOccurs="0"/>
 *         <element name="Assgne" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="Assgnr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="NtfctnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}FinancingNotificationParties1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FinItm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}FinancialItem1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}Max15NumericText"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="TtlReqAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlReqFincg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}FinancingRateOrAmountChoice" minOccurs="0"/>
 *         <element name="AgrdRate" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}AgreedRate1" minOccurs="0"/>
 *         <element name="FincgInstlmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}Instalment2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *         <element name="FincgSts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}FinancingInformationAndStatus1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingItemList1", propOrder = {
    "idr",
    "isseDt",
    "rltdDoc",
    "amtCutOffDt",
    "assgne",
    "assgnr",
    "ntfctnInf",
    "finItm",
    "itmCnt",
    "ctrlSum",
    "ttlReqAmt",
    "ttlReqFincg",
    "agrdRate",
    "fincgInstlmt",
    "addtlInf",
    "vldtnStsInf",
    "fincgSts"
})
public class FinancingItemList1 {

    @XmlElement(name = "Idr", required = true)
    protected String idr;
    @XmlElement(name = "IsseDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElementRef(name = "RltdDoc", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> rltdDoc;
    @XmlElement(name = "AmtCutOffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar amtCutOffDt;
    @XmlElement(name = "Assgne", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgne;
    @XmlElement(name = "Assgnr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assgnr;
    @XmlElement(name = "NtfctnInf")
    protected List<FinancingNotificationParties1> ntfctnInf;
    @XmlElement(name = "FinItm")
    protected List<FinancialItem1> finItm;
    @XmlElement(name = "ItmCnt", required = true)
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "TtlReqAmt")
    protected ActiveCurrencyAndAmount ttlReqAmt;
    @XmlElement(name = "TtlReqFincg")
    protected FinancingRateOrAmountChoice ttlReqFincg;
    @XmlElement(name = "AgrdRate")
    protected AgreedRate1 agrdRate;
    @XmlElement(name = "FincgInstlmt")
    protected List<Instalment2> fincgInstlmt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "FincgSts")
    protected FinancingInformationAndStatus1 fincgSts;

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
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
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
     * Gets the value of the amtCutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAmtCutOffDt() {
        return amtCutOffDt;
    }

    /**
     * Sets the value of the amtCutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAmtCutOffDt(XMLGregorianCalendar value) {
        this.amtCutOffDt = value;
    }

    /**
     * Gets the value of the assgne property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgne() {
        return assgne;
    }

    /**
     * Sets the value of the assgne property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssgne(Object value) {
        this.assgne = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssgnr(Object value) {
        this.assgnr = value;
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
     * Gets the value of the finItm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finItm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinItm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialItem1 }
     * 
     * 
     * @return
     *     The value of the finItm property.
     */
    public List<FinancialItem1> getFinItm() {
        if (finItm == null) {
            finItm = new ArrayList<>();
        }
        return this.finItm;
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
     * Gets the value of the ttlReqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlReqAmt() {
        return ttlReqAmt;
    }

    /**
     * Sets the value of the ttlReqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlReqAmt(ActiveCurrencyAndAmount value) {
        this.ttlReqAmt = value;
    }

    /**
     * Gets the value of the ttlReqFincg property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getTtlReqFincg() {
        return ttlReqFincg;
    }

    /**
     * Sets the value of the ttlReqFincg property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public void setTtlReqFincg(FinancingRateOrAmountChoice value) {
        this.ttlReqFincg = value;
    }

    /**
     * Gets the value of the agrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate1 }
     *     
     */
    public AgreedRate1 getAgrdRate() {
        return agrdRate;
    }

    /**
     * Sets the value of the agrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate1 }
     *     
     */
    public void setAgrdRate(AgreedRate1 value) {
        this.agrdRate = value;
    }

    /**
     * Gets the value of the fincgInstlmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fincgInstlmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFincgInstlmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment2 }
     * 
     * 
     * @return
     *     The value of the fincgInstlmt property.
     */
    public List<Instalment2> getFincgInstlmt() {
        if (fincgInstlmt == null) {
            fincgInstlmt = new ArrayList<>();
        }
        return this.fincgInstlmt;
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

    /**
     * Gets the value of the fincgSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public FinancingInformationAndStatus1 getFincgSts() {
        return fincgSts;
    }

    /**
     * Sets the value of the fincgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingInformationAndStatus1 }
     *     
     */
    public void setFincgSts(FinancingInformationAndStatus1 value) {
        this.fincgSts = value;
    }

}
