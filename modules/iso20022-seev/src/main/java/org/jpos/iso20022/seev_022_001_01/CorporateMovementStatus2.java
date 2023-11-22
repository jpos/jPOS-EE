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

package org.jpos.iso20022.seev_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateMovementStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateMovementStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporationActionMovementProcessingStatus2"/>
 *         <element name="RjctdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionMovementRejectionStatus2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateMovementStatus2", propOrder = {
    "prcdSts",
    "rjctdSts"
})
public class CorporateMovementStatus2 {

    @XmlElement(name = "PrcdSts", required = true)
    protected CorporationActionMovementProcessingStatus2 prcdSts;
    @XmlElement(name = "RjctdSts", required = true)
    protected CorporateActionMovementRejectionStatus2 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationActionMovementProcessingStatus2 }
     *     
     */
    public CorporationActionMovementProcessingStatus2 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationActionMovementProcessingStatus2 }
     *     
     */
    public void setPrcdSts(CorporationActionMovementProcessingStatus2 value) {
        this.prcdSts = value;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementRejectionStatus2 }
     *     
     */
    public CorporateActionMovementRejectionStatus2 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementRejectionStatus2 }
     *     
     */
    public void setRjctdSts(CorporateActionMovementRejectionStatus2 value) {
        this.rjctdSts = value;
    }

}
