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
 * <p>Java class for CollateralAmount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActlMktValPstValtnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="ActlMktValBfrValtnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrCollInTxCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrCollInRptgCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktValAmtPstValtnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktValAmtBfrValtnFctr" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlValOfOwnColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlValOfReusdColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount4", propOrder = {
    "actlMktValPstValtnFctr",
    "actlMktValBfrValtnFctr",
    "xpsrCollInTxCcy",
    "xpsrCollInRptgCcy",
    "mktValAmtPstValtnFctr",
    "mktValAmtBfrValtnFctr",
    "ttlValOfOwnColl",
    "ttlValOfReusdColl"
})
public class CollateralAmount4 {

    @XmlElement(name = "ActlMktValPstValtnFctr", required = true)
    protected ActiveOrHistoricCurrencyAndAmount actlMktValPstValtnFctr;
    @XmlElement(name = "ActlMktValBfrValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount actlMktValBfrValtnFctr;
    @XmlElement(name = "XpsrCollInTxCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInTxCcy;
    @XmlElement(name = "XpsrCollInRptgCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInRptgCcy;
    @XmlElement(name = "MktValAmtPstValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtPstValtnFctr;
    @XmlElement(name = "MktValAmtBfrValtnFctr")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtBfrValtnFctr;
    @XmlElement(name = "TtlValOfOwnColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfOwnColl;
    @XmlElement(name = "TtlValOfReusdColl")
    protected ActiveOrHistoricCurrencyAndAmount ttlValOfReusdColl;

    /**
     * Gets the value of the actlMktValPstValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValPstValtnFctr() {
        return actlMktValPstValtnFctr;
    }

    /**
     * Sets the value of the actlMktValPstValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setActlMktValPstValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValPstValtnFctr = value;
    }

    /**
     * Gets the value of the actlMktValBfrValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValBfrValtnFctr() {
        return actlMktValBfrValtnFctr;
    }

    /**
     * Sets the value of the actlMktValBfrValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setActlMktValBfrValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValBfrValtnFctr = value;
    }

    /**
     * Gets the value of the xpsrCollInTxCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXpsrCollInTxCcy() {
        return xpsrCollInTxCcy;
    }

    /**
     * Sets the value of the xpsrCollInTxCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setXpsrCollInTxCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrCollInTxCcy = value;
    }

    /**
     * Gets the value of the xpsrCollInRptgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getXpsrCollInRptgCcy() {
        return xpsrCollInRptgCcy;
    }

    /**
     * Sets the value of the xpsrCollInRptgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setXpsrCollInRptgCcy(ActiveOrHistoricCurrencyAndAmount value) {
        this.xpsrCollInRptgCcy = value;
    }

    /**
     * Gets the value of the mktValAmtPstValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtPstValtnFctr() {
        return mktValAmtPstValtnFctr;
    }

    /**
     * Sets the value of the mktValAmtPstValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMktValAmtPstValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtPstValtnFctr = value;
    }

    /**
     * Gets the value of the mktValAmtBfrValtnFctr property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtBfrValtnFctr() {
        return mktValAmtBfrValtnFctr;
    }

    /**
     * Sets the value of the mktValAmtBfrValtnFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMktValAmtBfrValtnFctr(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtBfrValtnFctr = value;
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

}
