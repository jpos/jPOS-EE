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

package org.jpos.iso20022.caaa_007_001_12;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkParameters7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NetworkParameters7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}NetworkParameters9" maxOccurs="unbounded"/>
 *         <element name="UsrNm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *         <element name="AccsCd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Binary" minOccurs="0"/>
 *         <element name="SvrCert" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvrCertIdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max140Binary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ClntCert" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max10KBinary" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SctyPrfl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.007.001.12}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkParameters7", propOrder = {
    "adr",
    "usrNm",
    "accsCd",
    "svrCert",
    "svrCertIdr",
    "clntCert",
    "sctyPrfl"
})
public class NetworkParameters7 {

    @XmlElement(name = "Adr", required = true)
    protected List<NetworkParameters9> adr;
    @XmlElement(name = "UsrNm")
    protected String usrNm;
    @XmlElement(name = "AccsCd")
    protected byte[] accsCd;
    @XmlElement(name = "SvrCert")
    protected List<byte[]> svrCert;
    @XmlElement(name = "SvrCertIdr")
    protected List<byte[]> svrCertIdr;
    @XmlElement(name = "ClntCert")
    protected List<byte[]> clntCert;
    @XmlElement(name = "SctyPrfl")
    protected String sctyPrfl;

    /**
     * Gets the value of the adr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the adr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkParameters9 }
     * 
     * 
     * @return
     *     The value of the adr property.
     */
    public List<NetworkParameters9> getAdr() {
        if (adr == null) {
            adr = new ArrayList<>();
        }
        return this.adr;
    }

    /**
     * Gets the value of the usrNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrNm() {
        return usrNm;
    }

    /**
     * Sets the value of the usrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrNm(String value) {
        this.usrNm = value;
    }

    /**
     * Gets the value of the accsCd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAccsCd() {
        return accsCd;
    }

    /**
     * Sets the value of the accsCd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAccsCd(byte[] value) {
        this.accsCd = value;
    }

    /**
     * Gets the value of the svrCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svrCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the svrCert property.
     */
    public List<byte[]> getSvrCert() {
        if (svrCert == null) {
            svrCert = new ArrayList<>();
        }
        return this.svrCert;
    }

    /**
     * Gets the value of the svrCertIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the svrCertIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvrCertIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the svrCertIdr property.
     */
    public List<byte[]> getSvrCertIdr() {
        if (svrCertIdr == null) {
            svrCertIdr = new ArrayList<>();
        }
        return this.svrCertIdr;
    }

    /**
     * Gets the value of the clntCert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the clntCert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClntCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     * @return
     *     The value of the clntCert property.
     */
    public List<byte[]> getClntCert() {
        if (clntCert == null) {
            clntCert = new ArrayList<>();
        }
        return this.clntCert;
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

}
