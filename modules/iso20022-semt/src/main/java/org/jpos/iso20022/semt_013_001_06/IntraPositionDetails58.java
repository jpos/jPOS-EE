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

package org.jpos.iso20022.semt_013_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionDetails58 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionDetails58">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prty" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}PriorityNumeric4Choice" minOccurs="0"/>
 *         <element name="SttlmQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}FinancialInstrumentQuantity33Choice"/>
 *         <element name="SctiesSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}GenericIdentification37" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}DateAndDateTime2Choice"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}SecuritiesSubBalanceTypeAndQuantityBreakdown5"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}SecuritiesSubBalanceTypeAndQuantityBreakdown5"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.013.001.06}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails58", propOrder = {
    "prty",
    "sttlmQty",
    "sctiesSubBalId",
    "sttlmDt",
    "balFr",
    "balTo",
    "instrPrcgAddtlDtls"
})
public class IntraPositionDetails58 {

    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice prty;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity33Choice sttlmQty;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification37 sctiesSubBalId;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown5 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown5 balTo;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public PriorityNumeric4Choice getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice }
     *     
     */
    public void setPrty(PriorityNumeric4Choice value) {
        this.prty = value;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setSttlmQty(FinancialInstrumentQuantity33Choice value) {
        this.sttlmQty = value;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification37 }
     *     
     */
    public GenericIdentification37 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification37 }
     *     
     */
    public void setSctiesSubBalId(GenericIdentification37 value) {
        this.sctiesSubBalId = value;
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
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown5 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown5 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown5 }
     *     
     */
    public void setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown5 value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown5 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown5 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown5 }
     *     
     */
    public void setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown5 value) {
        this.balTo = value;
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
