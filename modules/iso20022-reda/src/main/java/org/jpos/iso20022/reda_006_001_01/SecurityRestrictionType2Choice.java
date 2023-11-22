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

package org.jpos.iso20022.reda_006_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityRestrictionType2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityRestrictionType2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RstrctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}RestrictionType1Code"/>
 *         <element name="PrtryRstrctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}GenericIdentification30"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityRestrictionType2Choice", propOrder = {
    "rstrctnTp",
    "prtryRstrctn"
})
public class SecurityRestrictionType2Choice {

    @XmlElement(name = "RstrctnTp")
    @XmlSchemaType(name = "string")
    protected RestrictionType1Code rstrctnTp;
    @XmlElement(name = "PrtryRstrctn")
    protected GenericIdentification30 prtryRstrctn;

    /**
     * Gets the value of the rstrctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionType1Code }
     *     
     */
    public RestrictionType1Code getRstrctnTp() {
        return rstrctnTp;
    }

    /**
     * Sets the value of the rstrctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionType1Code }
     *     
     */
    public void setRstrctnTp(RestrictionType1Code value) {
        this.rstrctnTp = value;
    }

    /**
     * Gets the value of the prtryRstrctn property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification30 }
     *     
     */
    public GenericIdentification30 getPrtryRstrctn() {
        return prtryRstrctn;
    }

    /**
     * Sets the value of the prtryRstrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification30 }
     *     
     */
    public void setPrtryRstrctn(GenericIdentification30 value) {
        this.prtryRstrctn = value;
    }

}
