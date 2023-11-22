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

package org.jpos.iso20022.seev_036_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice74 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice74">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PriceFormat50Choice" minOccurs="0"/>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}IndicativeOrMarketPrice8Choice" minOccurs="0"/>
 *         <element name="CshValForTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}AmountPrice2" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PriceFormat51Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.001.14}PriceFormat64Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice74", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice74 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat50Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice8Choice indctvOrMktPric;
    @XmlElement(name = "CshValForTax")
    protected AmountPrice2 cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat51Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat64Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat50Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice8Choice }
     *     
     */
    public IndicativeOrMarketPrice8Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice8Choice }
     *     
     */
    public void setIndctvOrMktPric(IndicativeOrMarketPrice8Choice value) {
        this.indctvOrMktPric = value;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice2 }
     *     
     */
    public AmountPrice2 getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice2 }
     *     
     */
    public void setCshValForTax(AmountPrice2 value) {
        this.cshValForTax = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat51Choice }
     *     
     */
    public PriceFormat51Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat51Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat51Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat64Choice }
     *     
     */
    public PriceFormat64Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat64Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat64Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

}
