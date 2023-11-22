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

package org.jpos.iso20022.auth_101_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailureReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailureReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MainRsns" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Max2048Text"/>
 *         <element name="EffcncyImprvmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}Max2048Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailureReason2", propOrder = {
    "mainRsns",
    "effcncyImprvmt"
})
public class SettlementFailureReason2 {

    @XmlElement(name = "MainRsns", required = true)
    protected String mainRsns;
    @XmlElement(name = "EffcncyImprvmt", required = true)
    protected String effcncyImprvmt;

    /**
     * Gets the value of the mainRsns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainRsns() {
        return mainRsns;
    }

    /**
     * Sets the value of the mainRsns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainRsns(String value) {
        this.mainRsns = value;
    }

    /**
     * Gets the value of the effcncyImprvmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffcncyImprvmt() {
        return effcncyImprvmt;
    }

    /**
     * Sets the value of the effcncyImprvmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffcncyImprvmt(String value) {
        this.effcncyImprvmt = value;
    }

}
