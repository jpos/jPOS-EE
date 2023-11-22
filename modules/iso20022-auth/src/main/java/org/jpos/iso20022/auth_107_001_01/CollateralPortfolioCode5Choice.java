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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralPortfolioCode5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralPortfolioCode5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prtfl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PortfolioCode3Choice"/>
 *         <element name="MrgnPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}MarginPortfolio3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralPortfolioCode5Choice", propOrder = {
    "prtfl",
    "mrgnPrtflCd"
})
public class CollateralPortfolioCode5Choice {

    @XmlElement(name = "Prtfl")
    protected PortfolioCode3Choice prtfl;
    @XmlElement(name = "MrgnPrtflCd")
    protected MarginPortfolio3 mrgnPrtflCd;

    /**
     * Gets the value of the prtfl property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode3Choice }
     *     
     */
    public PortfolioCode3Choice getPrtfl() {
        return prtfl;
    }

    /**
     * Sets the value of the prtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode3Choice }
     *     
     */
    public void setPrtfl(PortfolioCode3Choice value) {
        this.prtfl = value;
    }

    /**
     * Gets the value of the mrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link MarginPortfolio3 }
     *     
     */
    public MarginPortfolio3 getMrgnPrtflCd() {
        return mrgnPrtflCd;
    }

    /**
     * Sets the value of the mrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginPortfolio3 }
     *     
     */
    public void setMrgnPrtflCd(MarginPortfolio3 value) {
        this.mrgnPrtflCd = value;
    }

}
