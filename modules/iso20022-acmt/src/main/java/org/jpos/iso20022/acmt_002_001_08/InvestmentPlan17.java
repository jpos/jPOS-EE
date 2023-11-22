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

package org.jpos.iso20022.acmt_002_001_08;

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
 * <p>Java class for InvestmentPlan17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvestmentPlan17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Frqcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Frequency20Choice"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODate" minOccurs="0"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODate" minOccurs="0"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}UnitsOrAmount1Choice"/>
 *         <element name="GrssAmtInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}YesNoIndicator" minOccurs="0"/>
 *         <element name="IncmPref" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}IncomePreference2Code" minOccurs="0"/>
 *         <element name="InitlAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InitialAmount1Choice" minOccurs="0"/>
 *         <element name="TtlNbOfInstlmts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Number" minOccurs="0"/>
 *         <element name="RndgDrctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}RoundingDirection1Code" minOccurs="0"/>
 *         <element name="SctyDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Repartition6" maxOccurs="50"/>
 *         <element name="CshSttlm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CashSettlement3" maxOccurs="8" minOccurs="0"/>
 *         <element name="CtrctRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="RltdCtrctRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="PdctId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="SLAChrgAndComssnRef" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="InsrncCover" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InsuranceType2Choice" minOccurs="0"/>
 *         <element name="PlanSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PlanStatus2Choice" minOccurs="0"/>
 *         <element name="InstlmtMgrRole" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PartyRole4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestmentPlan17", propOrder = {
    "frqcy",
    "startDt",
    "endDt",
    "qty",
    "grssAmtInd",
    "incmPref",
    "initlAmt",
    "ttlNbOfInstlmts",
    "rndgDrctn",
    "sctyDtls",
    "cshSttlm",
    "ctrctRef",
    "rltdCtrctRef",
    "pdctId",
    "slaChrgAndComssnRef",
    "insrncCover",
    "planSts",
    "instlmtMgrRole"
})
public class InvestmentPlan17 {

    @XmlElement(name = "Frqcy", required = true)
    protected Frequency20Choice frqcy;
    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "EndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDt;
    @XmlElement(name = "Qty", required = true)
    protected UnitsOrAmount1Choice qty;
    @XmlElement(name = "GrssAmtInd")
    protected Boolean grssAmtInd;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference2Code incmPref;
    @XmlElement(name = "InitlAmt")
    protected InitialAmount1Choice initlAmt;
    @XmlElement(name = "TtlNbOfInstlmts")
    protected BigDecimal ttlNbOfInstlmts;
    @XmlElement(name = "RndgDrctn")
    @XmlSchemaType(name = "string")
    protected RoundingDirection1Code rndgDrctn;
    @XmlElement(name = "SctyDtls", required = true)
    protected List<Repartition6> sctyDtls;
    @XmlElement(name = "CshSttlm")
    protected List<CashSettlement3> cshSttlm;
    @XmlElement(name = "CtrctRef")
    protected String ctrctRef;
    @XmlElement(name = "RltdCtrctRef")
    protected String rltdCtrctRef;
    @XmlElement(name = "PdctId")
    protected String pdctId;
    @XmlElement(name = "SLAChrgAndComssnRef")
    protected String slaChrgAndComssnRef;
    @XmlElement(name = "InsrncCover")
    protected InsuranceType2Choice insrncCover;
    @XmlElement(name = "PlanSts")
    protected PlanStatus2Choice planSts;
    @XmlElement(name = "InstlmtMgrRole")
    protected PartyRole4Choice instlmtMgrRole;

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
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDt(XMLGregorianCalendar value) {
        this.endDt = value;
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
     * Gets the value of the grssAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrssAmtInd() {
        return grssAmtInd;
    }

    /**
     * Sets the value of the grssAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrssAmtInd(Boolean value) {
        this.grssAmtInd = value;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference2Code }
     *     
     */
    public IncomePreference2Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference2Code }
     *     
     */
    public void setIncmPref(IncomePreference2Code value) {
        this.incmPref = value;
    }

    /**
     * Gets the value of the initlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitialAmount1Choice }
     *     
     */
    public InitialAmount1Choice getInitlAmt() {
        return initlAmt;
    }

    /**
     * Sets the value of the initlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialAmount1Choice }
     *     
     */
    public void setInitlAmt(InitialAmount1Choice value) {
        this.initlAmt = value;
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
     * Gets the value of the rndgDrctn property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public RoundingDirection1Code getRndgDrctn() {
        return rndgDrctn;
    }

    /**
     * Sets the value of the rndgDrctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection1Code }
     *     
     */
    public void setRndgDrctn(RoundingDirection1Code value) {
        this.rndgDrctn = value;
    }

    /**
     * Gets the value of the sctyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sctyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSctyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Repartition6 }
     * 
     * 
     * @return
     *     The value of the sctyDtls property.
     */
    public List<Repartition6> getSctyDtls() {
        if (sctyDtls == null) {
            sctyDtls = new ArrayList<>();
        }
        return this.sctyDtls;
    }

    /**
     * Gets the value of the cshSttlm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSttlm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSttlm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashSettlement3 }
     * 
     * 
     * @return
     *     The value of the cshSttlm property.
     */
    public List<CashSettlement3> getCshSttlm() {
        if (cshSttlm == null) {
            cshSttlm = new ArrayList<>();
        }
        return this.cshSttlm;
    }

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtrctRef(String value) {
        this.ctrctRef = value;
    }

    /**
     * Gets the value of the rltdCtrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRltdCtrctRef() {
        return rltdCtrctRef;
    }

    /**
     * Sets the value of the rltdCtrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRltdCtrctRef(String value) {
        this.rltdCtrctRef = value;
    }

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
     * Gets the value of the slaChrgAndComssnRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLAChrgAndComssnRef() {
        return slaChrgAndComssnRef;
    }

    /**
     * Sets the value of the slaChrgAndComssnRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLAChrgAndComssnRef(String value) {
        this.slaChrgAndComssnRef = value;
    }

    /**
     * Gets the value of the insrncCover property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceType2Choice }
     *     
     */
    public InsuranceType2Choice getInsrncCover() {
        return insrncCover;
    }

    /**
     * Sets the value of the insrncCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceType2Choice }
     *     
     */
    public void setInsrncCover(InsuranceType2Choice value) {
        this.insrncCover = value;
    }

    /**
     * Gets the value of the planSts property.
     * 
     * @return
     *     possible object is
     *     {@link PlanStatus2Choice }
     *     
     */
    public PlanStatus2Choice getPlanSts() {
        return planSts;
    }

    /**
     * Sets the value of the planSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanStatus2Choice }
     *     
     */
    public void setPlanSts(PlanStatus2Choice value) {
        this.planSts = value;
    }

    /**
     * Gets the value of the instlmtMgrRole property.
     * 
     * @return
     *     possible object is
     *     {@link PartyRole4Choice }
     *     
     */
    public PartyRole4Choice getInstlmtMgrRole() {
        return instlmtMgrRole;
    }

    /**
     * Sets the value of the instlmtMgrRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyRole4Choice }
     *     
     */
    public void setInstlmtMgrRole(PartyRole4Choice value) {
        this.instlmtMgrRole = value;
    }

}
