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

package org.jpos.iso20022.seev_042_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventDeadlines4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventDeadlines4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EarlyRspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}DateFormat49Choice" minOccurs="0"/>
 *         <element name="RspnDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}DateFormat54Choice" minOccurs="0"/>
 *         <element name="MktDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}DateFormat49Choice" minOccurs="0"/>
 *         <element name="PrtctDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}DateFormat49Choice" minOccurs="0"/>
 *         <element name="CoverPrtctDdln" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.002.11}DateFormat49Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventDeadlines4", propOrder = {
    "earlyRspnDdln",
    "rspnDdln",
    "mktDdln",
    "prtctDdln",
    "coverPrtctDdln"
})
public class CorporateActionEventDeadlines4 {

    @XmlElement(name = "EarlyRspnDdln")
    protected DateFormat49Choice earlyRspnDdln;
    @XmlElement(name = "RspnDdln")
    protected DateFormat54Choice rspnDdln;
    @XmlElement(name = "MktDdln")
    protected DateFormat49Choice mktDdln;
    @XmlElement(name = "PrtctDdln")
    protected DateFormat49Choice prtctDdln;
    @XmlElement(name = "CoverPrtctDdln")
    protected DateFormat49Choice coverPrtctDdln;

    /**
     * Gets the value of the earlyRspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getEarlyRspnDdln() {
        return earlyRspnDdln;
    }

    /**
     * Sets the value of the earlyRspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public void setEarlyRspnDdln(DateFormat49Choice value) {
        this.earlyRspnDdln = value;
    }

    /**
     * Gets the value of the rspnDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat54Choice }
     *     
     */
    public DateFormat54Choice getRspnDdln() {
        return rspnDdln;
    }

    /**
     * Sets the value of the rspnDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat54Choice }
     *     
     */
    public void setRspnDdln(DateFormat54Choice value) {
        this.rspnDdln = value;
    }

    /**
     * Gets the value of the mktDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getMktDdln() {
        return mktDdln;
    }

    /**
     * Sets the value of the mktDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public void setMktDdln(DateFormat49Choice value) {
        this.mktDdln = value;
    }

    /**
     * Gets the value of the prtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getPrtctDdln() {
        return prtctDdln;
    }

    /**
     * Sets the value of the prtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public void setPrtctDdln(DateFormat49Choice value) {
        this.prtctDdln = value;
    }

    /**
     * Gets the value of the coverPrtctDdln property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat49Choice }
     *     
     */
    public DateFormat49Choice getCoverPrtctDdln() {
        return coverPrtctDdln;
    }

    /**
     * Sets the value of the coverPrtctDdln property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat49Choice }
     *     
     */
    public void setCoverPrtctDdln(DateFormat49Choice value) {
        this.coverPrtctDdln = value;
    }

}
