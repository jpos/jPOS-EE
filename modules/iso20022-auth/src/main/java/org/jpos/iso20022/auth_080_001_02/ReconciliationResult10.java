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

package org.jpos.iso20022.auth_080_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationResult10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationResult10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrPty1" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}OrganisationIdentification15Choice"/>
 *         <element name="CtrPty2" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}OrganisationIdentification15Choice"/>
 *         <element name="MtchgCrit" type="{urn:iso:std:iso:20022:tech:xsd:auth.080.001.02}MatchingCriteria10"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationResult10", propOrder = {
    "ctrPty1",
    "ctrPty2",
    "mtchgCrit"
})
public class ReconciliationResult10 {

    @XmlElement(name = "CtrPty1", required = true)
    protected OrganisationIdentification15Choice ctrPty1;
    @XmlElement(name = "CtrPty2", required = true)
    protected OrganisationIdentification15Choice ctrPty2;
    @XmlElement(name = "MtchgCrit", required = true)
    protected MatchingCriteria10 mtchgCrit;

    /**
     * Gets the value of the ctrPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCtrPty1() {
        return ctrPty1;
    }

    /**
     * Sets the value of the ctrPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setCtrPty1(OrganisationIdentification15Choice value) {
        this.ctrPty1 = value;
    }

    /**
     * Gets the value of the ctrPty2 property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCtrPty2() {
        return ctrPty2;
    }

    /**
     * Sets the value of the ctrPty2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setCtrPty2(OrganisationIdentification15Choice value) {
        this.ctrPty2 = value;
    }

    /**
     * Gets the value of the mtchgCrit property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingCriteria10 }
     *     
     */
    public MatchingCriteria10 getMtchgCrit() {
        return mtchgCrit;
    }

    /**
     * Sets the value of the mtchgCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingCriteria10 }
     *     
     */
    public void setMtchgCrit(MatchingCriteria10 value) {
        this.mtchgCrit = value;
    }

}
