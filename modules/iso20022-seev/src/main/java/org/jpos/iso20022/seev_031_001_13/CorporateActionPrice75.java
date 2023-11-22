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
 * <p>Java class for CorporateActionPrice75 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice75">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}IndicativeOrMarketPrice7Choice" minOccurs="0"/>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat45Choice" minOccurs="0"/>
 *         <element name="CshValForTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat46Choice" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat44Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}PriceFormat65Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice75", propOrder = {
    "indctvOrMktPric",
    "cshInLieuOfShrPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice75 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice7Choice indctvOrMktPric;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat45Choice cshInLieuOfShrPric;
    @XmlElement(name = "CshValForTax")
    protected PriceFormat46Choice cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat44Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat65Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice7Choice }
     *     
     */
    public IndicativeOrMarketPrice7Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice7Choice }
     *     
     */
    public void setIndctvOrMktPric(IndicativeOrMarketPrice7Choice value) {
        this.indctvOrMktPric = value;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat45Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat46Choice }
     *     
     */
    public PriceFormat46Choice getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat46Choice }
     *     
     */
    public void setCshValForTax(PriceFormat46Choice value) {
        this.cshValForTax = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public PriceFormat44Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat44Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat44Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat65Choice }
     *     
     */
    public PriceFormat65Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat65Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat65Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

}
