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

package org.jpos.iso20022.catp_001_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionMessage5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActionMessage5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}OutputFormat1Code" minOccurs="0"/>
 *         <element name="MsgCntt" type="{urn:iso:std:iso:20022:tech:xsd:catp.001.001.02}Max20000Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage5", propOrder = {
    "frmt",
    "msgCntt"
})
public class ActionMessage5 {

    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat1Code frmt;
    @XmlElement(name = "MsgCntt", required = true)
    protected String msgCntt;

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat1Code }
     *     
     */
    public OutputFormat1Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat1Code }
     *     
     */
    public void setFrmt(OutputFormat1Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the msgCntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCntt() {
        return msgCntt;
    }

    /**
     * Sets the value of the msgCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCntt(String value) {
        this.msgCntt = value;
    }

}
