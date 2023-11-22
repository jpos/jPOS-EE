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

package org.jpos.iso20022.semt_021_002_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentNumber14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DocumentNumber14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nb" type="{urn:iso:std:iso:20022:tech:xsd:semt.021.002.08}DocumentNumber6Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentNumber14", propOrder = {
    "nb"
})
public class DocumentNumber14 {

    @XmlElement(name = "Nb", required = true)
    protected DocumentNumber6Choice nb;

    /**
     * Gets the value of the nb property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public DocumentNumber6Choice getNb() {
        return nb;
    }

    /**
     * Sets the value of the nb property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentNumber6Choice }
     *     
     */
    public void setNb(DocumentNumber6Choice value) {
        this.nb = value;
    }

}
