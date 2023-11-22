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

package org.jpos.iso20022.sese_011_001_09;

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
 * <p>Java class for BenefitCrystallisationEvent2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BenefitCrystallisationEvent2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtTpNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max35Text" minOccurs="0"/>
 *         <element name="EvtTpNm" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}Max35Text" minOccurs="0"/>
 *         <element name="EvtDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="CrstllstnAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="PctgOfAllwnc" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PercentageRate" minOccurs="0"/>
 *         <element name="LftmAllwncPrtcn" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefitCrystallisationEvent2", propOrder = {
    "evtTpNb",
    "evtTpNm",
    "evtDt",
    "crstllstnAmt",
    "pctgOfAllwnc",
    "lftmAllwncPrtcn",
    "addtlInf"
})
public class BenefitCrystallisationEvent2 {

    @XmlElement(name = "EvtTpNb")
    protected String evtTpNb;
    @XmlElement(name = "EvtTpNm")
    protected String evtTpNm;
    @XmlElement(name = "EvtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "CrstllstnAmt")
    protected ActiveCurrencyAnd13DecimalAmount crstllstnAmt;
    @XmlElement(name = "PctgOfAllwnc")
    protected BigDecimal pctgOfAllwnc;
    @XmlElement(name = "LftmAllwncPrtcn")
    protected Boolean lftmAllwncPrtcn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the evtTpNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtTpNb() {
        return evtTpNb;
    }

    /**
     * Sets the value of the evtTpNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtTpNb(String value) {
        this.evtTpNb = value;
    }

    /**
     * Gets the value of the evtTpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtTpNm() {
        return evtTpNm;
    }

    /**
     * Sets the value of the evtTpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtTpNm(String value) {
        this.evtTpNm = value;
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
     * Gets the value of the crstllstnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCrstllstnAmt() {
        return crstllstnAmt;
    }

    /**
     * Sets the value of the crstllstnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCrstllstnAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.crstllstnAmt = value;
    }

    /**
     * Gets the value of the pctgOfAllwnc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPctgOfAllwnc() {
        return pctgOfAllwnc;
    }

    /**
     * Sets the value of the pctgOfAllwnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPctgOfAllwnc(BigDecimal value) {
        this.pctgOfAllwnc = value;
    }

    /**
     * Gets the value of the lftmAllwncPrtcn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLftmAllwncPrtcn() {
        return lftmAllwncPrtcn;
    }

    /**
     * Sets the value of the lftmAllwncPrtcn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLftmAllwncPrtcn(Boolean value) {
        this.lftmAllwncPrtcn = value;
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
