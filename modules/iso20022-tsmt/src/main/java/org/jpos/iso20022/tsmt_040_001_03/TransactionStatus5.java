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

package org.jpos.iso20022.tsmt_040_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionStatus5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.040.001.03}BaselineStatus3Code"/>
 *         <element name="ChngDtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.040.001.03}ISODateTime"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.040.001.03}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus5", propOrder = {
    "sts",
    "chngDtTm",
    "desc"
})
public class TransactionStatus5 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected BaselineStatus3Code sts;
    @XmlElement(name = "ChngDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar chngDtTm;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineStatus3Code }
     *     
     */
    public BaselineStatus3Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineStatus3Code }
     *     
     */
    public void setSts(BaselineStatus3Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the chngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChngDtTm() {
        return chngDtTm;
    }

    /**
     * Sets the value of the chngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChngDtTm(XMLGregorianCalendar value) {
        this.chngDtTm = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

}
