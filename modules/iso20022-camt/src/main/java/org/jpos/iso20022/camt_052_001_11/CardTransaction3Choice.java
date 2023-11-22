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

package org.jpos.iso20022.camt_052_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransaction3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardTransaction3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Aggtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.11}CardAggregated2"/>
 *         <element name="Indv" type="{urn:iso:std:iso:20022:tech:xsd:camt.052.001.11}CardIndividualTransaction2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction3Choice", propOrder = {
    "aggtd",
    "indv"
})
public class CardTransaction3Choice {

    @XmlElement(name = "Aggtd")
    protected CardAggregated2 aggtd;
    @XmlElement(name = "Indv")
    protected CardIndividualTransaction2 indv;

    /**
     * Gets the value of the aggtd property.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated2 }
     *     
     */
    public CardAggregated2 getAggtd() {
        return aggtd;
    }

    /**
     * Sets the value of the aggtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated2 }
     *     
     */
    public void setAggtd(CardAggregated2 value) {
        this.aggtd = value;
    }

    /**
     * Gets the value of the indv property.
     * 
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    public CardIndividualTransaction2 getIndv() {
        return indv;
    }

    /**
     * Sets the value of the indv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    public void setIndv(CardIndividualTransaction2 value) {
        this.indv = value;
    }

}
