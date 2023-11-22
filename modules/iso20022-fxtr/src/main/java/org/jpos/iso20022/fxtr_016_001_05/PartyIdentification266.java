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

package org.jpos.iso20022.fxtr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentification266 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentification266">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyNm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}Max34Text" minOccurs="0"/>
 *         <element name="AnyBIC" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification265" minOccurs="0"/>
 *         <element name="AcctNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}Max34Text" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}Max105Text" minOccurs="0"/>
 *         <element name="ClrSysId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}ClearingSystemIdentification2Choice" minOccurs="0"/>
 *         <element name="LglNttyIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}LEIIdentifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentification266", propOrder = {
    "ptyNm",
    "anyBIC",
    "acctNb",
    "adr",
    "clrSysId",
    "lglNttyIdr"
})
public class PartyIdentification266 {

    @XmlElement(name = "PtyNm")
    protected String ptyNm;
    @XmlElement(name = "AnyBIC")
    protected PartyIdentification265 anyBIC;
    @XmlElement(name = "AcctNb")
    protected String acctNb;
    @XmlElement(name = "Adr")
    protected String adr;
    @XmlElement(name = "ClrSysId")
    protected ClearingSystemIdentification2Choice clrSysId;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;

    /**
     * Gets the value of the ptyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtyNm() {
        return ptyNm;
    }

    /**
     * Sets the value of the ptyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtyNm(String value) {
        this.ptyNm = value;
    }

    /**
     * Gets the value of the anyBIC property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification265 }
     *     
     */
    public PartyIdentification265 getAnyBIC() {
        return anyBIC;
    }

    /**
     * Sets the value of the anyBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification265 }
     *     
     */
    public void setAnyBIC(PartyIdentification265 value) {
        this.anyBIC = value;
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
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdr(String value) {
        this.adr = value;
    }

    /**
     * Gets the value of the clrSysId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public ClearingSystemIdentification2Choice getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    public void setClrSysId(ClearingSystemIdentification2Choice value) {
        this.clrSysId = value;
    }

    /**
     * Gets the value of the lglNttyIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLglNttyIdr() {
        return lglNttyIdr;
    }

    /**
     * Sets the value of the lglNttyIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLglNttyIdr(String value) {
        this.lglNttyIdr = value;
    }

}
