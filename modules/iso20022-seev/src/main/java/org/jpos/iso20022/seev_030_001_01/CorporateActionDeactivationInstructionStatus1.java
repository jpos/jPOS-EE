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

package org.jpos.iso20022.seev_030_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionDeactivationInstructionStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionDeactivationInstructionStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OptnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionOption1FormatChoice" minOccurs="0"/>
 *         <element name="OptnNb" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}Exact3NumericText" minOccurs="0"/>
 *         <choice>
 *           <element name="PrcdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionDeactivationInstructionProcessingStatus1"/>
 *           <element name="RjctdSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionDeactivationInstructionRejectionStatus1"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionDeactivationInstructionStatus1", propOrder = {
    "optnTp",
    "optnNb",
    "prcdSts",
    "rjctdSts"
})
public class CorporateActionDeactivationInstructionStatus1 {

    @XmlElement(name = "OptnTp")
    protected CorporateActionOption1FormatChoice optnTp;
    @XmlElement(name = "OptnNb")
    protected String optnNb;
    @XmlElement(name = "PrcdSts")
    protected CorporateActionDeactivationInstructionProcessingStatus1 prcdSts;
    @XmlElement(name = "RjctdSts")
    protected CorporateActionDeactivationInstructionRejectionStatus1 rjctdSts;

    /**
     * Gets the value of the optnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public CorporateActionOption1FormatChoice getOptnTp() {
        return optnTp;
    }

    /**
     * Sets the value of the optnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionOption1FormatChoice }
     *     
     */
    public void setOptnTp(CorporateActionOption1FormatChoice value) {
        this.optnTp = value;
    }

    /**
     * Gets the value of the optnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnNb() {
        return optnNb;
    }

    /**
     * Sets the value of the optnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptnNb(String value) {
        this.optnNb = value;
    }

    /**
     * Gets the value of the prcdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationInstructionProcessingStatus1 }
     *     
     */
    public CorporateActionDeactivationInstructionProcessingStatus1 getPrcdSts() {
        return prcdSts;
    }

    /**
     * Sets the value of the prcdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationInstructionProcessingStatus1 }
     *     
     */
    public void setPrcdSts(CorporateActionDeactivationInstructionProcessingStatus1 value) {
        this.prcdSts = value;
    }

    /**
     * Gets the value of the rjctdSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationInstructionRejectionStatus1 }
     *     
     */
    public CorporateActionDeactivationInstructionRejectionStatus1 getRjctdSts() {
        return rjctdSts;
    }

    /**
     * Sets the value of the rjctdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationInstructionRejectionStatus1 }
     *     
     */
    public void setRjctdSts(CorporateActionDeactivationInstructionRejectionStatus1 value) {
        this.rjctdSts = value;
    }

}
