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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ShippingData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InvcNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="InvcCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="SvcDscrptrCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max40Text" minOccurs="0"/>
 *         <element name="IncntivAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="MiscExpnss" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="InsrncInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="InsrncAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="Tax" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Tax39" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SummryCmmdtyId" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="NbOfPackgs" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max6NumericText" minOccurs="0"/>
 *         <element name="Packg" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}ShippingPackage2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShippingData2", propOrder = {
    "invcNb",
    "invcCreDtTm",
    "svcDscrptrCd",
    "incntivAmt",
    "miscExpnss",
    "insrncInd",
    "insrncAmt",
    "netAmt",
    "tax",
    "summryCmmdtyId",
    "nbOfPackgs",
    "packg",
    "addtlData"
})
public class ShippingData2 {

    @XmlElement(name = "InvcNb")
    protected String invcNb;
    @XmlElement(name = "InvcCreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar invcCreDtTm;
    @XmlElement(name = "SvcDscrptrCd")
    protected String svcDscrptrCd;
    @XmlElement(name = "IncntivAmt")
    protected BigDecimal incntivAmt;
    @XmlElement(name = "MiscExpnss")
    protected BigDecimal miscExpnss;
    @XmlElement(name = "InsrncInd")
    protected Boolean insrncInd;
    @XmlElement(name = "InsrncAmt")
    protected BigDecimal insrncAmt;
    @XmlElement(name = "NetAmt")
    protected BigDecimal netAmt;
    @XmlElement(name = "Tax")
    protected List<Tax39> tax;
    @XmlElement(name = "SummryCmmdtyId")
    protected String summryCmmdtyId;
    @XmlElement(name = "NbOfPackgs")
    protected String nbOfPackgs;
    @XmlElement(name = "Packg")
    protected List<ShippingPackage2> packg;
    @XmlElement(name = "AddtlData")
    protected String addtlData;

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
     * Gets the value of the invcCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvcCreDtTm() {
        return invcCreDtTm;
    }

    /**
     * Sets the value of the invcCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvcCreDtTm(XMLGregorianCalendar value) {
        this.invcCreDtTm = value;
    }

    /**
     * Gets the value of the svcDscrptrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcDscrptrCd() {
        return svcDscrptrCd;
    }

    /**
     * Sets the value of the svcDscrptrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcDscrptrCd(String value) {
        this.svcDscrptrCd = value;
    }

    /**
     * Gets the value of the incntivAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncntivAmt() {
        return incntivAmt;
    }

    /**
     * Sets the value of the incntivAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncntivAmt(BigDecimal value) {
        this.incntivAmt = value;
    }

    /**
     * Gets the value of the miscExpnss property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMiscExpnss() {
        return miscExpnss;
    }

    /**
     * Sets the value of the miscExpnss property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMiscExpnss(BigDecimal value) {
        this.miscExpnss = value;
    }

    /**
     * Gets the value of the insrncInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsrncInd() {
        return insrncInd;
    }

    /**
     * Sets the value of the insrncInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsrncInd(Boolean value) {
        this.insrncInd = value;
    }

    /**
     * Gets the value of the insrncAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInsrncAmt() {
        return insrncAmt;
    }

    /**
     * Sets the value of the insrncAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInsrncAmt(BigDecimal value) {
        this.insrncAmt = value;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetAmt(BigDecimal value) {
        this.netAmt = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax39 }
     * 
     * 
     * @return
     *     The value of the tax property.
     */
    public List<Tax39> getTax() {
        if (tax == null) {
            tax = new ArrayList<>();
        }
        return this.tax;
    }

    /**
     * Gets the value of the summryCmmdtyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummryCmmdtyId() {
        return summryCmmdtyId;
    }

    /**
     * Sets the value of the summryCmmdtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummryCmmdtyId(String value) {
        this.summryCmmdtyId = value;
    }

    /**
     * Gets the value of the nbOfPackgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfPackgs() {
        return nbOfPackgs;
    }

    /**
     * Sets the value of the nbOfPackgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfPackgs(String value) {
        this.nbOfPackgs = value;
    }

    /**
     * Gets the value of the packg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the packg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingPackage2 }
     * 
     * 
     * @return
     *     The value of the packg property.
     */
    public List<ShippingPackage2> getPackg() {
        if (packg == null) {
            packg = new ArrayList<>();
        }
        return this.packg;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlData() {
        return addtlData;
    }

    /**
     * Sets the value of the addtlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlData(String value) {
        this.addtlData = value;
    }

}
