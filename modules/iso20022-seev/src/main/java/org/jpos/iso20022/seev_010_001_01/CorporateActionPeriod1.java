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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPeriod1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPeriod1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *         <element name="CmplsryPurchsPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *         <element name="IntrstPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *         <element name="BlckgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Period1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod1", propOrder = {
    "actnPrd",
    "cmplsryPurchsPrd",
    "intrstPrd",
    "blckgPrd",
    "pricClctnPrd"
})
public class CorporateActionPeriod1 {

    @XmlElement(name = "ActnPrd")
    protected Period1 actnPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period1 cmplsryPurchsPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period1 intrstPrd;
    @XmlElement(name = "BlckgPrd")
    protected Period1 blckgPrd;
    @XmlElement(name = "PricClctnPrd")
    protected Period1 pricClctnPrd;

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setActnPrd(Period1 value) {
        this.actnPrd = value;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setCmplsryPurchsPrd(Period1 value) {
        this.cmplsryPurchsPrd = value;
    }

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setIntrstPrd(Period1 value) {
        this.intrstPrd = value;
    }

    /**
     * Gets the value of the blckgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getBlckgPrd() {
        return blckgPrd;
    }

    /**
     * Sets the value of the blckgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setBlckgPrd(Period1 value) {
        this.blckgPrd = value;
    }

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setPricClctnPrd(Period1 value) {
        this.pricClctnPrd = value;
    }

}
