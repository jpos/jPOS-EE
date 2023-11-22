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

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueTransactionIdentifier1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UniqueTransactionIdentifier1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="UnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}UTIIdentifier"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:auth.030.001.03}GenericIdentification179"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueTransactionIdentifier1Choice", propOrder = {
    "unqTxIdr",
    "prtry"
})
public class UniqueTransactionIdentifier1Choice {

    @XmlElement(name = "UnqTxIdr")
    protected String unqTxIdr;
    @XmlElement(name = "Prtry")
    protected GenericIdentification179 prtry;

    /**
     * Gets the value of the unqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTxIdr() {
        return unqTxIdr;
    }

    /**
     * Sets the value of the unqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTxIdr(String value) {
        this.unqTxIdr = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification179 }
     *     
     */
    public GenericIdentification179 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification179 }
     *     
     */
    public void setPrtry(GenericIdentification179 value) {
        this.prtry = value;
    }

}
