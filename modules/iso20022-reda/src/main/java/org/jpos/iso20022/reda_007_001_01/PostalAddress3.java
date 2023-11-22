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

package org.jpos.iso20022.reda_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PostalAddress3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PostalAddress3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AdrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}AddressType1Code"/>
 *         <element name="MlngInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator"/>
 *         <element name="RegnAdrInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}YesNoIndicator"/>
 *         <element name="NmAndAdr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}NameAndAddress4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddress3", propOrder = {
    "adrTp",
    "mlngInd",
    "regnAdrInd",
    "nmAndAdr"
})
public class PostalAddress3 {

    @XmlElement(name = "AdrTp", required = true)
    @XmlSchemaType(name = "string")
    protected AddressType1Code adrTp;
    @XmlElement(name = "MlngInd")
    protected boolean mlngInd;
    @XmlElement(name = "RegnAdrInd")
    protected boolean regnAdrInd;
    @XmlElement(name = "NmAndAdr", required = true)
    protected NameAndAddress4 nmAndAdr;

    /**
     * Gets the value of the adrTp property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType1Code }
     *     
     */
    public AddressType1Code getAdrTp() {
        return adrTp;
    }

    /**
     * Sets the value of the adrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType1Code }
     *     
     */
    public void setAdrTp(AddressType1Code value) {
        this.adrTp = value;
    }

    /**
     * Gets the value of the mlngInd property.
     * 
     */
    public boolean isMlngInd() {
        return mlngInd;
    }

    /**
     * Sets the value of the mlngInd property.
     * 
     */
    public void setMlngInd(boolean value) {
        this.mlngInd = value;
    }

    /**
     * Gets the value of the regnAdrInd property.
     * 
     */
    public boolean isRegnAdrInd() {
        return regnAdrInd;
    }

    /**
     * Sets the value of the regnAdrInd property.
     * 
     */
    public void setRegnAdrInd(boolean value) {
        this.regnAdrInd = value;
    }

    /**
     * Gets the value of the nmAndAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getNmAndAdr() {
        return nmAndAdr;
    }

    /**
     * Sets the value of the nmAndAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public void setNmAndAdr(NameAndAddress4 value) {
        this.nmAndAdr = value;
    }

}
