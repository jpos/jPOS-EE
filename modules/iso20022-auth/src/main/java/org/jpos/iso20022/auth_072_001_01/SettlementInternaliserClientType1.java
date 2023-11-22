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
 * <p>Java class for SettlementInternaliserClientType1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInternaliserClientType1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Prfssnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *         <element name="Rtl" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationData1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserClientType1", propOrder = {
    "prfssnl",
    "rtl"
})
public class SettlementInternaliserClientType1 {

    @XmlElement(name = "Prfssnl", required = true)
    protected InternalisationData1 prfssnl;
    @XmlElement(name = "Rtl", required = true)
    protected InternalisationData1 rtl;

    /**
     * Gets the value of the prfssnl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getPrfssnl() {
        return prfssnl;
    }

    /**
     * Sets the value of the prfssnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setPrfssnl(InternalisationData1 value) {
        this.prfssnl = value;
    }

    /**
     * Gets the value of the rtl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationData1 }
     *     
     */
    public InternalisationData1 getRtl() {
        return rtl;
    }

    /**
     * Sets the value of the rtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationData1 }
     *     
     */
    public void setRtl(InternalisationData1 value) {
        this.rtl = value;
    }

}
