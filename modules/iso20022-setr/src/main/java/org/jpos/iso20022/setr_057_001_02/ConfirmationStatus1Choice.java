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

package org.jpos.iso20022.setr_057_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationStatus1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ConfirmationStatus1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ConfRjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}ConfirmationRejectedStatus2" maxOccurs="10"/>
 *         <element name="AmdmntRjctd" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}ConfirmationRejectedStatus2" maxOccurs="10"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:setr.057.001.02}OrderConfirmationStatus1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmationStatus1Choice", propOrder = {
    "confRjctd",
    "amdmntRjctd",
    "sts"
})
public class ConfirmationStatus1Choice {

    @XmlElement(name = "ConfRjctd")
    protected List<ConfirmationRejectedStatus2> confRjctd;
    @XmlElement(name = "AmdmntRjctd")
    protected List<ConfirmationRejectedStatus2> amdmntRjctd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderConfirmationStatus1Code sts;

    /**
     * Gets the value of the confRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the confRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus2 }
     * 
     * 
     * @return
     *     The value of the confRjctd property.
     */
    public List<ConfirmationRejectedStatus2> getConfRjctd() {
        if (confRjctd == null) {
            confRjctd = new ArrayList<>();
        }
        return this.confRjctd;
    }

    /**
     * Gets the value of the amdmntRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amdmntRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmntRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus2 }
     * 
     * 
     * @return
     *     The value of the amdmntRjctd property.
     */
    public List<ConfirmationRejectedStatus2> getAmdmntRjctd() {
        if (amdmntRjctd == null) {
            amdmntRjctd = new ArrayList<>();
        }
        return this.amdmntRjctd;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public OrderConfirmationStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public void setSts(OrderConfirmationStatus1Code value) {
        this.sts = value;
    }

}
