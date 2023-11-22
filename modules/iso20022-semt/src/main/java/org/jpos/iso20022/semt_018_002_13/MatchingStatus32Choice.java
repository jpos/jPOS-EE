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

package org.jpos.iso20022.semt_018_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchingStatus32Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MatchingStatus32Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Mtchd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}ProprietaryReason5"/>
 *         <element name="Umtchd" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}UnmatchedStatus21Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchingStatus32Choice", propOrder = {
    "mtchd",
    "umtchd",
    "prtry"
})
public class MatchingStatus32Choice {

    @XmlElement(name = "Mtchd")
    protected ProprietaryReason5 mtchd;
    @XmlElement(name = "Umtchd")
    protected UnmatchedStatus21Choice umtchd;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the mtchd property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public ProprietaryReason5 getMtchd() {
        return mtchd;
    }

    /**
     * Sets the value of the mtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason5 }
     *     
     */
    public void setMtchd(ProprietaryReason5 value) {
        this.mtchd = value;
    }

    /**
     * Gets the value of the umtchd property.
     * 
     * @return
     *     possible object is
     *     {@link UnmatchedStatus21Choice }
     *     
     */
    public UnmatchedStatus21Choice getUmtchd() {
        return umtchd;
    }

    /**
     * Sets the value of the umtchd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnmatchedStatus21Choice }
     *     
     */
    public void setUmtchd(UnmatchedStatus21Choice value) {
        this.umtchd = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason7 value) {
        this.prtry = value;
    }

}
