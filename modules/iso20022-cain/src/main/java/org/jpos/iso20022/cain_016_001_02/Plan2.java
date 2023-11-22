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

package org.jpos.iso20022.cain_016_001_02;

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
 * <p>Java class for Plan2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Plan2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PlanId" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max70Text" minOccurs="0"/>
 *         <element name="PlanOwnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}PlanOwner1Code" minOccurs="0"/>
 *         <element name="OthrPlanOwnr" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max35Text" minOccurs="0"/>
 *         <element name="InstlmtPmtTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Max35Text" minOccurs="0"/>
 *         <element name="DfrrdInstlmtInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PrdUnit" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Frequency18Code" minOccurs="0"/>
 *         <element name="NbOfPrds" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Number" minOccurs="0"/>
 *         <element name="IntrstRate" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}InterestRateDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}ISODate" minOccurs="0"/>
 *         <element name="FrstAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NrmlPmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlNbOfPmts" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}Number" minOccurs="0"/>
 *         <element name="InstlmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}ISO3NumericCurrencyCode" minOccurs="0"/>
 *         <element name="GracePrd" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}GracePeriod2" minOccurs="0"/>
 *         <element name="AmtDtls" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}InstalmentAmountDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="GrdTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.016.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Plan2", propOrder = {
    "planId",
    "planOwnr",
    "othrPlanOwnr",
    "instlmtPmtTp",
    "dfrrdInstlmtInd",
    "prdUnit",
    "nbOfPrds",
    "intrstRate",
    "frstPmtDt",
    "frstAmt",
    "nrmlPmtAmt",
    "ttlNbOfPmts",
    "instlmtCcy",
    "gracePrd",
    "amtDtls",
    "grdTtlAmt",
    "addtlData"
})
public class Plan2 {

    @XmlElement(name = "PlanId")
    protected String planId;
    @XmlElement(name = "PlanOwnr")
    @XmlSchemaType(name = "string")
    protected PlanOwner1Code planOwnr;
    @XmlElement(name = "OthrPlanOwnr")
    protected String othrPlanOwnr;
    @XmlElement(name = "InstlmtPmtTp")
    protected String instlmtPmtTp;
    @XmlElement(name = "DfrrdInstlmtInd")
    protected Boolean dfrrdInstlmtInd;
    @XmlElement(name = "PrdUnit")
    @XmlSchemaType(name = "string")
    protected Frequency18Code prdUnit;
    @XmlElement(name = "NbOfPrds")
    protected BigDecimal nbOfPrds;
    @XmlElement(name = "IntrstRate")
    protected List<InterestRateDetails2> intrstRate;
    @XmlElement(name = "FrstPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar frstPmtDt;
    @XmlElement(name = "FrstAmt")
    protected BigDecimal frstAmt;
    @XmlElement(name = "NrmlPmtAmt")
    protected BigDecimal nrmlPmtAmt;
    @XmlElement(name = "TtlNbOfPmts")
    protected BigDecimal ttlNbOfPmts;
    @XmlElement(name = "InstlmtCcy")
    protected String instlmtCcy;
    @XmlElement(name = "GracePrd")
    protected GracePeriod2 gracePrd;
    @XmlElement(name = "AmtDtls")
    protected List<InstalmentAmountDetails2> amtDtls;
    @XmlElement(name = "GrdTtlAmt")
    protected BigDecimal grdTtlAmt;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

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
     * Gets the value of the othrPlanOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPlanOwnr() {
        return othrPlanOwnr;
    }

    /**
     * Sets the value of the othrPlanOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPlanOwnr(String value) {
        this.othrPlanOwnr = value;
    }

    /**
     * Gets the value of the instlmtPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtPmtTp() {
        return instlmtPmtTp;
    }

    /**
     * Sets the value of the instlmtPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstlmtPmtTp(String value) {
        this.instlmtPmtTp = value;
    }

    /**
     * Gets the value of the dfrrdInstlmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDfrrdInstlmtInd() {
        return dfrrdInstlmtInd;
    }

    /**
     * Sets the value of the dfrrdInstlmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDfrrdInstlmtInd(Boolean value) {
        this.dfrrdInstlmtInd = value;
    }

    /**
     * Gets the value of the prdUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency18Code }
     *     
     */
    public Frequency18Code getPrdUnit() {
        return prdUnit;
    }

    /**
     * Sets the value of the prdUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency18Code }
     *     
     */
    public void setPrdUnit(Frequency18Code value) {
        this.prdUnit = value;
    }

    /**
     * Gets the value of the nbOfPrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfPrds() {
        return nbOfPrds;
    }

    /**
     * Sets the value of the nbOfPrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfPrds(BigDecimal value) {
        this.nbOfPrds = value;
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
     * {@link InterestRateDetails2 }
     * 
     * 
     * @return
     *     The value of the intrstRate property.
     */
    public List<InterestRateDetails2> getIntrstRate() {
        if (intrstRate == null) {
            intrstRate = new ArrayList<>();
        }
        return this.intrstRate;
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
     * Gets the value of the nrmlPmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNrmlPmtAmt() {
        return nrmlPmtAmt;
    }

    /**
     * Sets the value of the nrmlPmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNrmlPmtAmt(BigDecimal value) {
        this.nrmlPmtAmt = value;
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
     * Gets the value of the instlmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstlmtCcy() {
        return instlmtCcy;
    }

    /**
     * Sets the value of the instlmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstlmtCcy(String value) {
        this.instlmtCcy = value;
    }

    /**
     * Gets the value of the gracePrd property.
     * 
     * @return
     *     possible object is
     *     {@link GracePeriod2 }
     *     
     */
    public GracePeriod2 getGracePrd() {
        return gracePrd;
    }

    /**
     * Sets the value of the gracePrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GracePeriod2 }
     *     
     */
    public void setGracePrd(GracePeriod2 value) {
        this.gracePrd = value;
    }

    /**
     * Gets the value of the amtDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstalmentAmountDetails2 }
     * 
     * 
     * @return
     *     The value of the amtDtls property.
     */
    public List<InstalmentAmountDetails2> getAmtDtls() {
        if (amtDtls == null) {
            amtDtls = new ArrayList<>();
        }
        return this.amtDtls;
    }

    /**
     * Gets the value of the grdTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrdTtlAmt() {
        return grdTtlAmt;
    }

    /**
     * Sets the value of the grdTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrdTtlAmt(BigDecimal value) {
        this.grdTtlAmt = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
