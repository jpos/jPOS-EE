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

package org.jpos.iso20022.sese_011_001_09;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmploymentDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EmploymentDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TaxCd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}GenericIdentification36" minOccurs="0"/>
 *         <element name="OthrTaxCdInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="CmltvTaxInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}YesNoIndicator" minOccurs="0"/>
 *         <element name="PrvsPay" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="PrvsTax" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}DateFormat42Choice" minOccurs="0"/>
 *         <element name="EndDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}DateFormat42Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmploymentDetails1", propOrder = {
    "taxCd",
    "othrTaxCdInd",
    "cmltvTaxInd",
    "prvsPay",
    "prvsTax",
    "startDt",
    "endDt",
    "addtlInf"
})
public class EmploymentDetails1 {

    @XmlElement(name = "TaxCd")
    protected GenericIdentification36 taxCd;
    @XmlElement(name = "OthrTaxCdInd")
    protected Boolean othrTaxCdInd;
    @XmlElement(name = "CmltvTaxInd")
    protected Boolean cmltvTaxInd;
    @XmlElement(name = "PrvsPay")
    protected ActiveCurrencyAndAmount prvsPay;
    @XmlElement(name = "PrvsTax")
    protected ActiveCurrencyAndAmount prvsTax;
    @XmlElement(name = "StartDt")
    protected DateFormat42Choice startDt;
    @XmlElement(name = "EndDt")
    protected DateFormat42Choice endDt;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the taxCd property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification36 }
     *     
     */
    public GenericIdentification36 getTaxCd() {
        return taxCd;
    }

    /**
     * Sets the value of the taxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification36 }
     *     
     */
    public void setTaxCd(GenericIdentification36 value) {
        this.taxCd = value;
    }

    /**
     * Gets the value of the othrTaxCdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOthrTaxCdInd() {
        return othrTaxCdInd;
    }

    /**
     * Sets the value of the othrTaxCdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOthrTaxCdInd(Boolean value) {
        this.othrTaxCdInd = value;
    }

    /**
     * Gets the value of the cmltvTaxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCmltvTaxInd() {
        return cmltvTaxInd;
    }

    /**
     * Sets the value of the cmltvTaxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCmltvTaxInd(Boolean value) {
        this.cmltvTaxInd = value;
    }

    /**
     * Gets the value of the prvsPay property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsPay() {
        return prvsPay;
    }

    /**
     * Sets the value of the prvsPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrvsPay(ActiveCurrencyAndAmount value) {
        this.prvsPay = value;
    }

    /**
     * Gets the value of the prvsTax property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getPrvsTax() {
        return prvsTax;
    }

    /**
     * Sets the value of the prvsTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setPrvsTax(ActiveCurrencyAndAmount value) {
        this.prvsTax = value;
    }

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public void setStartDt(DateFormat42Choice value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the endDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat42Choice }
     *     
     */
    public DateFormat42Choice getEndDt() {
        return endDt;
    }

    /**
     * Sets the value of the endDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat42Choice }
     *     
     */
    public void setEndDt(DateFormat42Choice value) {
        this.endDt = value;
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
