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

package org.jpos.iso20022.caaa_012_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionTotals12 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionTotals12">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="POIGrpId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="CardBrnd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="CardPdctPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TypeTransactionTotals2Code"/>
 *         <element name="TtlNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Number"/>
 *         <element name="CmltvAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}ImpliedCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionTotals12", propOrder = {
    "poiGrpId",
    "cardBrnd",
    "cardPdctPrfl",
    "ccy",
    "tp",
    "ttlNb",
    "cmltvAmt"
})
public class TransactionTotals12 {

    @XmlElement(name = "POIGrpId")
    protected String poiGrpId;
    @XmlElement(name = "CardBrnd")
    protected String cardBrnd;
    @XmlElement(name = "CardPdctPrfl")
    protected String cardPdctPrfl;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeTransactionTotals2Code tp;
    @XmlElement(name = "TtlNb", required = true)
    protected BigDecimal ttlNb;
    @XmlElement(name = "CmltvAmt", required = true)
    protected BigDecimal cmltvAmt;

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
     * Gets the value of the cardBrnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardBrnd() {
        return cardBrnd;
    }

    /**
     * Sets the value of the cardBrnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardBrnd(String value) {
        this.cardBrnd = value;
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
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public TypeTransactionTotals2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionTotals2Code }
     *     
     */
    public void setTp(TypeTransactionTotals2Code value) {
        this.tp = value;
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

}
