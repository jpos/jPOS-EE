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

package org.jpos.iso20022.auth_102_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodity3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodity3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Agrcltrl" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityAgricultural1Choice"/>
 *         <element name="Nrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityEnergy1Choice"/>
 *         <element name="Envttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityEnvironmental1Choice"/>
 *         <element name="Frtlzr" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityFertilizer1Choice"/>
 *         <element name="Frght" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityFreight1Choice"/>
 *         <element name="IndstrlPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityIndustrialProduct1Choice"/>
 *         <element name="Metl" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityMetal1Choice"/>
 *         <element name="OthrC10" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityOtherC102Choice"/>
 *         <element name="Ppr" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityPaper1Choice"/>
 *         <element name="Plprpln" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityPolypropylene1Choice"/>
 *         <element name="Infltn" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityInflation1"/>
 *         <element name="MultiCmmdtyExtc" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityMultiCommodityExotic1"/>
 *         <element name="OffclEcnmcSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityOfficialEconomicStatistics1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.102.001.01}AssetClassCommodityOther1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity3Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frtlzr",
    "frght",
    "indstrlPdct",
    "metl",
    "othrC10",
    "ppr",
    "plprpln",
    "infltn",
    "multiCmmdtyExtc",
    "offclEcnmcSttstcs",
    "othr"
})
public class AssetClassCommodity3Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural1Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy1Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental1Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer1Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight1Choice frght;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct1Choice indstrlPdct;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal1Choice metl;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityOtherC102Choice othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper1Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene1Choice plprpln;
    @XmlElement(name = "Infltn")
    protected AssetClassCommodityInflation1 infltn;
    @XmlElement(name = "MultiCmmdtyExtc")
    protected AssetClassCommodityMultiCommodityExotic1 multiCmmdtyExtc;
    @XmlElement(name = "OffclEcnmcSttstcs")
    protected AssetClassCommodityOfficialEconomicStatistics1 offclEcnmcSttstcs;
    @XmlElement(name = "Othr")
    protected AssetClassCommodityOther1 othr;

    /**
     * Gets the value of the agrcltrl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public AssetClassCommodityAgricultural1Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural1Choice }
     *     
     */
    public void setAgrcltrl(AssetClassCommodityAgricultural1Choice value) {
        this.agrcltrl = value;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public AssetClassCommodityEnergy1Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy1Choice }
     *     
     */
    public void setNrgy(AssetClassCommodityEnergy1Choice value) {
        this.nrgy = value;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public AssetClassCommodityEnvironmental1Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental1Choice }
     *     
     */
    public void setEnvttl(AssetClassCommodityEnvironmental1Choice value) {
        this.envttl = value;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public AssetClassCommodityFertilizer1Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer1Choice }
     *     
     */
    public void setFrtlzr(AssetClassCommodityFertilizer1Choice value) {
        this.frtlzr = value;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public AssetClassCommodityFreight1Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight1Choice }
     *     
     */
    public void setFrght(AssetClassCommodityFreight1Choice value) {
        this.frght = value;
    }

    /**
     * Gets the value of the indstrlPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public AssetClassCommodityIndustrialProduct1Choice getIndstrlPdct() {
        return indstrlPdct;
    }

    /**
     * Sets the value of the indstrlPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndustrialProduct1Choice }
     *     
     */
    public void setIndstrlPdct(AssetClassCommodityIndustrialProduct1Choice value) {
        this.indstrlPdct = value;
    }

    /**
     * Gets the value of the metl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public AssetClassCommodityMetal1Choice getMetl() {
        return metl;
    }

    /**
     * Sets the value of the metl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMetal1Choice }
     *     
     */
    public void setMetl(AssetClassCommodityMetal1Choice value) {
        this.metl = value;
    }

    /**
     * Gets the value of the othrC10 property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public AssetClassCommodityOtherC102Choice getOthrC10() {
        return othrC10;
    }

    /**
     * Sets the value of the othrC10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOtherC102Choice }
     *     
     */
    public void setOthrC10(AssetClassCommodityOtherC102Choice value) {
        this.othrC10 = value;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public AssetClassCommodityPaper1Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper1Choice }
     *     
     */
    public void setPpr(AssetClassCommodityPaper1Choice value) {
        this.ppr = value;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public AssetClassCommodityPolypropylene1Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene1Choice }
     *     
     */
    public void setPlprpln(AssetClassCommodityPolypropylene1Choice value) {
        this.plprpln = value;
    }

    /**
     * Gets the value of the infltn property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public AssetClassCommodityInflation1 getInfltn() {
        return infltn;
    }

    /**
     * Sets the value of the infltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityInflation1 }
     *     
     */
    public void setInfltn(AssetClassCommodityInflation1 value) {
        this.infltn = value;
    }

    /**
     * Gets the value of the multiCmmdtyExtc property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public AssetClassCommodityMultiCommodityExotic1 getMultiCmmdtyExtc() {
        return multiCmmdtyExtc;
    }

    /**
     * Sets the value of the multiCmmdtyExtc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMultiCommodityExotic1 }
     *     
     */
    public void setMultiCmmdtyExtc(AssetClassCommodityMultiCommodityExotic1 value) {
        this.multiCmmdtyExtc = value;
    }

    /**
     * Gets the value of the offclEcnmcSttstcs property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public AssetClassCommodityOfficialEconomicStatistics1 getOffclEcnmcSttstcs() {
        return offclEcnmcSttstcs;
    }

    /**
     * Sets the value of the offclEcnmcSttstcs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOfficialEconomicStatistics1 }
     *     
     */
    public void setOffclEcnmcSttstcs(AssetClassCommodityOfficialEconomicStatistics1 value) {
        this.offclEcnmcSttstcs = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public AssetClassCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityOther1 }
     *     
     */
    public void setOthr(AssetClassCommodityOther1 value) {
        this.othr = value;
    }

}
