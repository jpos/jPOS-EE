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

package org.jpos.iso20022.semt_003_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityBreakdown58 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityBreakdown58">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LotNb" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}GenericIdentification37" minOccurs="0"/>
 *         <element name="LotQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}Balance16" minOccurs="0"/>
 *         <element name="LotDtTm" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="LotPric" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}Price7" minOccurs="0"/>
 *         <element name="TpOfPric" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}TypeOfPrice29Choice" minOccurs="0"/>
 *         <element name="AcctBaseCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}BalanceAmounts2" minOccurs="0"/>
 *         <element name="InstrmCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}BalanceAmounts2" minOccurs="0"/>
 *         <element name="AltrnRptgCcyAmts" type="{urn:iso:std:iso:20022:tech:xsd:semt.003.001.11}BalanceAmounts2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityBreakdown58", propOrder = {
    "lotNb",
    "lotQty",
    "lotDtTm",
    "lotPric",
    "tpOfPric",
    "acctBaseCcyAmts",
    "instrmCcyAmts",
    "altrnRptgCcyAmts"
})
public class QuantityBreakdown58 {

    @XmlElement(name = "LotNb")
    protected GenericIdentification37 lotNb;
    @XmlElement(name = "LotQty")
    protected Balance16 lotQty;
    @XmlElement(name = "LotDtTm")
    protected DateAndDateTime2Choice lotDtTm;
    @XmlElement(name = "LotPric")
    protected Price7 lotPric;
    @XmlElement(name = "TpOfPric")
    protected TypeOfPrice29Choice tpOfPric;
    @XmlElement(name = "AcctBaseCcyAmts")
    protected BalanceAmounts2 acctBaseCcyAmts;
    @XmlElement(name = "InstrmCcyAmts")
    protected BalanceAmounts2 instrmCcyAmts;
    @XmlElement(name = "AltrnRptgCcyAmts")
    protected BalanceAmounts2 altrnRptgCcyAmts;

    /**
     * Gets the value of the lotNb property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getLotNb() {
        return lotNb;
    }

    /**
     * Sets the value of the lotNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setLotNb(GenericIdentification37 value) {
        this.lotNb = value;
    }

    /**
     * Gets the value of the lotQty property.
     * 
     * @return
     *     possible object is
     *     {@link Balance16 }
     *     
     */
    public Balance16 getLotQty() {
        return lotQty;
    }

    /**
     * Sets the value of the lotQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Balance16 }
     *     
     */
    public void setLotQty(Balance16 value) {
        this.lotQty = value;
    }

    /**
     * Gets the value of the lotDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getLotDtTm() {
        return lotDtTm;
    }

    /**
     * Sets the value of the lotDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setLotDtTm(DateAndDateTime2Choice value) {
        this.lotDtTm = value;
    }

    /**
     * Gets the value of the lotPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price7 }
     *     
     */
    public Price7 getLotPric() {
        return lotPric;
    }

    /**
     * Sets the value of the lotPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price7 }
     *     
     */
    public void setLotPric(Price7 value) {
        this.lotPric = value;
    }

    /**
     * Gets the value of the tpOfPric property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public TypeOfPrice29Choice getTpOfPric() {
        return tpOfPric;
    }

    /**
     * Sets the value of the tpOfPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfPrice29Choice }
     *     
     */
    public void setTpOfPric(TypeOfPrice29Choice value) {
        this.tpOfPric = value;
    }

    /**
     * Gets the value of the acctBaseCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getAcctBaseCcyAmts() {
        return acctBaseCcyAmts;
    }

    /**
     * Sets the value of the acctBaseCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public void setAcctBaseCcyAmts(BalanceAmounts2 value) {
        this.acctBaseCcyAmts = value;
    }

    /**
     * Gets the value of the instrmCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getInstrmCcyAmts() {
        return instrmCcyAmts;
    }

    /**
     * Sets the value of the instrmCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public void setInstrmCcyAmts(BalanceAmounts2 value) {
        this.instrmCcyAmts = value;
    }

    /**
     * Gets the value of the altrnRptgCcyAmts property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public BalanceAmounts2 getAltrnRptgCcyAmts() {
        return altrnRptgCcyAmts;
    }

    /**
     * Sets the value of the altrnRptgCcyAmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAmounts2 }
     *     
     */
    public void setAltrnRptgCcyAmts(BalanceAmounts2 value) {
        this.altrnRptgCcyAmts = value;
    }

}
