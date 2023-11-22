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

package org.jpos.iso20022.colr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralOwnership3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralOwnership3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}YesNoIndicator"/>
 *         <element name="ClntNm" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}PartyIdentification178Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralOwnership3", propOrder = {
    "prtry",
    "clntNm"
})
public class CollateralOwnership3 {

    @XmlElement(name = "Prtry")
    protected boolean prtry;
    @XmlElement(name = "ClntNm")
    protected PartyIdentification178Choice clntNm;

    /**
     * Gets the value of the prtry property.
     * 
     */
    public boolean isPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     */
    public void setPrtry(boolean value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the clntNm property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public PartyIdentification178Choice getClntNm() {
        return clntNm;
    }

    /**
     * Sets the value of the clntNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification178Choice }
     *     
     */
    public void setClntNm(PartyIdentification178Choice value) {
        this.clntNm = value;
    }

}
