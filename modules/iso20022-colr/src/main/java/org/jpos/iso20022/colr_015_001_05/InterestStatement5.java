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

package org.jpos.iso20022.colr_015_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterestStatement5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InterestStatement5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="IntrstPrd" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}DatePeriod2"/>
 *         <element name="TtlIntrstAmtDueToA" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="TtlIntrstAmtDueToB" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}ISODate"/>
 *         <element name="IntrstPmtReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="IntrstClctn" type="{urn:iso:std:iso:20022:tech:xsd:colr.015.001.05}InterestCalculation5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestStatement5", propOrder = {
    "intrstPrd",
    "ttlIntrstAmtDueToA",
    "ttlIntrstAmtDueToB",
    "valDt",
    "intrstPmtReqId",
    "intrstClctn"
})
public class InterestStatement5 {

    @XmlElement(name = "IntrstPrd", required = true)
    protected DatePeriod2 intrstPrd;
    @XmlElement(name = "TtlIntrstAmtDueToA")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToA;
    @XmlElement(name = "TtlIntrstAmtDueToB")
    protected ActiveCurrencyAndAmount ttlIntrstAmtDueToB;
    @XmlElement(name = "ValDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDt;
    @XmlElement(name = "IntrstPmtReqId")
    protected String intrstPmtReqId;
    @XmlElement(name = "IntrstClctn")
    protected List<InterestCalculation5> intrstClctn;

    /**
     * Gets the value of the intrstPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getIntrstPrd() {
        return intrstPrd;
    }

    /**
     * Sets the value of the intrstPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setIntrstPrd(DatePeriod2 value) {
        this.intrstPrd = value;
    }

    /**
     * Gets the value of the ttlIntrstAmtDueToA property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrstAmtDueToA() {
        return ttlIntrstAmtDueToA;
    }

    /**
     * Sets the value of the ttlIntrstAmtDueToA property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlIntrstAmtDueToA(ActiveCurrencyAndAmount value) {
        this.ttlIntrstAmtDueToA = value;
    }

    /**
     * Gets the value of the ttlIntrstAmtDueToB property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlIntrstAmtDueToB() {
        return ttlIntrstAmtDueToB;
    }

    /**
     * Sets the value of the ttlIntrstAmtDueToB property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlIntrstAmtDueToB(ActiveCurrencyAndAmount value) {
        this.ttlIntrstAmtDueToB = value;
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
     * Gets the value of the intrstPmtReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstPmtReqId() {
        return intrstPmtReqId;
    }

    /**
     * Sets the value of the intrstPmtReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntrstPmtReqId(String value) {
        this.intrstPmtReqId = value;
    }

    /**
     * Gets the value of the intrstClctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the intrstClctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntrstClctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InterestCalculation5 }
     * 
     * 
     * @return
     *     The value of the intrstClctn property.
     */
    public List<InterestCalculation5> getIntrstClctn() {
        if (intrstClctn == null) {
            intrstClctn = new ArrayList<>();
        }
        return this.intrstClctn;
    }

}
