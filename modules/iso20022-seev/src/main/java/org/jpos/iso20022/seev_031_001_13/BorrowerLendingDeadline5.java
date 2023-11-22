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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BorrowerLendingDeadline5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BorrowerLendingDeadline5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StockLndgDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}DateFormat43Choice"/>
 *         <element name="Brrwr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PartyIdentification127Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BorrowerLendingDeadline5", propOrder = {
    "stockLndgDdln",
    "brrwr"
})
public class BorrowerLendingDeadline5 {

    @XmlElement(name = "StockLndgDdln", required = true)
    protected DateFormat43Choice stockLndgDdln;
    @XmlElement(name = "Brrwr", required = true)
    protected PartyIdentification127Choice brrwr;

    /**
     * Gets the value of the stockLndgDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getStockLndgDdln() {
        return stockLndgDdln;
    }

    /**
     * Sets the value of the stockLndgDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setStockLndgDdln(DateFormat43Choice value) {
        this.stockLndgDdln = value;
    }

    /**
     * Gets the value of the brrwr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public PartyIdentification127Choice getBrrwr() {
        return brrwr;
    }

    /**
     * Sets the value of the brrwr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification127Choice }
     *     
     */
    public void setBrrwr(PartyIdentification127Choice value) {
        this.brrwr = value;
    }

}
