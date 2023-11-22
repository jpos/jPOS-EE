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
 * <p>Java class for InternalisationData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InternalisationData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationDataVolume1"/>
 *         <element name="Faild" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationDataVolume1"/>
 *         <element name="Ttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}InternalisationDataVolume1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalisationData2", propOrder = {
    "sttld",
    "faild",
    "ttl"
})
public class InternalisationData2 {

    @XmlElement(name = "Sttld", required = true)
    protected InternalisationDataVolume1 sttld;
    @XmlElement(name = "Faild", required = true)
    protected InternalisationDataVolume1 faild;
    @XmlElement(name = "Ttl", required = true)
    protected InternalisationDataVolume1 ttl;

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public void setSttld(InternalisationDataVolume1 value) {
        this.sttld = value;
    }

    /**
     * Gets the value of the faild property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getFaild() {
        return faild;
    }

    /**
     * Sets the value of the faild property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public void setFaild(InternalisationDataVolume1 value) {
        this.faild = value;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public InternalisationDataVolume1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link InternalisationDataVolume1 }
     *     
     */
    public void setTtl(InternalisationDataVolume1 value) {
        this.ttl = value;
    }

}
