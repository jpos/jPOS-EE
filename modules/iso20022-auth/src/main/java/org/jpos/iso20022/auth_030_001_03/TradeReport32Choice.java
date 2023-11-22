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

package org.jpos.iso20022.auth_030_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeReport32Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeReport32Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="New" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Mod" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Crrctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Termntn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="PosCmpnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="ValtnUpd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Cmprssn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Err" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="PortOut" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Rvv" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}TradeData42"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeReport32Choice", propOrder = {
    "_new",
    "mod",
    "crrctn",
    "termntn",
    "posCmpnt",
    "valtnUpd",
    "cmprssn",
    "err",
    "portOut",
    "rvv",
    "othr"
})
public class TradeReport32Choice {

    @XmlElement(name = "New")
    protected TradeData42 _new;
    @XmlElement(name = "Mod")
    protected TradeData42 mod;
    @XmlElement(name = "Crrctn")
    protected TradeData42 crrctn;
    @XmlElement(name = "Termntn")
    protected TradeData42 termntn;
    @XmlElement(name = "PosCmpnt")
    protected TradeData42 posCmpnt;
    @XmlElement(name = "ValtnUpd")
    protected TradeData42 valtnUpd;
    @XmlElement(name = "Cmprssn")
    protected TradeData42 cmprssn;
    @XmlElement(name = "Err")
    protected TradeData42 err;
    @XmlElement(name = "PortOut")
    protected TradeData42 portOut;
    @XmlElement(name = "Rvv")
    protected TradeData42 rvv;
    @XmlElement(name = "Othr")
    protected TradeData42 othr;

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setNew(TradeData42 value) {
        this._new = value;
    }

    /**
     * Gets the value of the mod property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getMod() {
        return mod;
    }

    /**
     * Sets the value of the mod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setMod(TradeData42 value) {
        this.mod = value;
    }

    /**
     * Gets the value of the crrctn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getCrrctn() {
        return crrctn;
    }

    /**
     * Sets the value of the crrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setCrrctn(TradeData42 value) {
        this.crrctn = value;
    }

    /**
     * Gets the value of the termntn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getTermntn() {
        return termntn;
    }

    /**
     * Sets the value of the termntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setTermntn(TradeData42 value) {
        this.termntn = value;
    }

    /**
     * Gets the value of the posCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getPosCmpnt() {
        return posCmpnt;
    }

    /**
     * Sets the value of the posCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setPosCmpnt(TradeData42 value) {
        this.posCmpnt = value;
    }

    /**
     * Gets the value of the valtnUpd property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getValtnUpd() {
        return valtnUpd;
    }

    /**
     * Sets the value of the valtnUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setValtnUpd(TradeData42 value) {
        this.valtnUpd = value;
    }

    /**
     * Gets the value of the cmprssn property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getCmprssn() {
        return cmprssn;
    }

    /**
     * Sets the value of the cmprssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setCmprssn(TradeData42 value) {
        this.cmprssn = value;
    }

    /**
     * Gets the value of the err property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getErr() {
        return err;
    }

    /**
     * Sets the value of the err property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setErr(TradeData42 value) {
        this.err = value;
    }

    /**
     * Gets the value of the portOut property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getPortOut() {
        return portOut;
    }

    /**
     * Sets the value of the portOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setPortOut(TradeData42 value) {
        this.portOut = value;
    }

    /**
     * Gets the value of the rvv property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getRvv() {
        return rvv;
    }

    /**
     * Sets the value of the rvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setRvv(TradeData42 value) {
        this.rvv = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradeData42 }
     *     
     */
    public TradeData42 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeData42 }
     *     
     */
    public void setOthr(TradeData42 value) {
        this.othr = value;
    }

}
