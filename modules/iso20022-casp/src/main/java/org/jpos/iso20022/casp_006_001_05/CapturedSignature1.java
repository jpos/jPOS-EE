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

package org.jpos.iso20022.casp_006_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CapturedSignature1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CapturedSignature1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ImgFrmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max35Text"/>
 *         <element name="ImgData" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max2MBBinary" minOccurs="0"/>
 *         <element name="ImgRef" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max500Text" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapturedSignature1", propOrder = {
    "imgFrmt",
    "imgData",
    "imgRef",
    "addtlInf"
})
public class CapturedSignature1 {

    @XmlElement(name = "ImgFrmt", required = true)
    protected String imgFrmt;
    @XmlElement(name = "ImgData")
    protected byte[] imgData;
    @XmlElement(name = "ImgRef")
    protected String imgRef;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the imgFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgFrmt() {
        return imgFrmt;
    }

    /**
     * Sets the value of the imgFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgFrmt(String value) {
        this.imgFrmt = value;
    }

    /**
     * Gets the value of the imgData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getImgData() {
        return imgData;
    }

    /**
     * Sets the value of the imgData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setImgData(byte[] value) {
        this.imgData = value;
    }

    /**
     * Gets the value of the imgRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImgRef() {
        return imgRef;
    }

    /**
     * Sets the value of the imgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImgRef(String value) {
        this.imgRef = value;
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
