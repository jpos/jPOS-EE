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

package org.jpos.iso20022.caaa_006_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Check1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Check1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BkId" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max35Text" minOccurs="0"/>
 *         <element name="AcctNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max35Text" minOccurs="0"/>
 *         <element name="ChckNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max35Text" minOccurs="0"/>
 *         <element name="ChckCardNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max35Text" minOccurs="0"/>
 *         <element name="ChckTrckData2" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}TrackData2" minOccurs="0"/>
 *         <element name="ChckTp" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}CheckType1Code" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:caaa.006.001.11}Max3Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Check1", propOrder = {
    "bkId",
    "acctNb",
    "chckNb",
    "chckCardNb",
    "chckTrckData2",
    "chckTp",
    "ctry"
})
public class Check1 {

    @XmlElement(name = "BkId")
    protected String bkId;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "ChckNb")
    protected String chckNb;
    @XmlElement(name = "ChckCardNb")
    protected String chckCardNb;
    @XmlElement(name = "ChckTrckData2")
    protected TrackData2 chckTrckData2;
    @XmlElement(name = "ChckTp")
    @XmlSchemaType(name = "string")
    protected CheckType1Code chckTp;
    @XmlElement(name = "Ctry")
    protected String ctry;

    /**
     * Gets the value of the bkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBkId() {
        return bkId;
    }

    /**
     * Sets the value of the bkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBkId(String value) {
        this.bkId = value;
    }

    /**
     * Gets the value of the acctNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNb() {
        return acctNb;
    }

    /**
     * Sets the value of the acctNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNb(String value) {
        this.acctNb = value;
    }

    /**
     * Gets the value of the chckNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckNb() {
        return chckNb;
    }

    /**
     * Sets the value of the chckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckNb(String value) {
        this.chckNb = value;
    }

    /**
     * Gets the value of the chckCardNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChckCardNb() {
        return chckCardNb;
    }

    /**
     * Sets the value of the chckCardNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChckCardNb(String value) {
        this.chckCardNb = value;
    }

    /**
     * Gets the value of the chckTrckData2 property.
     * 
     * @return
     *     possible object is
     *     {@link TrackData2 }
     *     
     */
    public TrackData2 getChckTrckData2() {
        return chckTrckData2;
    }

    /**
     * Sets the value of the chckTrckData2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackData2 }
     *     
     */
    public void setChckTrckData2(TrackData2 value) {
        this.chckTrckData2 = value;
    }

    /**
     * Gets the value of the chckTp property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType1Code }
     *     
     */
    public CheckType1Code getChckTp() {
        return chckTp;
    }

    /**
     * Sets the value of the chckTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType1Code }
     *     
     */
    public void setChckTp(CheckType1Code value) {
        this.chckTp = value;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

}
