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

package org.jpos.iso20022.casp_017_001_05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleContext4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SaleContext4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SaleRefNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CshrId" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CshrLang" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}LanguageCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ShftNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max2NumericText" minOccurs="0"/>
 *         <element name="CstmrOrdrReqFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="PurchsOrdrNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="DlvryNoteNb" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="SpnsrdMrchnt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Organisation26" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SpltPmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RmngAmt" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ForceOnlnFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="ReuseCardDataFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AllwdNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}CardDataReading8Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SaleTknScp" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}SaleTokenScope1Code" minOccurs="0"/>
 *         <element name="AddtlSaleData" type="{urn:iso:std:iso:20022:tech:xsd:casp.017.001.05}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaleContext4", propOrder = {
    "saleId",
    "saleRefNb",
    "saleRcncltnId",
    "cshrId",
    "cshrLang",
    "shftNb",
    "cstmrOrdrReqFlg",
    "purchsOrdrNb",
    "invcNb",
    "dlvryNoteNb",
    "spnsrdMrchnt",
    "spltPmt",
    "rmngAmt",
    "forceOnlnFlg",
    "reuseCardDataFlg",
    "allwdNtryMd",
    "saleTknScp",
    "addtlSaleData"
})
public class SaleContext4 {

    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleRefNb")
    protected String saleRefNb;
    @XmlElement(name = "SaleRcncltnId")
    protected String saleRcncltnId;
    @XmlElement(name = "CshrId")
    protected String cshrId;
    @XmlElement(name = "CshrLang")
    protected List<String> cshrLang;
    @XmlElement(name = "ShftNb")
    protected String shftNb;
    @XmlElement(name = "CstmrOrdrReqFlg")
    protected Boolean cstmrOrdrReqFlg;
    @XmlElement(name = "PurchsOrdrNb")
    protected String purchsOrdrNb;
    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "DlvryNoteNb")
    protected String dlvryNoteNb;
    @XmlElement(name = "SpnsrdMrchnt")
    protected List<Organisation26> spnsrdMrchnt;
    @XmlElement(name = "SpltPmt")
    protected Boolean spltPmt;
    @XmlElement(name = "RmngAmt")
    protected BigDecimal rmngAmt;
    @XmlElement(name = "ForceOnlnFlg")
    protected Boolean forceOnlnFlg;
    @XmlElement(name = "ReuseCardDataFlg")
    protected Boolean reuseCardDataFlg;
    @XmlElement(name = "AllwdNtryMd")
    @XmlSchemaType(name = "string")
    protected List<CardDataReading8Code> allwdNtryMd;
    @XmlElement(name = "SaleTknScp")
    @XmlSchemaType(name = "string")
    protected SaleTokenScope1Code saleTknScp;
    @XmlElement(name = "AddtlSaleData")
    protected String addtlSaleData;

    /**
     * Gets the value of the saleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * Sets the value of the saleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * Gets the value of the saleRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRefNb() {
        return saleRefNb;
    }

    /**
     * Sets the value of the saleRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRefNb(String value) {
        this.saleRefNb = value;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Gets the value of the cshrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCshrId() {
        return cshrId;
    }

    /**
     * Sets the value of the cshrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCshrId(String value) {
        this.cshrId = value;
    }

    /**
     * Gets the value of the cshrLang property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshrLang property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshrLang().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cshrLang property.
     */
    public List<String> getCshrLang() {
        if (cshrLang == null) {
            cshrLang = new ArrayList<>();
        }
        return this.cshrLang;
    }

    /**
     * Gets the value of the shftNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShftNb() {
        return shftNb;
    }

    /**
     * Sets the value of the shftNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShftNb(String value) {
        this.shftNb = value;
    }

    /**
     * Gets the value of the cstmrOrdrReqFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCstmrOrdrReqFlg() {
        return cstmrOrdrReqFlg;
    }

    /**
     * Sets the value of the cstmrOrdrReqFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCstmrOrdrReqFlg(Boolean value) {
        this.cstmrOrdrReqFlg = value;
    }

    /**
     * Gets the value of the purchsOrdrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchsOrdrNb() {
        return purchsOrdrNb;
    }

    /**
     * Sets the value of the purchsOrdrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchsOrdrNb(String value) {
        this.purchsOrdrNb = value;
    }

    /**
     * Gets the value of the invcNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvcNb() {
        return invcNb;
    }

    /**
     * Sets the value of the invcNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvcNb(String value) {
        this.invcNb = value;
    }

    /**
     * Gets the value of the dlvryNoteNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvryNoteNb() {
        return dlvryNoteNb;
    }

    /**
     * Sets the value of the dlvryNoteNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlvryNoteNb(String value) {
        this.dlvryNoteNb = value;
    }

    /**
     * Gets the value of the spnsrdMrchnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spnsrdMrchnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpnsrdMrchnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Organisation26 }
     * 
     * 
     * @return
     *     The value of the spnsrdMrchnt property.
     */
    public List<Organisation26> getSpnsrdMrchnt() {
        if (spnsrdMrchnt == null) {
            spnsrdMrchnt = new ArrayList<>();
        }
        return this.spnsrdMrchnt;
    }

    /**
     * Gets the value of the spltPmt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpltPmt() {
        return spltPmt;
    }

    /**
     * Sets the value of the spltPmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpltPmt(Boolean value) {
        this.spltPmt = value;
    }

    /**
     * Gets the value of the rmngAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRmngAmt() {
        return rmngAmt;
    }

    /**
     * Sets the value of the rmngAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRmngAmt(BigDecimal value) {
        this.rmngAmt = value;
    }

    /**
     * Gets the value of the forceOnlnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceOnlnFlg() {
        return forceOnlnFlg;
    }

    /**
     * Sets the value of the forceOnlnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceOnlnFlg(Boolean value) {
        this.forceOnlnFlg = value;
    }

    /**
     * Gets the value of the reuseCardDataFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReuseCardDataFlg() {
        return reuseCardDataFlg;
    }

    /**
     * Sets the value of the reuseCardDataFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReuseCardDataFlg(Boolean value) {
        this.reuseCardDataFlg = value;
    }

    /**
     * Gets the value of the allwdNtryMd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the allwdNtryMd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllwdNtryMd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardDataReading8Code }
     * 
     * 
     * @return
     *     The value of the allwdNtryMd property.
     */
    public List<CardDataReading8Code> getAllwdNtryMd() {
        if (allwdNtryMd == null) {
            allwdNtryMd = new ArrayList<>();
        }
        return this.allwdNtryMd;
    }

    /**
     * Gets the value of the saleTknScp property.
     * 
     * @return
     *     possible object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public SaleTokenScope1Code getSaleTknScp() {
        return saleTknScp;
    }

    /**
     * Sets the value of the saleTknScp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleTokenScope1Code }
     *     
     */
    public void setSaleTknScp(SaleTokenScope1Code value) {
        this.saleTknScp = value;
    }

    /**
     * Gets the value of the addtlSaleData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlSaleData() {
        return addtlSaleData;
    }

    /**
     * Sets the value of the addtlSaleData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlSaleData(String value) {
        this.addtlSaleData = value;
    }

}
