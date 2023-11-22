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

package org.jpos.iso20022.pain_007_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTransaction134 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTransaction134">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RvslId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlInstrId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlEndToEndId" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlUETR" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}UUIDv4Identifier" minOccurs="0"/>
 *         <element name="OrgnlInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="RvsdInstdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}ActiveOrHistoricCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ChrgBr" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}ChargeBearerType1Code" minOccurs="0"/>
 *         <element name="RvslRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}PaymentReversalReason9" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlTxRef" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}OriginalTransactionReference35" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:pain.007.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTransaction134", propOrder = {
    "rvslId",
    "orgnlInstrId",
    "orgnlEndToEndId",
    "orgnlUETR",
    "orgnlInstdAmt",
    "rvsdInstdAmt",
    "chrgBr",
    "rvslRsnInf",
    "orgnlTxRef",
    "splmtryData"
})
public class PaymentTransaction134 {

    @XmlElement(name = "RvslId")
    protected String rvslId;
    @XmlElement(name = "OrgnlInstrId")
    protected String orgnlInstrId;
    @XmlElement(name = "OrgnlEndToEndId")
    protected String orgnlEndToEndId;
    @XmlElement(name = "OrgnlUETR")
    protected String orgnlUETR;
    @XmlElement(name = "OrgnlInstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount orgnlInstdAmt;
    @XmlElement(name = "RvsdInstdAmt")
    protected ActiveOrHistoricCurrencyAndAmount rvsdInstdAmt;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearerType1Code chrgBr;
    @XmlElement(name = "RvslRsnInf")
    protected List<PaymentReversalReason9> rvslRsnInf;
    @XmlElement(name = "OrgnlTxRef")
    protected OriginalTransactionReference35 orgnlTxRef;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rvslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRvslId() {
        return rvslId;
    }

    /**
     * Sets the value of the rvslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRvslId(String value) {
        this.rvslId = value;
    }

    /**
     * Gets the value of the orgnlInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlInstrId() {
        return orgnlInstrId;
    }

    /**
     * Sets the value of the orgnlInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlInstrId(String value) {
        this.orgnlInstrId = value;
    }

    /**
     * Gets the value of the orgnlEndToEndId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlEndToEndId() {
        return orgnlEndToEndId;
    }

    /**
     * Sets the value of the orgnlEndToEndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlEndToEndId(String value) {
        this.orgnlEndToEndId = value;
    }

    /**
     * Gets the value of the orgnlUETR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlUETR() {
        return orgnlUETR;
    }

    /**
     * Sets the value of the orgnlUETR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlUETR(String value) {
        this.orgnlUETR = value;
    }

    /**
     * Gets the value of the orgnlInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getOrgnlInstdAmt() {
        return orgnlInstdAmt;
    }

    /**
     * Sets the value of the orgnlInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setOrgnlInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.orgnlInstdAmt = value;
    }

    /**
     * Gets the value of the rvsdInstdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getRvsdInstdAmt() {
        return rvsdInstdAmt;
    }

    /**
     * Sets the value of the rvsdInstdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public void setRvsdInstdAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.rvsdInstdAmt = value;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public ChargeBearerType1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearerType1Code }
     *     
     */
    public void setChrgBr(ChargeBearerType1Code value) {
        this.chrgBr = value;
    }

    /**
     * Gets the value of the rvslRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rvslRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRvslRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReversalReason9 }
     * 
     * 
     * @return
     *     The value of the rvslRsnInf property.
     */
    public List<PaymentReversalReason9> getRvslRsnInf() {
        if (rvslRsnInf == null) {
            rvslRsnInf = new ArrayList<>();
        }
        return this.rvslRsnInf;
    }

    /**
     * Gets the value of the orgnlTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalTransactionReference35 }
     *     
     */
    public OriginalTransactionReference35 getOrgnlTxRef() {
        return orgnlTxRef;
    }

    /**
     * Sets the value of the orgnlTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalTransactionReference35 }
     *     
     */
    public void setOrgnlTxRef(OriginalTransactionReference35 value) {
        this.orgnlTxRef = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
