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

package org.jpos.iso20022.auth_055_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraDayRequirement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraDayRequirement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntraDayMrgnCall" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PeakInitlMrgnLblty" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PeakVartnMrgnLblty" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="AggtPeakLblty" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="MrgnAcctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}GenericIdentification165"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraDayRequirement1", propOrder = {
    "intraDayMrgnCall",
    "peakInitlMrgnLblty",
    "peakVartnMrgnLblty",
    "aggtPeakLblty",
    "mrgnAcctId"
})
public class IntraDayRequirement1 {

    @XmlElement(name = "IntraDayMrgnCall", required = true)
    protected ActiveCurrencyAndAmount intraDayMrgnCall;
    @XmlElement(name = "PeakInitlMrgnLblty", required = true)
    protected ActiveCurrencyAndAmount peakInitlMrgnLblty;
    @XmlElement(name = "PeakVartnMrgnLblty", required = true)
    protected ActiveCurrencyAndAmount peakVartnMrgnLblty;
    @XmlElement(name = "AggtPeakLblty", required = true)
    protected ActiveCurrencyAndAmount aggtPeakLblty;
    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;

    /**
     * Gets the value of the intraDayMrgnCall property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntraDayMrgnCall() {
        return intraDayMrgnCall;
    }

    /**
     * Sets the value of the intraDayMrgnCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntraDayMrgnCall(ActiveCurrencyAndAmount value) {
        this.intraDayMrgnCall = value;
    }

    /**
     * Gets the value of the peakInitlMrgnLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakInitlMrgnLblty() {
        return peakInitlMrgnLblty;
    }

    /**
     * Sets the value of the peakInitlMrgnLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPeakInitlMrgnLblty(ActiveCurrencyAndAmount value) {
        this.peakInitlMrgnLblty = value;
    }

    /**
     * Gets the value of the peakVartnMrgnLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPeakVartnMrgnLblty() {
        return peakVartnMrgnLblty;
    }

    /**
     * Sets the value of the peakVartnMrgnLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPeakVartnMrgnLblty(ActiveCurrencyAndAmount value) {
        this.peakVartnMrgnLblty = value;
    }

    /**
     * Gets the value of the aggtPeakLblty property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtPeakLblty() {
        return aggtPeakLblty;
    }

    /**
     * Sets the value of the aggtPeakLblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAggtPeakLblty(ActiveCurrencyAndAmount value) {
        this.aggtPeakLblty = value;
    }

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
    }

}
