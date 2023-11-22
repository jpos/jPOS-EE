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

package org.jpos.iso20022.setr_030_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusAndReason46 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusAndReason46">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AffirmSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}AffirmationStatus10Choice"/>
 *         <element name="UaffrmdRsn" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}UnaffirmedReason3Choice" minOccurs="0"/>
 *         <element name="AddtlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:setr.030.001.02}Max210Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason46", propOrder = {
    "affirmSts",
    "uaffrmdRsn",
    "addtlRsnInf"
})
public class StatusAndReason46 {

    @XmlElement(name = "AffirmSts", required = true)
    protected AffirmationStatus10Choice affirmSts;
    @XmlElement(name = "UaffrmdRsn")
    protected UnaffirmedReason3Choice uaffrmdRsn;
    @XmlElement(name = "AddtlRsnInf")
    protected String addtlRsnInf;

    /**
     * Gets the value of the affirmSts property.
     * 
     * @return
     *     possible object is
     *     {@link AffirmationStatus10Choice }
     *     
     */
    public AffirmationStatus10Choice getAffirmSts() {
        return affirmSts;
    }

    /**
     * Sets the value of the affirmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffirmationStatus10Choice }
     *     
     */
    public void setAffirmSts(AffirmationStatus10Choice value) {
        this.affirmSts = value;
    }

    /**
     * Gets the value of the uaffrmdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link UnaffirmedReason3Choice }
     *     
     */
    public UnaffirmedReason3Choice getUaffrmdRsn() {
        return uaffrmdRsn;
    }

    /**
     * Sets the value of the uaffrmdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnaffirmedReason3Choice }
     *     
     */
    public void setUaffrmdRsn(UnaffirmedReason3Choice value) {
        this.uaffrmdRsn = value;
    }

    /**
     * Gets the value of the addtlRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRsnInf() {
        return addtlRsnInf;
    }

    /**
     * Sets the value of the addtlRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlRsnInf(String value) {
        this.addtlRsnInf = value;
    }

}
