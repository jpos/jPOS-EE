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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralProposalResponse4Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralProposalResponse4Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="CollPrpsl" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}CollateralProposalResponse4"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}CollateralProposalResponseType4"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposalResponse4Choice", propOrder = {
    "collPrpsl",
    "sgrtdIndpdntAmt"
})
public class CollateralProposalResponse4Choice {

    @XmlElement(name = "CollPrpsl")
    protected CollateralProposalResponse4 collPrpsl;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralProposalResponseType4 sgrtdIndpdntAmt;

    /**
     * Gets the value of the collPrpsl property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponse4 }
     *     
     */
    public CollateralProposalResponse4 getCollPrpsl() {
        return collPrpsl;
    }

    /**
     * Sets the value of the collPrpsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponse4 }
     *     
     */
    public void setCollPrpsl(CollateralProposalResponse4 value) {
        this.collPrpsl = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralProposalResponseType4 }
     *     
     */
    public CollateralProposalResponseType4 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralProposalResponseType4 }
     *     
     */
    public void setSgrtdIndpdntAmt(CollateralProposalResponseType4 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
