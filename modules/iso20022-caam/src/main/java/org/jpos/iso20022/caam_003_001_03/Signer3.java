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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Signer3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Signer3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Number" minOccurs="0"/>
 *         <element name="SgnrId" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Recipient5Choice" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}AlgorithmIdentification16"/>
 *         <element name="SgntrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}AlgorithmIdentification17"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:caam.003.001.03}Max3000Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer3", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgntrAlgo",
    "sgntr"
})
public class Signer3 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId")
    protected Recipient5Choice sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification16 dgstAlgo;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification17 sgntrAlgo;
    @XmlElement(name = "Sgntr", required = true)
    protected byte[] sgntr;

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
     * Gets the value of the sgnrId property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient5Choice }
     *     
     */
    public Recipient5Choice getSgnrId() {
        return sgnrId;
    }

    /**
     * Sets the value of the sgnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient5Choice }
     *     
     */
    public void setSgnrId(Recipient5Choice value) {
        this.sgnrId = value;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification16 }
     *     
     */
    public AlgorithmIdentification16 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification16 }
     *     
     */
    public void setDgstAlgo(AlgorithmIdentification16 value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the sgntrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification17 }
     *     
     */
    public AlgorithmIdentification17 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Sets the value of the sgntrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification17 }
     *     
     */
    public void setSgntrAlgo(AlgorithmIdentification17 value) {
        this.sgntrAlgo = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setSgntr(byte[] value) {
        this.sgntr = value;
    }

}
