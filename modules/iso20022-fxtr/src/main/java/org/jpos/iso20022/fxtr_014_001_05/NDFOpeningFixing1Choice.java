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

package org.jpos.iso20022.fxtr_014_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NDFOpeningFixing1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NDFOpeningFixing1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="OpngConds" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05}OpeningConditions1"/>
 *         <element name="OpngConfRef" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDFOpeningFixing1Choice", propOrder = {
    "opngConds",
    "opngConfRef"
})
public class NDFOpeningFixing1Choice {

    @XmlElement(name = "OpngConds")
    protected OpeningConditions1 opngConds;
    @XmlElement(name = "OpngConfRef")
    protected String opngConfRef;

    /**
     * Gets the value of the opngConds property.
     * 
     * @return
     *     possible object is
     *     {@link OpeningConditions1 }
     *     
     */
    public OpeningConditions1 getOpngConds() {
        return opngConds;
    }

    /**
     * Sets the value of the opngConds property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpeningConditions1 }
     *     
     */
    public void setOpngConds(OpeningConditions1 value) {
        this.opngConds = value;
    }

    /**
     * Gets the value of the opngConfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpngConfRef() {
        return opngConfRef;
    }

    /**
     * Sets the value of the opngConfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpngConfRef(String value) {
        this.opngConfRef = value;
    }

}
