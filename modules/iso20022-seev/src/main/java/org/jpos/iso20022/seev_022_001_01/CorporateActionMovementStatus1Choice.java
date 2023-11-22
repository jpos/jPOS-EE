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
 * <p>Java class for CorporateActionMovementStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionMovementStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PrcdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionMovementProcessingStatus1"/>
 *         <element name="FaildSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionMovementFailedStatus1"/>
 *         <element name="RjctdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionMovementRejectionStatus1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionMovementStatus1Choice", propOrder = {
    "prcdSts",
    "faildSts",
    "rjctdSts"
})
public class CorporateActionMovementStatus1Choice {

    @XmlElement(name = "PrcdSts")
    protected CorporateActionMovementProcessingStatus1 prcdSts;
    @XmlElement(name = "FaildSts")
    protected CorporateActionMovementFailedStatus1 faildSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionMovementRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementProcessingStatus1 }
     *     
     */
    public CorporateActionMovementProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementProcessingStatus1 }
     *     
     */
    public void setPrcdSts(CorporateActionMovementProcessingStatus1 value) {
        this.prcdSts = value;
    }

    /**
     * Gets the value of the faildSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementFailedStatus1 }
     *     
     */
    public CorporateActionMovementFailedStatus1 getFaildSts() {
        return faildSts;
    }

    /**
     * Sets the value of the faildSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementFailedStatus1 }
     *     
     */
    public void setFaildSts(CorporateActionMovementFailedStatus1 value) {
        this.faildSts = value;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementRejectionStatus1 }
     *     
     */
    public CorporateActionMovementRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementRejectionStatus1 }
     *     
     */
    public void setRjctdSts(CorporateActionMovementRejectionStatus1 value) {
        this.rjctdSts = value;
    }

}
