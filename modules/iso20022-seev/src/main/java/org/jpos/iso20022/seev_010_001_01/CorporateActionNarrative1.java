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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNarrative1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNarrative1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InfConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max350Text" minOccurs="0"/>
 *         <element name="InfToCmplyWth" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max350Text" minOccurs="0"/>
 *         <element name="TaxtnConds" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max350Text" minOccurs="0"/>
 *         <element name="NewCpnyNm" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max350Text" minOccurs="0"/>
 *         <element name="Offerr" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}PartyIdentification2Choice" minOccurs="0"/>
 *         <element name="URLAdr" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max256Text" minOccurs="0"/>
 *         <element name="AddtlTxt" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNarrative1", propOrder = {
    "infConds",
    "infToCmplyWth",
    "taxtnConds",
    "newCpnyNm",
    "offerr",
    "urlAdr",
    "addtlTxt"
})
public class CorporateActionNarrative1 {

    @XmlElement(name = "InfConds")
    protected String infConds;
    @XmlElement(name = "InfToCmplyWth")
    protected String infToCmplyWth;
    @XmlElement(name = "TaxtnConds")
    protected String taxtnConds;
    @XmlElement(name = "NewCpnyNm")
    protected String newCpnyNm;
    @XmlElement(name = "Offerr")
    protected PartyIdentification2Choice offerr;
    @XmlElement(name = "URLAdr")
    protected String urlAdr;
    @XmlElement(name = "AddtlTxt")
    protected String addtlTxt;

    /**
     * Gets the value of the infConds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfConds() {
        return infConds;
    }

    /**
     * Sets the value of the infConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfConds(String value) {
        this.infConds = value;
    }

    /**
     * Gets the value of the infToCmplyWth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfToCmplyWth() {
        return infToCmplyWth;
    }

    /**
     * Sets the value of the infToCmplyWth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfToCmplyWth(String value) {
        this.infToCmplyWth = value;
    }

    /**
     * Gets the value of the taxtnConds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtnConds() {
        return taxtnConds;
    }

    /**
     * Sets the value of the taxtnConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtnConds(String value) {
        this.taxtnConds = value;
    }

    /**
     * Gets the value of the newCpnyNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCpnyNm() {
        return newCpnyNm;
    }

    /**
     * Sets the value of the newCpnyNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCpnyNm(String value) {
        this.newCpnyNm = value;
    }

    /**
     * Gets the value of the offerr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getOfferr() {
        return offerr;
    }

    /**
     * Sets the value of the offerr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setOfferr(PartyIdentification2Choice value) {
        this.offerr = value;
    }

    /**
     * Gets the value of the urlAdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLAdr() {
        return urlAdr;
    }

    /**
     * Sets the value of the urlAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLAdr(String value) {
        this.urlAdr = value;
    }

    /**
     * Gets the value of the addtlTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlTxt() {
        return addtlTxt;
    }

    /**
     * Sets the value of the addtlTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlTxt(String value) {
        this.addtlTxt = value;
    }

}
