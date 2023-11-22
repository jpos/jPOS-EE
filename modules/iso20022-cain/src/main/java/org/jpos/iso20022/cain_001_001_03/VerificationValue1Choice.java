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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VerificationValue1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VerificationValue1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="TxtVal" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max2048Text"/>
 *         <element name="BinryVal" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max5000Binary"/>
 *         <element name="HexBinryVal" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max9999HexBinaryText"/>
 *         <element name="PINData" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PINData1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VerificationValue1Choice", propOrder = {
    "txtVal",
    "binryVal",
    "hexBinryVal",
    "pinData"
})
public class VerificationValue1Choice {

    @XmlElement(name = "TxtVal")
    protected String txtVal;
    @XmlElement(name = "BinryVal")
    protected byte[] binryVal;
    @XmlElement(name = "HexBinryVal")
    protected String hexBinryVal;
    @XmlElement(name = "PINData")
    protected PINData1 pinData;

    /**
     * Gets the value of the txtVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxtVal() {
        return txtVal;
    }

    /**
     * Sets the value of the txtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxtVal(String value) {
        this.txtVal = value;
    }

    /**
     * Gets the value of the binryVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinryVal() {
        return binryVal;
    }

    /**
     * Sets the value of the binryVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinryVal(byte[] value) {
        this.binryVal = value;
    }

    /**
     * Gets the value of the hexBinryVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexBinryVal() {
        return hexBinryVal;
    }

    /**
     * Sets the value of the hexBinryVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexBinryVal(String value) {
        this.hexBinryVal = value;
    }

    /**
     * Gets the value of the pinData property.
     * 
     * @return
     *     possible object is
     *     {@link PINData1 }
     *     
     */
    public PINData1 getPINData() {
        return pinData;
    }

    /**
     * Sets the value of the pinData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINData1 }
     *     
     */
    public void setPINData(PINData1 value) {
        this.pinData = value;
    }

}
