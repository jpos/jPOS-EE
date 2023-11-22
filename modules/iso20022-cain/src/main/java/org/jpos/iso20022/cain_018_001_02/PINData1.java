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

package org.jpos.iso20022.cain_018_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PINData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PINData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctrl" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Exact1HexBinaryText" minOccurs="0"/>
 *         <element name="KeySetIdr" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max8NumericText" minOccurs="0"/>
 *         <element name="DrvdInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max32HexBinaryText" minOccurs="0"/>
 *         <element name="Algo" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max2NumericText" minOccurs="0"/>
 *         <element name="KeyLngth" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max4NumericText" minOccurs="0"/>
 *         <element name="KeyPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max2NumericText" minOccurs="0"/>
 *         <element name="KeyIndx" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max5NumericText" minOccurs="0"/>
 *         <element name="PINBlckFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max2NumericText"/>
 *         <element name="NcrptdPINBlck" type="{urn:iso:std:iso:20022:tech:xsd:cain.018.001.02}Max16HexBinaryText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PINData1", propOrder = {
    "ctrl",
    "keySetIdr",
    "drvdInf",
    "algo",
    "keyLngth",
    "keyPrtcn",
    "keyIndx",
    "pinBlckFrmt",
    "ncrptdPINBlck"
})
public class PINData1 {

    @XmlElement(name = "Ctrl")
    protected String ctrl;
    @XmlElement(name = "KeySetIdr")
    protected String keySetIdr;
    @XmlElement(name = "DrvdInf")
    protected String drvdInf;
    @XmlElement(name = "Algo")
    protected String algo;
    @XmlElement(name = "KeyLngth")
    protected String keyLngth;
    @XmlElement(name = "KeyPrtcn")
    protected String keyPrtcn;
    @XmlElement(name = "KeyIndx")
    protected String keyIndx;
    @XmlElement(name = "PINBlckFrmt", required = true)
    protected String pinBlckFrmt;
    @XmlElement(name = "NcrptdPINBlck", required = true)
    protected String ncrptdPINBlck;

    /**
     * Gets the value of the ctrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrl() {
        return ctrl;
    }

    /**
     * Sets the value of the ctrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrl(String value) {
        this.ctrl = value;
    }

    /**
     * Gets the value of the keySetIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeySetIdr() {
        return keySetIdr;
    }

    /**
     * Sets the value of the keySetIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeySetIdr(String value) {
        this.keySetIdr = value;
    }

    /**
     * Gets the value of the drvdInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrvdInf() {
        return drvdInf;
    }

    /**
     * Sets the value of the drvdInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrvdInf(String value) {
        this.drvdInf = value;
    }

    /**
     * Gets the value of the algo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlgo() {
        return algo;
    }

    /**
     * Sets the value of the algo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlgo(String value) {
        this.algo = value;
    }

    /**
     * Gets the value of the keyLngth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyLngth() {
        return keyLngth;
    }

    /**
     * Sets the value of the keyLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyLngth(String value) {
        this.keyLngth = value;
    }

    /**
     * Gets the value of the keyPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyPrtcn() {
        return keyPrtcn;
    }

    /**
     * Sets the value of the keyPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyPrtcn(String value) {
        this.keyPrtcn = value;
    }

    /**
     * Gets the value of the keyIndx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyIndx() {
        return keyIndx;
    }

    /**
     * Sets the value of the keyIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyIndx(String value) {
        this.keyIndx = value;
    }

    /**
     * Gets the value of the pinBlckFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPINBlckFrmt() {
        return pinBlckFrmt;
    }

    /**
     * Sets the value of the pinBlckFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPINBlckFrmt(String value) {
        this.pinBlckFrmt = value;
    }

    /**
     * Gets the value of the ncrptdPINBlck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcrptdPINBlck() {
        return ncrptdPINBlck;
    }

    /**
     * Sets the value of the ncrptdPINBlck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcrptdPINBlck(String value) {
        this.ncrptdPINBlck = value;
    }

}
