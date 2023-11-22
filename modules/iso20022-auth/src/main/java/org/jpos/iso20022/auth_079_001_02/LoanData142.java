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

package org.jpos.iso20022.auth_079_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanData142 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanData142">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnqTradIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Max52Text" minOccurs="0"/>
 *         <element name="EvtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate"/>
 *         <element name="ExctnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}MICIdentifier" minOccurs="0"/>
 *         <element name="CollDlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}CollateralDeliveryMethod1Code" minOccurs="0"/>
 *         <element name="OutsdngMrgnLnAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ShrtMktValAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MrgnLnAttr" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}InterestRate6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanData142", propOrder = {
    "unqTradIdr",
    "evtDt",
    "exctnDtTm",
    "tradgVn",
    "collDlvryMtd",
    "outsdngMrgnLnAmt",
    "shrtMktValAmt",
    "mrgnLnAttr",
    "termntnDt"
})
public class LoanData142 {

    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "EvtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "ExctnDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exctnDtTm;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "CollDlvryMtd")
    @XmlSchemaType(name = "string")
    protected CollateralDeliveryMethod1Code collDlvryMtd;
    @XmlElement(name = "OutsdngMrgnLnAmt")
    protected ActiveOrHistoricCurrencyAndAmount outsdngMrgnLnAmt;
    @XmlElement(name = "ShrtMktValAmt")
    protected ActiveOrHistoricCurrencyAndAmount shrtMktValAmt;
    @XmlElement(name = "MrgnLnAttr")
    protected List<InterestRate6> mrgnLnAttr;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar termntnDt;

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
    }

    /**
     * Gets the value of the exctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExctnDtTm() {
        return exctnDtTm;
    }

    /**
     * Sets the value of the exctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExctnDtTm(XMLGregorianCalendar value) {
        this.exctnDtTm = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the collDlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public CollateralDeliveryMethod1Code getCollDlvryMtd() {
        return collDlvryMtd;
    }

    /**
     * Sets the value of the collDlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralDeliveryMethod1Code }
     *     
     */
    public void setCollDlvryMtd(CollateralDeliveryMethod1Code value) {
        this.collDlvryMtd = value;
    }

    /**
     * Gets the value of the outsdngMrgnLnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOutsdngMrgnLnAmt() {
        return outsdngMrgnLnAmt;
    }

    /**
     * Sets the value of the outsdngMrgnLnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOutsdngMrgnLnAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.outsdngMrgnLnAmt = value;
    }

    /**
     * Gets the value of the shrtMktValAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getShrtMktValAmt() {
        return shrtMktValAmt;
    }

    /**
     * Sets the value of the shrtMktValAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setShrtMktValAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.shrtMktValAmt = value;
    }

    /**
     * Gets the value of the mrgnLnAttr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrgnLnAttr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrgnLnAttr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestRate6 }
     * 
     * 
     * @return
     *     The value of the mrgnLnAttr property.
     */
    public List<InterestRate6> getMrgnLnAttr() {
        if (mrgnLnAttr == null) {
            mrgnLnAttr = new ArrayList<>();
        }
        return this.mrgnLnAttr;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

}
