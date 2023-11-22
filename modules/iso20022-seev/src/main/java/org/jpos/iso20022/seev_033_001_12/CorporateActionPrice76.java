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

package org.jpos.iso20022.seev_033_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndctvOrMktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}IndicativeOrMarketPrice8Choice" minOccurs="0"/>
 *         <element name="IssePric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PriceFormat50Choice" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PriceFormat66Choice" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PriceFormat50Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice76", propOrder = {
    "indctvOrMktPric",
    "issePric",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct"
})
public class CorporateActionPrice76 {

    @XmlElement(name = "IndctvOrMktPric")
    protected IndicativeOrMarketPrice8Choice indctvOrMktPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat50Choice issePric;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat66Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat50Choice gncCshPricPdPerPdct;

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
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public void setIssePric(PriceFormat50Choice value) {
        this.issePric = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat66Choice }
     *     
     */
    public PriceFormat66Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat66Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat66Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat50Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

}
