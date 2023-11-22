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

package org.jpos.iso20022.colr_015_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestCalculation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestCalculation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}ISODate"/>
 *         <element name="CollAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}CollateralAccount3" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}BlockChainAddressWallet5" minOccurs="0"/>
 *         <element name="FctvPrncplAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}AmountAndDirection20"/>
 *         <element name="PrncplAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}AmountAndDirection20" minOccurs="0"/>
 *         <element name="MvmntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}AmountAndDirection20" minOccurs="0"/>
 *         <element name="NbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}Number" minOccurs="0"/>
 *         <element name="FctvRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}PercentageRate"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}PercentageRate" minOccurs="0"/>
 *         <element name="Sprd" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}PercentageRate" minOccurs="0"/>
 *         <element name="AcrdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}AmountAndDirection20"/>
 *         <element name="AggtdIntrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestCalculation5", propOrder = {
    "clctnDt",
    "collAcctId",
    "blckChainAdrOrWllt",
    "fctvPrncplAmt",
    "prncplAmt",
    "mvmntAmt",
    "nbOfDays",
    "fctvRate",
    "intrstRate",
    "sprd",
    "acrdIntrstAmt",
    "aggtdIntrstAmt"
})
public class InterestCalculation5 {

    @XmlElement(name = "ClctnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;
    @XmlElement(name = "CollAcctId")
    protected CollateralAccount3 collAcctId;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet5 blckChainAdrOrWllt;
    @XmlElement(name = "FctvPrncplAmt", required = true)
    protected AmountAndDirection20 fctvPrncplAmt;
    @XmlElement(name = "PrncplAmt")
    protected AmountAndDirection20 prncplAmt;
    @XmlElement(name = "MvmntAmt")
    protected AmountAndDirection20 mvmntAmt;
    @XmlElement(name = "NbOfDays")
    protected BigDecimal nbOfDays;
    @XmlElement(name = "FctvRate", required = true)
    protected BigDecimal fctvRate;
    @XmlElement(name = "IntrstRate")
    protected BigDecimal intrstRate;
    @XmlElement(name = "Sprd")
    protected BigDecimal sprd;
    @XmlElement(name = "AcrdIntrstAmt", required = true)
    protected AmountAndDirection20 acrdIntrstAmt;
    @XmlElement(name = "AggtdIntrstAmt")
    protected ActiveCurrencyAndAmount aggtdIntrstAmt;

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
    }

    /**
     * Gets the value of the collAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralAccount3 }
     *     
     */
    public CollateralAccount3 getCollAcctId() {
        return collAcctId;
    }

    /**
     * Sets the value of the collAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralAccount3 }
     *     
     */
    public void setCollAcctId(CollateralAccount3 value) {
        this.collAcctId = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public BlockChainAddressWallet5 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet5 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet5 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the fctvPrncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getFctvPrncplAmt() {
        return fctvPrncplAmt;
    }

    /**
     * Sets the value of the fctvPrncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setFctvPrncplAmt(AmountAndDirection20 value) {
        this.fctvPrncplAmt = value;
    }

    /**
     * Gets the value of the prncplAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getPrncplAmt() {
        return prncplAmt;
    }

    /**
     * Sets the value of the prncplAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setPrncplAmt(AmountAndDirection20 value) {
        this.prncplAmt = value;
    }

    /**
     * Gets the value of the mvmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getMvmntAmt() {
        return mvmntAmt;
    }

    /**
     * Sets the value of the mvmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setMvmntAmt(AmountAndDirection20 value) {
        this.mvmntAmt = value;
    }

    /**
     * Gets the value of the nbOfDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfDays() {
        return nbOfDays;
    }

    /**
     * Sets the value of the nbOfDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfDays(BigDecimal value) {
        this.nbOfDays = value;
    }

    /**
     * Gets the value of the fctvRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctvRate() {
        return fctvRate;
    }

    /**
     * Sets the value of the fctvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctvRate(BigDecimal value) {
        this.fctvRate = value;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrstRate() {
        return intrstRate;
    }

    /**
     * Sets the value of the intrstRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrstRate(BigDecimal value) {
        this.intrstRate = value;
    }

    /**
     * Gets the value of the sprd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSprd() {
        return sprd;
    }

    /**
     * Sets the value of the sprd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSprd(BigDecimal value) {
        this.sprd = value;
    }

    /**
     * Gets the value of the acrdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getAcrdIntrstAmt() {
        return acrdIntrstAmt;
    }

    /**
     * Sets the value of the acrdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setAcrdIntrstAmt(AmountAndDirection20 value) {
        this.acrdIntrstAmt = value;
    }

    /**
     * Gets the value of the aggtdIntrstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAggtdIntrstAmt() {
        return aggtdIntrstAmt;
    }

    /**
     * Sets the value of the aggtdIntrstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAggtdIntrstAmt(ActiveCurrencyAndAmount value) {
        this.aggtdIntrstAmt = value;
    }

}
