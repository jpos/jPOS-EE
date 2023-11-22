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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralAmount16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ValOfCollHeld" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="TtlXpsr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="Mrgn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}AmountAndDirection53" minOccurs="0"/>
 *         <element name="TtlCollReqrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlAcrdIntrst" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlValOfOwnColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlValOfReusdColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlOfPrncpls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlPdgCollIn" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlPdgCollOut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlCshFaild" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount16", propOrder = {
    "valOfCollHeld",
    "ttlXpsr",
    "mrgn",
    "ttlCollReqrd",
    "ttlAcrdIntrst",
    "ttlValOfOwnColl",
    "ttlValOfReusdColl",
    "ttlOfPrncpls",
    "ttlPdgCollIn",
    "ttlPdgCollOut",
    "ttlCshFaild"
})
public class CollateralAmount16 {

    @XmlElement(name = "ValOfCollHeld", required = true)
    protected ActiveOrHistoricCurrencyAndAmount valOfCollHeld;
    @XmlElement(name = "TtlXpsr", required = true)
    protected ActiveOrHistoricCurrencyAndAmount ttlXpsr;
    @XmlElement(name = "Mrgn")
    protected AmountAndDirection53 mrgn;
    @XmlElement(name = "TtlCollReqrd")
    protected ActiveOrHistoricCurrencyAndAmount ttlCollReqrd;
    @XmlElement(name = "TtlAcrdIntrst")
    protected ActiveOrHistoricCurrencyAndAmount ttlAcrdIntrst;
    @XmlElement(name = "TtlValOfOwnColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfOwnColl;
    @XmlElement(name = "TtlValOfReusdColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfReusdColl;
    @XmlElement(name = "TtlOfPrncpls")
    protected ActiveOrHistoricCurrencyAndAmount ttlOfPrncpls;
    @XmlElement(name = "TtlPdgCollIn")
    protected ActiveOrHistoricCurrencyAndAmount ttlPdgCollIn;
    @XmlElement(name = "TtlPdgCollOut")
    protected ActiveOrHistoricCurrencyAndAmount ttlPdgCollOut;
    @XmlElement(name = "TtlCshFaild")
    protected ActiveOrHistoricCurrencyAndAmount ttlCshFaild;

    /**
     * Gets the value of the valOfCollHeld property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getValOfCollHeld() {
        return valOfCollHeld;
    }

    /**
     * Sets the value of the valOfCollHeld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setValOfCollHeld(ActiveOrHistoricCurrencyAndAmount value) {
        this.valOfCollHeld = value;
    }

    /**
     * Gets the value of the ttlXpsr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlXpsr() {
        return ttlXpsr;
    }

    /**
     * Sets the value of the ttlXpsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlXpsr(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlXpsr = value;
    }

    /**
     * Gets the value of the mrgn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public AmountAndDirection53 getMrgn() {
        return mrgn;
    }

    /**
     * Sets the value of the mrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection53 }
     *     
     */
    public void setMrgn(AmountAndDirection53 value) {
        this.mrgn = value;
    }

    /**
     * Gets the value of the ttlCollReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCollReqrd() {
        return ttlCollReqrd;
    }

    /**
     * Sets the value of the ttlCollReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlCollReqrd(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCollReqrd = value;
    }

    /**
     * Gets the value of the ttlAcrdIntrst property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlAcrdIntrst() {
        return ttlAcrdIntrst;
    }

    /**
     * Sets the value of the ttlAcrdIntrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlAcrdIntrst(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlAcrdIntrst = value;
    }

    /**
     * Gets the value of the ttlValOfOwnColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfOwnColl() {
        return ttlValOfOwnColl;
    }

    /**
     * Sets the value of the ttlValOfOwnColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlValOfOwnColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfOwnColl = value;
    }

    /**
     * Gets the value of the ttlValOfReusdColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlValOfReusdColl() {
        return ttlValOfReusdColl;
    }

    /**
     * Sets the value of the ttlValOfReusdColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlValOfReusdColl(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlValOfReusdColl = value;
    }

    /**
     * Gets the value of the ttlOfPrncpls property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlOfPrncpls() {
        return ttlOfPrncpls;
    }

    /**
     * Sets the value of the ttlOfPrncpls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlOfPrncpls(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlOfPrncpls = value;
    }

    /**
     * Gets the value of the ttlPdgCollIn property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlPdgCollIn() {
        return ttlPdgCollIn;
    }

    /**
     * Sets the value of the ttlPdgCollIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlPdgCollIn(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlPdgCollIn = value;
    }

    /**
     * Gets the value of the ttlPdgCollOut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlPdgCollOut() {
        return ttlPdgCollOut;
    }

    /**
     * Sets the value of the ttlPdgCollOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlPdgCollOut(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlPdgCollOut = value;
    }

    /**
     * Gets the value of the ttlCshFaild property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlCshFaild() {
        return ttlCshFaild;
    }

    /**
     * Sets the value of the ttlCshFaild property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlCshFaild(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlCshFaild = value;
    }

}
