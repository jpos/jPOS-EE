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

package org.jpos.iso20022.camt_051_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LiquidityDebitTransfer2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LiquidityDebitTransfer2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="LqdtyTrfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}PaymentIdentification8" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}CashAccount38" minOccurs="0"/>
 *         <element name="TrfdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}Amount2Choice"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}CashAccount38" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.051.001.05}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityDebitTransfer2", propOrder = {
    "lqdtyTrfId",
    "cdtr",
    "cdtrAcct",
    "trfdAmt",
    "dbtr",
    "dbtrAcct",
    "sttlmDt"
})
public class LiquidityDebitTransfer2 {

    @XmlElement(name = "LqdtyTrfId")
    protected PaymentIdentification8 lqdtyTrfId;
    @XmlElement(name = "Cdtr")
    protected BranchAndFinancialInstitutionIdentification6 cdtr;
    @XmlElement(name = "CdtrAcct")
    protected CashAccount38 cdtrAcct;
    @XmlElement(name = "TrfdAmt", required = true)
    protected Amount2Choice trfdAmt;
    @XmlElement(name = "Dbtr")
    protected BranchAndFinancialInstitutionIdentification6 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected CashAccount38 dbtrAcct;
    @XmlElement(name = "SttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sttlmDt;

    /**
     * Gets the value of the lqdtyTrfId property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public PaymentIdentification8 getLqdtyTrfId() {
        return lqdtyTrfId;
    }

    /**
     * Sets the value of the lqdtyTrfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentification8 }
     *     
     */
    public void setLqdtyTrfId(PaymentIdentification8 value) {
        this.lqdtyTrfId = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setCdtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setCdtrAcct(CashAccount38 value) {
        this.cdtrAcct = value;
    }

    /**
     * Gets the value of the trfdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getTrfdAmt() {
        return trfdAmt;
    }

    /**
     * Sets the value of the trfdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setTrfdAmt(Amount2Choice value) {
        this.trfdAmt = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setDbtr(BranchAndFinancialInstitutionIdentification6 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount38 }
     *     
     */
    public CashAccount38 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount38 }
     *     
     */
    public void setDbtrAcct(CashAccount38 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSttlmDt(XMLGregorianCalendar value) {
        this.sttlmDt = value;
    }

}
