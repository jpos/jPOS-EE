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

package org.jpos.iso20022.caam_007_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to the request to an ATM to contact the ATM manager.
 * 
 * <p>Java class for HostToATMRequest1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HostToATMRequest1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}ATMEnvironment9"/>
 *         <element name="CmdId" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}ATMCommandIdentification1" minOccurs="0"/>
 *         <element name="XpctdMsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:caam.007.001.01}MessageFunction8Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostToATMRequest1", propOrder = {
    "envt",
    "cmdId",
    "xpctdMsgFctn"
})
public class HostToATMRequest1 {

    @XmlElement(name = "Envt", required = true)
    protected ATMEnvironment9 envt;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "XpctdMsgFctn", required = true)
    @XmlSchemaType(name = "string")
    protected MessageFunction8Code xpctdMsgFctn;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public ATMEnvironment9 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMEnvironment9 }
     *     
     */
    public void setEnvt(ATMEnvironment9 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public void setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
    }

    /**
     * Gets the value of the xpctdMsgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link MessageFunction8Code }
     *     
     */
    public MessageFunction8Code getXpctdMsgFctn() {
        return xpctdMsgFctn;
    }

    /**
     * Sets the value of the xpctdMsgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageFunction8Code }
     *     
     */
    public void setXpctdMsgFctn(MessageFunction8Code value) {
        this.xpctdMsgFctn = value;
    }

}
