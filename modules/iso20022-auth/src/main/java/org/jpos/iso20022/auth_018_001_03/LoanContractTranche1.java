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

package org.jpos.iso20022.auth_018_001_03;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoanContractTranche1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoanContractTranche1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrchNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Number"/>
 *         <element name="XpctdDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ActiveCurrencyAndAmount"/>
 *         <element name="DueDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODate" minOccurs="0"/>
 *         <element name="DrtnCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Exact1NumericText" minOccurs="0"/>
 *         <element name="LastTrchInd" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoanContractTranche1", propOrder = {
    "trchNb",
    "xpctdDt",
    "amt",
    "dueDt",
    "drtnCd",
    "lastTrchInd"
})
public class LoanContractTranche1 {

    @XmlElement(name = "TrchNb", required = true)
    protected BigDecimal trchNb;
    @XmlElement(name = "XpctdDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DueDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlElement(name = "DrtnCd")
    protected String drtnCd;
    @XmlElement(name = "LastTrchInd")
    protected Boolean lastTrchInd;

    /**
     * Gets the value of the trchNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTrchNb() {
        return trchNb;
    }

    /**
     * Sets the value of the trchNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTrchNb(BigDecimal value) {
        this.trchNb = value;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdDt(XMLGregorianCalendar value) {
        this.xpctdDt = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Gets the value of the drtnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrtnCd() {
        return drtnCd;
    }

    /**
     * Sets the value of the drtnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrtnCd(String value) {
        this.drtnCd = value;
    }

    /**
     * Gets the value of the lastTrchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastTrchInd() {
        return lastTrchInd;
    }

    /**
     * Sets the value of the lastTrchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastTrchInd(Boolean value) {
        this.lastTrchInd = value;
    }

}
