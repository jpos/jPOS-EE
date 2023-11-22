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

package org.jpos.iso20022.caaa_004_001_11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographicKey17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CryptographicKey17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max350Text"/>
 *         <element name="AddtlId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max35Binary" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max256Text" minOccurs="0"/>
 *         <element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max35Text" minOccurs="0"/>
 *         <element name="ItmNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Vrsn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max256Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}CryptographicKeyType3Code" minOccurs="0"/>
 *         <element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}KeyUsage1Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ActvtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="DeactvtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}ISODateTime" minOccurs="0"/>
 *         <element name="KeyVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}ContentInformationType34" minOccurs="0"/>
 *         <element name="KeyChckVal" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}Max35Binary" minOccurs="0"/>
 *         <element name="AddtlMgmtInf" type="{urn:iso:std:iso:20022:tech:xsd:caaa.004.001.11}GenericInformation1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographicKey17", propOrder = {
    "id",
    "addtlId",
    "nm",
    "sctyPrfl",
    "itmNb",
    "vrsn",
    "tp",
    "fctn",
    "actvtnDt",
    "deactvtnDt",
    "keyVal",
    "keyChckVal",
    "addtlMgmtInf"
})
public class CryptographicKey17 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AddtlId")
    protected byte[] addtlId;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;
    @XmlElement(name = "ItmNb")
    protected String itmNb;
    @XmlElement(name = "Vrsn", required = true)
    protected String vrsn;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType3Code tp;
    @XmlElement(name = "Fctn")
    @XmlSchemaType(name = "string")
    protected List<KeyUsage1Code> fctn;
    @XmlElement(name = "ActvtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actvtnDt;
    @XmlElement(name = "DeactvtnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactvtnDt;
    @XmlElement(name = "KeyVal")
    protected ContentInformationType34 keyVal;
    @XmlElement(name = "KeyChckVal")
    protected byte[] keyChckVal;
    @XmlElement(name = "AddtlMgmtInf")
    protected List<GenericInformation1> addtlMgmtInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the addtlId property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlId() {
        return addtlId;
    }

    /**
     * Sets the value of the addtlId property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlId(byte[] value) {
        this.addtlId = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the sctyPrfl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSctyPrfl() {
        return sctyPrfl;
    }

    /**
     * Sets the value of the sctyPrfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSctyPrfl(String value) {
        this.sctyPrfl = value;
    }

    /**
     * Gets the value of the itmNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmNb() {
        return itmNb;
    }

    /**
     * Sets the value of the itmNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmNb(String value) {
        this.itmNb = value;
    }

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVrsn(String value) {
        this.vrsn = value;
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

    /**
     * Gets the value of the actvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Sets the value of the actvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActvtnDt(XMLGregorianCalendar value) {
        this.actvtnDt = value;
    }

    /**
     * Gets the value of the deactvtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeactvtnDt() {
        return deactvtnDt;
    }

    /**
     * Sets the value of the deactvtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeactvtnDt(XMLGregorianCalendar value) {
        this.deactvtnDt = value;
    }

    /**
     * Gets the value of the keyVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getKeyVal() {
        return keyVal;
    }

    /**
     * Sets the value of the keyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public void setKeyVal(ContentInformationType34 value) {
        this.keyVal = value;
    }

    /**
     * Gets the value of the keyChckVal property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getKeyChckVal() {
        return keyChckVal;
    }

    /**
     * Sets the value of the keyChckVal property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setKeyChckVal(byte[] value) {
        this.keyChckVal = value;
    }

    /**
     * Gets the value of the addtlMgmtInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlMgmtInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlMgmtInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     * @return
     *     The value of the addtlMgmtInf property.
     */
    public List<GenericInformation1> getAddtlMgmtInf() {
        if (addtlMgmtInf == null) {
            addtlMgmtInf = new ArrayList<>();
        }
        return this.addtlMgmtInf;
    }

}
