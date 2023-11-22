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

package org.jpos.iso20022.auth_076_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusDetail1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}CountryCode" minOccurs="0"/>
 *         <element name="CmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}SupervisingAuthorityIdentification1"/>
 *         <element name="Sts" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max10Text" minOccurs="0"/>
 *         <element name="StsRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max10Text"/>
 *         <element name="ActvtyPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Period4Choice" minOccurs="0"/>
 *         <element name="Cmnt" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max20000Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetail1", propOrder = {
    "ctry",
    "cmptntAuthrty",
    "sts",
    "stsRsn",
    "actvtyPrd",
    "cmnt"
})
public class StatusDetail1 {

    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "CmptntAuthrty", required = true)
    protected SupervisingAuthorityIdentification1 cmptntAuthrty;
    @XmlElement(name = "Sts")
    protected String sts;
    @XmlElement(name = "StsRsn", required = true)
    protected String stsRsn;
    @XmlElement(name = "ActvtyPrd")
    protected Period4Choice actvtyPrd;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

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

    /**
     * Gets the value of the cmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public SupervisingAuthorityIdentification1 getCmptntAuthrty() {
        return cmptntAuthrty;
    }

    /**
     * Sets the value of the cmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisingAuthorityIdentification1 }
     *     
     */
    public void setCmptntAuthrty(SupervisingAuthorityIdentification1 value) {
        this.cmptntAuthrty = value;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSts(String value) {
        this.sts = value;
    }

    /**
     * Gets the value of the stsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStsRsn() {
        return stsRsn;
    }

    /**
     * Sets the value of the stsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStsRsn(String value) {
        this.stsRsn = value;
    }

    /**
     * Gets the value of the actvtyPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4Choice }
     *     
     */
    public Period4Choice getActvtyPrd() {
        return actvtyPrd;
    }

    /**
     * Sets the value of the actvtyPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4Choice }
     *     
     */
    public void setActvtyPrd(Period4Choice value) {
        this.actvtyPrd = value;
    }

    /**
     * Gets the value of the cmnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmnt() {
        return cmnt;
    }

    /**
     * Sets the value of the cmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmnt(String value) {
        this.cmnt = value;
    }

}
