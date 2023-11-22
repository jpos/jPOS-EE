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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssetClassCommodity5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodity5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Agrcltrl" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityAgricultural5Choice"/>
 *         <element name="Nrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityEnergy2Choice"/>
 *         <element name="Envttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityEnvironmental2Choice"/>
 *         <element name="Frtlzr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityFertilizer3Choice"/>
 *         <element name="Frght" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityFreight3Choice"/>
 *         <element name="IndstrlPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityIndustrialProduct1Choice"/>
 *         <element name="Metl" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityMetal1Choice"/>
 *         <element name="OthrC10" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityOtherC102Choice"/>
 *         <element name="Ppr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityPaper3Choice"/>
 *         <element name="Plprpln" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityPolypropylene3Choice"/>
 *         <element name="Infltn" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityInflation1"/>
 *         <element name="MultiCmmdtyExtc" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityMultiCommodityExotic1"/>
 *         <element name="OffclEcnmcSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityOfficialEconomicStatistics1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}AssetClassCommodityOther1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity5Choice", propOrder = {
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
public class AssetClassCommodity5Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural5Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy2Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental2Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer3Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight3Choice frght;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct1Choice indstrlPdct;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal1Choice metl;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityOtherC102Choice othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper3Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene3Choice plprpln;
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
     *     {@link AssetClassCommodityAgricultural5Choice }
     *     
     */
    public AssetClassCommodityAgricultural5Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural5Choice }
     *     
     */
    public void setAgrcltrl(AssetClassCommodityAgricultural5Choice value) {
        this.agrcltrl = value;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy2Choice }
     *     
     */
    public AssetClassCommodityEnergy2Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy2Choice }
     *     
     */
    public void setNrgy(AssetClassCommodityEnergy2Choice value) {
        this.nrgy = value;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental2Choice }
     *     
     */
    public AssetClassCommodityEnvironmental2Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental2Choice }
     *     
     */
    public void setEnvttl(AssetClassCommodityEnvironmental2Choice value) {
        this.envttl = value;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer3Choice }
     *     
     */
    public AssetClassCommodityFertilizer3Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer3Choice }
     *     
     */
    public void setFrtlzr(AssetClassCommodityFertilizer3Choice value) {
        this.frtlzr = value;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight3Choice }
     *     
     */
    public AssetClassCommodityFreight3Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight3Choice }
     *     
     */
    public void setFrght(AssetClassCommodityFreight3Choice value) {
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
     *     {@link AssetClassCommodityPaper3Choice }
     *     
     */
    public AssetClassCommodityPaper3Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper3Choice }
     *     
     */
    public void setPpr(AssetClassCommodityPaper3Choice value) {
        this.ppr = value;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene3Choice }
     *     
     */
    public AssetClassCommodityPolypropylene3Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene3Choice }
     *     
     */
    public void setPlprpln(AssetClassCommodityPolypropylene3Choice value) {
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
