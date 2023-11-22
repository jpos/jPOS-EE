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

package org.jpos.iso20022.semt_022_002_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementStatus22Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementStatus22Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}PendingStatus50Choice"/>
 *         <element name="Flng" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}FailingStatus12Choice"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.022.002.05}ProprietaryStatusAndReason7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementStatus22Choice", propOrder = {
    "pdg",
    "flng",
    "prtry"
})
public class SettlementStatus22Choice {

    @XmlElement(name = "Pdg")
    protected PendingStatus50Choice pdg;
    @XmlElement(name = "Flng")
    protected FailingStatus12Choice flng;
    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus50Choice }
     *     
     */
    public PendingStatus50Choice getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus50Choice }
     *     
     */
    public void setPdg(PendingStatus50Choice value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the flng property.
     * 
     * @return
     *     possible object is
     *     {@link FailingStatus12Choice }
     *     
     */
    public FailingStatus12Choice getFlng() {
        return flng;
    }

    /**
     * Sets the value of the flng property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailingStatus12Choice }
     *     
     */
    public void setFlng(FailingStatus12Choice value) {
        this.flng = value;
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
