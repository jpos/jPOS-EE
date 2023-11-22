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

package org.jpos.iso20022.auth_105_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractTerm6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractTerm6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Opn" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TrueFalseIndicator"/>
 *         <element name="Fxd" type="{urn:iso:std:iso:20022:tech:xsd:auth.105.001.01}TimeToMaturity2Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractTerm6Choice", propOrder = {
    "opn",
    "fxd"
})
public class ContractTerm6Choice {

    @XmlElement(name = "Opn")
    protected Boolean opn;
    @XmlElement(name = "Fxd")
    protected TimeToMaturity2Choice fxd;

    /**
     * Gets the value of the opn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpn() {
        return opn;
    }

    /**
     * Sets the value of the opn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpn(Boolean value) {
        this.opn = value;
    }

    /**
     * Gets the value of the fxd property.
     * 
     * @return
     *     possible object is
     *     {@link TimeToMaturity2Choice }
     *     
     */
    public TimeToMaturity2Choice getFxd() {
        return fxd;
    }

    /**
     * Sets the value of the fxd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeToMaturity2Choice }
     *     
     */
    public void setFxd(TimeToMaturity2Choice value) {
        this.fxd = value;
    }

}
