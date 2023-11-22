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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice79 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice79">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}IndicativeOrMarketPrice11Choice" minOccurs="0"/>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}PriceFormat57Choice" minOccurs="0"/>
 *         <element name="CshValForTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}PriceFormat58Choice" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}PriceFormat59Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}PriceFormat70Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice79", propOrder = {
    "indctvOrMktPric",
    "cshInLieuOfShrPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice79 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice11Choice indctvOrMktPric;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat57Choice cshInLieuOfShrPric;
    @XmlElement(name = "CshValForTax")
    protected PriceFormat58Choice cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat59Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat70Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice11Choice }
     *     
     */
    public IndicativeOrMarketPrice11Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice11Choice }
     *     
     */
    public void setIndctvOrMktPric(IndicativeOrMarketPrice11Choice value) {
        this.indctvOrMktPric = value;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public PriceFormat57Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat57Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat58Choice }
     *     
     */
    public PriceFormat58Choice getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat58Choice }
     *     
     */
    public void setCshValForTax(PriceFormat58Choice value) {
        this.cshValForTax = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public PriceFormat59Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat59Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat59Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat70Choice }
     *     
     */
    public PriceFormat70Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat70Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat70Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

}
