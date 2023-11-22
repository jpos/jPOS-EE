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

package org.jpos.iso20022.camt_058_001_08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalNotification14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalNotification14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}Max35Text"/>
 *         <element name="OrgnlCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}ISODateTime" minOccurs="0"/>
 *         <element name="OrgnlNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}Max35Text"/>
 *         <element name="NtfctnCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}GroupCancellationIndicator" minOccurs="0"/>
 *         <element name="OrgnlNtfctnRef" type="{urn:iso:std:iso:20022:tech:xsd:camt.058.001.08}OriginalNotificationReference12" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalNotification14", propOrder = {
    "orgnlMsgId",
    "orgnlCreDtTm",
    "orgnlNtfctnId",
    "ntfctnCxl",
    "orgnlNtfctnRef"
})
public class OriginalNotification14 {

    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlCreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;
    @XmlElement(name = "OrgnlNtfctnId", required = true)
    protected String orgnlNtfctnId;
    @XmlElement(name = "NtfctnCxl")
    protected Boolean ntfctnCxl;
    @XmlElement(name = "OrgnlNtfctnRef")
    protected List<OriginalNotificationReference12> orgnlNtfctnRef;

    /**
     * Gets the value of the orgnlMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgId() {
        return orgnlMsgId;
    }

    /**
     * Sets the value of the orgnlMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgId(String value) {
        this.orgnlMsgId = value;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlCreDtTm(XMLGregorianCalendar value) {
        this.orgnlCreDtTm = value;
    }

    /**
     * Gets the value of the orgnlNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlNtfctnId() {
        return orgnlNtfctnId;
    }

    /**
     * Sets the value of the orgnlNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlNtfctnId(String value) {
        this.orgnlNtfctnId = value;
    }

    /**
     * Gets the value of the ntfctnCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNtfctnCxl() {
        return ntfctnCxl;
    }

    /**
     * Sets the value of the ntfctnCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNtfctnCxl(Boolean value) {
        this.ntfctnCxl = value;
    }

    /**
     * Gets the value of the orgnlNtfctnRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the orgnlNtfctnRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrgnlNtfctnRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginalNotificationReference12 }
     * 
     * 
     * @return
     *     The value of the orgnlNtfctnRef property.
     */
    public List<OriginalNotificationReference12> getOrgnlNtfctnRef() {
        if (orgnlNtfctnRef == null) {
            orgnlNtfctnRef = new ArrayList<>();
        }
        return this.orgnlNtfctnRef;
    }

}
