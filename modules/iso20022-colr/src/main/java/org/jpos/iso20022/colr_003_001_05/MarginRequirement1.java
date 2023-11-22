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

package org.jpos.iso20022.colr_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvrMrgnAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RtrMrgnAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginRequirement1", propOrder = {
    "dlvrMrgnAmt",
    "rtrMrgnAmt"
})
public class MarginRequirement1 {

    @XmlElement(name = "DlvrMrgnAmt")
    protected ActiveCurrencyAndAmount dlvrMrgnAmt;
    @XmlElement(name = "RtrMrgnAmt")
    protected ActiveCurrencyAndAmount rtrMrgnAmt;

    /**
     * Gets the value of the dlvrMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getDlvrMrgnAmt() {
        return dlvrMrgnAmt;
    }

    /**
     * Sets the value of the dlvrMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setDlvrMrgnAmt(ActiveCurrencyAndAmount value) {
        this.dlvrMrgnAmt = value;
    }

    /**
     * Gets the value of the rtrMrgnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRtrMrgnAmt() {
        return rtrMrgnAmt;
    }

    /**
     * Sets the value of the rtrMrgnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRtrMrgnAmt(ActiveCurrencyAndAmount value) {
        this.rtrMrgnAmt = value;
    }

}
