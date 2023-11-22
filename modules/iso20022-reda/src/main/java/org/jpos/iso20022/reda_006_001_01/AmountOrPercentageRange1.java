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

package org.jpos.iso20022.reda_006_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountOrPercentageRange1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AmountOrPercentageRange1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Opr" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Operation1Code" minOccurs="0"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:reda.006.001.01}Term1" maxOccurs="10" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOrPercentageRange1", propOrder = {
    "opr",
    "term"
})
public class AmountOrPercentageRange1 {

    @XmlElement(name = "Opr")
    @XmlSchemaType(name = "string")
    protected Operation1Code opr;
    @XmlElement(name = "Term")
    protected List<Term1> term;

    /**
     * Gets the value of the opr property.
     * 
     * @return
     *     possible object is
     *     {@link Operation1Code }
     *     
     */
    public Operation1Code getOpr() {
        return opr;
    }

    /**
     * Sets the value of the opr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Operation1Code }
     *     
     */
    public void setOpr(Operation1Code value) {
        this.opr = value;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Term1 }
     * 
     * 
     * @return
     *     The value of the term property.
     */
    public List<Term1> getTerm() {
        if (term == null) {
            term = new ArrayList<>();
        }
        return this.term;
    }

}
