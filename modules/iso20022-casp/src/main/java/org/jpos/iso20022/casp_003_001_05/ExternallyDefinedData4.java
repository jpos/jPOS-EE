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

package org.jpos.iso20022.casp_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternallyDefinedData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExternallyDefinedData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:casp.003.001.05}Max1025Text"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:casp.003.001.05}Max100KBinary" minOccurs="0"/>
 *         <element name="PrtctdVal" type="{urn:iso:std:iso:20022:tech:xsd:casp.003.001.05}ContentInformationType34" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:casp.003.001.05}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternallyDefinedData4", propOrder = {
    "id",
    "val",
    "prtctdVal",
    "tp"
})
public class ExternallyDefinedData4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Val")
    protected byte[] val;
    @XmlElement(name = "PrtctdVal")
    protected ContentInformationType34 prtctdVal;
    @XmlElement(name = "Tp")
    protected String tp;

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
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setVal(byte[] value) {
        this.val = value;
    }

    /**
     * Gets the value of the prtctdVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getPrtctdVal() {
        return prtctdVal;
    }

    /**
     * Sets the value of the prtctdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public void setPrtctdVal(ContentInformationType34 value) {
        this.prtctdVal = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

}
