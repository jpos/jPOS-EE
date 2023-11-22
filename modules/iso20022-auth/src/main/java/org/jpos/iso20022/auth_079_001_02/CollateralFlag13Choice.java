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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralFlag13Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralFlag13Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Collsd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CollaterisedData12"/>
 *         <element name="Uncollsd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}NoReasonCode"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralFlag13Choice", propOrder = {
    "collsd",
    "uncollsd"
})
public class CollateralFlag13Choice {

    @XmlElement(name = "Collsd")
    protected CollaterisedData12 collsd;
    @XmlElement(name = "Uncollsd")
    @XmlSchemaType(name = "string")
    protected NoReasonCode uncollsd;

    /**
     * Gets the value of the collsd property.
     * 
     * @return
     *     possible object is
     *     {@link CollaterisedData12 }
     *     
     */
    public CollaterisedData12 getCollsd() {
        return collsd;
    }

    /**
     * Sets the value of the collsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollaterisedData12 }
     *     
     */
    public void setCollsd(CollaterisedData12 value) {
        this.collsd = value;
    }

    /**
     * Gets the value of the uncollsd property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getUncollsd() {
        return uncollsd;
    }

    /**
     * Sets the value of the uncollsd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setUncollsd(NoReasonCode value) {
        this.uncollsd = value;
    }

}
