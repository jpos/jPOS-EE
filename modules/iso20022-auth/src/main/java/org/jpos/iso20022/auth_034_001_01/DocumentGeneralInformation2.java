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

package org.jpos.iso20022.auth_034_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentGeneralInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentGeneralInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ExternalDocumentType1Code"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max35Text"/>
 *         <element name="SndrRcvrSeqId" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max140Text" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ISODate" minOccurs="0"/>
 *         <element name="URL" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max256Text" minOccurs="0"/>
 *         <element name="AttchdBinryFile" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}BinaryFile1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentGeneralInformation2", propOrder = {
    "docTp",
    "docNb",
    "sndrRcvrSeqId",
    "isseDt",
    "url",
    "attchdBinryFile"
})
public class DocumentGeneralInformation2 {

    @XmlElement(name = "DocTp", required = true)
    protected String docTp;
    @XmlElement(name = "DocNb", required = true)
    protected String docNb;
    @XmlElement(name = "SndrRcvrSeqId")
    protected String sndrRcvrSeqId;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "AttchdBinryFile")
    protected List<BinaryFile1> attchdBinryFile;

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
     * Gets the value of the attchdBinryFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdBinryFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdBinryFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryFile1 }
     * 
     * 
     * @return
     *     The value of the attchdBinryFile property.
     */
    public List<BinaryFile1> getAttchdBinryFile() {
        if (attchdBinryFile == null) {
            attchdBinryFile = new ArrayList<>();
        }
        return this.attchdBinryFile;
    }

}
