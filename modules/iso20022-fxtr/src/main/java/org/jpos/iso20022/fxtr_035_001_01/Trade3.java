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

package org.jpos.iso20022.fxtr_035_001_01;

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
 * <p>Java class for Trade3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Trade3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExctnPric" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ActiveCurrencyAnd13DecimalAmount"/>
 *         <element name="LastQty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyAndAmount"/>
 *         <element name="SttlmTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}SettlementDateCode"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ISODate"/>
 *         <element name="ValtnRate" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}AgreedRate3"/>
 *         <element name="FwdPts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="ClctdCtrPtyCcyLastQty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyAndAmount"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ISODate"/>
 *         <element name="RskAmt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="SctyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}SecurityIdentification18"/>
 *         <element name="FxgCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}CurrencyCode" minOccurs="0"/>
 *         <element name="FxgDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}ISODate" minOccurs="0"/>
 *         <element name="OptnInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="DltaInd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="AssoctdTradRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade3", propOrder = {
    "exctnPric",
    "lastQty",
    "sttlmTp",
    "sttlmDt",
    "valtnRate",
    "fwdPts",
    "clctdCtrPtyCcyLastQty",
    "valDt",
    "rskAmt",
    "sctyId",
    "fxgCcy",
    "fxgDt",
    "optnInd",
    "dltaInd",
    "assoctdTradRef"
})
public class Trade3 {

    @XmlElement(name = "ExctnPric", required = true)
    protected ActiveCurrencyAnd13DecimalAmount exctnPric;
    @XmlElement(name = "LastQty", required = true)
    protected CurrencyAndAmount lastQty;
    @XmlElement(name = "SttlmTp", required = true)
    @XmlSchemaType(name = "string")
    protected SettlementDateCode sttlmTp;
    @XmlElement(name = "SttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;
    @XmlElement(name = "ValtnRate", required = true)
    protected AgreedRate3 valtnRate;
    @XmlElement(name = "FwdPts")
    protected BigDecimal fwdPts;
    @XmlElement(name = "ClctdCtrPtyCcyLastQty", required = true)
    protected CurrencyAndAmount clctdCtrPtyCcyLastQty;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "RskAmt", required = true)
    protected ActiveCurrencyAndAmount rskAmt;
    @XmlElement(name = "SctyId", required = true)
    protected SecurityIdentification18 sctyId;
    @XmlElement(name = "FxgCcy")
    protected String fxgCcy;
    @XmlElement(name = "FxgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fxgDt;
    @XmlElement(name = "OptnInd")
    protected Boolean optnInd;
    @XmlElement(name = "DltaInd")
    protected Boolean dltaInd;
    @XmlElement(name = "AssoctdTradRef")
    protected List<String> assoctdTradRef;

    /**
     * Gets the value of the exctnPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getExctnPric() {
        return exctnPric;
    }

    /**
     * Sets the value of the exctnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setExctnPric(ActiveCurrencyAnd13DecimalAmount value) {
        this.exctnPric = value;
    }

    /**
     * Gets the value of the lastQty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getLastQty() {
        return lastQty;
    }

    /**
     * Sets the value of the lastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setLastQty(CurrencyAndAmount value) {
        this.lastQty = value;
    }

    /**
     * Gets the value of the sttlmTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDateCode }
     *     
     */
    public SettlementDateCode getSttlmTp() {
        return sttlmTp;
    }

    /**
     * Sets the value of the sttlmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDateCode }
     *     
     */
    public void setSttlmTp(SettlementDateCode value) {
        this.sttlmTp = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the valtnRate property.
     * 
     * @return
     *     possible object is
     *     {@link AgreedRate3 }
     *     
     */
    public AgreedRate3 getValtnRate() {
        return valtnRate;
    }

    /**
     * Sets the value of the valtnRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreedRate3 }
     *     
     */
    public void setValtnRate(AgreedRate3 value) {
        this.valtnRate = value;
    }

    /**
     * Gets the value of the fwdPts property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFwdPts() {
        return fwdPts;
    }

    /**
     * Sets the value of the fwdPts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFwdPts(BigDecimal value) {
        this.fwdPts = value;
    }

    /**
     * Gets the value of the clctdCtrPtyCcyLastQty property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getClctdCtrPtyCcyLastQty() {
        return clctdCtrPtyCcyLastQty;
    }

    /**
     * Sets the value of the clctdCtrPtyCcyLastQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setClctdCtrPtyCcyLastQty(CurrencyAndAmount value) {
        this.clctdCtrPtyCcyLastQty = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the rskAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRskAmt() {
        return rskAmt;
    }

    /**
     * Sets the value of the rskAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRskAmt(ActiveCurrencyAndAmount value) {
        this.rskAmt = value;
    }

    /**
     * Gets the value of the sctyId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public SecurityIdentification18 getSctyId() {
        return sctyId;
    }

    /**
     * Sets the value of the sctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification18 }
     *     
     */
    public void setSctyId(SecurityIdentification18 value) {
        this.sctyId = value;
    }

    /**
     * Gets the value of the fxgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFxgCcy() {
        return fxgCcy;
    }

    /**
     * Sets the value of the fxgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFxgCcy(String value) {
        this.fxgCcy = value;
    }

    /**
     * Gets the value of the fxgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFxgDt() {
        return fxgDt;
    }

    /**
     * Sets the value of the fxgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFxgDt(XMLGregorianCalendar value) {
        this.fxgDt = value;
    }

    /**
     * Gets the value of the optnInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOptnInd() {
        return optnInd;
    }

    /**
     * Sets the value of the optnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOptnInd(Boolean value) {
        this.optnInd = value;
    }

    /**
     * Gets the value of the dltaInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDltaInd() {
        return dltaInd;
    }

    /**
     * Sets the value of the dltaInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDltaInd(Boolean value) {
        this.dltaInd = value;
    }

    /**
     * Gets the value of the assoctdTradRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the assoctdTradRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssoctdTradRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the assoctdTradRef property.
     */
    public List<String> getAssoctdTradRef() {
        if (assoctdTradRef == null) {
            assoctdTradRef = new ArrayList<>();
        }
        return this.assoctdTradRef;
    }

}
