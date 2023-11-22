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

package org.jpos.iso20022.acmt_011_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="References6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctdReqTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}UseCases1Code"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}Max350Text" maxOccurs="unbounded"/>
 *         <element name="RjctdReqId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}MessageIdentification1"/>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}MessageIdentification1"/>
 *         <element name="PrcId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}MessageIdentification1"/>
 *         <element name="AttchdDocNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.011.001.03}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References6", propOrder = {
    "rjctdReqTp",
    "rjctnRsn",
    "rjctdReqId",
    "msgId",
    "prcId",
    "attchdDocNm"
})
public class References6 {

    @XmlElement(name = "RjctdReqTp", required = true)
    @XmlSchemaType(name = "string")
    protected UseCases1Code rjctdReqTp;
    @XmlElement(name = "RjctnRsn", required = true)
    protected List<String> rjctnRsn;
    @XmlElement(name = "RjctdReqId", required = true)
    protected MessageIdentification1 rjctdReqId;
    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PrcId", required = true)
    protected MessageIdentification1 prcId;
    @XmlElement(name = "AttchdDocNm")
    protected List<String> attchdDocNm;

    /**
     * Gets the value of the rjctdReqTp property.
     * 
     * @return
     *     possible object is
     *     {@link UseCases1Code }
     *     
     */
    public UseCases1Code getRjctdReqTp() {
        return rjctdReqTp;
    }

    /**
     * Sets the value of the rjctdReqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UseCases1Code }
     *     
     */
    public void setRjctdReqTp(UseCases1Code value) {
        this.rjctdReqTp = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctnRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctnRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the rjctnRsn property.
     */
    public List<String> getRjctnRsn() {
        if (rjctnRsn == null) {
            rjctnRsn = new ArrayList<>();
        }
        return this.rjctnRsn;
    }

    /**
     * Gets the value of the rjctdReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctdReqId() {
        return rjctdReqId;
    }

    /**
     * Sets the value of the rjctdReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRjctdReqId(MessageIdentification1 value) {
        this.rjctdReqId = value;
    }

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
