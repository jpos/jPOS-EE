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

package org.jpos.iso20022.seev_009_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Intrst" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *         <element name="RltdIndx" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="PctgSght" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="RinvstmtDscntToMkt" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateFormat1Choice" minOccurs="0"/>
 *         <element name="BidIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}AmountAndRateFormat3Choice" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:seev.009.001.01}RateAndAmountFormat1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate1", propOrder = {
    "intrst",
    "rltdIndx",
    "pctgSght",
    "rinvstmtDscntToMkt",
    "sprd",
    "bidIntrvl",
    "chrgs"
})
public class CorporateActionRate1 {

    @XmlElement(name = "Intrst")
    protected RateAndAmountFormat1Choice intrst;
    @XmlElement(name = "RltdIndx")
    protected RateFormat1Choice rltdIndx;
    @XmlElement(name = "PctgSght")
    protected RateFormat1Choice pctgSght;
    @XmlElement(name = "RinvstmtDscntToMkt")
    protected RateFormat1Choice rinvstmtDscntToMkt;
    @XmlElement(name = "Sprd")
    protected RateFormat1Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected AmountAndRateFormat3Choice bidIntrvl;
    @XmlElement(name = "Chrgs")
    protected RateAndAmountFormat1Choice chrgs;

    /**
     * Gets the value of the intrst property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getIntrst() {
        return intrst;
    }

    /**
     * Sets the value of the intrst property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setIntrst(RateAndAmountFormat1Choice value) {
        this.intrst = value;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setRltdIndx(RateFormat1Choice value) {
        this.rltdIndx = value;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setPctgSght(RateFormat1Choice value) {
        this.pctgSght = value;
    }

    /**
     * Gets the value of the rinvstmtDscntToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getRinvstmtDscntToMkt() {
        return rinvstmtDscntToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setRinvstmtDscntToMkt(RateFormat1Choice value) {
        this.rinvstmtDscntToMkt = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat1Choice }
     *     
     */
    public RateFormat1Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat1Choice }
     *     
     */
    public void setSprd(RateFormat1Choice value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndRateFormat3Choice }
     *     
     */
    public AmountAndRateFormat3Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndRateFormat3Choice }
     *     
     */
    public void setBidIntrvl(AmountAndRateFormat3Choice value) {
        this.bidIntrvl = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public RateAndAmountFormat1Choice getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat1Choice }
     *     
     */
    public void setChrgs(RateAndAmountFormat1Choice value) {
        this.chrgs = value;
    }

}
