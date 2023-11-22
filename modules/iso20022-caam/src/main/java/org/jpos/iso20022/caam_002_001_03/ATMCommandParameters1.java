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

package org.jpos.iso20022.caam_002_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommandParameters1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommandParameters1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SrlNb" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}Max35Text" minOccurs="0"/>
 *         <element name="ReqrdCfgtn" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMSecurityConfiguration1" minOccurs="0"/>
 *         <element name="ReqrdSts" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}ATMStatus2Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandParameters1", propOrder = {
    "srlNb",
    "reqrdCfgtn",
    "reqrdSts"
})
public class ATMCommandParameters1 {

    @XmlElement(name = "SrlNb")
    protected String srlNb;
    @XmlElement(name = "ReqrdCfgtn")
    protected ATMSecurityConfiguration1 reqrdCfgtn;
    @XmlElement(name = "ReqrdSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus2Code reqrdSts;

    /**
     * Gets the value of the srlNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrlNb() {
        return srlNb;
    }

    /**
     * Sets the value of the srlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrlNb(String value) {
        this.srlNb = value;
    }

    /**
     * Gets the value of the reqrdCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getReqrdCfgtn() {
        return reqrdCfgtn;
    }

    /**
     * Sets the value of the reqrdCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public void setReqrdCfgtn(ATMSecurityConfiguration1 value) {
        this.reqrdCfgtn = value;
    }

    /**
     * Gets the value of the reqrdSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus2Code }
     *     
     */
    public ATMStatus2Code getReqrdSts() {
        return reqrdSts;
    }

    /**
     * Sets the value of the reqrdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus2Code }
     *     
     */
    public void setReqrdSts(ATMStatus2Code value) {
        this.reqrdSts = value;
    }

}
