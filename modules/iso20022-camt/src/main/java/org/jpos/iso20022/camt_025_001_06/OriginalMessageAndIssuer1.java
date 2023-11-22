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

package org.jpos.iso20022.camt_025_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalMessageAndIssuer1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalMessageAndIssuer1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}Max35Text"/>
 *         <element name="MsgNmId" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}Max35Text" minOccurs="0"/>
 *         <element name="OrgtrNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.025.001.06}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalMessageAndIssuer1", propOrder = {
    "msgId",
    "msgNmId",
    "orgtrNm"
})
public class OriginalMessageAndIssuer1 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "MsgNmId")
    protected String msgNmId;
    @XmlElement(name = "OrgtrNm")
    protected String orgtrNm;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the msgNmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgNmId() {
        return msgNmId;
    }

    /**
     * Sets the value of the msgNmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgNmId(String value) {
        this.msgNmId = value;
    }

    /**
     * Gets the value of the orgtrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgtrNm() {
        return orgtrNm;
    }

    /**
     * Sets the value of the orgtrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgtrNm(String value) {
        this.orgtrNm = value;
    }

}
