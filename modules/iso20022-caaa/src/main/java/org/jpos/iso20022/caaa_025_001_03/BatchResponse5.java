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

package org.jpos.iso20022.caaa_025_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchResponse5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BatchResponse5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SaleBtchId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="POIBtchId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}TransactionIdentifier1" minOccurs="0"/>
 *         <element name="PrfrmdTx" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}PerformedTransaction5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchResponse5", propOrder = {
    "saleBtchId",
    "poiBtchId",
    "prfrmdTx"
})
public class BatchResponse5 {

    @XmlElement(name = "SaleBtchId")
    protected TransactionIdentifier1 saleBtchId;
    @XmlElement(name = "POIBtchId")
    protected TransactionIdentifier1 poiBtchId;
    @XmlElement(name = "PrfrmdTx")
    protected List<PerformedTransaction5> prfrmdTx;

    /**
     * Gets the value of the saleBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getSaleBtchId() {
        return saleBtchId;
    }

    /**
     * Sets the value of the saleBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setSaleBtchId(TransactionIdentifier1 value) {
        this.saleBtchId = value;
    }

    /**
     * Gets the value of the poiBtchId property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public TransactionIdentifier1 getPOIBtchId() {
        return poiBtchId;
    }

    /**
     * Sets the value of the poiBtchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionIdentifier1 }
     *     
     */
    public void setPOIBtchId(TransactionIdentifier1 value) {
        this.poiBtchId = value;
    }

    /**
     * Gets the value of the prfrmdTx property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prfrmdTx property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrfrmdTx().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformedTransaction5 }
     * 
     * 
     * @return
     *     The value of the prfrmdTx property.
     */
    public List<PerformedTransaction5> getPrfrmdTx() {
        if (prfrmdTx == null) {
            prfrmdTx = new ArrayList<>();
        }
        return this.prfrmdTx;
    }

}
