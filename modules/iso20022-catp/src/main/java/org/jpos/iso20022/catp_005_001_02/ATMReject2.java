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

package org.jpos.iso20022.catp_005_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMReject2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMReject2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctInitrId" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RjctRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}RejectReason1Code"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}Max500Text" minOccurs="0"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="MsgInErr" type="{urn:iso:std:iso:20022:tech:xsd:catp.005.001.02}Max100KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMReject2", propOrder = {
    "rjctInitrId",
    "rjctRsn",
    "addtlInf",
    "cmd",
    "msgInErr"
})
public class ATMReject2 {

    @XmlElement(name = "RjctInitrId")
    protected String rjctInitrId;
    @XmlElement(name = "RjctRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectReason1Code rjctRsn;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;
    @XmlElement(name = "MsgInErr")
    protected byte[] msgInErr;

    /**
     * Gets the value of the rjctInitrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctInitrId() {
        return rjctInitrId;
    }

    /**
     * Sets the value of the rjctInitrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctInitrId(String value) {
        this.rjctInitrId = value;
    }

    /**
     * Gets the value of the rjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectReason1Code }
     *     
     */
    public RejectReason1Code getRjctRsn() {
        return rjctRsn;
    }

    /**
     * Sets the value of the rjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectReason1Code }
     *     
     */
    public void setRjctRsn(RejectReason1Code value) {
        this.rjctRsn = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

    /**
     * Gets the value of the cmd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCommand7 }
     * 
     * 
     * @return
     *     The value of the cmd property.
     */
    public List<ATMCommand7> getCmd() {
        if (cmd == null) {
            cmd = new ArrayList<>();
        }
        return this.cmd;
    }

    /**
     * Gets the value of the msgInErr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgInErr() {
        return msgInErr;
    }

    /**
     * Sets the value of the msgInErr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgInErr(byte[] value) {
        this.msgInErr = value;
    }

}
