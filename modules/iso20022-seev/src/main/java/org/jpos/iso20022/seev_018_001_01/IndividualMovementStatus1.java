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

package org.jpos.iso20022.seev_018_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualMovementStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualMovementStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MvmntId" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}Max35Text" minOccurs="0"/>
 *         <choice>
 *           <element name="PrcdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}MovementProcessingStatus1"/>
 *           <element name="RjctdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}DistributionRejectionStatus1"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualMovementStatus1", propOrder = {
    "mvmntId",
    "prcdSts",
    "rjctdSts"
})
public class IndividualMovementStatus1 {

    @XmlElement(name = "MvmntId")
    protected String mvmntId;
    @XmlElement(name = "PrcdSts")
    protected MovementProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected DistributionRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the mvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMvmntId() {
        return mvmntId;
    }

    /**
     * Sets the value of the mvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMvmntId(String value) {
        this.mvmntId = value;
    }

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link MovementProcessingStatus1 }
     *     
     */
    public MovementProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MovementProcessingStatus1 }
     *     
     */
    public void setPrcdSts(MovementProcessingStatus1 value) {
        this.prcdSts = value;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionRejectionStatus1 }
     *     
     */
    public DistributionRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionRejectionStatus1 }
     *     
     */
    public void setRjctdSts(DistributionRejectionStatus1 value) {
        this.rjctdSts = value;
    }

}
