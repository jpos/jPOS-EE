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

package org.jpos.iso20022.caam_001_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMSecurityConfiguration3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMSecurityConfiguration3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AsmmtrcNcrptn" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AsmmtrcKeyStdId" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AsmmtrcNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}Algorithm7Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SmmtrcTrnsprtKey" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SmmtrcTrnsprtKeyAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}Algorithm13Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SmmtrcNcrptnAlgo" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}Algorithm15Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="NcrptnFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caam.001.001.03}EncryptionFormat1Code" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration3", propOrder = {
    "asmmtrcNcrptn",
    "asmmtrcKeyStdId",
    "asmmtrcNcrptnAlgo",
    "smmtrcTrnsprtKey",
    "smmtrcTrnsprtKeyAlgo",
    "smmtrcNcrptnAlgo",
    "ncrptnFrmt"
})
public class ATMSecurityConfiguration3 {

    @XmlElement(name = "AsmmtrcNcrptn")
    protected Boolean asmmtrcNcrptn;
    @XmlElement(name = "AsmmtrcKeyStdId")
    protected Boolean asmmtrcKeyStdId;
    @XmlElement(name = "AsmmtrcNcrptnAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm7Code> asmmtrcNcrptnAlgo;
    @XmlElement(name = "SmmtrcTrnsprtKey")
    protected Boolean smmtrcTrnsprtKey;
    @XmlElement(name = "SmmtrcTrnsprtKeyAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm13Code> smmtrcTrnsprtKeyAlgo;
    @XmlElement(name = "SmmtrcNcrptnAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm15Code> smmtrcNcrptnAlgo;
    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected List<EncryptionFormat1Code> ncrptnFrmt;

    /**
     * Gets the value of the asmmtrcNcrptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsmmtrcNcrptn() {
        return asmmtrcNcrptn;
    }

    /**
     * Sets the value of the asmmtrcNcrptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsmmtrcNcrptn(Boolean value) {
        this.asmmtrcNcrptn = value;
    }

    /**
     * Gets the value of the asmmtrcKeyStdId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsmmtrcKeyStdId() {
        return asmmtrcKeyStdId;
    }

    /**
     * Sets the value of the asmmtrcKeyStdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsmmtrcKeyStdId(Boolean value) {
        this.asmmtrcKeyStdId = value;
    }

    /**
     * Gets the value of the asmmtrcNcrptnAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the asmmtrcNcrptnAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsmmtrcNcrptnAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm7Code }
     * 
     * 
     * @return
     *     The value of the asmmtrcNcrptnAlgo property.
     */
    public List<Algorithm7Code> getAsmmtrcNcrptnAlgo() {
        if (asmmtrcNcrptnAlgo == null) {
            asmmtrcNcrptnAlgo = new ArrayList<>();
        }
        return this.asmmtrcNcrptnAlgo;
    }

    /**
     * Gets the value of the smmtrcTrnsprtKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmmtrcTrnsprtKey() {
        return smmtrcTrnsprtKey;
    }

    /**
     * Sets the value of the smmtrcTrnsprtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmmtrcTrnsprtKey(Boolean value) {
        this.smmtrcTrnsprtKey = value;
    }

    /**
     * Gets the value of the smmtrcTrnsprtKeyAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the smmtrcTrnsprtKeyAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcTrnsprtKeyAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm13Code }
     * 
     * 
     * @return
     *     The value of the smmtrcTrnsprtKeyAlgo property.
     */
    public List<Algorithm13Code> getSmmtrcTrnsprtKeyAlgo() {
        if (smmtrcTrnsprtKeyAlgo == null) {
            smmtrcTrnsprtKeyAlgo = new ArrayList<>();
        }
        return this.smmtrcTrnsprtKeyAlgo;
    }

    /**
     * Gets the value of the smmtrcNcrptnAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the smmtrcNcrptnAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcNcrptnAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm15Code }
     * 
     * 
     * @return
     *     The value of the smmtrcNcrptnAlgo property.
     */
    public List<Algorithm15Code> getSmmtrcNcrptnAlgo() {
        if (smmtrcNcrptnAlgo == null) {
            smmtrcNcrptnAlgo = new ArrayList<>();
        }
        return this.smmtrcNcrptnAlgo;
    }

    /**
     * Gets the value of the ncrptnFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ncrptnFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptnFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionFormat1Code }
     * 
     * 
     * @return
     *     The value of the ncrptnFrmt property.
     */
    public List<EncryptionFormat1Code> getNcrptnFrmt() {
        if (ncrptnFrmt == null) {
            ncrptnFrmt = new ArrayList<>();
        }
        return this.ncrptnFrmt;
    }

}
