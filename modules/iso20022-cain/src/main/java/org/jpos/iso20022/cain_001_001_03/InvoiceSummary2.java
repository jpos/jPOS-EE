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

package org.jpos.iso20022.cain_001_001_03;

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
 * <p>Java class for InvoiceSummary2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceSummary2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="Sellr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PartyIdentification259" minOccurs="0"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PartyIdentification259" minOccurs="0"/>
 *         <element name="InvcDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODate" minOccurs="0"/>
 *         <element name="InvcCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="FrghtAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TaxTtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TaxRclmMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TaxReclaimMethod1Code" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceSummary2", propOrder = {
    "invcNb",
    "sellr",
    "buyr",
    "invcDt",
    "invcCreDtTm",
    "summryCmmdtyId",
    "frghtAmt",
    "taxTtl",
    "taxRclmMtd",
    "addtlData"
})
public class InvoiceSummary2 {

    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "Sellr")
    protected PartyIdentification259 sellr;
    @XmlElement(name = "Buyr")
    protected PartyIdentification259 buyr;
    @XmlElement(name = "InvcDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invcDt;
    @XmlElement(name = "InvcCreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invcCreDtTm;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "FrghtAmt")
    protected BigDecimal frghtAmt;
    @XmlElement(name = "TaxTtl")
    protected List<Tax39> taxTtl;
    @XmlElement(name = "TaxRclmMtd")
    @XmlSchemaType(name = "string")
    protected TaxReclaimMethod1Code taxRclmMtd;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcNb(String value) {
        this.invcNb = value;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification259 }
     *     
     */
    public PartyIdentification259 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification259 }
     *     
     */
    public void setSellr(PartyIdentification259 value) {
        this.sellr = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification259 }
     *     
     */
    public PartyIdentification259 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification259 }
     *     
     */
    public void setBuyr(PartyIdentification259 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the invcDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvcDt() {
        return invcDt;
    }

    /**
     * Sets the value of the invcDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvcDt(XMLGregorianCalendar value) {
        this.invcDt = value;
    }

    /**
     * Gets the value of the invcCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvcCreDtTm() {
        return invcCreDtTm;
    }

    /**
     * Sets the value of the invcCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvcCreDtTm(XMLGregorianCalendar value) {
        this.invcCreDtTm = value;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the frghtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrghtAmt() {
        return frghtAmt;
    }

    /**
     * Sets the value of the frghtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrghtAmt(BigDecimal value) {
        this.frghtAmt = value;
    }

    /**
     * Gets the value of the taxTtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxTtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxTtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the taxTtl property.
     */
    public List<Tax39> getTaxTtl() {
        if (taxTtl == null) {
            taxTtl = new ArrayList<>();
        }
        return this.taxTtl;
    }

    /**
     * Gets the value of the taxRclmMtd property.
     * 
     * @return
     *     possible object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public TaxReclaimMethod1Code getTaxRclmMtd() {
        return taxRclmMtd;
    }

    /**
     * Sets the value of the taxRclmMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxReclaimMethod1Code }
     *     
     */
    public void setTaxRclmMtd(TaxReclaimMethod1Code value) {
        this.taxRclmMtd = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
