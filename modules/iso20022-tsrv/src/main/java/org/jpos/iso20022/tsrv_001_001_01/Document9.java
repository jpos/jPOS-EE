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

package org.jpos.iso20022.tsrv_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}UndertakingDocumentType1Choice"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Max35Text"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}DocumentFormat1Choice" minOccurs="0"/>
 *         <element name="Nclsr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}Max2MBBinary"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.001.001.01}PartyAndSignature2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document9", propOrder = {
    "tp",
    "id",
    "frmt",
    "nclsr",
    "dgtlSgntr"
})
public class Document9 {

    @XmlElement(name = "Tp", required = true)
    protected UndertakingDocumentType1Choice tp;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Frmt")
    protected DocumentFormat1Choice frmt;
    @XmlElement(name = "Nclsr", required = true)
    protected byte[] nclsr;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDocumentType1Choice }
     *     
     */
    public UndertakingDocumentType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDocumentType1Choice }
     *     
     */
    public void setTp(UndertakingDocumentType1Choice value) {
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

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
    }

}
