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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderDesk1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OrderDesk1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrdrDsk" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ContactAttributes5" minOccurs="0"/>
 *         <element name="ClsrDts" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderDesk1", propOrder = {
    "ordrDsk",
    "clsrDts",
    "addtlInf"
})
public class OrderDesk1 {

    @XmlElement(name = "OrdrDsk")
    protected ContactAttributes5 ordrDsk;
    @XmlElement(name = "ClsrDts")
    @XmlSchemaType(name = "date")
    protected List<XMLGregorianCalendar> clsrDts;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation15> addtlInf;

    /**
     * Gets the value of the ordrDsk property.
     * 
     * @return
     *     possible object is
     *     {@link ContactAttributes5 }
     *     
     */
    public ContactAttributes5 getOrdrDsk() {
        return ordrDsk;
    }

    /**
     * Sets the value of the ordrDsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactAttributes5 }
     *     
     */
    public void setOrdrDsk(ContactAttributes5 value) {
        this.ordrDsk = value;
    }

    /**
     * Gets the value of the clsrDts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clsrDts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsrDts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the clsrDts property.
     */
    public List<XMLGregorianCalendar> getClsrDts() {
        if (clsrDts == null) {
            clsrDts = new ArrayList<>();
        }
        return this.clsrDts;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation15 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation15> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
