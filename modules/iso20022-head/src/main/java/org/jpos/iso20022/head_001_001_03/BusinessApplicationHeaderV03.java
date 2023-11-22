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

package org.jpos.iso20022.head_001_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessApplicationHeaderV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessApplicationHeaderV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CharSet" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}UnicodeChartsCode" minOccurs="0"/>
 *         <element name="Fr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Party44Choice"/>
 *         <element name="To" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Party44Choice"/>
 *         <element name="BizMsgIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text"/>
 *         <element name="MsgDefIdr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text"/>
 *         <element name="BizSvc" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="MktPrctc" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ImplementationSpecification1" minOccurs="0"/>
 *         <element name="CreDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ISODateTime"/>
 *         <element name="BizPrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="CpyDplct" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}CopyDuplicate1Code" minOccurs="0"/>
 *         <element name="PssblDplct" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}BusinessMessagePriorityCode" minOccurs="0"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}SignatureEnvelope" minOccurs="0"/>
 *         <element name="Rltd" type="{urn:iso:std:iso:20022:tech:xsd:head.001.001.03}BusinessApplicationHeader7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessApplicationHeaderV03", propOrder = {
    "charSet",
    "fr",
    "to",
    "bizMsgIdr",
    "msgDefIdr",
    "bizSvc",
    "mktPrctc",
    "creDt",
    "bizPrcgDt",
    "cpyDplct",
    "pssblDplct",
    "prty",
    "sgntr",
    "rltd"
})
public class BusinessApplicationHeaderV03 {

    @XmlElement(name = "CharSet")
    protected String charSet;
    @XmlElement(name = "Fr", required = true)
    protected Party44Choice fr;
    @XmlElement(name = "To", required = true)
    protected Party44Choice to;
    @XmlElement(name = "BizMsgIdr", required = true)
    protected String bizMsgIdr;
    @XmlElement(name = "MsgDefIdr", required = true)
    protected String msgDefIdr;
    @XmlElement(name = "BizSvc")
    protected String bizSvc;
    @XmlElement(name = "MktPrctc")
    protected ImplementationSpecification1 mktPrctc;
    @XmlElement(name = "CreDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDt;
    @XmlElement(name = "BizPrcgDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bizPrcgDt;
    @XmlElement(name = "CpyDplct")
    @XmlSchemaType(name = "string")
    protected CopyDuplicate1Code cpyDplct;
    @XmlElement(name = "PssblDplct")
    protected Boolean pssblDplct;
    @XmlElement(name = "Prty")
    protected String prty;
    @XmlElement(name = "Sgntr")
    protected SignatureEnvelope sgntr;
    @XmlElement(name = "Rltd")
    protected List<BusinessApplicationHeader7> rltd;

    /**
     * Gets the value of the charSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * Sets the value of the charSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharSet(String value) {
        this.charSet = value;
    }

    /**
     * Gets the value of the fr property.
     * 
     * @return
     *     possible object is
     *     {@link Party44Choice }
     *     
     */
    public Party44Choice getFr() {
        return fr;
    }

    /**
     * Sets the value of the fr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party44Choice }
     *     
     */
    public void setFr(Party44Choice value) {
        this.fr = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link Party44Choice }
     *     
     */
    public Party44Choice getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party44Choice }
     *     
     */
    public void setTo(Party44Choice value) {
        this.to = value;
    }

    /**
     * Gets the value of the bizMsgIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizMsgIdr() {
        return bizMsgIdr;
    }

    /**
     * Sets the value of the bizMsgIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizMsgIdr(String value) {
        this.bizMsgIdr = value;
    }

    /**
     * Gets the value of the msgDefIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgDefIdr() {
        return msgDefIdr;
    }

    /**
     * Sets the value of the msgDefIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgDefIdr(String value) {
        this.msgDefIdr = value;
    }

    /**
     * Gets the value of the bizSvc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBizSvc() {
        return bizSvc;
    }

    /**
     * Sets the value of the bizSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBizSvc(String value) {
        this.bizSvc = value;
    }

    /**
     * Gets the value of the mktPrctc property.
     * 
     * @return
     *     possible object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public ImplementationSpecification1 getMktPrctc() {
        return mktPrctc;
    }

    /**
     * Sets the value of the mktPrctc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImplementationSpecification1 }
     *     
     */
    public void setMktPrctc(ImplementationSpecification1 value) {
        this.mktPrctc = value;
    }

    /**
     * Gets the value of the creDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDt() {
        return creDt;
    }

    /**
     * Sets the value of the creDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDt(XMLGregorianCalendar value) {
        this.creDt = value;
    }

    /**
     * Gets the value of the bizPrcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizPrcgDt() {
        return bizPrcgDt;
    }

    /**
     * Sets the value of the bizPrcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizPrcgDt(XMLGregorianCalendar value) {
        this.bizPrcgDt = value;
    }

    /**
     * Gets the value of the cpyDplct property.
     * 
     * @return
     *     possible object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public CopyDuplicate1Code getCpyDplct() {
        return cpyDplct;
    }

    /**
     * Sets the value of the cpyDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CopyDuplicate1Code }
     *     
     */
    public void setCpyDplct(CopyDuplicate1Code value) {
        this.cpyDplct = value;
    }

    /**
     * Gets the value of the pssblDplct property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPssblDplct() {
        return pssblDplct;
    }

    /**
     * Sets the value of the pssblDplct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPssblDplct(Boolean value) {
        this.pssblDplct = value;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrty(String value) {
        this.prty = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelope }
     *     
     */
    public SignatureEnvelope getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelope }
     *     
     */
    public void setSgntr(SignatureEnvelope value) {
        this.sgntr = value;
    }

    /**
     * Gets the value of the rltd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rltd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessApplicationHeader7 }
     * 
     * 
     * @return
     *     The value of the rltd property.
     */
    public List<BusinessApplicationHeader7> getRltd() {
        if (rltd == null) {
            rltd = new ArrayList<>();
        }
        return this.rltd;
    }

}
