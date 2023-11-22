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

package org.jpos.iso20022.auth_029_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductClassificationCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProductClassificationCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}CFIOct2015Identifier" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnqPdctIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Max52Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductClassificationCriteria1", propOrder = {
    "clssfctnFinInstrm",
    "unqPdctIdr"
})
public class ProductClassificationCriteria1 {

    @XmlElement(name = "ClssfctnFinInstrm")
    protected List<String> clssfctnFinInstrm;
    @XmlElement(name = "UnqPdctIdr")
    protected List<String> unqPdctIdr;

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clssfctnFinInstrm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClssfctnFinInstrm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the clssfctnFinInstrm property.
     */
    public List<String> getClssfctnFinInstrm() {
        if (clssfctnFinInstrm == null) {
            clssfctnFinInstrm = new ArrayList<>();
        }
        return this.clssfctnFinInstrm;
    }

    /**
     * Gets the value of the unqPdctIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unqPdctIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnqPdctIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the unqPdctIdr property.
     */
    public List<String> getUnqPdctIdr() {
        if (unqPdctIdr == null) {
            unqPdctIdr = new ArrayList<>();
        }
        return this.unqPdctIdr;
    }

}
