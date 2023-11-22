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

package org.jpos.iso20022.catp_003_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorisationResult13 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuthorisationResult13">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AuthstnNtty" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}PartyType16Code" minOccurs="0"/>
 *         <element name="AuthstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ResponseType7"/>
 *         <element name="RspnTrac" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}ResponseType8" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AuthstnCd" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Min6Max8Text" minOccurs="0"/>
 *         <element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:catp.003.001.02}Action7" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult13", propOrder = {
    "authstnNtty",
    "authstnRspn",
    "rspnTrac",
    "authstnCd",
    "actn"
})
public class AuthorisationResult13 {

    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType16Code authstnNtty;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected ResponseType7 authstnRspn;
    @XmlElement(name = "RspnTrac")
    protected List<ResponseType8> rspnTrac;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType16Code }
     *     
     */
    public PartyType16Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType16Code }
     *     
     */
    public void setAuthstnNtty(PartyType16Code value) {
        this.authstnNtty = value;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType7 }
     *     
     */
    public ResponseType7 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType7 }
     *     
     */
    public void setAuthstnRspn(ResponseType7 value) {
        this.authstnRspn = value;
    }

    /**
     * Gets the value of the rspnTrac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnTrac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnTrac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType8 }
     * 
     * 
     * @return
     *     The value of the rspnTrac property.
     */
    public List<ResponseType8> getRspnTrac() {
        if (rspnTrac == null) {
            rspnTrac = new ArrayList<>();
        }
        return this.rspnTrac;
    }

    /**
     * Gets the value of the authstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Sets the value of the authstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthstnCd(String value) {
        this.authstnCd = value;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

}
