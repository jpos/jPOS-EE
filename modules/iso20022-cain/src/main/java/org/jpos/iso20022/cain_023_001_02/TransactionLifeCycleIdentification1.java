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

package org.jpos.iso20022.cain_023_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLifeCycleIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionLifeCycleIdentification1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Exact15Text"/>
 *         <element name="AuthstnSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Exact2NumericText" minOccurs="0"/>
 *         <element name="PresntmntSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Exact2NumericText" minOccurs="0"/>
 *         <element name="PresntmntSeqCnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Exact2NumericText" minOccurs="0"/>
 *         <element name="AuthntcnTkn" type="{urn:iso:std:iso:20022:tech:xsd:cain.023.001.02}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionLifeCycleIdentification1", propOrder = {
    "id",
    "authstnSeqNb",
    "presntmntSeqNb",
    "presntmntSeqCnt",
    "authntcnTkn"
})
public class TransactionLifeCycleIdentification1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "AuthstnSeqNb")
    protected String authstnSeqNb;
    @XmlElement(name = "PresntmntSeqNb")
    protected String presntmntSeqNb;
    @XmlElement(name = "PresntmntSeqCnt")
    protected String presntmntSeqCnt;
    @XmlElement(name = "AuthntcnTkn")
    protected String authntcnTkn;

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
     * Gets the value of the authstnSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnSeqNb() {
        return authstnSeqNb;
    }

    /**
     * Sets the value of the authstnSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthstnSeqNb(String value) {
        this.authstnSeqNb = value;
    }

    /**
     * Gets the value of the presntmntSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqNb() {
        return presntmntSeqNb;
    }

    /**
     * Sets the value of the presntmntSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntSeqNb(String value) {
        this.presntmntSeqNb = value;
    }

    /**
     * Gets the value of the presntmntSeqCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresntmntSeqCnt() {
        return presntmntSeqCnt;
    }

    /**
     * Sets the value of the presntmntSeqCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresntmntSeqCnt(String value) {
        this.presntmntSeqCnt = value;
    }

    /**
     * Gets the value of the authntcnTkn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthntcnTkn() {
        return authntcnTkn;
    }

    /**
     * Sets the value of the authntcnTkn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthntcnTkn(String value) {
        this.authntcnTkn = value;
    }

}
