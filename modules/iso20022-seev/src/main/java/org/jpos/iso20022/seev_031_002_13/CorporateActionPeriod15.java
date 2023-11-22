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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPeriod15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPeriod15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PricClctnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="IntrstPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="CmplsryPurchsPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="ClmPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForBookNtryTrf" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForDpstAtAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForDpst" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForPldg" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForSgrtn" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForWdrwlAtAgt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForWdrwlInNmneeNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="DpstrySspnsnPrdForWdrwlInStrtNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="BookClsrPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="CoDpstriesSspnsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *         <element name="SpltPrd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}Period6Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPeriod15", propOrder = {
    "pricClctnPrd",
    "intrstPrd",
    "cmplsryPurchsPrd",
    "clmPrd",
    "dpstrySspnsnPrdForBookNtryTrf",
    "dpstrySspnsnPrdForDpstAtAgt",
    "dpstrySspnsnPrdForDpst",
    "dpstrySspnsnPrdForPldg",
    "dpstrySspnsnPrdForSgrtn",
    "dpstrySspnsnPrdForWdrwlAtAgt",
    "dpstrySspnsnPrdForWdrwlInNmneeNm",
    "dpstrySspnsnPrdForWdrwlInStrtNm",
    "bookClsrPrd",
    "coDpstriesSspnsnPrd",
    "spltPrd"
})
public class CorporateActionPeriod15 {

    @XmlElement(name = "PricClctnPrd")
    protected Period6Choice pricClctnPrd;
    @XmlElement(name = "IntrstPrd")
    protected Period6Choice intrstPrd;
    @XmlElement(name = "CmplsryPurchsPrd")
    protected Period6Choice cmplsryPurchsPrd;
    @XmlElement(name = "ClmPrd")
    protected Period6Choice clmPrd;
    @XmlElement(name = "DpstrySspnsnPrdForBookNtryTrf")
    protected Period6Choice dpstrySspnsnPrdForBookNtryTrf;
    @XmlElement(name = "DpstrySspnsnPrdForDpstAtAgt")
    protected Period6Choice dpstrySspnsnPrdForDpstAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForDpst")
    protected Period6Choice dpstrySspnsnPrdForDpst;
    @XmlElement(name = "DpstrySspnsnPrdForPldg")
    protected Period6Choice dpstrySspnsnPrdForPldg;
    @XmlElement(name = "DpstrySspnsnPrdForSgrtn")
    protected Period6Choice dpstrySspnsnPrdForSgrtn;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlAtAgt")
    protected Period6Choice dpstrySspnsnPrdForWdrwlAtAgt;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInNmneeNm")
    protected Period6Choice dpstrySspnsnPrdForWdrwlInNmneeNm;
    @XmlElement(name = "DpstrySspnsnPrdForWdrwlInStrtNm")
    protected Period6Choice dpstrySspnsnPrdForWdrwlInStrtNm;
    @XmlElement(name = "BookClsrPrd")
    protected Period6Choice bookClsrPrd;
    @XmlElement(name = "CoDpstriesSspnsnPrd")
    protected Period6Choice coDpstriesSspnsnPrd;
    @XmlElement(name = "SpltPrd")
    protected Period6Choice spltPrd;

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
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setIntrstPrd(Period6Choice value) {
        this.intrstPrd = value;
    }

    /**
     * Gets the value of the cmplsryPurchsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getCmplsryPurchsPrd() {
        return cmplsryPurchsPrd;
    }

    /**
     * Sets the value of the cmplsryPurchsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setCmplsryPurchsPrd(Period6Choice value) {
        this.cmplsryPurchsPrd = value;
    }

    /**
     * Gets the value of the clmPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getClmPrd() {
        return clmPrd;
    }

    /**
     * Sets the value of the clmPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setClmPrd(Period6Choice value) {
        this.clmPrd = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForBookNtryTrf() {
        return dpstrySspnsnPrdForBookNtryTrf;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForBookNtryTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForBookNtryTrf(Period6Choice value) {
        this.dpstrySspnsnPrdForBookNtryTrf = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForDpstAtAgt() {
        return dpstrySspnsnPrdForDpstAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpstAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForDpstAtAgt(Period6Choice value) {
        this.dpstrySspnsnPrdForDpstAtAgt = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForDpst() {
        return dpstrySspnsnPrdForDpst;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForDpst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForDpst(Period6Choice value) {
        this.dpstrySspnsnPrdForDpst = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForPldg() {
        return dpstrySspnsnPrdForPldg;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForPldg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForPldg(Period6Choice value) {
        this.dpstrySspnsnPrdForPldg = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForSgrtn() {
        return dpstrySspnsnPrdForSgrtn;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForSgrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForSgrtn(Period6Choice value) {
        this.dpstrySspnsnPrdForSgrtn = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlAtAgt() {
        return dpstrySspnsnPrdForWdrwlAtAgt;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlAtAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForWdrwlAtAgt(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlAtAgt = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlInNmneeNm() {
        return dpstrySspnsnPrdForWdrwlInNmneeNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInNmneeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForWdrwlInNmneeNm(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlInNmneeNm = value;
    }

    /**
     * Gets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getDpstrySspnsnPrdForWdrwlInStrtNm() {
        return dpstrySspnsnPrdForWdrwlInStrtNm;
    }

    /**
     * Sets the value of the dpstrySspnsnPrdForWdrwlInStrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setDpstrySspnsnPrdForWdrwlInStrtNm(Period6Choice value) {
        this.dpstrySspnsnPrdForWdrwlInStrtNm = value;
    }

    /**
     * Gets the value of the bookClsrPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getBookClsrPrd() {
        return bookClsrPrd;
    }

    /**
     * Sets the value of the bookClsrPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setBookClsrPrd(Period6Choice value) {
        this.bookClsrPrd = value;
    }

    /**
     * Gets the value of the coDpstriesSspnsnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getCoDpstriesSspnsnPrd() {
        return coDpstriesSspnsnPrd;
    }

    /**
     * Sets the value of the coDpstriesSspnsnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setCoDpstriesSspnsnPrd(Period6Choice value) {
        this.coDpstriesSspnsnPrd = value;
    }

    /**
     * Gets the value of the spltPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period6Choice }
     *     
     */
    public Period6Choice getSpltPrd() {
        return spltPrd;
    }

    /**
     * Sets the value of the spltPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period6Choice }
     *     
     */
    public void setSpltPrd(Period6Choice value) {
        this.spltPrd = value;
    }

}
