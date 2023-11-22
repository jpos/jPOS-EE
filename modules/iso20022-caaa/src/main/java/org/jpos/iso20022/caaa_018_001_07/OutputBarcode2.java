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

package org.jpos.iso20022.caaa_018_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutputBarcode2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OutputBarcode2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BrcdTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}BarcodeType1Code"/>
 *         <element name="BrcdVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Max8000Text" minOccurs="0"/>
 *         <element name="QRCdBinryVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Max3000Binary" minOccurs="0"/>
 *         <element name="QRCdVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Max16Text" minOccurs="0"/>
 *         <element name="QRCdNcodgMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}QRCodeEncodingMode1Code" minOccurs="0"/>
 *         <element name="QRCdErrCrrctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}QRCodeErrorCorrection1Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputBarcode2", propOrder = {
    "brcdTp",
    "brcdVal",
    "qrCdBinryVal",
    "qrCdVrsn",
    "qrCdNcodgMd",
    "qrCdErrCrrctn"
})
public class OutputBarcode2 {

    @XmlElement(name = "BrcdTp", required = true)
    @XmlSchemaType(name = "string")
    protected BarcodeType1Code brcdTp;
    @XmlElement(name = "BrcdVal")
    protected String brcdVal;
    @XmlElement(name = "QRCdBinryVal")
    protected byte[] qrCdBinryVal;
    @XmlElement(name = "QRCdVrsn")
    protected String qrCdVrsn;
    @XmlElement(name = "QRCdNcodgMd")
    @XmlSchemaType(name = "string")
    protected QRCodeEncodingMode1Code qrCdNcodgMd;
    @XmlElement(name = "QRCdErrCrrctn")
    @XmlSchemaType(name = "string")
    protected QRCodeErrorCorrection1Code qrCdErrCrrctn;

    /**
     * Gets the value of the brcdTp property.
     * 
     * @return
     *     possible object is
     *     {@link BarcodeType1Code }
     *     
     */
    public BarcodeType1Code getBrcdTp() {
        return brcdTp;
    }

    /**
     * Sets the value of the brcdTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BarcodeType1Code }
     *     
     */
    public void setBrcdTp(BarcodeType1Code value) {
        this.brcdTp = value;
    }

    /**
     * Gets the value of the brcdVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrcdVal() {
        return brcdVal;
    }

    /**
     * Sets the value of the brcdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrcdVal(String value) {
        this.brcdVal = value;
    }

    /**
     * Gets the value of the qrCdBinryVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getQRCdBinryVal() {
        return qrCdBinryVal;
    }

    /**
     * Sets the value of the qrCdBinryVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setQRCdBinryVal(byte[] value) {
        this.qrCdBinryVal = value;
    }

    /**
     * Gets the value of the qrCdVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQRCdVrsn() {
        return qrCdVrsn;
    }

    /**
     * Sets the value of the qrCdVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQRCdVrsn(String value) {
        this.qrCdVrsn = value;
    }

    /**
     * Gets the value of the qrCdNcodgMd property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeEncodingMode1Code }
     *     
     */
    public QRCodeEncodingMode1Code getQRCdNcodgMd() {
        return qrCdNcodgMd;
    }

    /**
     * Sets the value of the qrCdNcodgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeEncodingMode1Code }
     *     
     */
    public void setQRCdNcodgMd(QRCodeEncodingMode1Code value) {
        this.qrCdNcodgMd = value;
    }

    /**
     * Gets the value of the qrCdErrCrrctn property.
     * 
     * @return
     *     possible object is
     *     {@link QRCodeErrorCorrection1Code }
     *     
     */
    public QRCodeErrorCorrection1Code getQRCdErrCrrctn() {
        return qrCdErrCrrctn;
    }

    /**
     * Sets the value of the qrCdErrCrrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRCodeErrorCorrection1Code }
     *     
     */
    public void setQRCdErrCrrctn(QRCodeErrorCorrection1Code value) {
        this.qrCdErrCrrctn = value;
    }

}
