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

package org.jpos.iso20022.colr_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueCriteria3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueCriteria3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryNm" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}Max35Text" minOccurs="0"/>
 *         <element name="SchCrit" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}CollateralValueSearchCriteria3" minOccurs="0"/>
 *         <element name="RtrCrit" type="{urn:iso:std:iso:20022:tech:xsd:colr.001.001.01}CollateralValueReturnCriteria1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueCriteria3", propOrder = {
    "qryNm",
    "schCrit",
    "rtrCrit"
})
public class CollateralValueCriteria3 {

    @XmlElement(name = "QryNm")
    protected String qryNm;
    @XmlElement(name = "SchCrit")
    protected CollateralValueSearchCriteria3 schCrit;
    @XmlElement(name = "RtrCrit")
    protected CollateralValueReturnCriteria1 rtrCrit;

    /**
     * Gets the value of the qryNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryNm() {
        return qryNm;
    }

    /**
     * Sets the value of the qryNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryNm(String value) {
        this.qryNm = value;
    }

    /**
     * Gets the value of the schCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueSearchCriteria3 }
     *     
     */
    public CollateralValueSearchCriteria3 getSchCrit() {
        return schCrit;
    }

    /**
     * Sets the value of the schCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueSearchCriteria3 }
     *     
     */
    public void setSchCrit(CollateralValueSearchCriteria3 value) {
        this.schCrit = value;
    }

    /**
     * Gets the value of the rtrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValueReturnCriteria1 }
     *     
     */
    public CollateralValueReturnCriteria1 getRtrCrit() {
        return rtrCrit;
    }

    /**
     * Sets the value of the rtrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValueReturnCriteria1 }
     *     
     */
    public void setRtrCrit(CollateralValueReturnCriteria1 value) {
        this.rtrCrit = value;
    }

}
