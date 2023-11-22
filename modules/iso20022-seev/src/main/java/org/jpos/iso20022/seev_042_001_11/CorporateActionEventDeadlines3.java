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

package org.jpos.iso20022.seev_042_001_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventDeadlines3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventDeadlines3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EarlyRspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateFormat43Choice" minOccurs="0"/>
 *         <element name="RspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateFormat44Choice" minOccurs="0"/>
 *         <element name="MktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateFormat43Choice" minOccurs="0"/>
 *         <element name="PrtctDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateFormat43Choice" minOccurs="0"/>
 *         <element name="CoverPrtctDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}DateFormat43Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventDeadlines3", propOrder = {
    "earlyRspnDdln",
    "rspnDdln",
    "mktDdln",
    "prtctDdln",
    "coverPrtctDdln"
})
public class CorporateActionEventDeadlines3 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat43Choice earlyRspnDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat44Choice rspnDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat43Choice mktDdln;
    @XmlElement(name = "PrtctDdln")
    protected DateFormat43Choice prtctDdln;
    @XmlElement(name = "CoverPrtctDdln")
    protected DateFormat43Choice coverPrtctDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setEarlyRspnDdln(DateFormat43Choice value) {
        this.earlyRspnDdln = value;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat44Choice }
     *     
     */
    public DateFormat44Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat44Choice }
     *     
     */
    public void setRspnDdln(DateFormat44Choice value) {
        this.rspnDdln = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setMktDdln(DateFormat43Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the prtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getPrtctDdln() {
        return prtctDdln;
    }

    /**
     * Sets the value of the prtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setPrtctDdln(DateFormat43Choice value) {
        this.prtctDdln = value;
    }

    /**
     * Gets the value of the coverPrtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat43Choice }
     *     
     */
    public DateFormat43Choice getCoverPrtctDdln() {
        return coverPrtctDdln;
    }

    /**
     * Sets the value of the coverPrtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat43Choice }
     *     
     */
    public void setCoverPrtctDdln(DateFormat43Choice value) {
        this.coverPrtctDdln = value;
    }

}
