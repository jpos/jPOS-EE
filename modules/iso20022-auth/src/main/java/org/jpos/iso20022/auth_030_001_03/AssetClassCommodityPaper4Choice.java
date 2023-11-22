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
 * <p>Java class for AssetClassCommodityPaper4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityPaper4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CntnrBrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PaperCommodityContainerBoard2"/>
 *         <element name="Nwsprnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PaperCommodityNewsprint2"/>
 *         <element name="Pulp" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PaperCommodityPulp2"/>
 *         <element name="RcvrdPpr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PaperCommodityOther1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}PaperCommodityOther1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPaper4Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr",
    "othr"
})
public class AssetClassCommodityPaper4Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard2 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint2 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp2 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityOther1 rcvrdPpr;
    @XmlElement(name = "Othr")
    protected PaperCommodityOther1 othr;

    /**
     * Gets the value of the cntnrBrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityContainerBoard2 }
     *     
     */
    public PaperCommodityContainerBoard2 getCntnrBrd() {
        return cntnrBrd;
    }

    /**
     * Sets the value of the cntnrBrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityContainerBoard2 }
     *     
     */
    public void setCntnrBrd(PaperCommodityContainerBoard2 value) {
        this.cntnrBrd = value;
    }

    /**
     * Gets the value of the nwsprnt property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityNewsprint2 }
     *     
     */
    public PaperCommodityNewsprint2 getNwsprnt() {
        return nwsprnt;
    }

    /**
     * Sets the value of the nwsprnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityNewsprint2 }
     *     
     */
    public void setNwsprnt(PaperCommodityNewsprint2 value) {
        this.nwsprnt = value;
    }

    /**
     * Gets the value of the pulp property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityPulp2 }
     *     
     */
    public PaperCommodityPulp2 getPulp() {
        return pulp;
    }

    /**
     * Sets the value of the pulp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityPulp2 }
     *     
     */
    public void setPulp(PaperCommodityPulp2 value) {
        this.pulp = value;
    }

    /**
     * Gets the value of the rcvrdPpr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public PaperCommodityOther1 getRcvrdPpr() {
        return rcvrdPpr;
    }

    /**
     * Sets the value of the rcvrdPpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public void setRcvrdPpr(PaperCommodityOther1 value) {
        this.rcvrdPpr = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public PaperCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public void setOthr(PaperCommodityOther1 value) {
        this.othr = value;
    }

}
