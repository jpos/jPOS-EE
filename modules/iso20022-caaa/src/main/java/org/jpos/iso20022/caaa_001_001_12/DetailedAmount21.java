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

package org.jpos.iso20022.caaa_001_001_12;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedAmount21 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedAmount21">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}ImpliedCurrencyAndAmount"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}ISODateTime"/>
 *         <element name="CardDataNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}CardDataReading8Code" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max10000Binary" minOccurs="0"/>
 *         <element name="Labl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.001.001.12}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount21", propOrder = {
    "amt",
    "dtTm",
    "cardDataNtryMd",
    "iccRltdData",
    "labl"
})
public class DetailedAmount21 {

    @XmlElement(name = "Amt", required = true)
    protected BigDecimal amt;
    @XmlElement(name = "DtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CardDataNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardDataNtryMd;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Labl")
    protected String labl;

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
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
    }

    /**
     * Gets the value of the cardDataNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardDataNtryMd() {
        return cardDataNtryMd;
    }

    /**
     * Sets the value of the cardDataNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setCardDataNtryMd(CardDataReading8Code value) {
        this.cardDataNtryMd = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
    }

    /**
     * Gets the value of the labl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabl() {
        return labl;
    }

    /**
     * Sets the value of the labl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabl(String value) {
        this.labl = value;
    }

}
