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

package org.jpos.iso20022.camt_056_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Frequency36Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Frequency36Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.10}Frequency6Code"/>
 *         <element name="Prd" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.10}FrequencyPeriod1"/>
 *         <element name="PtInTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.056.001.10}FrequencyAndMoment1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Frequency36Choice", propOrder = {
    "tp",
    "prd",
    "ptInTm"
})
public class Frequency36Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected Frequency6Code tp;
    @XmlElement(name = "Prd")
    protected FrequencyPeriod1 prd;
    @XmlElement(name = "PtInTm")
    protected FrequencyAndMoment1 ptInTm;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency6Code }
     *     
     */
    public Frequency6Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency6Code }
     *     
     */
    public void setTp(Frequency6Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the prd property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyPeriod1 }
     *     
     */
    public FrequencyPeriod1 getPrd() {
        return prd;
    }

    /**
     * Sets the value of the prd property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyPeriod1 }
     *     
     */
    public void setPrd(FrequencyPeriod1 value) {
        this.prd = value;
    }

    /**
     * Gets the value of the ptInTm property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyAndMoment1 }
     *     
     */
    public FrequencyAndMoment1 getPtInTm() {
        return ptInTm;
    }

    /**
     * Sets the value of the ptInTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyAndMoment1 }
     *     
     */
    public void setPtInTm(FrequencyAndMoment1 value) {
        this.ptInTm = value;
    }

}
