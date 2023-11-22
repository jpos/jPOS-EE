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

package org.jpos.iso20022.auth_107_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentType5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentType5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}PaymentType4Code"/>
 *         <element name="PrtryTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Max4AlphaNumericText"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType5Choice", propOrder = {
    "tp",
    "prtryTp"
})
public class PaymentType5Choice {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected PaymentType4Code tp;
    @XmlElement(name = "PrtryTp")
    protected String prtryTp;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType4Code }
     *     
     */
    public PaymentType4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType4Code }
     *     
     */
    public void setTp(PaymentType4Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the prtryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryTp() {
        return prtryTp;
    }

    /**
     * Sets the value of the prtryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryTp(String value) {
        this.prtryTp = value;
    }

}
