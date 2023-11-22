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

package org.jpos.iso20022.colr_007_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Proposal6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Proposal6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollPrpslTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}ProposalType1Code"/>
 *         <element name="CollPrpsl" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CollateralProposal6Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proposal6", propOrder = {
    "collPrpslTp",
    "collPrpsl"
})
public class Proposal6 {

    @XmlElement(name = "CollPrpslTp", required = true)
    @XmlSchemaType(name = "string")
    protected ProposalType1Code collPrpslTp;
    @XmlElement(name = "CollPrpsl", required = true)
    protected CollateralProposal6Choice collPrpsl;

    /**
     * Gets the value of the collPrpslTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalType1Code }
     *     
     */
    public ProposalType1Code getCollPrpslTp() {
        return collPrpslTp;
    }

    /**
     * Sets the value of the collPrpslTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalType1Code }
     *     
     */
    public void setCollPrpslTp(ProposalType1Code value) {
        this.collPrpslTp = value;
    }

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposal6Choice }
     *     
     */
    public CollateralProposal6Choice getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposal6Choice }
     *     
     */
    public void setCollPrpsl(CollateralProposal6Choice value) {
        this.collPrpsl = value;
    }

}
