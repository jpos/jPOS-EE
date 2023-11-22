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

package org.jpos.iso20022.sese_007_001_09;

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
 * <p>Java class for Transfer37 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transfer37">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrfConfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max35Text"/>
 *         <element name="TrfRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="CtrPtyRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="BizFlowTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}BusinessFlowType1Code" minOccurs="0"/>
 *         <element name="ReqdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="FctvTrfDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DateAndDateTime2Choice"/>
 *         <element name="FctvSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="TrfOrdrDtForm" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="TrfRsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}TransferReason1Choice" minOccurs="0"/>
 *         <element name="HldgsPlanTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}HoldingsPlanType1Code" maxOccurs="3" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}FinancialInstrument88"/>
 *         <element name="TtlUnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}DecimalNumber"/>
 *         <element name="TrfRate" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}PercentageRate" minOccurs="0"/>
 *         <element name="UnitsDtls" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Unit12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rndg" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}RoundingDirection2Code" minOccurs="0"/>
 *         <element name="OrgnlCost" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="AvrgPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="NewAvrgPric" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="AvrgDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="NewAvrgDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ISODate" minOccurs="0"/>
 *         <element name="TrfCcy" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="OwnAcctTrfInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="NonStdSttlmInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}Max350Text" minOccurs="0"/>
 *         <element name="TrfExpnssPmtTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.007.001.09}ChargePaymentMethod1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer37", propOrder = {
    "trfConfRef",
    "trfRef",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "reqdSttlmDt",
    "fctvTrfDt",
    "fctvSttlmDt",
    "tradDt",
    "trfOrdrDtForm",
    "trfRsn",
    "hldgsPlanTp",
    "finInstrmDtls",
    "ttlUnitsNb",
    "trfRate",
    "unitsDtls",
    "rndg",
    "orgnlCost",
    "avrgPric",
    "newAvrgPric",
    "avrgDt",
    "newAvrgDt",
    "trfCcy",
    "ownAcctTrfInd",
    "nonStdSttlmInf",
    "trfExpnssPmtTp"
})
public class Transfer37 {

    @XmlElement(name = "TrfConfRef", required = true)
    protected String trfConfRef;
    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference10 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference10 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "FctvTrfDt", required = true)
    protected DateAndDateTime2Choice fctvTrfDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTime2Choice fctvSttlmDt;
    @XmlElement(name = "TradDt")
    protected DateAndDateTime2Choice tradDt;
    @XmlElement(name = "TrfOrdrDtForm")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trfOrdrDtForm;
    @XmlElement(name = "TrfRsn")
    protected TransferReason1Choice trfRsn;
    @XmlElement(name = "HldgsPlanTp")
    @XmlSchemaType(name = "string")
    protected List<HoldingsPlanType1Code> hldgsPlanTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument88 finInstrmDtls;
    @XmlElement(name = "TtlUnitsNb", required = true)
    protected BigDecimal ttlUnitsNb;
    @XmlElement(name = "TrfRate")
    protected BigDecimal trfRate;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit12> unitsDtls;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "OrgnlCost")
    protected ActiveCurrencyAnd13DecimalAmount orgnlCost;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "NewAvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount newAvrgPric;
    @XmlElement(name = "AvrgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar avrgDt;
    @XmlElement(name = "NewAvrgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar newAvrgDt;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "OwnAcctTrfInd")
    protected Boolean ownAcctTrfInd;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "TrfExpnssPmtTp")
    protected ChargePaymentMethod1Choice trfExpnssPmtTp;

    /**
     * Gets the value of the trfConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfConfRef() {
        return trfConfRef;
    }

    /**
     * Sets the value of the trfConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfConfRef(String value) {
        this.trfConfRef = value;
    }

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrfRef(String value) {
        this.trfRef = value;
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
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
    }

    /**
     * Gets the value of the fctvTrfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvTrfDt() {
        return fctvTrfDt;
    }

    /**
     * Sets the value of the fctvTrfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvTrfDt(DateAndDateTime2Choice value) {
        this.fctvTrfDt = value;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setFctvSttlmDt(DateAndDateTime2Choice value) {
        this.fctvSttlmDt = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setTradDt(DateAndDateTime2Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the trfOrdrDtForm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrfOrdrDtForm() {
        return trfOrdrDtForm;
    }

    /**
     * Sets the value of the trfOrdrDtForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrfOrdrDtForm(XMLGregorianCalendar value) {
        this.trfOrdrDtForm = value;
    }

    /**
     * Gets the value of the trfRsn property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReason1Choice }
     *     
     */
    public TransferReason1Choice getTrfRsn() {
        return trfRsn;
    }

    /**
     * Sets the value of the trfRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReason1Choice }
     *     
     */
    public void setTrfRsn(TransferReason1Choice value) {
        this.trfRsn = value;
    }

    /**
     * Gets the value of the hldgsPlanTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hldgsPlanTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgsPlanTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingsPlanType1Code }
     * 
     * 
     * @return
     *     The value of the hldgsPlanTp property.
     */
    public List<HoldingsPlanType1Code> getHldgsPlanTp() {
        if (hldgsPlanTp == null) {
            hldgsPlanTp = new ArrayList<>();
        }
        return this.hldgsPlanTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument88 }
     *     
     */
    public FinancialInstrument88 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument88 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument88 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlUnitsNb(BigDecimal value) {
        this.ttlUnitsNb = value;
    }

    /**
     * Gets the value of the trfRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrfRate() {
        return trfRate;
    }

    /**
     * Sets the value of the trfRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrfRate(BigDecimal value) {
        this.trfRate = value;
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
     * {@link Unit12 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit12> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public void setRndg(RoundingDirection2Code value) {
        this.rndg = value;
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
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
    }

    /**
     * Gets the value of the newAvrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getNewAvrgPric() {
        return newAvrgPric;
    }

    /**
     * Sets the value of the newAvrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setNewAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.newAvrgPric = value;
    }

    /**
     * Gets the value of the avrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvrgDt() {
        return avrgDt;
    }

    /**
     * Sets the value of the avrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvrgDt(XMLGregorianCalendar value) {
        this.avrgDt = value;
    }

    /**
     * Gets the value of the newAvrgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNewAvrgDt() {
        return newAvrgDt;
    }

    /**
     * Sets the value of the newAvrgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNewAvrgDt(XMLGregorianCalendar value) {
        this.newAvrgDt = value;
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
     * Gets the value of the ownAcctTrfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnAcctTrfInd() {
        return ownAcctTrfInd;
    }

    /**
     * Sets the value of the ownAcctTrfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOwnAcctTrfInd(Boolean value) {
        this.ownAcctTrfInd = value;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
    }

    /**
     * Gets the value of the trfExpnssPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargePaymentMethod1Choice }
     *     
     */
    public ChargePaymentMethod1Choice getTrfExpnssPmtTp() {
        return trfExpnssPmtTp;
    }

    /**
     * Sets the value of the trfExpnssPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePaymentMethod1Choice }
     *     
     */
    public void setTrfExpnssPmtTp(ChargePaymentMethod1Choice value) {
        this.trfExpnssPmtTp = value;
    }

}
