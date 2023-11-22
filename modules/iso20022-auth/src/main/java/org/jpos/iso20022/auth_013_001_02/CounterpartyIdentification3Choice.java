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

package org.jpos.iso20022.auth_013_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyIdentification3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyIdentification3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="LEI" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}LEIIdentifier"/>
 *         <element name="SctrAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}SectorAndLocation1"/>
 *         <element name="NmAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:auth.013.001.02}NameAndLocation1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyIdentification3Choice", propOrder = {
    "lei",
    "sctrAndLctn",
    "nmAndLctn"
})
public class CounterpartyIdentification3Choice {

    @XmlElement(name = "LEI")
    protected String lei;
    @XmlElement(name = "SctrAndLctn")
    protected SectorAndLocation1 sctrAndLctn;
    @XmlElement(name = "NmAndLctn")
    protected NameAndLocation1 nmAndLctn;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEI(String value) {
        this.lei = value;
    }

    /**
     * Gets the value of the sctrAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link SectorAndLocation1 }
     *     
     */
    public SectorAndLocation1 getSctrAndLctn() {
        return sctrAndLctn;
    }

    /**
     * Sets the value of the sctrAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectorAndLocation1 }
     *     
     */
    public void setSctrAndLctn(SectorAndLocation1 value) {
        this.sctrAndLctn = value;
    }

    /**
     * Gets the value of the nmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndLocation1 }
     *     
     */
    public NameAndLocation1 getNmAndLctn() {
        return nmAndLctn;
    }

    /**
     * Sets the value of the nmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndLocation1 }
     *     
     */
    public void setNmAndLctn(NameAndLocation1 value) {
        this.nmAndLctn = value;
    }

}
