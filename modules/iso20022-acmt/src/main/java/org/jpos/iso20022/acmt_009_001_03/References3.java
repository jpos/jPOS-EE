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

package org.jpos.iso20022.acmt_009_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="References3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.009.001.03}MessageIdentification1"/>
 *         <element name="ReqToBeCmpltdId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.009.001.03}MessageIdentification1"/>
 *         <element name="PrcId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.009.001.03}MessageIdentification1"/>
 *         <element name="ReqRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.009.001.03}Max35Text" maxOccurs="unbounded"/>
 *         <element name="AttchdDocNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.009.001.03}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References3", propOrder = {
    "msgId",
    "reqToBeCmpltdId",
    "prcId",
    "reqRsn",
    "attchdDocNm"
})
public class References3 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "ReqToBeCmpltdId", required = true)
    protected MessageIdentification1 reqToBeCmpltdId;
    @XmlElement(name = "PrcId", required = true)
    protected MessageIdentification1 prcId;
    @XmlElement(name = "ReqRsn", required = true)
    protected List<String> reqRsn;
    @XmlElement(name = "AttchdDocNm")
    protected List<String> attchdDocNm;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the reqToBeCmpltdId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqToBeCmpltdId() {
        return reqToBeCmpltdId;
    }

    /**
     * Sets the value of the reqToBeCmpltdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setReqToBeCmpltdId(MessageIdentification1 value) {
        this.reqToBeCmpltdId = value;
    }

    /**
     * Gets the value of the prcId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getPrcId() {
        return prcId;
    }

    /**
     * Sets the value of the prcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setPrcId(MessageIdentification1 value) {
        this.prcId = value;
    }

    /**
     * Gets the value of the reqRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the reqRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReqRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the reqRsn property.
     */
    public List<String> getReqRsn() {
        if (reqRsn == null) {
            reqRsn = new ArrayList<>();
        }
        return this.reqRsn;
    }

    /**
     * Gets the value of the attchdDocNm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdDocNm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdDocNm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the attchdDocNm property.
     */
    public List<String> getAttchdDocNm() {
        if (attchdDocNm == null) {
            attchdDocNm = new ArrayList<>();
        }
        return this.attchdDocNm;
    }

}
