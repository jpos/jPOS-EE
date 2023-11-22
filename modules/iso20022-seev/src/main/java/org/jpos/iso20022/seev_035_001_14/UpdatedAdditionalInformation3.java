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

package org.jpos.iso20022.seev_035_001_14;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatedAdditionalInformation3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UpdatedAdditionalInformation3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UpdDesc" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}Max140Text" minOccurs="0"/>
 *         <element name="UpdDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}ISODate" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}Max350Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatedAdditionalInformation3", propOrder = {
    "updDesc",
    "updDt",
    "addtlInf"
})
public class UpdatedAdditionalInformation3 {

    @XmlElement(name = "UpdDesc")
    protected String updDesc;
    @XmlElement(name = "UpdDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updDt;
    @XmlElement(name = "AddtlInf", required = true)
    protected String addtlInf;

    /**
     * Gets the value of the updDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdDesc() {
        return updDesc;
    }

    /**
     * Sets the value of the updDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdDesc(String value) {
        this.updDesc = value;
    }

    /**
     * Gets the value of the updDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdDt() {
        return updDt;
    }

    /**
     * Sets the value of the updDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdDt(XMLGregorianCalendar value) {
        this.updDt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
