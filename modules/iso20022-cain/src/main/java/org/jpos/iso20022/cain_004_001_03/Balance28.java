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

package org.jpos.iso20022.cain_004_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Balance28 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Balance28">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}BalanceType15Code"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}ImpliedCurrencyAndAmount"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}ISO3NumericCurrencyCode" minOccurs="0"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}CreditDebit3Code" minOccurs="0"/>
 *         <element name="CrdhldrCcyInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="BalDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.004.001.03}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Balance28", propOrder = {
    "tp",
    "othrTp",
    "amt",
    "ccy",
    "cdtDbt",
    "crdhldrCcyInd",
    "balDt"
})
public class Balance28 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceType15Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "CrdhldrCcyInd")
    protected Boolean crdhldrCcyInd;
    @XmlElement(name = "BalDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar balDt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceType15Code }
     *     
     */
    public BalanceType15Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceType15Code }
     *     
     */
    public void setTp(BalanceType15Code value) {
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
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the crdhldrCcyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCrdhldrCcyInd() {
        return crdhldrCcyInd;
    }

    /**
     * Sets the value of the crdhldrCcyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCrdhldrCcyInd(Boolean value) {
        this.crdhldrCcyInd = value;
    }

    /**
     * Gets the value of the balDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBalDt() {
        return balDt;
    }

    /**
     * Sets the value of the balDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBalDt(XMLGregorianCalendar value) {
        this.balDt = value;
    }

}
