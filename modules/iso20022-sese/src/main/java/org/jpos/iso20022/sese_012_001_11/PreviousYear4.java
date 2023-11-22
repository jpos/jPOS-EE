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

package org.jpos.iso20022.sese_012_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousYear4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PreviousYear4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrvsYrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PreviousYear1Choice"/>
 *         <element name="CshCmpntInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousYear4", propOrder = {
    "prvsYrs",
    "cshCmpntInd"
})
public class PreviousYear4 {

    @XmlElement(name = "PrvsYrs", required = true)
    protected PreviousYear1Choice prvsYrs;
    @XmlElement(name = "CshCmpntInd")
    protected Boolean cshCmpntInd;

    /**
     * Gets the value of the prvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public PreviousYear1Choice getPrvsYrs() {
        return prvsYrs;
    }

    /**
     * Sets the value of the prvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousYear1Choice }
     *     
     */
    public void setPrvsYrs(PreviousYear1Choice value) {
        this.prvsYrs = value;
    }

    /**
     * Gets the value of the cshCmpntInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshCmpntInd() {
        return cshCmpntInd;
    }

    /**
     * Sets the value of the cshCmpntInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshCmpntInd(Boolean value) {
        this.cshCmpntInd = value;
    }

}
