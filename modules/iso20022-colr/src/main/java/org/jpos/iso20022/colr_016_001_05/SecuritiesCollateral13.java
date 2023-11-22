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

package org.jpos.iso20022.colr_016_001_05;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesCollateral13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesCollateral13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AsstNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SecurityIdentification19"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CollOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}CollateralOwnership3" minOccurs="0"/>
 *         <element name="LtdCvrgInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}YesNoIndicator" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}FinancialInstrumentQuantity33Choice"/>
 *         <element name="BlckdQty" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}Price7" minOccurs="0"/>
 *         <element name="MktVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Hrcut" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}PercentageRate" minOccurs="0"/>
 *         <element name="CollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ISODate" minOccurs="0"/>
 *         <element name="SfkpgAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SecuritiesAccount19" minOccurs="0"/>
 *         <element name="BlckChainAdrOrWllt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}BlockChainAddressWallet3" minOccurs="0"/>
 *         <element name="SfkpgPlc" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SafekeepingPlaceFormat29Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesCollateral13", propOrder = {
    "asstNb",
    "sctyId",
    "mtrtyDt",
    "collOwnrsh",
    "ltdCvrgInd",
    "qty",
    "blckdQty",
    "pric",
    "mktVal",
    "hrcut",
    "collVal",
    "valDt",
    "sfkpgAcct",
    "blckChainAdrOrWllt",
    "sfkpgPlc"
})
public class SecuritiesCollateral13 {

    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification19 sctyId;
    @XmlElement(name = "MtrtyDt")
    protected DateAndDateTime2Choice mtrtyDt;
    @XmlElement(name = "CollOwnrsh")
    protected CollateralOwnership3 collOwnrsh;
    @XmlElement(name = "LtdCvrgInd")
    protected Boolean ltdCvrgInd;
    @XmlElement(name = "Qty", required = true)
    protected FinancialInstrumentQuantity33Choice qty;
    @XmlElement(name = "BlckdQty")
    protected FinancialInstrumentQuantity33Choice blckdQty;
    @XmlElement(name = "Pric")
    protected Price7 pric;
    @XmlElement(name = "MktVal")
    protected ActiveCurrencyAndAmount mktVal;
    @XmlElement(name = "Hrcut")
    protected BigDecimal hrcut;
    @XmlElement(name = "CollVal")
    protected ActiveCurrencyAndAmount collVal;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "BlckChainAdrOrWllt")
    protected BlockChainAddressWallet3 blckChainAdrOrWllt;
    @XmlElement(name = "SfkpgPlc", required = true)
    protected SafekeepingPlaceFormat29Choice sfkpgPlc;

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstNb(String value) {
        this.asstNb = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setSctyId(SecurityIdentification19 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setMtrtyDt(DateAndDateTime2Choice value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the collOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralOwnership3 }
     *     
     */
    public CollateralOwnership3 getCollOwnrsh() {
        return collOwnrsh;
    }

    /**
     * Sets the value of the collOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralOwnership3 }
     *     
     */
    public void setCollOwnrsh(CollateralOwnership3 value) {
        this.collOwnrsh = value;
    }

    /**
     * Gets the value of the ltdCvrgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLtdCvrgInd() {
        return ltdCvrgInd;
    }

    /**
     * Sets the value of the ltdCvrgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLtdCvrgInd(Boolean value) {
        this.ltdCvrgInd = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity33Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the blckdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getBlckdQty() {
        return blckdQty;
    }

    /**
     * Sets the value of the blckdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setBlckdQty(FinancialInstrumentQuantity33Choice value) {
        this.blckdQty = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setPric(Price7 value) {
        this.pric = value;
    }

    /**
     * Gets the value of the mktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getMktVal() {
        return mktVal;
    }

    /**
     * Sets the value of the mktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setMktVal(ActiveCurrencyAndAmount value) {
        this.mktVal = value;
    }

    /**
     * Gets the value of the hrcut property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHrcut() {
        return hrcut;
    }

    /**
     * Sets the value of the hrcut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHrcut(BigDecimal value) {
        this.hrcut = value;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public void setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
    }

    /**
     * Gets the value of the blckChainAdrOrWllt property.
     * 
     * @return
     *     possible object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public BlockChainAddressWallet3 getBlckChainAdrOrWllt() {
        return blckChainAdrOrWllt;
    }

    /**
     * Sets the value of the blckChainAdrOrWllt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlockChainAddressWallet3 }
     *     
     */
    public void setBlckChainAdrOrWllt(BlockChainAddressWallet3 value) {
        this.blckChainAdrOrWllt = value;
    }

    /**
     * Gets the value of the sfkpgPlc property.
     * 
     * @return
     *     possible object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public SafekeepingPlaceFormat29Choice getSfkpgPlc() {
        return sfkpgPlc;
    }

    /**
     * Sets the value of the sfkpgPlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SafekeepingPlaceFormat29Choice }
     *     
     */
    public void setSfkpgPlc(SafekeepingPlaceFormat29Choice value) {
        this.sfkpgPlc = value;
    }

}
