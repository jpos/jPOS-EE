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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice80 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice80">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MaxPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}PriceFormat59Choice" minOccurs="0"/>
 *         <element name="MinPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}PriceFormat59Choice" minOccurs="0"/>
 *         <element name="FrstBidIncrmtPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}PriceFormat59Choice" minOccurs="0"/>
 *         <element name="LastBidIncrmtPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}PriceFormat59Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice80", propOrder = {
    "maxPric",
    "minPric",
    "frstBidIncrmtPric",
    "lastBidIncrmtPric"
})
public class CorporateActionPrice80 {

    @XmlElement(name = "MaxPric")
    protected PriceFormat59Choice maxPric;
    @XmlElement(name = "MinPric")
    protected PriceFormat59Choice minPric;
    @XmlElement(name = "FrstBidIncrmtPric")
    protected PriceFormat59Choice frstBidIncrmtPric;
    @XmlElement(name = "LastBidIncrmtPric")
    protected PriceFormat59Choice lastBidIncrmtPric;

    /**
     * Gets the value of the maxPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public PriceFormat59Choice getMaxPric() {
        return maxPric;
    }

    /**
     * Sets the value of the maxPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public void setMaxPric(PriceFormat59Choice value) {
        this.maxPric = value;
    }

    /**
     * Gets the value of the minPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public PriceFormat59Choice getMinPric() {
        return minPric;
    }

    /**
     * Sets the value of the minPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public void setMinPric(PriceFormat59Choice value) {
        this.minPric = value;
    }

    /**
     * Gets the value of the frstBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public PriceFormat59Choice getFrstBidIncrmtPric() {
        return frstBidIncrmtPric;
    }

    /**
     * Sets the value of the frstBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public void setFrstBidIncrmtPric(PriceFormat59Choice value) {
        this.frstBidIncrmtPric = value;
    }

    /**
     * Gets the value of the lastBidIncrmtPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public PriceFormat59Choice getLastBidIncrmtPric() {
        return lastBidIncrmtPric;
    }

    /**
     * Sets the value of the lastBidIncrmtPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public void setLastBidIncrmtPric(PriceFormat59Choice value) {
        this.lastBidIncrmtPric = value;
    }

}
