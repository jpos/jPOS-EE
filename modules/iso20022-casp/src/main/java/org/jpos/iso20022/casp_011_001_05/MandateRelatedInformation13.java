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

package org.jpos.iso20022.casp_011_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateRelatedInformation13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateRelatedInformation13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}Max35Text"/>
 *         <element name="DtOfSgntr" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}ISODate" minOccurs="0"/>
 *         <element name="MndtImg" type="{urn:iso:std:iso:20022:tech:xsd:casp.011.001.05}Max2MBBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateRelatedInformation13", propOrder = {
    "mndtId",
    "dtOfSgntr",
    "mndtImg"
})
public class MandateRelatedInformation13 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "DtOfSgntr")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfSgntr;
    @XmlElement(name = "MndtImg")
    protected byte[] mndtImg;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

    /**
     * Gets the value of the dtOfSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfSgntr() {
        return dtOfSgntr;
    }

    /**
     * Sets the value of the dtOfSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfSgntr(XMLGregorianCalendar value) {
        this.dtOfSgntr = value;
    }

    /**
     * Gets the value of the mndtImg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMndtImg() {
        return mndtImg;
    }

    /**
     * Sets the value of the mndtImg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMndtImg(byte[] value) {
        this.mndtImg = value;
    }

}
