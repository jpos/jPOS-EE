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

package org.jpos.iso20022.tsmt_017_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportByAir4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportByAir4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DprtureAirprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}AirportName1Choice"/>
 *         <element name="DstnAirprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}AirportName1Choice"/>
 *         <element name="FlghtNb" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max35Text" minOccurs="0"/>
 *         <element name="AirCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="AirCrrierCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CountryCode" minOccurs="0"/>
 *         <element name="CrrierAgtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}Max70Text" minOccurs="0"/>
 *         <element name="CrrierAgtCtry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.017.001.05}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByAir4", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "flghtNb",
    "airCrrierNm",
    "airCrrierCtry",
    "crrierAgtNm",
    "crrierAgtCtry"
})
public class TransportByAir4 {

    @XmlElement(name = "DprtureAirprt", required = true)
    protected AirportName1Choice dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected AirportName1Choice dstnAirprt;
    @XmlElement(name = "FlghtNb")
    protected String flghtNb;
    @XmlElement(name = "AirCrrierNm")
    protected String airCrrierNm;
    @XmlElement(name = "AirCrrierCtry")
    protected String airCrrierCtry;
    @XmlElement(name = "CrrierAgtNm")
    protected String crrierAgtNm;
    @XmlElement(name = "CrrierAgtCtry")
    protected String crrierAgtCtry;

    /**
     * Gets the value of the dprtureAirprt property.
     * 
     * @return
     *     possible object is
     *     {@link AirportName1Choice }
     *     
     */
    public AirportName1Choice getDprtureAirprt() {
        return dprtureAirprt;
    }

    /**
     * Sets the value of the dprtureAirprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportName1Choice }
     *     
     */
    public void setDprtureAirprt(AirportName1Choice value) {
        this.dprtureAirprt = value;
    }

    /**
     * Gets the value of the dstnAirprt property.
     * 
     * @return
     *     possible object is
     *     {@link AirportName1Choice }
     *     
     */
    public AirportName1Choice getDstnAirprt() {
        return dstnAirprt;
    }

    /**
     * Sets the value of the dstnAirprt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirportName1Choice }
     *     
     */
    public void setDstnAirprt(AirportName1Choice value) {
        this.dstnAirprt = value;
    }

    /**
     * Gets the value of the flghtNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlghtNb() {
        return flghtNb;
    }

    /**
     * Sets the value of the flghtNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlghtNb(String value) {
        this.flghtNb = value;
    }

    /**
     * Gets the value of the airCrrierNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirCrrierNm() {
        return airCrrierNm;
    }

    /**
     * Sets the value of the airCrrierNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirCrrierNm(String value) {
        this.airCrrierNm = value;
    }

    /**
     * Gets the value of the airCrrierCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirCrrierCtry() {
        return airCrrierCtry;
    }

    /**
     * Sets the value of the airCrrierCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirCrrierCtry(String value) {
        this.airCrrierCtry = value;
    }

    /**
     * Gets the value of the crrierAgtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtNm() {
        return crrierAgtNm;
    }

    /**
     * Sets the value of the crrierAgtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtNm(String value) {
        this.crrierAgtNm = value;
    }

    /**
     * Gets the value of the crrierAgtCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrrierAgtCtry() {
        return crrierAgtCtry;
    }

    /**
     * Sets the value of the crrierAgtCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrrierAgtCtry(String value) {
        this.crrierAgtCtry = value;
    }

}
