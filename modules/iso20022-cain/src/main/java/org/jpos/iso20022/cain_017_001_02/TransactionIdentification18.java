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

package org.jpos.iso20022.cain_017_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentification18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionIdentification18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LclDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISODate" minOccurs="0"/>
 *         <element name="LclTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISOTime" minOccurs="0"/>
 *         <element name="TmZone" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max70Text" minOccurs="0"/>
 *         <element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TrnsmssnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="SysTracAudtNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max12NumericText"/>
 *         <element name="RtrvlRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Exact12Text"/>
 *         <element name="LifeCyclSpprtInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Exact2NumericText" minOccurs="0"/>
 *         <element name="LifeCyclTracIdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TransactionLifeCycleIdentification1" minOccurs="0"/>
 *         <element name="LifeCyclTracIdMssng" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max70Text" minOccurs="0"/>
 *         <element name="AcqrrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max140Text" minOccurs="0"/>
 *         <element name="AcqrrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max23NumericText" minOccurs="0"/>
 *         <element name="CardIssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max1000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification18", propOrder = {
    "lclDt",
    "lclTm",
    "tmZone",
    "txRef",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprtInd",
    "lifeCyclTracIdData",
    "lifeCyclTracIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "cardIssrRefData"
})
public class TransactionIdentification18 {

    @XmlElement(name = "LclDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lclDt;
    @XmlElement(name = "LclTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar lclTm;
    @XmlElement(name = "TmZone")
    protected String tmZone;
    @XmlElement(name = "TxRef")
    protected String txRef;
    @XmlElement(name = "TrnsmssnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar trnsmssnDtTm;
    @XmlElement(name = "SysTracAudtNb", required = true)
    protected String sysTracAudtNb;
    @XmlElement(name = "RtrvlRefNb", required = true)
    protected String rtrvlRefNb;
    @XmlElement(name = "LifeCyclSpprtInd")
    protected String lifeCyclSpprtInd;
    @XmlElement(name = "LifeCyclTracIdData")
    protected TransactionLifeCycleIdentification1 lifeCyclTracIdData;
    @XmlElement(name = "LifeCyclTracIdMssng")
    protected String lifeCyclTracIdMssng;
    @XmlElement(name = "AcqrrRefData")
    protected String acqrrRefData;
    @XmlElement(name = "AcqrrRefNb")
    protected String acqrrRefNb;
    @XmlElement(name = "CardIssrRefData")
    protected String cardIssrRefData;

    /**
     * Gets the value of the lclDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLclDt() {
        return lclDt;
    }

    /**
     * Sets the value of the lclDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLclDt(XMLGregorianCalendar value) {
        this.lclDt = value;
    }

    /**
     * Gets the value of the lclTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLclTm() {
        return lclTm;
    }

    /**
     * Sets the value of the lclTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLclTm(XMLGregorianCalendar value) {
        this.lclTm = value;
    }

    /**
     * Gets the value of the tmZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmZone() {
        return tmZone;
    }

    /**
     * Sets the value of the tmZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmZone(String value) {
        this.tmZone = value;
    }

    /**
     * Gets the value of the txRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxRef() {
        return txRef;
    }

    /**
     * Sets the value of the txRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxRef(String value) {
        this.txRef = value;
    }

    /**
     * Gets the value of the trnsmssnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrnsmssnDtTm() {
        return trnsmssnDtTm;
    }

    /**
     * Sets the value of the trnsmssnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrnsmssnDtTm(XMLGregorianCalendar value) {
        this.trnsmssnDtTm = value;
    }

    /**
     * Gets the value of the sysTracAudtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysTracAudtNb() {
        return sysTracAudtNb;
    }

    /**
     * Sets the value of the sysTracAudtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysTracAudtNb(String value) {
        this.sysTracAudtNb = value;
    }

    /**
     * Gets the value of the rtrvlRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtrvlRefNb() {
        return rtrvlRefNb;
    }

    /**
     * Sets the value of the rtrvlRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtrvlRefNb(String value) {
        this.rtrvlRefNb = value;
    }

    /**
     * Gets the value of the lifeCyclSpprtInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclSpprtInd() {
        return lifeCyclSpprtInd;
    }

    /**
     * Sets the value of the lifeCyclSpprtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCyclSpprtInd(String value) {
        this.lifeCyclSpprtInd = value;
    }

    /**
     * Gets the value of the lifeCyclTracIdData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public TransactionLifeCycleIdentification1 getLifeCyclTracIdData() {
        return lifeCyclTracIdData;
    }

    /**
     * Sets the value of the lifeCyclTracIdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionLifeCycleIdentification1 }
     *     
     */
    public void setLifeCyclTracIdData(TransactionLifeCycleIdentification1 value) {
        this.lifeCyclTracIdData = value;
    }

    /**
     * Gets the value of the lifeCyclTracIdMssng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLifeCyclTracIdMssng() {
        return lifeCyclTracIdMssng;
    }

    /**
     * Sets the value of the lifeCyclTracIdMssng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLifeCyclTracIdMssng(String value) {
        this.lifeCyclTracIdMssng = value;
    }

    /**
     * Gets the value of the acqrrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefData() {
        return acqrrRefData;
    }

    /**
     * Sets the value of the acqrrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrRefData(String value) {
        this.acqrrRefData = value;
    }

    /**
     * Gets the value of the acqrrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcqrrRefNb() {
        return acqrrRefNb;
    }

    /**
     * Sets the value of the acqrrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcqrrRefNb(String value) {
        this.acqrrRefNb = value;
    }

    /**
     * Gets the value of the cardIssrRefData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssrRefData() {
        return cardIssrRefData;
    }

    /**
     * Sets the value of the cardIssrRefData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssrRefData(String value) {
        this.cardIssrRefData = value;
    }

}
