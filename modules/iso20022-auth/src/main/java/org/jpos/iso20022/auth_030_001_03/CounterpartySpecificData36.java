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

package org.jpos.iso20022.auth_030_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartySpecificData36 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartySpecificData36">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeCounterpartyReport20"/>
 *         <element name="Valtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ContractValuationData8" minOccurs="0"/>
 *         <element name="RptgTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartySpecificData36", propOrder = {
    "ctrPty",
    "valtn",
    "rptgTmStmp"
})
public class CounterpartySpecificData36 {

    @XmlElement(name = "CtrPty", required = true)
    protected TradeCounterpartyReport20 ctrPty;
    @XmlElement(name = "Valtn")
    protected ContractValuationData8 valtn;
    @XmlElement(name = "RptgTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgTmStmp;

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public void setCtrPty(TradeCounterpartyReport20 value) {
        this.ctrPty = value;
    }

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractValuationData8 }
     *     
     */
    public ContractValuationData8 getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractValuationData8 }
     *     
     */
    public void setValtn(ContractValuationData8 value) {
        this.valtn = value;
    }

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgTmStmp(XMLGregorianCalendar value) {
        this.rptgTmStmp = value;
    }

}
