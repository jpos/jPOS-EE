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

package org.jpos.iso20022.camt_062_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayInFactors1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PayInFactors1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AggtShrtPosLmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="CcyFctrs" type="{urn:iso:std:iso:20022:tech:xsd:camt.062.001.03}CurrencyFactors1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayInFactors1", propOrder = {
    "aggtShrtPosLmt",
    "ccyFctrs"
})
public class PayInFactors1 {

    @XmlElement(name = "AggtShrtPosLmt", required = true)
    protected ActiveCurrencyAndAmount aggtShrtPosLmt;
    @XmlElement(name = "CcyFctrs", required = true)
    protected List<CurrencyFactors1> ccyFctrs;

    /**
     * Gets the value of the aggtShrtPosLmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtShrtPosLmt() {
        return aggtShrtPosLmt;
    }

    /**
     * Sets the value of the aggtShrtPosLmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAggtShrtPosLmt(ActiveCurrencyAndAmount value) {
        this.aggtShrtPosLmt = value;
    }

    /**
     * Gets the value of the ccyFctrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ccyFctrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcyFctrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyFactors1 }
     * 
     * 
     * @return
     *     The value of the ccyFctrs property.
     */
    public List<CurrencyFactors1> getCcyFctrs() {
        if (ccyFctrs == null) {
            ccyFctrs = new ArrayList<>();
        }
        return this.ccyFctrs;
    }

}
