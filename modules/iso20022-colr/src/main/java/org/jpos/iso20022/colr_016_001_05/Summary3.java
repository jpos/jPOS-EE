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

package org.jpos.iso20022.colr_016_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Summary3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Summary3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpsdAmtPtyA" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsdAmtPtyB" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpsrTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ExposureType13Code"/>
 *         <element name="TtlValOfColl" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="NetXcssDfcit" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="NetXcssDfcitInd" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ShortLong1Code" minOccurs="0"/>
 *         <element name="ValtnDtTm" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ISODateTime"/>
 *         <element name="ReqdSttlmDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}ISODate" minOccurs="0"/>
 *         <element name="SummryDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.016.001.05}SummaryAmounts2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Summary3", propOrder = {
    "xpsdAmtPtyA",
    "xpsdAmtPtyB",
    "xpsrTp",
    "ttlValOfColl",
    "netXcssDfcit",
    "netXcssDfcitInd",
    "valtnDtTm",
    "reqdSttlmDt",
    "summryDtls"
})
public class Summary3 {

    @XmlElement(name = "XpsdAmtPtyA")
    protected ActiveCurrencyAndAmount xpsdAmtPtyA;
    @XmlElement(name = "XpsdAmtPtyB")
    protected ActiveCurrencyAndAmount xpsdAmtPtyB;
    @XmlElement(name = "XpsrTp", required = true)
    @XmlSchemaType(name = "string")
    protected ExposureType13Code xpsrTp;
    @XmlElement(name = "TtlValOfColl", required = true)
    protected ActiveCurrencyAndAmount ttlValOfColl;
    @XmlElement(name = "NetXcssDfcit")
    protected ActiveCurrencyAndAmount netXcssDfcit;
    @XmlElement(name = "NetXcssDfcitInd")
    @XmlSchemaType(name = "string")
    protected ShortLong1Code netXcssDfcitInd;
    @XmlElement(name = "ValtnDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valtnDtTm;
    @XmlElement(name = "ReqdSttlmDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "SummryDtls")
    protected SummaryAmounts2 summryDtls;

    /**
     * Gets the value of the xpsdAmtPtyA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyA() {
        return xpsdAmtPtyA;
    }

    /**
     * Sets the value of the xpsdAmtPtyA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setXpsdAmtPtyA(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyA = value;
    }

    /**
     * Gets the value of the xpsdAmtPtyB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getXpsdAmtPtyB() {
        return xpsdAmtPtyB;
    }

    /**
     * Sets the value of the xpsdAmtPtyB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setXpsdAmtPtyB(ActiveCurrencyAndAmount value) {
        this.xpsdAmtPtyB = value;
    }

    /**
     * Gets the value of the xpsrTp property.
     * 
     * @return
     *     possible object is
     *     {@link ExposureType13Code }
     *     
     */
    public ExposureType13Code getXpsrTp() {
        return xpsrTp;
    }

    /**
     * Sets the value of the xpsrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposureType13Code }
     *     
     */
    public void setXpsrTp(ExposureType13Code value) {
        this.xpsrTp = value;
    }

    /**
     * Gets the value of the ttlValOfColl property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlValOfColl() {
        return ttlValOfColl;
    }

    /**
     * Sets the value of the ttlValOfColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlValOfColl(ActiveCurrencyAndAmount value) {
        this.ttlValOfColl = value;
    }

    /**
     * Gets the value of the netXcssDfcit property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetXcssDfcit() {
        return netXcssDfcit;
    }

    /**
     * Sets the value of the netXcssDfcit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setNetXcssDfcit(ActiveCurrencyAndAmount value) {
        this.netXcssDfcit = value;
    }

    /**
     * Gets the value of the netXcssDfcitInd property.
     * 
     * @return
     *     possible object is
     *     {@link ShortLong1Code }
     *     
     */
    public ShortLong1Code getNetXcssDfcitInd() {
        return netXcssDfcitInd;
    }

    /**
     * Sets the value of the netXcssDfcitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShortLong1Code }
     *     
     */
    public void setNetXcssDfcitInd(ShortLong1Code value) {
        this.netXcssDfcitInd = value;
    }

    /**
     * Gets the value of the valtnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValtnDtTm() {
        return valtnDtTm;
    }

    /**
     * Sets the value of the valtnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValtnDtTm(XMLGregorianCalendar value) {
        this.valtnDtTm = value;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
    }

    /**
     * Gets the value of the summryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryAmounts2 }
     *     
     */
    public SummaryAmounts2 getSummryDtls() {
        return summryDtls;
    }

    /**
     * Sets the value of the summryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryAmounts2 }
     *     
     */
    public void setSummryDtls(SummaryAmounts2 value) {
        this.summryDtls = value;
    }

}
