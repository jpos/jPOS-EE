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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReport22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReport22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeNewTransaction13"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeTransactionCorrection13"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeError9"/>
 *         <element name="EarlyTermntn" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeError9"/>
 *         <element name="PosCmpnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeTransactionPositionComponent8"/>
 *         <element name="CollUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeTransactionCollateralUpdate8"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeTransactionCorrection13"/>
 *         <element name="ValtnUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TradeValuationUpdate9"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport22Choice", propOrder = {
    "_new",
    "mod",
    "err",
    "earlyTermntn",
    "posCmpnt",
    "collUpd",
    "crrctn",
    "valtnUpd"
})
public class TradeReport22Choice {

    @XmlElement(name = "New")
    protected TradeNewTransaction13 _new;
    @XmlElement(name = "Mod")
    protected TradeTransactionCorrection13 mod;
    @XmlElement(name = "Err")
    protected TradeError9 err;
    @XmlElement(name = "EarlyTermntn")
    protected TradeError9 earlyTermntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeTransactionPositionComponent8 posCmpnt;
    @XmlElement(name = "CollUpd")
    protected TradeTransactionCollateralUpdate8 collUpd;
    @XmlElement(name = "Crrctn")
    protected TradeTransactionCorrection13 crrctn;
    @XmlElement(name = "ValtnUpd")
    protected TradeValuationUpdate9 valtnUpd;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeNewTransaction13 }
     *     
     */
    public TradeNewTransaction13 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeNewTransaction13 }
     *     
     */
    public void setNew(TradeNewTransaction13 value) {
        this._new = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeTransactionCorrection13 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public void setMod(TradeTransactionCorrection13 value) {
        this.mod = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError9 }
     *     
     */
    public TradeError9 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError9 }
     *     
     */
    public void setErr(TradeError9 value) {
        this.err = value;
    }

    /**
     * Gets the value of the earlyTermntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeError9 }
     *     
     */
    public TradeError9 getEarlyTermntn() {
        return earlyTermntn;
    }

    /**
     * Sets the value of the earlyTermntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeError9 }
     *     
     */
    public void setEarlyTermntn(TradeError9 value) {
        this.earlyTermntn = value;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionPositionComponent8 }
     *     
     */
    public TradeTransactionPositionComponent8 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionPositionComponent8 }
     *     
     */
    public void setPosCmpnt(TradeTransactionPositionComponent8 value) {
        this.posCmpnt = value;
    }

    /**
     * Gets the value of the collUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCollateralUpdate8 }
     *     
     */
    public TradeTransactionCollateralUpdate8 getCollUpd() {
        return collUpd;
    }

    /**
     * Sets the value of the collUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCollateralUpdate8 }
     *     
     */
    public void setCollUpd(TradeTransactionCollateralUpdate8 value) {
        this.collUpd = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public TradeTransactionCorrection13 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeTransactionCorrection13 }
     *     
     */
    public void setCrrctn(TradeTransactionCorrection13 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeValuationUpdate9 }
     *     
     */
    public TradeValuationUpdate9 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeValuationUpdate9 }
     *     
     */
    public void setValtnUpd(TradeValuationUpdate9 value) {
        this.valtnUpd = value;
    }

}
