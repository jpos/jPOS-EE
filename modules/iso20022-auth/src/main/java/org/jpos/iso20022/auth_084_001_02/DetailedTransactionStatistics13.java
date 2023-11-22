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

package org.jpos.iso20022.auth_084_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedTransactionStatistics13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedTransactionStatistics13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TtlNbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="TtlNbOfTxsAccptd" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="TtlNbOfTxsRjctd" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max15NumericText"/>
 *         <element name="TxsRjctnsRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}RejectionReason53" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedTransactionStatistics13", propOrder = {
    "ttlNbOfTxs",
    "ttlNbOfTxsAccptd",
    "ttlNbOfTxsRjctd",
    "txsRjctnsRsn"
})
public class DetailedTransactionStatistics13 {

    @XmlElement(name = "TtlNbOfTxs", required = true)
    protected String ttlNbOfTxs;
    @XmlElement(name = "TtlNbOfTxsAccptd", required = true)
    protected String ttlNbOfTxsAccptd;
    @XmlElement(name = "TtlNbOfTxsRjctd", required = true)
    protected String ttlNbOfTxsRjctd;
    @XmlElement(name = "TxsRjctnsRsn")
    protected List<RejectionReason53> txsRjctnsRsn;

    /**
     * Gets the value of the ttlNbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxs() {
        return ttlNbOfTxs;
    }

    /**
     * Sets the value of the ttlNbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfTxs(String value) {
        this.ttlNbOfTxs = value;
    }

    /**
     * Gets the value of the ttlNbOfTxsAccptd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsAccptd() {
        return ttlNbOfTxsAccptd;
    }

    /**
     * Sets the value of the ttlNbOfTxsAccptd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfTxsAccptd(String value) {
        this.ttlNbOfTxsAccptd = value;
    }

    /**
     * Gets the value of the ttlNbOfTxsRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTtlNbOfTxsRjctd() {
        return ttlNbOfTxsRjctd;
    }

    /**
     * Sets the value of the ttlNbOfTxsRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTtlNbOfTxsRjctd(String value) {
        this.ttlNbOfTxsRjctd = value;
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
     * {@link RejectionReason53 }
     * 
     * 
     * @return
     *     The value of the txsRjctnsRsn property.
     */
    public List<RejectionReason53> getTxsRjctnsRsn() {
        if (txsRjctnsRsn == null) {
            txsRjctnsRsn = new ArrayList<>();
        }
        return this.txsRjctnsRsn;
    }

}
