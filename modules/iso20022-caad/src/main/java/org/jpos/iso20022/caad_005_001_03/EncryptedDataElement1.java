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

package org.jpos.iso20022.caad_005_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncryptedDataElement1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="EncryptedDataElement1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}ExternalEncryptedElementIdentification1Code" minOccurs="0"/>
 *         <element name="OthrId" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}Max35Text" minOccurs="0"/>
 *         <element name="NcrptdData" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}EncryptedData1Choice"/>
 *         <element name="ClearTxtDataFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}EncryptedDataFormat1Code" minOccurs="0"/>
 *         <element name="OthrClearTxtDataFrmt" type="{urn:iso:std:iso:20022:tech:xsd:caad.005.001.03}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedDataElement1", propOrder = {
    "id",
    "othrId",
    "ncrptdData",
    "clearTxtDataFrmt",
    "othrClearTxtDataFrmt"
})
public class EncryptedDataElement1 {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "OthrId")
    protected String othrId;
    @XmlElement(name = "NcrptdData", required = true)
    protected EncryptedData1Choice ncrptdData;
    @XmlElement(name = "ClearTxtDataFrmt")
    @XmlSchemaType(name = "string")
    protected EncryptedDataFormat1Code clearTxtDataFrmt;
    @XmlElement(name = "OthrClearTxtDataFrmt")
    protected String othrClearTxtDataFrmt;

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
     * Gets the value of the othrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrId() {
        return othrId;
    }

    /**
     * Sets the value of the othrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrId(String value) {
        this.othrId = value;
    }

    /**
     * Gets the value of the ncrptdData property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public EncryptedData1Choice getNcrptdData() {
        return ncrptdData;
    }

    /**
     * Sets the value of the ncrptdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedData1Choice }
     *     
     */
    public void setNcrptdData(EncryptedData1Choice value) {
        this.ncrptdData = value;
    }

    /**
     * Gets the value of the clearTxtDataFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public EncryptedDataFormat1Code getClearTxtDataFrmt() {
        return clearTxtDataFrmt;
    }

    /**
     * Sets the value of the clearTxtDataFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncryptedDataFormat1Code }
     *     
     */
    public void setClearTxtDataFrmt(EncryptedDataFormat1Code value) {
        this.clearTxtDataFrmt = value;
    }

    /**
     * Gets the value of the othrClearTxtDataFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrClearTxtDataFrmt() {
        return othrClearTxtDataFrmt;
    }

    /**
     * Sets the value of the othrClearTxtDataFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrClearTxtDataFrmt(String value) {
        this.othrClearTxtDataFrmt = value;
    }

}
