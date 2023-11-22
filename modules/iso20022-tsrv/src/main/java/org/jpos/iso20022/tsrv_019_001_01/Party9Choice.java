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

package org.jpos.iso20022.tsrv_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Party9Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Party9Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OrgId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyIdentification42"/>
 *         <element name="FIId" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}BranchAndFinancialInstitutionIdentification5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Party9Choice", propOrder = {
    "orgId",
    "fiId"
})
public class Party9Choice {

    @XmlElement(name = "OrgId")
    protected PartyIdentification42 orgId;
    @XmlElement(name = "FIId")
    protected BranchAndFinancialInstitutionIdentification5 fiId;

    /**
     * Gets the value of the orgId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification42 }
     *     
     */
    public PartyIdentification42 getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification42 }
     *     
     */
    public void setOrgId(PartyIdentification42 value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the fiId property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification5 getFIId() {
        return fiId;
    }

    /**
     * Sets the value of the fiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification5 }
     *     
     */
    public void setFIId(BranchAndFinancialInstitutionIdentification5 value) {
        this.fiId = value;
    }

}
