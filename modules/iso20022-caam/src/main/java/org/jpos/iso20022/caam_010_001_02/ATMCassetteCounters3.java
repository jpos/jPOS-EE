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

package org.jpos.iso20022.caam_010_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCassetteCounters3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCassetteCounters3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnitVal" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="MdiaCtgy" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMMediaType3Code" minOccurs="0"/>
 *         <element name="CurNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}Number"/>
 *         <element name="CurAmt" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="FlowTtls" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMCassetteCounters4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCassetteCounters3", propOrder = {
    "unitVal",
    "ccy",
    "mdiaCtgy",
    "curNb",
    "curAmt",
    "flowTtls"
})
public class ATMCassetteCounters3 {

    @XmlElement(name = "UnitVal")
    protected BigDecimal unitVal;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "MdiaCtgy")
    @XmlSchemaType(name = "string")
    protected ATMMediaType3Code mdiaCtgy;
    @XmlElement(name = "CurNb", required = true)
    protected BigDecimal curNb;
    @XmlElement(name = "CurAmt")
    protected BigDecimal curAmt;
    @XmlElement(name = "FlowTtls")
    protected List<ATMCassetteCounters4> flowTtls;

    /**
     * Gets the value of the unitVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitVal() {
        return unitVal;
    }

    /**
     * Sets the value of the unitVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitVal(BigDecimal value) {
        this.unitVal = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the mdiaCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public ATMMediaType3Code getMdiaCtgy() {
        return mdiaCtgy;
    }

    /**
     * Sets the value of the mdiaCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMediaType3Code }
     *     
     */
    public void setMdiaCtgy(ATMMediaType3Code value) {
        this.mdiaCtgy = value;
    }

    /**
     * Gets the value of the curNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurNb() {
        return curNb;
    }

    /**
     * Sets the value of the curNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurNb(BigDecimal value) {
        this.curNb = value;
    }

    /**
     * Gets the value of the curAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurAmt() {
        return curAmt;
    }

    /**
     * Sets the value of the curAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurAmt(BigDecimal value) {
        this.curAmt = value;
    }

    /**
     * Gets the value of the flowTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the flowTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlowTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassetteCounters4 }
     * 
     * 
     * @return
     *     The value of the flowTtls property.
     */
    public List<ATMCassetteCounters4> getFlowTtls() {
        if (flowTtls == null) {
            flowTtls = new ArrayList<>();
        }
        return this.flowTtls;
    }

}
