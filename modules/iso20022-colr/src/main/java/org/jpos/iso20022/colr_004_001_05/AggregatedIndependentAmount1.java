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

package org.jpos.iso20022.colr_004_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AggregatedIndependentAmount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AggregatedIndependentAmount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Trad" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}IndependentAmount1" minOccurs="0"/>
 *         <element name="ValAtRsk" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}IndependentAmount1" minOccurs="0"/>
 *         <element name="NetOpnPos" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}IndependentAmount1" minOccurs="0"/>
 *         <element name="OthrAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.004.001.05}IndependentAmount2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatedIndependentAmount1", propOrder = {
    "trad",
    "valAtRsk",
    "netOpnPos",
    "othrAmt"
})
public class AggregatedIndependentAmount1 {

    @XmlElement(name = "Trad")
    protected IndependentAmount1 trad;
    @XmlElement(name = "ValAtRsk")
    protected IndependentAmount1 valAtRsk;
    @XmlElement(name = "NetOpnPos")
    protected IndependentAmount1 netOpnPos;
    @XmlElement(name = "OthrAmt")
    protected List<IndependentAmount2> othrAmt;

    /**
     * Gets the value of the trad property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getTrad() {
        return trad;
    }

    /**
     * Sets the value of the trad property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public void setTrad(IndependentAmount1 value) {
        this.trad = value;
    }

    /**
     * Gets the value of the valAtRsk property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getValAtRsk() {
        return valAtRsk;
    }

    /**
     * Sets the value of the valAtRsk property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public void setValAtRsk(IndependentAmount1 value) {
        this.valAtRsk = value;
    }

    /**
     * Gets the value of the netOpnPos property.
     * 
     * @return
     *     possible object is
     *     {@link IndependentAmount1 }
     *     
     */
    public IndependentAmount1 getNetOpnPos() {
        return netOpnPos;
    }

    /**
     * Sets the value of the netOpnPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndependentAmount1 }
     *     
     */
    public void setNetOpnPos(IndependentAmount1 value) {
        this.netOpnPos = value;
    }

    /**
     * Gets the value of the othrAmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndependentAmount2 }
     * 
     * 
     * @return
     *     The value of the othrAmt property.
     */
    public List<IndependentAmount2> getOthrAmt() {
        if (othrAmt == null) {
            othrAmt = new ArrayList<>();
        }
        return this.othrAmt;
    }

}
