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
 * <p>Java class for PartyDetail1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyDetail1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FullNm" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max350Text" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}CountryCode" minOccurs="0"/>
 *         <element name="PtyTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}Max10Text"/>
 *         <element name="SprvsgAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}SupervisingAuthorityIdentification1Choice"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}PostalAddress6" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:auth.076.001.01}CommunicationAddress7" minOccurs="0"/>
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
@XmlType(name = "PartyDetail1", propOrder = {
    "fullNm",
    "ctry",
    "ptyTp",
    "sprvsgAuthrty",
    "pstlAdr",
    "ctct",
    "cmnt"
})
public class PartyDetail1 {

    @XmlElement(name = "FullNm")
    protected String fullNm;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "PtyTp", required = true)
    protected String ptyTp;
    @XmlElement(name = "SprvsgAuthrty", required = true)
    protected SupervisingAuthorityIdentification1Choice sprvsgAuthrty;
    @XmlElement(name = "PstlAdr")
    protected PostalAddress6 pstlAdr;
    @XmlElement(name = "Ctct")
    protected CommunicationAddress7 ctct;
    @XmlElement(name = "Cmnt")
    protected String cmnt;

    /**
     * Gets the value of the fullNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNm() {
        return fullNm;
    }

    /**
     * Sets the value of the fullNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNm(String value) {
        this.fullNm = value;
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

    /**
     * Gets the value of the ptyTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyTp() {
        return ptyTp;
    }

    /**
     * Sets the value of the ptyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyTp(String value) {
        this.ptyTp = value;
    }

    /**
     * Gets the value of the sprvsgAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link SupervisingAuthorityIdentification1Choice }
     *     
     */
    public SupervisingAuthorityIdentification1Choice getSprvsgAuthrty() {
        return sprvsgAuthrty;
    }

    /**
     * Sets the value of the sprvsgAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupervisingAuthorityIdentification1Choice }
     *     
     */
    public void setSprvsgAuthrty(SupervisingAuthorityIdentification1Choice value) {
        this.sprvsgAuthrty = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getPstlAdr() {
        return pstlAdr;
    }

    /**
     * Sets the value of the pstlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public void setPstlAdr(PostalAddress6 value) {
        this.pstlAdr = value;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationAddress7 }
     *     
     */
    public CommunicationAddress7 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationAddress7 }
     *     
     */
    public void setCtct(CommunicationAddress7 value) {
        this.ctct = value;
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
