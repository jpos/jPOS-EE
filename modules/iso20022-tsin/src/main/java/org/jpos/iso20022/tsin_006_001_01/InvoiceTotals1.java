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

package org.jpos.iso20022.tsin_006_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTotals1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceTotals1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlTaxblAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="TtlTaxAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="Adjstmnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01}Adjustment5" minOccurs="0"/>
 *         <element name="TtlInvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="PmtDueDt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.006.001.01}ISODate"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTotals1", propOrder = {
    "ttlTaxblAmt",
    "ttlTaxAmt",
    "adjstmnt",
    "ttlInvcAmt",
    "pmtDueDt"
})
public class InvoiceTotals1 {

    @XmlElement(name = "TtlTaxblAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxblAmt;
    @XmlElement(name = "TtlTaxAmt", required = true)
    protected ActiveCurrencyAndAmount ttlTaxAmt;
    @XmlElement(name = "Adjstmnt")
    protected Adjustment5 adjstmnt;
    @XmlElement(name = "TtlInvcAmt", required = true)
    protected ActiveCurrencyAndAmount ttlInvcAmt;
    @XmlElement(name = "PmtDueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDueDt;

    /**
     * Gets the value of the ttlTaxblAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxblAmt() {
        return ttlTaxblAmt;
    }

    /**
     * Sets the value of the ttlTaxblAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTaxblAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxblAmt = value;
    }

    /**
     * Gets the value of the ttlTaxAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlTaxAmt() {
        return ttlTaxAmt;
    }

    /**
     * Sets the value of the ttlTaxAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlTaxAmt(ActiveCurrencyAndAmount value) {
        this.ttlTaxAmt = value;
    }

    /**
     * Gets the value of the adjstmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Adjustment5 }
     *     
     */
    public Adjustment5 getAdjstmnt() {
        return adjstmnt;
    }

    /**
     * Sets the value of the adjstmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adjustment5 }
     *     
     */
    public void setAdjstmnt(Adjustment5 value) {
        this.adjstmnt = value;
    }

    /**
     * Gets the value of the ttlInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlInvcAmt() {
        return ttlInvcAmt;
    }

    /**
     * Sets the value of the ttlInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlInvcAmt = value;
    }

    /**
     * Gets the value of the pmtDueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDueDt() {
        return pmtDueDt;
    }

    /**
     * Sets the value of the pmtDueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDueDt(XMLGregorianCalendar value) {
        this.pmtDueDt = value;
    }

}
