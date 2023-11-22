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

package org.jpos.iso20022.casp_001_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyRequest5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyRequest5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CustomerOrder1" minOccurs="0"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyTransaction5"/>
 *         <element name="Data" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyRequestData3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRequest5", propOrder = {
    "cstmrOrdr",
    "tx",
    "data"
})
public class LoyaltyRequest5 {

    @XmlElement(name = "CstmrOrdr")
    protected CustomerOrder1 cstmrOrdr;
    @XmlElement(name = "Tx", required = true)
    protected LoyaltyTransaction5 tx;
    @XmlElement(name = "Data")
    protected List<LoyaltyRequestData3> data;

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerOrder1 }
     *     
     */
    public CustomerOrder1 getCstmrOrdr() {
        return cstmrOrdr;
    }

    /**
     * Sets the value of the cstmrOrdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerOrder1 }
     *     
     */
    public void setCstmrOrdr(CustomerOrder1 value) {
        this.cstmrOrdr = value;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyTransaction5 }
     *     
     */
    public LoyaltyTransaction5 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyTransaction5 }
     *     
     */
    public void setTx(LoyaltyTransaction5 value) {
        this.tx = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyRequestData3 }
     * 
     * 
     * @return
     *     The value of the data property.
     */
    public List<LoyaltyRequestData3> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return this.data;
    }

}
