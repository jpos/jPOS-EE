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

package org.jpos.iso20022.catp_014_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionMessage4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActionMessage4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}OutputFormat2Code" minOccurs="0"/>
 *         <element name="Msg" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max20000Text" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Dvc" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}ATMDevice1Code" minOccurs="0"/>
 *         <element name="MsgCnttSgntr" type="{urn:iso:std:iso:20022:tech:xsd:catp.014.001.01}Max35Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage4", propOrder = {
    "frmt",
    "msg",
    "ref",
    "dvc",
    "msgCnttSgntr"
})
public class ActionMessage4 {

    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat2Code frmt;
    @XmlElement(name = "Msg")
    protected String msg;
    @XmlElement(name = "Ref")
    protected String ref;
    @XmlElement(name = "Dvc")
    @XmlSchemaType(name = "string")
    protected ATMDevice1Code dvc;
    @XmlElement(name = "MsgCnttSgntr")
    protected byte[] msgCnttSgntr;

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat2Code }
     *     
     */
    public OutputFormat2Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat2Code }
     *     
     */
    public void setFrmt(OutputFormat2Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the msg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsg() {
        return msg;
    }

    /**
     * Sets the value of the msg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsg(String value) {
        this.msg = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the dvc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMDevice1Code }
     *     
     */
    public ATMDevice1Code getDvc() {
        return dvc;
    }

    /**
     * Sets the value of the dvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMDevice1Code }
     *     
     */
    public void setDvc(ATMDevice1Code value) {
        this.dvc = value;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgCnttSgntr(byte[] value) {
        this.msgCnttSgntr = value;
    }

}
