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

package org.jpos.iso20022.caad_007_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KEKIdentifier2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KEKIdentifier2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyId" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}Max140Text"/>
 *         <element name="KeyVrsn" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}Max140Text"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}Number" minOccurs="0"/>
 *         <element name="DerivtnId" type="{urn:iso:std:iso:20022:tech:xsd:caad.007.001.03}Min5Max16Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEKIdentifier2", propOrder = {
    "keyId",
    "keyVrsn",
    "seqNb",
    "derivtnId"
})
public class KEKIdentifier2 {

    @XmlElement(name = "KeyId", required = true)
    protected String keyId;
    @XmlElement(name = "KeyVrsn", required = true)
    protected String keyVrsn;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "DerivtnId")
    protected byte[] derivtnId;

    /**
     * Gets the value of the keyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * Sets the value of the keyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyId(String value) {
        this.keyId = value;
    }

    /**
     * Gets the value of the keyVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyVrsn() {
        return keyVrsn;
    }

    /**
     * Sets the value of the keyVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyVrsn(String value) {
        this.keyVrsn = value;
    }

    /**
     * Gets the value of the seqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNb() {
        return seqNb;
    }

    /**
     * Sets the value of the seqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNb(BigDecimal value) {
        this.seqNb = value;
    }

    /**
     * Gets the value of the derivtnId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDerivtnId() {
        return derivtnId;
    }

    /**
     * Sets the value of the derivtnId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDerivtnId(byte[] value) {
        this.derivtnId = value;
    }

}
