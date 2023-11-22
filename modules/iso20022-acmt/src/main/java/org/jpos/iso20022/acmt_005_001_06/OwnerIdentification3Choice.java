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

package org.jpos.iso20022.acmt_005_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerIdentification3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OwnerIdentification3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="IndvOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}IndividualPersonIdentification2Choice"/>
 *         <element name="OrgOwnrId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.005.001.06}PartyIdentification139"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OwnerIdentification3Choice", propOrder = {
    "indvOwnrId",
    "orgOwnrId"
})
public class OwnerIdentification3Choice {

    @XmlElement(name = "IndvOwnrId")
    protected IndividualPersonIdentification2Choice indvOwnrId;
    @XmlElement(name = "OrgOwnrId")
    protected PartyIdentification139 orgOwnrId;

    /**
     * Gets the value of the indvOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPersonIdentification2Choice }
     *     
     */
    public IndividualPersonIdentification2Choice getIndvOwnrId() {
        return indvOwnrId;
    }

    /**
     * Sets the value of the indvOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPersonIdentification2Choice }
     *     
     */
    public void setIndvOwnrId(IndividualPersonIdentification2Choice value) {
        this.indvOwnrId = value;
    }

    /**
     * Gets the value of the orgOwnrId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getOrgOwnrId() {
        return orgOwnrId;
    }

    /**
     * Sets the value of the orgOwnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public void setOrgOwnrId(PartyIdentification139 value) {
        this.orgOwnrId = value;
    }

}
