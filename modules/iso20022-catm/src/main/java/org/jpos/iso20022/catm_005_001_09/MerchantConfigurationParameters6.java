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

package org.jpos.iso20022.catm_005_001_09;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MerchantConfigurationParameters6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MerchantConfigurationParameters6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="MrchntId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max256Text" minOccurs="0"/>
 *         <element name="ParamFrmtIdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max8Text" minOccurs="0"/>
 *         <element name="Prxy" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}NetworkParameters8" minOccurs="0"/>
 *         <element name="OthrParamsLngth" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetStart" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetEnd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="OthrParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MerchantConfigurationParameters6", propOrder = {
    "actnTp",
    "mrchntId",
    "vrsn",
    "paramFrmtIdr",
    "prxy",
    "othrParamsLngth",
    "offsetStart",
    "offsetEnd",
    "othrParams"
})
public class MerchantConfigurationParameters6 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "MrchntId")
    protected String mrchntId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ParamFrmtIdr")
    protected String paramFrmtIdr;
    @XmlElement(name = "Prxy")
    protected NetworkParameters8 prxy;
    @XmlElement(name = "OthrParamsLngth")
    protected BigDecimal othrParamsLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
    @XmlElement(name = "OthrParams")
    protected byte[] othrParams;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public TerminalManagementAction3Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementAction3Code }
     *     
     */
    public void setActnTp(TerminalManagementAction3Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the mrchntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMrchntId() {
        return mrchntId;
    }

    /**
     * Sets the value of the mrchntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMrchntId(String value) {
        this.mrchntId = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the paramFrmtIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParamFrmtIdr() {
        return paramFrmtIdr;
    }

    /**
     * Sets the value of the paramFrmtIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParamFrmtIdr(String value) {
        this.paramFrmtIdr = value;
    }

    /**
     * Gets the value of the prxy property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters8 }
     *     
     */
    public NetworkParameters8 getPrxy() {
        return prxy;
    }

    /**
     * Sets the value of the prxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters8 }
     *     
     */
    public void setPrxy(NetworkParameters8 value) {
        this.prxy = value;
    }

    /**
     * Gets the value of the othrParamsLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOthrParamsLngth() {
        return othrParamsLngth;
    }

    /**
     * Sets the value of the othrParamsLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOthrParamsLngth(BigDecimal value) {
        this.othrParamsLngth = value;
    }

    /**
     * Gets the value of the offsetStart property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetStart() {
        return offsetStart;
    }

    /**
     * Sets the value of the offsetStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetStart(BigDecimal value) {
        this.offsetStart = value;
    }

    /**
     * Gets the value of the offsetEnd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOffsetEnd() {
        return offsetEnd;
    }

    /**
     * Sets the value of the offsetEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOffsetEnd(BigDecimal value) {
        this.offsetEnd = value;
    }

    /**
     * Gets the value of the othrParams property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getOthrParams() {
        return othrParams;
    }

    /**
     * Sets the value of the othrParams property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setOthrParams(byte[] value) {
        this.othrParams = value;
    }

}
