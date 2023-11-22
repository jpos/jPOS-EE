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

package org.jpos.iso20022.auth_033_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Derivative3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Derivative3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CommodityDerivative4"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}InterestRateDerivative5"/>
 *         <element name="FX" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ForeignExchangeDerivative2"/>
 *         <element name="Eqty" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}EquityDerivative2"/>
 *         <element name="CtrctForDiff" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}ContractForDifference2"/>
 *         <element name="Cdt" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}CreditDefaultSwapsDerivative4Choice"/>
 *         <element name="EmssnAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:auth.033.001.02}EmissionAllowanceProductType1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Derivative3Choice", propOrder = {
    "cmmdty",
    "intrstRate",
    "fx",
    "eqty",
    "ctrctForDiff",
    "cdt",
    "emssnAllwnc"
})
public class Derivative3Choice {

    @XmlElement(name = "Cmmdty")
    protected CommodityDerivative4 cmmdty;
    @XmlElement(name = "IntrstRate")
    protected InterestRateDerivative5 intrstRate;
    @XmlElement(name = "FX")
    protected ForeignExchangeDerivative2 fx;
    @XmlElement(name = "Eqty")
    protected EquityDerivative2 eqty;
    @XmlElement(name = "CtrctForDiff")
    protected ContractForDifference2 ctrctForDiff;
    @XmlElement(name = "Cdt")
    protected CreditDefaultSwapsDerivative4Choice cdt;
    @XmlElement(name = "EmssnAllwnc")
    @XmlSchemaType(name = "string")
    protected EmissionAllowanceProductType1Code emssnAllwnc;

    /**
     * Gets the value of the cmmdty property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDerivative4 }
     *     
     */
    public CommodityDerivative4 getCmmdty() {
        return cmmdty;
    }

    /**
     * Sets the value of the cmmdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDerivative4 }
     *     
     */
    public void setCmmdty(CommodityDerivative4 value) {
        this.cmmdty = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link InterestRateDerivative5 }
     *     
     */
    public InterestRateDerivative5 getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestRateDerivative5 }
     *     
     */
    public void setIntrstRate(InterestRateDerivative5 value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the fx property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeDerivative2 }
     *     
     */
    public ForeignExchangeDerivative2 getFX() {
        return fx;
    }

    /**
     * Sets the value of the fx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeDerivative2 }
     *     
     */
    public void setFX(ForeignExchangeDerivative2 value) {
        this.fx = value;
    }

    /**
     * Gets the value of the eqty property.
     * 
     * @return
     *     possible object is
     *     {@link EquityDerivative2 }
     *     
     */
    public EquityDerivative2 getEqty() {
        return eqty;
    }

    /**
     * Sets the value of the eqty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityDerivative2 }
     *     
     */
    public void setEqty(EquityDerivative2 value) {
        this.eqty = value;
    }

    /**
     * Gets the value of the ctrctForDiff property.
     * 
     * @return
     *     possible object is
     *     {@link ContractForDifference2 }
     *     
     */
    public ContractForDifference2 getCtrctForDiff() {
        return ctrctForDiff;
    }

    /**
     * Sets the value of the ctrctForDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractForDifference2 }
     *     
     */
    public void setCtrctForDiff(ContractForDifference2 value) {
        this.ctrctForDiff = value;
    }

    /**
     * Gets the value of the cdt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDefaultSwapsDerivative4Choice }
     *     
     */
    public CreditDefaultSwapsDerivative4Choice getCdt() {
        return cdt;
    }

    /**
     * Sets the value of the cdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDefaultSwapsDerivative4Choice }
     *     
     */
    public void setCdt(CreditDefaultSwapsDerivative4Choice value) {
        this.cdt = value;
    }

    /**
     * Gets the value of the emssnAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link EmissionAllowanceProductType1Code }
     *     
     */
    public EmissionAllowanceProductType1Code getEmssnAllwnc() {
        return emssnAllwnc;
    }

    /**
     * Sets the value of the emssnAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmissionAllowanceProductType1Code }
     *     
     */
    public void setEmssnAllwnc(EmissionAllowanceProductType1Code value) {
        this.emssnAllwnc = value;
    }

}
