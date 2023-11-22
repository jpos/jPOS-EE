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

package org.jpos.iso20022.caaa_003_001_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurringTransaction5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RecurringTransaction5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstlmtPlan" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}InstalmentPlan1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PlanId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max35Text" minOccurs="0"/>
 *         <element name="PlanOwnr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}PlanOwner1Code" minOccurs="0"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Number" minOccurs="0"/>
 *         <element name="PrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Frequency3Code" minOccurs="0"/>
 *         <element name="InstlmtPrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Number" minOccurs="0"/>
 *         <element name="TtlNbOfPmts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Number" minOccurs="0"/>
 *         <element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ISODate" minOccurs="0"/>
 *         <element name="TtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}CurrencyAndAmount" minOccurs="0"/>
 *         <element name="FrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="SbsqntAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="LastAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Chrgs" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="DtldChrgs" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}InstalmentAmountDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}InterestRateDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GracePrd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}GracePeriod1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PlanNtce" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}ActionMessage10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringTransaction5", propOrder = {
    "instlmtPlan",
    "planId",
    "planOwnr",
    "seqNb",
    "prdUnit",
    "instlmtPrd",
    "ttlNbOfPmts",
    "frstPmtDt",
    "ttlAmt",
    "frstAmt",
    "sbsqntAmt",
    "lastAmt",
    "chrgs",
    "dtldChrgs",
    "intrstRate",
    "gracePrd",
    "planNtce"
})
public class RecurringTransaction5 {

    @XmlElement(name = "InstlmtPlan")
    @XmlSchemaType(name = "string")
    protected List<InstalmentPlan1Code> instlmtPlan;
    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "PlanOwnr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code planOwnr;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency3Code prdUnit;
    @XmlElement(name = "InstlmtPrd")
    protected BigDecimal instlmtPrd;
    @XmlElement(name = "TtlNbOfPmts")
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "FrstPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "TtlAmt")
    protected CurrencyAndAmount ttlAmt;
    @XmlElement(name = "FrstAmt")
    protected BigDecimal frstAmt;
    @XmlElement(name = "SbsqntAmt")
    protected BigDecimal sbsqntAmt;
    @XmlElement(name = "LastAmt")
    protected BigDecimal lastAmt;
    @XmlElement(name = "Chrgs")
    protected BigDecimal chrgs;
    @XmlElement(name = "DtldChrgs")
    protected List<InstalmentAmountDetails1> dtldChrgs;
    @XmlElement(name = "IntrstRate")
    protected List<InterestRateDetails1> intrstRate;
    @XmlElement(name = "GracePrd")
    protected List<GracePeriod1> gracePrd;
    @XmlElement(name = "PlanNtce")
    protected List<ActionMessage10> planNtce;

    /**
     * Gets the value of the instlmtPlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmtPlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtPlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentPlan1Code }
     * 
     * 
     * @return
     *     The value of the instlmtPlan property.
     */
    public List<InstalmentPlan1Code> getInstlmtPlan() {
        if (instlmtPlan == null) {
            instlmtPlan = new ArrayList<>();
        }
        return this.instlmtPlan;
    }

    /**
     * Gets the value of the planId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanId() {
        return planId;
    }

    /**
     * Sets the value of the planId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanId(String value) {
        this.planId = value;
    }

    /**
     * Gets the value of the planOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link PlanOwner1Code }
     *     
     */
    public PlanOwner1Code getPlanOwnr() {
        return planOwnr;
    }

    /**
     * Sets the value of the planOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanOwner1Code }
     *     
     */
    public void setPlanOwnr(PlanOwner1Code value) {
        this.planOwnr = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency3Code }
     *     
     */
    public Frequency3Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency3Code }
     *     
     */
    public void setPrdUnit(Frequency3Code value) {
        this.prdUnit = value;
    }

    /**
     * Gets the value of the instlmtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInstlmtPrd() {
        return instlmtPrd;
    }

    /**
     * Sets the value of the instlmtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInstlmtPrd(BigDecimal value) {
        this.instlmtPrd = value;
    }

    /**
     * Gets the value of the ttlNbOfPmts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfPmts() {
        return ttlNbOfPmts;
    }

    /**
     * Sets the value of the ttlNbOfPmts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfPmts(BigDecimal value) {
        this.ttlNbOfPmts = value;
    }

    /**
     * Gets the value of the frstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstPmtDt() {
        return frstPmtDt;
    }

    /**
     * Sets the value of the frstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstPmtDt(XMLGregorianCalendar value) {
        this.frstPmtDt = value;
    }

    /**
     * Gets the value of the ttlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTtlAmt() {
        return ttlAmt;
    }

    /**
     * Sets the value of the ttlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTtlAmt(CurrencyAndAmount value) {
        this.ttlAmt = value;
    }

    /**
     * Gets the value of the frstAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrstAmt() {
        return frstAmt;
    }

    /**
     * Sets the value of the frstAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrstAmt(BigDecimal value) {
        this.frstAmt = value;
    }

    /**
     * Gets the value of the sbsqntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSbsqntAmt() {
        return sbsqntAmt;
    }

    /**
     * Sets the value of the sbsqntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSbsqntAmt(BigDecimal value) {
        this.sbsqntAmt = value;
    }

    /**
     * Gets the value of the lastAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastAmt() {
        return lastAmt;
    }

    /**
     * Sets the value of the lastAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastAmt(BigDecimal value) {
        this.lastAmt = value;
    }

    /**
     * Gets the value of the chrgs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChrgs() {
        return chrgs;
    }

    /**
     * Sets the value of the chrgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChrgs(BigDecimal value) {
        this.chrgs = value;
    }

    /**
     * Gets the value of the dtldChrgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dtldChrgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDtldChrgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentAmountDetails1 }
     * 
     * 
     * @return
     *     The value of the dtldChrgs property.
     */
    public List<InstalmentAmountDetails1> getDtldChrgs() {
        if (dtldChrgs == null) {
            dtldChrgs = new ArrayList<>();
        }
        return this.dtldChrgs;
    }

    /**
     * Gets the value of the intrstRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRateDetails1 }
     * 
     * 
     * @return
     *     The value of the intrstRate property.
     */
    public List<InterestRateDetails1> getIntrstRate() {
        if (intrstRate == null) {
            intrstRate = new ArrayList<>();
        }
        return this.intrstRate;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gracePrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGracePrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GracePeriod1 }
     * 
     * 
     * @return
     *     The value of the gracePrd property.
     */
    public List<GracePeriod1> getGracePrd() {
        if (gracePrd == null) {
            gracePrd = new ArrayList<>();
        }
        return this.gracePrd;
    }

    /**
     * Gets the value of the planNtce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the planNtce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanNtce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage10 }
     * 
     * 
     * @return
     *     The value of the planNtce property.
     */
    public List<ActionMessage10> getPlanNtce() {
        if (planNtce == null) {
            planNtce = new ArrayList<>();
        }
        return this.planNtce;
    }

}
