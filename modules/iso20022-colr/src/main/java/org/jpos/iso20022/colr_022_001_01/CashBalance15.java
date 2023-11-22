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

package org.jpos.iso20022.colr_022_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashBalance15 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashBalance15">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ActiveOrHistoricCurrencyAndAmount"/>
 *         <element name="FXDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ForeignExchangeTerms19" minOccurs="0"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="ValtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}ValuationsDetails2" minOccurs="0"/>
 *         <element name="TxLotNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}GenericIdentification178" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashBalance15", propOrder = {
    "amt",
    "fxDtls",
    "cshAcct",
    "valtnDtls",
    "txLotNb"
})
public class CashBalance15 {

    @XmlElement(name = "Amt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount amt;
    @XmlElement(name = "FXDtls")
    protected ForeignExchangeTerms19 fxDtls;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "ValtnDtls")
    protected ValuationsDetails2 valtnDtls;
    @XmlElement(name = "TxLotNb")
    protected List<GenericIdentification178> txLotNb;

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
     * Gets the value of the fxDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public ForeignExchangeTerms19 getFXDtls() {
        return fxDtls;
    }

    /**
     * Sets the value of the fxDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignExchangeTerms19 }
     *     
     */
    public void setFXDtls(ForeignExchangeTerms19 value) {
        this.fxDtls = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the valtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationsDetails2 }
     *     
     */
    public ValuationsDetails2 getValtnDtls() {
        return valtnDtls;
    }

    /**
     * Sets the value of the valtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationsDetails2 }
     *     
     */
    public void setValtnDtls(ValuationsDetails2 value) {
        this.valtnDtls = value;
    }

    /**
     * Gets the value of the txLotNb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txLotNb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxLotNb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification178 }
     * 
     * 
     * @return
     *     The value of the txLotNb property.
     */
    public List<GenericIdentification178> getTxLotNb() {
        if (txLotNb == null) {
            txLotNb = new ArrayList<>();
        }
        return this.txLotNb;
    }

}
