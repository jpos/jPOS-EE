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

package org.jpos.iso20022.auth_068_001_01;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Position1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Position1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PdctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}Max256Text"/>
 *         <element name="RskRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}EndOfDayRequirement1" minOccurs="0"/>
 *         <element name="GrssNtnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}ActiveCurrencyAnd24Amount"/>
 *         <element name="NetNtnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}AmountAndDirection102"/>
 *         <element name="GrssDltaEqvtVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetDltaEqvtVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}AmountAndDirection102" minOccurs="0"/>
 *         <element name="GrssDltaEqvtQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}NonNegativeFraction5DecimalNumber" minOccurs="0"/>
 *         <element name="NetDltaEqvtQty" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}Fraction5DecimalNumber" minOccurs="0"/>
 *         <element name="GrssMktVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.068.001.01}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position1", propOrder = {
    "pdctId",
    "rskRqrmnt",
    "grssNtnl",
    "netNtnl",
    "grssDltaEqvtVal",
    "netDltaEqvtVal",
    "grssDltaEqvtQty",
    "netDltaEqvtQty",
    "grssMktVal"
})
public class Position1 {

    @XmlElement(name = "PdctId", required = true)
    protected String pdctId;
    @XmlElement(name = "RskRqrmnt")
    protected EndOfDayRequirement1 rskRqrmnt;
    @XmlElement(name = "GrssNtnl", required = true)
    protected ActiveCurrencyAnd24Amount grssNtnl;
    @XmlElement(name = "NetNtnl", required = true)
    protected AmountAndDirection102 netNtnl;
    @XmlElement(name = "GrssDltaEqvtVal")
    protected ActiveCurrencyAndAmount grssDltaEqvtVal;
    @XmlElement(name = "NetDltaEqvtVal")
    protected AmountAndDirection102 netDltaEqvtVal;
    @XmlElement(name = "GrssDltaEqvtQty")
    protected BigDecimal grssDltaEqvtQty;
    @XmlElement(name = "NetDltaEqvtQty")
    protected BigDecimal netDltaEqvtQty;
    @XmlElement(name = "GrssMktVal", required = true)
    protected ActiveCurrencyAndAmount grssMktVal;

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPdctId(String value) {
        this.pdctId = value;
    }

    /**
     * Gets the value of the rskRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link EndOfDayRequirement1 }
     *     
     */
    public EndOfDayRequirement1 getRskRqrmnt() {
        return rskRqrmnt;
    }

    /**
     * Sets the value of the rskRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndOfDayRequirement1 }
     *     
     */
    public void setRskRqrmnt(EndOfDayRequirement1 value) {
        this.rskRqrmnt = value;
    }

    /**
     * Gets the value of the grssNtnl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public ActiveCurrencyAnd24Amount getGrssNtnl() {
        return grssNtnl;
    }

    /**
     * Sets the value of the grssNtnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd24Amount }
     *     
     */
    public void setGrssNtnl(ActiveCurrencyAnd24Amount value) {
        this.grssNtnl = value;
    }

    /**
     * Gets the value of the netNtnl property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getNetNtnl() {
        return netNtnl;
    }

    /**
     * Sets the value of the netNtnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setNetNtnl(AmountAndDirection102 value) {
        this.netNtnl = value;
    }

    /**
     * Gets the value of the grssDltaEqvtVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssDltaEqvtVal() {
        return grssDltaEqvtVal;
    }

    /**
     * Sets the value of the grssDltaEqvtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssDltaEqvtVal(ActiveCurrencyAndAmount value) {
        this.grssDltaEqvtVal = value;
    }

    /**
     * Gets the value of the netDltaEqvtVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public AmountAndDirection102 getNetDltaEqvtVal() {
        return netDltaEqvtVal;
    }

    /**
     * Sets the value of the netDltaEqvtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection102 }
     *     
     */
    public void setNetDltaEqvtVal(AmountAndDirection102 value) {
        this.netDltaEqvtVal = value;
    }

    /**
     * Gets the value of the grssDltaEqvtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrssDltaEqvtQty() {
        return grssDltaEqvtQty;
    }

    /**
     * Sets the value of the grssDltaEqvtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrssDltaEqvtQty(BigDecimal value) {
        this.grssDltaEqvtQty = value;
    }

    /**
     * Gets the value of the netDltaEqvtQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetDltaEqvtQty() {
        return netDltaEqvtQty;
    }

    /**
     * Sets the value of the netDltaEqvtQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetDltaEqvtQty(BigDecimal value) {
        this.netDltaEqvtQty = value;
    }

    /**
     * Gets the value of the grssMktVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssMktVal() {
        return grssMktVal;
    }

    /**
     * Sets the value of the grssMktVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssMktVal(ActiveCurrencyAndAmount value) {
        this.grssMktVal = value;
    }

}
