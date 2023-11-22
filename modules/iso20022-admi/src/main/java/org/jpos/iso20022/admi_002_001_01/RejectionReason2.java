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

package org.jpos.iso20022.admi_002_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RejectionReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RejectionReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctgPtyRsn" type="{urn:iso:std:iso:20022:tech:xsd:admi.002.001.01}Max35Text"/>
 *         <element name="RjctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:admi.002.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="ErrLctn" type="{urn:iso:std:iso:20022:tech:xsd:admi.002.001.01}Max350Text" minOccurs="0"/>
 *         <element name="RsnDesc" type="{urn:iso:std:iso:20022:tech:xsd:admi.002.001.01}Max350Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:admi.002.001.01}Max20000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectionReason2", propOrder = {
    "rjctgPtyRsn",
    "rjctnDtTm",
    "errLctn",
    "rsnDesc",
    "addtlData"
})
public class RejectionReason2 {

    @XmlElement(name = "RjctgPtyRsn", required = true)
    protected String rjctgPtyRsn;
    @XmlElement(name = "RjctnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rjctnDtTm;
    @XmlElement(name = "ErrLctn")
    protected String errLctn;
    @XmlElement(name = "RsnDesc")
    protected String rsnDesc;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the rjctgPtyRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctgPtyRsn() {
        return rjctgPtyRsn;
    }

    /**
     * Sets the value of the rjctgPtyRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctgPtyRsn(String value) {
        this.rjctgPtyRsn = value;
    }

    /**
     * Gets the value of the rjctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRjctnDtTm() {
        return rjctnDtTm;
    }

    /**
     * Sets the value of the rjctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRjctnDtTm(XMLGregorianCalendar value) {
        this.rjctnDtTm = value;
    }

    /**
     * Gets the value of the errLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrLctn() {
        return errLctn;
    }

    /**
     * Sets the value of the errLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrLctn(String value) {
        this.errLctn = value;
    }

    /**
     * Gets the value of the rsnDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsnDesc() {
        return rsnDesc;
    }

    /**
     * Sets the value of the rsnDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsnDesc(String value) {
        this.rsnDesc = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
