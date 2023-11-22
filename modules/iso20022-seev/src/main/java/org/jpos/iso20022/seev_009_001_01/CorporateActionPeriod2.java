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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPeriod2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPeriod2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AssntdLinePrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="ActnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="PrvlgSspnsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="ParllTradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="SellThruIssrPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="RvcbltyPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}Period1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod2", propOrder = {
    "assntdLinePrd",
    "actnPrd",
    "prvlgSspnsnPrd",
    "parllTradgPrd",
    "sellThruIssrPrd",
    "rvcbltyPrd",
    "pricClctnPrd"
})
public class CorporateActionPeriod2 {

    @XmlElement(name = "AssntdLinePrd")
    protected Period1 assntdLinePrd;
    @XmlElement(name = "ActnPrd")
    protected Period1 actnPrd;
    @XmlElement(name = "PrvlgSspnsnPrd")
    protected Period1 prvlgSspnsnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period1 parllTradgPrd;
    @XmlElement(name = "SellThruIssrPrd")
    protected Period1 sellThruIssrPrd;
    @XmlElement(name = "RvcbltyPrd")
    protected Period1 rvcbltyPrd;
    @XmlElement(name = "PricClctnPrd")
    protected Period1 pricClctnPrd;

    /**
     * Gets the value of the assntdLinePrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getAssntdLinePrd() {
        return assntdLinePrd;
    }

    /**
     * Sets the value of the assntdLinePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setAssntdLinePrd(Period1 value) {
        this.assntdLinePrd = value;
    }

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
     * Gets the value of the prvlgSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getPrvlgSspnsnPrd() {
        return prvlgSspnsnPrd;
    }

    /**
     * Sets the value of the prvlgSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setPrvlgSspnsnPrd(Period1 value) {
        this.prvlgSspnsnPrd = value;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setParllTradgPrd(Period1 value) {
        this.parllTradgPrd = value;
    }

    /**
     * Gets the value of the sellThruIssrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getSellThruIssrPrd() {
        return sellThruIssrPrd;
    }

    /**
     * Sets the value of the sellThruIssrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setSellThruIssrPrd(Period1 value) {
        this.sellThruIssrPrd = value;
    }

    /**
     * Gets the value of the rvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period1 }
     *     
     */
    public Period1 getRvcbltyPrd() {
        return rvcbltyPrd;
    }

    /**
     * Sets the value of the rvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period1 }
     *     
     */
    public void setRvcbltyPrd(Period1 value) {
        this.rvcbltyPrd = value;
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
