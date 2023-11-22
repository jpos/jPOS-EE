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

package org.jpos.iso20022.caaa_020_001_03;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyTransport8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KeyTransport8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Number" minOccurs="0"/>
 *         <element name="RcptId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Recipient12Choice"/>
 *         <element name="KeyNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}AlgorithmIdentification19"/>
 *         <element name="NcrptdKey" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max5000Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyTransport8", propOrder = {
    "vrsn",
    "rcptId",
    "keyNcrptnAlgo",
    "ncrptdKey"
})
public class KeyTransport8 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "RcptId", required = true)
    protected Recipient12Choice rcptId;
    @XmlElement(name = "KeyNcrptnAlgo", required = true)
    protected AlgorithmIdentification19 keyNcrptnAlgo;
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
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient12Choice }
     *     
     */
    public Recipient12Choice getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient12Choice }
     *     
     */
    public void setRcptId(Recipient12Choice value) {
        this.rcptId = value;
    }

    /**
     * Gets the value of the keyNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification19 }
     *     
     */
    public AlgorithmIdentification19 getKeyNcrptnAlgo() {
        return keyNcrptnAlgo;
    }

    /**
     * Sets the value of the keyNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification19 }
     *     
     */
    public void setKeyNcrptnAlgo(AlgorithmIdentification19 value) {
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
