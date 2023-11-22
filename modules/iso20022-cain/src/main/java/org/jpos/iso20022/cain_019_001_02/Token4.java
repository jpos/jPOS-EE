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

package org.jpos.iso20022.cain_019_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Token4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Token4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtTkn" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max19NumericText" minOccurs="0"/>
 *         <element name="TknXpryDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}ISOYearMonth" minOccurs="0"/>
 *         <element name="TknRqstrId" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max11NumericText" minOccurs="0"/>
 *         <element name="TknAssrncData" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max140Text" minOccurs="0"/>
 *         <element name="TknAssrncMtd" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max2NumericText" minOccurs="0"/>
 *         <element name="TknRefId" type="{urn:iso:std:iso:20022:tech:xsd:cain.019.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Token4", propOrder = {
    "pmtTkn",
    "tknXpryDt",
    "tknRqstrId",
    "tknAssrncData",
    "tknAssrncMtd",
    "tknRefId"
})
public class Token4 {

    @XmlElement(name = "PmtTkn")
    protected String pmtTkn;
    @XmlElement(name = "TknXpryDt")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar tknXpryDt;
    @XmlElement(name = "TknRqstrId")
    protected String tknRqstrId;
    @XmlElement(name = "TknAssrncData")
    protected String tknAssrncData;
    @XmlElement(name = "TknAssrncMtd")
    protected String tknAssrncMtd;
    @XmlElement(name = "TknRefId")
    protected String tknRefId;

    /**
     * Gets the value of the pmtTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtTkn() {
        return pmtTkn;
    }

    /**
     * Sets the value of the pmtTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtTkn(String value) {
        this.pmtTkn = value;
    }

    /**
     * Gets the value of the tknXpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTknXpryDt() {
        return tknXpryDt;
    }

    /**
     * Sets the value of the tknXpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTknXpryDt(XMLGregorianCalendar value) {
        this.tknXpryDt = value;
    }

    /**
     * Gets the value of the tknRqstrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRqstrId() {
        return tknRqstrId;
    }

    /**
     * Sets the value of the tknRqstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRqstrId(String value) {
        this.tknRqstrId = value;
    }

    /**
     * Gets the value of the tknAssrncData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncData() {
        return tknAssrncData;
    }

    /**
     * Sets the value of the tknAssrncData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncData(String value) {
        this.tknAssrncData = value;
    }

    /**
     * Gets the value of the tknAssrncMtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAssrncMtd() {
        return tknAssrncMtd;
    }

    /**
     * Sets the value of the tknAssrncMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAssrncMtd(String value) {
        this.tknAssrncMtd = value;
    }

    /**
     * Gets the value of the tknRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknRefId() {
        return tknRefId;
    }

    /**
     * Sets the value of the tknRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknRefId(String value) {
        this.tknRefId = value;
    }

}
