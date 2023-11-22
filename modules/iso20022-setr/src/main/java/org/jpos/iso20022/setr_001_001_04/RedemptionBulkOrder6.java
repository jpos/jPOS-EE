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

package org.jpos.iso20022.setr_001_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedemptionBulkOrder6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RedemptionBulkOrder6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}Max35Text" minOccurs="0"/>
 *         <element name="PlcOfTrad" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}PlaceOfTradeIdentification1Choice" minOccurs="0"/>
 *         <element name="OrdrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="XpryDtTm" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}DateAndDateTimeChoice" minOccurs="0"/>
 *         <element name="ReqdFutrTradDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ISODate" minOccurs="0"/>
 *         <element name="CxlRght" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}CancellationRight1Choice" minOccurs="0"/>
 *         <element name="FinInstrmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}FinancialInstrument57"/>
 *         <element name="IndvOrdrDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}RedemptionOrder15" maxOccurs="unbounded"/>
 *         <element name="ReqdSttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="ReqdNAVCcy" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="TtlSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="BlkCshSttlmDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.001.001.04}PaymentTransaction72" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionBulkOrder6", propOrder = {
    "mstrRef",
    "plcOfTrad",
    "ordrDtTm",
    "xpryDtTm",
    "reqdFutrTradDt",
    "cxlRght",
    "finInstrmDtls",
    "indvOrdrDtls",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "ttlSttlmAmt",
    "blkCshSttlmDtls"
})
public class RedemptionBulkOrder6 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "PlcOfTrad")
    protected PlaceOfTradeIdentification1Choice plcOfTrad;
    @XmlElement(name = "OrdrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ordrDtTm;
    @XmlElement(name = "XpryDtTm")
    protected DateAndDateTimeChoice xpryDtTm;
    @XmlElement(name = "ReqdFutrTradDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdFutrTradDt;
    @XmlElement(name = "CxlRght")
    protected CancellationRight1Choice cxlRght;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument57 finInstrmDtls;
    @XmlElement(name = "IndvOrdrDtls", required = true)
    protected List<RedemptionOrder15> indvOrdrDtls;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "TtlSttlmAmt")
    protected ActiveCurrencyAndAmount ttlSttlmAmt;
    @XmlElement(name = "BlkCshSttlmDtls")
    protected PaymentTransaction72 blkCshSttlmDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the plcOfTrad property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public PlaceOfTradeIdentification1Choice getPlcOfTrad() {
        return plcOfTrad;
    }

    /**
     * Sets the value of the plcOfTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceOfTradeIdentification1Choice }
     *     
     */
    public void setPlcOfTrad(PlaceOfTradeIdentification1Choice value) {
        this.plcOfTrad = value;
    }

    /**
     * Gets the value of the ordrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrdrDtTm() {
        return ordrDtTm;
    }

    /**
     * Sets the value of the ordrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrdrDtTm(XMLGregorianCalendar value) {
        this.ordrDtTm = value;
    }

    /**
     * Gets the value of the xpryDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDtTm() {
        return xpryDtTm;
    }

    /**
     * Sets the value of the xpryDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public void setXpryDtTm(DateAndDateTimeChoice value) {
        this.xpryDtTm = value;
    }

    /**
     * Gets the value of the reqdFutrTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdFutrTradDt() {
        return reqdFutrTradDt;
    }

    /**
     * Sets the value of the reqdFutrTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdFutrTradDt(XMLGregorianCalendar value) {
        this.reqdFutrTradDt = value;
    }

    /**
     * Gets the value of the cxlRght property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public CancellationRight1Choice getCxlRght() {
        return cxlRght;
    }

    /**
     * Sets the value of the cxlRght property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRight1Choice }
     *     
     */
    public void setCxlRght(CancellationRight1Choice value) {
        this.cxlRght = value;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public FinancialInstrument57 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument57 }
     *     
     */
    public void setFinInstrmDtls(FinancialInstrument57 value) {
        this.finInstrmDtls = value;
    }

    /**
     * Gets the value of the indvOrdrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvOrdrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvOrdrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedemptionOrder15 }
     * 
     * 
     * @return
     *     The value of the indvOrdrDtls property.
     */
    public List<RedemptionOrder15> getIndvOrdrDtls() {
        if (indvOrdrDtls == null) {
            indvOrdrDtls = new ArrayList<>();
        }
        return this.indvOrdrDtls;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlSttlmAmt(ActiveCurrencyAndAmount value) {
        this.ttlSttlmAmt = value;
    }

    /**
     * Gets the value of the blkCshSttlmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public PaymentTransaction72 getBlkCshSttlmDtls() {
        return blkCshSttlmDtls;
    }

    /**
     * Sets the value of the blkCshSttlmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTransaction72 }
     *     
     */
    public void setBlkCshSttlmDtls(PaymentTransaction72 value) {
        this.blkCshSttlmDtls = value;
    }

}
