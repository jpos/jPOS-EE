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
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Signer6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Signer6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Number" minOccurs="0"/>
 *         <element name="SgnrId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Recipient12Choice" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}AlgorithmIdentification21"/>
 *         <element name="SgndAttrbts" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}GenericInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SgntrAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}AlgorithmIdentification30"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.020.001.03}Max3000Binary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer6", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgndAttrbts",
    "sgntrAlgo",
    "sgntr"
})
public class Signer6 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId")
    protected Recipient12Choice sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification21 dgstAlgo;
    @XmlElement(name = "SgndAttrbts")
    protected List<GenericInformation1> sgndAttrbts;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification30 sgntrAlgo;
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
     *     {@link Recipient12Choice }
     *     
     */
    public Recipient12Choice getSgnrId() {
        return sgnrId;
    }

    /**
     * Sets the value of the sgnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient12Choice }
     *     
     */
    public void setSgnrId(Recipient12Choice value) {
        this.sgnrId = value;
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
     * Gets the value of the sgndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     * @return
     *     The value of the sgndAttrbts property.
     */
    public List<GenericInformation1> getSgndAttrbts() {
        if (sgndAttrbts == null) {
            sgndAttrbts = new ArrayList<>();
        }
        return this.sgndAttrbts;
    }

    /**
     * Gets the value of the sgntrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification30 }
     *     
     */
    public AlgorithmIdentification30 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Sets the value of the sgntrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification30 }
     *     
     */
    public void setSgntrAlgo(AlgorithmIdentification30 value) {
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
