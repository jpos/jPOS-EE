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

package org.jpos.iso20022.caad_008_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LodgingProperty2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LodgingProperty2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LodgingActivity1Code" minOccurs="0"/>
 *         <element name="OthrTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="PrstgsPrprty" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}PartyIdentification258"/>
 *         <element name="Lctn" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Location4" minOccurs="0"/>
 *         <element name="Assgnr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}CompanyAssigner2Code" minOccurs="0"/>
 *         <element name="Ctct" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Contact3" minOccurs="0"/>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISOMax3ACountryCode" minOccurs="0"/>
 *         <element name="FireSftyActInd" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LodgingProperty2", propOrder = {
    "tp",
    "othrTp",
    "prstgsPrprty",
    "nm",
    "id",
    "lctn",
    "assgnr",
    "ctct",
    "ctry",
    "fireSftyActInd"
})
public class LodgingProperty2 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected LodgingActivity1Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "PrstgsPrprty")
    protected String prstgsPrprty;
    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "Id", required = true)
    protected PartyIdentification258 id;
    @XmlElement(name = "Lctn")
    protected Location4 lctn;
    @XmlElement(name = "Assgnr")
    @XmlSchemaType(name = "string")
    protected CompanyAssigner2Code assgnr;
    @XmlElement(name = "Ctct")
    protected Contact3 ctct;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "FireSftyActInd")
    protected Boolean fireSftyActInd;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public LodgingActivity1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LodgingActivity1Code }
     *     
     */
    public void setTp(LodgingActivity1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTp(String value) {
        this.othrTp = value;
    }

    /**
     * Gets the value of the prstgsPrprty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrstgsPrprty() {
        return prstgsPrprty;
    }

    /**
     * Sets the value of the prstgsPrprty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrstgsPrprty(String value) {
        this.prstgsPrprty = value;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setId(PartyIdentification258 value) {
        this.id = value;
    }

    /**
     * Gets the value of the lctn property.
     * 
     * @return
     *     possible object is
     *     {@link Location4 }
     *     
     */
    public Location4 getLctn() {
        return lctn;
    }

    /**
     * Sets the value of the lctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location4 }
     *     
     */
    public void setLctn(Location4 value) {
        this.lctn = value;
    }

    /**
     * Gets the value of the assgnr property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public CompanyAssigner2Code getAssgnr() {
        return assgnr;
    }

    /**
     * Sets the value of the assgnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyAssigner2Code }
     *     
     */
    public void setAssgnr(CompanyAssigner2Code value) {
        this.assgnr = value;
    }

    /**
     * Gets the value of the ctct property.
     * 
     * @return
     *     possible object is
     *     {@link Contact3 }
     *     
     */
    public Contact3 getCtct() {
        return ctct;
    }

    /**
     * Sets the value of the ctct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact3 }
     *     
     */
    public void setCtct(Contact3 value) {
        this.ctct = value;
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
     * Gets the value of the fireSftyActInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFireSftyActInd() {
        return fireSftyActInd;
    }

    /**
     * Sets the value of the fireSftyActInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFireSftyActInd(Boolean value) {
        this.fireSftyActInd = value;
    }

}
