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

package org.jpos.iso20022.caaa_012_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentBatchTransferResponse10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentBatchTransferResponse10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TransactionTotals12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DataSet" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardPaymentDataSet33" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentBatchTransferResponse10", propOrder = {
    "txTtls",
    "dataSet"
})
public class CardPaymentBatchTransferResponse10 {

    @XmlElement(name = "TxTtls")
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "DataSet")
    protected List<CardPaymentDataSet33> dataSet;

    /**
     * Gets the value of the txTtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txTtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxTtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionTotals12 }
     * 
     * 
     * @return
     *     The value of the txTtls property.
     */
    public List<TransactionTotals12> getTxTtls() {
        if (txTtls == null) {
            txTtls = new ArrayList<>();
        }
        return this.txTtls;
    }

    /**
     * Gets the value of the dataSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet33 }
     * 
     * 
     * @return
     *     The value of the dataSet property.
     */
    public List<CardPaymentDataSet33> getDataSet() {
        if (dataSet == null) {
            dataSet = new ArrayList<>();
        }
        return this.dataSet;
    }

}
