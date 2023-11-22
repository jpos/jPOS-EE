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

package org.jpos.iso20022.cain_025_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalFee2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalFee2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TypeOfAmount21Code"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FeePrgm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FeeDscrptr" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="FeeAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}FeeAmount3"/>
 *         <element name="FeeRcncltnAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}FeeAmount3" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max140Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFee2", propOrder = {
    "tp",
    "othrTp",
    "feePrgm",
    "feeDscrptr",
    "feeAmt",
    "feeRcncltnAmt",
    "desc",
    "addtlData"
})
public class AdditionalFee2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfAmount21Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "FeePrgm")
    protected String feePrgm;
    @XmlElement(name = "FeeDscrptr")
    protected String feeDscrptr;
    @XmlElement(name = "FeeAmt", required = true)
    protected FeeAmount3 feeAmt;
    @XmlElement(name = "FeeRcncltnAmt")
    protected FeeAmount3 feeRcncltnAmt;
    @XmlElement(name = "Desc")
    protected String desc;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public TypeOfAmount21Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfAmount21Code }
     *     
     */
    public void setTp(TypeOfAmount21Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the feePrgm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeePrgm() {
        return feePrgm;
    }

    /**
     * Sets the value of the feePrgm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeePrgm(String value) {
        this.feePrgm = value;
    }

    /**
     * Gets the value of the feeDscrptr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeDscrptr() {
        return feeDscrptr;
    }

    /**
     * Sets the value of the feeDscrptr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeDscrptr(String value) {
        this.feeDscrptr = value;
    }

    /**
     * Gets the value of the feeAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeAmt() {
        return feeAmt;
    }

    /**
     * Sets the value of the feeAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public void setFeeAmt(FeeAmount3 value) {
        this.feeAmt = value;
    }

    /**
     * Gets the value of the feeRcncltnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FeeAmount3 }
     *     
     */
    public FeeAmount3 getFeeRcncltnAmt() {
        return feeRcncltnAmt;
    }

    /**
     * Sets the value of the feeRcncltnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeAmount3 }
     *     
     */
    public void setFeeRcncltnAmt(FeeAmount3 value) {
        this.feeRcncltnAmt = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
