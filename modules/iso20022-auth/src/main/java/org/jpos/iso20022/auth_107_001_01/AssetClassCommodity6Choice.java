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
 * <p>Java class for AssetClassCommodity6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodity6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Agrcltrl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityAgricultural6Choice"/>
 *         <element name="Nrgy" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityEnergy3Choice"/>
 *         <element name="Envttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityEnvironmental3Choice"/>
 *         <element name="Frtlzr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityFertilizer4Choice"/>
 *         <element name="Frght" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityFreight4Choice"/>
 *         <element name="Indx" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityIndex1"/>
 *         <element name="IndstrlPdct" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityIndustrialProduct2Choice"/>
 *         <element name="Infltn" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityInflation1"/>
 *         <element name="Metl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityMetal2Choice"/>
 *         <element name="MultiCmmdtyExtc" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityMultiCommodityExotic1"/>
 *         <element name="OffclEcnmcSttstcs" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityOfficialEconomicStatistics1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityOther1"/>
 *         <element name="OthrC10" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityC10Other1"/>
 *         <element name="Ppr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityPaper4Choice"/>
 *         <element name="Plprpln" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}AssetClassCommodityPolypropylene4Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodity6Choice", propOrder = {
    "agrcltrl",
    "nrgy",
    "envttl",
    "frtlzr",
    "frght",
    "indx",
    "indstrlPdct",
    "infltn",
    "metl",
    "multiCmmdtyExtc",
    "offclEcnmcSttstcs",
    "othr",
    "othrC10",
    "ppr",
    "plprpln"
})
public class AssetClassCommodity6Choice {

    @XmlElement(name = "Agrcltrl")
    protected AssetClassCommodityAgricultural6Choice agrcltrl;
    @XmlElement(name = "Nrgy")
    protected AssetClassCommodityEnergy3Choice nrgy;
    @XmlElement(name = "Envttl")
    protected AssetClassCommodityEnvironmental3Choice envttl;
    @XmlElement(name = "Frtlzr")
    protected AssetClassCommodityFertilizer4Choice frtlzr;
    @XmlElement(name = "Frght")
    protected AssetClassCommodityFreight4Choice frght;
    @XmlElement(name = "Indx")
    protected AssetClassCommodityIndex1 indx;
    @XmlElement(name = "IndstrlPdct")
    protected AssetClassCommodityIndustrialProduct2Choice indstrlPdct;
    @XmlElement(name = "Infltn")
    protected AssetClassCommodityInflation1 infltn;
    @XmlElement(name = "Metl")
    protected AssetClassCommodityMetal2Choice metl;
    @XmlElement(name = "MultiCmmdtyExtc")
    protected AssetClassCommodityMultiCommodityExotic1 multiCmmdtyExtc;
    @XmlElement(name = "OffclEcnmcSttstcs")
    protected AssetClassCommodityOfficialEconomicStatistics1 offclEcnmcSttstcs;
    @XmlElement(name = "Othr")
    protected AssetClassCommodityOther1 othr;
    @XmlElement(name = "OthrC10")
    protected AssetClassCommodityC10Other1 othrC10;
    @XmlElement(name = "Ppr")
    protected AssetClassCommodityPaper4Choice ppr;
    @XmlElement(name = "Plprpln")
    protected AssetClassCommodityPolypropylene4Choice plprpln;

    /**
     * Gets the value of the agrcltrl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityAgricultural6Choice }
     *     
     */
    public AssetClassCommodityAgricultural6Choice getAgrcltrl() {
        return agrcltrl;
    }

    /**
     * Sets the value of the agrcltrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityAgricultural6Choice }
     *     
     */
    public void setAgrcltrl(AssetClassCommodityAgricultural6Choice value) {
        this.agrcltrl = value;
    }

    /**
     * Gets the value of the nrgy property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnergy3Choice }
     *     
     */
    public AssetClassCommodityEnergy3Choice getNrgy() {
        return nrgy;
    }

    /**
     * Sets the value of the nrgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnergy3Choice }
     *     
     */
    public void setNrgy(AssetClassCommodityEnergy3Choice value) {
        this.nrgy = value;
    }

    /**
     * Gets the value of the envttl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityEnvironmental3Choice }
     *     
     */
    public AssetClassCommodityEnvironmental3Choice getEnvttl() {
        return envttl;
    }

    /**
     * Sets the value of the envttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityEnvironmental3Choice }
     *     
     */
    public void setEnvttl(AssetClassCommodityEnvironmental3Choice value) {
        this.envttl = value;
    }

    /**
     * Gets the value of the frtlzr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFertilizer4Choice }
     *     
     */
    public AssetClassCommodityFertilizer4Choice getFrtlzr() {
        return frtlzr;
    }

    /**
     * Sets the value of the frtlzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFertilizer4Choice }
     *     
     */
    public void setFrtlzr(AssetClassCommodityFertilizer4Choice value) {
        this.frtlzr = value;
    }

    /**
     * Gets the value of the frght property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityFreight4Choice }
     *     
     */
    public AssetClassCommodityFreight4Choice getFrght() {
        return frght;
    }

    /**
     * Sets the value of the frght property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityFreight4Choice }
     *     
     */
    public void setFrght(AssetClassCommodityFreight4Choice value) {
        this.frght = value;
    }

    /**
     * Gets the value of the indx property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndex1 }
     *     
     */
    public AssetClassCommodityIndex1 getIndx() {
        return indx;
    }

    /**
     * Sets the value of the indx property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndex1 }
     *     
     */
    public void setIndx(AssetClassCommodityIndex1 value) {
        this.indx = value;
    }

    /**
     * Gets the value of the indstrlPdct property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityIndustrialProduct2Choice }
     *     
     */
    public AssetClassCommodityIndustrialProduct2Choice getIndstrlPdct() {
        return indstrlPdct;
    }

    /**
     * Sets the value of the indstrlPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityIndustrialProduct2Choice }
     *     
     */
    public void setIndstrlPdct(AssetClassCommodityIndustrialProduct2Choice value) {
        this.indstrlPdct = value;
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
     * Gets the value of the metl property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityMetal2Choice }
     *     
     */
    public AssetClassCommodityMetal2Choice getMetl() {
        return metl;
    }

    /**
     * Sets the value of the metl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityMetal2Choice }
     *     
     */
    public void setMetl(AssetClassCommodityMetal2Choice value) {
        this.metl = value;
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

    /**
     * Gets the value of the othrC10 property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityC10Other1 }
     *     
     */
    public AssetClassCommodityC10Other1 getOthrC10() {
        return othrC10;
    }

    /**
     * Sets the value of the othrC10 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityC10Other1 }
     *     
     */
    public void setOthrC10(AssetClassCommodityC10Other1 value) {
        this.othrC10 = value;
    }

    /**
     * Gets the value of the ppr property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPaper4Choice }
     *     
     */
    public AssetClassCommodityPaper4Choice getPpr() {
        return ppr;
    }

    /**
     * Sets the value of the ppr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPaper4Choice }
     *     
     */
    public void setPpr(AssetClassCommodityPaper4Choice value) {
        this.ppr = value;
    }

    /**
     * Gets the value of the plprpln property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassCommodityPolypropylene4Choice }
     *     
     */
    public AssetClassCommodityPolypropylene4Choice getPlprpln() {
        return plprpln;
    }

    /**
     * Sets the value of the plprpln property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassCommodityPolypropylene4Choice }
     *     
     */
    public void setPlprpln(AssetClassCommodityPolypropylene4Choice value) {
        this.plprpln = value;
    }

}
