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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FraudulentTransactionData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FraudulentTransactionData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthstnSts" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}AuthorisationStatus1" minOccurs="0"/>
 *         <element name="DsptDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}DisputeData2" minOccurs="0"/>
 *         <element name="MsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISO8583MessageReasonCode" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AltrnMsgRsn" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max35Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="FrdlntMsg" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max100KBinary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FraudulentTransactionData2", propOrder = {
    "authstnSts",
    "dsptDtls",
    "msgRsn",
    "altrnMsgRsn",
    "frdlntMsg"
})
public class FraudulentTransactionData2 {

    @XmlElement(name = "AuthstnSts")
    protected AuthorisationStatus1 authstnSts;
    @XmlElement(name = "DsptDtls")
    protected DisputeData2 dsptDtls;
    @XmlElement(name = "MsgRsn")
    protected List<String> msgRsn;
    @XmlElement(name = "AltrnMsgRsn")
    protected List<String> altrnMsgRsn;
    @XmlElement(name = "FrdlntMsg")
    protected byte[] frdlntMsg;

    /**
     * Gets the value of the authstnSts property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationStatus1 }
     *     
     */
    public AuthorisationStatus1 getAuthstnSts() {
        return authstnSts;
    }

    /**
     * Sets the value of the authstnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationStatus1 }
     *     
     */
    public void setAuthstnSts(AuthorisationStatus1 value) {
        this.authstnSts = value;
    }

    /**
     * Gets the value of the dsptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DisputeData2 }
     *     
     */
    public DisputeData2 getDsptDtls() {
        return dsptDtls;
    }

    /**
     * Sets the value of the dsptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisputeData2 }
     *     
     */
    public void setDsptDtls(DisputeData2 value) {
        this.dsptDtls = value;
    }

    /**
     * Gets the value of the msgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the msgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the msgRsn property.
     */
    public List<String> getMsgRsn() {
        if (msgRsn == null) {
            msgRsn = new ArrayList<>();
        }
        return this.msgRsn;
    }

    /**
     * Gets the value of the altrnMsgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the altrnMsgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltrnMsgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the altrnMsgRsn property.
     */
    public List<String> getAltrnMsgRsn() {
        if (altrnMsgRsn == null) {
            altrnMsgRsn = new ArrayList<>();
        }
        return this.altrnMsgRsn;
    }

    /**
     * Gets the value of the frdlntMsg property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getFrdlntMsg() {
        return frdlntMsg;
    }

    /**
     * Sets the value of the frdlntMsg property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setFrdlntMsg(byte[] value) {
        this.frdlntMsg = value;
    }

}
