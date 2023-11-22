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

package org.jpos.iso20022.sese_012_001_11;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubscriptionInformation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SubscriptionInformation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtOfFrstSbcpt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ISODate"/>
 *         <element name="EqtyCmpnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="CshCmpnt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="TtlAmtYrToDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ActiveCurrencyAnd13DecimalAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionInformation2", propOrder = {
    "dtOfFrstSbcpt",
    "eqtyCmpnt",
    "cshCmpnt",
    "ttlAmtYrToDt"
})
public class SubscriptionInformation2 {

    @XmlElement(name = "DtOfFrstSbcpt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfFrstSbcpt;
    @XmlElement(name = "EqtyCmpnt")
    protected ActiveCurrencyAnd13DecimalAmount eqtyCmpnt;
    @XmlElement(name = "CshCmpnt")
    protected ActiveCurrencyAnd13DecimalAmount cshCmpnt;
    @XmlElement(name = "TtlAmtYrToDt", required = true)
    protected ActiveCurrencyAnd13DecimalAmount ttlAmtYrToDt;

    /**
     * Gets the value of the dtOfFrstSbcpt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfFrstSbcpt() {
        return dtOfFrstSbcpt;
    }

    /**
     * Sets the value of the dtOfFrstSbcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfFrstSbcpt(XMLGregorianCalendar value) {
        this.dtOfFrstSbcpt = value;
    }

    /**
     * Gets the value of the eqtyCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getEqtyCmpnt() {
        return eqtyCmpnt;
    }

    /**
     * Sets the value of the eqtyCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setEqtyCmpnt(ActiveCurrencyAnd13DecimalAmount value) {
        this.eqtyCmpnt = value;
    }

    /**
     * Gets the value of the cshCmpnt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getCshCmpnt() {
        return cshCmpnt;
    }

    /**
     * Sets the value of the cshCmpnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setCshCmpnt(ActiveCurrencyAnd13DecimalAmount value) {
        this.cshCmpnt = value;
    }

    /**
     * Gets the value of the ttlAmtYrToDt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getTtlAmtYrToDt() {
        return ttlAmtYrToDt;
    }

    /**
     * Sets the value of the ttlAmtYrToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setTtlAmtYrToDt(ActiveCurrencyAnd13DecimalAmount value) {
        this.ttlAmtYrToDt = value;
    }

}
