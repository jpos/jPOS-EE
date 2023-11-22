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

package org.jpos.iso20022.auth_079_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties34Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties34Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CntrlSctiesDpstryPtcpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice"/>
 *         <element name="IndrctPtcpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties34Choice", propOrder = {
    "cntrlSctiesDpstryPtcpt",
    "indrctPtcpt"
})
public class SettlementParties34Choice {

    @XmlElement(name = "CntrlSctiesDpstryPtcpt")
    protected OrganisationIdentification15Choice cntrlSctiesDpstryPtcpt;
    @XmlElement(name = "IndrctPtcpt")
    protected OrganisationIdentification15Choice indrctPtcpt;

    /**
     * Gets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCntrlSctiesDpstryPtcpt() {
        return cntrlSctiesDpstryPtcpt;
    }

    /**
     * Sets the value of the cntrlSctiesDpstryPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setCntrlSctiesDpstryPtcpt(OrganisationIdentification15Choice value) {
        this.cntrlSctiesDpstryPtcpt = value;
    }

    /**
     * Gets the value of the indrctPtcpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getIndrctPtcpt() {
        return indrctPtcpt;
    }

    /**
     * Sets the value of the indrctPtcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setIndrctPtcpt(OrganisationIdentification15Choice value) {
        this.indrctPtcpt = value;
    }

}
