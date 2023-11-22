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
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMAccountStatement2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMAccountStatement2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ISODate" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ISODate" minOccurs="0"/>
 *         <element name="ShrtTxt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max70Text" minOccurs="0"/>
 *         <element name="CdtTx" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ImpliedCurrencyAndAmount"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="LngTxt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMAccountStatement2", propOrder = {
    "txDt",
    "valDt",
    "shrtTxt",
    "cdtTx",
    "amt",
    "ccy",
    "lngTxt"
})
public class ATMAccountStatement2 {

    @XmlElement(name = "TxDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "ValDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "ShrtTxt")
    protected String shrtTxt;
    @XmlElement(name = "CdtTx")
    protected Boolean cdtTx;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "LngTxt")
    protected String lngTxt;

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDt(XMLGregorianCalendar value) {
        this.valDt = value;
    }

    /**
     * Gets the value of the shrtTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtTxt() {
        return shrtTxt;
    }

    /**
     * Sets the value of the shrtTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtTxt(String value) {
        this.shrtTxt = value;
    }

    /**
     * Gets the value of the cdtTx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCdtTx() {
        return cdtTx;
    }

    /**
     * Sets the value of the cdtTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCdtTx(Boolean value) {
        this.cdtTx = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmt(BigDecimal value) {
        this.amt = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the lngTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngTxt() {
        return lngTxt;
    }

    /**
     * Sets the value of the lngTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngTxt(String value) {
        this.lngTxt = value;
    }

}
