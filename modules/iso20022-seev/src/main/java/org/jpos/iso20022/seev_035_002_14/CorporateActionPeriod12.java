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

package org.jpos.iso20022.seev_035_002_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPeriod12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPeriod12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="ParllTradgPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="ActnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="RvcbltyPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="PrvlgSspnsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="AcctSvcrRvcbltyPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForWdrwl" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.002.14}Period6Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod12", propOrder = {
    "pricClctnPrd",
    "parllTradgPrd",
    "actnPrd",
    "rvcbltyPrd",
    "prvlgSspnsnPrd",
    "acctSvcrRvcbltyPrd",
    "dpstrySspnsnPrdForWdrwl"
})
public class CorporateActionPeriod12 {

    @XmlElement(name = "PricClctnPrd")
    protected Period6Choice pricClctnPrd;
    @XmlElement(name = "ParllTradgPrd")
    protected Period6Choice parllTradgPrd;
    @XmlElement(name = "ActnPrd")
    protected Period6Choice actnPrd;
    @XmlElement(name = "RvcbltyPrd")
    protected Period6Choice rvcbltyPrd;
    @XmlElement(name = "PrvlgSspnsnPrd")
    protected Period6Choice prvlgSspnsnPrd;
    @XmlElement(name = "AcctSvcrRvcbltyPrd")
    protected Period6Choice acctSvcrRvcbltyPrd;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwl")
    protected Period6Choice dpstrySspnsnPrdForWdrwl;

    /**
     * Gets the value of the pricClctnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getPricClctnPrd() {
        return pricClctnPrd;
    }

    /**
     * Sets the value of the pricClctnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setPricClctnPrd(Period6Choice value) {
        this.pricClctnPrd = value;
    }

    /**
     * Gets the value of the parllTradgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getParllTradgPrd() {
        return parllTradgPrd;
    }

    /**
     * Sets the value of the parllTradgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setParllTradgPrd(Period6Choice value) {
        this.parllTradgPrd = value;
    }

    /**
     * Gets the value of the actnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getActnPrd() {
        return actnPrd;
    }

    /**
     * Sets the value of the actnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setActnPrd(Period6Choice value) {
        this.actnPrd = value;
    }

    /**
     * Gets the value of the rvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getRvcbltyPrd() {
        return rvcbltyPrd;
    }

    /**
     * Sets the value of the rvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setRvcbltyPrd(Period6Choice value) {
        this.rvcbltyPrd = value;
    }

    /**
     * Gets the value of the prvlgSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getPrvlgSspnsnPrd() {
        return prvlgSspnsnPrd;
    }

    /**
     * Sets the value of the prvlgSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setPrvlgSspnsnPrd(Period6Choice value) {
        this.prvlgSspnsnPrd = value;
    }

    /**
     * Gets the value of the acctSvcrRvcbltyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getAcctSvcrRvcbltyPrd() {
        return acctSvcrRvcbltyPrd;
    }

    /**
     * Sets the value of the acctSvcrRvcbltyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setAcctSvcrRvcbltyPrd(Period6Choice value) {
        this.acctSvcrRvcbltyPrd = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwl() {
        return dpstrySspnsnPrdForWdrwl;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForWdrwl(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwl = value;
    }

}
