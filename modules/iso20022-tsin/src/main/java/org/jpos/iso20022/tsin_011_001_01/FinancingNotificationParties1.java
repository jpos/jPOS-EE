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

package org.jpos.iso20022.tsin_011_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingNotificationParties1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingNotificationParties1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtifngPty" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="NtfctnRcvr" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         <element name="AckRcvr" type="{http://www.w3.org/2001/XMLSchema}IDREF" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingNotificationParties1", propOrder = {
    "ntifngPty",
    "ntfctnRcvr",
    "ackRcvr"
})
public class FinancingNotificationParties1 {

    @XmlElement(name = "NtifngPty", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntifngPty;
    @XmlElement(name = "NtfctnRcvr", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object ntfctnRcvr;
    @XmlElementRef(name = "AckRcvr", namespace = "urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01", type = JAXBElement.class, required = false)
    protected List<JAXBElement<Object>> ackRcvr;

    /**
     * Gets the value of the ntifngPty property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtifngPty() {
        return ntifngPty;
    }

    /**
     * Sets the value of the ntifngPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNtifngPty(Object value) {
        this.ntifngPty = value;
    }

    /**
     * Gets the value of the ntfctnRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getNtfctnRcvr() {
        return ntfctnRcvr;
    }

    /**
     * Sets the value of the ntfctnRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setNtfctnRcvr(Object value) {
        this.ntfctnRcvr = value;
    }

    /**
     * Gets the value of the ackRcvr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ackRcvr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAckRcvr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     * @return
     *     The value of the ackRcvr property.
     */
    public List<JAXBElement<Object>> getAckRcvr() {
        if (ackRcvr == null) {
            ackRcvr = new ArrayList<>();
        }
        return this.ackRcvr;
    }

}
