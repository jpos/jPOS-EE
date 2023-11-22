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

package org.jpos.iso20022.caam_002_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMConfigurationParameter2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMConfigurationParameter2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyCtgy" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}CryptographicKeyType4Code" minOccurs="0"/>
 *         <element name="HstChllng" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}Max140Binary" minOccurs="0"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}Max5000Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="KeyProps" type="{urn:iso:std:iso:20022:tech:xsd:caam.002.001.03}KEKIdentifier4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationParameter2", propOrder = {
    "keyCtgy",
    "hstChllng",
    "cert",
    "keyProps"
})
public class ATMConfigurationParameter2 {

    @XmlElement(name = "KeyCtgy")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType4Code keyCtgy;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "KeyProps")
    protected List<KEKIdentifier4> keyProps;

    /**
     * Gets the value of the keyCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType4Code }
     *     
     */
    public CryptographicKeyType4Code getKeyCtgy() {
        return keyCtgy;
    }

    /**
     * Sets the value of the keyCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType4Code }
     *     
     */
    public void setKeyCtgy(CryptographicKeyType4Code value) {
        this.keyCtgy = value;
    }

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
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the cert property.
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the keyProps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the keyProps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier4 }
     * 
     * 
     * @return
     *     The value of the keyProps property.
     */
    public List<KEKIdentifier4> getKeyProps() {
        if (keyProps == null) {
            keyProps = new ArrayList<>();
        }
        return this.keyProps;
    }

}
