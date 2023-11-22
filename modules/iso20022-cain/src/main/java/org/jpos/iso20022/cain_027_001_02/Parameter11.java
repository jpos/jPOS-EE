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

package org.jpos.iso20022.cain_027_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parameter11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Parameter11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Algorithm16Code"/>
 *         <element name="MskGnrtrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}AlgorithmIdentification12"/>
 *         <element name="SaltLngth" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Number"/>
 *         <element name="TrlrFld" type="{urn:iso:std:iso:20022:tech:xsd:cain.027.001.02}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parameter11", propOrder = {
    "dgstAlgo",
    "mskGnrtrAlgo",
    "saltLngth",
    "trlrFld"
})
public class Parameter11 {

    @XmlElement(name = "DgstAlgo", required = true)
    @XmlSchemaType(name = "string")
    protected Algorithm16Code dgstAlgo;
    @XmlElement(name = "MskGnrtrAlgo", required = true)
    protected AlgorithmIdentification12 mskGnrtrAlgo;
    @XmlElement(name = "SaltLngth", required = true)
    protected BigDecimal saltLngth;
    @XmlElement(name = "TrlrFld")
    protected BigDecimal trlrFld;

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link Algorithm16Code }
     *     
     */
    public Algorithm16Code getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Algorithm16Code }
     *     
     */
    public void setDgstAlgo(Algorithm16Code value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the mskGnrtrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public AlgorithmIdentification12 getMskGnrtrAlgo() {
        return mskGnrtrAlgo;
    }

    /**
     * Sets the value of the mskGnrtrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification12 }
     *     
     */
    public void setMskGnrtrAlgo(AlgorithmIdentification12 value) {
        this.mskGnrtrAlgo = value;
    }

    /**
     * Gets the value of the saltLngth property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSaltLngth() {
        return saltLngth;
    }

    /**
     * Sets the value of the saltLngth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSaltLngth(BigDecimal value) {
        this.saltLngth = value;
    }

    /**
     * Gets the value of the trlrFld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrlrFld() {
        return trlrFld;
    }

    /**
     * Sets the value of the trlrFld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrlrFld(BigDecimal value) {
        this.trlrFld = value;
    }

}
