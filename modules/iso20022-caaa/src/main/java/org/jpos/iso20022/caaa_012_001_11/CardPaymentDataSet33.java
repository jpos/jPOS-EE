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
 * <p>Java class for CardPaymentDataSet33 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentDataSet33">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DataSetId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}DataSetIdentification5"/>
 *         <element name="DataSetRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}ResponseType10"/>
 *         <element name="RmvDataSet" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TrueFalseIndicator"/>
 *         <element name="DataSetInitr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}GenericIdentification176" minOccurs="0"/>
 *         <element name="TxTtls" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TransactionTotals12" maxOccurs="unbounded"/>
 *         <element name="RjctdTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardPaymentDataSet32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SspdTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardPaymentDataSet32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RsmdApprvl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardPaymentDataSet32" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RsmdRjctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardPaymentDataSet32" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSet33", propOrder = {
    "dataSetId",
    "dataSetRslt",
    "rmvDataSet",
    "dataSetInitr",
    "txTtls",
    "rjctdTx",
    "sspdTx",
    "rsmdApprvl",
    "rsmdRjctn"
})
public class CardPaymentDataSet33 {

    @XmlElement(name = "DataSetId", required = true)
    protected DataSetIdentification5 dataSetId;
    @XmlElement(name = "DataSetRslt", required = true)
    protected ResponseType10 dataSetRslt;
    @XmlElement(name = "RmvDataSet")
    protected boolean rmvDataSet;
    @XmlElement(name = "DataSetInitr")
    protected GenericIdentification176 dataSetInitr;
    @XmlElement(name = "TxTtls", required = true)
    protected List<TransactionTotals12> txTtls;
    @XmlElement(name = "RjctdTx")
    protected List<CardPaymentDataSet32> rjctdTx;
    @XmlElement(name = "SspdTx")
    protected List<CardPaymentDataSet32> sspdTx;
    @XmlElement(name = "RsmdApprvl")
    protected List<CardPaymentDataSet32> rsmdApprvl;
    @XmlElement(name = "RsmdRjctn")
    protected List<CardPaymentDataSet32> rsmdRjctn;

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
     * Gets the value of the dataSetRslt property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType10 }
     *     
     */
    public ResponseType10 getDataSetRslt() {
        return dataSetRslt;
    }

    /**
     * Sets the value of the dataSetRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType10 }
     *     
     */
    public void setDataSetRslt(ResponseType10 value) {
        this.dataSetRslt = value;
    }

    /**
     * Gets the value of the rmvDataSet property.
     * 
     */
    public boolean isRmvDataSet() {
        return rmvDataSet;
    }

    /**
     * Sets the value of the rmvDataSet property.
     * 
     */
    public void setRmvDataSet(boolean value) {
        this.rmvDataSet = value;
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
     * Gets the value of the rjctdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rjctdTx property.
     */
    public List<CardPaymentDataSet32> getRjctdTx() {
        if (rjctdTx == null) {
            rjctdTx = new ArrayList<>();
        }
        return this.rjctdTx;
    }

    /**
     * Gets the value of the sspdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sspdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSspdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the sspdTx property.
     */
    public List<CardPaymentDataSet32> getSspdTx() {
        if (sspdTx == null) {
            sspdTx = new ArrayList<>();
        }
        return this.sspdTx;
    }

    /**
     * Gets the value of the rsmdApprvl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsmdApprvl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdApprvl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rsmdApprvl property.
     */
    public List<CardPaymentDataSet32> getRsmdApprvl() {
        if (rsmdApprvl == null) {
            rsmdApprvl = new ArrayList<>();
        }
        return this.rsmdApprvl;
    }

    /**
     * Gets the value of the rsmdRjctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rsmdRjctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRsmdRjctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentDataSet32 }
     * 
     * 
     * @return
     *     The value of the rsmdRjctn property.
     */
    public List<CardPaymentDataSet32> getRsmdRjctn() {
        if (rsmdRjctn == null) {
            rsmdRjctn = new ArrayList<>();
        }
        return this.rsmdRjctn;
    }

}
