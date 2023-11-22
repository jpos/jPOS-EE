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

package org.jpos.iso20022.casp_010_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyTransactionTotals1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyTransactionTotals1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIGrpId" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="LltyUnit" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}AmountUnit1Code" minOccurs="0"/>
 *         <element name="CardPdctPrfl" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Max35Text" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}LoyaltyTypeTransactionTotals1Code"/>
 *         <element name="TtlNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}Number"/>
 *         <element name="CmltvAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ImpliedCurrencyAndAmount"/>
 *         <element name="DtldAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}DetailedAmount15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyTransactionTotals1", propOrder = {
    "poiGrpId",
    "lltyUnit",
    "cardPdctPrfl",
    "ccy",
    "txTp",
    "ttlNb",
    "cmltvAmt",
    "dtldAmt"
})
public class LoyaltyTransactionTotals1 {

    @XmlElement(name = "POIGrpId")
    protected String poiGrpId;
    @XmlElement(name = "LltyUnit")
    @XmlSchemaType(name = "string")
    protected AmountUnit1Code lltyUnit;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected LoyaltyTypeTransactionTotals1Code txTp;
    @XmlElement(name = "TtlNb", required = true)
    protected BigDecimal ttlNb;
    @XmlElement(name = "CmltvAmt", required = true)
    protected BigDecimal cmltvAmt;
    @XmlElement(name = "DtldAmt")
    protected DetailedAmount15 dtldAmt;

    /**
     * Gets the value of the poiGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOIGrpId() {
        return poiGrpId;
    }

    /**
     * Sets the value of the poiGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOIGrpId(String value) {
        this.poiGrpId = value;
    }

    /**
     * Gets the value of the lltyUnit property.
     * 
     * @return
     *     possible object is
     *     {@link AmountUnit1Code }
     *     
     */
    public AmountUnit1Code getLltyUnit() {
        return lltyUnit;
    }

    /**
     * Sets the value of the lltyUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountUnit1Code }
     *     
     */
    public void setLltyUnit(AmountUnit1Code value) {
        this.lltyUnit = value;
    }

    /**
     * Gets the value of the cardPdctPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardPdctPrfl() {
        return cardPdctPrfl;
    }

    /**
     * Sets the value of the cardPdctPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardPdctPrfl(String value) {
        this.cardPdctPrfl = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTypeTransactionTotals1Code }
     *     
     */
    public LoyaltyTypeTransactionTotals1Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTypeTransactionTotals1Code }
     *     
     */
    public void setTxTp(LoyaltyTypeTransactionTotals1Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the ttlNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNb() {
        return ttlNb;
    }

    /**
     * Sets the value of the ttlNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNb(BigDecimal value) {
        this.ttlNb = value;
    }

    /**
     * Gets the value of the cmltvAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCmltvAmt() {
        return cmltvAmt;
    }

    /**
     * Sets the value of the cmltvAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCmltvAmt(BigDecimal value) {
        this.cmltvAmt = value;
    }

    /**
     * Gets the value of the dtldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link DetailedAmount15 }
     *     
     */
    public DetailedAmount15 getDtldAmt() {
        return dtldAmt;
    }

    /**
     * Sets the value of the dtldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailedAmount15 }
     *     
     */
    public void setDtldAmt(DetailedAmount15 value) {
        this.dtldAmt = value;
    }

}
