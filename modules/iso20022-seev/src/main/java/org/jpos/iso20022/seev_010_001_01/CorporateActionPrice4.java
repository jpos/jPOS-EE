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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IndctvPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *         <element name="MktPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice4", propOrder = {
    "indctvPric",
    "mktPric"
})
public class CorporateActionPrice4 {

    @XmlElement(name = "IndctvPric")
    protected PriceFormat2Choice indctvPric;
    @XmlElement(name = "MktPric")
    protected PriceFormat2Choice mktPric;

    /**
     * Gets the value of the indctvPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getIndctvPric() {
        return indctvPric;
    }

    /**
     * Sets the value of the indctvPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setIndctvPric(PriceFormat2Choice value) {
        this.indctvPric = value;
    }

    /**
     * Gets the value of the mktPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getMktPric() {
        return mktPric;
    }

    /**
     * Sets the value of the mktPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setMktPric(PriceFormat2Choice value) {
        this.mktPric = value;
    }

}
