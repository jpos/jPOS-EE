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

package org.jpos.iso20022.camt_006_001_10;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Transactions10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Transactions10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtCmonInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PaymentCommon5" minOccurs="0"/>
 *         <element name="TxsSummry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}NumberAndSumOfTransactions2" minOccurs="0"/>
 *         <element name="TxRpt" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}TransactionReport7" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transactions10", propOrder = {
    "pmtCmonInf",
    "txsSummry",
    "txRpt"
})
public class Transactions10 {

    @XmlElement(name = "PmtCmonInf")
    protected PaymentCommon5 pmtCmonInf;
    @XmlElement(name = "TxsSummry")
    protected NumberAndSumOfTransactions2 txsSummry;
    @XmlElement(name = "TxRpt", required = true)
    protected List<TransactionReport7> txRpt;

    /**
     * Gets the value of the pmtCmonInf property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCommon5 }
     *     
     */
    public PaymentCommon5 getPmtCmonInf() {
        return pmtCmonInf;
    }

    /**
     * Sets the value of the pmtCmonInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCommon5 }
     *     
     */
    public void setPmtCmonInf(PaymentCommon5 value) {
        this.pmtCmonInf = value;
    }

    /**
     * Gets the value of the txsSummry property.
     * 
     * @return
     *     possible object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public NumberAndSumOfTransactions2 getTxsSummry() {
        return txsSummry;
    }

    /**
     * Sets the value of the txsSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberAndSumOfTransactions2 }
     *     
     */
    public void setTxsSummry(NumberAndSumOfTransactions2 value) {
        this.txsSummry = value;
    }

    /**
     * Gets the value of the txRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionReport7 }
     * 
     * 
     * @return
     *     The value of the txRpt property.
     */
    public List<TransactionReport7> getTxRpt() {
        if (txRpt == null) {
            txRpt = new ArrayList<>();
        }
        return this.txRpt;
    }

}
