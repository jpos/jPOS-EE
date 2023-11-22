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

package org.jpos.iso20022.auth_107_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuantityOrTerm1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QuantityOrTerm1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SchdlPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Schedule10" maxOccurs="unbounded"/>
 *         <element name="Term" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}QuantityTerm1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityOrTerm1Choice", propOrder = {
    "schdlPrd",
    "term"
})
public class QuantityOrTerm1Choice {

    @XmlElement(name = "SchdlPrd")
    protected List<Schedule10> schdlPrd;
    @XmlElement(name = "Term")
    protected QuantityTerm1 term;

    /**
     * Gets the value of the schdlPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schdlPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdlPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule10 }
     * 
     * 
     * @return
     *     The value of the schdlPrd property.
     */
    public List<Schedule10> getSchdlPrd() {
        if (schdlPrd == null) {
            schdlPrd = new ArrayList<>();
        }
        return this.schdlPrd;
    }

    /**
     * Gets the value of the term property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTerm1 }
     *     
     */
    public QuantityTerm1 getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTerm1 }
     *     
     */
    public void setTerm(QuantityTerm1 value) {
        this.term = value;
    }

}
