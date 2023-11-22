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
 * <p>Java class for RiskTolerance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RiskTolerance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RskTlrncePRIIPSMthdlgy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max1Number" minOccurs="0"/>
 *         <element name="RskTlrnceUCITSMthdlgy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max1Number" minOccurs="0"/>
 *         <element name="RskTlrnceIntl" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}RiskLevel1Code" minOccurs="0"/>
 *         <element name="RskTlrnceForNonPRIIPSAndNonUCITSES" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Max1Number" minOccurs="0"/>
 *         <element name="NotForInvstrsWthTheLwstRskTlrnceDE" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket2Code" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherTargetMarketRiskTolerance1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskTolerance1", propOrder = {
    "rskTlrncePRIIPSMthdlgy",
    "rskTlrnceUCITSMthdlgy",
    "rskTlrnceIntl",
    "rskTlrnceForNonPRIIPSAndNonUCITSES",
    "notForInvstrsWthTheLwstRskTlrnceDE",
    "othr"
})
public class RiskTolerance1 {

    @XmlElement(name = "RskTlrncePRIIPSMthdlgy")
    protected BigDecimal rskTlrncePRIIPSMthdlgy;
    @XmlElement(name = "RskTlrnceUCITSMthdlgy")
    protected BigDecimal rskTlrnceUCITSMthdlgy;
    @XmlElement(name = "RskTlrnceIntl")
    @XmlSchemaType(name = "string")
    protected RiskLevel1Code rskTlrnceIntl;
    @XmlElement(name = "RskTlrnceForNonPRIIPSAndNonUCITSES")
    protected BigDecimal rskTlrnceForNonPRIIPSAndNonUCITSES;
    @XmlElement(name = "NotForInvstrsWthTheLwstRskTlrnceDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket2Code notForInvstrsWthTheLwstRskTlrnceDE;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketRiskTolerance1> othr;

    /**
     * Gets the value of the rskTlrncePRIIPSMthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrncePRIIPSMthdlgy() {
        return rskTlrncePRIIPSMthdlgy;
    }

    /**
     * Sets the value of the rskTlrncePRIIPSMthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRskTlrncePRIIPSMthdlgy(BigDecimal value) {
        this.rskTlrncePRIIPSMthdlgy = value;
    }

    /**
     * Gets the value of the rskTlrnceUCITSMthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrnceUCITSMthdlgy() {
        return rskTlrnceUCITSMthdlgy;
    }

    /**
     * Sets the value of the rskTlrnceUCITSMthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRskTlrnceUCITSMthdlgy(BigDecimal value) {
        this.rskTlrnceUCITSMthdlgy = value;
    }

    /**
     * Gets the value of the rskTlrnceIntl property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLevel1Code }
     *     
     */
    public RiskLevel1Code getRskTlrnceIntl() {
        return rskTlrnceIntl;
    }

    /**
     * Sets the value of the rskTlrnceIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLevel1Code }
     *     
     */
    public void setRskTlrnceIntl(RiskLevel1Code value) {
        this.rskTlrnceIntl = value;
    }

    /**
     * Gets the value of the rskTlrnceForNonPRIIPSAndNonUCITSES property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrnceForNonPRIIPSAndNonUCITSES() {
        return rskTlrnceForNonPRIIPSAndNonUCITSES;
    }

    /**
     * Sets the value of the rskTlrnceForNonPRIIPSAndNonUCITSES property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRskTlrnceForNonPRIIPSAndNonUCITSES(BigDecimal value) {
        this.rskTlrnceForNonPRIIPSAndNonUCITSES = value;
    }

    /**
     * Gets the value of the notForInvstrsWthTheLwstRskTlrnceDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket2Code }
     *     
     */
    public TargetMarket2Code getNotForInvstrsWthTheLwstRskTlrnceDE() {
        return notForInvstrsWthTheLwstRskTlrnceDE;
    }

    /**
     * Sets the value of the notForInvstrsWthTheLwstRskTlrnceDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket2Code }
     *     
     */
    public void setNotForInvstrsWthTheLwstRskTlrnceDE(TargetMarket2Code value) {
        this.notForInvstrsWthTheLwstRskTlrnceDE = value;
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
     * {@link OtherTargetMarketRiskTolerance1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarketRiskTolerance1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
