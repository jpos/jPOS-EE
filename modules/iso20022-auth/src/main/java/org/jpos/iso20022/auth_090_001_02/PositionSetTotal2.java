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

package org.jpos.iso20022.auth_090_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionSetTotal2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PositionSetTotal2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NbOfTrds" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}Max20PositiveNumber" minOccurs="0"/>
 *         <element name="PostvVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="NegVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="Ntnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}NotionalAmountLegs6" minOccurs="0"/>
 *         <element name="OthrPmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd19DecimalAmount" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PositionSetTotal2", propOrder = {
    "nbOfTrds",
    "postvVal",
    "negVal",
    "ntnl",
    "othrPmtAmt"
})
public class PositionSetTotal2 {

    @XmlElement(name = "NbOfTrds")
    protected BigDecimal nbOfTrds;
    @XmlElement(name = "PostvVal")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount postvVal;
    @XmlElement(name = "NegVal")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount negVal;
    @XmlElement(name = "Ntnl")
    protected NotionalAmountLegs6 ntnl;
    @XmlElement(name = "OthrPmtAmt")
    protected List<ActiveOrHistoricCurrencyAnd19DecimalAmount> othrPmtAmt;

    /**
     * Gets the value of the nbOfTrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNbOfTrds() {
        return nbOfTrds;
    }

    /**
     * Sets the value of the nbOfTrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNbOfTrds(BigDecimal value) {
        this.nbOfTrds = value;
    }

    /**
     * Gets the value of the postvVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getPostvVal() {
        return postvVal;
    }

    /**
     * Sets the value of the postvVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setPostvVal(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.postvVal = value;
    }

    /**
     * Gets the value of the negVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getNegVal() {
        return negVal;
    }

    /**
     * Sets the value of the negVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setNegVal(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.negVal = value;
    }

    /**
     * Gets the value of the ntnl property.
     * 
     * @return
     *     possible object is
     *     {@link NotionalAmountLegs6 }
     *     
     */
    public NotionalAmountLegs6 getNtnl() {
        return ntnl;
    }

    /**
     * Sets the value of the ntnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotionalAmountLegs6 }
     *     
     */
    public void setNtnl(NotionalAmountLegs6 value) {
        this.ntnl = value;
    }

    /**
     * Gets the value of the othrPmtAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrPmtAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrPmtAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     * 
     * 
     * @return
     *     The value of the othrPmtAmt property.
     */
    public List<ActiveOrHistoricCurrencyAnd19DecimalAmount> getOthrPmtAmt() {
        if (othrPmtAmt == null) {
            othrPmtAmt = new ArrayList<>();
        }
        return this.othrPmtAmt;
    }

}
