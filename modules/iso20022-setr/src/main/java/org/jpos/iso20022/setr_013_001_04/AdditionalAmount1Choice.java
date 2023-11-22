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

package org.jpos.iso20022.setr_013_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalAmount1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalAmount1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AddtlCshIn" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="RsltgCshOut" type="{urn:iso:std:iso:20022:tech:xsd:setr.013.001.04}ActiveOrHistoricCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalAmount1Choice", propOrder = {
    "addtlCshIn",
    "rsltgCshOut"
})
public class AdditionalAmount1Choice {

    @XmlElement(name = "AddtlCshIn")
    protected ActiveOrHistoricCurrencyAndAmount addtlCshIn;
    @XmlElement(name = "RsltgCshOut")
    protected ActiveOrHistoricCurrencyAndAmount rsltgCshOut;

    /**
     * Gets the value of the addtlCshIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAddtlCshIn() {
        return addtlCshIn;
    }

    /**
     * Sets the value of the addtlCshIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAddtlCshIn(ActiveOrHistoricCurrencyAndAmount value) {
        this.addtlCshIn = value;
    }

    /**
     * Gets the value of the rsltgCshOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRsltgCshOut() {
        return rsltgCshOut;
    }

    /**
     * Sets the value of the rsltgCshOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRsltgCshOut(ActiveOrHistoricCurrencyAndAmount value) {
        this.rsltgCshOut = value;
    }

}
