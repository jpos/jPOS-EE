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

package org.jpos.iso20022.tsmt_055_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessLetter1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessLetter1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ApplCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" minOccurs="0"/>
 *         <element name="LttrIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}ISODate"/>
 *         <element name="RltdLttr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RltdMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CnttIdr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Priority3Code" minOccurs="0"/>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1"/>
 *         <element name="PmryRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AuthstnUsr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded"/>
 *         <element name="RspnRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CpyRcpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrPty" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyIdentification1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AssoctdDoc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GovngCtrct" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedDocumentInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LglCntxt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}GovernanceRules2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max2000Text" minOccurs="0"/>
 *         <element name="Ntce" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}Max350Text" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}ValidationStatusInformation1" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.055.001.01}QualifiedPartyAndXMLSignature1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessLetter1", propOrder = {
    "applCntxt",
    "lttrIdr",
    "dt",
    "rltdLttr",
    "rltdMsg",
    "cnttIdr",
    "instrPrty",
    "orgtr",
    "pmryRcpt",
    "sndr",
    "authstnUsr",
    "rspnRcpt",
    "cpyRcpt",
    "othrPty",
    "assoctdDoc",
    "govngCtrct",
    "lglCntxt",
    "addtlInf",
    "ntce",
    "vldtnStsInf",
    "dgtlSgntr"
})
public class BusinessLetter1 {

    @XmlElement(name = "ApplCntxt")
    protected String applCntxt;
    @XmlElement(name = "LttrIdr", required = true)
    protected QualifiedDocumentInformation1 lttrIdr;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "RltdLttr")
    protected List<QualifiedDocumentInformation1> rltdLttr;
    @XmlElement(name = "RltdMsg")
    protected List<QualifiedDocumentInformation1> rltdMsg;
    @XmlElement(name = "CnttIdr")
    protected List<String> cnttIdr;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority3Code instrPrty;
    @XmlElement(name = "Orgtr", required = true)
    protected QualifiedPartyIdentification1 orgtr;
    @XmlElement(name = "PmryRcpt", required = true)
    protected List<QualifiedPartyIdentification1> pmryRcpt;
    @XmlElement(name = "Sndr")
    protected List<QualifiedPartyIdentification1> sndr;
    @XmlElement(name = "AuthstnUsr", required = true)
    protected List<QualifiedPartyIdentification1> authstnUsr;
    @XmlElement(name = "RspnRcpt")
    protected List<QualifiedPartyIdentification1> rspnRcpt;
    @XmlElement(name = "CpyRcpt")
    protected List<QualifiedPartyIdentification1> cpyRcpt;
    @XmlElement(name = "OthrPty")
    protected List<QualifiedPartyIdentification1> othrPty;
    @XmlElement(name = "AssoctdDoc")
    protected List<QualifiedDocumentInformation1> assoctdDoc;
    @XmlElement(name = "GovngCtrct")
    protected List<QualifiedDocumentInformation1> govngCtrct;
    @XmlElement(name = "LglCntxt")
    protected List<GovernanceRules2> lglCntxt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Ntce")
    protected String ntce;
    @XmlElement(name = "VldtnStsInf")
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "DgtlSgntr")
    protected List<QualifiedPartyAndXMLSignature1> dgtlSgntr;

    /**
     * Gets the value of the applCntxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplCntxt() {
        return applCntxt;
    }

    /**
     * Sets the value of the applCntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplCntxt(String value) {
        this.applCntxt = value;
    }

    /**
     * Gets the value of the lttrIdr property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public QualifiedDocumentInformation1 getLttrIdr() {
        return lttrIdr;
    }

    /**
     * Sets the value of the lttrIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedDocumentInformation1 }
     *     
     */
    public void setLttrIdr(QualifiedDocumentInformation1 value) {
        this.lttrIdr = value;
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
     * Gets the value of the rltdLttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdLttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdLttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     * @return
     *     The value of the rltdLttr property.
     */
    public List<QualifiedDocumentInformation1> getRltdLttr() {
        if (rltdLttr == null) {
            rltdLttr = new ArrayList<>();
        }
        return this.rltdLttr;
    }

    /**
     * Gets the value of the rltdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     * @return
     *     The value of the rltdMsg property.
     */
    public List<QualifiedDocumentInformation1> getRltdMsg() {
        if (rltdMsg == null) {
            rltdMsg = new ArrayList<>();
        }
        return this.rltdMsg;
    }

    /**
     * Gets the value of the cnttIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cnttIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnttIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cnttIdr property.
     */
    public List<String> getCnttIdr() {
        if (cnttIdr == null) {
            cnttIdr = new ArrayList<>();
        }
        return this.cnttIdr;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority3Code }
     *     
     */
    public Priority3Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority3Code }
     *     
     */
    public void setInstrPrty(Priority3Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public QualifiedPartyIdentification1 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedPartyIdentification1 }
     *     
     */
    public void setOrgtr(QualifiedPartyIdentification1 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the pmryRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pmryRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPmryRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the pmryRcpt property.
     */
    public List<QualifiedPartyIdentification1> getPmryRcpt() {
        if (pmryRcpt == null) {
            pmryRcpt = new ArrayList<>();
        }
        return this.pmryRcpt;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sndr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSndr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the sndr property.
     */
    public List<QualifiedPartyIdentification1> getSndr() {
        if (sndr == null) {
            sndr = new ArrayList<>();
        }
        return this.sndr;
    }

    /**
     * Gets the value of the authstnUsr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authstnUsr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthstnUsr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the authstnUsr property.
     */
    public List<QualifiedPartyIdentification1> getAuthstnUsr() {
        if (authstnUsr == null) {
            authstnUsr = new ArrayList<>();
        }
        return this.authstnUsr;
    }

    /**
     * Gets the value of the rspnRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the rspnRcpt property.
     */
    public List<QualifiedPartyIdentification1> getRspnRcpt() {
        if (rspnRcpt == null) {
            rspnRcpt = new ArrayList<>();
        }
        return this.rspnRcpt;
    }

    /**
     * Gets the value of the cpyRcpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cpyRcpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCpyRcpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the cpyRcpt property.
     */
    public List<QualifiedPartyIdentification1> getCpyRcpt() {
        if (cpyRcpt == null) {
            cpyRcpt = new ArrayList<>();
        }
        return this.cpyRcpt;
    }

    /**
     * Gets the value of the othrPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyIdentification1 }
     * 
     * 
     * @return
     *     The value of the othrPty property.
     */
    public List<QualifiedPartyIdentification1> getOthrPty() {
        if (othrPty == null) {
            othrPty = new ArrayList<>();
        }
        return this.othrPty;
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
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     * @return
     *     The value of the assoctdDoc property.
     */
    public List<QualifiedDocumentInformation1> getAssoctdDoc() {
        if (assoctdDoc == null) {
            assoctdDoc = new ArrayList<>();
        }
        return this.assoctdDoc;
    }

    /**
     * Gets the value of the govngCtrct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the govngCtrct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGovngCtrct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedDocumentInformation1 }
     * 
     * 
     * @return
     *     The value of the govngCtrct property.
     */
    public List<QualifiedDocumentInformation1> getGovngCtrct() {
        if (govngCtrct == null) {
            govngCtrct = new ArrayList<>();
        }
        return this.govngCtrct;
    }

    /**
     * Gets the value of the lglCntxt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lglCntxt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLglCntxt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GovernanceRules2 }
     * 
     * 
     * @return
     *     The value of the lglCntxt property.
     */
    public List<GovernanceRules2> getLglCntxt() {
        if (lglCntxt == null) {
            lglCntxt = new ArrayList<>();
        }
        return this.lglCntxt;
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
     * Gets the value of the ntce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtce() {
        return ntce;
    }

    /**
     * Sets the value of the ntce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtce(String value) {
        this.ntce = value;
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
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualifiedPartyAndXMLSignature1 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<QualifiedPartyAndXMLSignature1> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
    }

}
