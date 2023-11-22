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

package org.jpos.iso20022.catp_007_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMService19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMService19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMServiceType8Code"/>
 *         <element name="SvcVarnt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMService18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Lmts" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMTransactionAmounts6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMService19", propOrder = {
    "svcTp",
    "svcVarnt",
    "lmts"
})
public class ATMService19 {

    @XmlElement(name = "SvcTp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMServiceType8Code svcTp;
    @XmlElement(name = "SvcVarnt")
    protected List<ATMService18> svcVarnt;
    @XmlElement(name = "Lmts")
    protected List<ATMTransactionAmounts6> lmts;

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMServiceType8Code }
     *     
     */
    public ATMServiceType8Code getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMServiceType8Code }
     *     
     */
    public void setSvcTp(ATMServiceType8Code value) {
        this.svcTp = value;
    }

    /**
     * Gets the value of the svcVarnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svcVarnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcVarnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMService18 }
     * 
     * 
     * @return
     *     The value of the svcVarnt property.
     */
    public List<ATMService18> getSvcVarnt() {
        if (svcVarnt == null) {
            svcVarnt = new ArrayList<>();
        }
        return this.svcVarnt;
    }

    /**
     * Gets the value of the lmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMTransactionAmounts6 }
     * 
     * 
     * @return
     *     The value of the lmts property.
     */
    public List<ATMTransactionAmounts6> getLmts() {
        if (lmts == null) {
            lmts = new ArrayList<>();
        }
        return this.lmts;
    }

}
