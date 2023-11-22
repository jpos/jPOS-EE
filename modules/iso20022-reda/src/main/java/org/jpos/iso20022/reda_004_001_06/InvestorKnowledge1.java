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
 * <p>Java class for InvestorKnowledge1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestorKnowledge1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BsicInvstr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="InfrmdInvstr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="AdvncdInvstr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="ExprtInvstrDE" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}TargetMarket1Code" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherTargetMarketInvestorKnowledge1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorKnowledge1", propOrder = {
    "bsicInvstr",
    "infrmdInvstr",
    "advncdInvstr",
    "exprtInvstrDE",
    "othr"
})
public class InvestorKnowledge1 {

    @XmlElement(name = "BsicInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code bsicInvstr;
    @XmlElement(name = "InfrmdInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code infrmdInvstr;
    @XmlElement(name = "AdvncdInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code advncdInvstr;
    @XmlElement(name = "ExprtInvstrDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code exprtInvstrDE;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketInvestorKnowledge1> othr;

    /**
     * Gets the value of the bsicInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getBsicInvstr() {
        return bsicInvstr;
    }

    /**
     * Sets the value of the bsicInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setBsicInvstr(TargetMarket1Code value) {
        this.bsicInvstr = value;
    }

    /**
     * Gets the value of the infrmdInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getInfrmdInvstr() {
        return infrmdInvstr;
    }

    /**
     * Sets the value of the infrmdInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setInfrmdInvstr(TargetMarket1Code value) {
        this.infrmdInvstr = value;
    }

    /**
     * Gets the value of the advncdInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getAdvncdInvstr() {
        return advncdInvstr;
    }

    /**
     * Sets the value of the advncdInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setAdvncdInvstr(TargetMarket1Code value) {
        this.advncdInvstr = value;
    }

    /**
     * Gets the value of the exprtInvstrDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getExprtInvstrDE() {
        return exprtInvstrDE;
    }

    /**
     * Sets the value of the exprtInvstrDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public void setExprtInvstrDE(TargetMarket1Code value) {
        this.exprtInvstrDE = value;
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
     * {@link OtherTargetMarketInvestorKnowledge1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarketInvestorKnowledge1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
