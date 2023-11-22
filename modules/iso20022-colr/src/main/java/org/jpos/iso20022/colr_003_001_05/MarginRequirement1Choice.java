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
 * <p>Java class for MarginRequirement1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarginRequirement1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="MrgnRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}Requirement1"/>
 *         <element name="SgrtdIndpdntAmtRqrmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.003.001.05}MarginRequirement1"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginRequirement1Choice", propOrder = {
    "mrgnRqrmnt",
    "sgrtdIndpdntAmtRqrmnt"
})
public class MarginRequirement1Choice {

    @XmlElement(name = "MrgnRqrmnt")
    protected Requirement1 mrgnRqrmnt;
    @XmlElement(name = "SgrtdIndpdntAmtRqrmnt")
    protected MarginRequirement1 sgrtdIndpdntAmtRqrmnt;

    /**
     * Gets the value of the mrgnRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link Requirement1 }
     *     
     */
    public Requirement1 getMrgnRqrmnt() {
        return mrgnRqrmnt;
    }

    /**
     * Sets the value of the mrgnRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Requirement1 }
     *     
     */
    public void setMrgnRqrmnt(Requirement1 value) {
        this.mrgnRqrmnt = value;
    }

    /**
     * Gets the value of the sgrtdIndpdntAmtRqrmnt property.
     * 
     * @return
     *     possible object is
     *     {@link MarginRequirement1 }
     *     
     */
    public MarginRequirement1 getSgrtdIndpdntAmtRqrmnt() {
        return sgrtdIndpdntAmtRqrmnt;
    }

    /**
     * Sets the value of the sgrtdIndpdntAmtRqrmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginRequirement1 }
     *     
     */
    public void setSgrtdIndpdntAmtRqrmnt(MarginRequirement1 value) {
        this.sgrtdIndpdntAmtRqrmnt = value;
    }

}
