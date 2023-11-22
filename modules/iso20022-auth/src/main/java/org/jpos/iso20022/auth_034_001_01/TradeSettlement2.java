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

package org.jpos.iso20022.auth_034_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeSettlement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeSettlement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtRef" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CreditorReferenceInformation2" minOccurs="0"/>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ISODate" minOccurs="0"/>
 *         <element name="DuePyblAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount"/>
 *         <element name="InvcCcyXchg" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyReference3" minOccurs="0"/>
 *         <element name="DlvryDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}ISODate" minOccurs="0"/>
 *         <element name="BllgPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Period2" minOccurs="0"/>
 *         <element name="TaxTtlAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}CurrencyAndAmount"/>
 *         <element name="XmptnRsnCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max4Text" minOccurs="0"/>
 *         <element name="XmptnRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}Max500Text" minOccurs="0"/>
 *         <element name="SubTtlClctdTax" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}SettlementSubTotalCalculatedTax2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="EarlyPmts" type="{urn:iso:std:iso:20022:tech:xsd:auth.034.001.01}EarlyPayment1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeSettlement2", propOrder = {
    "pmtRef",
    "dueDt",
    "duePyblAmt",
    "invcCcyXchg",
    "dlvryDt",
    "bllgPrd",
    "taxTtlAmt",
    "xmptnRsnCd",
    "xmptnRsn",
    "subTtlClctdTax",
    "earlyPmts"
})
public class TradeSettlement2 {

    @XmlElement(name = "PmtRef")
    protected CreditorReferenceInformation2 pmtRef;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "DuePyblAmt", required = true)
    protected CurrencyAndAmount duePyblAmt;
    @XmlElement(name = "InvcCcyXchg")
    protected CurrencyReference3 invcCcyXchg;
    @XmlElement(name = "DlvryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dlvryDt;
    @XmlElement(name = "BllgPrd")
    protected Period2 bllgPrd;
    @XmlElement(name = "TaxTtlAmt", required = true)
    protected CurrencyAndAmount taxTtlAmt;
    @XmlElement(name = "XmptnRsnCd")
    protected String xmptnRsnCd;
    @XmlElement(name = "XmptnRsn")
    protected String xmptnRsn;
    @XmlElement(name = "SubTtlClctdTax")
    protected List<SettlementSubTotalCalculatedTax2> subTtlClctdTax;
    @XmlElement(name = "EarlyPmts")
    protected List<EarlyPayment1> earlyPmts;

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public CreditorReferenceInformation2 getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditorReferenceInformation2 }
     *     
     */
    public void setPmtRef(CreditorReferenceInformation2 value) {
        this.pmtRef = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the duePyblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getDuePyblAmt() {
        return duePyblAmt;
    }

    /**
     * Sets the value of the duePyblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setDuePyblAmt(CurrencyAndAmount value) {
        this.duePyblAmt = value;
    }

    /**
     * Gets the value of the invcCcyXchg property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyReference3 }
     *     
     */
    public CurrencyReference3 getInvcCcyXchg() {
        return invcCcyXchg;
    }

    /**
     * Sets the value of the invcCcyXchg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyReference3 }
     *     
     */
    public void setInvcCcyXchg(CurrencyReference3 value) {
        this.invcCcyXchg = value;
    }

    /**
     * Gets the value of the dlvryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDlvryDt() {
        return dlvryDt;
    }

    /**
     * Sets the value of the dlvryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDlvryDt(XMLGregorianCalendar value) {
        this.dlvryDt = value;
    }

    /**
     * Gets the value of the bllgPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period2 }
     *     
     */
    public Period2 getBllgPrd() {
        return bllgPrd;
    }

    /**
     * Sets the value of the bllgPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period2 }
     *     
     */
    public void setBllgPrd(Period2 value) {
        this.bllgPrd = value;
    }

    /**
     * Gets the value of the taxTtlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public CurrencyAndAmount getTaxTtlAmt() {
        return taxTtlAmt;
    }

    /**
     * Sets the value of the taxTtlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAndAmount }
     *     
     */
    public void setTaxTtlAmt(CurrencyAndAmount value) {
        this.taxTtlAmt = value;
    }

    /**
     * Gets the value of the xmptnRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsnCd() {
        return xmptnRsnCd;
    }

    /**
     * Sets the value of the xmptnRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmptnRsnCd(String value) {
        this.xmptnRsnCd = value;
    }

    /**
     * Gets the value of the xmptnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmptnRsn() {
        return xmptnRsn;
    }

    /**
     * Sets the value of the xmptnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmptnRsn(String value) {
        this.xmptnRsn = value;
    }

    /**
     * Gets the value of the subTtlClctdTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the subTtlClctdTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubTtlClctdTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementSubTotalCalculatedTax2 }
     * 
     * 
     * @return
     *     The value of the subTtlClctdTax property.
     */
    public List<SettlementSubTotalCalculatedTax2> getSubTtlClctdTax() {
        if (subTtlClctdTax == null) {
            subTtlClctdTax = new ArrayList<>();
        }
        return this.subTtlClctdTax;
    }

    /**
     * Gets the value of the earlyPmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the earlyPmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEarlyPmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EarlyPayment1 }
     * 
     * 
     * @return
     *     The value of the earlyPmts property.
     */
    public List<EarlyPayment1> getEarlyPmts() {
        if (earlyPmts == null) {
            earlyPmts = new ArrayList<>();
        }
        return this.earlyPmts;
    }

}
