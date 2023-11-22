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
 * <p>Java class for ApplicationParameters12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ApplicationParameters12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}TerminalManagementAction3Code"/>
 *         <element name="ApplId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max35Text"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max256Text" minOccurs="0"/>
 *         <element name="ParamFrmtIdr" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max8Text" minOccurs="0"/>
 *         <element name="ParamsLngth" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetStart" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="OffsetEnd" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}PositiveNumber" minOccurs="0"/>
 *         <element name="Params" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max100KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NcrptdParams" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}ContentInformationType35" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationParameters12", propOrder = {
    "actnTp",
    "applId",
    "vrsn",
    "paramFrmtIdr",
    "paramsLngth",
    "offsetStart",
    "offsetEnd",
    "params",
    "ncrptdParams"
})
public class ApplicationParameters12 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementAction3Code actnTp;
    @XmlElement(name = "ApplId", required = true)
    protected String applId;
    @XmlElement(name = "Vrsn")
    protected String vrsn;
    @XmlElement(name = "ParamFrmtIdr")
    protected String paramFrmtIdr;
    @XmlElement(name = "ParamsLngth")
    protected BigDecimal paramsLngth;
    @XmlElement(name = "OffsetStart")
    protected BigDecimal offsetStart;
    @XmlElement(name = "OffsetEnd")
    protected BigDecimal offsetEnd;
    @XmlElement(name = "Params")
    protected List<byte[]> params;
    @XmlElement(name = "NcrptdParams")
    protected ContentInformationType35 ncrptdParams;

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
     * Gets the value of the applId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplId() {
        return applId;
    }

    /**
     * Sets the value of the applId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplId(String value) {
        this.applId = value;
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
     * Gets the value of the paramsLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getParamsLngth() {
        return paramsLngth;
    }

    /**
     * Sets the value of the paramsLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setParamsLngth(BigDecimal value) {
        this.paramsLngth = value;
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
     * Gets the value of the params property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the params property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the params property.
     */
    public List<byte[]> getParams() {
        if (params == null) {
            params = new ArrayList<>();
        }
        return this.params;
    }

    /**
     * Gets the value of the ncrptdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getNcrptdParams() {
        return ncrptdParams;
    }

    /**
     * Sets the value of the ncrptdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public void setNcrptdParams(ContentInformationType35 value) {
        this.ncrptdParams = value;
    }

}
