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

package org.jpos.iso20022.tsrv_004_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpiryDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpiryDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XpryTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}ExpiryTerms2" minOccurs="0"/>
 *         <element name="AddtlXpryInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.004.001.01}Max2000Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiryDetails2", propOrder = {
    "xpryTerms",
    "addtlXpryInf"
})
public class ExpiryDetails2 {

    @XmlElement(name = "XpryTerms")
    protected ExpiryTerms2 xpryTerms;
    @XmlElement(name = "AddtlXpryInf")
    protected List<String> addtlXpryInf;

    /**
     * Gets the value of the xpryTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ExpiryTerms2 }
     *     
     */
    public ExpiryTerms2 getXpryTerms() {
        return xpryTerms;
    }

    /**
     * Sets the value of the xpryTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpiryTerms2 }
     *     
     */
    public void setXpryTerms(ExpiryTerms2 value) {
        this.xpryTerms = value;
    }

    /**
     * Gets the value of the addtlXpryInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlXpryInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlXpryInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlXpryInf property.
     */
    public List<String> getAddtlXpryInf() {
        if (addtlXpryInf == null) {
            addtlXpryInf = new ArrayList<>();
        }
        return this.addtlXpryInf;
    }

}
