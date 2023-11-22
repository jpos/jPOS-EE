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

package org.jpos.iso20022.camt_045_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetCashForecast4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetCashForecast4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshSttlmDt" type="{urn:swift:xsd:camt.045.001.03}ISODate"/>
 *         <element name="NetAmt" type="{urn:swift:xsd:camt.045.001.03}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetUnitsNb" type="{urn:swift:xsd:camt.045.001.03}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="FlowDrctn" type="{urn:swift:xsd:camt.045.001.03}FlowDirectionType1Code"/>
 *         <element name="AddtlBal" type="{urn:swift:xsd:camt.045.001.03}FundBalance1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetCashForecast4", propOrder = {
    "cshSttlmDt",
    "netAmt",
    "netUnitsNb",
    "flowDrctn",
    "addtlBal"
})
public class NetCashForecast4 {

    @XmlElement(name = "CshSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "NetAmt")
    protected ActiveOrHistoricCurrencyAndAmount netAmt;
    @XmlElement(name = "NetUnitsNb")
    protected FinancialInstrumentQuantity1 netUnitsNb;
    @XmlElement(name = "FlowDrctn", required = true)
    @XmlSchemaType(name = "string")
    protected FlowDirectionType1Code flowDrctn;
    @XmlElement(name = "AddtlBal")
    protected FundBalance1 addtlBal;

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setNetAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the netUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getNetUnitsNb() {
        return netUnitsNb;
    }

    /**
     * Sets the value of the netUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setNetUnitsNb(FinancialInstrumentQuantity1 value) {
        this.netUnitsNb = value;
    }

    /**
     * Gets the value of the flowDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link FlowDirectionType1Code }
     *     
     */
    public FlowDirectionType1Code getFlowDrctn() {
        return flowDrctn;
    }

    /**
     * Sets the value of the flowDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlowDirectionType1Code }
     *     
     */
    public void setFlowDrctn(FlowDirectionType1Code value) {
        this.flowDrctn = value;
    }

    /**
     * Gets the value of the addtlBal property.
     * 
     * @return
     *     possible object is
     *     {@link FundBalance1 }
     *     
     */
    public FundBalance1 getAddtlBal() {
        return addtlBal;
    }

    /**
     * Sets the value of the addtlBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundBalance1 }
     *     
     */
    public void setAddtlBal(FundBalance1 value) {
        this.addtlBal = value;
    }

}
