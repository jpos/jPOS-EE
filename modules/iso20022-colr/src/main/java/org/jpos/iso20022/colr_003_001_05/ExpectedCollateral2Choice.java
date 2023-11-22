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

package org.jpos.iso20022.colr_003_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpectedCollateral2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExpectedCollateral2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="XpctdCollDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateral2"/>
 *         <element name="SgrtdIndpdntAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}ExpectedCollateralMovement2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpectedCollateral2Choice", propOrder = {
    "xpctdCollDtls",
    "sgrtdIndpdntAmt"
})
public class ExpectedCollateral2Choice {

    @XmlElement(name = "XpctdCollDtls")
    protected ExpectedCollateral2 xpctdCollDtls;
    @XmlElement(name = "SgrtdIndpdntAmt")
    protected ExpectedCollateralMovement2 sgrtdIndpdntAmt;

    /**
     * Gets the value of the xpctdCollDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateral2 }
     *     
     */
    public ExpectedCollateral2 getXpctdCollDtls() {
        return xpctdCollDtls;
    }

    /**
     * Sets the value of the xpctdCollDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateral2 }
     *     
     */
    public void setXpctdCollDtls(ExpectedCollateral2 value) {
        this.xpctdCollDtls = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public ExpectedCollateralMovement2 getSgrtdIndpdntAmt() {
        return sgrtdIndpdntAmt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedCollateralMovement2 }
     *     
     */
    public void setSgrtdIndpdntAmt(ExpectedCollateralMovement2 value) {
        this.sgrtdIndpdntAmt = value;
    }

}
