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

package org.jpos.iso20022.sese_042_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyInAdviceDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyInAdviceDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}References23"/>
 *         <element name="BuyInStat" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}BuyInState1Code"/>
 *         <element name="BuyInDfrrl" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}BuyInDeferral1Code"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}SecurityIdentification19" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="BuyInPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}RateAndAmountFormat39Choice" minOccurs="0"/>
 *         <element name="CshCompstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}AmountAndDirection102" minOccurs="0"/>
 *         <element name="BuyInSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.042.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInAdviceDetails1", propOrder = {
    "ref",
    "buyInStat",
    "buyInDfrrl",
    "finInstrmId",
    "qty",
    "buyInPric",
    "cshCompstnAmt",
    "buyInSttlmDt"
})
public class BuyInAdviceDetails1 {

    @XmlElement(name = "Ref", required = true)
    protected References23 ref;
    @XmlElement(name = "BuyInStat", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInState1Code buyInStat;
    @XmlElement(name = "BuyInDfrrl", required = true)
    @XmlSchemaType(name = "string")
    protected BuyInDeferral1Code buyInDfrrl;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "BuyInPric")
    protected RateAndAmountFormat39Choice buyInPric;
    @XmlElement(name = "CshCompstnAmt")
    protected AmountAndDirection102 cshCompstnAmt;
    @XmlElement(name = "BuyInSttlmDt")
    protected DateAndDateTime2Choice buyInSttlmDt;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References23 }
     *     
     */
    public References23 getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References23 }
     *     
     */
    public void setRef(References23 value) {
        this.ref = value;
    }

    /**
     * Gets the value of the buyInStat property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInState1Code }
     *     
     */
    public BuyInState1Code getBuyInStat() {
        return buyInStat;
    }

    /**
     * Sets the value of the buyInStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInState1Code }
     *     
     */
    public void setBuyInStat(BuyInState1Code value) {
        this.buyInStat = value;
    }

    /**
     * Gets the value of the buyInDfrrl property.
     * 
     * @return
     *     possible object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public BuyInDeferral1Code getBuyInDfrrl() {
        return buyInDfrrl;
    }

    /**
     * Sets the value of the buyInDfrrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyInDeferral1Code }
     *     
     */
    public void setBuyInDfrrl(BuyInDeferral1Code value) {
        this.buyInDfrrl = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the buyInPric property.
     * 
     * @return
     *     possible object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public RateAndAmountFormat39Choice getBuyInPric() {
        return buyInPric;
    }

    /**
     * Sets the value of the buyInPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateAndAmountFormat39Choice }
     *     
     */
    public void setBuyInPric(RateAndAmountFormat39Choice value) {
        this.buyInPric = value;
    }

    /**
     * Gets the value of the cshCompstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getCshCompstnAmt() {
        return cshCompstnAmt;
    }

    /**
     * Sets the value of the cshCompstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setCshCompstnAmt(AmountAndDirection102 value) {
        this.cshCompstnAmt = value;
    }

    /**
     * Gets the value of the buyInSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getBuyInSttlmDt() {
        return buyInSttlmDt;
    }

    /**
     * Sets the value of the buyInSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setBuyInSttlmDt(DateAndDateTime2Choice value) {
        this.buyInSttlmDt = value;
    }

}
