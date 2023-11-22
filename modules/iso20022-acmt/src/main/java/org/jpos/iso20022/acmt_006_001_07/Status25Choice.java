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

package org.jpos.iso20022.acmt_006_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status25Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status25Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}AccountManagementStatus1Code"/>
 *         <element name="Rjctd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.006.001.07}RejectionReason31" maxOccurs="10"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status25Choice", propOrder = {
    "sts",
    "rjctd"
})
public class Status25Choice {

    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected AccountManagementStatus1Code sts;
    @XmlElement(name = "Rjctd")
    protected List<RejectionReason31> rjctd;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountManagementStatus1Code }
     *     
     */
    public AccountManagementStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountManagementStatus1Code }
     *     
     */
    public void setSts(AccountManagementStatus1Code value) {
        this.sts = value;
    }

    /**
     * Gets the value of the rjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RejectionReason31 }
     * 
     * 
     * @return
     *     The value of the rjctd property.
     */
    public List<RejectionReason31> getRjctd() {
        if (rjctd == null) {
            rjctd = new ArrayList<>();
        }
        return this.rjctd;
    }

}
