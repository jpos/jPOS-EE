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

package org.jpos.iso20022.caam_004_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityParameters10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityParameters10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="HstChllng" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}Max140Binary" minOccurs="0"/>
 *         <element name="Key" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}CryptographicKey12" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SgntrChc" type="{urn:iso:std:iso:20022:tech:xsd:caam.004.001.03}ATMSignature2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityParameters10", propOrder = {
    "hstChllng",
    "key",
    "sgntrChc"
})
public class SecurityParameters10 {

    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;
    @XmlElement(name = "Key")
    protected List<CryptographicKey12> key;
    @XmlElement(name = "SgntrChc")
    protected ATMSignature2Choice sgntrChc;

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHstChllng(byte[] value) {
        this.hstChllng = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the key property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CryptographicKey12 }
     * 
     * 
     * @return
     *     The value of the key property.
     */
    public List<CryptographicKey12> getKey() {
        if (key == null) {
            key = new ArrayList<>();
        }
        return this.key;
    }

    /**
     * Gets the value of the sgntrChc property.
     * 
     * @return
     *     possible object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public ATMSignature2Choice getSgntrChc() {
        return sgntrChc;
    }

    /**
     * Sets the value of the sgntrChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMSignature2Choice }
     *     
     */
    public void setSgntrChc(ATMSignature2Choice value) {
        this.sgntrChc = value;
    }

}
