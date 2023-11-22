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

package org.jpos.iso20022.tsrv_003_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceOrUnderConfirmationChoice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PlaceOrUnderConfirmationChoice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PlcOfPresntn" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PlaceOfPresentation1"/>
 *         <element name="PresntnUdrConf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.003.001.01}PresentationParty1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceOrUnderConfirmationChoice1", propOrder = {
    "plcOfPresntn",
    "presntnUdrConf"
})
public class PlaceOrUnderConfirmationChoice1 {

    @XmlElement(name = "PlcOfPresntn")
    protected PlaceOfPresentation1 plcOfPresntn;
    @XmlElement(name = "PresntnUdrConf")
    @XmlSchemaType(name = "string")
    protected PresentationParty1Code presntnUdrConf;

    /**
     * Gets the value of the plcOfPresntn property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfPresentation1 }
     *     
     */
    public PlaceOfPresentation1 getPlcOfPresntn() {
        return plcOfPresntn;
    }

    /**
     * Sets the value of the plcOfPresntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfPresentation1 }
     *     
     */
    public void setPlcOfPresntn(PlaceOfPresentation1 value) {
        this.plcOfPresntn = value;
    }

    /**
     * Gets the value of the presntnUdrConf property.
     * 
     * @return
     *     possible object is
     *     {@link PresentationParty1Code }
     *     
     */
    public PresentationParty1Code getPresntnUdrConf() {
        return presntnUdrConf;
    }

    /**
     * Sets the value of the presntnUdrConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PresentationParty1Code }
     *     
     */
    public void setPresntnUdrConf(PresentationParty1Code value) {
        this.presntnUdrConf = value;
    }

}
