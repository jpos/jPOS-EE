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

package org.jpos.iso20022.camt_008_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueueTransactionIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="QueueTransactionIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QId" type="{urn:iso:std:iso:20022:tech:xsd:camt.008.001.10}Max16Text"/>
 *         <element name="PosInQ" type="{urn:iso:std:iso:20022:tech:xsd:camt.008.001.10}Max16Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueTransactionIdentification1", propOrder = {
    "qId",
    "posInQ"
})
public class QueueTransactionIdentification1 {

    @XmlElement(name = "QId", required = true)
    protected String qId;
    @XmlElement(name = "PosInQ", required = true)
    protected String posInQ;

    /**
     * Gets the value of the qId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQId() {
        return qId;
    }

    /**
     * Sets the value of the qId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQId(String value) {
        this.qId = value;
    }

    /**
     * Gets the value of the posInQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosInQ() {
        return posInQ;
    }

    /**
     * Sets the value of the posInQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosInQ(String value) {
        this.posInQ = value;
    }

}
