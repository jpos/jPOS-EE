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

package org.jpos.iso20022.auth_040_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransparencyDataReport13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransparencyDataReport13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}ISINOct2015Identifier"/>
 *         <element name="RptgDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}ISODate" minOccurs="0"/>
 *         <element name="TradgVn" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}MICIdentifier" minOccurs="0"/>
 *         <element name="Sspnsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}TrueFalseIndicator"/>
 *         <element name="TxsExctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}NumberAndVolume2"/>
 *         <element name="TxsExctdExclgPreTradWvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}NumberAndVolume2"/>
 *         <element name="TxsExctdExclgPstTradLrgInScaleWvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}NumberAndVolume2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransparencyDataReport13", propOrder = {
    "techRcrdId",
    "id",
    "rptgDt",
    "tradgVn",
    "sspnsn",
    "txsExctd",
    "txsExctdExclgPreTradWvr",
    "txsExctdExclgPstTradLrgInScaleWvr"
})
public class TransparencyDataReport13 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "RptgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rptgDt;
    @XmlElement(name = "TradgVn")
    protected String tradgVn;
    @XmlElement(name = "Sspnsn")
    protected boolean sspnsn;
    @XmlElement(name = "TxsExctd", required = true)
    protected NumberAndVolume2 txsExctd;
    @XmlElement(name = "TxsExctdExclgPreTradWvr", required = true)
    protected NumberAndVolume2 txsExctdExclgPreTradWvr;
    @XmlElement(name = "TxsExctdExclgPstTradLrgInScaleWvr", required = true)
    protected NumberAndVolume2 txsExctdExclgPstTradLrgInScaleWvr;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the rptgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgDt() {
        return rptgDt;
    }

    /**
     * Sets the value of the rptgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgDt(XMLGregorianCalendar value) {
        this.rptgDt = value;
    }

    /**
     * Gets the value of the tradgVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradgVn() {
        return tradgVn;
    }

    /**
     * Sets the value of the tradgVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradgVn(String value) {
        this.tradgVn = value;
    }

    /**
     * Gets the value of the sspnsn property.
     * 
     */
    public boolean isSspnsn() {
        return sspnsn;
    }

    /**
     * Sets the value of the sspnsn property.
     * 
     */
    public void setSspnsn(boolean value) {
        this.sspnsn = value;
    }

    /**
     * Gets the value of the txsExctd property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctd() {
        return txsExctd;
    }

    /**
     * Sets the value of the txsExctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public void setTxsExctd(NumberAndVolume2 value) {
        this.txsExctd = value;
    }

    /**
     * Gets the value of the txsExctdExclgPreTradWvr property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctdExclgPreTradWvr() {
        return txsExctdExclgPreTradWvr;
    }

    /**
     * Sets the value of the txsExctdExclgPreTradWvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public void setTxsExctdExclgPreTradWvr(NumberAndVolume2 value) {
        this.txsExctdExclgPreTradWvr = value;
    }

    /**
     * Gets the value of the txsExctdExclgPstTradLrgInScaleWvr property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public NumberAndVolume2 getTxsExctdExclgPstTradLrgInScaleWvr() {
        return txsExctdExclgPstTradLrgInScaleWvr;
    }

    /**
     * Sets the value of the txsExctdExclgPstTradLrgInScaleWvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndVolume2 }
     *     
     */
    public void setTxsExctdExclgPstTradLrgInScaleWvr(NumberAndVolume2 value) {
        this.txsExctdExclgPstTradLrgInScaleWvr = value;
    }

}
