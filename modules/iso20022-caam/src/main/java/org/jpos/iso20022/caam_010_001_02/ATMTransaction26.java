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

package org.jpos.iso20022.caam_010_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMTransaction26 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMTransaction26">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TpOfOpr" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMOperation1Code" minOccurs="0"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}TransactionIdentifier1"/>
 *         <element name="RcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}Max35Text"/>
 *         <element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ResponseType7"/>
 *         <element name="ATMTtls" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMTotals1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Csstt" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMCassette2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Cmd" type="{urn:iso:std:iso:20022:tech:xsd:caam.010.001.02}ATMCommand7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMTransaction26", propOrder = {
    "tpOfOpr",
    "txId",
    "rcncltnId",
    "txRspn",
    "atmTtls",
    "csstt",
    "cmd"
})
public class ATMTransaction26 {

    @XmlElement(name = "TpOfOpr")
    @XmlSchemaType(name = "string")
    protected ATMOperation1Code tpOfOpr;
    @XmlElement(name = "TxId", required = true)
    protected TransactionIdentifier1 txId;
    @XmlElement(name = "RcncltnId", required = true)
    protected String rcncltnId;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType7 txRspn;
    @XmlElement(name = "ATMTtls")
    protected List<ATMTotals1> atmTtls;
    @XmlElement(name = "Csstt")
    protected List<ATMCassette2> csstt;
    @XmlElement(name = "Cmd")
    protected List<ATMCommand7> cmd;

    /**
     * Gets the value of the tpOfOpr property.
     * 
     * @return
     *     possible object is
     *     {@link ATMOperation1Code }
     *     
     */
    public ATMOperation1Code getTpOfOpr() {
        return tpOfOpr;
    }

    /**
     * Sets the value of the tpOfOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMOperation1Code }
     *     
     */
    public void setTpOfOpr(ATMOperation1Code value) {
        this.tpOfOpr = value;
    }

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
     * Gets the value of the rcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcncltnId() {
        return rcncltnId;
    }

    /**
     * Sets the value of the rcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcncltnId(String value) {
        this.rcncltnId = value;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public void setTxRspn(ResponseType7 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the atmTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the atmTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATMTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTotals1 }
     * 
     * 
     * @return
     *     The value of the atmTtls property.
     */
    public List<ATMTotals1> getATMTtls() {
        if (atmTtls == null) {
            atmTtls = new ArrayList<>();
        }
        return this.atmTtls;
    }

    /**
     * Gets the value of the csstt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the csstt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCsstt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMCassette2 }
     * 
     * 
     * @return
     *     The value of the csstt property.
     */
    public List<ATMCassette2> getCsstt() {
        if (csstt == null) {
            csstt = new ArrayList<>();
        }
        return this.csstt;
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
