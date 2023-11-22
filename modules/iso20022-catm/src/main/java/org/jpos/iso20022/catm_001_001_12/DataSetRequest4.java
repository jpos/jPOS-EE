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

package org.jpos.iso20022.catm_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataSetRequest4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DataSetRequest4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}DataSetIdentification10"/>
 *         <element name="POIChllng" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max140Binary" minOccurs="0"/>
 *         <element name="TMChllng" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max140Binary" minOccurs="0"/>
 *         <element name="SsnKey" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}CryptographicKey17" minOccurs="0"/>
 *         <element name="DlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max5000Binary" minOccurs="0"/>
 *         <element name="PrtctdDlgtnProof" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ContentInformationType34" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSetRequest4", propOrder = {
    "id",
    "poiChllng",
    "tmChllng",
    "ssnKey",
    "dlgtnProof",
    "prtctdDlgtnProof"
})
public class DataSetRequest4 {

    @XmlElement(name = "Id", required = true)
    protected DataSetIdentification10 id;
    @XmlElement(name = "POIChllng")
    protected byte[] poiChllng;
    @XmlElement(name = "TMChllng")
    protected byte[] tmChllng;
    @XmlElement(name = "SsnKey")
    protected CryptographicKey17 ssnKey;
    @XmlElement(name = "DlgtnProof")
    protected byte[] dlgtnProof;
    @XmlElement(name = "PrtctdDlgtnProof")
    protected ContentInformationType34 prtctdDlgtnProof;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public DataSetIdentification10 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataSetIdentification10 }
     *     
     */
    public void setId(DataSetIdentification10 value) {
        this.id = value;
    }

    /**
     * Gets the value of the poiChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPOIChllng() {
        return poiChllng;
    }

    /**
     * Sets the value of the poiChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPOIChllng(byte[] value) {
        this.poiChllng = value;
    }

    /**
     * Gets the value of the tmChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTMChllng() {
        return tmChllng;
    }

    /**
     * Sets the value of the tmChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTMChllng(byte[] value) {
        this.tmChllng = value;
    }

    /**
     * Gets the value of the ssnKey property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKey17 }
     *     
     */
    public CryptographicKey17 getSsnKey() {
        return ssnKey;
    }

    /**
     * Sets the value of the ssnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKey17 }
     *     
     */
    public void setSsnKey(CryptographicKey17 value) {
        this.ssnKey = value;
    }

    /**
     * Gets the value of the dlgtnProof property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDlgtnProof() {
        return dlgtnProof;
    }

    /**
     * Sets the value of the dlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDlgtnProof(byte[] value) {
        this.dlgtnProof = value;
    }

    /**
     * Gets the value of the prtctdDlgtnProof property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getPrtctdDlgtnProof() {
        return prtctdDlgtnProof;
    }

    /**
     * Sets the value of the prtctdDlgtnProof property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public void setPrtctdDlgtnProof(ContentInformationType34 value) {
        this.prtctdDlgtnProof = value;
    }

}
