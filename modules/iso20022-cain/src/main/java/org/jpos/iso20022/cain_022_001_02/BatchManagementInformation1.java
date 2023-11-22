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

package org.jpos.iso20022.cain_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchManagementInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BatchManagementInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ColltnId" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max35Text" minOccurs="0"/>
 *         <element name="BtchId" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max35Text"/>
 *         <element name="MsgSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max15NumericText" minOccurs="0"/>
 *         <element name="MsgChcksmInptVal" type="{urn:iso:std:iso:20022:tech:xsd:cain.022.001.02}Max140Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchManagementInformation1", propOrder = {
    "colltnId",
    "btchId",
    "msgSeqNb",
    "msgChcksmInptVal"
})
public class BatchManagementInformation1 {

    @XmlElement(name = "ColltnId")
    protected String colltnId;
    @XmlElement(name = "BtchId", required = true)
    protected String btchId;
    @XmlElement(name = "MsgSeqNb")
    protected String msgSeqNb;
    @XmlElement(name = "MsgChcksmInptVal")
    protected byte[] msgChcksmInptVal;

    /**
     * Gets the value of the colltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColltnId() {
        return colltnId;
    }

    /**
     * Sets the value of the colltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColltnId(String value) {
        this.colltnId = value;
    }

    /**
     * Gets the value of the btchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBtchId() {
        return btchId;
    }

    /**
     * Sets the value of the btchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBtchId(String value) {
        this.btchId = value;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgSeqNb(String value) {
        this.msgSeqNb = value;
    }

    /**
     * Gets the value of the msgChcksmInptVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgChcksmInptVal() {
        return msgChcksmInptVal;
    }

    /**
     * Sets the value of the msgChcksmInptVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgChcksmInptVal(byte[] value) {
        this.msgChcksmInptVal = value;
    }

}
