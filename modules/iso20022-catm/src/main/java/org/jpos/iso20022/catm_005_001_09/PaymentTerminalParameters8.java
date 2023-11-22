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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTerminalParameters8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTerminalParameters8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="VndrId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max256Text" minOccurs="0"/>
 *         <element name="ParamFrmtIdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max8Text" minOccurs="0"/>
 *         <element name="ClckSynctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ClockSynchronisation3" minOccurs="0"/>
 *         <element name="TmZoneLine" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}LocalDateTime1" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PaymentTerminalParameters8", propOrder = {
    "actnTp",
    "vndrId",
    "vrsn",
    "paramFrmtIdr",
    "clckSynctn",
    "tmZoneLine",
    "lclDtTm",
    "othrParamsLngth",
    "offsetStart",
    "offsetEnd",
    "othrParams"
})
public class PaymentTerminalParameters8 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "VndrId")
    protected String vndrId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ParamFrmtIdr")
    protected String paramFrmtIdr;
    @XmlElement(name = "ClckSynctn")
    protected ClockSynchronisation3 clckSynctn;
    @XmlElement(name = "TmZoneLine")
    protected List<String> tmZoneLine;
    @XmlElement(name = "LclDtTm")
    protected List<LocalDateTime1> lclDtTm;
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
     * Gets the value of the vndrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVndrId() {
        return vndrId;
    }

    /**
     * Sets the value of the vndrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVndrId(String value) {
        this.vndrId = value;
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
     * Gets the value of the clckSynctn property.
     * 
     * @return
     *     possible object is
     *     {@link ClockSynchronisation3 }
     *     
     */
    public ClockSynchronisation3 getClckSynctn() {
        return clckSynctn;
    }

    /**
     * Sets the value of the clckSynctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClockSynchronisation3 }
     *     
     */
    public void setClckSynctn(ClockSynchronisation3 value) {
        this.clckSynctn = value;
    }

    /**
     * Gets the value of the tmZoneLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tmZoneLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTmZoneLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the tmZoneLine property.
     */
    public List<String> getTmZoneLine() {
        if (tmZoneLine == null) {
            tmZoneLine = new ArrayList<>();
        }
        return this.tmZoneLine;
    }

    /**
     * Gets the value of the lclDtTm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclDtTm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclDtTm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocalDateTime1 }
     * 
     * 
     * @return
     *     The value of the lclDtTm property.
     */
    public List<LocalDateTime1> getLclDtTm() {
        if (lclDtTm == null) {
            lclDtTm = new ArrayList<>();
        }
        return this.lclDtTm;
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
