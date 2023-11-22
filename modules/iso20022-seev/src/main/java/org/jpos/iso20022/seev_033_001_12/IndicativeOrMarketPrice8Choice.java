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
 * <p>Java class for IndicativeOrMarketPrice8Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndicativeOrMarketPrice8Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IndctvPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PriceFormat50Choice"/>
 *         <element name="MktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.033.001.12}PriceFormat50Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicativeOrMarketPrice8Choice", propOrder = {
    "indctvPric",
    "mktPric"
})
public class IndicativeOrMarketPrice8Choice {

    @XmlElement(name = "IndctvPric")
    protected PriceFormat50Choice indctvPric;
    @XmlElement(name = "MktPric")
    protected PriceFormat50Choice mktPric;

    /**
     * Gets the value of the indctvPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getIndctvPric() {
        return indctvPric;
    }

    /**
     * Sets the value of the indctvPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public void setIndctvPric(PriceFormat50Choice value) {
        this.indctvPric = value;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public PriceFormat50Choice getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat50Choice }
     *     
     */
    public void setMktPric(PriceFormat50Choice value) {
        this.mktPric = value;
    }

}
