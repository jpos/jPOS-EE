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

package org.jpos.iso20022.semt_004_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceSourceFormatChoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceSourceFormatChoice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="LclMktPlc" type="{urn:swift:xsd:semt.004.001.02}MICIdentifier"/>
 *           <element name="NonLclMktPlc" type="{urn:swift:xsd:semt.004.001.02}PriceSource"/>
 *           <element name="PlcAsDSS" type="{urn:swift:xsd:semt.004.001.02}GenericIdentification5"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceSourceFormatChoice", propOrder = {
    "lclMktPlc",
    "nonLclMktPlc",
    "plcAsDSS"
})
public class PriceSourceFormatChoice {

    @XmlElement(name = "LclMktPlc")
    protected String lclMktPlc;
    @XmlElement(name = "NonLclMktPlc")
    protected PriceSource nonLclMktPlc;
    @XmlElement(name = "PlcAsDSS")
    protected GenericIdentification5 plcAsDSS;

    /**
     * Gets the value of the lclMktPlc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclMktPlc() {
        return lclMktPlc;
    }

    /**
     * Sets the value of the lclMktPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLclMktPlc(String value) {
        this.lclMktPlc = value;
    }

    /**
     * Gets the value of the nonLclMktPlc property.
     * 
     * @return
     *     possible object is
     *     {@link PriceSource }
     *     
     */
    public PriceSource getNonLclMktPlc() {
        return nonLclMktPlc;
    }

    /**
     * Sets the value of the nonLclMktPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceSource }
     *     
     */
    public void setNonLclMktPlc(PriceSource value) {
        this.nonLclMktPlc = value;
    }

    /**
     * Gets the value of the plcAsDSS property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification5 }
     *     
     */
    public GenericIdentification5 getPlcAsDSS() {
        return plcAsDSS;
    }

    /**
     * Sets the value of the plcAsDSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification5 }
     *     
     */
    public void setPlcAsDSS(GenericIdentification5 value) {
        this.plcAsDSS = value;
    }

}
