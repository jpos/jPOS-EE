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

package org.jpos.iso20022.camt_086_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingServiceAdjustment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingServiceAdjustment1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ServiceAdjustmentType1Code"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max140Text"/>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34"/>
 *         <element name="BalReqrdAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="ErrDt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}ISODate" minOccurs="0"/>
 *         <element name="AdjstmntId" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text" minOccurs="0"/>
 *         <element name="SubSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingSubServiceIdentification1" minOccurs="0"/>
 *         <element name="PricChng" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="OrgnlPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="NewPric" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="VolChng" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="OrgnlVol" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="NewVol" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}DecimalNumber" minOccurs="0"/>
 *         <element name="OrgnlChrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *         <element name="NewChrgAmt" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AmountAndDirection34" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceAdjustment1", propOrder = {
    "tp",
    "desc",
    "amt",
    "balReqrdAmt",
    "errDt",
    "adjstmntId",
    "subSvc",
    "pricChng",
    "orgnlPric",
    "newPric",
    "volChng",
    "orgnlVol",
    "newVol",
    "orgnlChrgAmt",
    "newChrgAmt"
})
public class BillingServiceAdjustment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceAdjustmentType1Code tp;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "Amt", required = true)
    protected AmountAndDirection34 amt;
    @XmlElement(name = "BalReqrdAmt")
    protected AmountAndDirection34 balReqrdAmt;
    @XmlElement(name = "ErrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar errDt;
    @XmlElement(name = "AdjstmntId")
    protected String adjstmntId;
    @XmlElement(name = "SubSvc")
    protected BillingSubServiceIdentification1 subSvc;
    @XmlElement(name = "PricChng")
    protected AmountAndDirection34 pricChng;
    @XmlElement(name = "OrgnlPric")
    protected AmountAndDirection34 orgnlPric;
    @XmlElement(name = "NewPric")
    protected AmountAndDirection34 newPric;
    @XmlElement(name = "VolChng")
    protected BigDecimal volChng;
    @XmlElement(name = "OrgnlVol")
    protected BigDecimal orgnlVol;
    @XmlElement(name = "NewVol")
    protected BigDecimal newVol;
    @XmlElement(name = "OrgnlChrgAmt")
    protected AmountAndDirection34 orgnlChrgAmt;
    @XmlElement(name = "NewChrgAmt")
    protected AmountAndDirection34 newChrgAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAdjustmentType1Code }
     *     
     */
    public ServiceAdjustmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAdjustmentType1Code }
     *     
     */
    public void setTp(ServiceAdjustmentType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setAmt(AmountAndDirection34 value) {
        this.amt = value;
    }

    /**
     * Gets the value of the balReqrdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalReqrdAmt() {
        return balReqrdAmt;
    }

    /**
     * Sets the value of the balReqrdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setBalReqrdAmt(AmountAndDirection34 value) {
        this.balReqrdAmt = value;
    }

    /**
     * Gets the value of the errDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getErrDt() {
        return errDt;
    }

    /**
     * Sets the value of the errDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setErrDt(XMLGregorianCalendar value) {
        this.errDt = value;
    }

    /**
     * Gets the value of the adjstmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdjstmntId() {
        return adjstmntId;
    }

    /**
     * Sets the value of the adjstmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdjstmntId(String value) {
        this.adjstmntId = value;
    }

    /**
     * Gets the value of the subSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingSubServiceIdentification1 getSubSvc() {
        return subSvc;
    }

    /**
     * Sets the value of the subSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public void setSubSvc(BillingSubServiceIdentification1 value) {
        this.subSvc = value;
    }

    /**
     * Gets the value of the pricChng property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getPricChng() {
        return pricChng;
    }

    /**
     * Sets the value of the pricChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setPricChng(AmountAndDirection34 value) {
        this.pricChng = value;
    }

    /**
     * Gets the value of the orgnlPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlPric() {
        return orgnlPric;
    }

    /**
     * Sets the value of the orgnlPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setOrgnlPric(AmountAndDirection34 value) {
        this.orgnlPric = value;
    }

    /**
     * Gets the value of the newPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getNewPric() {
        return newPric;
    }

    /**
     * Sets the value of the newPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setNewPric(AmountAndDirection34 value) {
        this.newPric = value;
    }

    /**
     * Gets the value of the volChng property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVolChng() {
        return volChng;
    }

    /**
     * Sets the value of the volChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVolChng(BigDecimal value) {
        this.volChng = value;
    }

    /**
     * Gets the value of the orgnlVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrgnlVol() {
        return orgnlVol;
    }

    /**
     * Sets the value of the orgnlVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrgnlVol(BigDecimal value) {
        this.orgnlVol = value;
    }

    /**
     * Gets the value of the newVol property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNewVol() {
        return newVol;
    }

    /**
     * Sets the value of the newVol property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNewVol(BigDecimal value) {
        this.newVol = value;
    }

    /**
     * Gets the value of the orgnlChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getOrgnlChrgAmt() {
        return orgnlChrgAmt;
    }

    /**
     * Sets the value of the orgnlChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setOrgnlChrgAmt(AmountAndDirection34 value) {
        this.orgnlChrgAmt = value;
    }

    /**
     * Gets the value of the newChrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getNewChrgAmt() {
        return newChrgAmt;
    }

    /**
     * Sets the value of the newChrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public void setNewChrgAmt(AmountAndDirection34 value) {
        this.newChrgAmt = value;
    }

}
