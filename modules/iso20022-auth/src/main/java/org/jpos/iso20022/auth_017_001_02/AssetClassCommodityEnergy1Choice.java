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

package org.jpos.iso20022.auth_017_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityEnergy1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityEnergy1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Elctrcty" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityElectricity1"/>
 *         <element name="NtrlGas" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityNaturalGas1"/>
 *         <element name="Oil" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityOil1"/>
 *         <element name="Coal" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityCoal1"/>
 *         <element name="IntrNrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityInterEnergy1"/>
 *         <element name="RnwblNrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityRenewableEnergy1"/>
 *         <element name="LghtEnd" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityLightEnd1"/>
 *         <element name="Dstllts" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}EnergyCommodityDistillates1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityEnergy1Choice", propOrder = {
    "elctrcty",
    "ntrlGas",
    "oil",
    "coal",
    "intrNrgy",
    "rnwblNrgy",
    "lghtEnd",
    "dstllts"
})
public class AssetClassCommodityEnergy1Choice {

    @XmlElement(name = "Elctrcty")
    protected EnergyCommodityElectricity1 elctrcty;
    @XmlElement(name = "NtrlGas")
    protected EnergyCommodityNaturalGas1 ntrlGas;
    @XmlElement(name = "Oil")
    protected EnergyCommodityOil1 oil;
    @XmlElement(name = "Coal")
    protected EnergyCommodityCoal1 coal;
    @XmlElement(name = "IntrNrgy")
    protected EnergyCommodityInterEnergy1 intrNrgy;
    @XmlElement(name = "RnwblNrgy")
    protected EnergyCommodityRenewableEnergy1 rnwblNrgy;
    @XmlElement(name = "LghtEnd")
    protected EnergyCommodityLightEnd1 lghtEnd;
    @XmlElement(name = "Dstllts")
    protected EnergyCommodityDistillates1 dstllts;

    /**
     * Gets the value of the elctrcty property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public EnergyCommodityElectricity1 getElctrcty() {
        return elctrcty;
    }

    /**
     * Sets the value of the elctrcty property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityElectricity1 }
     *     
     */
    public void setElctrcty(EnergyCommodityElectricity1 value) {
        this.elctrcty = value;
    }

    /**
     * Gets the value of the ntrlGas property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public EnergyCommodityNaturalGas1 getNtrlGas() {
        return ntrlGas;
    }

    /**
     * Sets the value of the ntrlGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityNaturalGas1 }
     *     
     */
    public void setNtrlGas(EnergyCommodityNaturalGas1 value) {
        this.ntrlGas = value;
    }

    /**
     * Gets the value of the oil property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public EnergyCommodityOil1 getOil() {
        return oil;
    }

    /**
     * Sets the value of the oil property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityOil1 }
     *     
     */
    public void setOil(EnergyCommodityOil1 value) {
        this.oil = value;
    }

    /**
     * Gets the value of the coal property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public EnergyCommodityCoal1 getCoal() {
        return coal;
    }

    /**
     * Sets the value of the coal property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityCoal1 }
     *     
     */
    public void setCoal(EnergyCommodityCoal1 value) {
        this.coal = value;
    }

    /**
     * Gets the value of the intrNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public EnergyCommodityInterEnergy1 getIntrNrgy() {
        return intrNrgy;
    }

    /**
     * Sets the value of the intrNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityInterEnergy1 }
     *     
     */
    public void setIntrNrgy(EnergyCommodityInterEnergy1 value) {
        this.intrNrgy = value;
    }

    /**
     * Gets the value of the rnwblNrgy property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public EnergyCommodityRenewableEnergy1 getRnwblNrgy() {
        return rnwblNrgy;
    }

    /**
     * Sets the value of the rnwblNrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityRenewableEnergy1 }
     *     
     */
    public void setRnwblNrgy(EnergyCommodityRenewableEnergy1 value) {
        this.rnwblNrgy = value;
    }

    /**
     * Gets the value of the lghtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public EnergyCommodityLightEnd1 getLghtEnd() {
        return lghtEnd;
    }

    /**
     * Sets the value of the lghtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityLightEnd1 }
     *     
     */
    public void setLghtEnd(EnergyCommodityLightEnd1 value) {
        this.lghtEnd = value;
    }

    /**
     * Gets the value of the dstllts property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public EnergyCommodityDistillates1 getDstllts() {
        return dstllts;
    }

    /**
     * Sets the value of the dstllts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyCommodityDistillates1 }
     *     
     */
    public void setDstllts(EnergyCommodityDistillates1 value) {
        this.dstllts = value;
    }

}
