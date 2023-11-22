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

package org.jpos.iso20022.colr_008_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralProposalResponseType4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralProposalResponseType4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollPrpslId" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}Max35Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}CollateralProposalResponse1Code"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}CollateralResponse3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponseType4", propOrder = {
    "collPrpslId",
    "tp",
    "rspn"
})
public class CollateralProposalResponseType4 {

    @XmlElement(name = "CollPrpslId", required = true)
    protected String collPrpslId;
    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralProposalResponse1Code tp;
    @XmlElement(name = "Rspn", required = true)
    protected CollateralResponse3 rspn;

    /**
     * Gets the value of the collPrpslId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrpslId() {
        return collPrpslId;
    }

    /**
     * Sets the value of the collPrpslId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollPrpslId(String value) {
        this.collPrpslId = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse1Code }
     *     
     */
    public CollateralProposalResponse1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse1Code }
     *     
     */
    public void setTp(CollateralProposalResponse1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralResponse3 }
     *     
     */
    public CollateralResponse3 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralResponse3 }
     *     
     */
    public void setRspn(CollateralResponse3 value) {
        this.rspn = value;
    }

}
