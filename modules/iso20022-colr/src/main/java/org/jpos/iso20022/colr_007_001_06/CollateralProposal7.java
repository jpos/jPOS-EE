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
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralProposal7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralProposal7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VartnMrgn" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CollateralMovement12"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.007.001.06}CollateralMovement12" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralProposal7", propOrder = {
    "vartnMrgn",
    "sgrtdIndpdntAmt"
})
public class CollateralProposal7 {

    @XmlElement(name = "VartnMrgn", required = true)
    protected CollateralMovement12 vartnMrgn;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected CollateralMovement12 sgrtdIndpdntAmt;

    /**
     * Gets the value of the vartnMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement12 }
     *     
     */
    public CollateralMovement12 getVartnMrgn() {
        return vartnMrgn;
    }

    /**
     * Sets the value of the vartnMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement12 }
     *     
     */
    public void setVartnMrgn(CollateralMovement12 value) {
        this.vartnMrgn = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralMovement12 }
     *     
     */
    public CollateralMovement12 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralMovement12 }
     *     
     */
    public void setSgrtdIndpdntAmt(CollateralMovement12 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
