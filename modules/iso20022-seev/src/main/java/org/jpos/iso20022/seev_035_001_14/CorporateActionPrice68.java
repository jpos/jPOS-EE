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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice68 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice68">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PriceFormat45Choice" minOccurs="0"/>
 *         <element name="OverSbcptDpstPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PriceFormat45Choice" minOccurs="0"/>
 *         <element name="MaxCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PriceFormat61Choice" minOccurs="0"/>
 *         <element name="MinCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PriceFormat61Choice" minOccurs="0"/>
 *         <element name="MinMltplCshToInst" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}PriceFormat61Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice68", propOrder = {
    "cshInLieuOfShrPric",
    "overSbcptDpstPric",
    "maxCshToInst",
    "minCshToInst",
    "minMltplCshToInst"
})
public class CorporateActionPrice68 {

    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat45Choice cshInLieuOfShrPric;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat45Choice overSbcptDpstPric;
    @XmlElement(name = "MaxCshToInst")
    protected PriceFormat61Choice maxCshToInst;
    @XmlElement(name = "MinCshToInst")
    protected PriceFormat61Choice minCshToInst;
    @XmlElement(name = "MinMltplCshToInst")
    protected PriceFormat61Choice minMltplCshToInst;

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat45Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public PriceFormat45Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat45Choice }
     *     
     */
    public void setOverSbcptDpstPric(PriceFormat45Choice value) {
        this.overSbcptDpstPric = value;
    }

    /**
     * Gets the value of the maxCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMaxCshToInst() {
        return maxCshToInst;
    }

    /**
     * Sets the value of the maxCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMaxCshToInst(PriceFormat61Choice value) {
        this.maxCshToInst = value;
    }

    /**
     * Gets the value of the minCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinCshToInst() {
        return minCshToInst;
    }

    /**
     * Sets the value of the minCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMinCshToInst(PriceFormat61Choice value) {
        this.minCshToInst = value;
    }

    /**
     * Gets the value of the minMltplCshToInst property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public PriceFormat61Choice getMinMltplCshToInst() {
        return minMltplCshToInst;
    }

    /**
     * Sets the value of the minMltplCshToInst property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat61Choice }
     *     
     */
    public void setMinMltplCshToInst(PriceFormat61Choice value) {
        this.minMltplCshToInst = value;
    }

}
