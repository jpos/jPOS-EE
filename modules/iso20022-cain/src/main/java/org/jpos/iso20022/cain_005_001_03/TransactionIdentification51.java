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

package org.jpos.iso20022.cain_005_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionIdentification51 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionIdentification51">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LclDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISODate" minOccurs="0"/>
 *         <element name="LclTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISOTime" minOccurs="0"/>
 *         <element name="TmZone" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max70Text" minOccurs="0"/>
 *         <element name="TxRef" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TrnsmssnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="SysTracAudtNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max12NumericText"/>
 *         <element name="RtrvlRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Exact12Text"/>
 *         <element name="LifeCyclSpprt" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}LifeCycleSupport1Code" minOccurs="0"/>
 *         <element name="LifeCyclTracIdData" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}TransactionLifeCycleIdentification1" minOccurs="0"/>
 *         <element name="LifeCyclTracIdMssng" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max70Text" minOccurs="0"/>
 *         <element name="AcqrrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max140Text" minOccurs="0"/>
 *         <element name="AcqrrRefNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max23NumericText" minOccurs="0"/>
 *         <element name="CardIssrRefData" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max1000Text" minOccurs="0"/>
 *         <element name="OrgnlDataElmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}OriginalDataElements2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionIdentification51", propOrder = {
    "lclDt",
    "lclTm",
    "tmZone",
    "txRef",
    "trnsmssnDtTm",
    "sysTracAudtNb",
    "rtrvlRefNb",
    "lifeCyclSpprt",
    "lifeCyclTracIdData",
    "lifeCyclTracIdMssng",
    "acqrrRefData",
    "acqrrRefNb",
    "cardIssrRefData",
    "orgnlDataElmts"
})
public class TransactionIdentification51 {

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
    @XmlElement(name = "LifeCyclSpprt")
    @XmlSchemaType(name = "string")
    protected LifeCycleSupport1Code lifeCyclSpprt;
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
    @XmlElement(name = "OrgnlDataElmts")
    protected OriginalDataElements2 orgnlDataElmts;

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
     * Gets the value of the lifeCyclSpprt property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public LifeCycleSupport1Code getLifeCyclSpprt() {
        return lifeCyclSpprt;
    }

    /**
     * Sets the value of the lifeCyclSpprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleSupport1Code }
     *     
     */
    public void setLifeCyclSpprt(LifeCycleSupport1Code value) {
        this.lifeCyclSpprt = value;
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

    /**
     * Gets the value of the orgnlDataElmts property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalDataElements2 }
     *     
     */
    public OriginalDataElements2 getOrgnlDataElmts() {
        return orgnlDataElmts;
    }

    /**
     * Sets the value of the orgnlDataElmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalDataElements2 }
     *     
     */
    public void setOrgnlDataElmts(OriginalDataElements2 value) {
        this.orgnlDataElmts = value;
    }

}
