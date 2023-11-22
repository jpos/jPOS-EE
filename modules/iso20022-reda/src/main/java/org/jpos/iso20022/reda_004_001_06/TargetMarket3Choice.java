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

package org.jpos.iso20022.reda_004_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarket3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TargetMarket3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestorType2Code"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}GenericIdentification47"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarket3Choice", propOrder = {
    "tp",
    "othr",
    "prtry"
})
public class TargetMarket3Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected InvestorType2Code tp;
    @XmlElement(name = "Othr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code othr;
    @XmlElement(name = "Prtry")
    protected GenericIdentification47 prtry;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType2Code }
     *     
     */
    public InvestorType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType2Code }
     *     
     */
    public void setTp(InvestorType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setOthr(TargetMarket1Code value) {
        this.othr = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification47 }
     *     
     */
    public GenericIdentification47 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification47 }
     *     
     */
    public void setPrtry(GenericIdentification47 value) {
        this.prtry = value;
    }

}
