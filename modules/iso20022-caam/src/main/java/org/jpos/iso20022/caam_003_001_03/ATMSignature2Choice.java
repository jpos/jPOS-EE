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

package org.jpos.iso20022.caam_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSignature2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSignature2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ContentInformationType14" minOccurs="0"/>
 *         <element name="TRRltdData" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}TRRelatedData2" minOccurs="0"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSignature2Choice", propOrder = {
    "dgtlSgntr",
    "trRltdData"
})
public class ATMSignature2Choice {

    @XmlElement(name = "DgtlSgntr")
    protected ContentInformationType14 dgtlSgntr;
    @XmlElement(name = "TRRltdData")
    protected TRRelatedData2 trRltdData;

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType14 }
     *     
     */
    public ContentInformationType14 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType14 }
     *     
     */
    public void setDgtlSgntr(ContentInformationType14 value) {
        this.dgtlSgntr = value;
    }

    /**
     * Gets the value of the trRltdData property.
     * 
     * @return
     *     possible object is
     *     {@link TRRelatedData2 }
     *     
     */
    public TRRelatedData2 getTRRltdData() {
        return trRltdData;
    }

    /**
     * Sets the value of the trRltdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRRelatedData2 }
     *     
     */
    public void setTRRltdData(TRRelatedData2 value) {
        this.trRltdData = value;
    }

}
