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

package org.jpos.iso20022.acmt_028_001_04;

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
 * <p>Java class for TaxInformation10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TaxInformation10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}TaxParty1" minOccurs="0"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}TaxParty2" minOccurs="0"/>
 *         <element name="AdmstnZone" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max140Text" minOccurs="0"/>
 *         <element name="Mtd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="TtlTaxblBaseAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ISODate" minOccurs="0"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Number" minOccurs="0"/>
 *         <element name="Rcrd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}TaxRecord3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxInformation10", propOrder = {
    "cdtr",
    "dbtr",
    "admstnZone",
    "refNb",
    "mtd",
    "ttlTaxblBaseAmt",
    "ttlTaxAmt",
    "dt",
    "seqNb",
    "rcrd"
})
public class TaxInformation10 {

    @XmlElement(name = "Cdtr")
    protected TaxParty1 cdtr;
    @XmlElement(name = "Dbtr")
    protected TaxParty2 dbtr;
    @XmlElement(name = "AdmstnZone")
    protected String admstnZone;
    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "Mtd")
    protected String mtd;
    @XmlElement(name = "TtlTaxblBaseAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxblBaseAmt;
    @XmlElement(name = "TtlTaxAmt")
    protected ActiveOrHistoricCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "Rcrd")
    protected List<TaxRecord3> rcrd;

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty1 }
     *     
     */
    public TaxParty1 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty1 }
     *     
     */
    public void setCdtr(TaxParty1 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link TaxParty2 }
     *     
     */
    public TaxParty2 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxParty2 }
     *     
     */
    public void setDbtr(TaxParty2 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the admstnZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdmstnZone() {
        return admstnZone;
    }

    /**
     * Sets the value of the admstnZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdmstnZone(String value) {
        this.admstnZone = value;
    }

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtd(String value) {
        this.mtd = value;
    }

    /**
     * Gets the value of the ttlTaxblBaseAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxblBaseAmt() {
        return ttlTaxblBaseAmt;
    }

    /**
     * Sets the value of the ttlTaxblBaseAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxblBaseAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxblBaseAmt = value;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setTtlTaxAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the rcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxRecord3 }
     * 
     * 
     * @return
     *     The value of the rcrd property.
     */
    public List<TaxRecord3> getRcrd() {
        if (rcrd == null) {
            rcrd = new ArrayList<>();
        }
        return this.rcrd;
    }

}
