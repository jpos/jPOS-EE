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

package org.jpos.iso20022.tsmt_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransportByAir2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransportByAir2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DprtureAirprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}AirportName1Choice"/>
 *         <element name="DstnAirprt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}AirportName1Choice"/>
 *         <element name="AirCrrierNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.014.001.05}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportByAir2", propOrder = {
    "dprtureAirprt",
    "dstnAirprt",
    "airCrrierNm"
})
public class TransportByAir2 {

    @XmlElement(name = "DprtureAirprt", required = true)
    protected AirportName1Choice dprtureAirprt;
    @XmlElement(name = "DstnAirprt", required = true)
    protected AirportName1Choice dstnAirprt;
    @XmlElement(name = "AirCrrierNm")
    protected String airCrrierNm;

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

}
