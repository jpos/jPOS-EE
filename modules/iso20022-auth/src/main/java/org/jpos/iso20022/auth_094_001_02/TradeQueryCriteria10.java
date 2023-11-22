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

package org.jpos.iso20022.auth_094_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeQueryCriteria10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeQueryCriteria10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradLifeCyclHstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TrueFalseIndicator"/>
 *         <element name="OutsdngTradInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TrueFalseIndicator"/>
 *         <element name="TradPtyCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradePartyQueryCriteria5" minOccurs="0"/>
 *         <element name="TradTpCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradeTypeQueryCriteria2" minOccurs="0"/>
 *         <element name="TmCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradeDateTimeQueryCriteria2" minOccurs="0"/>
 *         <element name="OthrCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.094.001.02}TradeAdditionalQueryCriteria7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryCriteria10", propOrder = {
    "tradLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "tradTpCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria10 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected boolean tradLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria5 tradPtyCrit;
    @XmlElement(name = "TradTpCrit")
    protected TradeTypeQueryCriteria2 tradTpCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria2 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria7 othrCrit;

    /**
     * Gets the value of the tradLifeCyclHstry property.
     * 
     */
    public boolean isTradLifeCyclHstry() {
        return tradLifeCyclHstry;
    }

    /**
     * Sets the value of the tradLifeCyclHstry property.
     * 
     */
    public void setTradLifeCyclHstry(boolean value) {
        this.tradLifeCyclHstry = value;
    }

    /**
     * Gets the value of the outsdngTradInd property.
     * 
     */
    public boolean isOutsdngTradInd() {
        return outsdngTradInd;
    }

    /**
     * Sets the value of the outsdngTradInd property.
     * 
     */
    public void setOutsdngTradInd(boolean value) {
        this.outsdngTradInd = value;
    }

    /**
     * Gets the value of the tradPtyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyQueryCriteria5 }
     *     
     */
    public TradePartyQueryCriteria5 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria5 }
     *     
     */
    public void setTradPtyCrit(TradePartyQueryCriteria5 value) {
        this.tradPtyCrit = value;
    }

    /**
     * Gets the value of the tradTpCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTypeQueryCriteria2 }
     *     
     */
    public TradeTypeQueryCriteria2 getTradTpCrit() {
        return tradTpCrit;
    }

    /**
     * Sets the value of the tradTpCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTypeQueryCriteria2 }
     *     
     */
    public void setTradTpCrit(TradeTypeQueryCriteria2 value) {
        this.tradTpCrit = value;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public TradeDateTimeQueryCriteria2 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria2 }
     *     
     */
    public void setTmCrit(TradeDateTimeQueryCriteria2 value) {
        this.tmCrit = value;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria7 }
     *     
     */
    public TradeAdditionalQueryCriteria7 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria7 }
     *     
     */
    public void setOthrCrit(TradeAdditionalQueryCriteria7 value) {
        this.othrCrit = value;
    }

}
