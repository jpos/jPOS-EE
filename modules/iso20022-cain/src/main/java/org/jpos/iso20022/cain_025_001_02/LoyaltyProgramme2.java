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

package org.jpos.iso20022.cain_025_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyProgramme2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyProgramme2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrgrmmTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PrgmId" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *         <element name="PtcptId" type="{urn:iso:std:iso:20022:tech:xsd:cain.025.001.02}Max70Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyProgramme2", propOrder = {
    "prgrmmTp",
    "prgmId",
    "ptcptId"
})
public class LoyaltyProgramme2 {

    @XmlElement(name = "PrgrmmTp")
    protected String prgrmmTp;
    @XmlElement(name = "PrgmId")
    protected String prgmId;
    @XmlElement(name = "PtcptId")
    protected String ptcptId;

    /**
     * Gets the value of the prgrmmTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrmmTp() {
        return prgrmmTp;
    }

    /**
     * Sets the value of the prgrmmTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgrmmTp(String value) {
        this.prgrmmTp = value;
    }

    /**
     * Gets the value of the prgmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgmId() {
        return prgmId;
    }

    /**
     * Sets the value of the prgmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrgmId(String value) {
        this.prgmId = value;
    }

    /**
     * Gets the value of the ptcptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcptId() {
        return ptcptId;
    }

    /**
     * Sets the value of the ptcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtcptId(String value) {
        this.ptcptId = value;
    }

}
