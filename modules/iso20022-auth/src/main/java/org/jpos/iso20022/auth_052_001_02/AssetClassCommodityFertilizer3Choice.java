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
 * <p>Java class for AssetClassCommodityFertilizer3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityFertilizer3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Ammn" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityAmmonia1"/>
 *         <element name="DmmnmPhspht" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityDiammoniumPhosphate1"/>
 *         <element name="Ptsh" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityPotash1"/>
 *         <element name="Slphr" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommoditySulphur1"/>
 *         <element name="Urea" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityUrea1"/>
 *         <element name="UreaAndAmmnmNtrt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityUreaAndAmmoniumNitrate1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FertilizerCommodityOther1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityFertilizer3Choice", propOrder = {
    "ammn",
    "dmmnmPhspht",
    "ptsh",
    "slphr",
    "urea",
    "ureaAndAmmnmNtrt",
    "othr"
})
public class AssetClassCommodityFertilizer3Choice {

    @XmlElement(name = "Ammn")
    protected FertilizerCommodityAmmonia1 ammn;
    @XmlElement(name = "DmmnmPhspht")
    protected FertilizerCommodityDiammoniumPhosphate1 dmmnmPhspht;
    @XmlElement(name = "Ptsh")
    protected FertilizerCommodityPotash1 ptsh;
    @XmlElement(name = "Slphr")
    protected FertilizerCommoditySulphur1 slphr;
    @XmlElement(name = "Urea")
    protected FertilizerCommodityUrea1 urea;
    @XmlElement(name = "UreaAndAmmnmNtrt")
    protected FertilizerCommodityUreaAndAmmoniumNitrate1 ureaAndAmmnmNtrt;
    @XmlElement(name = "Othr")
    protected FertilizerCommodityOther1 othr;

    /**
     * Gets the value of the ammn property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public FertilizerCommodityAmmonia1 getAmmn() {
        return ammn;
    }

    /**
     * Sets the value of the ammn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityAmmonia1 }
     *     
     */
    public void setAmmn(FertilizerCommodityAmmonia1 value) {
        this.ammn = value;
    }

    /**
     * Gets the value of the dmmnmPhspht property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public FertilizerCommodityDiammoniumPhosphate1 getDmmnmPhspht() {
        return dmmnmPhspht;
    }

    /**
     * Sets the value of the dmmnmPhspht property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityDiammoniumPhosphate1 }
     *     
     */
    public void setDmmnmPhspht(FertilizerCommodityDiammoniumPhosphate1 value) {
        this.dmmnmPhspht = value;
    }

    /**
     * Gets the value of the ptsh property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public FertilizerCommodityPotash1 getPtsh() {
        return ptsh;
    }

    /**
     * Sets the value of the ptsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityPotash1 }
     *     
     */
    public void setPtsh(FertilizerCommodityPotash1 value) {
        this.ptsh = value;
    }

    /**
     * Gets the value of the slphr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public FertilizerCommoditySulphur1 getSlphr() {
        return slphr;
    }

    /**
     * Sets the value of the slphr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommoditySulphur1 }
     *     
     */
    public void setSlphr(FertilizerCommoditySulphur1 value) {
        this.slphr = value;
    }

    /**
     * Gets the value of the urea property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public FertilizerCommodityUrea1 getUrea() {
        return urea;
    }

    /**
     * Sets the value of the urea property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUrea1 }
     *     
     */
    public void setUrea(FertilizerCommodityUrea1 value) {
        this.urea = value;
    }

    /**
     * Gets the value of the ureaAndAmmnmNtrt property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public FertilizerCommodityUreaAndAmmoniumNitrate1 getUreaAndAmmnmNtrt() {
        return ureaAndAmmnmNtrt;
    }

    /**
     * Sets the value of the ureaAndAmmnmNtrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityUreaAndAmmoniumNitrate1 }
     *     
     */
    public void setUreaAndAmmnmNtrt(FertilizerCommodityUreaAndAmmoniumNitrate1 value) {
        this.ureaAndAmmnmNtrt = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link FertilizerCommodityOther1 }
     *     
     */
    public FertilizerCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FertilizerCommodityOther1 }
     *     
     */
    public void setOthr(FertilizerCommodityOther1 value) {
        this.othr = value;
    }

}
