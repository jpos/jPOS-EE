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

package org.jpos.iso20022.sese_011_001_09;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Capped1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Capped1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StartDt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ISODate" minOccurs="0"/>
 *         <element name="IncmLmtCurPrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="IncmCurPrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="IncmLmtNxtPrd" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}ActiveCurrencyAnd13DecimalAmount" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Capped1", propOrder = {
    "startDt",
    "incmLmtCurPrd",
    "incmCurPrd",
    "incmLmtNxtPrd",
    "addtlInf"
})
public class Capped1 {

    @XmlElement(name = "StartDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDt;
    @XmlElement(name = "IncmLmtCurPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmLmtCurPrd;
    @XmlElement(name = "IncmCurPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmCurPrd;
    @XmlElement(name = "IncmLmtNxtPrd")
    protected ActiveCurrencyAnd13DecimalAmount incmLmtNxtPrd;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the startDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDt() {
        return startDt;
    }

    /**
     * Sets the value of the startDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDt(XMLGregorianCalendar value) {
        this.startDt = value;
    }

    /**
     * Gets the value of the incmLmtCurPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmLmtCurPrd() {
        return incmLmtCurPrd;
    }

    /**
     * Sets the value of the incmLmtCurPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setIncmLmtCurPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmLmtCurPrd = value;
    }

    /**
     * Gets the value of the incmCurPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmCurPrd() {
        return incmCurPrd;
    }

    /**
     * Sets the value of the incmCurPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setIncmCurPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmCurPrd = value;
    }

    /**
     * Gets the value of the incmLmtNxtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveCurrencyAnd13DecimalAmount getIncmLmtNxtPrd() {
        return incmLmtNxtPrd;
    }

    /**
     * Sets the value of the incmLmtNxtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAnd13DecimalAmount }
     *     
     */
    public void setIncmLmtNxtPrd(ActiveCurrencyAnd13DecimalAmount value) {
        this.incmLmtNxtPrd = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
