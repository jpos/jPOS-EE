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

package org.jpos.iso20022.auth_026_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SupportingDocumentRequestOrLetter3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SupportingDocumentRequestOrLetter3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqOrLttrId" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max35Text"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}ISODate" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Party40Choice" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Party40Choice" minOccurs="0"/>
 *         <element name="OrgnlRefs" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}OriginalMessage4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sbjt" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max140Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}SupportLetterType1Choice"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max1025Text" minOccurs="0"/>
 *         <element name="RspnReqrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}TrueFalseIndicator"/>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}ISODate" minOccurs="0"/>
 *         <element name="Attchmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}DocumentGeneralInformation5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupportingDocumentRequestOrLetter3", propOrder = {
    "reqOrLttrId",
    "dt",
    "sndr",
    "rcvr",
    "orgnlRefs",
    "sbjt",
    "tp",
    "desc",
    "rspnReqrd",
    "dueDt",
    "attchmnt",
    "splmtryData"
})
public class SupportingDocumentRequestOrLetter3 {

    @XmlElement(name = "ReqOrLttrId", required = true)
    protected String reqOrLttrId;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Sndr")
    protected Party40Choice sndr;
    @XmlElement(name = "Rcvr")
    protected Party40Choice rcvr;
    @XmlElement(name = "OrgnlRefs")
    protected List<OriginalMessage4> orgnlRefs;
    @XmlElement(name = "Sbjt", required = true)
    protected String sbjt;
    @XmlElement(name = "Tp", required = true)
    protected SupportLetterType1Choice tp;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "RspnReqrd")
    protected boolean rspnReqrd;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "Attchmnt")
    protected List<DocumentGeneralInformation5> attchmnt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the reqOrLttrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqOrLttrId() {
        return reqOrLttrId;
    }

    /**
     * Sets the value of the reqOrLttrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqOrLttrId(String value) {
        this.reqOrLttrId = value;
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
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setSndr(Party40Choice value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setRcvr(Party40Choice value) {
        this.rcvr = value;
    }

    /**
     * Gets the value of the orgnlRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalMessage4 }
     * 
     * 
     * @return
     *     The value of the orgnlRefs property.
     */
    public List<OriginalMessage4> getOrgnlRefs() {
        if (orgnlRefs == null) {
            orgnlRefs = new ArrayList<>();
        }
        return this.orgnlRefs;
    }

    /**
     * Gets the value of the sbjt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbjt() {
        return sbjt;
    }

    /**
     * Sets the value of the sbjt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbjt(String value) {
        this.sbjt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link SupportLetterType1Choice }
     *     
     */
    public SupportLetterType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportLetterType1Choice }
     *     
     */
    public void setTp(SupportLetterType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the rspnReqrd property.
     * 
     */
    public boolean isRspnReqrd() {
        return rspnReqrd;
    }

    /**
     * Sets the value of the rspnReqrd property.
     * 
     */
    public void setRspnReqrd(boolean value) {
        this.rspnReqrd = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the attchmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentGeneralInformation5 }
     * 
     * 
     * @return
     *     The value of the attchmnt property.
     */
    public List<DocumentGeneralInformation5> getAttchmnt() {
        if (attchmnt == null) {
            attchmnt = new ArrayList<>();
        }
        return this.attchmnt;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
