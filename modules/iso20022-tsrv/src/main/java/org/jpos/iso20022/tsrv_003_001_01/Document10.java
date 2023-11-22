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

package org.jpos.iso20022.tsrv_003_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DocTp" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}UndertakingDocumentType2Choice"/>
 *         <element name="PresntnChanl" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}Channel1Choice" minOccurs="0"/>
 *         <element name="DocFrmt" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}DocumentFormat1Choice" minOccurs="0"/>
 *         <element name="CpyInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SgndInd" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document10", propOrder = {
    "docTp",
    "presntnChanl",
    "docFrmt",
    "cpyInd",
    "sgndInd"
})
public class Document10 {

    @XmlElement(name = "DocTp", required = true)
    protected UndertakingDocumentType2Choice docTp;
    @XmlElement(name = "PresntnChanl")
    protected Channel1Choice presntnChanl;
    @XmlElement(name = "DocFrmt")
    protected DocumentFormat1Choice docFrmt;
    @XmlElement(name = "CpyInd")
    protected Boolean cpyInd;
    @XmlElement(name = "SgndInd")
    protected Boolean sgndInd;

    /**
     * Gets the value of the docTp property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingDocumentType2Choice }
     *     
     */
    public UndertakingDocumentType2Choice getDocTp() {
        return docTp;
    }

    /**
     * Sets the value of the docTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingDocumentType2Choice }
     *     
     */
    public void setDocTp(UndertakingDocumentType2Choice value) {
        this.docTp = value;
    }

    /**
     * Gets the value of the presntnChanl property.
     * 
     * @return
     *     possible object is
     *     {@link Channel1Choice }
     *     
     */
    public Channel1Choice getPresntnChanl() {
        return presntnChanl;
    }

    /**
     * Sets the value of the presntnChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Channel1Choice }
     *     
     */
    public void setPresntnChanl(Channel1Choice value) {
        this.presntnChanl = value;
    }

    /**
     * Gets the value of the docFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public DocumentFormat1Choice getDocFrmt() {
        return docFrmt;
    }

    /**
     * Sets the value of the docFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFormat1Choice }
     *     
     */
    public void setDocFrmt(DocumentFormat1Choice value) {
        this.docFrmt = value;
    }

    /**
     * Gets the value of the cpyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCpyInd() {
        return cpyInd;
    }

    /**
     * Sets the value of the cpyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCpyInd(Boolean value) {
        this.cpyInd = value;
    }

    /**
     * Gets the value of the sgndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSgndInd() {
        return sgndInd;
    }

    /**
     * Sets the value of the sgndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSgndInd(Boolean value) {
        this.sgndInd = value;
    }

}
