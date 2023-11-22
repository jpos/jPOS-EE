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

package org.jpos.iso20022.casp_002_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StoredValueResponse6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StoredValueResponse6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleTxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="POITxId" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}TransactionIdentifier1"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}StoredValueData6" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Rct" type="{urn:iso:std:iso:20022:tech:xsd:casp.002.001.05}PaymentReceipt5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueResponse6", propOrder = {
    "saleTxId",
    "poiTxId",
    "rslt",
    "rct"
})
public class StoredValueResponse6 {

    @XmlElement(name = "SaleTxId")
    protected TransactionIdentifier1 saleTxId;
    @XmlElement(name = "POITxId", required = true)
    protected TransactionIdentifier1 poiTxId;
    @XmlElement(name = "Rslt")
    protected List<StoredValueData6> rslt;
    @XmlElement(name = "Rct")
    protected List<PaymentReceipt5> rct;

    /**
     * Gets the value of the saleTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleTxId() {
        return saleTxId;
    }

    /**
     * Sets the value of the saleTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setSaleTxId(TransactionIdentifier1 value) {
        this.saleTxId = value;
    }

    /**
     * Gets the value of the poiTxId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOITxId() {
        return poiTxId;
    }

    /**
     * Sets the value of the poiTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setPOITxId(TransactionIdentifier1 value) {
        this.poiTxId = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoredValueData6 }
     * 
     * 
     * @return
     *     The value of the rslt property.
     */
    public List<StoredValueData6> getRslt() {
        if (rslt == null) {
            rslt = new ArrayList<>();
        }
        return this.rslt;
    }

    /**
     * Gets the value of the rct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentReceipt5 }
     * 
     * 
     * @return
     *     The value of the rct property.
     */
    public List<PaymentReceipt5> getRct() {
        if (rct == null) {
            rct = new ArrayList<>();
        }
        return this.rct;
    }

}
