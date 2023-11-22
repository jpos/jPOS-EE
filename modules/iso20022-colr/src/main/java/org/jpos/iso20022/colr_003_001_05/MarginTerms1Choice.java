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
 * <p>Java class for MarginTerms1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginTerms1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MrgnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Margin1"/>
 *         <element name="SgrtdIndpdntAmtMrgn" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}SegregatedIndependentAmountMargin1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginTerms1Choice", propOrder = {
    "mrgnDtls",
    "sgrtdIndpdntAmtMrgn"
})
public class MarginTerms1Choice {

    @XmlElement(name = "MrgnDtls")
    protected Margin1 mrgnDtls;
    @XmlElement(name = "SgrtdIndpdntAmtMrgn")
    protected SegregatedIndependentAmountMargin1 sgrtdIndpdntAmtMrgn;

    /**
     * Gets the value of the mrgnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Margin1 }
     *     
     */
    public Margin1 getMrgnDtls() {
        return mrgnDtls;
    }

    /**
     * Sets the value of the mrgnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Margin1 }
     *     
     */
    public void setMrgnDtls(Margin1 value) {
        this.mrgnDtls = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtMrgn property.
     * 
     * @return
     *     possible object is
     *     {@link SegregatedIndependentAmountMargin1 }
     *     
     */
    public SegregatedIndependentAmountMargin1 getSgrtdIndpdntAmtMrgn() {
        return sgrtdIndpdntAmtMrgn;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtMrgn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegregatedIndependentAmountMargin1 }
     *     
     */
    public void setSgrtdIndpdntAmtMrgn(SegregatedIndependentAmountMargin1 value) {
        this.sgrtdIndpdntAmtMrgn = value;
    }

}
