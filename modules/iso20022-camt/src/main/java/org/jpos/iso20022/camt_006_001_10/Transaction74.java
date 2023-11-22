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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transaction74 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transaction74">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}System2" minOccurs="0"/>
 *         <element name="PmtFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}System2" minOccurs="0"/>
 *         <element name="CdtDbtInd" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CreditDebitCode" minOccurs="0"/>
 *         <element name="Pmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentInstruction32" minOccurs="0"/>
 *         <element name="AcctNtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}CashAccountAndEntry4" minOccurs="0"/>
 *         <element name="SctiesTxRefs" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}SecuritiesTransactionReferences1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transaction74", propOrder = {
    "pmtTo",
    "pmtFr",
    "cdtDbtInd",
    "pmt",
    "acctNtry",
    "sctiesTxRefs"
})
public class Transaction74 {

    @XmlElement(name = "PmtTo")
    protected System2 pmtTo;
    @XmlElement(name = "PmtFr")
    protected System2 pmtFr;
    @XmlElement(name = "CdtDbtInd")
    @XmlSchemaType(name = "string")
    protected CreditDebitCode cdtDbtInd;
    @XmlElement(name = "Pmt")
    protected PaymentInstruction32 pmt;
    @XmlElement(name = "AcctNtry")
    protected CashAccountAndEntry4 acctNtry;
    @XmlElement(name = "SctiesTxRefs")
    protected SecuritiesTransactionReferences1 sctiesTxRefs;

    /**
     * Gets the value of the pmtTo property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtTo() {
        return pmtTo;
    }

    /**
     * Sets the value of the pmtTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public void setPmtTo(System2 value) {
        this.pmtTo = value;
    }

    /**
     * Gets the value of the pmtFr property.
     * 
     * @return
     *     possible object is
     *     {@link System2 }
     *     
     */
    public System2 getPmtFr() {
        return pmtFr;
    }

    /**
     * Sets the value of the pmtFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link System2 }
     *     
     */
    public void setPmtFr(System2 value) {
        this.pmtFr = value;
    }

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
     * Gets the value of the pmt property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstruction32 }
     *     
     */
    public PaymentInstruction32 getPmt() {
        return pmt;
    }

    /**
     * Sets the value of the pmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstruction32 }
     *     
     */
    public void setPmt(PaymentInstruction32 value) {
        this.pmt = value;
    }

    /**
     * Gets the value of the acctNtry property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountAndEntry4 }
     *     
     */
    public CashAccountAndEntry4 getAcctNtry() {
        return acctNtry;
    }

    /**
     * Sets the value of the acctNtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountAndEntry4 }
     *     
     */
    public void setAcctNtry(CashAccountAndEntry4 value) {
        this.acctNtry = value;
    }

    /**
     * Gets the value of the sctiesTxRefs property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionReferences1 }
     *     
     */
    public SecuritiesTransactionReferences1 getSctiesTxRefs() {
        return sctiesTxRefs;
    }

    /**
     * Sets the value of the sctiesTxRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionReferences1 }
     *     
     */
    public void setSctiesTxRefs(SecuritiesTransactionReferences1 value) {
        this.sctiesTxRefs = value;
    }

}
