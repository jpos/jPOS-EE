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

package org.jpos.iso20022.camt_005_001_10;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LongPaymentIdentification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LongPaymentIdentification3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" minOccurs="0"/>
 *         <element name="UETR" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="IntrBkSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ImpliedCurrencyAndAmount"/>
 *         <element name="IntrBkSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}ISODate"/>
 *         <element name="PmtMtd" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentOrigin1Choice" minOccurs="0"/>
 *         <element name="InstgAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="InstdAgt" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}BranchAndFinancialInstitutionIdentification6"/>
 *         <element name="NtryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}EntryTypeIdentifier" minOccurs="0"/>
 *         <element name="EndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LongPaymentIdentification3", propOrder = {
    "txId",
    "uetr",
    "intrBkSttlmAmt",
    "intrBkSttlmDt",
    "pmtMtd",
    "instgAgt",
    "instdAgt",
    "ntryTp",
    "endToEndId"
})
public class LongPaymentIdentification3 {

    @XmlElement(name = "TxId")
    protected String txId;
    @XmlElement(name = "UETR")
    protected String uetr;
    @XmlElement(name = "IntrBkSttlmAmt", required = true)
    protected BigDecimal intrBkSttlmAmt;
    @XmlElement(name = "IntrBkSttlmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar intrBkSttlmDt;
    @XmlElement(name = "PmtMtd")
    protected PaymentOrigin1Choice pmtMtd;
    @XmlElement(name = "InstgAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 instgAgt;
    @XmlElement(name = "InstdAgt", required = true)
    protected BranchAndFinancialInstitutionIdentification6 instdAgt;
    @XmlElement(name = "NtryTp")
    protected String ntryTp;
    @XmlElement(name = "EndToEndId")
    protected String endToEndId;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxId(String value) {
        this.txId = value;
    }

    /**
     * Gets the value of the uetr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUETR() {
        return uetr;
    }

    /**
     * Sets the value of the uetr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUETR(String value) {
        this.uetr = value;
    }

    /**
     * Gets the value of the intrBkSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntrBkSttlmAmt() {
        return intrBkSttlmAmt;
    }

    /**
     * Sets the value of the intrBkSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntrBkSttlmAmt(BigDecimal value) {
        this.intrBkSttlmAmt = value;
    }

    /**
     * Gets the value of the intrBkSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIntrBkSttlmDt() {
        return intrBkSttlmDt;
    }

    /**
     * Sets the value of the intrBkSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIntrBkSttlmDt(XMLGregorianCalendar value) {
        this.intrBkSttlmDt = value;
    }

    /**
     * Gets the value of the pmtMtd property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public PaymentOrigin1Choice getPmtMtd() {
        return pmtMtd;
    }

    /**
     * Sets the value of the pmtMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrigin1Choice }
     *     
     */
    public void setPmtMtd(PaymentOrigin1Choice value) {
        this.pmtMtd = value;
    }

    /**
     * Gets the value of the instgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstgAgt() {
        return instgAgt;
    }

    /**
     * Sets the value of the instgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instgAgt = value;
    }

    /**
     * Gets the value of the instdAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getInstdAgt() {
        return instdAgt;
    }

    /**
     * Sets the value of the instdAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setInstdAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.instdAgt = value;
    }

    /**
     * Gets the value of the ntryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtryTp() {
        return ntryTp;
    }

    /**
     * Sets the value of the ntryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtryTp(String value) {
        this.ntryTp = value;
    }

    /**
     * Gets the value of the endToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndToEndId() {
        return endToEndId;
    }

    /**
     * Sets the value of the endToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndToEndId(String value) {
        this.endToEndId = value;
    }

}
