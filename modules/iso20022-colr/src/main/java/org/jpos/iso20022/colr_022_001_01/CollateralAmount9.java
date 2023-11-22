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
 * <p>Java class for CollateralAmount9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralAmount9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActlMktValPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="ActlMktValBfrHrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrCollInTxCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrCollInRptgCcy" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktValAmtPstHrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MktValAmtBfrHrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralAmount9", propOrder = {
    "actlMktValPstHrcut",
    "actlMktValBfrHrcut",
    "xpsrCollInTxCcy",
    "xpsrCollInRptgCcy",
    "mktValAmtPstHrcut",
    "mktValAmtBfrHrcut"
})
public class CollateralAmount9 {

    @XmlElement(name = "ActlMktValPstHrcut", required = true)
    protected ActiveOrHistoricCurrencyAndAmount actlMktValPstHrcut;
    @XmlElement(name = "ActlMktValBfrHrcut")
    protected ActiveOrHistoricCurrencyAndAmount actlMktValBfrHrcut;
    @XmlElement(name = "XpsrCollInTxCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInTxCcy;
    @XmlElement(name = "XpsrCollInRptgCcy")
    protected ActiveOrHistoricCurrencyAndAmount xpsrCollInRptgCcy;
    @XmlElement(name = "MktValAmtPstHrcut")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtPstHrcut;
    @XmlElement(name = "MktValAmtBfrHrcut")
    protected ActiveOrHistoricCurrencyAndAmount mktValAmtBfrHrcut;

    /**
     * Gets the value of the actlMktValPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValPstHrcut() {
        return actlMktValPstHrcut;
    }

    /**
     * Sets the value of the actlMktValPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setActlMktValPstHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValPstHrcut = value;
    }

    /**
     * Gets the value of the actlMktValBfrHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getActlMktValBfrHrcut() {
        return actlMktValBfrHrcut;
    }

    /**
     * Sets the value of the actlMktValBfrHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setActlMktValBfrHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.actlMktValBfrHrcut = value;
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
     * Gets the value of the mktValAmtPstHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtPstHrcut() {
        return mktValAmtPstHrcut;
    }

    /**
     * Sets the value of the mktValAmtPstHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMktValAmtPstHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtPstHrcut = value;
    }

    /**
     * Gets the value of the mktValAmtBfrHrcut property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getMktValAmtBfrHrcut() {
        return mktValAmtBfrHrcut;
    }

    /**
     * Sets the value of the mktValAmtBfrHrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setMktValAmtBfrHrcut(ActiveOrHistoricCurrencyAndAmount value) {
        this.mktValAmtBfrHrcut = value;
    }

}
