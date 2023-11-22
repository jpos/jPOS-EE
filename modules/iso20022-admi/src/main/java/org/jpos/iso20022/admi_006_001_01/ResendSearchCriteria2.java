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

package org.jpos.iso20022.admi_006_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResendSearchCriteria2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResendSearchCriteria2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BizDt" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}ISODate" minOccurs="0"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SeqRg" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}SequenceRange1Choice" minOccurs="0"/>
 *         <element name="OrgnlMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="FileRef" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:admi.006.001.01}PartyIdentification136"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResendSearchCriteria2", propOrder = {
    "bizDt",
    "seqNb",
    "seqRg",
    "orgnlMsgNmId",
    "fileRef",
    "rcpt"
})
public class ResendSearchCriteria2 {

    @XmlElement(name = "BizDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bizDt;
    @XmlElement(name = "SeqNb")
    protected String seqNb;
    @XmlElement(name = "SeqRg")
    protected SequenceRange1Choice seqRg;
    @XmlElement(name = "OrgnlMsgNmId")
    protected String orgnlMsgNmId;
    @XmlElement(name = "FileRef")
    protected String fileRef;
    @XmlElement(name = "Rcpt", required = true)
    protected PartyIdentification136 rcpt;

    /**
     * Gets the value of the bizDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBizDt() {
        return bizDt;
    }

    /**
     * Sets the value of the bizDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBizDt(XMLGregorianCalendar value) {
        this.bizDt = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNb(String value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the seqRg property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public SequenceRange1Choice getSeqRg() {
        return seqRg;
    }

    /**
     * Sets the value of the seqRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceRange1Choice }
     *     
     */
    public void setSeqRg(SequenceRange1Choice value) {
        this.seqRg = value;
    }

    /**
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
    }

    /**
     * Gets the value of the fileRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileRef() {
        return fileRef;
    }

    /**
     * Sets the value of the fileRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileRef(String value) {
        this.fileRef = value;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification136 }
     *     
     */
    public PartyIdentification136 getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification136 }
     *     
     */
    public void setRcpt(PartyIdentification136 value) {
        this.rcpt = value;
    }

}
