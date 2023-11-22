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

package org.jpos.iso20022.auth_090_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetCollateralDimensions3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetCollateralDimensions3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPtyId" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}TradeCounterpartyReport20" minOccurs="0"/>
 *         <element name="Coll" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}MarginCollateralReport4" minOccurs="0"/>
 *         <element name="InitlMrgnPstdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="VartnMrgnPstdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="InitlMrgnRcvdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="VartnMrgnRcvdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="XcssCollPstdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="XcssCollRcvdCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetCollateralDimensions3", propOrder = {
    "ctrPtyId",
    "coll",
    "initlMrgnPstdCcy",
    "vartnMrgnPstdCcy",
    "initlMrgnRcvdCcy",
    "vartnMrgnRcvdCcy",
    "xcssCollPstdCcy",
    "xcssCollRcvdCcy"
})
public class PositionSetCollateralDimensions3 {

    @XmlElement(name = "CtrPtyId")
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "Coll")
    protected MarginCollateralReport4 coll;
    @XmlElement(name = "InitlMrgnPstdCcy")
    protected String initlMrgnPstdCcy;
    @XmlElement(name = "VartnMrgnPstdCcy")
    protected String vartnMrgnPstdCcy;
    @XmlElement(name = "InitlMrgnRcvdCcy")
    protected String initlMrgnRcvdCcy;
    @XmlElement(name = "VartnMrgnRcvdCcy")
    protected String vartnMrgnRcvdCcy;
    @XmlElement(name = "XcssCollPstdCcy")
    protected String xcssCollPstdCcy;
    @XmlElement(name = "XcssCollRcvdCcy")
    protected String xcssCollRcvdCcy;

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public void setCtrPtyId(TradeCounterpartyReport20 value) {
        this.ctrPtyId = value;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public void setColl(MarginCollateralReport4 value) {
        this.coll = value;
    }

    /**
     * Gets the value of the initlMrgnPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlMrgnPstdCcy() {
        return initlMrgnPstdCcy;
    }

    /**
     * Sets the value of the initlMrgnPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitlMrgnPstdCcy(String value) {
        this.initlMrgnPstdCcy = value;
    }

    /**
     * Gets the value of the vartnMrgnPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartnMrgnPstdCcy() {
        return vartnMrgnPstdCcy;
    }

    /**
     * Sets the value of the vartnMrgnPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartnMrgnPstdCcy(String value) {
        this.vartnMrgnPstdCcy = value;
    }

    /**
     * Gets the value of the initlMrgnRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitlMrgnRcvdCcy() {
        return initlMrgnRcvdCcy;
    }

    /**
     * Sets the value of the initlMrgnRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitlMrgnRcvdCcy(String value) {
        this.initlMrgnRcvdCcy = value;
    }

    /**
     * Gets the value of the vartnMrgnRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVartnMrgnRcvdCcy() {
        return vartnMrgnRcvdCcy;
    }

    /**
     * Sets the value of the vartnMrgnRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVartnMrgnRcvdCcy(String value) {
        this.vartnMrgnRcvdCcy = value;
    }

    /**
     * Gets the value of the xcssCollPstdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcssCollPstdCcy() {
        return xcssCollPstdCcy;
    }

    /**
     * Sets the value of the xcssCollPstdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcssCollPstdCcy(String value) {
        this.xcssCollPstdCcy = value;
    }

    /**
     * Gets the value of the xcssCollRcvdCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXcssCollRcvdCcy() {
        return xcssCollRcvdCcy;
    }

    /**
     * Sets the value of the xcssCollRcvdCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXcssCollRcvdCcy(String value) {
        this.xcssCollRcvdCcy = value;
    }

}
