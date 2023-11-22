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

package org.jpos.iso20022.seev_035_001_14;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionPreliminaryAdviceType3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionPreliminaryAdviceType3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionPreliminaryAdviceType1Code"/>
 *         <element name="Fctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.035.001.14}CorporateActionMovementPreliminaryAdviceFunction1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionPreliminaryAdviceType3", propOrder = {
    "tp",
    "fctn"
})
public class CorporateActionPreliminaryAdviceType3 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionPreliminaryAdviceType1Code tp;
    @XmlElement(name = "Fctn", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionMovementPreliminaryAdviceFunction1Code fctn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public CorporateActionPreliminaryAdviceType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionPreliminaryAdviceType1Code }
     *     
     */
    public void setTp(CorporateActionPreliminaryAdviceType1Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the fctn property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceFunction1Code }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceFunction1Code getFctn() {
        return fctn;
    }

    /**
     * Sets the value of the fctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceFunction1Code }
     *     
     */
    public void setFctn(CorporateActionMovementPreliminaryAdviceFunction1Code value) {
        this.fctn = value;
    }

}
