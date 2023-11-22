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

package org.jpos.iso20022.caaa_003_001_12;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignedData8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SignedData8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Number" minOccurs="0"/>
 *         <element name="DgstAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}AlgorithmIdentification21" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NcpsltdCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}EncapsulatedContent3" minOccurs="0"/>
 *         <element name="Cert" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Max5000Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sgnr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.003.001.12}Signer7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignedData8", propOrder = {
    "vrsn",
    "dgstAlgo",
    "ncpsltdCntt",
    "cert",
    "sgnr"
})
public class SignedData8 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "DgstAlgo")
    protected List<AlgorithmIdentification21> dgstAlgo;
    @XmlElement(name = "NcpsltdCntt")
    protected EncapsulatedContent3 ncpsltdCntt;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "Sgnr")
    protected List<Signer7> sgnr;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgstAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgstAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlgorithmIdentification21 }
     * 
     * 
     * @return
     *     The value of the dgstAlgo property.
     */
    public List<AlgorithmIdentification21> getDgstAlgo() {
        if (dgstAlgo == null) {
            dgstAlgo = new ArrayList<>();
        }
        return this.dgstAlgo;
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
     * Gets the value of the sgnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Signer7 }
     * 
     * 
     * @return
     *     The value of the sgnr property.
     */
    public List<Signer7> getSgnr() {
        if (sgnr == null) {
            sgnr = new ArrayList<>();
        }
        return this.sgnr;
    }

}
