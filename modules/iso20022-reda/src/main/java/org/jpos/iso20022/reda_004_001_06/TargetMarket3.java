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
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetMarket3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TargetMarket3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RefDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="InvstrTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestorType2" minOccurs="0"/>
 *         <element name="KnwldgAndOrExprnc" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestorKnowledge1" minOccurs="0"/>
 *         <element name="AbltyToBearLosses" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}LossBearing2" minOccurs="0"/>
 *         <element name="RskTlrnce" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}RiskTolerance1" minOccurs="0"/>
 *         <element name="ClntObjctvsAndNeeds" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestorRequirements3" minOccurs="0"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}OtherTargetMarket1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetMarket3", propOrder = {
    "refDt",
    "invstrTp",
    "knwldgAndOrExprnc",
    "abltyToBearLosses",
    "rskTlrnce",
    "clntObjctvsAndNeeds",
    "othr"
})
public class TargetMarket3 {

    @XmlElement(name = "RefDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar refDt;
    @XmlElement(name = "InvstrTp")
    protected InvestorType2 invstrTp;
    @XmlElement(name = "KnwldgAndOrExprnc")
    protected InvestorKnowledge1 knwldgAndOrExprnc;
    @XmlElement(name = "AbltyToBearLosses")
    protected LossBearing2 abltyToBearLosses;
    @XmlElement(name = "RskTlrnce")
    protected RiskTolerance1 rskTlrnce;
    @XmlElement(name = "ClntObjctvsAndNeeds")
    protected InvestorRequirements3 clntObjctvsAndNeeds;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarket1> othr;

    /**
     * Gets the value of the refDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefDt() {
        return refDt;
    }

    /**
     * Sets the value of the refDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefDt(XMLGregorianCalendar value) {
        this.refDt = value;
    }

    /**
     * Gets the value of the invstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorType2 }
     *     
     */
    public InvestorType2 getInvstrTp() {
        return invstrTp;
    }

    /**
     * Sets the value of the invstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorType2 }
     *     
     */
    public void setInvstrTp(InvestorType2 value) {
        this.invstrTp = value;
    }

    /**
     * Gets the value of the knwldgAndOrExprnc property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public InvestorKnowledge1 getKnwldgAndOrExprnc() {
        return knwldgAndOrExprnc;
    }

    /**
     * Sets the value of the knwldgAndOrExprnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorKnowledge1 }
     *     
     */
    public void setKnwldgAndOrExprnc(InvestorKnowledge1 value) {
        this.knwldgAndOrExprnc = value;
    }

    /**
     * Gets the value of the abltyToBearLosses property.
     * 
     * @return
     *     possible object is
     *     {@link LossBearing2 }
     *     
     */
    public LossBearing2 getAbltyToBearLosses() {
        return abltyToBearLosses;
    }

    /**
     * Sets the value of the abltyToBearLosses property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossBearing2 }
     *     
     */
    public void setAbltyToBearLosses(LossBearing2 value) {
        this.abltyToBearLosses = value;
    }

    /**
     * Gets the value of the rskTlrnce property.
     * 
     * @return
     *     possible object is
     *     {@link RiskTolerance1 }
     *     
     */
    public RiskTolerance1 getRskTlrnce() {
        return rskTlrnce;
    }

    /**
     * Sets the value of the rskTlrnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskTolerance1 }
     *     
     */
    public void setRskTlrnce(RiskTolerance1 value) {
        this.rskTlrnce = value;
    }

    /**
     * Gets the value of the clntObjctvsAndNeeds property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorRequirements3 }
     *     
     */
    public InvestorRequirements3 getClntObjctvsAndNeeds() {
        return clntObjctvsAndNeeds;
    }

    /**
     * Sets the value of the clntObjctvsAndNeeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorRequirements3 }
     *     
     */
    public void setClntObjctvsAndNeeds(InvestorRequirements3 value) {
        this.clntObjctvsAndNeeds = value;
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
     * {@link OtherTargetMarket1 }
     * 
     * 
     * @return
     *     The value of the othr property.
     */
    public List<OtherTargetMarket1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<>();
        }
        return this.othr;
    }

}
