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

package org.jpos.iso20022.reda_004_001_06;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValuationDealingProcessingCharacteristics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ValuationDealingProcessingCharacteristics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValtnFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}EventFrequency5Code" minOccurs="0"/>
 *         <element name="ValtnFrqcyDesc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max350Text" minOccurs="0"/>
 *         <element name="ValtnTm" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISOTime" minOccurs="0"/>
 *         <element name="DcmlstnUnits" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="DcmlstnPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="DualFndInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="PricMtd" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}PriceMethod1Code" minOccurs="0"/>
 *         <element name="PricCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ActiveCurrencyCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValuationDealingProcessingCharacteristics3", propOrder = {
    "valtnFrqcy",
    "valtnFrqcyDesc",
    "valtnTm",
    "dcmlstnUnits",
    "dcmlstnPric",
    "dualFndInd",
    "pricMtd",
    "pricCcy",
    "addtlInf"
})
public class ValuationDealingProcessingCharacteristics3 {

    @XmlElement(name = "ValtnFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency5Code valtnFrqcy;
    @XmlElement(name = "ValtnFrqcyDesc")
    protected String valtnFrqcyDesc;
    @XmlElement(name = "ValtnTm")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar valtnTm;
    @XmlElement(name = "DcmlstnUnits")
    protected BigDecimal dcmlstnUnits;
    @XmlElement(name = "DcmlstnPric")
    protected BigDecimal dcmlstnPric;
    @XmlElement(name = "DualFndInd")
    protected Boolean dualFndInd;
    @XmlElement(name = "PricMtd")
    @XmlSchemaType(name = "string")
    protected PriceMethod1Code pricMtd;
    @XmlElement(name = "PricCcy")
    protected List<String> pricCcy;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the valtnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency5Code }
     *     
     */
    public EventFrequency5Code getValtnFrqcy() {
        return valtnFrqcy;
    }

    /**
     * Sets the value of the valtnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency5Code }
     *     
     */
    public void setValtnFrqcy(EventFrequency5Code value) {
        this.valtnFrqcy = value;
    }

    /**
     * Gets the value of the valtnFrqcyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValtnFrqcyDesc() {
        return valtnFrqcyDesc;
    }

    /**
     * Sets the value of the valtnFrqcyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValtnFrqcyDesc(String value) {
        this.valtnFrqcyDesc = value;
    }

    /**
     * Gets the value of the valtnTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValtnTm() {
        return valtnTm;
    }

    /**
     * Sets the value of the valtnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValtnTm(XMLGregorianCalendar value) {
        this.valtnTm = value;
    }

    /**
     * Gets the value of the dcmlstnUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlstnUnits() {
        return dcmlstnUnits;
    }

    /**
     * Sets the value of the dcmlstnUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDcmlstnUnits(BigDecimal value) {
        this.dcmlstnUnits = value;
    }

    /**
     * Gets the value of the dcmlstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDcmlstnPric() {
        return dcmlstnPric;
    }

    /**
     * Sets the value of the dcmlstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDcmlstnPric(BigDecimal value) {
        this.dcmlstnPric = value;
    }

    /**
     * Gets the value of the dualFndInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDualFndInd() {
        return dualFndInd;
    }

    /**
     * Sets the value of the dualFndInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDualFndInd(Boolean value) {
        this.dualFndInd = value;
    }

    /**
     * Gets the value of the pricMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PriceMethod1Code }
     *     
     */
    public PriceMethod1Code getPricMtd() {
        return pricMtd;
    }

    /**
     * Sets the value of the pricMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceMethod1Code }
     *     
     */
    public void setPricMtd(PriceMethod1Code value) {
        this.pricMtd = value;
    }

    /**
     * Gets the value of the pricCcy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricCcy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricCcy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the pricCcy property.
     */
    public List<String> getPricCcy() {
        if (pricCcy == null) {
            pricCcy = new ArrayList<>();
        }
        return this.pricCcy;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
