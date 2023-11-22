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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BonusWithdrawal2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BonusWithdrawal2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpOfAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}TypeOfAmount1Choice"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}WithdrawalReason1Choice" minOccurs="0"/>
 *         <element name="UclmdAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}ActiveOrHistoricCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="Outsdng" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}YesNoIndicator" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:sese.013.001.11}Max35Text" minOccurs="0"/>
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
@XmlType(name = "BonusWithdrawal2", propOrder = {
    "tpOfAmt",
    "amt",
    "rsn",
    "uclmdAmt",
    "outsdng",
    "ref",
    "addtlInf"
})
public class BonusWithdrawal2 {

    @XmlElement(name = "TpOfAmt", required = true)
    protected TypeOfAmount1Choice tpOfAmt;
    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount amt;
    @XmlElement(name = "Rsn")
    protected WithdrawalReason1Choice rsn;
    @XmlElement(name = "UclmdAmt")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount uclmdAmt;
    @XmlElement(name = "Outsdng")
    protected Boolean outsdng;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the tpOfAmt property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount1Choice }
     *     
     */
    public TypeOfAmount1Choice getTpOfAmt() {
        return tpOfAmt;
    }

    /**
     * Sets the value of the tpOfAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount1Choice }
     *     
     */
    public void setTpOfAmt(TypeOfAmount1Choice value) {
        this.tpOfAmt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link WithdrawalReason1Choice }
     *     
     */
    public WithdrawalReason1Choice getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithdrawalReason1Choice }
     *     
     */
    public void setRsn(WithdrawalReason1Choice value) {
        this.rsn = value;
    }

    /**
     * Gets the value of the uclmdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getUclmdAmt() {
        return uclmdAmt;
    }

    /**
     * Sets the value of the uclmdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public void setUclmdAmt(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.uclmdAmt = value;
    }

    /**
     * Gets the value of the outsdng property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOutsdng() {
        return outsdng;
    }

    /**
     * Sets the value of the outsdng property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOutsdng(Boolean value) {
        this.outsdng = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
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
