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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LossBearing2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LossBearing2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NoCptlLoss" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="LtdCptlLoss" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="LtdCptlLossLvl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}PercentageRate" minOccurs="0"/>
 *         <element name="NoCptlGrnt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="LossByndCptl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherTargetMarketLossBearing1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LossBearing2", propOrder = {
    "noCptlLoss",
    "ltdCptlLoss",
    "ltdCptlLossLvl",
    "noCptlGrnt",
    "lossByndCptl",
    "othr"
})
public class LossBearing2 {

    @XmlElement(name = "NoCptlLoss")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code noCptlLoss;
    @XmlElement(name = "LtdCptlLoss")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code ltdCptlLoss;
    @XmlElement(name = "LtdCptlLossLvl")
    protected BigDecimal ltdCptlLossLvl;
    @XmlElement(name = "NoCptlGrnt")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code noCptlGrnt;
    @XmlElement(name = "LossByndCptl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code lossByndCptl;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketLossBearing1> othr;

    /**
     * Gets the value of the noCptlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getNoCptlLoss() {
        return noCptlLoss;
    }

    /**
     * Sets the value of the noCptlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setNoCptlLoss(TargetMarket1Code value) {
        this.noCptlLoss = value;
    }

    /**
     * Gets the value of the ltdCptlLoss property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getLtdCptlLoss() {
        return ltdCptlLoss;
    }

    /**
     * Sets the value of the ltdCptlLoss property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setLtdCptlLoss(TargetMarket1Code value) {
        this.ltdCptlLoss = value;
    }

    /**
     * Gets the value of the ltdCptlLossLvl property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLtdCptlLossLvl() {
        return ltdCptlLossLvl;
    }

    /**
     * Sets the value of the ltdCptlLossLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLtdCptlLossLvl(BigDecimal value) {
        this.ltdCptlLossLvl = value;
    }

    /**
     * Gets the value of the noCptlGrnt property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getNoCptlGrnt() {
        return noCptlGrnt;
    }

    /**
     * Sets the value of the noCptlGrnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setNoCptlGrnt(TargetMarket1Code value) {
        this.noCptlGrnt = value;
    }

    /**
     * Gets the value of the lossByndCptl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getLossByndCptl() {
        return lossByndCptl;
    }

    /**
     * Sets the value of the lossByndCptl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setLossByndCptl(TargetMarket1Code value) {
        this.lossByndCptl = value;
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
     * {@link OtherTargetMarketLossBearing1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarketLossBearing1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
