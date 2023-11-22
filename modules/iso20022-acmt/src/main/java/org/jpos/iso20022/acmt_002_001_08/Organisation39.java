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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Organisation39 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Organisation39">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max350Text" minOccurs="0"/>
 *         <element name="ShrtNm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PartyIdentification177Choice" minOccurs="0"/>
 *         <element name="LglNttyIdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}LEIIdentifier" minOccurs="0"/>
 *         <element name="Purp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}Max35Text" minOccurs="0"/>
 *         <element name="RegnCtry" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}CountryCode" minOccurs="0"/>
 *         <element name="RegnDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}ISODate" minOccurs="0"/>
 *         <element name="PstlAdr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}PostalAddress21" maxOccurs="10" minOccurs="0"/>
 *         <element name="TpOfOrg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}OrganisationType1Choice" minOccurs="0"/>
 *         <element name="PlcOfListg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}MICIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organisation39", propOrder = {
    "nm",
    "shrtNm",
    "id",
    "lglNttyIdr",
    "purp",
    "regnCtry",
    "regnDt",
    "pstlAdr",
    "tpOfOrg",
    "plcOfListg"
})
public class Organisation39 {

    @XmlElement(name = "Nm")
    protected String nm;
    @XmlElement(name = "ShrtNm")
    protected String shrtNm;
    @XmlElement(name = "Id")
    protected PartyIdentification177Choice id;
    @XmlElement(name = "LglNttyIdr")
    protected String lglNttyIdr;
    @XmlElement(name = "Purp")
    protected String purp;
    @XmlElement(name = "RegnCtry")
    protected String regnCtry;
    @XmlElement(name = "RegnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regnDt;
    @XmlElement(name = "PstlAdr")
    protected List<PostalAddress21> pstlAdr;
    @XmlElement(name = "TpOfOrg")
    protected OrganisationType1Choice tpOfOrg;
    @XmlElement(name = "PlcOfListg")
    protected List<String> plcOfListg;

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
     * Gets the value of the shrtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtNm() {
        return shrtNm;
    }

    /**
     * Sets the value of the shrtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtNm(String value) {
        this.shrtNm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public PartyIdentification177Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification177Choice }
     *     
     */
    public void setId(PartyIdentification177Choice value) {
        this.id = value;
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

    /**
     * Gets the value of the purp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurp() {
        return purp;
    }

    /**
     * Sets the value of the purp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurp(String value) {
        this.purp = value;
    }

    /**
     * Gets the value of the regnCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnCtry() {
        return regnCtry;
    }

    /**
     * Sets the value of the regnCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnCtry(String value) {
        this.regnCtry = value;
    }

    /**
     * Gets the value of the regnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegnDt() {
        return regnDt;
    }

    /**
     * Sets the value of the regnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegnDt(XMLGregorianCalendar value) {
        this.regnDt = value;
    }

    /**
     * Gets the value of the pstlAdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pstlAdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPstlAdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddress21 }
     * 
     * 
     * @return
     *     The value of the pstlAdr property.
     */
    public List<PostalAddress21> getPstlAdr() {
        if (pstlAdr == null) {
            pstlAdr = new ArrayList<>();
        }
        return this.pstlAdr;
    }

    /**
     * Gets the value of the tpOfOrg property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationType1Choice }
     *     
     */
    public OrganisationType1Choice getTpOfOrg() {
        return tpOfOrg;
    }

    /**
     * Sets the value of the tpOfOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationType1Choice }
     *     
     */
    public void setTpOfOrg(OrganisationType1Choice value) {
        this.tpOfOrg = value;
    }

    /**
     * Gets the value of the plcOfListg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the plcOfListg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlcOfListg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the plcOfListg property.
     */
    public List<String> getPlcOfListg() {
        if (plcOfListg == null) {
            plcOfListg = new ArrayList<>();
        }
        return this.plcOfListg;
    }

}
