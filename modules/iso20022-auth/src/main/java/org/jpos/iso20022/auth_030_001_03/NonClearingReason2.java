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

package org.jpos.iso20022.auth_030_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonClearingReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NonClearingReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClrXmptnXcptn" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}ClearingExemptionException1Code" maxOccurs="unbounded"/>
 *         <element name="NonClrRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonClearingReason2", propOrder = {
    "clrXmptnXcptn",
    "nonClrRsnInf"
})
public class NonClearingReason2 {

    @XmlElement(name = "ClrXmptnXcptn", required = true)
    @XmlSchemaType(name = "string")
    protected List<ClearingExemptionException1Code> clrXmptnXcptn;
    @XmlElement(name = "NonClrRsnInf")
    protected String nonClrRsnInf;

    /**
     * Gets the value of the clrXmptnXcptn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clrXmptnXcptn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClrXmptnXcptn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingExemptionException1Code }
     * 
     * 
     * @return
     *     The value of the clrXmptnXcptn property.
     */
    public List<ClearingExemptionException1Code> getClrXmptnXcptn() {
        if (clrXmptnXcptn == null) {
            clrXmptnXcptn = new ArrayList<>();
        }
        return this.clrXmptnXcptn;
    }

    /**
     * Gets the value of the nonClrRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonClrRsnInf() {
        return nonClrRsnInf;
    }

    /**
     * Sets the value of the nonClrRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonClrRsnInf(String value) {
        this.nonClrRsnInf = value;
    }

}
