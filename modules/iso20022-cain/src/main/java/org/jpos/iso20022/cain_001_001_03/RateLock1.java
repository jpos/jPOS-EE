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

package org.jpos.iso20022.cain_001_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateLock1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RateLock1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqdInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ElgblInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ApldInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateLock1", propOrder = {
    "reqdInd",
    "elgblInd",
    "apldInd"
})
public class RateLock1 {

    @XmlElement(name = "ReqdInd")
    protected Boolean reqdInd;
    @XmlElement(name = "ElgblInd")
    protected Boolean elgblInd;
    @XmlElement(name = "ApldInd")
    protected Boolean apldInd;

    /**
     * Gets the value of the reqdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqdInd() {
        return reqdInd;
    }

    /**
     * Sets the value of the reqdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqdInd(Boolean value) {
        this.reqdInd = value;
    }

    /**
     * Gets the value of the elgblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isElgblInd() {
        return elgblInd;
    }

    /**
     * Sets the value of the elgblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setElgblInd(Boolean value) {
        this.elgblInd = value;
    }

    /**
     * Gets the value of the apldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApldInd() {
        return apldInd;
    }

    /**
     * Sets the value of the apldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApldInd(Boolean value) {
        this.apldInd = value;
    }

}
