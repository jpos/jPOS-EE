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

package org.jpos.iso20022.auth_029_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeQueryCriteria14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeQueryCriteria14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradLifeCyclHstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MrgnLifeCyclHstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OutsdngTradInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TrueFalseIndicator"/>
 *         <element name="TradPtyCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradePartyQueryCriteria7" minOccurs="0"/>
 *         <element name="FinInstrmCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeSecurityIdentificationQueryCriteria3" minOccurs="0"/>
 *         <element name="TmCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeDateTimeQueryCriteria6" minOccurs="0"/>
 *         <element name="OthrCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}TradeAdditionalQueryCriteria9" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryCriteria14", propOrder = {
    "tradLifeCyclHstry",
    "mrgnLifeCyclHstry",
    "outsdngTradInd",
    "tradPtyCrit",
    "finInstrmCrit",
    "tmCrit",
    "othrCrit"
})
public class TradeQueryCriteria14 {

    @XmlElement(name = "TradLifeCyclHstry")
    protected Boolean tradLifeCyclHstry;
    @XmlElement(name = "MrgnLifeCyclHstry")
    protected Boolean mrgnLifeCyclHstry;
    @XmlElement(name = "OutsdngTradInd")
    protected boolean outsdngTradInd;
    @XmlElement(name = "TradPtyCrit")
    protected TradePartyQueryCriteria7 tradPtyCrit;
    @XmlElement(name = "FinInstrmCrit")
    protected TradeSecurityIdentificationQueryCriteria3 finInstrmCrit;
    @XmlElement(name = "TmCrit")
    protected TradeDateTimeQueryCriteria6 tmCrit;
    @XmlElement(name = "OthrCrit")
    protected TradeAdditionalQueryCriteria9 othrCrit;

    /**
     * Gets the value of the tradLifeCyclHstry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTradLifeCyclHstry() {
        return tradLifeCyclHstry;
    }

    /**
     * Sets the value of the tradLifeCyclHstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTradLifeCyclHstry(Boolean value) {
        this.tradLifeCyclHstry = value;
    }

    /**
     * Gets the value of the mrgnLifeCyclHstry property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrgnLifeCyclHstry() {
        return mrgnLifeCyclHstry;
    }

    /**
     * Sets the value of the mrgnLifeCyclHstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMrgnLifeCyclHstry(Boolean value) {
        this.mrgnLifeCyclHstry = value;
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
     *     {@link TradePartyQueryCriteria7 }
     *     
     */
    public TradePartyQueryCriteria7 getTradPtyCrit() {
        return tradPtyCrit;
    }

    /**
     * Sets the value of the tradPtyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyQueryCriteria7 }
     *     
     */
    public void setTradPtyCrit(TradePartyQueryCriteria7 value) {
        this.tradPtyCrit = value;
    }

    /**
     * Gets the value of the finInstrmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeSecurityIdentificationQueryCriteria3 }
     *     
     */
    public TradeSecurityIdentificationQueryCriteria3 getFinInstrmCrit() {
        return finInstrmCrit;
    }

    /**
     * Sets the value of the finInstrmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeSecurityIdentificationQueryCriteria3 }
     *     
     */
    public void setFinInstrmCrit(TradeSecurityIdentificationQueryCriteria3 value) {
        this.finInstrmCrit = value;
    }

    /**
     * Gets the value of the tmCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDateTimeQueryCriteria6 }
     *     
     */
    public TradeDateTimeQueryCriteria6 getTmCrit() {
        return tmCrit;
    }

    /**
     * Sets the value of the tmCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDateTimeQueryCriteria6 }
     *     
     */
    public void setTmCrit(TradeDateTimeQueryCriteria6 value) {
        this.tmCrit = value;
    }

    /**
     * Gets the value of the othrCrit property.
     * 
     * @return
     *     possible object is
     *     {@link TradeAdditionalQueryCriteria9 }
     *     
     */
    public TradeAdditionalQueryCriteria9 getOthrCrit() {
        return othrCrit;
    }

    /**
     * Sets the value of the othrCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeAdditionalQueryCriteria9 }
     *     
     */
    public void setOthrCrit(TradeAdditionalQueryCriteria9 value) {
        this.othrCrit = value;
    }

}
