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

package org.jpos.iso20022.caaa_008_001_11;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DigestedData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DigestedData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Number" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}AlgorithmIdentification21"/>
 *         <element name="NcpsltdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}EncapsulatedContent3"/>
 *         <element name="Dgst" type="{urn:iso:std:iso:20022:tech:xsd:caaa.008.001.11}Max140Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigestedData5", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "dgst"
})
public class DigestedData5 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification21 dgstAlgo;
    @XmlElement(name = "NcpsltdCntt", required = true)
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Dgst", required = true)
    protected byte[] dgst;

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
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification21 }
     *     
     */
    public AlgorithmIdentification21 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification21 }
     *     
     */
    public void setDgstAlgo(AlgorithmIdentification21 value) {
        this.dgstAlgo = value;
    }

    /**
     * Gets the value of the ncpsltdCntt property.
     * 
     * @return
     *     possible object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public EncapsulatedContent3 getNcpsltdCntt() {
        return ncpsltdCntt;
    }

    /**
     * Sets the value of the ncpsltdCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncapsulatedContent3 }
     *     
     */
    public void setNcpsltdCntt(EncapsulatedContent3 value) {
        this.ncpsltdCntt = value;
    }

    /**
     * Gets the value of the dgst property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDgst() {
        return dgst;
    }

    /**
     * Sets the value of the dgst property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDgst(byte[] value) {
        this.dgst = value;
    }

}
