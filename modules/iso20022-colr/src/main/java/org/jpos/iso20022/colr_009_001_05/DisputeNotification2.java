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

package org.jpos.iso20022.colr_009_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisputeNotification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DisputeNotification2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VartnMrgnDspt" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}VariationMarginDispute1"/>
 *         <element name="SgrtdIndpdntAmtDspt" type="{urn:iso:std:iso:20022:tech:xsd:colr.009.001.05}SegregatedIndependentAmountDispute2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisputeNotification2", propOrder = {
    "vartnMrgnDspt",
    "sgrtdIndpdntAmtDspt"
})
public class DisputeNotification2 {

    @XmlElement(name = "VartnMrgnDspt", required = true)
    protected VariationMarginDispute1 vartnMrgnDspt;
    @XmlElement(name = "SgrtdIndpdntAmtDspt")
    protected SegregatedIndependentAmountDispute2 sgrtdIndpdntAmtDspt;

    /**
     * Gets the value of the vartnMrgnDspt property.
     * 
     * @return
     *     possible object is
     *     {@link VariationMarginDispute1 }
     *     
     */
    public VariationMarginDispute1 getVartnMrgnDspt() {
        return vartnMrgnDspt;
    }

    /**
     * Sets the value of the vartnMrgnDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariationMarginDispute1 }
     *     
     */
    public void setVartnMrgnDspt(VariationMarginDispute1 value) {
        this.vartnMrgnDspt = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public SegregatedIndependentAmountDispute2 getSgrtdIndpdntAmtDspt() {
        return sgrtdIndpdntAmtDspt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtDspt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountDispute2 }
     *     
     */
    public void setSgrtdIndpdntAmtDspt(SegregatedIndependentAmountDispute2 value) {
        this.sgrtdIndpdntAmtDspt = value;
    }

}
