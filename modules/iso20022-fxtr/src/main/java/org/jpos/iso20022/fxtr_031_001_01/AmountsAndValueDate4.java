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

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountsAndValueDate4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountsAndValueDate4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CallAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="PutAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="OptnSttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="FnlSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsAndValueDate4", propOrder = {
    "callAmt",
    "putAmt",
    "optnSttlmCcy",
    "fnlSttlmDt"
})
public class AmountsAndValueDate4 {

    @XmlElement(name = "CallAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount callAmt;
    @XmlElement(name = "PutAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount putAmt;
    @XmlElement(name = "OptnSttlmCcy")
    protected String optnSttlmCcy;
    @XmlElement(name = "FnlSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fnlSttlmDt;

    /**
     * Gets the value of the callAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCallAmt() {
        return callAmt;
    }

    /**
     * Sets the value of the callAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setCallAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.callAmt = value;
    }

    /**
     * Gets the value of the putAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPutAmt() {
        return putAmt;
    }

    /**
     * Sets the value of the putAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setPutAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.putAmt = value;
    }

    /**
     * Gets the value of the optnSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnSttlmCcy() {
        return optnSttlmCcy;
    }

    /**
     * Sets the value of the optnSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnSttlmCcy(String value) {
        this.optnSttlmCcy = value;
    }

    /**
     * Gets the value of the fnlSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFnlSttlmDt() {
        return fnlSttlmDt;
    }

    /**
     * Sets the value of the fnlSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFnlSttlmDt(XMLGregorianCalendar value) {
        this.fnlSttlmDt = value;
    }

}
