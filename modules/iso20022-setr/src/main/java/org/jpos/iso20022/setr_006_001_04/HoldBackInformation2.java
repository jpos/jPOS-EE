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

package org.jpos.iso20022.setr_006_001_04;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HoldBackInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HoldBackInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}GateHoldBack1Code"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpctdRlsDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}ISODate" minOccurs="0"/>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}SecurityIdentification25Choice" minOccurs="0"/>
 *         <element name="FinInstrmNm" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}Max350Text" minOccurs="0"/>
 *         <element name="RedCmpltn" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}RedemptionCompletion1Code" minOccurs="0"/>
 *         <element name="FnlConf" type="{urn:iso:std:iso:20022:tech:xsd:setr.006.001.04}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldBackInformation2", propOrder = {
    "tp",
    "amt",
    "xpctdRlsDt",
    "finInstrmId",
    "finInstrmNm",
    "redCmpltn",
    "fnlConf"
})
public class HoldBackInformation2 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected GateHoldBack1Code tp;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "XpctdRlsDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdRlsDt;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification25Choice finInstrmId;
    @XmlElement(name = "FinInstrmNm")
    protected String finInstrmNm;
    @XmlElement(name = "RedCmpltn")
    @XmlSchemaType(name = "string")
    protected RedemptionCompletion1Code redCmpltn;
    @XmlElement(name = "FnlConf")
    protected Boolean fnlConf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link GateHoldBack1Code }
     *     
     */
    public GateHoldBack1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link GateHoldBack1Code }
     *     
     */
    public void setTp(GateHoldBack1Code value) {
        this.tp = value;
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
     * Gets the value of the xpctdRlsDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdRlsDt() {
        return xpctdRlsDt;
    }

    /**
     * Sets the value of the xpctdRlsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdRlsDt(XMLGregorianCalendar value) {
        this.xpctdRlsDt = value;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public SecurityIdentification25Choice getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification25Choice }
     *     
     */
    public void setFinInstrmId(SecurityIdentification25Choice value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the finInstrmNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinInstrmNm() {
        return finInstrmNm;
    }

    /**
     * Sets the value of the finInstrmNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinInstrmNm(String value) {
        this.finInstrmNm = value;
    }

    /**
     * Gets the value of the redCmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionCompletion1Code }
     *     
     */
    public RedemptionCompletion1Code getRedCmpltn() {
        return redCmpltn;
    }

    /**
     * Sets the value of the redCmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionCompletion1Code }
     *     
     */
    public void setRedCmpltn(RedemptionCompletion1Code value) {
        this.redCmpltn = value;
    }

    /**
     * Gets the value of the fnlConf property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFnlConf() {
        return fnlConf;
    }

    /**
     * Sets the value of the fnlConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFnlConf(Boolean value) {
        this.fnlConf = value;
    }

}
