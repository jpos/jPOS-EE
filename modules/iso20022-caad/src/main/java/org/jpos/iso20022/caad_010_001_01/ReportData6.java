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

package org.jpos.iso20022.caad_010_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportData6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportData6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max140Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max140Text" minOccurs="0"/>
 *         <element name="Qlfr" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max70Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ISODate" minOccurs="0"/>
 *         <element name="Tm" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ISOTime" minOccurs="0"/>
 *         <element name="Seq" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max5NumericText" minOccurs="0"/>
 *         <element name="TtlOcrncs" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max5NumericText" minOccurs="0"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Frequency17Code" minOccurs="0"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}CorrectionIdentification1" minOccurs="0"/>
 *         <element name="ConttnInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}OutputFormat5Code" minOccurs="0"/>
 *         <element name="OthrFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Cntt" type="{urn:iso:std:iso:20022:tech:xsd:caad.010.001.01}ReportContent1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportData6", propOrder = {
    "nm",
    "id",
    "qlfr",
    "dt",
    "tm",
    "seq",
    "ttlOcrncs",
    "frqcy",
    "crrctn",
    "conttnInd",
    "addtlData",
    "frmt",
    "othrFrmt",
    "cntt"
})
public class ReportData6 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Qlfr")
    protected String qlfr;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Tm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar tm;
    @XmlElement(name = "Seq")
    protected String seq;
    @XmlElement(name = "TtlOcrncs")
    protected String ttlOcrncs;
    @XmlElement(name = "Frqcy")
    @XmlSchemaType(name = "string")
    protected Frequency17Code frqcy;
    @XmlElement(name = "Crrctn")
    protected CorrectionIdentification1 crrctn;
    @XmlElement(name = "ConttnInd")
    protected Boolean conttnInd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Cntt")
    protected List<ReportContent1> cntt;

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the qlfr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQlfr() {
        return qlfr;
    }

    /**
     * Sets the value of the qlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQlfr(String value) {
        this.qlfr = value;
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
     * Gets the value of the tm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTm() {
        return tm;
    }

    /**
     * Sets the value of the tm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTm(XMLGregorianCalendar value) {
        this.tm = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeq(String value) {
        this.seq = value;
    }

    /**
     * Gets the value of the ttlOcrncs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlOcrncs() {
        return ttlOcrncs;
    }

    /**
     * Sets the value of the ttlOcrncs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlOcrncs(String value) {
        this.ttlOcrncs = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency17Code }
     *     
     */
    public Frequency17Code getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency17Code }
     *     
     */
    public void setFrqcy(Frequency17Code value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public CorrectionIdentification1 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrectionIdentification1 }
     *     
     */
    public void setCrrctn(CorrectionIdentification1 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the conttnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConttnInd() {
        return conttnInd;
    }

    /**
     * Sets the value of the conttnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConttnInd(Boolean value) {
        this.conttnInd = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public void setFrmt(OutputFormat5Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrmt(String value) {
        this.othrFrmt = value;
    }

    /**
     * Gets the value of the cntt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cntt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReportContent1 }
     * 
     * 
     * @return
     *     The value of the cntt property.
     */
    public List<ReportContent1> getCntt() {
        if (cntt == null) {
            cntt = new ArrayList<>();
        }
        return this.cntt;
    }

}
