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

package org.jpos.iso20022.tsin_001_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferredDocumentInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReferredDocumentInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ReferredDocumentType1" minOccurs="0"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Max35Text" minOccurs="0"/>
 *         <element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ISODate" minOccurs="0"/>
 *         <element name="DocAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredDocumentInformation2", propOrder = {
    "tp",
    "docNb",
    "rltdDt",
    "docAmt"
})
public class ReferredDocumentInformation2 {

    @XmlElement(name = "Tp")
    protected ReferredDocumentType1 tp;
    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "RltdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rltdDt;
    @XmlElement(name = "DocAmt")
    protected ActiveCurrencyAndAmount docAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public ReferredDocumentType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType1 }
     *     
     */
    public void setTp(ReferredDocumentType1 value) {
        this.tp = value;
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
     * Gets the value of the rltdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRltdDt() {
        return rltdDt;
    }

    /**
     * Sets the value of the rltdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRltdDt(XMLGregorianCalendar value) {
        this.rltdDt = value;
    }

    /**
     * Gets the value of the docAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDocAmt() {
        return docAmt;
    }

    /**
     * Sets the value of the docAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDocAmt(ActiveCurrencyAndAmount value) {
        this.docAmt = value;
    }

}
