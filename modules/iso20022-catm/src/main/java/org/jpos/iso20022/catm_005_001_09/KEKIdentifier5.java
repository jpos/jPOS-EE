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

package org.jpos.iso20022.catm_005_001_09;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KEKIdentifier5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="KEKIdentifier5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="KeyId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max140Text"/>
 *         <element name="KeyVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Max140Text"/>
 *         <element name="SeqNb" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Number" minOccurs="0"/>
 *         <element name="DerivtnId" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}Min5Max16Binary" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}CryptographicKeyType3Code" minOccurs="0"/>
 *         <element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.005.001.09}KeyUsage1Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KEKIdentifier5", propOrder = {
    "keyId",
    "keyVrsn",
    "seqNb",
    "derivtnId",
    "tp",
    "fctn"
})
public class KEKIdentifier5 {

    @XmlElement(name = "KeyId", required = true)
    protected String keyId;
    @XmlElement(name = "KeyVrsn", required = true)
    protected String keyVrsn;
    @XmlElement(name = "SeqNb")
    protected BigDecimal seqNb;
    @XmlElement(name = "DerivtnId")
    protected byte[] derivtnId;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType3Code tp;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;

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

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public CryptographicKeyType3Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType3Code }
     *     
     */
    public void setTp(CryptographicKeyType3Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fctn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFctn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyUsage1Code }
     * 
     * 
     * @return
     *     The value of the fctn property.
     */
    public List<KeyUsage1Code> getFctn() {
        if (fctn == null) {
            fctn = new ArrayList<>();
        }
        return this.fctn;
    }

}
