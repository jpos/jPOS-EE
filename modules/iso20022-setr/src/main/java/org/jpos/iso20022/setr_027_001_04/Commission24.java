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

package org.jpos.iso20022.setr_027_001_04;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Commission24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Commission24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}CommissionType6Choice"/>
 *         <element name="Comssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountOrRate2Choice"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}PartyIdentification117" minOccurs="0"/>
 *         <element name="ClctnDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ISODate" minOccurs="0"/>
 *         <element name="TtlComssn" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="TtlVATAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="VATRate" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}BaseOneRate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commission24", propOrder = {
    "tp",
    "comssn",
    "rcptId",
    "clctnDt",
    "ttlComssn",
    "ttlVATAmt",
    "vatRate"
})
public class Commission24 {

    @XmlElement(name = "Tp", required = true)
    protected CommissionType6Choice tp;
    @XmlElement(name = "Comssn", required = true)
    protected AmountOrRate2Choice comssn;
    @XmlElement(name = "RcptId")
    protected PartyIdentification117 rcptId;
    @XmlElement(name = "ClctnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clctnDt;
    @XmlElement(name = "TtlComssn")
    protected AmountAndDirection29 ttlComssn;
    @XmlElement(name = "TtlVATAmt")
    protected ActiveCurrencyAndAmount ttlVATAmt;
    @XmlElement(name = "VATRate")
    protected BigDecimal vatRate;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType6Choice }
     *     
     */
    public CommissionType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType6Choice }
     *     
     */
    public void setTp(CommissionType6Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the comssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountOrRate2Choice }
     *     
     */
    public AmountOrRate2Choice getComssn() {
        return comssn;
    }

    /**
     * Sets the value of the comssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountOrRate2Choice }
     *     
     */
    public void setComssn(AmountOrRate2Choice value) {
        this.comssn = value;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification117 }
     *     
     */
    public PartyIdentification117 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification117 }
     *     
     */
    public void setRcptId(PartyIdentification117 value) {
        this.rcptId = value;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClctnDt(XMLGregorianCalendar value) {
        this.clctnDt = value;
    }

    /**
     * Gets the value of the ttlComssn property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getTtlComssn() {
        return ttlComssn;
    }

    /**
     * Sets the value of the ttlComssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setTtlComssn(AmountAndDirection29 value) {
        this.ttlComssn = value;
    }

    /**
     * Gets the value of the ttlVATAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlVATAmt() {
        return ttlVATAmt;
    }

    /**
     * Sets the value of the ttlVATAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlVATAmt(ActiveCurrencyAndAmount value) {
        this.ttlVATAmt = value;
    }

    /**
     * Gets the value of the vatRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVATRate() {
        return vatRate;
    }

    /**
     * Sets the value of the vatRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVATRate(BigDecimal value) {
        this.vatRate = value;
    }

}
