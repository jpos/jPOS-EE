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

package org.jpos.iso20022.tsin_001_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceRequestInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceRequestInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvcGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}DocumentGeneralInformation1"/>
 *         <element name="InvcTtlsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}InvoiceTotals1"/>
 *         <element name="CdtDbtNoteAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InstlmtInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}Instalment1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ReqdAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}FinancingRateOrAmountChoice" minOccurs="0"/>
 *         <element name="Spplr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PartyAndAccountIdentificationAndContactInformation1"/>
 *         <element name="Buyr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PartyIdentificationAndContactInformation1"/>
 *         <element name="InvcPmtInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}PaymentInformation15"/>
 *         <element name="RfrdDoc" type="{urn:iso:std:iso:20022:tech:xsd:tsin.001.001.01}ReferredDocumentInformation2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceRequestInformation1", propOrder = {
    "invcGnlInf",
    "invcTtlsInf",
    "cdtDbtNoteAmt",
    "instlmtInf",
    "reqdAmt",
    "spplr",
    "buyr",
    "invcPmtInf",
    "rfrdDoc"
})
public class InvoiceRequestInformation1 {

    @XmlElement(name = "InvcGnlInf", required = true)
    protected DocumentGeneralInformation1 invcGnlInf;
    @XmlElement(name = "InvcTtlsInf", required = true)
    protected InvoiceTotals1 invcTtlsInf;
    @XmlElement(name = "CdtDbtNoteAmt")
    protected ActiveCurrencyAndAmount cdtDbtNoteAmt;
    @XmlElement(name = "InstlmtInf")
    protected List<Instalment1> instlmtInf;
    @XmlElement(name = "ReqdAmt")
    protected FinancingRateOrAmountChoice reqdAmt;
    @XmlElement(name = "Spplr", required = true)
    protected PartyAndAccountIdentificationAndContactInformation1 spplr;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentificationAndContactInformation1 buyr;
    @XmlElement(name = "InvcPmtInf", required = true)
    protected PaymentInformation15 invcPmtInf;
    @XmlElement(name = "RfrdDoc")
    protected List<ReferredDocumentInformation2> rfrdDoc;

    /**
     * Gets the value of the invcGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentGeneralInformation1 }
     *     
     */
    public DocumentGeneralInformation1 getInvcGnlInf() {
        return invcGnlInf;
    }

    /**
     * Sets the value of the invcGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentGeneralInformation1 }
     *     
     */
    public void setInvcGnlInf(DocumentGeneralInformation1 value) {
        this.invcGnlInf = value;
    }

    /**
     * Gets the value of the invcTtlsInf property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public InvoiceTotals1 getInvcTtlsInf() {
        return invcTtlsInf;
    }

    /**
     * Sets the value of the invcTtlsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTotals1 }
     *     
     */
    public void setInvcTtlsInf(InvoiceTotals1 value) {
        this.invcTtlsInf = value;
    }

    /**
     * Gets the value of the cdtDbtNoteAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCdtDbtNoteAmt() {
        return cdtDbtNoteAmt;
    }

    /**
     * Sets the value of the cdtDbtNoteAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCdtDbtNoteAmt(ActiveCurrencyAndAmount value) {
        this.cdtDbtNoteAmt = value;
    }

    /**
     * Gets the value of the instlmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instlmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstlmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instalment1 }
     * 
     * 
     * @return
     *     The value of the instlmtInf property.
     */
    public List<Instalment1> getInstlmtInf() {
        if (instlmtInf == null) {
            instlmtInf = new ArrayList<>();
        }
        return this.instlmtInf;
    }

    /**
     * Gets the value of the reqdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public FinancingRateOrAmountChoice getReqdAmt() {
        return reqdAmt;
    }

    /**
     * Sets the value of the reqdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingRateOrAmountChoice }
     *     
     */
    public void setReqdAmt(FinancingRateOrAmountChoice value) {
        this.reqdAmt = value;
    }

    /**
     * Gets the value of the spplr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndAccountIdentificationAndContactInformation1 }
     *     
     */
    public PartyAndAccountIdentificationAndContactInformation1 getSpplr() {
        return spplr;
    }

    /**
     * Sets the value of the spplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndAccountIdentificationAndContactInformation1 }
     *     
     */
    public void setSpplr(PartyAndAccountIdentificationAndContactInformation1 value) {
        this.spplr = value;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndContactInformation1 }
     *     
     */
    public PartyIdentificationAndContactInformation1 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndContactInformation1 }
     *     
     */
    public void setBuyr(PartyIdentificationAndContactInformation1 value) {
        this.buyr = value;
    }

    /**
     * Gets the value of the invcPmtInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInformation15 }
     *     
     */
    public PaymentInformation15 getInvcPmtInf() {
        return invcPmtInf;
    }

    /**
     * Sets the value of the invcPmtInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInformation15 }
     *     
     */
    public void setInvcPmtInf(PaymentInformation15 value) {
        this.invcPmtInf = value;
    }

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rfrdDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRfrdDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferredDocumentInformation2 }
     * 
     * 
     * @return
     *     The value of the rfrdDoc property.
     */
    public List<ReferredDocumentInformation2> getRfrdDoc() {
        if (rfrdDoc == null) {
            rfrdDoc = new ArrayList<>();
        }
        return this.rfrdDoc;
    }

}
