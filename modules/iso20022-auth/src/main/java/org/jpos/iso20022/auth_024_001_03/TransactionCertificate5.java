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

package org.jpos.iso20022.auth_024_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCertificate5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCertificate5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RfrdDoc" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}CertificateReference2"/>
 *         <element name="TxDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ISODate"/>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Exact1NumericText" minOccurs="0"/>
 *         <element name="LclInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Exact5NumericText"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificate5", propOrder = {
    "rfrdDoc",
    "txDt",
    "txTp",
    "lclInstrm",
    "amt"
})
public class TransactionCertificate5 {

    @XmlElement(name = "RfrdDoc", required = true)
    protected CertificateReference2 rfrdDoc;
    @XmlElement(name = "TxDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "TxTp")
    protected String txTp;
    @XmlElement(name = "LclInstrm", required = true)
    protected String lclInstrm;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;

    /**
     * Gets the value of the rfrdDoc property.
     * 
     * @return
     *     possible object is
     *     {@link CertificateReference2 }
     *     
     */
    public CertificateReference2 getRfrdDoc() {
        return rfrdDoc;
    }

    /**
     * Sets the value of the rfrdDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateReference2 }
     *     
     */
    public void setRfrdDoc(CertificateReference2 value) {
        this.rfrdDoc = value;
    }

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
    }

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTp(String value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the lclInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLclInstrm() {
        return lclInstrm;
    }

    /**
     * Sets the value of the lclInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLclInstrm(String value) {
        this.lclInstrm = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

}
