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

package org.jpos.iso20022.seev_053_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashOption76 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashOption76">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}CreditDebitCode"/>
 *         <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="GrssCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetCshAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EntitldAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="WhldgTaxRate" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}RateAndAmountFormat40Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WhldgTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="EarlstPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:seev.053.001.01}DateFormat43Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashOption76", propOrder = {
    "cdtDbtInd",
    "cshAcctId",
    "grssCshAmt",
    "netCshAmt",
    "entitldAmt",
    "whldgTaxRate",
    "whldgTaxAmt",
    "earlstPmtDt",
    "pmtDt"
})
public class CashOption76 {

    @XmlElement(name = "CdtDbtInd", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "CshAcctId")
    protected CashAccountIdentification5Choice cshAcctId;
    @XmlElement(name = "GrssCshAmt")
    protected ActiveCurrencyAndAmount grssCshAmt;
    @XmlElement(name = "NetCshAmt")
    protected ActiveCurrencyAndAmount netCshAmt;
    @XmlElement(name = "EntitldAmt")
    protected ActiveCurrencyAndAmount entitldAmt;
    @XmlElement(name = "WhldgTaxRate")
    protected List<RateAndAmountFormat40Choice> whldgTaxRate;
    @XmlElement(name = "WhldgTaxAmt")
    protected ActiveCurrencyAndAmount whldgTaxAmt;
    @XmlElement(name = "EarlstPmtDt")
    protected DateAndDateTime2Choice earlstPmtDt;
    @XmlElement(name = "PmtDt", required = true)
    protected DateFormat43Choice pmtDt;

    /**
     * Gets the value of the cdtDbtInd property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebitCode }
     *     
     */
    public CreditDebitCode getCdtDbtInd() {
        return cdtDbtInd;
    }

    /**
     * Sets the value of the cdtDbtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebitCode }
     *     
     */
    public void setCdtDbtInd(CreditDebitCode value) {
        this.cdtDbtInd = value;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcctId(CashAccountIdentification5Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Gets the value of the grssCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getGrssCshAmt() {
        return grssCshAmt;
    }

    /**
     * Sets the value of the grssCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setGrssCshAmt(ActiveCurrencyAndAmount value) {
        this.grssCshAmt = value;
    }

    /**
     * Gets the value of the netCshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetCshAmt() {
        return netCshAmt;
    }

    /**
     * Sets the value of the netCshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetCshAmt(ActiveCurrencyAndAmount value) {
        this.netCshAmt = value;
    }

    /**
     * Gets the value of the entitldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getEntitldAmt() {
        return entitldAmt;
    }

    /**
     * Sets the value of the entitldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setEntitldAmt(ActiveCurrencyAndAmount value) {
        this.entitldAmt = value;
    }

    /**
     * Gets the value of the whldgTaxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the whldgTaxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWhldgTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateAndAmountFormat40Choice }
     * 
     * 
     * @return
     *     The value of the whldgTaxRate property.
     */
    public List<RateAndAmountFormat40Choice> getWhldgTaxRate() {
        if (whldgTaxRate == null) {
            whldgTaxRate = new ArrayList<>();
        }
        return this.whldgTaxRate;
    }

    /**
     * Gets the value of the whldgTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getWhldgTaxAmt() {
        return whldgTaxAmt;
    }

    /**
     * Sets the value of the whldgTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setWhldgTaxAmt(ActiveCurrencyAndAmount value) {
        this.whldgTaxAmt = value;
    }

    /**
     * Gets the value of the earlstPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getEarlstPmtDt() {
        return earlstPmtDt;
    }

    /**
     * Sets the value of the earlstPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setEarlstPmtDt(DateAndDateTime2Choice value) {
        this.earlstPmtDt = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setPmtDt(DateFormat43Choice value) {
        this.pmtDt = value;
    }

}
