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

package org.jpos.iso20022.fxtr_008_001_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusAndSubStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusAndSubStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.07}Status27Choice"/>
 *         <element name="SubStsCd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.008.001.07}Exact4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndSubStatus2", propOrder = {
    "stsCd",
    "subStsCd"
})
public class StatusAndSubStatus2 {

    @XmlElement(name = "StsCd", required = true)
    protected Status27Choice stsCd;
    @XmlElement(name = "SubStsCd")
    protected String subStsCd;

    /**
     * Gets the value of the stsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Status27Choice }
     *     
     */
    public Status27Choice getStsCd() {
        return stsCd;
    }

    /**
     * Sets the value of the stsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status27Choice }
     *     
     */
    public void setStsCd(Status27Choice value) {
        this.stsCd = value;
    }

    /**
     * Gets the value of the subStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubStsCd() {
        return subStsCd;
    }

    /**
     * Sets the value of the subStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubStsCd(String value) {
        this.subStsCd = value;
    }

}
