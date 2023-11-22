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

package org.jpos.iso20022.sese_018_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrument99 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrument99">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LineId" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Max35Text" minOccurs="0"/>
 *         <element name="Instrm" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}FinancialInstrument62Choice"/>
 *         <element name="Qty" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Quantity47" minOccurs="0"/>
 *         <element name="UnitsDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Unit11" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="CtrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="BizFlowTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}BusinessFlowType1Code" minOccurs="0"/>
 *         <element name="AvrgAcqstnPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TrfCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="TtlBookVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}DateAndAmount2" minOccurs="0"/>
 *         <element name="LatstValtn" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}DateAndAmount2" minOccurs="0"/>
 *         <element name="OrgnlCost" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="TrfeeAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Account28" minOccurs="0"/>
 *         <element name="Trfr" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Account28" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="IntrmyInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Intermediary43" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CrstllstnDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Crystallisation2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxValtnPt" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}Tax36" minOccurs="0"/>
 *         <element name="SttlmPtiesDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}FundSettlementParameters17" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AsstsHeldInOwnNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="TrfRsltsInChngOfBnfclOwnr" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.018.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrument99", propOrder = {
    "lineId",
    "instrm",
    "qty",
    "unitsDtls",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "avrgAcqstnPric",
    "trfCcy",
    "ttlBookVal",
    "latstValtn",
    "orgnlCost",
    "trfeeAcct",
    "trfr",
    "intrmyInf",
    "crstllstnDtls",
    "taxValtnPt",
    "sttlmPtiesDtls",
    "asstsHeldInOwnNm",
    "trfRsltsInChngOfBnfclOwnr",
    "addtlInf"
})
public class FinancialInstrument99 {

    @XmlElement(name = "LineId")
    protected String lineId;
    @XmlElement(name = "Instrm", required = true)
    protected FinancialInstrument62Choice instrm;
    @XmlElement(name = "Qty")
    protected Quantity47 qty;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit11> unitsDtls;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "AvrgAcqstnPric")
    protected ActiveOrHistoricCurrencyAndAmount avrgAcqstnPric;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "TtlBookVal")
    protected DateAndAmount2 ttlBookVal;
    @XmlElement(name = "LatstValtn")
    protected DateAndAmount2 latstValtn;
    @XmlElement(name = "OrgnlCost")
    protected ActiveCurrencyAnd13DecimalAmount orgnlCost;
    @XmlElement(name = "TrfeeAcct")
    protected Account28 trfeeAcct;
    @XmlElement(name = "Trfr")
    protected List<Account28> trfr;
    @XmlElement(name = "IntrmyInf")
    protected List<Intermediary43> intrmyInf;
    @XmlElement(name = "CrstllstnDtls")
    protected List<Crystallisation2> crstllstnDtls;
    @XmlElement(name = "TaxValtnPt")
    protected Tax36 taxValtnPt;
    @XmlElement(name = "SttlmPtiesDtls")
    protected List<FundSettlementParameters17> sttlmPtiesDtls;
    @XmlElement(name = "AsstsHeldInOwnNm")
    protected Boolean asstsHeldInOwnNm;
    @XmlElement(name = "TrfRsltsInChngOfBnfclOwnr")
    protected Boolean trfRsltsInChngOfBnfclOwnr;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument62Choice }
     *     
     */
    public FinancialInstrument62Choice getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument62Choice }
     *     
     */
    public void setInstrm(FinancialInstrument62Choice value) {
        this.instrm = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity47 }
     *     
     */
    public Quantity47 getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity47 }
     *     
     */
    public void setQty(Quantity47 value) {
        this.qty = value;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit11 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit11> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setClntRef(AdditionalReference10 value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setCtrPtyRef(AdditionalReference10 value) {
        this.ctrPtyRef = value;
    }

    /**
     * Gets the value of the bizFlowTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public BusinessFlowType1Code getBizFlowTp() {
        return bizFlowTp;
    }

    /**
     * Sets the value of the bizFlowTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public void setBizFlowTp(BusinessFlowType1Code value) {
        this.bizFlowTp = value;
    }

    /**
     * Gets the value of the avrgAcqstnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAvrgAcqstnPric() {
        return avrgAcqstnPric;
    }

    /**
     * Sets the value of the avrgAcqstnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAvrgAcqstnPric(ActiveOrHistoricCurrencyAndAmount value) {
        this.avrgAcqstnPric = value;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfCcy(String value) {
        this.trfCcy = value;
    }

    /**
     * Gets the value of the ttlBookVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getTtlBookVal() {
        return ttlBookVal;
    }

    /**
     * Sets the value of the ttlBookVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setTtlBookVal(DateAndAmount2 value) {
        this.ttlBookVal = value;
    }

    /**
     * Gets the value of the latstValtn property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getLatstValtn() {
        return latstValtn;
    }

    /**
     * Sets the value of the latstValtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setLatstValtn(DateAndAmount2 value) {
        this.latstValtn = value;
    }

    /**
     * Gets the value of the orgnlCost property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getOrgnlCost() {
        return orgnlCost;
    }

    /**
     * Sets the value of the orgnlCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setOrgnlCost(ActiveCurrencyAnd13DecimalAmount value) {
        this.orgnlCost = value;
    }

    /**
     * Gets the value of the trfeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link Account28 }
     *     
     */
    public Account28 getTrfeeAcct() {
        return trfeeAcct;
    }

    /**
     * Sets the value of the trfeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account28 }
     *     
     */
    public void setTrfeeAcct(Account28 value) {
        this.trfeeAcct = value;
    }

    /**
     * Gets the value of the trfr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trfr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrfr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Account28 }
     * 
     * 
     * @return
     *     The value of the trfr property.
     */
    public List<Account28> getTrfr() {
        if (trfr == null) {
            trfr = new ArrayList<>();
        }
        return this.trfr;
    }

    /**
     * Gets the value of the intrmyInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrmyInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrmyInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary43 }
     * 
     * 
     * @return
     *     The value of the intrmyInf property.
     */
    public List<Intermediary43> getIntrmyInf() {
        if (intrmyInf == null) {
            intrmyInf = new ArrayList<>();
        }
        return this.intrmyInf;
    }

    /**
     * Gets the value of the crstllstnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crstllstnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrstllstnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Crystallisation2 }
     * 
     * 
     * @return
     *     The value of the crstllstnDtls property.
     */
    public List<Crystallisation2> getCrstllstnDtls() {
        if (crstllstnDtls == null) {
            crstllstnDtls = new ArrayList<>();
        }
        return this.crstllstnDtls;
    }

    /**
     * Gets the value of the taxValtnPt property.
     * 
     * @return
     *     possible object is
     *     {@link Tax36 }
     *     
     */
    public Tax36 getTaxValtnPt() {
        return taxValtnPt;
    }

    /**
     * Sets the value of the taxValtnPt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tax36 }
     *     
     */
    public void setTaxValtnPt(Tax36 value) {
        this.taxValtnPt = value;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmPtiesDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmPtiesDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FundSettlementParameters17 }
     * 
     * 
     * @return
     *     The value of the sttlmPtiesDtls property.
     */
    public List<FundSettlementParameters17> getSttlmPtiesDtls() {
        if (sttlmPtiesDtls == null) {
            sttlmPtiesDtls = new ArrayList<>();
        }
        return this.sttlmPtiesDtls;
    }

    /**
     * Gets the value of the asstsHeldInOwnNm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsstsHeldInOwnNm() {
        return asstsHeldInOwnNm;
    }

    /**
     * Sets the value of the asstsHeldInOwnNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsstsHeldInOwnNm(Boolean value) {
        this.asstsHeldInOwnNm = value;
    }

    /**
     * Gets the value of the trfRsltsInChngOfBnfclOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrfRsltsInChngOfBnfclOwnr() {
        return trfRsltsInChngOfBnfclOwnr;
    }

    /**
     * Sets the value of the trfRsltsInChngOfBnfclOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrfRsltsInChngOfBnfclOwnr(Boolean value) {
        this.trfRsltsInChngOfBnfclOwnr = value;
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
