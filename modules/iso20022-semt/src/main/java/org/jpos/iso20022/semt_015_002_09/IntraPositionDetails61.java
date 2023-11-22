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

package org.jpos.iso20022.semt_015_002_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionDetails61 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionDetails61">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}FinancialInstrumentQuantity36Choice"/>
 *         <element name="SctiesSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}GenericIdentification39" minOccurs="0"/>
 *         <element name="CollMntrAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}AmountAndDirection55" minOccurs="0"/>
 *         <element name="PrevslySttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="RmngToBeSttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}FinancialInstrumentQuantity36Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}DateAndDateTime2Choice"/>
 *         <element name="AvlblDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CorpActnEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}CorporateActionEventType101Choice" minOccurs="0"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}SecuritiesSubBalanceTypeAndQuantityBreakdown6"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}SecuritiesSubBalanceTypeAndQuantityBreakdown6"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.002.09}RestrictedFINXMax350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails61", propOrder = {
    "sttldQty",
    "sctiesSubBalId",
    "collMntrAmt",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "sttlmDt",
    "avlblDt",
    "corpActnEvtTp",
    "balFr",
    "balTo",
    "instrPrcgAddtlDtls"
})
public class IntraPositionDetails61 {

    @XmlElement(name = "SttldQty", required = true)
    protected FinancialInstrumentQuantity36Choice sttldQty;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification39 sctiesSubBalId;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection55 collMntrAmt;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity36Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity36Choice rmngToBeSttldQty;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "AvlblDt")
    protected DateAndDateTime2Choice avlblDt;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType101Choice corpActnEvtTp;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown6 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown6 balTo;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setSttldQty(FinancialInstrumentQuantity36Choice value) {
        this.sttldQty = value;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification39 }
     *     
     */
    public GenericIdentification39 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification39 }
     *     
     */
    public void setSctiesSubBalId(GenericIdentification39 value) {
        this.sctiesSubBalId = value;
    }

    /**
     * Gets the value of the collMntrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection55 }
     *     
     */
    public AmountAndDirection55 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Sets the value of the collMntrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection55 }
     *     
     */
    public void setCollMntrAmt(AmountAndDirection55 value) {
        this.collMntrAmt = value;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setPrevslySttldQty(FinancialInstrumentQuantity36Choice value) {
        this.prevslySttldQty = value;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public FinancialInstrumentQuantity36Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity36Choice }
     *     
     */
    public void setRmngToBeSttldQty(FinancialInstrumentQuantity36Choice value) {
        this.rmngToBeSttldQty = value;
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
     * Gets the value of the avlblDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getAvlblDt() {
        return avlblDt;
    }

    /**
     * Sets the value of the avlblDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setAvlblDt(DateAndDateTime2Choice value) {
        this.avlblDt = value;
    }

    /**
     * Gets the value of the corpActnEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventType101Choice }
     *     
     */
    public CorporateActionEventType101Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType101Choice }
     *     
     */
    public void setCorpActnEvtTp(CorporateActionEventType101Choice value) {
        this.corpActnEvtTp = value;
    }

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown6 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown6 getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown6 }
     *     
     */
    public void setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown6 value) {
        this.balFr = value;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown6 }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown6 getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown6 }
     *     
     */
    public void setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown6 value) {
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
