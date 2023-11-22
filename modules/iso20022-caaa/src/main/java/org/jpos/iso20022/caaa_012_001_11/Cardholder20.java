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

package org.jpos.iso20022.caaa_012_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cardholder20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cardholder20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PersonIdentification15" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max45Text" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}LanguageCode" minOccurs="0"/>
 *         <element name="BllgAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PostalAddress22" minOccurs="0"/>
 *         <element name="ShppgAdr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}PostalAddress22" minOccurs="0"/>
 *         <element name="TripNb" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Vhcl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Vehicle1" minOccurs="0"/>
 *         <element name="Authntcn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}CardholderAuthentication16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxVrfctnRslt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}TransactionVerificationResult4" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="PrsnlData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}Max70Text" minOccurs="0"/>
 *         <element name="MobData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.012.001.11}MobileData5" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder20", propOrder = {
    "id",
    "nm",
    "lang",
    "bllgAdr",
    "shppgAdr",
    "tripNb",
    "vhcl",
    "authntcn",
    "txVrfctnRslt",
    "prsnlData",
    "mobData"
})
public class Cardholder20 {

    @XmlElement(name = "Id")
    protected PersonIdentification15 id;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Lang")
    protected String lang;
    @XmlElement(name = "BllgAdr")
    protected PostalAddress22 bllgAdr;
    @XmlElement(name = "ShppgAdr")
    protected PostalAddress22 shppgAdr;
    @XmlElement(name = "TripNb")
    protected String tripNb;
    @XmlElement(name = "Vhcl")
    protected Vehicle1 vhcl;
    @XmlElement(name = "Authntcn")
    protected List<CardholderAuthentication16> authntcn;
    @XmlElement(name = "TxVrfctnRslt")
    protected List<TransactionVerificationResult4> txVrfctnRslt;
    @XmlElement(name = "PrsnlData")
    protected String prsnlData;
    @XmlElement(name = "MobData")
    protected List<MobileData5> mobData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentification15 }
     *     
     */
    public PersonIdentification15 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentification15 }
     *     
     */
    public void setId(PersonIdentification15 value) {
        this.id = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the bllgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getBllgAdr() {
        return bllgAdr;
    }

    /**
     * Sets the value of the bllgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setBllgAdr(PostalAddress22 value) {
        this.bllgAdr = value;
    }

    /**
     * Gets the value of the shppgAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress22 }
     *     
     */
    public PostalAddress22 getShppgAdr() {
        return shppgAdr;
    }

    /**
     * Sets the value of the shppgAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress22 }
     *     
     */
    public void setShppgAdr(PostalAddress22 value) {
        this.shppgAdr = value;
    }

    /**
     * Gets the value of the tripNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripNb() {
        return tripNb;
    }

    /**
     * Sets the value of the tripNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripNb(String value) {
        this.tripNb = value;
    }

    /**
     * Gets the value of the vhcl property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle1 }
     *     
     */
    public Vehicle1 getVhcl() {
        return vhcl;
    }

    /**
     * Sets the value of the vhcl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle1 }
     *     
     */
    public void setVhcl(Vehicle1 value) {
        this.vhcl = value;
    }

    /**
     * Gets the value of the authntcn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authntcn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthntcn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardholderAuthentication16 }
     * 
     * 
     * @return
     *     The value of the authntcn property.
     */
    public List<CardholderAuthentication16> getAuthntcn() {
        if (authntcn == null) {
            authntcn = new ArrayList<>();
        }
        return this.authntcn;
    }

    /**
     * Gets the value of the txVrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txVrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionVerificationResult4 }
     * 
     * 
     * @return
     *     The value of the txVrfctnRslt property.
     */
    public List<TransactionVerificationResult4> getTxVrfctnRslt() {
        if (txVrfctnRslt == null) {
            txVrfctnRslt = new ArrayList<>();
        }
        return this.txVrfctnRslt;
    }

    /**
     * Gets the value of the prsnlData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrsnlData() {
        return prsnlData;
    }

    /**
     * Sets the value of the prsnlData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrsnlData(String value) {
        this.prsnlData = value;
    }

    /**
     * Gets the value of the mobData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the mobData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MobileData5 }
     * 
     * 
     * @return
     *     The value of the mobData property.
     */
    public List<MobileData5> getMobData() {
        if (mobData == null) {
            mobData = new ArrayList<>();
        }
        return this.mobData;
    }

}
