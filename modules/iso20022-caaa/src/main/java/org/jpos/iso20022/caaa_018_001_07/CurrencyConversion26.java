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

package org.jpos.iso20022.caaa_018_001_07;

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
 * <p>Java class for CurrencyConversion26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CcyConvsId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Max35Text" minOccurs="0"/>
 *         <element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}CurrencyDetails3"/>
 *         <element name="RsltgAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}PercentageRate"/>
 *         <element name="NvrtdXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}PercentageRate" minOccurs="0"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="VldUntil" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ISODateTime" minOccurs="0"/>
 *         <element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}CurrencyDetails2"/>
 *         <element name="AplblBinRg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}BinRange1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}OriginalAmountDetails1" minOccurs="0"/>
 *         <element name="ComssnDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Commission19" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrkUpDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}Commission18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.018.001.07}ActionMessage10" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion26", propOrder = {
    "ccyConvsId",
    "trgtCcy",
    "rsltgAmt",
    "xchgRate",
    "nvrtdXchgRate",
    "qtnDt",
    "vldFr",
    "vldUntil",
    "srcCcy",
    "aplblBinRg",
    "orgnlAmt",
    "comssnDtls",
    "mrkUpDtls",
    "dclrtnDtls"
})
public class CurrencyConversion26 {

    @XmlElement(name = "CcyConvsId")
    protected String ccyConvsId;
    @XmlElement(name = "TrgtCcy", required = true)
    protected CurrencyDetails3 trgtCcy;
    @XmlElement(name = "RsltgAmt")
    protected BigDecimal rsltgAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "NvrtdXchgRate")
    protected BigDecimal nvrtdXchgRate;
    @XmlElement(name = "QtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "VldFr")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "VldUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;
    @XmlElement(name = "SrcCcy", required = true)
    protected CurrencyDetails2 srcCcy;
    @XmlElement(name = "AplblBinRg")
    protected List<BinRange1> aplblBinRg;
    @XmlElement(name = "OrgnlAmt")
    protected OriginalAmountDetails1 orgnlAmt;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission19> comssnDtls;
    @XmlElement(name = "MrkUpDtls")
    protected List<Commission18> mrkUpDtls;
    @XmlElement(name = "DclrtnDtls")
    protected List<ActionMessage10> dclrtnDtls;

    /**
     * Gets the value of the ccyConvsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcyConvsId() {
        return ccyConvsId;
    }

    /**
     * Sets the value of the ccyConvsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcyConvsId(String value) {
        this.ccyConvsId = value;
    }

    /**
     * Gets the value of the trgtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public CurrencyDetails3 getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails3 }
     *     
     */
    public void setTrgtCcy(CurrencyDetails3 value) {
        this.trgtCcy = value;
    }

    /**
     * Gets the value of the rsltgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRsltgAmt() {
        return rsltgAmt;
    }

    /**
     * Sets the value of the rsltgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRsltgAmt(BigDecimal value) {
        this.rsltgAmt = value;
    }

    /**
     * Gets the value of the xchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getXchgRate() {
        return xchgRate;
    }

    /**
     * Sets the value of the xchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setXchgRate(BigDecimal value) {
        this.xchgRate = value;
    }

    /**
     * Gets the value of the nvrtdXchgRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNvrtdXchgRate() {
        return nvrtdXchgRate;
    }

    /**
     * Sets the value of the nvrtdXchgRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNvrtdXchgRate(BigDecimal value) {
        this.nvrtdXchgRate = value;
    }

    /**
     * Gets the value of the qtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQtnDt() {
        return qtnDt;
    }

    /**
     * Sets the value of the qtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQtnDt(XMLGregorianCalendar value) {
        this.qtnDt = value;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldUntil(XMLGregorianCalendar value) {
        this.vldUntil = value;
    }

    /**
     * Gets the value of the srcCcy property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyDetails2 getSrcCcy() {
        return srcCcy;
    }

    /**
     * Sets the value of the srcCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public void setSrcCcy(CurrencyDetails2 value) {
        this.srcCcy = value;
    }

    /**
     * Gets the value of the aplblBinRg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the aplblBinRg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAplblBinRg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinRange1 }
     * 
     * 
     * @return
     *     The value of the aplblBinRg property.
     */
    public List<BinRange1> getAplblBinRg() {
        if (aplblBinRg == null) {
            aplblBinRg = new ArrayList<>();
        }
        return this.aplblBinRg;
    }

    /**
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public OriginalAmountDetails1 getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalAmountDetails1 }
     *     
     */
    public void setOrgnlAmt(OriginalAmountDetails1 value) {
        this.orgnlAmt = value;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission19 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission19> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the mrkUpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mrkUpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMrkUpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission18 }
     * 
     * 
     * @return
     *     The value of the mrkUpDtls property.
     */
    public List<Commission18> getMrkUpDtls() {
        if (mrkUpDtls == null) {
            mrkUpDtls = new ArrayList<>();
        }
        return this.mrkUpDtls;
    }

    /**
     * Gets the value of the dclrtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dclrtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDclrtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionMessage10 }
     * 
     * 
     * @return
     *     The value of the dclrtnDtls property.
     */
    public List<ActionMessage10> getDclrtnDtls() {
        if (dclrtnDtls == null) {
            dclrtnDtls = new ArrayList<>();
        }
        return this.dclrtnDtls;
    }

}
