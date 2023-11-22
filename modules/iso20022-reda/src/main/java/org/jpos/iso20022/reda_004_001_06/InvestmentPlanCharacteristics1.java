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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestmentPlanCharacteristics1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentPlanCharacteristics1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlanTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}InvestmentFundPlanType1Choice"/>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Frequency20Choice" minOccurs="0"/>
 *         <element name="TtlNbOfInstlmts" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}Number" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}UnitsOrAmount1Choice" minOccurs="0"/>
 *         <element name="PlanConttn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlSbcpt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlSbcptFctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentPlanCharacteristics1", propOrder = {
    "planTp",
    "frqcy",
    "ttlNbOfInstlmts",
    "qty",
    "planConttn",
    "addtlSbcpt",
    "addtlSbcptFctn",
    "addtlInf"
})
public class InvestmentPlanCharacteristics1 {

    @XmlElement(name = "PlanTp", required = true)
    protected InvestmentFundPlanType1Choice planTp;
    @XmlElement(name = "Frqcy")
    protected Frequency20Choice frqcy;
    @XmlElement(name = "TtlNbOfInstlmts")
    protected BigDecimal ttlNbOfInstlmts;
    @XmlElement(name = "Qty")
    protected UnitsOrAmount1Choice qty;
    @XmlElement(name = "PlanConttn")
    protected Boolean planConttn;
    @XmlElement(name = "AddtlSbcpt")
    protected Boolean addtlSbcpt;
    @XmlElement(name = "AddtlSbcptFctn")
    protected Boolean addtlSbcptFctn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the planTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundPlanType1Choice }
     *     
     */
    public InvestmentFundPlanType1Choice getPlanTp() {
        return planTp;
    }

    /**
     * Sets the value of the planTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundPlanType1Choice }
     *     
     */
    public void setPlanTp(InvestmentFundPlanType1Choice value) {
        this.planTp = value;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency20Choice }
     *     
     */
    public Frequency20Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency20Choice }
     *     
     */
    public void setFrqcy(Frequency20Choice value) {
        this.frqcy = value;
    }

    /**
     * Gets the value of the ttlNbOfInstlmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfInstlmts() {
        return ttlNbOfInstlmts;
    }

    /**
     * Sets the value of the ttlNbOfInstlmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfInstlmts(BigDecimal value) {
        this.ttlNbOfInstlmts = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public UnitsOrAmount1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitsOrAmount1Choice }
     *     
     */
    public void setQty(UnitsOrAmount1Choice value) {
        this.qty = value;
    }

    /**
     * Gets the value of the planConttn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPlanConttn() {
        return planConttn;
    }

    /**
     * Sets the value of the planConttn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPlanConttn(Boolean value) {
        this.planConttn = value;
    }

    /**
     * Gets the value of the addtlSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSbcpt() {
        return addtlSbcpt;
    }

    /**
     * Sets the value of the addtlSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddtlSbcpt(Boolean value) {
        this.addtlSbcpt = value;
    }

    /**
     * Gets the value of the addtlSbcptFctn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSbcptFctn() {
        return addtlSbcptFctn;
    }

    /**
     * Sets the value of the addtlSbcptFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddtlSbcptFctn(Boolean value) {
        this.addtlSbcptFctn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
