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

package org.jpos.iso20022.camt_074_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for References14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="References14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctOwnrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="AcctSvcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MktInfrstrctrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PrcrTxId" type="{urn:iso:std:iso:20022:tech:xsd:camt.074.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PoolId" type="{urn:iso:std:iso:20022:tech:xsd:camt.074.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "References14", propOrder = {
    "acctOwnrTxId",
    "acctSvcrTxId",
    "mktInfrstrctrTxId",
    "prcrTxId",
    "poolId"
})
public class References14 {

    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "AcctSvcrTxId")
    protected String acctSvcrTxId;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;
    @XmlElement(name = "PrcrTxId")
    protected String prcrTxId;
    @XmlElement(name = "PoolId")
    protected String poolId;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
    }

    /**
     * Gets the value of the acctSvcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctSvcrTxId() {
        return acctSvcrTxId;
    }

    /**
     * Sets the value of the acctSvcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctSvcrTxId(String value) {
        this.acctSvcrTxId = value;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
    }

    /**
     * Gets the value of the prcrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcrTxId() {
        return prcrTxId;
    }

    /**
     * Sets the value of the prcrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcrTxId(String value) {
        this.prcrTxId = value;
    }

    /**
     * Gets the value of the poolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolId() {
        return poolId;
    }

    /**
     * Sets the value of the poolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolId(String value) {
        this.poolId = value;
    }

}
