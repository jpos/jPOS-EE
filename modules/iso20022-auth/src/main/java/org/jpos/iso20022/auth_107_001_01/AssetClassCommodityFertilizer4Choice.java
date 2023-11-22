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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityFertilizer4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityFertilizer4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Ammn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityAmmonia2"/>
 *         <element name="DmmnmPhspht" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityDiammoniumPhosphate2"/>
 *         <element name="Ptsh" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityPotash2"/>
 *         <element name="Slphr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommoditySulphur2"/>
 *         <element name="Urea" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityUrea2"/>
 *         <element name="UreaAndAmmnmNtrt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityUreaAndAmmoniumNitrate2"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}FertilizerCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFertilizer4Choice", propOrder = {
    "ammn",
    "dmmnmPhspht",
    "ptsh",
    "slphr",
    "urea",
    "ureaAndAmmnmNtrt",
    "othr"
})
public class AssetClassCommodityFertilizer4Choice {

    @XmlElement(name = "Ammn")
    protected FertilizerCommodityAmmonia2 ammn;
    @XmlElement(name = "DmmnmPhspht")
    protected FertilizerCommodityDiammoniumPhosphate2 dmmnmPhspht;
    @XmlElement(name = "Ptsh")
    protected FertilizerCommodityPotash2 ptsh;
    @XmlElement(name = "Slphr")
    protected FertilizerCommoditySulphur2 slphr;
    @XmlElement(name = "Urea")
    protected FertilizerCommodityUrea2 urea;
    @XmlElement(name = "UreaAndAmmnmNtrt")
    protected FertilizerCommodityUreaAndAmmoniumNitrate2 ureaAndAmmnmNtrt;
    @XmlElement(name = "Othr")
    protected FertilizerCommodityOther2 othr;

    /**
     * Gets the value of the ammn property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityAmmonia2 }
     *     
     */
    public FertilizerCommodityAmmonia2 getAmmn() {
        return ammn;
    }

    /**
     * Sets the value of the ammn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityAmmonia2 }
     *     
     */
    public void setAmmn(FertilizerCommodityAmmonia2 value) {
        this.ammn = value;
    }

    /**
     * Gets the value of the dmmnmPhspht property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityDiammoniumPhosphate2 }
     *     
     */
    public FertilizerCommodityDiammoniumPhosphate2 getDmmnmPhspht() {
        return dmmnmPhspht;
    }

    /**
     * Sets the value of the dmmnmPhspht property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityDiammoniumPhosphate2 }
     *     
     */
    public void setDmmnmPhspht(FertilizerCommodityDiammoniumPhosphate2 value) {
        this.dmmnmPhspht = value;
    }

    /**
     * Gets the value of the ptsh property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityPotash2 }
     *     
     */
    public FertilizerCommodityPotash2 getPtsh() {
        return ptsh;
    }

    /**
     * Sets the value of the ptsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityPotash2 }
     *     
     */
    public void setPtsh(FertilizerCommodityPotash2 value) {
        this.ptsh = value;
    }

    /**
     * Gets the value of the slphr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommoditySulphur2 }
     *     
     */
    public FertilizerCommoditySulphur2 getSlphr() {
        return slphr;
    }

    /**
     * Sets the value of the slphr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommoditySulphur2 }
     *     
     */
    public void setSlphr(FertilizerCommoditySulphur2 value) {
        this.slphr = value;
    }

    /**
     * Gets the value of the urea property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUrea2 }
     *     
     */
    public FertilizerCommodityUrea2 getUrea() {
        return urea;
    }

    /**
     * Sets the value of the urea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUrea2 }
     *     
     */
    public void setUrea(FertilizerCommodityUrea2 value) {
        this.urea = value;
    }

    /**
     * Gets the value of the ureaAndAmmnmNtrt property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate2 }
     *     
     */
    public FertilizerCommodityUreaAndAmmoniumNitrate2 getUreaAndAmmnmNtrt() {
        return ureaAndAmmnmNtrt;
    }

    /**
     * Sets the value of the ureaAndAmmnmNtrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate2 }
     *     
     */
    public void setUreaAndAmmnmNtrt(FertilizerCommodityUreaAndAmmoniumNitrate2 value) {
        this.ureaAndAmmnmNtrt = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityOther2 }
     *     
     */
    public FertilizerCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityOther2 }
     *     
     */
    public void setOthr(FertilizerCommodityOther2 value) {
        this.othr = value;
    }

}
