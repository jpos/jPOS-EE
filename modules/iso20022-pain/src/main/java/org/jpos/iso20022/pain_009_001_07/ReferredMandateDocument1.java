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

package org.jpos.iso20022.pain_009_001_07;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferredMandateDocument1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReferredMandateDocument1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:pain.009.001.07}ReferredDocumentType4" minOccurs="0"/>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:pain.009.001.07}Max35Text" minOccurs="0"/>
 *         <element name="CdtrRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.009.001.07}Max35Text" minOccurs="0"/>
 *         <element name="RltdDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.009.001.07}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferredMandateDocument1", propOrder = {
    "tp",
    "nb",
    "cdtrRef",
    "rltdDt"
})
public class ReferredMandateDocument1 {

    @XmlElement(name = "Tp")
    protected ReferredDocumentType4 tp;
    @XmlElement(name = "Nb")
    protected String nb;
    @XmlElement(name = "CdtrRef")
    protected String cdtrRef;
    @XmlElement(name = "RltdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rltdDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ReferredDocumentType4 }
     *     
     */
    public ReferredDocumentType4 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferredDocumentType4 }
     *     
     */
    public void setTp(ReferredDocumentType4 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNb(String value) {
        this.nb = value;
    }

    /**
     * Gets the value of the cdtrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdtrRef() {
        return cdtrRef;
    }

    /**
     * Sets the value of the cdtrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdtrRef(String value) {
        this.cdtrRef = value;
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

}
