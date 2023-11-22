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

package org.jpos.iso20022.pain_013_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}DocumentType1Choice"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}Max35Text"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}DateAndDateTime2Choice"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}Max140Text" minOccurs="0"/>
 *         <element name="LangCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}LanguageCode" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}DocumentFormat1Choice"/>
 *         <element name="FileNm" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}Max140Text" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}PartyAndSignature3" minOccurs="0"/>
 *         <element name="Nclsr" type="{urn:iso:std:iso:20022:tech:xsd:pain.013.001.10}Max10MbBinary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document12", propOrder = {
    "tp",
    "id",
    "isseDt",
    "nm",
    "langCd",
    "frmt",
    "fileNm",
    "dgtlSgntr",
    "nclsr"
})
public class Document12 {

    @XmlElement(name = "Tp", required = true)
    protected DocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IsseDt", required = true)
    protected DateAndDateTime2Choice isseDt;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "LangCd")
    protected String langCd;
    @XmlElement(name = "Frmt", required = true)
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature3 dgtlSgntr;
    @XmlElement(name = "Nclsr", required = true)
    protected byte[] nclsr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType1Choice }
     *     
     */
    public DocumentType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType1Choice }
     *     
     */
    public void setTp(DocumentType1Choice value) {
        this.tp = value;
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
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setIsseDt(DateAndDateTime2Choice value) {
        this.isseDt = value;
    }

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
     * Gets the value of the langCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Sets the value of the langCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public void setFrmt(DocumentFormat1Choice value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the fileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNm() {
        return fileNm;
    }

    /**
     * Sets the value of the fileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNm(String value) {
        this.fileNm = value;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature3 }
     *     
     */
    public PartyAndSignature3 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature3 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature3 value) {
        this.dgtlSgntr = value;
    }

    /**
     * Gets the value of the nclsr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNclsr() {
        return nclsr;
    }

    /**
     * Sets the value of the nclsr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNclsr(byte[] value) {
        this.nclsr = value;
    }

}
