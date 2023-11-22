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

package org.jpos.iso20022.setr_009_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfitAndLoss2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProfitAndLoss2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prft" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount"/>
 *         <element name="Loss" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}ActiveCurrencyAndAmount"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfitAndLoss2Choice", propOrder = {
    "prft",
    "loss"
})
public class ProfitAndLoss2Choice {

    @XmlElement(name = "Prft")
    protected ActiveCurrencyAndAmount prft;
    @XmlElement(name = "Loss")
    protected ActiveCurrencyAndAmount loss;

    /**
     * Gets the value of the prft property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrft() {
        return prft;
    }

    /**
     * Sets the value of the prft property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrft(ActiveCurrencyAndAmount value) {
        this.prft = value;
    }

    /**
     * Gets the value of the loss property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getLoss() {
        return loss;
    }

    /**
     * Sets the value of the loss property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setLoss(ActiveCurrencyAndAmount value) {
        this.loss = value;
    }

}
