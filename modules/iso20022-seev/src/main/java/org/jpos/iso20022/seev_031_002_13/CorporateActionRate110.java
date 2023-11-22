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

package org.jpos.iso20022.seev_031_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionRate110 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionRate110">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat46Choice" minOccurs="0"/>
 *         <element name="PctgSght" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat7Choice" minOccurs="0"/>
 *         <element name="RltdIndx" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="BidIntrvl" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat50Choice" minOccurs="0"/>
 *         <element name="PrvsFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat12Choice" minOccurs="0"/>
 *         <element name="NxtFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat12Choice" minOccurs="0"/>
 *         <element name="RinvstmtDscntRateToMkt" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateFormat3Choice" minOccurs="0"/>
 *         <element name="IntrstShrtfll" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="RealsdLoss" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="DclrdRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat43Choice" minOccurs="0"/>
 *         <element name="IndxFctr" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}RateAndAmountFormat37Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionRate110", propOrder = {
    "intrstRate",
    "pctgSght",
    "rltdIndx",
    "sprd",
    "bidIntrvl",
    "prvsFctr",
    "nxtFctr",
    "rinvstmtDscntRateToMkt",
    "intrstShrtfll",
    "realsdLoss",
    "dclrdRate",
    "indxFctr"
})
public class CorporateActionRate110 {

    @XmlElement(name = "IntrstRate")
    protected RateAndAmountFormat46Choice intrstRate;
    @XmlElement(name = "PctgSght")
    protected RateFormat7Choice pctgSght;
    @XmlElement(name = "RltdIndx")
    protected RateFormat3Choice rltdIndx;
    @XmlElement(name = "Sprd")
    protected RateFormat3Choice sprd;
    @XmlElement(name = "BidIntrvl")
    protected RateAndAmountFormat50Choice bidIntrvl;
    @XmlElement(name = "PrvsFctr")
    protected RateFormat12Choice prvsFctr;
    @XmlElement(name = "NxtFctr")
    protected RateFormat12Choice nxtFctr;
    @XmlElement(name = "RinvstmtDscntRateToMkt")
    protected RateFormat3Choice rinvstmtDscntRateToMkt;
    @XmlElement(name = "IntrstShrtfll")
    protected RateAndAmountFormat43Choice intrstShrtfll;
    @XmlElement(name = "RealsdLoss")
    protected RateAndAmountFormat43Choice realsdLoss;
    @XmlElement(name = "DclrdRate")
    protected RateAndAmountFormat43Choice dclrdRate;
    @XmlElement(name = "IndxFctr")
    protected RateAndAmountFormat37Choice indxFctr;

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public RateAndAmountFormat46Choice getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat46Choice }
     *     
     */
    public void setIntrstRate(RateAndAmountFormat46Choice value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the pctgSght property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat7Choice }
     *     
     */
    public RateFormat7Choice getPctgSght() {
        return pctgSght;
    }

    /**
     * Sets the value of the pctgSght property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat7Choice }
     *     
     */
    public void setPctgSght(RateFormat7Choice value) {
        this.pctgSght = value;
    }

    /**
     * Gets the value of the rltdIndx property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getRltdIndx() {
        return rltdIndx;
    }

    /**
     * Sets the value of the rltdIndx property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setRltdIndx(RateFormat3Choice value) {
        this.rltdIndx = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setSprd(RateFormat3Choice value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the bidIntrvl property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat50Choice }
     *     
     */
    public RateAndAmountFormat50Choice getBidIntrvl() {
        return bidIntrvl;
    }

    /**
     * Sets the value of the bidIntrvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat50Choice }
     *     
     */
    public void setBidIntrvl(RateAndAmountFormat50Choice value) {
        this.bidIntrvl = value;
    }

    /**
     * Gets the value of the prvsFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getPrvsFctr() {
        return prvsFctr;
    }

    /**
     * Sets the value of the prvsFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public void setPrvsFctr(RateFormat12Choice value) {
        this.prvsFctr = value;
    }

    /**
     * Gets the value of the nxtFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat12Choice }
     *     
     */
    public RateFormat12Choice getNxtFctr() {
        return nxtFctr;
    }

    /**
     * Sets the value of the nxtFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat12Choice }
     *     
     */
    public void setNxtFctr(RateFormat12Choice value) {
        this.nxtFctr = value;
    }

    /**
     * Gets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @return
     *     possible object is
     *     {@link RateFormat3Choice }
     *     
     */
    public RateFormat3Choice getRinvstmtDscntRateToMkt() {
        return rinvstmtDscntRateToMkt;
    }

    /**
     * Sets the value of the rinvstmtDscntRateToMkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateFormat3Choice }
     *     
     */
    public void setRinvstmtDscntRateToMkt(RateFormat3Choice value) {
        this.rinvstmtDscntRateToMkt = value;
    }

    /**
     * Gets the value of the intrstShrtfll property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getIntrstShrtfll() {
        return intrstShrtfll;
    }

    /**
     * Sets the value of the intrstShrtfll property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setIntrstShrtfll(RateAndAmountFormat43Choice value) {
        this.intrstShrtfll = value;
    }

    /**
     * Gets the value of the realsdLoss property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getRealsdLoss() {
        return realsdLoss;
    }

    /**
     * Sets the value of the realsdLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setRealsdLoss(RateAndAmountFormat43Choice value) {
        this.realsdLoss = value;
    }

    /**
     * Gets the value of the dclrdRate property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public RateAndAmountFormat43Choice getDclrdRate() {
        return dclrdRate;
    }

    /**
     * Sets the value of the dclrdRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat43Choice }
     *     
     */
    public void setDclrdRate(RateAndAmountFormat43Choice value) {
        this.dclrdRate = value;
    }

    /**
     * Gets the value of the indxFctr property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public RateAndAmountFormat37Choice getIndxFctr() {
        return indxFctr;
    }

    /**
     * Sets the value of the indxFctr property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat37Choice }
     *     
     */
    public void setIndxFctr(RateAndAmountFormat37Choice value) {
        this.indxFctr = value;
    }

}
