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

package org.jpos.iso20022.casp_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceSendApplicationProtocolDataUnitCardReaderRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceSendApplicationProtocolDataUnitCardReaderRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Clss" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary"/>
 *         <element name="Instr" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary"/>
 *         <element name="Param1" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary"/>
 *         <element name="Param2" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary"/>
 *         <element name="Data" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary" minOccurs="0"/>
 *         <element name="XpctdLngth" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Min1Max256Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceSendApplicationProtocolDataUnitCardReaderRequest1", propOrder = {
    "clss",
    "instr",
    "param1",
    "param2",
    "data",
    "xpctdLngth"
})
public class DeviceSendApplicationProtocolDataUnitCardReaderRequest1 {

    @XmlElement(name = "Clss", required = true)
    protected byte[] clss;
    @XmlElement(name = "Instr", required = true)
    protected byte[] instr;
    @XmlElement(name = "Param1", required = true)
    protected byte[] param1;
    @XmlElement(name = "Param2", required = true)
    protected byte[] param2;
    @XmlElement(name = "Data")
    protected byte[] data;
    @XmlElement(name = "XpctdLngth")
    protected byte[] xpctdLngth;

    /**
     * Gets the value of the clss property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getClss() {
        return clss;
    }

    /**
     * Sets the value of the clss property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setClss(byte[] value) {
        this.clss = value;
    }

    /**
     * Gets the value of the instr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getInstr() {
        return instr;
    }

    /**
     * Sets the value of the instr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setInstr(byte[] value) {
        this.instr = value;
    }

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setParam1(byte[] value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setParam2(byte[] value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setData(byte[] value) {
        this.data = value;
    }

    /**
     * Gets the value of the xpctdLngth property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getXpctdLngth() {
        return xpctdLngth;
    }

    /**
     * Sets the value of the xpctdLngth property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setXpctdLngth(byte[] value) {
        this.xpctdLngth = value;
    }

}
