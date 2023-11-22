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

package org.jpos.iso20022.pain_002_001_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackerData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TrackerData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ConfdDt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}DateAndDateTime2Choice"/>
 *         <element name="ConfdAmt" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}ActiveCurrencyAndAmount"/>
 *         <element name="TrckrRcrd" type="{urn:iso:std:iso:20022:tech:xsd:pain.002.001.13}TrackerRecord1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackerData1", propOrder = {
    "confdDt",
    "confdAmt",
    "trckrRcrd"
})
public class TrackerData1 {

    @XmlElement(name = "ConfdDt", required = true)
    protected DateAndDateTime2Choice confdDt;
    @XmlElement(name = "ConfdAmt", required = true)
    protected ActiveCurrencyAndAmount confdAmt;
    @XmlElement(name = "TrckrRcrd", required = true)
    protected List<TrackerRecord1> trckrRcrd;

    /**
     * Gets the value of the confdDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getConfdDt() {
        return confdDt;
    }

    /**
     * Sets the value of the confdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setConfdDt(DateAndDateTime2Choice value) {
        this.confdDt = value;
    }

    /**
     * Gets the value of the confdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getConfdAmt() {
        return confdAmt;
    }

    /**
     * Sets the value of the confdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setConfdAmt(ActiveCurrencyAndAmount value) {
        this.confdAmt = value;
    }

    /**
     * Gets the value of the trckrRcrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trckrRcrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckrRcrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackerRecord1 }
     * 
     * 
     * @return
     *     The value of the trckrRcrd property.
     */
    public List<TrackerRecord1> getTrckrRcrd() {
        if (trckrRcrd == null) {
            trckrRcrd = new ArrayList<>();
        }
        return this.trckrRcrd;
    }

}
