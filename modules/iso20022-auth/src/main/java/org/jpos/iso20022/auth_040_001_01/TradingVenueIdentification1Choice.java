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

package org.jpos.iso20022.auth_040_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingVenueIdentification1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradingVenueIdentification1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MktIdCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}MICIdentifier"/>
 *         <element name="NtlCmptntAuthrty" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}CountryCode"/>
 *         <element name="Othr" type="{urn:iso:std:iso:20022:tech:xsd:auth.040.001.01}TradingVenueIdentification2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueIdentification1Choice", propOrder = {
    "mktIdCd",
    "ntlCmptntAuthrty",
    "othr"
})
public class TradingVenueIdentification1Choice {

    @XmlElement(name = "MktIdCd")
    protected String mktIdCd;
    @XmlElement(name = "NtlCmptntAuthrty")
    protected String ntlCmptntAuthrty;
    @XmlElement(name = "Othr")
    protected TradingVenueIdentification2 othr;

    /**
     * Gets the value of the mktIdCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktIdCd() {
        return mktIdCd;
    }

    /**
     * Sets the value of the mktIdCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMktIdCd(String value) {
        this.mktIdCd = value;
    }

    /**
     * Gets the value of the ntlCmptntAuthrty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlCmptntAuthrty() {
        return ntlCmptntAuthrty;
    }

    /**
     * Sets the value of the ntlCmptntAuthrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlCmptntAuthrty(String value) {
        this.ntlCmptntAuthrty = value;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public TradingVenueIdentification2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradingVenueIdentification2 }
     *     
     */
    public void setOthr(TradingVenueIdentification2 value) {
        this.othr = value;
    }

}
