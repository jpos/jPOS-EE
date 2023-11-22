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

package org.jpos.iso20022.cafr_003_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Token2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Token2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max19NumericText" minOccurs="0"/>
 *         <element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}ISOYearMonth" minOccurs="0"/>
 *         <element name="TknRqstrId" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max11NumericText" minOccurs="0"/>
 *         <element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max140Text" minOccurs="0"/>
 *         <element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max2NumericText" minOccurs="0"/>
 *         <element name="TknInittdInd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="StorgLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}StorageLocation1Code" minOccurs="0"/>
 *         <element name="OthrStorgLctn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PrtcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}ProtectionMethod1Code" minOccurs="0"/>
 *         <element name="OthrPrtcnMtd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}Max35Text" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cafr.003.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token2", propOrder = {
    "pmtTkn",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknInittdInd",
    "storgLctn",
    "othrStorgLctn",
    "prtcnMtd",
    "othrPrtcnMtd",
    "addtlData"
})
public class Token2 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
    @XmlElement(name = "TknXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar tknXpryDt;
    @XmlElement(name = "TknRqstrId")
    protected String tknRqstrId;
    @XmlElement(name = "TknAssrncData")
    protected String tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknInittdInd")
    protected Boolean tknInittdInd;
    @XmlElement(name = "StorgLctn")
    @XmlSchemaType(name = "string")
    protected StorageLocation1Code storgLctn;
    @XmlElement(name = "OthrStorgLctn")
    protected String othrStorgLctn;
    @XmlElement(name = "PrtcnMtd")
    @XmlSchemaType(name = "string")
    protected ProtectionMethod1Code prtcnMtd;
    @XmlElement(name = "OthrPrtcnMtd")
    protected String othrPrtcnMtd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtTkn(String value) {
        this.pmtTkn = value;
    }

    /**
     * Gets the value of the tknXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Sets the value of the tknXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTknXpryDt(XMLGregorianCalendar value) {
        this.tknXpryDt = value;
    }

    /**
     * Gets the value of the tknRqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRqstrId() {
        return tknRqstrId;
    }

    /**
     * Sets the value of the tknRqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRqstrId(String value) {
        this.tknRqstrId = value;
    }

    /**
     * Gets the value of the tknAssrncData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Sets the value of the tknAssrncData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncData(String value) {
        this.tknAssrncData = value;
    }

    /**
     * Gets the value of the tknAssrncMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Sets the value of the tknAssrncMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
    }

    /**
     * Gets the value of the tknInittdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTknInittdInd() {
        return tknInittdInd;
    }

    /**
     * Sets the value of the tknInittdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTknInittdInd(Boolean value) {
        this.tknInittdInd = value;
    }

    /**
     * Gets the value of the storgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link StorageLocation1Code }
     *     
     */
    public StorageLocation1Code getStorgLctn() {
        return storgLctn;
    }

    /**
     * Sets the value of the storgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageLocation1Code }
     *     
     */
    public void setStorgLctn(StorageLocation1Code value) {
        this.storgLctn = value;
    }

    /**
     * Gets the value of the othrStorgLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrStorgLctn() {
        return othrStorgLctn;
    }

    /**
     * Sets the value of the othrStorgLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrStorgLctn(String value) {
        this.othrStorgLctn = value;
    }

    /**
     * Gets the value of the prtcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public ProtectionMethod1Code getPrtcnMtd() {
        return prtcnMtd;
    }

    /**
     * Sets the value of the prtcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectionMethod1Code }
     *     
     */
    public void setPrtcnMtd(ProtectionMethod1Code value) {
        this.prtcnMtd = value;
    }

    /**
     * Gets the value of the othrPrtcnMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrPrtcnMtd() {
        return othrPrtcnMtd;
    }

    /**
     * Sets the value of the othrPrtcnMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrPrtcnMtd(String value) {
        this.othrPrtcnMtd = value;
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
