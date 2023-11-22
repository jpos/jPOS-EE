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
 * <p>Java class for AssetClassCommodityPaper3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AssetClassCommodityPaper3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CntnrBrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}PaperCommodityContainerBoard1"/>
 *         <element name="Nwsprnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}PaperCommodityNewsprint1"/>
 *         <element name="Pulp" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}PaperCommodityPulp1"/>
 *         <element name="RcvrdPpr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}PaperCommodityRecoveredPaper1"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}PaperCommodityRecoveredPaper2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPaper3Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr",
    "othr"
})
public class AssetClassCommodityPaper3Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard1 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint1 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp1 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityRecoveredPaper1 rcvrdPpr;
    @XmlElement(name = "Othr")
    protected PaperCommodityRecoveredPaper2 othr;

    /**
     * Gets the value of the cntnrBrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public PaperCommodityContainerBoard1 getCntnrBrd() {
        return cntnrBrd;
    }

    /**
     * Sets the value of the cntnrBrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public void setCntnrBrd(PaperCommodityContainerBoard1 value) {
        this.cntnrBrd = value;
    }

    /**
     * Gets the value of the nwsprnt property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public PaperCommodityNewsprint1 getNwsprnt() {
        return nwsprnt;
    }

    /**
     * Sets the value of the nwsprnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public void setNwsprnt(PaperCommodityNewsprint1 value) {
        this.nwsprnt = value;
    }

    /**
     * Gets the value of the pulp property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public PaperCommodityPulp1 getPulp() {
        return pulp;
    }

    /**
     * Sets the value of the pulp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public void setPulp(PaperCommodityPulp1 value) {
        this.pulp = value;
    }

    /**
     * Gets the value of the rcvrdPpr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public PaperCommodityRecoveredPaper1 getRcvrdPpr() {
        return rcvrdPpr;
    }

    /**
     * Sets the value of the rcvrdPpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public void setRcvrdPpr(PaperCommodityRecoveredPaper1 value) {
        this.rcvrdPpr = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityRecoveredPaper2 }
     *     
     */
    public PaperCommodityRecoveredPaper2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityRecoveredPaper2 }
     *     
     */
    public void setOthr(PaperCommodityRecoveredPaper2 value) {
        this.othr = value;
    }

}
