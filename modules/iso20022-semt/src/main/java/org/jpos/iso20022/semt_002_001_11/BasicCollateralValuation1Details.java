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

package org.jpos.iso20022.semt_002_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BasicCollateralValuation1Details complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BasicCollateralValuation1Details">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValtnHrcut" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}PercentageRate"/>
 *         <element name="HrcutSrc" type="{urn:iso:std:iso:20022:tech:xsd:semt.002.001.11}PartyIdentification15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicCollateralValuation1Details", propOrder = {
    "valtnHrcut",
    "hrcutSrc"
})
public class BasicCollateralValuation1Details {

    @XmlElement(name = "ValtnHrcut", required = true)
    protected BigDecimal valtnHrcut;
    @XmlElement(name = "HrcutSrc")
    protected PartyIdentification15 hrcutSrc;

    /**
     * Gets the value of the valtnHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValtnHrcut() {
        return valtnHrcut;
    }

    /**
     * Sets the value of the valtnHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValtnHrcut(BigDecimal value) {
        this.valtnHrcut = value;
    }

    /**
     * Gets the value of the hrcutSrc property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification15 }
     *     
     */
    public PartyIdentification15 getHrcutSrc() {
        return hrcutSrc;
    }

    /**
     * Sets the value of the hrcutSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification15 }
     *     
     */
    public void setHrcutSrc(PartyIdentification15 value) {
        this.hrcutSrc = value;
    }

}
