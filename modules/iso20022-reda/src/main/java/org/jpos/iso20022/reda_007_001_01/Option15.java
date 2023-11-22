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

package org.jpos.iso20022.reda_007_001_01;

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
 * <p>Java class for Option15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Option15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnSttlmStyle" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}SettleStyle2Choice" minOccurs="0"/>
 *         <element name="ConvsDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Price8" minOccurs="0"/>
 *         <element name="MinExrcblQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="ConvsPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="OptnStyle" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}OptionStyle1Choice" minOccurs="0"/>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}OptionType8Choice" minOccurs="0"/>
 *         <element name="StrkVal" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *         <element name="StrkMltplr" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *         <element name="InstrmAssgnmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}AssignmentMethod2Choice" minOccurs="0"/>
 *         <element name="VrsnNb" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Number" minOccurs="0"/>
 *         <element name="XpryLctn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Max4AlphaNumericText" minOccurs="0"/>
 *         <element name="Stdstn" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}Standardisation3Choice" minOccurs="0"/>
 *         <element name="TradgPtyRole" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}OptionParty3Choice" minOccurs="0"/>
 *         <element name="CtrctSz" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}BaseOneRate" minOccurs="0"/>
 *         <element name="AddtlUndrlygAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:reda.007.001.01}UnderlyingAttributes4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Option15", propOrder = {
    "optnSttlmStyle",
    "convsDt",
    "strkPric",
    "minExrcblQty",
    "convsPrd",
    "optnStyle",
    "optnTp",
    "strkVal",
    "strkMltplr",
    "instrmAssgnmtMtd",
    "vrsnNb",
    "xpryLctn",
    "stdstn",
    "tradgPtyRole",
    "ctrctSz",
    "addtlUndrlygAttrbts"
})
public class Option15 {

    @XmlElement(name = "OptnSttlmStyle")
    protected SettleStyle2Choice optnSttlmStyle;
    @XmlElement(name = "ConvsDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar convsDt;
    @XmlElement(name = "StrkPric")
    protected Price8 strkPric;
    @XmlElement(name = "MinExrcblQty")
    protected FinancialInstrumentQuantity1Choice minExrcblQty;
    @XmlElement(name = "ConvsPrd")
    protected DateTimePeriod1Choice convsPrd;
    @XmlElement(name = "OptnStyle")
    protected OptionStyle1Choice optnStyle;
    @XmlElement(name = "OptnTp")
    protected OptionType8Choice optnTp;
    @XmlElement(name = "StrkVal")
    protected BigDecimal strkVal;
    @XmlElement(name = "StrkMltplr")
    protected BigDecimal strkMltplr;
    @XmlElement(name = "InstrmAssgnmtMtd")
    protected AssignmentMethod2Choice instrmAssgnmtMtd;
    @XmlElement(name = "VrsnNb")
    protected BigDecimal vrsnNb;
    @XmlElement(name = "XpryLctn")
    protected String xpryLctn;
    @XmlElement(name = "Stdstn")
    protected Standardisation3Choice stdstn;
    @XmlElement(name = "TradgPtyRole")
    protected OptionParty3Choice tradgPtyRole;
    @XmlElement(name = "CtrctSz")
    protected BigDecimal ctrctSz;
    @XmlElement(name = "AddtlUndrlygAttrbts")
    protected List<UnderlyingAttributes4> addtlUndrlygAttrbts;

    /**
     * Gets the value of the optnSttlmStyle property.
     * 
     * @return
     *     possible object is
     *     {@link SettleStyle2Choice }
     *     
     */
    public SettleStyle2Choice getOptnSttlmStyle() {
        return optnSttlmStyle;
    }

    /**
     * Sets the value of the optnSttlmStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettleStyle2Choice }
     *     
     */
    public void setOptnSttlmStyle(SettleStyle2Choice value) {
        this.optnSttlmStyle = value;
    }

    /**
     * Gets the value of the convsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConvsDt() {
        return convsDt;
    }

    /**
     * Sets the value of the convsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConvsDt(XMLGregorianCalendar value) {
        this.convsDt = value;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price8 }
     *     
     */
    public Price8 getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price8 }
     *     
     */
    public void setStrkPric(Price8 value) {
        this.strkPric = value;
    }

    /**
     * Gets the value of the minExrcblQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinExrcblQty() {
        return minExrcblQty;
    }

    /**
     * Sets the value of the minExrcblQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinExrcblQty(FinancialInstrumentQuantity1Choice value) {
        this.minExrcblQty = value;
    }

    /**
     * Gets the value of the convsPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getConvsPrd() {
        return convsPrd;
    }

    /**
     * Sets the value of the convsPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setConvsPrd(DateTimePeriod1Choice value) {
        this.convsPrd = value;
    }

    /**
     * Gets the value of the optnStyle property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public OptionStyle1Choice getOptnStyle() {
        return optnStyle;
    }

    /**
     * Sets the value of the optnStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStyle1Choice }
     *     
     */
    public void setOptnStyle(OptionStyle1Choice value) {
        this.optnStyle = value;
    }

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType8Choice }
     *     
     */
    public OptionType8Choice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType8Choice }
     *     
     */
    public void setOptnTp(OptionType8Choice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the strkVal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkVal() {
        return strkVal;
    }

    /**
     * Sets the value of the strkVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkVal(BigDecimal value) {
        this.strkVal = value;
    }

    /**
     * Gets the value of the strkMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStrkMltplr() {
        return strkMltplr;
    }

    /**
     * Sets the value of the strkMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStrkMltplr(BigDecimal value) {
        this.strkMltplr = value;
    }

    /**
     * Gets the value of the instrmAssgnmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentMethod2Choice }
     *     
     */
    public AssignmentMethod2Choice getInstrmAssgnmtMtd() {
        return instrmAssgnmtMtd;
    }

    /**
     * Sets the value of the instrmAssgnmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentMethod2Choice }
     *     
     */
    public void setInstrmAssgnmtMtd(AssignmentMethod2Choice value) {
        this.instrmAssgnmtMtd = value;
    }

    /**
     * Gets the value of the vrsnNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsnNb() {
        return vrsnNb;
    }

    /**
     * Sets the value of the vrsnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsnNb(BigDecimal value) {
        this.vrsnNb = value;
    }

    /**
     * Gets the value of the xpryLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpryLctn() {
        return xpryLctn;
    }

    /**
     * Sets the value of the xpryLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpryLctn(String value) {
        this.xpryLctn = value;
    }

    /**
     * Gets the value of the stdstn property.
     * 
     * @return
     *     possible object is
     *     {@link Standardisation3Choice }
     *     
     */
    public Standardisation3Choice getStdstn() {
        return stdstn;
    }

    /**
     * Sets the value of the stdstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Standardisation3Choice }
     *     
     */
    public void setStdstn(Standardisation3Choice value) {
        this.stdstn = value;
    }

    /**
     * Gets the value of the tradgPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link OptionParty3Choice }
     *     
     */
    public OptionParty3Choice getTradgPtyRole() {
        return tradgPtyRole;
    }

    /**
     * Sets the value of the tradgPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionParty3Choice }
     *     
     */
    public void setTradgPtyRole(OptionParty3Choice value) {
        this.tradgPtyRole = value;
    }

    /**
     * Gets the value of the ctrctSz property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrctSz() {
        return ctrctSz;
    }

    /**
     * Sets the value of the ctrctSz property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrctSz(BigDecimal value) {
        this.ctrctSz = value;
    }

    /**
     * Gets the value of the addtlUndrlygAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlUndrlygAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlUndrlygAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnderlyingAttributes4 }
     * 
     * 
     * @return
     *     The value of the addtlUndrlygAttrbts property.
     */
    public List<UnderlyingAttributes4> getAddtlUndrlygAttrbts() {
        if (addtlUndrlygAttrbts == null) {
            addtlUndrlygAttrbts = new ArrayList<>();
        }
        return this.addtlUndrlygAttrbts;
    }

}
