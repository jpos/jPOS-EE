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

package org.jpos.iso20022.reda_002_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValuation4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceValuation4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:reda.002.001.04}Max35Text" minOccurs="0"/>
 *         <element name="ValtnDtTm" type="{urn:swift:xsd:reda.002.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="NAVDtTm" type="{urn:swift:xsd:reda.002.001.04}DateAndDateTimeChoice"/>
 *         <element name="FinInstrmDtls" type="{urn:swift:xsd:reda.002.001.04}FinancialInstrument8"/>
 *         <element name="FndMgmtCpny" type="{urn:swift:xsd:reda.002.001.04}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="TtlNAV" type="{urn:swift:xsd:reda.002.001.04}ActiveOrHistoricCurrencyAndAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TtlUnitsNb" type="{urn:swift:xsd:reda.002.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="NxtValtnDtTm" type="{urn:swift:xsd:reda.002.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="PrvsValtnDtTm" type="{urn:swift:xsd:reda.002.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="ValtnTp" type="{urn:swift:xsd:reda.002.001.04}ValuationTiming1Code"/>
 *         <element name="ValtnFrqcy" type="{urn:swift:xsd:reda.002.001.04}EventFrequency1Code" minOccurs="0"/>
 *         <element name="OffclValtnInd" type="{urn:swift:xsd:reda.002.001.04}YesNoIndicator"/>
 *         <element name="SspdInd" type="{urn:swift:xsd:reda.002.001.04}YesNoIndicator"/>
 *         <element name="PricDtls" type="{urn:swift:xsd:reda.002.001.04}UnitPrice15" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ValtnSttstcs" type="{urn:swift:xsd:reda.002.001.04}ValuationStatistics3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrfrmncDtls" type="{urn:swift:xsd:reda.002.001.04}PerformanceFactors1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceValuation4", propOrder = {
    "id",
    "valtnDtTm",
    "navDtTm",
    "finInstrmDtls",
    "fndMgmtCpny",
    "ttlNAV",
    "ttlUnitsNb",
    "nxtValtnDtTm",
    "prvsValtnDtTm",
    "valtnTp",
    "valtnFrqcy",
    "offclValtnInd",
    "sspdInd",
    "pricDtls",
    "valtnSttstcs",
    "prfrmncDtls"
})
public class PriceValuation4 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "ValtnDtTm")
    protected DateAndDateTimeChoice valtnDtTm;
    @XmlElement(name = "NAVDtTm", required = true)
    protected DateAndDateTimeChoice navDtTm;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument8 finInstrmDtls;
    @XmlElement(name = "FndMgmtCpny")
    protected PartyIdentification2Choice fndMgmtCpny;
    @XmlElement(name = "TtlNAV")
    protected List<ActiveOrHistoricCurrencyAndAmount> ttlNAV;
    @XmlElement(name = "TtlUnitsNb")
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "NxtValtnDtTm")
    protected DateAndDateTimeChoice nxtValtnDtTm;
    @XmlElement(name = "PrvsValtnDtTm")
    protected DateAndDateTimeChoice prvsValtnDtTm;
    @XmlElement(name = "ValtnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ValuationTiming1Code valtnTp;
    @XmlElement(name = "ValtnFrqcy")
    @XmlSchemaType(name = "string")
    protected EventFrequency1Code valtnFrqcy;
    @XmlElement(name = "OffclValtnInd")
    protected boolean offclValtnInd;
    @XmlElement(name = "SspdInd")
    protected boolean sspdInd;
    @XmlElement(name = "PricDtls")
    protected List<UnitPrice15> pricDtls;
    @XmlElement(name = "ValtnSttstcs")
    protected List<ValuationStatistics3> valtnSttstcs;
    @XmlElement(name = "PrfrmncDtls")
    protected PerformanceFactors1 prfrmncDtls;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setValtnDtTm(DateAndDateTimeChoice value) {
        this.valtnDtTm = value;
    }

    /**
     * Gets the value of the navDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNAVDtTm() {
        return navDtTm;
    }

    /**
     * Sets the value of the navDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setNAVDtTm(DateAndDateTimeChoice value) {
        this.navDtTm = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument8 }
     *     
     */
    public FinancialInstrument8 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument8 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument8 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the fndMgmtCpny property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getFndMgmtCpny() {
        return fndMgmtCpny;
    }

    /**
     * Sets the value of the fndMgmtCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setFndMgmtCpny(PartyIdentification2Choice value) {
        this.fndMgmtCpny = value;
    }

    /**
     * Gets the value of the ttlNAV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ttlNAV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTtlNAV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAndAmount }
     * 
     * 
     * @return
     *     The value of the ttlNAV property.
     */
    public List<ActiveOrHistoricCurrencyAndAmount> getTtlNAV() {
        if (ttlNAV == null) {
            ttlNAV = new ArrayList<>();
        }
        return this.ttlNAV;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
    }

    /**
     * Gets the value of the nxtValtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getNxtValtnDtTm() {
        return nxtValtnDtTm;
    }

    /**
     * Sets the value of the nxtValtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setNxtValtnDtTm(DateAndDateTimeChoice value) {
        this.nxtValtnDtTm = value;
    }

    /**
     * Gets the value of the prvsValtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getPrvsValtnDtTm() {
        return prvsValtnDtTm;
    }

    /**
     * Sets the value of the prvsValtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setPrvsValtnDtTm(DateAndDateTimeChoice value) {
        this.prvsValtnDtTm = value;
    }

    /**
     * Gets the value of the valtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public ValuationTiming1Code getValtnTp() {
        return valtnTp;
    }

    /**
     * Sets the value of the valtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationTiming1Code }
     *     
     */
    public void setValtnTp(ValuationTiming1Code value) {
        this.valtnTp = value;
    }

    /**
     * Gets the value of the valtnFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency1Code }
     *     
     */
    public EventFrequency1Code getValtnFrqcy() {
        return valtnFrqcy;
    }

    /**
     * Sets the value of the valtnFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency1Code }
     *     
     */
    public void setValtnFrqcy(EventFrequency1Code value) {
        this.valtnFrqcy = value;
    }

    /**
     * Gets the value of the offclValtnInd property.
     * 
     */
    public boolean isOffclValtnInd() {
        return offclValtnInd;
    }

    /**
     * Sets the value of the offclValtnInd property.
     * 
     */
    public void setOffclValtnInd(boolean value) {
        this.offclValtnInd = value;
    }

    /**
     * Gets the value of the sspdInd property.
     * 
     */
    public boolean isSspdInd() {
        return sspdInd;
    }

    /**
     * Sets the value of the sspdInd property.
     * 
     */
    public void setSspdInd(boolean value) {
        this.sspdInd = value;
    }

    /**
     * Gets the value of the pricDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pricDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitPrice15 }
     * 
     * 
     * @return
     *     The value of the pricDtls property.
     */
    public List<UnitPrice15> getPricDtls() {
        if (pricDtls == null) {
            pricDtls = new ArrayList<>();
        }
        return this.pricDtls;
    }

    /**
     * Gets the value of the valtnSttstcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the valtnSttstcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValtnSttstcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValuationStatistics3 }
     * 
     * 
     * @return
     *     The value of the valtnSttstcs property.
     */
    public List<ValuationStatistics3> getValtnSttstcs() {
        if (valtnSttstcs == null) {
            valtnSttstcs = new ArrayList<>();
        }
        return this.valtnSttstcs;
    }

    /**
     * Gets the value of the prfrmncDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceFactors1 }
     *     
     */
    public PerformanceFactors1 getPrfrmncDtls() {
        return prfrmncDtls;
    }

    /**
     * Sets the value of the prfrmncDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceFactors1 }
     *     
     */
    public void setPrfrmncDtls(PerformanceFactors1 value) {
        this.prfrmncDtls = value;
    }

}
