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

package org.jpos.iso20022.camt_043_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundCashInBreakdown3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundCashInBreakdown3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:swift:xsd:camt.043.001.04}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="UnitsNb" type="{urn:swift:xsd:camt.043.001.04}FinancialInstrumentQuantity1" minOccurs="0"/>
 *         <element name="NewAmtInd" type="{urn:swift:xsd:camt.043.001.04}YesNoIndicator" minOccurs="0"/>
 *         <element name="InvstmtFndTxInTp" type="{urn:swift:xsd:camt.043.001.04}InvestmentFundTransactionInType1Choice"/>
 *         <element name="OrgnlOrdrQtyTp" type="{urn:swift:xsd:camt.043.001.04}QuantityType1Choice"/>
 *         <element name="ChrgDtls" type="{urn:swift:xsd:camt.043.001.04}Charge26" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ComssnDtls" type="{urn:swift:xsd:camt.043.001.04}Commission21" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmCcy" type="{urn:swift:xsd:camt.043.001.04}ActiveCurrencyCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundCashInBreakdown3", propOrder = {
    "amt",
    "unitsNb",
    "newAmtInd",
    "invstmtFndTxInTp",
    "orgnlOrdrQtyTp",
    "chrgDtls",
    "comssnDtls",
    "sttlmCcy"
})
public class FundCashInBreakdown3 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "UnitsNb")
    protected FinancialInstrumentQuantity1 unitsNb;
    @XmlElement(name = "NewAmtInd")
    protected Boolean newAmtInd;
    @XmlElement(name = "InvstmtFndTxInTp", required = true)
    protected InvestmentFundTransactionInType1Choice invstmtFndTxInTp;
    @XmlElement(name = "OrgnlOrdrQtyTp", required = true)
    protected QuantityType1Choice orgnlOrdrQtyTp;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge26> chrgDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission21> comssnDtls;
    @XmlElement(name = "SttlmCcy")
    protected String sttlmCcy;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the unitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getUnitsNb() {
        return unitsNb;
    }

    /**
     * Sets the value of the unitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public void setUnitsNb(FinancialInstrumentQuantity1 value) {
        this.unitsNb = value;
    }

    /**
     * Gets the value of the newAmtInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNewAmtInd() {
        return newAmtInd;
    }

    /**
     * Sets the value of the newAmtInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNewAmtInd(Boolean value) {
        this.newAmtInd = value;
    }

    /**
     * Gets the value of the invstmtFndTxInTp property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundTransactionInType1Choice }
     *     
     */
    public InvestmentFundTransactionInType1Choice getInvstmtFndTxInTp() {
        return invstmtFndTxInTp;
    }

    /**
     * Sets the value of the invstmtFndTxInTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundTransactionInType1Choice }
     *     
     */
    public void setInvstmtFndTxInTp(InvestmentFundTransactionInType1Choice value) {
        this.invstmtFndTxInTp = value;
    }

    /**
     * Gets the value of the orgnlOrdrQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType1Choice }
     *     
     */
    public QuantityType1Choice getOrgnlOrdrQtyTp() {
        return orgnlOrdrQtyTp;
    }

    /**
     * Sets the value of the orgnlOrdrQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType1Choice }
     *     
     */
    public void setOrgnlOrdrQtyTp(QuantityType1Choice value) {
        this.orgnlOrdrQtyTp = value;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge26 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge26> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission21 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission21> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

}
