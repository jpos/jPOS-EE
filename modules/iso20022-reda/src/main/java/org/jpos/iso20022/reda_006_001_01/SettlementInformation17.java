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

package org.jpos.iso20022.reda_006_001_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInformation17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInformation17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SctiesQtyTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}SettlementUnitType3Choice" minOccurs="0"/>
 *         <element name="CtrctSttlmMnth" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}ISOYearMonth" minOccurs="0"/>
 *         <element name="MinDnmtn" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="MinMltplQty" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" minOccurs="0"/>
 *         <element name="DevtgSttlmUnit" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}FinancialInstrumentQuantity1Choice" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation17", propOrder = {
    "sctiesQtyTp",
    "ctrctSttlmMnth",
    "minDnmtn",
    "minMltplQty",
    "devtgSttlmUnit"
})
public class SettlementInformation17 {

    @XmlElement(name = "SctiesQtyTp")
    protected SettlementUnitType3Choice sctiesQtyTp;
    @XmlElement(name = "CtrctSttlmMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar ctrctSttlmMnth;
    @XmlElement(name = "MinDnmtn")
    protected FinancialInstrumentQuantity1Choice minDnmtn;
    @XmlElement(name = "MinMltplQty")
    protected FinancialInstrumentQuantity1Choice minMltplQty;
    @XmlElement(name = "DevtgSttlmUnit")
    protected List<FinancialInstrumentQuantity1Choice> devtgSttlmUnit;

    /**
     * Gets the value of the sctiesQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementUnitType3Choice }
     *     
     */
    public SettlementUnitType3Choice getSctiesQtyTp() {
        return sctiesQtyTp;
    }

    /**
     * Sets the value of the sctiesQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementUnitType3Choice }
     *     
     */
    public void setSctiesQtyTp(SettlementUnitType3Choice value) {
        this.sctiesQtyTp = value;
    }

    /**
     * Gets the value of the ctrctSttlmMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtrctSttlmMnth() {
        return ctrctSttlmMnth;
    }

    /**
     * Sets the value of the ctrctSttlmMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCtrctSttlmMnth(XMLGregorianCalendar value) {
        this.ctrctSttlmMnth = value;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinDnmtn(FinancialInstrumentQuantity1Choice value) {
        this.minDnmtn = value;
    }

    /**
     * Gets the value of the minMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinMltplQty() {
        return minMltplQty;
    }

    /**
     * Sets the value of the minMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public void setMinMltplQty(FinancialInstrumentQuantity1Choice value) {
        this.minMltplQty = value;
    }

    /**
     * Gets the value of the devtgSttlmUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the devtgSttlmUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevtgSttlmUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentQuantity1Choice }
     * 
     * 
     * @return
     *     The value of the devtgSttlmUnit property.
     */
    public List<FinancialInstrumentQuantity1Choice> getDevtgSttlmUnit() {
        if (devtgSttlmUnit == null) {
            devtgSttlmUnit = new ArrayList<>();
        }
        return this.devtgSttlmUnit;
    }

}
