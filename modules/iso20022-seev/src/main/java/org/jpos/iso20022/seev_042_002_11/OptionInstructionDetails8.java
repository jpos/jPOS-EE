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

package org.jpos.iso20022.seev_042_002_11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OptionInstructionDetails8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OptionInstructionDetails8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}RestrictedFINMax15Text"/>
 *         <element name="InstrSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}Max3NumericText" minOccurs="0"/>
 *         <element name="PrtctInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}ProtectTransactionType2Code" minOccurs="0"/>
 *         <element name="InstrQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}FinancialInstrumentQuantity36Choice"/>
 *         <element name="InstrDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}ISODate"/>
 *         <element name="PrtctDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}ISODate" minOccurs="0"/>
 *         <element name="CoverPrtctDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}ISODate" minOccurs="0"/>
 *         <element name="BidPric" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}PriceFormat57Choice" minOccurs="0"/>
 *         <element name="CondlQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="CstmrRef" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}RestrictedFINMax50Text" minOccurs="0"/>
 *         <element name="InstrNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}RestrictedFINXMax350Text" minOccurs="0"/>
 *         <element name="InstrSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}InstructionProcessingStatus48Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionInstructionDetails8", propOrder = {
    "instrId",
    "instrSeqNb",
    "prtctInd",
    "instrQty",
    "instrDt",
    "prtctDt",
    "coverPrtctDt",
    "bidPric",
    "condlQty",
    "cstmrRef",
    "instrNrrtv",
    "instrSts"
})
public class OptionInstructionDetails8 {

    @XmlElement(name = "InstrId", required = true)
    protected String instrId;
    @XmlElement(name = "InstrSeqNb")
    protected String instrSeqNb;
    @XmlElement(name = "PrtctInd")
    @XmlSchemaType(name = "string")
    protected ProtectTransactionType2Code prtctInd;
    @XmlElement(name = "InstrQty", required = true)
    protected FinancialInstrumentQuantity36Choice instrQty;
    @XmlElement(name = "InstrDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar instrDt;
    @XmlElement(name = "PrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prtctDt;
    @XmlElement(name = "CoverPrtctDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar coverPrtctDt;
    @XmlElement(name = "BidPric")
    protected PriceFormat57Choice bidPric;
    @XmlElement(name = "CondlQty")
    protected FinancialInstrumentQuantity36Choice condlQty;
    @XmlElement(name = "CstmrRef")
    protected String cstmrRef;
    @XmlElement(name = "InstrNrrtv")
    protected String instrNrrtv;
    @XmlElement(name = "InstrSts", required = true)
    protected InstructionProcessingStatus48Choice instrSts;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrId(String value) {
        this.instrId = value;
    }

    /**
     * Gets the value of the instrSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrSeqNb() {
        return instrSeqNb;
    }

    /**
     * Sets the value of the instrSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrSeqNb(String value) {
        this.instrSeqNb = value;
    }

    /**
     * Gets the value of the prtctInd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public ProtectTransactionType2Code getPrtctInd() {
        return prtctInd;
    }

    /**
     * Sets the value of the prtctInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectTransactionType2Code }
     *     
     */
    public void setPrtctInd(ProtectTransactionType2Code value) {
        this.prtctInd = value;
    }

    /**
     * Gets the value of the instrQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getInstrQty() {
        return instrQty;
    }

    /**
     * Sets the value of the instrQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setInstrQty(FinancialInstrumentQuantity36Choice value) {
        this.instrQty = value;
    }

    /**
     * Gets the value of the instrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInstrDt() {
        return instrDt;
    }

    /**
     * Sets the value of the instrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInstrDt(XMLGregorianCalendar value) {
        this.instrDt = value;
    }

    /**
     * Gets the value of the prtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrtctDt() {
        return prtctDt;
    }

    /**
     * Sets the value of the prtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrtctDt(XMLGregorianCalendar value) {
        this.prtctDt = value;
    }

    /**
     * Gets the value of the coverPrtctDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverPrtctDt() {
        return coverPrtctDt;
    }

    /**
     * Sets the value of the coverPrtctDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverPrtctDt(XMLGregorianCalendar value) {
        this.coverPrtctDt = value;
    }

    /**
     * Gets the value of the bidPric property.
     * 
     * @return
     *     possible object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public PriceFormat57Choice getBidPric() {
        return bidPric;
    }

    /**
     * Sets the value of the bidPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceFormat57Choice }
     *     
     */
    public void setBidPric(PriceFormat57Choice value) {
        this.bidPric = value;
    }

    /**
     * Gets the value of the condlQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getCondlQty() {
        return condlQty;
    }

    /**
     * Sets the value of the condlQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setCondlQty(FinancialInstrumentQuantity36Choice value) {
        this.condlQty = value;
    }

    /**
     * Gets the value of the cstmrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRef() {
        return cstmrRef;
    }

    /**
     * Sets the value of the cstmrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrRef(String value) {
        this.cstmrRef = value;
    }

    /**
     * Gets the value of the instrNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrNrrtv() {
        return instrNrrtv;
    }

    /**
     * Sets the value of the instrNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrNrrtv(String value) {
        this.instrNrrtv = value;
    }

    /**
     * Gets the value of the instrSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus48Choice }
     *     
     */
    public InstructionProcessingStatus48Choice getInstrSts() {
        return instrSts;
    }

    /**
     * Sets the value of the instrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus48Choice }
     *     
     */
    public void setInstrSts(InstructionProcessingStatus48Choice value) {
        this.instrSts = value;
    }

}
