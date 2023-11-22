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

package org.jpos.iso20022.sese_003_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrfOutConf" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}TransferOutConfirmationV09"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "trfOutConf"
})
public class Document {

    @XmlElement(name = "TrfOutConf", required = true)
    protected TransferOutConfirmationV09 trfOutConf;

    /**
     * Gets the value of the trfOutConf property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOutConfirmationV09 }
     *     
     */
    public TransferOutConfirmationV09 getTrfOutConf() {
        return trfOutConf;
    }

    /**
     * Sets the value of the trfOutConf property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOutConfirmationV09 }
     *     
     */
    public void setTrfOutConf(TransferOutConfirmationV09 value) {
        this.trfOutConf = value;
    }

}
