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
 * <p>Java class for AssetClassCommodityEnergy3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityEnergy3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Elctrcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityElectricity2"/>
 *         <element name="NtrlGas" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityNaturalGas3"/>
 *         <element name="Oil" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityOil3"/>
 *         <element name="Coal" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityCoal2"/>
 *         <element name="IntrNrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityInterEnergy2"/>
 *         <element name="RnwblNrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityRenewableEnergy2"/>
 *         <element name="LghtEnd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityLightEnd2"/>
 *         <element name="Dstllts" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityDistillates2"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}EnergyCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnergy3Choice", propOrder = {
    "elctrcty",
    "ntrlGas",
    "oil",
    "coal",
    "intrNrgy",
    "rnwblNrgy",
    "lghtEnd",
    "dstllts",
    "othr"
})
public class AssetClassCommodityEnergy3Choice {

    @XmlElement(name = "Elctrcty")
    protected EnergyCommodityElectricity2 elctrcty;
    @XmlElement(name = "NtrlGas")
    protected EnergyCommodityNaturalGas3 ntrlGas;
    @XmlElement(name = "Oil")
    protected EnergyCommodityOil3 oil;
    @XmlElement(name = "Coal")
    protected EnergyCommodityCoal2 coal;
    @XmlElement(name = "IntrNrgy")
    protected EnergyCommodityInterEnergy2 intrNrgy;
    @XmlElement(name = "RnwblNrgy")
    protected EnergyCommodityRenewableEnergy2 rnwblNrgy;
    @XmlElement(name = "LghtEnd")
    protected EnergyCommodityLightEnd2 lghtEnd;
    @XmlElement(name = "Dstllts")
    protected EnergyCommodityDistillates2 dstllts;
    @XmlElement(name = "Othr")
    protected EnergyCommodityOther2 othr;

    /**
     * Gets the value of the elctrcty property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityElectricity2 }
     *     
     */
    public EnergyCommodityElectricity2 getElctrcty() {
        return elctrcty;
    }

    /**
     * Sets the value of the elctrcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityElectricity2 }
     *     
     */
    public void setElctrcty(EnergyCommodityElectricity2 value) {
        this.elctrcty = value;
    }

    /**
     * Gets the value of the ntrlGas property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityNaturalGas3 }
     *     
     */
    public EnergyCommodityNaturalGas3 getNtrlGas() {
        return ntrlGas;
    }

    /**
     * Sets the value of the ntrlGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityNaturalGas3 }
     *     
     */
    public void setNtrlGas(EnergyCommodityNaturalGas3 value) {
        this.ntrlGas = value;
    }

    /**
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOil3 }
     *     
     */
    public EnergyCommodityOil3 getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOil3 }
     *     
     */
    public void setOil(EnergyCommodityOil3 value) {
        this.oil = value;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityCoal2 }
     *     
     */
    public EnergyCommodityCoal2 getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityCoal2 }
     *     
     */
    public void setCoal(EnergyCommodityCoal2 value) {
        this.coal = value;
    }

    /**
     * Gets the value of the intrNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityInterEnergy2 }
     *     
     */
    public EnergyCommodityInterEnergy2 getIntrNrgy() {
        return intrNrgy;
    }

    /**
     * Sets the value of the intrNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityInterEnergy2 }
     *     
     */
    public void setIntrNrgy(EnergyCommodityInterEnergy2 value) {
        this.intrNrgy = value;
    }

    /**
     * Gets the value of the rnwblNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityRenewableEnergy2 }
     *     
     */
    public EnergyCommodityRenewableEnergy2 getRnwblNrgy() {
        return rnwblNrgy;
    }

    /**
     * Sets the value of the rnwblNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityRenewableEnergy2 }
     *     
     */
    public void setRnwblNrgy(EnergyCommodityRenewableEnergy2 value) {
        this.rnwblNrgy = value;
    }

    /**
     * Gets the value of the lghtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityLightEnd2 }
     *     
     */
    public EnergyCommodityLightEnd2 getLghtEnd() {
        return lghtEnd;
    }

    /**
     * Sets the value of the lghtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityLightEnd2 }
     *     
     */
    public void setLghtEnd(EnergyCommodityLightEnd2 value) {
        this.lghtEnd = value;
    }

    /**
     * Gets the value of the dstllts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityDistillates2 }
     *     
     */
    public EnergyCommodityDistillates2 getDstllts() {
        return dstllts;
    }

    /**
     * Sets the value of the dstllts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityDistillates2 }
     *     
     */
    public void setDstllts(EnergyCommodityDistillates2 value) {
        this.dstllts = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOther2 }
     *     
     */
    public EnergyCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOther2 }
     *     
     */
    public void setOthr(EnergyCommodityOther2 value) {
        this.othr = value;
    }

}
