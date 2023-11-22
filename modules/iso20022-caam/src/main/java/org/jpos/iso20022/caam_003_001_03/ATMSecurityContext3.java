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

package org.jpos.iso20022.caam_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityContext3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityContext3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CurSctySchme" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityScheme3Code"/>
 *         <element name="DvcPrprty" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMEquipment3" minOccurs="0"/>
 *         <element name="CurCfgtn" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ATMSecurityConfiguration1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityContext3", propOrder = {
    "curSctySchme",
    "dvcPrprty",
    "curCfgtn"
})
public class ATMSecurityContext3 {

    @XmlElement(name = "CurSctySchme", required = true)
    @XmlSchemaType(name = "string")
    protected ATMSecurityScheme3Code curSctySchme;
    @XmlElement(name = "DvcPrprty")
    protected ATMEquipment3 dvcPrprty;
    @XmlElement(name = "CurCfgtn")
    protected ATMSecurityConfiguration1 curCfgtn;

    /**
     * Gets the value of the curSctySchme property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public ATMSecurityScheme3Code getCurSctySchme() {
        return curSctySchme;
    }

    /**
     * Sets the value of the curSctySchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityScheme3Code }
     *     
     */
    public void setCurSctySchme(ATMSecurityScheme3Code value) {
        this.curSctySchme = value;
    }

    /**
     * Gets the value of the dvcPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEquipment3 }
     *     
     */
    public ATMEquipment3 getDvcPrprty() {
        return dvcPrprty;
    }

    /**
     * Sets the value of the dvcPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEquipment3 }
     *     
     */
    public void setDvcPrprty(ATMEquipment3 value) {
        this.dvcPrprty = value;
    }

    /**
     * Gets the value of the curCfgtn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public ATMSecurityConfiguration1 getCurCfgtn() {
        return curCfgtn;
    }

    /**
     * Sets the value of the curCfgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSecurityConfiguration1 }
     *     
     */
    public void setCurCfgtn(ATMSecurityConfiguration1 value) {
        this.curCfgtn = value;
    }

}
