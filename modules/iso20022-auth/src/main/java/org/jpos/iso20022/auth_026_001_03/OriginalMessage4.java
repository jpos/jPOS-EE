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

package org.jpos.iso20022.auth_026_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalMessage4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalMessage4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlSndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Party40Choice" minOccurs="0"/>
 *         <element name="OrgnlMsgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max35Text"/>
 *         <element name="OrgnlMsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max35Text"/>
 *         <element name="OrgnlCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}ISODateTime" minOccurs="0"/>
 *         <element name="OrgnlPackgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max35Text" minOccurs="0"/>
 *         <element name="OrgnlRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.026.001.03}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalMessage4", propOrder = {
    "orgnlSndr",
    "orgnlMsgId",
    "orgnlMsgNmId",
    "orgnlCreDtTm",
    "orgnlPackgId",
    "orgnlRcrdId"
})
public class OriginalMessage4 {

    @XmlElement(name = "OrgnlSndr")
    protected Party40Choice orgnlSndr;
    @XmlElement(name = "OrgnlMsgId", required = true)
    protected String orgnlMsgId;
    @XmlElement(name = "OrgnlMsgNmId", required = true)
    protected String orgnlMsgNmId;
    @XmlElement(name = "OrgnlCreDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;
    @XmlElement(name = "OrgnlPackgId")
    protected String orgnlPackgId;
    @XmlElement(name = "OrgnlRcrdId", required = true)
    protected String orgnlRcrdId;

    /**
     * Gets the value of the orgnlSndr property.
     * 
     * @return
     *     possible object is
     *     {@link Party40Choice }
     *     
     */
    public Party40Choice getOrgnlSndr() {
        return orgnlSndr;
    }

    /**
     * Sets the value of the orgnlSndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party40Choice }
     *     
     */
    public void setOrgnlSndr(Party40Choice value) {
        this.orgnlSndr = value;
    }

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
     * Gets the value of the orgnlMsgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlMsgNmId() {
        return orgnlMsgNmId;
    }

    /**
     * Sets the value of the orgnlMsgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlMsgNmId(String value) {
        this.orgnlMsgNmId = value;
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
     * Gets the value of the orgnlPackgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPackgId() {
        return orgnlPackgId;
    }

    /**
     * Sets the value of the orgnlPackgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPackgId(String value) {
        this.orgnlPackgId = value;
    }

    /**
     * Gets the value of the orgnlRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRcrdId() {
        return orgnlRcrdId;
    }

    /**
     * Sets the value of the orgnlRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlRcrdId(String value) {
        this.orgnlRcrdId = value;
    }

}
