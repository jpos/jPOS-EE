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

package org.jpos.iso20022.reda_005_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundParameters4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundParameters4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NoCrit" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}NoCriteria1Code"/>
 *         <element name="Params" type="{urn:iso:std:iso:20022:tech:xsd:reda.005.001.03}FundParameters5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundParameters4Choice", propOrder = {
    "noCrit",
    "params"
})
public class FundParameters4Choice {

    @XmlElement(name = "NoCrit")
    @XmlSchemaType(name = "string")
    protected NoCriteria1Code noCrit;
    @XmlElement(name = "Params")
    protected FundParameters5 params;

    /**
     * Gets the value of the noCrit property.
     * 
     * @return
     *     possible object is
     *     {@link NoCriteria1Code }
     *     
     */
    public NoCriteria1Code getNoCrit() {
        return noCrit;
    }

    /**
     * Sets the value of the noCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoCriteria1Code }
     *     
     */
    public void setNoCrit(NoCriteria1Code value) {
        this.noCrit = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link FundParameters5 }
     *     
     */
    public FundParameters5 getParams() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundParameters5 }
     *     
     */
    public void setParams(FundParameters5 value) {
        this.params = value;
    }

}
