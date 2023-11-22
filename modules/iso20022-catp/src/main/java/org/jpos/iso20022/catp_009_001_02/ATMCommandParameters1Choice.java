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

package org.jpos.iso20022.catp_009_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommandParameters1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommandParameters1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ATMReqrdGblSts" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}ATMStatus1Code"/>
 *         <element name="XpctdMsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}MessageFunction8Code"/>
 *         <element name="ReqrdCfgtnParam" type="{urn:iso:std:iso:20022:tech:xsd:catp.009.001.02}ATMConfigurationParameter1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommandParameters1Choice", propOrder = {
    "atmReqrdGblSts",
    "xpctdMsgFctn",
    "reqrdCfgtnParam"
})
public class ATMCommandParameters1Choice {

    @XmlElement(name = "ATMReqrdGblSts")
    @XmlSchemaType(name = "string")
    protected ATMStatus1Code atmReqrdGblSts;
    @XmlElement(name = "XpctdMsgFctn")
    @XmlSchemaType(name = "string")
    protected MessageFunction8Code xpctdMsgFctn;
    @XmlElement(name = "ReqrdCfgtnParam")
    protected ATMConfigurationParameter1 reqrdCfgtnParam;

    /**
     * Gets the value of the atmReqrdGblSts property.
     * 
     * @return
     *     possible object is
     *     {@link ATMStatus1Code }
     *     
     */
    public ATMStatus1Code getATMReqrdGblSts() {
        return atmReqrdGblSts;
    }

    /**
     * Sets the value of the atmReqrdGblSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMStatus1Code }
     *     
     */
    public void setATMReqrdGblSts(ATMStatus1Code value) {
        this.atmReqrdGblSts = value;
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

    /**
     * Gets the value of the reqrdCfgtnParam property.
     * 
     * @return
     *     possible object is
     *     {@link ATMConfigurationParameter1 }
     *     
     */
    public ATMConfigurationParameter1 getReqrdCfgtnParam() {
        return reqrdCfgtnParam;
    }

    /**
     * Sets the value of the reqrdCfgtnParam property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMConfigurationParameter1 }
     *     
     */
    public void setReqrdCfgtnParam(ATMConfigurationParameter1 value) {
        this.reqrdCfgtnParam = value;
    }

}
