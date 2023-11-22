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

package org.jpos.iso20022.auth_042_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodityAgricultural1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityAgricultural1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="GrnOilSeed" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityOilSeed1"/>
 *         <element name="Soft" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommoditySoft1"/>
 *         <element name="Ptt" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityPotato1"/>
 *         <element name="OlvOil" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityOliveOil1"/>
 *         <element name="Dairy" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityDairy1"/>
 *         <element name="Frstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityForestry1"/>
 *         <element name="Sfd" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommoditySeafood1"/>
 *         <element name="LiveStock" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityLiveStock1"/>
 *         <element name="Grn" type="{urn:iso:std:iso:20022:tech:xsd:auth.042.001.02}AgriculturalCommodityGrain1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityAgricultural1Choice", propOrder = {
    "grnOilSeed",
    "soft",
    "ptt",
    "olvOil",
    "dairy",
    "frstry",
    "sfd",
    "liveStock",
    "grn"
})
public class AssetClassCommodityAgricultural1Choice {

    @XmlElement(name = "GrnOilSeed")
    protected AgriculturalCommodityOilSeed1 grnOilSeed;
    @XmlElement(name = "Soft")
    protected AgriculturalCommoditySoft1 soft;
    @XmlElement(name = "Ptt")
    protected AgriculturalCommodityPotato1 ptt;
    @XmlElement(name = "OlvOil")
    protected AgriculturalCommodityOliveOil1 olvOil;
    @XmlElement(name = "Dairy")
    protected AgriculturalCommodityDairy1 dairy;
    @XmlElement(name = "Frstry")
    protected AgriculturalCommodityForestry1 frstry;
    @XmlElement(name = "Sfd")
    protected AgriculturalCommoditySeafood1 sfd;
    @XmlElement(name = "LiveStock")
    protected AgriculturalCommodityLiveStock1 liveStock;
    @XmlElement(name = "Grn")
    protected AgriculturalCommodityGrain1 grn;

    /**
     * Gets the value of the grnOilSeed property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public AgriculturalCommodityOilSeed1 getGrnOilSeed() {
        return grnOilSeed;
    }

    /**
     * Sets the value of the grnOilSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOilSeed1 }
     *     
     */
    public void setGrnOilSeed(AgriculturalCommodityOilSeed1 value) {
        this.grnOilSeed = value;
    }

    /**
     * Gets the value of the soft property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public AgriculturalCommoditySoft1 getSoft() {
        return soft;
    }

    /**
     * Sets the value of the soft property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySoft1 }
     *     
     */
    public void setSoft(AgriculturalCommoditySoft1 value) {
        this.soft = value;
    }

    /**
     * Gets the value of the ptt property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public AgriculturalCommodityPotato1 getPtt() {
        return ptt;
    }

    /**
     * Sets the value of the ptt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityPotato1 }
     *     
     */
    public void setPtt(AgriculturalCommodityPotato1 value) {
        this.ptt = value;
    }

    /**
     * Gets the value of the olvOil property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOliveOil1 }
     *     
     */
    public AgriculturalCommodityOliveOil1 getOlvOil() {
        return olvOil;
    }

    /**
     * Sets the value of the olvOil property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOliveOil1 }
     *     
     */
    public void setOlvOil(AgriculturalCommodityOliveOil1 value) {
        this.olvOil = value;
    }

    /**
     * Gets the value of the dairy property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public AgriculturalCommodityDairy1 getDairy() {
        return dairy;
    }

    /**
     * Sets the value of the dairy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityDairy1 }
     *     
     */
    public void setDairy(AgriculturalCommodityDairy1 value) {
        this.dairy = value;
    }

    /**
     * Gets the value of the frstry property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public AgriculturalCommodityForestry1 getFrstry() {
        return frstry;
    }

    /**
     * Sets the value of the frstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityForestry1 }
     *     
     */
    public void setFrstry(AgriculturalCommodityForestry1 value) {
        this.frstry = value;
    }

    /**
     * Gets the value of the sfd property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public AgriculturalCommoditySeafood1 getSfd() {
        return sfd;
    }

    /**
     * Sets the value of the sfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySeafood1 }
     *     
     */
    public void setSfd(AgriculturalCommoditySeafood1 value) {
        this.sfd = value;
    }

    /**
     * Gets the value of the liveStock property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public AgriculturalCommodityLiveStock1 getLiveStock() {
        return liveStock;
    }

    /**
     * Sets the value of the liveStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityLiveStock1 }
     *     
     */
    public void setLiveStock(AgriculturalCommodityLiveStock1 value) {
        this.liveStock = value;
    }

    /**
     * Gets the value of the grn property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityGrain1 }
     *     
     */
    public AgriculturalCommodityGrain1 getGrn() {
        return grn;
    }

    /**
     * Sets the value of the grn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityGrain1 }
     *     
     */
    public void setGrn(AgriculturalCommodityGrain1 value) {
        this.grn = value;
    }

}
