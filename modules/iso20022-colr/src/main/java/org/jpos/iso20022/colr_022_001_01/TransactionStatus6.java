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

package org.jpos.iso20022.colr_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionStatus6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CvrgSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralStatus1Code" minOccurs="0"/>
 *         <element name="ExctnSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.022.001.01}CollateralStatus2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus6", propOrder = {
    "cvrgSts",
    "exctnSts"
})
public class TransactionStatus6 {

    @XmlElement(name = "CvrgSts")
    @XmlSchemaType(name = "string")
    protected CollateralStatus1Code cvrgSts;
    @XmlElement(name = "ExctnSts")
    protected CollateralStatus2Choice exctnSts;

    /**
     * Gets the value of the cvrgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public CollateralStatus1Code getCvrgSts() {
        return cvrgSts;
    }

    /**
     * Sets the value of the cvrgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus1Code }
     *     
     */
    public void setCvrgSts(CollateralStatus1Code value) {
        this.cvrgSts = value;
    }

    /**
     * Gets the value of the exctnSts property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralStatus2Choice }
     *     
     */
    public CollateralStatus2Choice getExctnSts() {
        return exctnSts;
    }

    /**
     * Sets the value of the exctnSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralStatus2Choice }
     *     
     */
    public void setExctnSts(CollateralStatus2Choice value) {
        this.exctnSts = value;
    }

}
