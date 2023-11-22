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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeConfirmation1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeConfirmation1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Confd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeConfirmation2"/>
 *         <element name="NonConfd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeNonConfirmation1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeConfirmation1Choice", propOrder = {
    "confd",
    "nonConfd"
})
public class TradeConfirmation1Choice {

    @XmlElement(name = "Confd")
    protected TradeConfirmation2 confd;
    @XmlElement(name = "NonConfd")
    protected TradeNonConfirmation1 nonConfd;

    /**
     * Gets the value of the confd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeConfirmation2 }
     *     
     */
    public TradeConfirmation2 getConfd() {
        return confd;
    }

    /**
     * Sets the value of the confd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeConfirmation2 }
     *     
     */
    public void setConfd(TradeConfirmation2 value) {
        this.confd = value;
    }

    /**
     * Gets the value of the nonConfd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNonConfirmation1 }
     *     
     */
    public TradeNonConfirmation1 getNonConfd() {
        return nonConfd;
    }

    /**
     * Sets the value of the nonConfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNonConfirmation1 }
     *     
     */
    public void setNonConfd(TradeNonConfirmation1 value) {
        this.nonConfd = value;
    }

}
