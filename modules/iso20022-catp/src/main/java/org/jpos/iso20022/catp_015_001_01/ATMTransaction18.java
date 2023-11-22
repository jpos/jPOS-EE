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

package org.jpos.iso20022.catp_015_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction18 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction18">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:catp.015.001.01}TransactionIdentifier1"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.015.001.01}Response4Code"/>
 *         <element name="RspnRsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.015.001.01}ResultDetail4Code" minOccurs="0"/>
 *         <element name="ICCRltdData" type="{urn:iso:std:iso:20022:tech:xsd:catp.015.001.01}Max10000Binary" minOccurs="0"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:catp.015.001.01}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction18", propOrder = {
    "txId",
    "rspn",
    "rspnRsn",
    "iccRltdData",
    "cmd"
})
public class ATMTransaction18 {

    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "Rspn", required = true)
    @XmlSchemaType(name = "string")
    protected Response4Code rspn;
    @XmlElement(name = "RspnRsn")
    @XmlSchemaType(name = "string")
    protected ResultDetail4Code rspnRsn;
    @XmlElement(name = "ICCRltdData")
    protected byte[] iccRltdData;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setTxId(TransactionIdentifier1 value) {
        this.txId = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link Response4Code }
     *     
     */
    public Response4Code getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response4Code }
     *     
     */
    public void setRspn(Response4Code value) {
        this.rspn = value;
    }

    /**
     * Gets the value of the rspnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetail4Code }
     *     
     */
    public ResultDetail4Code getRspnRsn() {
        return rspnRsn;
    }

    /**
     * Sets the value of the rspnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetail4Code }
     *     
     */
    public void setRspnRsn(ResultDetail4Code value) {
        this.rspnRsn = value;
    }

    /**
     * Gets the value of the iccRltdData property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getICCRltdData() {
        return iccRltdData;
    }

    /**
     * Sets the value of the iccRltdData property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setICCRltdData(byte[] value) {
        this.iccRltdData = value;
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

}
