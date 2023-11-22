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

package org.jpos.iso20022.caaa_023_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentTokenIdentifiers1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentTokenIdentifiers1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrvdrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max35Text"/>
 *         <element name="RqstrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.023.001.03}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentTokenIdentifiers1", propOrder = {
    "prvdrId",
    "rqstrId"
})
public class PaymentTokenIdentifiers1 {

    @XmlElement(name = "PrvdrId", required = true)
    protected String prvdrId;
    @XmlElement(name = "RqstrId", required = true)
    protected String rqstrId;

    /**
     * Gets the value of the prvdrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrvdrId() {
        return prvdrId;
    }

    /**
     * Sets the value of the prvdrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrvdrId(String value) {
        this.prvdrId = value;
    }

    /**
     * Gets the value of the rqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrId() {
        return rqstrId;
    }

    /**
     * Sets the value of the rqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqstrId(String value) {
        this.rqstrId = value;
    }

}
