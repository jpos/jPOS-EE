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

package org.jpos.iso20022.camt_019_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemAvailabilityAndEvents3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemAvailabilityAndEvents3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SysCcy" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="SsnPrd" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}TimePeriod1" minOccurs="0"/>
 *         <element name="Evt" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemEvent3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClsrInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}SystemClosure2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemAvailabilityAndEvents3", propOrder = {
    "sysCcy",
    "ssnPrd",
    "evt",
    "clsrInf"
})
public class SystemAvailabilityAndEvents3 {

    @XmlElement(name = "SysCcy")
    protected String sysCcy;
    @XmlElement(name = "SsnPrd")
    protected TimePeriod1 ssnPrd;
    @XmlElement(name = "Evt")
    protected List<SystemEvent3> evt;
    @XmlElement(name = "ClsrInf")
    protected List<SystemClosure2> clsrInf;

    /**
     * Gets the value of the sysCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysCcy() {
        return sysCcy;
    }

    /**
     * Sets the value of the sysCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysCcy(String value) {
        this.sysCcy = value;
    }

    /**
     * Gets the value of the ssnPrd property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriod1 }
     *     
     */
    public TimePeriod1 getSsnPrd() {
        return ssnPrd;
    }

    /**
     * Sets the value of the ssnPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriod1 }
     *     
     */
    public void setSsnPrd(TimePeriod1 value) {
        this.ssnPrd = value;
    }

    /**
     * Gets the value of the evt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the evt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemEvent3 }
     * 
     * 
     * @return
     *     The value of the evt property.
     */
    public List<SystemEvent3> getEvt() {
        if (evt == null) {
            evt = new ArrayList<>();
        }
        return this.evt;
    }

    /**
     * Gets the value of the clsrInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clsrInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsrInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemClosure2 }
     * 
     * 
     * @return
     *     The value of the clsrInf property.
     */
    public List<SystemClosure2> getClsrInf() {
        if (clsrInf == null) {
            clsrInf = new ArrayList<>();
        }
        return this.clsrInf;
    }

}
