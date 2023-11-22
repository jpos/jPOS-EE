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

package org.jpos.iso20022.auth_092_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginPortfolio3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginPortfolio3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InitlMrgnPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}PortfolioCode5Choice"/>
 *         <element name="VartnMrgnPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}PortfolioCode5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginPortfolio3", propOrder = {
    "initlMrgnPrtflCd",
    "vartnMrgnPrtflCd"
})
public class MarginPortfolio3 {

    @XmlElement(name = "InitlMrgnPrtflCd", required = true)
    protected PortfolioCode5Choice initlMrgnPrtflCd;
    @XmlElement(name = "VartnMrgnPrtflCd")
    protected PortfolioCode5Choice vartnMrgnPrtflCd;

    /**
     * Gets the value of the initlMrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public PortfolioCode5Choice getInitlMrgnPrtflCd() {
        return initlMrgnPrtflCd;
    }

    /**
     * Sets the value of the initlMrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public void setInitlMrgnPrtflCd(PortfolioCode5Choice value) {
        this.initlMrgnPrtflCd = value;
    }

    /**
     * Gets the value of the vartnMrgnPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public PortfolioCode5Choice getVartnMrgnPrtflCd() {
        return vartnMrgnPrtflCd;
    }

    /**
     * Sets the value of the vartnMrgnPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortfolioCode5Choice }
     *     
     */
    public void setVartnMrgnPrtflCd(PortfolioCode5Choice value) {
        this.vartnMrgnPrtflCd = value;
    }

}
