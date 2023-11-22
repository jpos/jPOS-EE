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

package org.jpos.iso20022.cafm_001_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileActionDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FileActionDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FileNm" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}Max140Text" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}OutputFormat5Code" minOccurs="0"/>
 *         <element name="DataRcrd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}DataRecord1Choice"/>
 *         <element name="ActnDt" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}ISODate" minOccurs="0"/>
 *         <element name="FileSctyCd" type="{urn:iso:std:iso:20022:tech:xsd:cafm.001.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileActionDetails2", propOrder = {
    "fileNm",
    "frmt",
    "dataRcrd",
    "actnDt",
    "fileSctyCd"
})
public class FileActionDetails2 {

    @XmlElement(name = "FileNm")
    protected String fileNm;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat5Code frmt;
    @XmlElement(name = "DataRcrd", required = true)
    protected DataRecord1Choice dataRcrd;
    @XmlElement(name = "ActnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actnDt;
    @XmlElement(name = "FileSctyCd")
    protected String fileSctyCd;

    /**
     * Gets the value of the fileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileNm() {
        return fileNm;
    }

    /**
     * Sets the value of the fileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileNm(String value) {
        this.fileNm = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat5Code }
     *     
     */
    public OutputFormat5Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat5Code }
     *     
     */
    public void setFrmt(OutputFormat5Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the dataRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link DataRecord1Choice }
     *     
     */
    public DataRecord1Choice getDataRcrd() {
        return dataRcrd;
    }

    /**
     * Sets the value of the dataRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataRecord1Choice }
     *     
     */
    public void setDataRcrd(DataRecord1Choice value) {
        this.dataRcrd = value;
    }

    /**
     * Gets the value of the actnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActnDt() {
        return actnDt;
    }

    /**
     * Sets the value of the actnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActnDt(XMLGregorianCalendar value) {
        this.actnDt = value;
    }

    /**
     * Gets the value of the fileSctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSctyCd() {
        return fileSctyCd;
    }

    /**
     * Sets the value of the fileSctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSctyCd(String value) {
        this.fileSctyCd = value;
    }

}
