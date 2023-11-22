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

package org.jpos.iso20022.semt_018_001_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusAndReason44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusAndReason44">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsAndRsn" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}Status38Choice"/>
 *         <element name="Tx" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}Transaction122" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason44", propOrder = {
    "stsAndRsn",
    "tx"
})
public class StatusAndReason44 {

    @XmlElement(name = "StsAndRsn", required = true)
    protected Status38Choice stsAndRsn;
    @XmlElement(name = "Tx")
    protected List<Transaction122> tx;

    /**
     * Gets the value of the stsAndRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Status38Choice }
     *     
     */
    public Status38Choice getStsAndRsn() {
        return stsAndRsn;
    }

    /**
     * Sets the value of the stsAndRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status38Choice }
     *     
     */
    public void setStsAndRsn(Status38Choice value) {
        this.stsAndRsn = value;
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
     * {@link Transaction122 }
     * 
     * 
     * @return
     *     The value of the tx property.
     */
    public List<Transaction122> getTx() {
        if (tx == null) {
            tx = new ArrayList<>();
        }
        return this.tx;
    }

}
