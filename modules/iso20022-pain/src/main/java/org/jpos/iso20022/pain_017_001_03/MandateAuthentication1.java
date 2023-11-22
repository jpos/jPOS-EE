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

package org.jpos.iso20022.pain_017_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MandateAuthentication1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MandateAuthentication1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgAuthntcnCd" type="{urn:iso:std:iso:20022:tech:xsd:pain.017.001.03}Max16Text" minOccurs="0"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:pain.017.001.03}ISODate" minOccurs="0"/>
 *         <element name="Chanl" type="{urn:iso:std:iso:20022:tech:xsd:pain.017.001.03}AuthenticationChannel1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MandateAuthentication1", propOrder = {
    "msgAuthntcnCd",
    "dt",
    "chanl"
})
public class MandateAuthentication1 {

    @XmlElement(name = "MsgAuthntcnCd")
    protected String msgAuthntcnCd;
    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Chanl")
    protected AuthenticationChannel1Choice chanl;

    /**
     * Gets the value of the msgAuthntcnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgAuthntcnCd() {
        return msgAuthntcnCd;
    }

    /**
     * Sets the value of the msgAuthntcnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgAuthntcnCd(String value) {
        this.msgAuthntcnCd = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the chanl property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public AuthenticationChannel1Choice getChanl() {
        return chanl;
    }

    /**
     * Sets the value of the chanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationChannel1Choice }
     *     
     */
    public void setChanl(AuthenticationChannel1Choice value) {
        this.chanl = value;
    }

}
