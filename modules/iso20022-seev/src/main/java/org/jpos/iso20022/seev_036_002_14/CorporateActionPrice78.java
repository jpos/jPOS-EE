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

package org.jpos.iso20022.seev_036_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice78 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice78">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PriceFormat52Choice" minOccurs="0"/>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}IndicativeOrMarketPrice9Choice" minOccurs="0"/>
 *         <element name="CshValForTax" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}AmountPrice4" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PriceFormat55Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.036.002.14}PriceFormat68Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice78", propOrder = {
    "cshInLieuOfShrPric",
    "indctvOrMktPric",
    "cshValForTax",
    "gncCshPricPdPerPdct",
    "gncCshPricRcvdPerPdct"
})
public class CorporateActionPrice78 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat52Choice cshInLieuOfShrPric;
    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice9Choice indctvOrMktPric;
    @XmlElement(name = "CshValForTax")
    protected AmountPrice4 cshValForTax;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat55Choice gncCshPricPdPerPdct;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat68Choice gncCshPricRcvdPerPdct;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public PriceFormat52Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat52Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat52Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the indctvOrMktPric property.
     * 
     * @return
     *     possible object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public IndicativeOrMarketPrice9Choice getIndctvOrMktPric() {
        return indctvOrMktPric;
    }

    /**
     * Sets the value of the indctvOrMktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicativeOrMarketPrice9Choice }
     *     
     */
    public void setIndctvOrMktPric(IndicativeOrMarketPrice9Choice value) {
        this.indctvOrMktPric = value;
    }

    /**
     * Gets the value of the cshValForTax property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice4 }
     *     
     */
    public AmountPrice4 getCshValForTax() {
        return cshValForTax;
    }

    /**
     * Sets the value of the cshValForTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice4 }
     *     
     */
    public void setCshValForTax(AmountPrice4 value) {
        this.cshValForTax = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat55Choice }
     *     
     */
    public PriceFormat55Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat55Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat55Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat68Choice }
     *     
     */
    public PriceFormat68Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat68Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat68Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

}
