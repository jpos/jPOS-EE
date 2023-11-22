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

package org.jpos.iso20022.fxtr_031_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PremiumAmount3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PremiumAmount3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrmQt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}PremiumQuote1Choice"/>
 *         <element name="PrmCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveOrHistoricCurrencyCode"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="DcmlPlcs" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Number"/>
 *         <element name="PrmSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ISODate"/>
 *         <element name="PyerPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max35Text"/>
 *         <element name="RcvrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumAmount3", propOrder = {
    "prmQt",
    "prmCcy",
    "amt",
    "dcmlPlcs",
    "prmSttlmDt",
    "pyerPtyRef",
    "rcvrPtyRef"
})
public class PremiumAmount3 {

    @XmlElement(name = "PrmQt", required = true)
    protected PremiumQuote1Choice prmQt;
    @XmlElement(name = "PrmCcy", required = true)
    protected String prmCcy;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DcmlPlcs", required = true)
    protected BigDecimal dcmlPlcs;
    @XmlElement(name = "PrmSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prmSttlmDt;
    @XmlElement(name = "PyerPtyRef", required = true)
    protected String pyerPtyRef;
    @XmlElement(name = "RcvrPtyRef", required = true)
    protected String rcvrPtyRef;

    /**
     * Gets the value of the prmQt property.
     * 
     * @return
     *     possible object is
     *     {@link PremiumQuote1Choice }
     *     
     */
    public PremiumQuote1Choice getPrmQt() {
        return prmQt;
    }

    /**
     * Sets the value of the prmQt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PremiumQuote1Choice }
     *     
     */
    public void setPrmQt(PremiumQuote1Choice value) {
        this.prmQt = value;
    }

    /**
     * Gets the value of the prmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmCcy() {
        return prmCcy;
    }

    /**
     * Sets the value of the prmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmCcy(String value) {
        this.prmCcy = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dcmlPlcs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlPlcs() {
        return dcmlPlcs;
    }

    /**
     * Sets the value of the dcmlPlcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDcmlPlcs(BigDecimal value) {
        this.dcmlPlcs = value;
    }

    /**
     * Gets the value of the prmSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrmSttlmDt() {
        return prmSttlmDt;
    }

    /**
     * Sets the value of the prmSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrmSttlmDt(XMLGregorianCalendar value) {
        this.prmSttlmDt = value;
    }

    /**
     * Gets the value of the pyerPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPyerPtyRef() {
        return pyerPtyRef;
    }

    /**
     * Sets the value of the pyerPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPyerPtyRef(String value) {
        this.pyerPtyRef = value;
    }

    /**
     * Gets the value of the rcvrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcvrPtyRef() {
        return rcvrPtyRef;
    }

    /**
     * Sets the value of the rcvrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcvrPtyRef(String value) {
        this.rcvrPtyRef = value;
    }

}
