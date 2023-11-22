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

package org.jpos.iso20022.auth_072_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InternalisationData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InternalisationData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Aggt" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData2"/>
 *         <element name="FaildRate" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationDataRate1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalisationData1", propOrder = {
    "aggt",
    "faildRate"
})
public class InternalisationData1 {

    @XmlElement(name = "Aggt", required = true)
    protected InternalisationData2 aggt;
    @XmlElement(name = "FaildRate", required = true)
    protected InternalisationDataRate1 faildRate;

    /**
     * Gets the value of the aggt property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData2 }
     *     
     */
    public InternalisationData2 getAggt() {
        return aggt;
    }

    /**
     * Sets the value of the aggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData2 }
     *     
     */
    public void setAggt(InternalisationData2 value) {
        this.aggt = value;
    }

    /**
     * Gets the value of the faildRate property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataRate1 }
     *     
     */
    public InternalisationDataRate1 getFaildRate() {
        return faildRate;
    }

    /**
     * Sets the value of the faildRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataRate1 }
     *     
     */
    public void setFaildRate(InternalisationDataRate1 value) {
        this.faildRate = value;
    }

}
