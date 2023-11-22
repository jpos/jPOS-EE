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

package org.jpos.iso20022.caaa_011_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentDataSet34 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentDataSet34">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}DataSetIdentification5"/>
 *         <element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}Traceability8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DataSetInitr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}GenericIdentification176" minOccurs="0"/>
 *         <element name="TxTtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TransactionTotals12" maxOccurs="unbounded"/>
 *         <element name="CmonData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CommonData12" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentDataSetTransaction11Choice" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet34", propOrder = {
    "dataSetId",
    "tracblt",
    "dataSetInitr",
    "txTtls",
    "cmonData",
    "tx"
})
public class CardPaymentDataSet34 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification5 dataSetId;
    @XmlElement(name = "Tracblt")
    protected List<Traceability8> tracblt;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification176 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "CmonData")
    protected CommonData12 cmonData;
    @XmlElement(name = "Tx", required = true)
    protected List<CardPaymentDataSetTransaction11Choice> tx;

    /**
     * Gets the value of the dataSetId property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public DataSetIdentification5 getDataSetId() {
        return dataSetId;
    }

    /**
     * Sets the value of the dataSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification5 }
     *     
     */
    public void setDataSetId(DataSetIdentification5 value) {
        this.dataSetId = value;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability8 }
     * 
     * 
     * @return
     *     The value of the tracblt property.
     */
    public List<Traceability8> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<>();
        }
        return this.tracblt;
    }

    /**
     * Gets the value of the dataSetInitr property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification176 }
     *     
     */
    public GenericIdentification176 getDataSetInitr() {
        return dataSetInitr;
    }

    /**
     * Sets the value of the dataSetInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification176 }
     *     
     */
    public void setDataSetInitr(GenericIdentification176 value) {
        this.dataSetInitr = value;
    }

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
     * Gets the value of the cmonData property.
     * 
     * @return
     *     possible object is
     *     {@link CommonData12 }
     *     
     */
    public CommonData12 getCmonData() {
        return cmonData;
    }

    /**
     * Sets the value of the cmonData property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommonData12 }
     *     
     */
    public void setCmonData(CommonData12 value) {
        this.cmonData = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSetTransaction11Choice }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<CardPaymentDataSetTransaction11Choice> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
        }
        return this.tx;
    }

}
