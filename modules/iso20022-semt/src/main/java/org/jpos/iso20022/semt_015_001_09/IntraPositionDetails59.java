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

package org.jpos.iso20022.semt_015_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraPositionDetails59 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraPositionDetails59">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}FinancialInstrumentQuantity33Choice"/>
 *         <element name="SctiesSubBalId" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}GenericIdentification37" minOccurs="0"/>
 *         <element name="CollMntrAmt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}AmountAndDirection44" minOccurs="0"/>
 *         <element name="PrevslySttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="RmngToBeSttldQty" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}FinancialInstrumentQuantity33Choice" minOccurs="0"/>
 *         <element name="SttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}DateAndDateTime2Choice"/>
 *         <element name="AvlblDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="CorpActnEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}CorporateActionEventType88Choice" minOccurs="0"/>
 *         <element name="BalFr" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}SecuritiesSubBalanceTypeAndQuantityBreakdown5"/>
 *         <element name="BalTo" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}SecuritiesSubBalanceTypeAndQuantityBreakdown5"/>
 *         <element name="InstrPrcgAddtlDtls" type="{urn:iso:std:iso:20022:tech:xsd:semt.015.001.09}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionDetails59", propOrder = {
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
public class IntraPositionDetails59 {

    @XmlElement(name = "SttldQty", required = true)
    protected FinancialInstrumentQuantity33Choice sttldQty;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification37 sctiesSubBalId;
    @XmlElement(name = "CollMntrAmt")
    protected AmountAndDirection44 collMntrAmt;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity33Choice prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity33Choice rmngToBeSttldQty;
    @XmlElement(name = "SttlmDt", required = true)
    protected DateAndDateTime2Choice sttlmDt;
    @XmlElement(name = "AvlblDt")
    protected DateAndDateTime2Choice avlblDt;
    @XmlElement(name = "CorpActnEvtTp")
    protected CorporateActionEventType88Choice corpActnEvtTp;
    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown5 balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown5 balTo;
    @XmlElement(name = "InstrPrcgAddtlDtls")
    protected String instrPrcgAddtlDtls;

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setSttldQty(FinancialInstrumentQuantity33Choice value) {
        this.sttldQty = value;
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
     * Gets the value of the collMntrAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public AmountAndDirection44 getCollMntrAmt() {
        return collMntrAmt;
    }

    /**
     * Sets the value of the collMntrAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection44 }
     *     
     */
    public void setCollMntrAmt(AmountAndDirection44 value) {
        this.collMntrAmt = value;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setPrevslySttldQty(FinancialInstrumentQuantity33Choice value) {
        this.prevslySttldQty = value;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public FinancialInstrumentQuantity33Choice getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity33Choice }
     *     
     */
    public void setRmngToBeSttldQty(FinancialInstrumentQuantity33Choice value) {
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
     *     {@link CorporateActionEventType88Choice }
     *     
     */
    public CorporateActionEventType88Choice getCorpActnEvtTp() {
        return corpActnEvtTp;
    }

    /**
     * Sets the value of the corpActnEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventType88Choice }
     *     
     */
    public void setCorpActnEvtTp(CorporateActionEventType88Choice value) {
        this.corpActnEvtTp = value;
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
