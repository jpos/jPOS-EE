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

package org.jpos.iso20022.auth_019_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentGeneralInformation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentGeneralInformation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ExternalDocumentType1Code"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max35Text"/>
 *         <element name="DocNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max140Text" minOccurs="0"/>
 *         <element name="SndrRcvrSeqId" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max140Text" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}ISODate" minOccurs="0"/>
 *         <element name="URL" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}Max256Text" minOccurs="0"/>
 *         <element name="LkFileHash" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}SignatureEnvelopeReference" minOccurs="0"/>
 *         <element name="AttchdBinryFile" type="{urn:iso:std:iso:20022:tech:xsd:auth.019.001.03}BinaryFile1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGeneralInformation5", propOrder = {
    "docTp",
    "docNb",
    "docNm",
    "sndrRcvrSeqId",
    "isseDt",
    "url",
    "lkFileHash",
    "attchdBinryFile"
})
public class DocumentGeneralInformation5 {

    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "DocNm")
    protected String docNm;
    @XmlElement(name = "SndrRcvrSeqId")
    protected String sndrRcvrSeqId;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "LkFileHash")
    protected SignatureEnvelopeReference lkFileHash;
    @XmlElement(name = "AttchdBinryFile", required = true)
    protected BinaryFile1 attchdBinryFile;

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocTp(String value) {
        this.docTp = value;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNb(String value) {
        this.docNb = value;
    }

    /**
     * Gets the value of the docNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNm() {
        return docNm;
    }

    /**
     * Sets the value of the docNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNm(String value) {
        this.docNm = value;
    }

    /**
     * Gets the value of the sndrRcvrSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSndrRcvrSeqId() {
        return sndrRcvrSeqId;
    }

    /**
     * Sets the value of the sndrRcvrSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSndrRcvrSeqId(String value) {
        this.sndrRcvrSeqId = value;
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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the lkFileHash property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureEnvelopeReference }
     *     
     */
    public SignatureEnvelopeReference getLkFileHash() {
        return lkFileHash;
    }

    /**
     * Sets the value of the lkFileHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureEnvelopeReference }
     *     
     */
    public void setLkFileHash(SignatureEnvelopeReference value) {
        this.lkFileHash = value;
    }

    /**
     * Gets the value of the attchdBinryFile property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryFile1 }
     *     
     */
    public BinaryFile1 getAttchdBinryFile() {
        return attchdBinryFile;
    }

    /**
     * Sets the value of the attchdBinryFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryFile1 }
     *     
     */
    public void setAttchdBinryFile(BinaryFile1 value) {
        this.attchdBinryFile = value;
    }

}
