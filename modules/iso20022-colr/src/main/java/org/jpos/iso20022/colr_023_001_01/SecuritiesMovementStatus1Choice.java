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

package org.jpos.iso20022.colr_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesMovementStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesMovementStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Csh" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Excld" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Futr" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="MnlyAccptd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Elgblty" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *         <element name="Wait" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryReason4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesMovementStatus1Choice", propOrder = {
    "amt",
    "csh",
    "ccy",
    "excld",
    "futr",
    "pdg",
    "mnlyAccptd",
    "elgblty",
    "tax",
    "wait"
})
public class SecuritiesMovementStatus1Choice {

    @XmlElement(name = "Amt")
    protected ProprietaryReason4 amt;
    @XmlElement(name = "Csh")
    protected ProprietaryReason4 csh;
    @XmlElement(name = "Ccy")
    protected ProprietaryReason4 ccy;
    @XmlElement(name = "Excld")
    protected ProprietaryReason4 excld;
    @XmlElement(name = "Futr")
    protected ProprietaryReason4 futr;
    @XmlElement(name = "Pdg")
    protected ProprietaryReason4 pdg;
    @XmlElement(name = "MnlyAccptd")
    protected ProprietaryReason4 mnlyAccptd;
    @XmlElement(name = "Elgblty")
    protected ProprietaryReason4 elgblty;
    @XmlElement(name = "Tax")
    protected ProprietaryReason4 tax;
    @XmlElement(name = "Wait")
    protected ProprietaryReason4 wait;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setAmt(ProprietaryReason4 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the csh property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCsh() {
        return csh;
    }

    /**
     * Sets the value of the csh property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCsh(ProprietaryReason4 value) {
        this.csh = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setCcy(ProprietaryReason4 value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the excld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getExcld() {
        return excld;
    }

    /**
     * Sets the value of the excld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setExcld(ProprietaryReason4 value) {
        this.excld = value;
    }

    /**
     * Gets the value of the futr property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getFutr() {
        return futr;
    }

    /**
     * Sets the value of the futr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setFutr(ProprietaryReason4 value) {
        this.futr = value;
    }

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setPdg(ProprietaryReason4 value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the mnlyAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getMnlyAccptd() {
        return mnlyAccptd;
    }

    /**
     * Sets the value of the mnlyAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setMnlyAccptd(ProprietaryReason4 value) {
        this.mnlyAccptd = value;
    }

    /**
     * Gets the value of the elgblty property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getElgblty() {
        return elgblty;
    }

    /**
     * Sets the value of the elgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setElgblty(ProprietaryReason4 value) {
        this.elgblty = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getTax() {
        return tax;
    }

    /**
     * Sets the value of the tax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setTax(ProprietaryReason4 value) {
        this.tax = value;
    }

    /**
     * Gets the value of the wait property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getWait() {
        return wait;
    }

    /**
     * Sets the value of the wait property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setWait(ProprietaryReason4 value) {
        this.wait = value;
    }

}
