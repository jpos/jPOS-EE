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

package org.jpos.iso20022.seev_016_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesEntitlement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesEntitlement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}SecurityIdentification7"/>
 *         <element name="EntitldSctiesQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.016.001.01}UnitOrFaceAmount1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesEntitlement1", propOrder = {
    "sctyId",
    "entitldSctiesQty"
})
public class SecuritiesEntitlement1 {

    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification7 sctyId;
    @XmlElement(name = "EntitldSctiesQty", required = true)
    protected UnitOrFaceAmount1Choice entitldSctiesQty;

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public SecurityIdentification7 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification7 }
     *     
     */
    public void setSctyId(SecurityIdentification7 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the entitldSctiesQty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public UnitOrFaceAmount1Choice getEntitldSctiesQty() {
        return entitldSctiesQty;
    }

    /**
     * Sets the value of the entitldSctiesQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOrFaceAmount1Choice }
     *     
     */
    public void setEntitldSctiesQty(UnitOrFaceAmount1Choice value) {
        this.entitldSctiesQty = value;
    }

}
