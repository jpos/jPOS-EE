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

package org.jpos.iso20022.fxtr_037_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityIdentification22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityIdentification22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ISINOct2015Identifier"/>
 *         <element name="AltrnId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}AlternateIdentification1"/>
 *         <element name="RIC" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}RICIdentifier"/>
 *         <element name="TckrSymb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}TickerIdentifier"/>
 *         <element name="Blmbrg" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}BloombergIdentifier"/>
 *         <element name="CTA" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}ConsolidatedTapeAssociationIdentifier"/>
 *         <element name="Cmon" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}EuroclearClearstreamIdentifier"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityIdentification22Choice", propOrder = {
    "isin",
    "altrnId",
    "ric",
    "tckrSymb",
    "blmbrg",
    "cta",
    "cmon"
})
public class SecurityIdentification22Choice {

    @XmlElement(name = "ISIN")
    protected String isin;
    @XmlElement(name = "AltrnId")
    protected AlternateIdentification1 altrnId;
    @XmlElement(name = "RIC")
    protected String ric;
    @XmlElement(name = "TckrSymb")
    protected String tckrSymb;
    @XmlElement(name = "Blmbrg")
    protected String blmbrg;
    @XmlElement(name = "CTA")
    protected String cta;
    @XmlElement(name = "Cmon")
    protected String cmon;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the altrnId property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateIdentification1 }
     *     
     */
    public AlternateIdentification1 getAltrnId() {
        return altrnId;
    }

    /**
     * Sets the value of the altrnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateIdentification1 }
     *     
     */
    public void setAltrnId(AlternateIdentification1 value) {
        this.altrnId = value;
    }

    /**
     * Gets the value of the ric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIC() {
        return ric;
    }

    /**
     * Sets the value of the ric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIC(String value) {
        this.ric = value;
    }

    /**
     * Gets the value of the tckrSymb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTckrSymb() {
        return tckrSymb;
    }

    /**
     * Sets the value of the tckrSymb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTckrSymb(String value) {
        this.tckrSymb = value;
    }

    /**
     * Gets the value of the blmbrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlmbrg() {
        return blmbrg;
    }

    /**
     * Sets the value of the blmbrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlmbrg(String value) {
        this.blmbrg = value;
    }

    /**
     * Gets the value of the cta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTA() {
        return cta;
    }

    /**
     * Sets the value of the cta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTA(String value) {
        this.cta = value;
    }

    /**
     * Gets the value of the cmon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmon() {
        return cmon;
    }

    /**
     * Sets the value of the cmon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmon(String value) {
        this.cmon = value;
    }

}
