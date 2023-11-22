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

package org.jpos.iso20022.catp_007_001_02;

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
 * <p>Java class for CurrencyConversion9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyConversion9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CcyConvsId" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TrgtCcy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyDetails2"/>
 *         <element name="RsltgAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount"/>
 *         <element name="XchgRate" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}PercentageRate"/>
 *         <element name="NvrtdXchgRate" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}PercentageRate" minOccurs="0"/>
 *         <element name="QtnDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="VldUntil" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="SrcCcy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}CurrencyDetails2"/>
 *         <element name="OrgnlAmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount"/>
 *         <element name="ComssnDtls" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Commission19" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MrkUpDtls" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Commission18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DclrtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActionMessage5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion9", propOrder = {
    "ccyConvsId",
    "trgtCcy",
    "rsltgAmt",
    "xchgRate",
    "nvrtdXchgRate",
    "qtnDt",
    "vldUntil",
    "srcCcy",
    "orgnlAmt",
    "comssnDtls",
    "mrkUpDtls",
    "dclrtnDtls"
})
public class CurrencyConversion9 {

    @XmlElement(name = "CcyConvsId")
    protected String ccyConvsId;
    @XmlElement(name = "TrgtCcy", required = true)
    protected CurrencyDetails2 trgtCcy;
    @XmlElement(name = "RsltgAmt", required = true)
    protected BigDecimal rsltgAmt;
    @XmlElement(name = "XchgRate", required = true)
    protected BigDecimal xchgRate;
    @XmlElement(name = "NvrtdXchgRate")
    protected BigDecimal nvrtdXchgRate;
    @XmlElement(name = "QtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar qtnDt;
    @XmlElement(name = "VldUntil")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vldUntil;
    @XmlElement(name = "SrcCcy", required = true)
    protected CurrencyDetails2 srcCcy;
    @XmlElement(name = "OrgnlAmt", required = true)
    protected BigDecimal orgnlAmt;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission19> comssnDtls;
    @XmlElement(name = "MrkUpDtls")
    protected List<Commission18> mrkUpDtls;
    @XmlElement(name = "DclrtnDtls")
    protected ActionMessage5 dclrtnDtls;

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
     *     {@link CurrencyDetails2 }
     *     
     */
    public CurrencyDetails2 getTrgtCcy() {
        return trgtCcy;
    }

    /**
     * Sets the value of the trgtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyDetails2 }
     *     
     */
    public void setTrgtCcy(CurrencyDetails2 value) {
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
     * Gets the value of the orgnlAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlAmt() {
        return orgnlAmt;
    }

    /**
     * Sets the value of the orgnlAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlAmt(BigDecimal value) {
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
     * @return
     *     possible object is
     *     {@link ActionMessage5 }
     *     
     */
    public ActionMessage5 getDclrtnDtls() {
        return dclrtnDtls;
    }

    /**
     * Sets the value of the dclrtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage5 }
     *     
     */
    public void setDclrtnDtls(ActionMessage5 value) {
        this.dclrtnDtls = value;
    }

}
