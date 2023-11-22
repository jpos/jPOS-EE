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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestorType2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestorType2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvstrTpRtl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="InvstrTpPrfssnl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket5Choice" minOccurs="0"/>
 *         <element name="InvstrTpElgblCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket3Code" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherTargetMarketInvestor1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorType2", propOrder = {
    "invstrTpRtl",
    "invstrTpPrfssnl",
    "invstrTpElgblCtrPty",
    "othr"
})
public class InvestorType2 {

    @XmlElement(name = "InvstrTpRtl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code invstrTpRtl;
    @XmlElement(name = "InvstrTpPrfssnl")
    protected TargetMarket5Choice invstrTpPrfssnl;
    @XmlElement(name = "InvstrTpElgblCtrPty")
    @XmlSchemaType(name = "string")
    protected TargetMarket3Code invstrTpElgblCtrPty;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketInvestor1> othr;

    /**
     * Gets the value of the invstrTpRtl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getInvstrTpRtl() {
        return invstrTpRtl;
    }

    /**
     * Sets the value of the invstrTpRtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setInvstrTpRtl(TargetMarket1Code value) {
        this.invstrTpRtl = value;
    }

    /**
     * Gets the value of the invstrTpPrfssnl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket5Choice }
     *     
     */
    public TargetMarket5Choice getInvstrTpPrfssnl() {
        return invstrTpPrfssnl;
    }

    /**
     * Sets the value of the invstrTpPrfssnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket5Choice }
     *     
     */
    public void setInvstrTpPrfssnl(TargetMarket5Choice value) {
        this.invstrTpPrfssnl = value;
    }

    /**
     * Gets the value of the invstrTpElgblCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket3Code }
     *     
     */
    public TargetMarket3Code getInvstrTpElgblCtrPty() {
        return invstrTpElgblCtrPty;
    }

    /**
     * Sets the value of the invstrTpElgblCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket3Code }
     *     
     */
    public void setInvstrTpElgblCtrPty(TargetMarket3Code value) {
        this.invstrTpElgblCtrPty = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTargetMarketInvestor1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarketInvestor1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
