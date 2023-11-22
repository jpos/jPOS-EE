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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPrice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPrice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExrcPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat4Choice" minOccurs="0"/>
 *         <element name="IssePric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *         <element name="CshInLieuOfShrPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *         <element name="TaxblIncmPerDvddShr" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}AmountPrice1" minOccurs="0"/>
 *         <element name="GncCshPricRcvdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat1Choice" minOccurs="0"/>
 *         <element name="GncCshPricPdPerPdct" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *         <element name="OverSbcptDpstPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PriceFormat2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPrice1", propOrder = {
    "exrcPric",
    "issePric",
    "cshInLieuOfShrPric",
    "taxblIncmPerDvddShr",
    "gncCshPricRcvdPerPdct",
    "gncCshPricPdPerPdct",
    "overSbcptDpstPric"
})
public class CorporateActionPrice1 {

    @XmlElement(name = "ExrcPric")
    protected PriceFormat4Choice exrcPric;
    @XmlElement(name = "IssePric")
    protected PriceFormat2Choice issePric;
    @XmlElement(name = "CshInLieuOfShrPric")
    protected PriceFormat2Choice cshInLieuOfShrPric;
    @XmlElement(name = "TaxblIncmPerDvddShr")
    protected AmountPrice1 taxblIncmPerDvddShr;
    @XmlElement(name = "GncCshPricRcvdPerPdct")
    protected PriceFormat1Choice gncCshPricRcvdPerPdct;
    @XmlElement(name = "GncCshPricPdPerPdct")
    protected PriceFormat2Choice gncCshPricPdPerPdct;
    @XmlElement(name = "OverSbcptDpstPric")
    protected PriceFormat2Choice overSbcptDpstPric;

    /**
     * Gets the value of the exrcPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat4Choice }
     *     
     */
    public PriceFormat4Choice getExrcPric() {
        return exrcPric;
    }

    /**
     * Sets the value of the exrcPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat4Choice }
     *     
     */
    public void setExrcPric(PriceFormat4Choice value) {
        this.exrcPric = value;
    }

    /**
     * Gets the value of the issePric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getIssePric() {
        return issePric;
    }

    /**
     * Sets the value of the issePric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setIssePric(PriceFormat2Choice value) {
        this.issePric = value;
    }

    /**
     * Gets the value of the cshInLieuOfShrPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getCshInLieuOfShrPric() {
        return cshInLieuOfShrPric;
    }

    /**
     * Sets the value of the cshInLieuOfShrPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setCshInLieuOfShrPric(PriceFormat2Choice value) {
        this.cshInLieuOfShrPric = value;
    }

    /**
     * Gets the value of the taxblIncmPerDvddShr property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPrice1 }
     *     
     */
    public AmountPrice1 getTaxblIncmPerDvddShr() {
        return taxblIncmPerDvddShr;
    }

    /**
     * Sets the value of the taxblIncmPerDvddShr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPrice1 }
     *     
     */
    public void setTaxblIncmPerDvddShr(AmountPrice1 value) {
        this.taxblIncmPerDvddShr = value;
    }

    /**
     * Gets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat1Choice }
     *     
     */
    public PriceFormat1Choice getGncCshPricRcvdPerPdct() {
        return gncCshPricRcvdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricRcvdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat1Choice }
     *     
     */
    public void setGncCshPricRcvdPerPdct(PriceFormat1Choice value) {
        this.gncCshPricRcvdPerPdct = value;
    }

    /**
     * Gets the value of the gncCshPricPdPerPdct property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getGncCshPricPdPerPdct() {
        return gncCshPricPdPerPdct;
    }

    /**
     * Sets the value of the gncCshPricPdPerPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setGncCshPricPdPerPdct(PriceFormat2Choice value) {
        this.gncCshPricPdPerPdct = value;
    }

    /**
     * Gets the value of the overSbcptDpstPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public PriceFormat2Choice getOverSbcptDpstPric() {
        return overSbcptDpstPric;
    }

    /**
     * Sets the value of the overSbcptDpstPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat2Choice }
     *     
     */
    public void setOverSbcptDpstPric(PriceFormat2Choice value) {
        this.overSbcptDpstPric = value;
    }

}
