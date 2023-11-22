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

package org.jpos.iso20022.auth_070_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReport21Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReport21Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}CollateralMarginCorrection6"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}CollateralMarginError4"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}CollateralMarginCorrection6"/>
 *         <element name="TradUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.070.001.02}CollateralMarginMarginUpdate5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport21Choice", propOrder = {
    "_new",
    "err",
    "crrctn",
    "tradUpd"
})
public class TradeReport21Choice {

    @XmlElement(name = "New")
    protected CollateralMarginCorrection6 _new;
    @XmlElement(name = "Err")
    protected CollateralMarginError4 err;
    @XmlElement(name = "Crrctn")
    protected CollateralMarginCorrection6 crrctn;
    @XmlElement(name = "TradUpd")
    protected CollateralMarginMarginUpdate5 tradUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public CollateralMarginCorrection6 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public void setNew(CollateralMarginCorrection6 value) {
        this._new = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginError4 }
     *     
     */
    public CollateralMarginError4 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginError4 }
     *     
     */
    public void setErr(CollateralMarginError4 value) {
        this.err = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public CollateralMarginCorrection6 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginCorrection6 }
     *     
     */
    public void setCrrctn(CollateralMarginCorrection6 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the tradUpd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMarginMarginUpdate5 }
     *     
     */
    public CollateralMarginMarginUpdate5 getTradUpd() {
        return tradUpd;
    }

    /**
     * Sets the value of the tradUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMarginMarginUpdate5 }
     *     
     */
    public void setTradUpd(CollateralMarginMarginUpdate5 value) {
        this.tradUpd = value;
    }

}
