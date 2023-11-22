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

package org.jpos.iso20022.catp_016_001_01;

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
 *         <element name="ATMTrfReq" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ATMTransferRequestV01"/>
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
    "atmTrfReq"
})
public class Document {

    @XmlElement(name = "ATMTrfReq", required = true)
    protected ATMTransferRequestV01 atmTrfReq;

    /**
     * Gets the value of the atmTrfReq property.
     * 
     * @return
     *     possible object is
     *     {@link ATMTransferRequestV01 }
     *     
     */
    public ATMTransferRequestV01 getATMTrfReq() {
        return atmTrfReq;
    }

    /**
     * Sets the value of the atmTrfReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMTransferRequestV01 }
     *     
     */
    public void setATMTrfReq(ATMTransferRequestV01 value) {
        this.atmTrfReq = value;
    }

}
