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

package org.jpos.iso20022.colr_004_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarginCall1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginCall1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpsdAmtPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsdAmtPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrCnvntn" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}ExposureConventionType1Code" minOccurs="0"/>
 *         <element name="IndpdntAmtPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}AggregatedIndependentAmount1" minOccurs="0"/>
 *         <element name="IndpdntAmtPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}AggregatedIndependentAmount1" minOccurs="0"/>
 *         <element name="MrgnTerms" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}MarginTerms1Choice" minOccurs="0"/>
 *         <element name="CollBal" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}CollateralBalance1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginCall1", propOrder = {
    "xpsdAmtPtyA",
    "xpsdAmtPtyB",
    "xpsrCnvntn",
    "indpdntAmtPtyA",
    "indpdntAmtPtyB",
    "mrgnTerms",
    "collBal"
})
public class MarginCall1 {

    @XmlElement(name = "XpsdAmtPtyA")
    protected ActiveCurrencyAndAmount xpsdAmtPtyA;
    @XmlElement(name = "XpsdAmtPtyB")
    protected ActiveCurrencyAndAmount xpsdAmtPtyB;
    @XmlElement(name = "XpsrCnvntn")
    @XmlSchemaType(name = "string")
    protected ExposureConventionType1Code xpsrCnvntn;
    @XmlElement(name = "IndpdntAmtPtyA")
    protected AggregatedIndependentAmount1 indpdntAmtPtyA;
    @XmlElement(name = "IndpdntAmtPtyB")
    protected AggregatedIndependentAmount1 indpdntAmtPtyB;
    @XmlElement(name = "MrgnTerms")
    protected MarginTerms1Choice mrgnTerms;
    @XmlElement(name = "CollBal")
    protected CollateralBalance1Choice collBal;

    /**
     * Gets the value of the xpsdAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyA() {
        return xpsdAmtPtyA;
    }

    /**
     * Sets the value of the xpsdAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setXpsdAmtPtyA(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyA = value;
    }

    /**
     * Gets the value of the xpsdAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyB() {
        return xpsdAmtPtyB;
    }

    /**
     * Sets the value of the xpsdAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setXpsdAmtPtyB(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyB = value;
    }

    /**
     * Gets the value of the xpsrCnvntn property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureConventionType1Code }
     *     
     */
    public ExposureConventionType1Code getXpsrCnvntn() {
        return xpsrCnvntn;
    }

    /**
     * Sets the value of the xpsrCnvntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureConventionType1Code }
     *     
     */
    public void setXpsrCnvntn(ExposureConventionType1Code value) {
        this.xpsrCnvntn = value;
    }

    /**
     * Gets the value of the indpdntAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 getIndpdntAmtPtyA() {
        return indpdntAmtPtyA;
    }

    /**
     * Sets the value of the indpdntAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public void setIndpdntAmtPtyA(AggregatedIndependentAmount1 value) {
        this.indpdntAmtPtyA = value;
    }

    /**
     * Gets the value of the indpdntAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public AggregatedIndependentAmount1 getIndpdntAmtPtyB() {
        return indpdntAmtPtyB;
    }

    /**
     * Sets the value of the indpdntAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatedIndependentAmount1 }
     *     
     */
    public void setIndpdntAmtPtyB(AggregatedIndependentAmount1 value) {
        this.indpdntAmtPtyB = value;
    }

    /**
     * Gets the value of the mrgnTerms property.
     * 
     * @return
     *     possible object is
     *     {@link MarginTerms1Choice }
     *     
     */
    public MarginTerms1Choice getMrgnTerms() {
        return mrgnTerms;
    }

    /**
     * Sets the value of the mrgnTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginTerms1Choice }
     *     
     */
    public void setMrgnTerms(MarginTerms1Choice value) {
        this.mrgnTerms = value;
    }

    /**
     * Gets the value of the collBal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralBalance1Choice }
     *     
     */
    public CollateralBalance1Choice getCollBal() {
        return collBal;
    }

    /**
     * Sets the value of the collBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralBalance1Choice }
     *     
     */
    public void setCollBal(CollateralBalance1Choice value) {
        this.collBal = value;
    }

}
