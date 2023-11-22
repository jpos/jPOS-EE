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

package org.jpos.iso20022.sese_012_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralInvestment2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="GeneralInvestment2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}GeneralInvestmentAccountType2Choice" minOccurs="0"/>
 *         <element name="OwnrshTp" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}AccountOwnershipType6Code" minOccurs="0"/>
 *         <element name="CurInvstmtAmt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="EstmtdVal" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}DateAndAmount2" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInvestment2", propOrder = {
    "tp",
    "ownrshTp",
    "curInvstmtAmt",
    "estmtdVal",
    "addtlInf"
})
public class GeneralInvestment2 {

    @XmlElement(name = "Tp")
    protected GeneralInvestmentAccountType2Choice tp;
    @XmlElement(name = "OwnrshTp")
    @XmlSchemaType(name = "string")
    protected AccountOwnershipType6Code ownrshTp;
    @XmlElement(name = "CurInvstmtAmt")
    protected ActiveCurrencyAnd13DecimalAmount curInvstmtAmt;
    @XmlElement(name = "EstmtdVal")
    protected DateAndAmount2 estmtdVal;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInvestmentAccountType2Choice }
     *     
     */
    public GeneralInvestmentAccountType2Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInvestmentAccountType2Choice }
     *     
     */
    public void setTp(GeneralInvestmentAccountType2Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the ownrshTp property.
     * 
     * @return
     *     possible object is
     *     {@link AccountOwnershipType6Code }
     *     
     */
    public AccountOwnershipType6Code getOwnrshTp() {
        return ownrshTp;
    }

    /**
     * Sets the value of the ownrshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountOwnershipType6Code }
     *     
     */
    public void setOwnrshTp(AccountOwnershipType6Code value) {
        this.ownrshTp = value;
    }

    /**
     * Gets the value of the curInvstmtAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCurInvstmtAmt() {
        return curInvstmtAmt;
    }

    /**
     * Sets the value of the curInvstmtAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCurInvstmtAmt(ActiveCurrencyAnd13DecimalAmount value) {
        this.curInvstmtAmt = value;
    }

    /**
     * Gets the value of the estmtdVal property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndAmount2 }
     *     
     */
    public DateAndAmount2 getEstmtdVal() {
        return estmtdVal;
    }

    /**
     * Sets the value of the estmtdVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndAmount2 }
     *     
     */
    public void setEstmtdVal(DateAndAmount2 value) {
        this.estmtdVal = value;
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
