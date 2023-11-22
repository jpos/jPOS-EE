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

package org.jpos.iso20022.sese_013_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Crystallisation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Crystallisation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrchId" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text"/>
 *         <element name="CrstllsdUnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="UcrstllsdUnitsNb" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="CrstllsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="UcrstllsdAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Crystallisation2", propOrder = {
    "trchId",
    "crstllsdUnitsNb",
    "ucrstllsdUnitsNb",
    "crstllsdAmt",
    "ucrstllsdAmt",
    "addtlInf"
})
public class Crystallisation2 {

    @XmlElement(name = "TrchId", required = true)
    protected String trchId;
    @XmlElement(name = "CrstllsdUnitsNb")
    protected BigDecimal crstllsdUnitsNb;
    @XmlElement(name = "UcrstllsdUnitsNb")
    protected BigDecimal ucrstllsdUnitsNb;
    @XmlElement(name = "CrstllsdAmt")
    protected ActiveCurrencyAnd13DecimalAmount crstllsdAmt;
    @XmlElement(name = "UcrstllsdAmt")
    protected ActiveCurrencyAnd13DecimalAmount ucrstllsdAmt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the trchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrchId() {
        return trchId;
    }

    /**
     * Sets the value of the trchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrchId(String value) {
        this.trchId = value;
    }

    /**
     * Gets the value of the crstllsdUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCrstllsdUnitsNb() {
        return crstllsdUnitsNb;
    }

    /**
     * Sets the value of the crstllsdUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCrstllsdUnitsNb(BigDecimal value) {
        this.crstllsdUnitsNb = value;
    }

    /**
     * Gets the value of the ucrstllsdUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUcrstllsdUnitsNb() {
        return ucrstllsdUnitsNb;
    }

    /**
     * Sets the value of the ucrstllsdUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUcrstllsdUnitsNb(BigDecimal value) {
        this.ucrstllsdUnitsNb = value;
    }

    /**
     * Gets the value of the crstllsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCrstllsdAmt() {
        return crstllsdAmt;
    }

    /**
     * Sets the value of the crstllsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCrstllsdAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.crstllsdAmt = value;
    }

    /**
     * Gets the value of the ucrstllsdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getUcrstllsdAmt() {
        return ucrstllsdAmt;
    }

    /**
     * Sets the value of the ucrstllsdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setUcrstllsdAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.ucrstllsdAmt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
