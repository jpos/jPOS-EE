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
 * <p>Java class for AssetClassCommodityAgricultural6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityAgricultural6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="GrnOilSeed" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityOilSeed2"/>
 *         <element name="Soft" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommoditySoft2"/>
 *         <element name="Ptt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityPotato2"/>
 *         <element name="OlvOil" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityOliveOil3"/>
 *         <element name="Dairy" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityDairy2"/>
 *         <element name="Frstry" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityForestry2"/>
 *         <element name="Sfd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommoditySeafood2"/>
 *         <element name="LiveStock" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityLiveStock2"/>
 *         <element name="Grn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityGrain3"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}AgriculturalCommodityOther2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityAgricultural6Choice", propOrder = {
    "grnOilSeed",
    "soft",
    "ptt",
    "olvOil",
    "dairy",
    "frstry",
    "sfd",
    "liveStock",
    "grn",
    "othr"
})
public class AssetClassCommodityAgricultural6Choice {

    @XmlElement(name = "GrnOilSeed")
    protected AgriculturalCommodityOilSeed2 grnOilSeed;
    @XmlElement(name = "Soft")
    protected AgriculturalCommoditySoft2 soft;
    @XmlElement(name = "Ptt")
    protected AgriculturalCommodityPotato2 ptt;
    @XmlElement(name = "OlvOil")
    protected AgriculturalCommodityOliveOil3 olvOil;
    @XmlElement(name = "Dairy")
    protected AgriculturalCommodityDairy2 dairy;
    @XmlElement(name = "Frstry")
    protected AgriculturalCommodityForestry2 frstry;
    @XmlElement(name = "Sfd")
    protected AgriculturalCommoditySeafood2 sfd;
    @XmlElement(name = "LiveStock")
    protected AgriculturalCommodityLiveStock2 liveStock;
    @XmlElement(name = "Grn")
    protected AgriculturalCommodityGrain3 grn;
    @XmlElement(name = "Othr")
    protected AgriculturalCommodityOther2 othr;

    /**
     * Gets the value of the grnOilSeed property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOilSeed2 }
     *     
     */
    public AgriculturalCommodityOilSeed2 getGrnOilSeed() {
        return grnOilSeed;
    }

    /**
     * Sets the value of the grnOilSeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOilSeed2 }
     *     
     */
    public void setGrnOilSeed(AgriculturalCommodityOilSeed2 value) {
        this.grnOilSeed = value;
    }

    /**
     * Gets the value of the soft property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySoft2 }
     *     
     */
    public AgriculturalCommoditySoft2 getSoft() {
        return soft;
    }

    /**
     * Sets the value of the soft property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySoft2 }
     *     
     */
    public void setSoft(AgriculturalCommoditySoft2 value) {
        this.soft = value;
    }

    /**
     * Gets the value of the ptt property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityPotato2 }
     *     
     */
    public AgriculturalCommodityPotato2 getPtt() {
        return ptt;
    }

    /**
     * Sets the value of the ptt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityPotato2 }
     *     
     */
    public void setPtt(AgriculturalCommodityPotato2 value) {
        this.ptt = value;
    }

    /**
     * Gets the value of the olvOil property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOliveOil3 }
     *     
     */
    public AgriculturalCommodityOliveOil3 getOlvOil() {
        return olvOil;
    }

    /**
     * Sets the value of the olvOil property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOliveOil3 }
     *     
     */
    public void setOlvOil(AgriculturalCommodityOliveOil3 value) {
        this.olvOil = value;
    }

    /**
     * Gets the value of the dairy property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityDairy2 }
     *     
     */
    public AgriculturalCommodityDairy2 getDairy() {
        return dairy;
    }

    /**
     * Sets the value of the dairy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityDairy2 }
     *     
     */
    public void setDairy(AgriculturalCommodityDairy2 value) {
        this.dairy = value;
    }

    /**
     * Gets the value of the frstry property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityForestry2 }
     *     
     */
    public AgriculturalCommodityForestry2 getFrstry() {
        return frstry;
    }

    /**
     * Sets the value of the frstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityForestry2 }
     *     
     */
    public void setFrstry(AgriculturalCommodityForestry2 value) {
        this.frstry = value;
    }

    /**
     * Gets the value of the sfd property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommoditySeafood2 }
     *     
     */
    public AgriculturalCommoditySeafood2 getSfd() {
        return sfd;
    }

    /**
     * Sets the value of the sfd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommoditySeafood2 }
     *     
     */
    public void setSfd(AgriculturalCommoditySeafood2 value) {
        this.sfd = value;
    }

    /**
     * Gets the value of the liveStock property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityLiveStock2 }
     *     
     */
    public AgriculturalCommodityLiveStock2 getLiveStock() {
        return liveStock;
    }

    /**
     * Sets the value of the liveStock property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityLiveStock2 }
     *     
     */
    public void setLiveStock(AgriculturalCommodityLiveStock2 value) {
        this.liveStock = value;
    }

    /**
     * Gets the value of the grn property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityGrain3 }
     *     
     */
    public AgriculturalCommodityGrain3 getGrn() {
        return grn;
    }

    /**
     * Sets the value of the grn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityGrain3 }
     *     
     */
    public void setGrn(AgriculturalCommodityGrain3 value) {
        this.grn = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AgriculturalCommodityOther2 }
     *     
     */
    public AgriculturalCommodityOther2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgriculturalCommodityOther2 }
     *     
     */
    public void setOthr(AgriculturalCommodityOther2 value) {
        this.othr = value;
    }

}
