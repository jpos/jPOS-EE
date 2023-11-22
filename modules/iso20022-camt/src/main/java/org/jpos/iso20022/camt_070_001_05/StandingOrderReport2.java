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

package org.jpos.iso20022.camt_070_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandingOrderReport2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StandingOrderReport2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StgOrdrId" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}StandingOrderIdentification6"/>
 *         <element name="StgOrdrOrErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.070.001.05}StandingOrderOrError8Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandingOrderReport2", propOrder = {
    "stgOrdrId",
    "stgOrdrOrErr"
})
public class StandingOrderReport2 {

    @XmlElement(name = "StgOrdrId", required = true)
    protected StandingOrderIdentification6 stgOrdrId;
    @XmlElement(name = "StgOrdrOrErr", required = true)
    protected StandingOrderOrError8Choice stgOrdrOrErr;

    /**
     * Gets the value of the stgOrdrId property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public StandingOrderIdentification6 getStgOrdrId() {
        return stgOrdrId;
    }

    /**
     * Sets the value of the stgOrdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderIdentification6 }
     *     
     */
    public void setStgOrdrId(StandingOrderIdentification6 value) {
        this.stgOrdrId = value;
    }

    /**
     * Gets the value of the stgOrdrOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link StandingOrderOrError8Choice }
     *     
     */
    public StandingOrderOrError8Choice getStgOrdrOrErr() {
        return stgOrdrOrErr;
    }

    /**
     * Sets the value of the stgOrdrOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingOrderOrError8Choice }
     *     
     */
    public void setStgOrdrOrErr(StandingOrderOrError8Choice value) {
        this.stgOrdrOrErr = value;
    }

}
