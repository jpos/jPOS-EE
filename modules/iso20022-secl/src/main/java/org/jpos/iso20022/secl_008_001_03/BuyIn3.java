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

package org.jpos.iso20022.secl_008_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyIn3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyIn3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BuyInNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}Max35Text"/>
 *         <element name="ReqForDelyInd" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}YesNoIndicator"/>
 *         <element name="NbOfDays" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}Number"/>
 *         <element name="InitlQty" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="CvrdQty" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}FinancialInstrumentQuantity1Choice"/>
 *         <element name="UcvrdQty" type="{urn:iso:std:iso:20022:tech:xsd:secl.008.001.03}FinancialInstrumentQuantity1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn3", propOrder = {
    "buyInNtfctnId",
    "reqForDelyInd",
    "nbOfDays",
    "initlQty",
    "cvrdQty",
    "ucvrdQty"
})
public class BuyIn3 {

    @XmlElement(name = "BuyInNtfctnId", required = true)
    protected String buyInNtfctnId;
    @XmlElement(name = "ReqForDelyInd")
    protected boolean reqForDelyInd;
    @XmlElement(name = "NbOfDays", required = true)
    protected BigDecimal nbOfDays;
    @XmlElement(name = "InitlQty", required = true)
    protected FinancialInstrumentQuantity1Choice initlQty;
    @XmlElement(name = "CvrdQty", required = true)
    protected FinancialInstrumentQuantity1Choice cvrdQty;
    @XmlElement(name = "UcvrdQty", required = true)
    protected FinancialInstrumentQuantity1Choice ucvrdQty;

    /**
     * Gets the value of the buyInNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInNtfctnId() {
        return buyInNtfctnId;
    }

    /**
     * Sets the value of the buyInNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyInNtfctnId(String value) {
        this.buyInNtfctnId = value;
    }

    /**
     * Gets the value of the reqForDelyInd property.
     * 
     */
    public boolean isReqForDelyInd() {
        return reqForDelyInd;
    }

    /**
     * Sets the value of the reqForDelyInd property.
     * 
     */
    public void setReqForDelyInd(boolean value) {
        this.reqForDelyInd = value;
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
     * Gets the value of the initlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getInitlQty() {
        return initlQty;
    }

    /**
     * Sets the value of the initlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setInitlQty(FinancialInstrumentQuantity1Choice value) {
        this.initlQty = value;
    }

    /**
     * Gets the value of the cvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getCvrdQty() {
        return cvrdQty;
    }

    /**
     * Sets the value of the cvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setCvrdQty(FinancialInstrumentQuantity1Choice value) {
        this.cvrdQty = value;
    }

    /**
     * Gets the value of the ucvrdQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getUcvrdQty() {
        return ucvrdQty;
    }

    /**
     * Sets the value of the ucvrdQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setUcvrdQty(FinancialInstrumentQuantity1Choice value) {
        this.ucvrdQty = value;
    }

}
