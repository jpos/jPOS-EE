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
 * <p>Java class for KeyChoiceValue2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyChoiceValue2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NcrptdKeyVal" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}ContentInformationType10" minOccurs="0"/>
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
@XmlType(name = "KeyChoiceValue2", propOrder = {
    "ncrptdKeyVal",
    "trRltdData"
})
public class KeyChoiceValue2 {

    @XmlElement(name = "NcrptdKeyVal")
    protected ContentInformationType10 ncrptdKeyVal;
    @XmlElement(name = "TRRltdData")
    protected TRRelatedData2 trRltdData;

    /**
     * Gets the value of the ncrptdKeyVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getNcrptdKeyVal() {
        return ncrptdKeyVal;
    }

    /**
     * Sets the value of the ncrptdKeyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public void setNcrptdKeyVal(ContentInformationType10 value) {
        this.ncrptdKeyVal = value;
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
