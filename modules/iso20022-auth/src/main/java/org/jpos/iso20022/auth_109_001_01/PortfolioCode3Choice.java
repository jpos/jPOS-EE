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

package org.jpos.iso20022.auth_109_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioCode3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioCode3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}Max52Text"/>
 *         <element name="NoPrtfl" type="{urn:iso:std:iso:20022:tech:xsd:auth.109.001.01}NotApplicable1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioCode3Choice", propOrder = {
    "cd",
    "noPrtfl"
})
public class PortfolioCode3Choice {

    @XmlElement(name = "Cd")
    protected String cd;
    @XmlElement(name = "NoPrtfl")
    @XmlSchemaType(name = "string")
    protected NotApplicable1Code noPrtfl;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the noPrtfl property.
     * 
     * @return
     *     possible object is
     *     {@link NotApplicable1Code }
     *     
     */
    public NotApplicable1Code getNoPrtfl() {
        return noPrtfl;
    }

    /**
     * Sets the value of the noPrtfl property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotApplicable1Code }
     *     
     */
    public void setNoPrtfl(NotApplicable1Code value) {
        this.noPrtfl = value;
    }

}
