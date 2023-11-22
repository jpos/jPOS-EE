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

package org.jpos.iso20022.caad_009_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Customer4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}CustomerType2Code" minOccurs="0"/>
 *         <element name="RefNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TaxRegnId" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AuthrsdCtctCpny" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="AuthrsdCtctNm" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max70Text" minOccurs="0"/>
 *         <element name="AuthrsdCtctPhneNb" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}PhoneNumber" minOccurs="0"/>
 *         <element name="VIPInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CstmrRltsh" type="{urn:iso:std:iso:20022:tech:xsd:caad.009.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer4", propOrder = {
    "tp",
    "refNb",
    "taxRegnId",
    "authrsdCtctCpny",
    "authrsdCtctNm",
    "authrsdCtctPhneNb",
    "vipInd",
    "cstmrRltsh"
})
public class Customer4 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected CustomerType2Code tp;
    @XmlElement(name = "RefNb")
    protected String refNb;
    @XmlElement(name = "TaxRegnId")
    protected List<String> taxRegnId;
    @XmlElement(name = "AuthrsdCtctCpny")
    protected String authrsdCtctCpny;
    @XmlElement(name = "AuthrsdCtctNm")
    protected String authrsdCtctNm;
    @XmlElement(name = "AuthrsdCtctPhneNb")
    protected String authrsdCtctPhneNb;
    @XmlElement(name = "VIPInd")
    protected Boolean vipInd;
    @XmlElement(name = "CstmrRltsh")
    protected String cstmrRltsh;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType2Code }
     *     
     */
    public CustomerType2Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType2Code }
     *     
     */
    public void setTp(CustomerType2Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the refNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNb() {
        return refNb;
    }

    /**
     * Sets the value of the refNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNb(String value) {
        this.refNb = value;
    }

    /**
     * Gets the value of the taxRegnId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxRegnId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRegnId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the taxRegnId property.
     */
    public List<String> getTaxRegnId() {
        if (taxRegnId == null) {
            taxRegnId = new ArrayList<>();
        }
        return this.taxRegnId;
    }

    /**
     * Gets the value of the authrsdCtctCpny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctCpny() {
        return authrsdCtctCpny;
    }

    /**
     * Sets the value of the authrsdCtctCpny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrsdCtctCpny(String value) {
        this.authrsdCtctCpny = value;
    }

    /**
     * Gets the value of the authrsdCtctNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctNm() {
        return authrsdCtctNm;
    }

    /**
     * Sets the value of the authrsdCtctNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrsdCtctNm(String value) {
        this.authrsdCtctNm = value;
    }

    /**
     * Gets the value of the authrsdCtctPhneNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthrsdCtctPhneNb() {
        return authrsdCtctPhneNb;
    }

    /**
     * Sets the value of the authrsdCtctPhneNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthrsdCtctPhneNb(String value) {
        this.authrsdCtctPhneNb = value;
    }

    /**
     * Gets the value of the vipInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVIPInd() {
        return vipInd;
    }

    /**
     * Sets the value of the vipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVIPInd(Boolean value) {
        this.vipInd = value;
    }

    /**
     * Gets the value of the cstmrRltsh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrRltsh() {
        return cstmrRltsh;
    }

    /**
     * Sets the value of the cstmrRltsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrRltsh(String value) {
        this.cstmrRltsh = value;
    }

}
