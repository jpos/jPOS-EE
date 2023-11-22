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

package org.jpos.iso20022.fxtr_034_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trade2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Trade2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}Max35Text"/>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}ISODate"/>
 *         <element name="FXTradPdct" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}UnderlyingProductIdentifier1Code"/>
 *         <element name="TradgCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}CurrencyCode" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}CurrencyCode" minOccurs="0"/>
 *         <element name="TradgMtd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}TradingMethodType1Code" minOccurs="0"/>
 *         <element name="TradgMd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}TradingModeType1Code"/>
 *         <element name="ClrMtd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}ClearingMethod1Code"/>
 *         <element name="Symb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PlcOfConf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}AnyBICIdentifier" minOccurs="0"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}Trade3" minOccurs="0"/>
 *         <element name="SwpLeg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}InstrumentLeg6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PdctId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}SecurityIdentification22Choice" minOccurs="0"/>
 *         <element name="AssoctdTradRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.034.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trade2", propOrder = {
    "tradId",
    "tradDt",
    "fxTradPdct",
    "tradgCcy",
    "sttlmCcy",
    "tradgMtd",
    "tradgMd",
    "clrMtd",
    "symb",
    "plcOfConf",
    "fxDtls",
    "swpLeg",
    "pdctId",
    "assoctdTradRef"
})
public class Trade2 {

    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "FXTradPdct", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code fxTradPdct;
    @XmlElement(name = "TradgCcy")
    protected String tradgCcy;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;
    @XmlElement(name = "TradgMtd")
    @XmlSchemaType(name = "string")
    protected TradingMethodType1Code tradgMtd;
    @XmlElement(name = "TradgMd", required = true)
    @XmlSchemaType(name = "string")
    protected TradingModeType1Code tradgMd;
    @XmlElement(name = "ClrMtd", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingMethod1Code clrMtd;
    @XmlElement(name = "Symb")
    protected String symb;
    @XmlElement(name = "PlcOfConf")
    protected String plcOfConf;
    @XmlElement(name = "FXDtls")
    protected Trade3 fxDtls;
    @XmlElement(name = "SwpLeg")
    protected List<InstrumentLeg6> swpLeg;
    @XmlElement(name = "PdctId")
    protected SecurityIdentification22Choice pdctId;
    @XmlElement(name = "AssoctdTradRef")
    protected List<String> assoctdTradRef;

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradId(String value) {
        this.tradId = value;
    }

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the fxTradPdct property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getFXTradPdct() {
        return fxTradPdct;
    }

    /**
     * Sets the value of the fxTradPdct property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public void setFXTradPdct(UnderlyingProductIdentifier1Code value) {
        this.fxTradPdct = value;
    }

    /**
     * Gets the value of the tradgCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgCcy() {
        return tradgCcy;
    }

    /**
     * Sets the value of the tradgCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgCcy(String value) {
        this.tradgCcy = value;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the tradgMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public TradingMethodType1Code getTradgMtd() {
        return tradgMtd;
    }

    /**
     * Sets the value of the tradgMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingMethodType1Code }
     *     
     */
    public void setTradgMtd(TradingMethodType1Code value) {
        this.tradgMtd = value;
    }

    /**
     * Gets the value of the tradgMd property.
     * 
     * @return
     *     possible object is
     *     {@link TradingModeType1Code }
     *     
     */
    public TradingModeType1Code getTradgMd() {
        return tradgMd;
    }

    /**
     * Sets the value of the tradgMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingModeType1Code }
     *     
     */
    public void setTradgMd(TradingModeType1Code value) {
        this.tradgMd = value;
    }

    /**
     * Gets the value of the clrMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public ClearingMethod1Code getClrMtd() {
        return clrMtd;
    }

    /**
     * Sets the value of the clrMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingMethod1Code }
     *     
     */
    public void setClrMtd(ClearingMethod1Code value) {
        this.clrMtd = value;
    }

    /**
     * Gets the value of the symb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymb() {
        return symb;
    }

    /**
     * Sets the value of the symb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymb(String value) {
        this.symb = value;
    }

    /**
     * Gets the value of the plcOfConf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfConf() {
        return plcOfConf;
    }

    /**
     * Sets the value of the plcOfConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfConf(String value) {
        this.plcOfConf = value;
    }

    /**
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Trade3 }
     *     
     */
    public Trade3 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade3 }
     *     
     */
    public void setFXDtls(Trade3 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the swpLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the swpLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSwpLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg6 }
     * 
     * 
     * @return
     *     The value of the swpLeg property.
     */
    public List<InstrumentLeg6> getSwpLeg() {
        if (swpLeg == null) {
            swpLeg = new ArrayList<>();
        }
        return this.swpLeg;
    }

    /**
     * Gets the value of the pdctId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification22Choice }
     *     
     */
    public SecurityIdentification22Choice getPdctId() {
        return pdctId;
    }

    /**
     * Sets the value of the pdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification22Choice }
     *     
     */
    public void setPdctId(SecurityIdentification22Choice value) {
        this.pdctId = value;
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
