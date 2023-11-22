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

package org.jpos.iso20022.auth_092_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedTransactionStatistics30 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedTransactionStatistics30">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="TtlNbOfTxsAccptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="TtlNbOfTxsRjctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber"/>
 *         <element name="TtlCrrctdRjctns" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}Max20PositiveNumber" minOccurs="0"/>
 *         <element name="TxsRjctnsRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.092.001.04}RejectionReason71" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics30", propOrder = {
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "ttlCrrctdRjctns",
    "txsRjctnsRsn"
})
public class DetailedTransactionStatistics30 {

    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected BigDecimal ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected BigDecimal ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected BigDecimal ttlNbOfTxsRjctd;
    @XmlElement(name = "TtlCrrctdRjctns")
    protected BigDecimal ttlCrrctdRjctns;
    @XmlElement(name = "TxsRjctnsRsn")
    protected List<RejectionReason71> txsRjctnsRsn;

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxs(BigDecimal value) {
        this.ttlNbOfTxs = value;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxsAccptd(BigDecimal value) {
        this.ttlNbOfTxsAccptd = value;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbOfTxsRjctd(BigDecimal value) {
        this.ttlNbOfTxsRjctd = value;
    }

    /**
     * Gets the value of the ttlCrrctdRjctns property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlCrrctdRjctns() {
        return ttlCrrctdRjctns;
    }

    /**
     * Sets the value of the ttlCrrctdRjctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlCrrctdRjctns(BigDecimal value) {
        this.ttlCrrctdRjctns = value;
    }

    /**
     * Gets the value of the txsRjctnsRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txsRjctnsRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxsRjctnsRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason71 }
     * 
     * 
     * @return
     *     The value of the txsRjctnsRsn property.
     */
    public List<RejectionReason71> getTxsRjctnsRsn() {
        if (txsRjctnsRsn == null) {
            txsRjctnsRsn = new ArrayList<>();
        }
        return this.txsRjctnsRsn;
    }

}
