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

package org.jpos.iso20022.tsin_007_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValidationStatusInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValidationStatusInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}TechnicalValidationStatus1Code"/>
 *         <element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}StatusReason4Choice" minOccurs="0"/>
 *         <element name="AddtlStsRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.007.001.01}Max105Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValidationStatusInformation1", propOrder = {
    "sts",
    "stsRsn",
    "addtlStsRsnInf"
})
public class ValidationStatusInformation1 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected TechnicalValidationStatus1Code sts;
    @XmlElement(name = "StsRsn")
    protected StatusReason4Choice stsRsn;
    @XmlElement(name = "AddtlStsRsnInf")
    protected List<String> addtlStsRsnInf;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalValidationStatus1Code }
     *     
     */
    public TechnicalValidationStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalValidationStatus1Code }
     *     
     */
    public void setSts(TechnicalValidationStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link StatusReason4Choice }
     *     
     */
    public StatusReason4Choice getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusReason4Choice }
     *     
     */
    public void setStsRsn(StatusReason4Choice value) {
        this.stsRsn = value;
    }

    /**
     * Gets the value of the addtlStsRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlStsRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlStsRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlStsRsnInf property.
     */
    public List<String> getAddtlStsRsnInf() {
        if (addtlStsRsnInf == null) {
            addtlStsRsnInf = new ArrayList<>();
        }
        return this.addtlStsRsnInf;
    }

}
