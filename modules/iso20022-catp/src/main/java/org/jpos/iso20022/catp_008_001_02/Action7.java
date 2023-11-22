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

package org.jpos.iso20022.catp_008_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Action7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Action7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}ActionType6Code"/>
 *         <element name="MsgToPres" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}ActionMessage4" minOccurs="0"/>
 *         <element name="ReqToPrfrm" type="{urn:iso:std:iso:20022:tech:xsd:catp.008.001.02}MessageFunction11Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Action7", propOrder = {
    "actnTp",
    "msgToPres",
    "reqToPrfrm"
})
public class Action7 {

    @XmlElement(name = "ActnTp", required = true)
    @XmlSchemaType(name = "string")
    protected ActionType6Code actnTp;
    @XmlElement(name = "MsgToPres")
    protected ActionMessage4 msgToPres;
    @XmlElement(name = "ReqToPrfrm")
    @XmlSchemaType(name = "string")
    protected MessageFunction11Code reqToPrfrm;

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionType6Code }
     *     
     */
    public ActionType6Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionType6Code }
     *     
     */
    public void setActnTp(ActionType6Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the msgToPres property.
     * 
     * @return
     *     possible object is
     *     {@link ActionMessage4 }
     *     
     */
    public ActionMessage4 getMsgToPres() {
        return msgToPres;
    }

    /**
     * Sets the value of the msgToPres property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionMessage4 }
     *     
     */
    public void setMsgToPres(ActionMessage4 value) {
        this.msgToPres = value;
    }

    /**
     * Gets the value of the reqToPrfrm property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction11Code }
     *     
     */
    public MessageFunction11Code getReqToPrfrm() {
        return reqToPrfrm;
    }

    /**
     * Sets the value of the reqToPrfrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction11Code }
     *     
     */
    public void setReqToPrfrm(MessageFunction11Code value) {
        this.reqToPrfrm = value;
    }

}
