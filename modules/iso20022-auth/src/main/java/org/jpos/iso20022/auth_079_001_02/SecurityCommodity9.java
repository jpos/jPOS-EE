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

package org.jpos.iso20022.auth_079_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCommodity9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityCommodity9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Scty" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Security51" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Cmmdty" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Commodity43" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCommodity9", propOrder = {
    "scty",
    "cmmdty"
})
public class SecurityCommodity9 {

    @XmlElement(name = "Scty")
    protected List<Security51> scty;
    @XmlElement(name = "Cmmdty")
    protected List<Commodity43> cmmdty;

    /**
     * Gets the value of the scty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the scty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Security51 }
     * 
     * 
     * @return
     *     The value of the scty property.
     */
    public List<Security51> getScty() {
        if (scty == null) {
            scty = new ArrayList<>();
        }
        return this.scty;
    }

    /**
     * Gets the value of the cmmdty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cmmdty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCmmdty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commodity43 }
     * 
     * 
     * @return
     *     The value of the cmmdty property.
     */
    public List<Commodity43> getCmmdty() {
        if (cmmdty == null) {
            cmmdty = new ArrayList<>();
        }
        return this.cmmdty;
    }

}
