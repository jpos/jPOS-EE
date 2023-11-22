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

package org.jpos.iso20022.cain_021_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KEK5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KEK5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Number" minOccurs="0"/>
 *         <element name="KEKId" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}KEKIdentifier2"/>
 *         <element name="KeyNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}AlgorithmIdentification23"/>
 *         <element name="NcrptdKey" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Max500Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEK5", propOrder = {
    "vrsn",
    "kekId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KEK5 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "KEKId", required = true)
    protected KEKIdentifier2 kekId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification23 keyNcrptnAlgo;
    @XmlElement(name = "NcrptdKey", required = true)
    protected byte[] ncrptdKey;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVrsn(BigDecimal value) {
        this.vrsn = value;
    }

    /**
     * Gets the value of the kekId property.
     * 
     * @return
     *     possible object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public KEKIdentifier2 getKEKId() {
        return kekId;
    }

    /**
     * Sets the value of the kekId property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEKIdentifier2 }
     *     
     */
    public void setKEKId(KEKIdentifier2 value) {
        this.kekId = value;
    }

    /**
     * Gets the value of the keyNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification23 }
     *     
     */
    public AlgorithmIdentification23 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Sets the value of the keyNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification23 }
     *     
     */
    public void setKeyNcrptnAlgo(AlgorithmIdentification23 value) {
        this.keyNcrptnAlgo = value;
    }

    /**
     * Gets the value of the ncrptdKey property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getNcrptdKey() {
        return ncrptdKey;
    }

    /**
     * Sets the value of the ncrptdKey property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setNcrptdKey(byte[] value) {
        this.ncrptdKey = value;
    }

}
