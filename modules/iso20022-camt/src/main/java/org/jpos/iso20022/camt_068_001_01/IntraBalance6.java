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

package org.jpos.iso20022.camt_068_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalance6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalance6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="PrevslySttldAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="RmngSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}Amount2Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}DateAndDateTime2Choice"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}CashSubBalanceTypeAndQuantityBreakdown3"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}CashSubBalanceTypeAndQuantityBreakdown3"/>
 *         <element name="CshSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}GenericIdentification37" minOccurs="0"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:camt.068.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalance6", propOrder = {
    "sttldAmt",
    "prevslySttldAmt",
    "rmngSttlmAmt",
    "sttlmDt",
    "balFr",
    "balTo",
    "cshSubBalId",
    "instrPrcgAddtlDtls"
})
public class IntraBalance6 {

    @XmlElement(name = "SttldAmt")
    protected Amount2Choice sttldAmt;
    @XmlElement(name = "PrevslySttldAmt")
    protected Amount2Choice prevslySttldAmt;
    @XmlElement(name = "RmngSttlmAmt")
    protected Amount2Choice rmngSttlmAmt;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "BalFr", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected CashSubBalanceTypeAndQuantityBreakdown3 balTo;
    @XmlElement(name = "CshSubBalId")
    protected GenericIdentification37 cshSubBalId;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getSttldAmt() {
        return sttldAmt;
    }

    /**
     * Sets the value of the sttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setSttldAmt(Amount2Choice value) {
        this.sttldAmt = value;
    }

    /**
     * Gets the value of the prevslySttldAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getPrevslySttldAmt() {
        return prevslySttldAmt;
    }

    /**
     * Sets the value of the prevslySttldAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setPrevslySttldAmt(Amount2Choice value) {
        this.prevslySttldAmt = value;
    }

    /**
     * Gets the value of the rmngSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount2Choice }
     *     
     */
    public Amount2Choice getRmngSttlmAmt() {
        return rmngSttlmAmt;
    }

    /**
     * Sets the value of the rmngSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount2Choice }
     *     
     */
    public void setRmngSttlmAmt(Amount2Choice value) {
        this.rmngSttlmAmt = value;
    }

    /**
     * Gets the value of the sttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getSttlmDt() {
        return sttlmDt;
    }

    /**
     * Sets the value of the sttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setSttlmDt(DateAndDateTime2Choice value) {
        this.sttlmDt = value;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public void setBalFr(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public CashSubBalanceTypeAndQuantityBreakdown3 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashSubBalanceTypeAndQuantityBreakdown3 }
     *     
     */
    public void setBalTo(CashSubBalanceTypeAndQuantityBreakdown3 value) {
        this.balTo = value;
    }

    /**
     * Gets the value of the cshSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getCshSubBalId() {
        return cshSubBalId;
    }

    /**
     * Sets the value of the cshSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setCshSubBalId(GenericIdentification37 value) {
        this.cshSubBalId = value;
    }

    /**
     * Gets the value of the instrPrcgAddtlDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrPrcgAddtlDtls() {
        return instrPrcgAddtlDtls;
    }

    /**
     * Sets the value of the instrPrcgAddtlDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrPrcgAddtlDtls(String value) {
        this.instrPrcgAddtlDtls = value;
    }

}
