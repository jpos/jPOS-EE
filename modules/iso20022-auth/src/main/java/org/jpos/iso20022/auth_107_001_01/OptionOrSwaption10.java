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

package org.jpos.iso20022.auth_107_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionOrSwaption10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OptionOrSwaption10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}OptionType2Code" minOccurs="0"/>
 *         <element name="MbddTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}EmbeddedType1Code" minOccurs="0"/>
 *         <element name="ExrcStyle" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}OptionStyle6Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ExrcDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ExerciseDate1Choice" minOccurs="0"/>
 *         <element name="StrkPric" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice17Choice" minOccurs="0"/>
 *         <element name="StrkPricSchdl" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Schedule4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="CallAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="PutAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="PrmAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="PrmPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *         <element name="MtrtyDtOfUndrlyg" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionOrSwaption10", propOrder = {
    "tp",
    "mbddTp",
    "exrcStyle",
    "exrcDt",
    "strkPric",
    "strkPricSchdl",
    "callAmt",
    "putAmt",
    "prmAmt",
    "prmPmtDt",
    "mtrtyDtOfUndrlyg"
})
public class OptionOrSwaption10 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected OptionType2Code tp;
    @XmlElement(name = "MbddTp")
    @XmlSchemaType(name = "string")
    protected EmbeddedType1Code mbddTp;
    @XmlElement(name = "ExrcStyle")
    @XmlSchemaType(name = "string")
    protected List<OptionStyle6Code> exrcStyle;
    @XmlElement(name = "ExrcDt")
    protected ExerciseDate1Choice exrcDt;
    @XmlElement(name = "StrkPric")
    protected SecuritiesTransactionPrice17Choice strkPric;
    @XmlElement(name = "StrkPricSchdl")
    protected List<Schedule4> strkPricSchdl;
    @XmlElement(name = "CallAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount callAmt;
    @XmlElement(name = "PutAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount putAmt;
    @XmlElement(name = "PrmAmt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount prmAmt;
    @XmlElement(name = "PrmPmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prmPmtDt;
    @XmlElement(name = "MtrtyDtOfUndrlyg")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar mtrtyDtOfUndrlyg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OptionType2Code }
     *     
     */
    public OptionType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionType2Code }
     *     
     */
    public void setTp(OptionType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the mbddTp property.
     * 
     * @return
     *     possible object is
     *     {@link EmbeddedType1Code }
     *     
     */
    public EmbeddedType1Code getMbddTp() {
        return mbddTp;
    }

    /**
     * Sets the value of the mbddTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbeddedType1Code }
     *     
     */
    public void setMbddTp(EmbeddedType1Code value) {
        this.mbddTp = value;
    }

    /**
     * Gets the value of the exrcStyle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the exrcStyle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExrcStyle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionStyle6Code }
     * 
     * 
     * @return
     *     The value of the exrcStyle property.
     */
    public List<OptionStyle6Code> getExrcStyle() {
        if (exrcStyle == null) {
            exrcStyle = new ArrayList<>();
        }
        return this.exrcStyle;
    }

    /**
     * Gets the value of the exrcDt property.
     * 
     * @return
     *     possible object is
     *     {@link ExerciseDate1Choice }
     *     
     */
    public ExerciseDate1Choice getExrcDt() {
        return exrcDt;
    }

    /**
     * Sets the value of the exrcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExerciseDate1Choice }
     *     
     */
    public void setExrcDt(ExerciseDate1Choice value) {
        this.exrcDt = value;
    }

    /**
     * Gets the value of the strkPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getStrkPric() {
        return strkPric;
    }

    /**
     * Sets the value of the strkPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public void setStrkPric(SecuritiesTransactionPrice17Choice value) {
        this.strkPric = value;
    }

    /**
     * Gets the value of the strkPricSchdl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the strkPricSchdl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrkPricSchdl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule4 }
     * 
     * 
     * @return
     *     The value of the strkPricSchdl property.
     */
    public List<Schedule4> getStrkPricSchdl() {
        if (strkPricSchdl == null) {
            strkPricSchdl = new ArrayList<>();
        }
        return this.strkPricSchdl;
    }

    /**
     * Gets the value of the callAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getCallAmt() {
        return callAmt;
    }

    /**
     * Sets the value of the callAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setCallAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.callAmt = value;
    }

    /**
     * Gets the value of the putAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPutAmt() {
        return putAmt;
    }

    /**
     * Sets the value of the putAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setPutAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.putAmt = value;
    }

    /**
     * Gets the value of the prmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPrmAmt() {
        return prmAmt;
    }

    /**
     * Sets the value of the prmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setPrmAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.prmAmt = value;
    }

    /**
     * Gets the value of the prmPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrmPmtDt() {
        return prmPmtDt;
    }

    /**
     * Sets the value of the prmPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrmPmtDt(XMLGregorianCalendar value) {
        this.prmPmtDt = value;
    }

    /**
     * Gets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMtrtyDtOfUndrlyg() {
        return mtrtyDtOfUndrlyg;
    }

    /**
     * Sets the value of the mtrtyDtOfUndrlyg property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMtrtyDtOfUndrlyg(XMLGregorianCalendar value) {
        this.mtrtyDtOfUndrlyg = value;
    }

}
