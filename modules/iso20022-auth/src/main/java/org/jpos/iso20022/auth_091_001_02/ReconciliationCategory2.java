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

package org.jpos.iso20022.auth_091_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationCategory2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReconciliationCategory2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rvvd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}YesNoIndicator"/>
 *         <element name="FrthrMod" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}YesNoIndicator"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReconciliationCategory2", propOrder = {
    "rvvd",
    "frthrMod"
})
public class ReconciliationCategory2 {

    @XmlElement(name = "Rvvd")
    protected boolean rvvd;
    @XmlElement(name = "FrthrMod")
    protected boolean frthrMod;

    /**
     * Gets the value of the rvvd property.
     * 
     */
    public boolean isRvvd() {
        return rvvd;
    }

    /**
     * Sets the value of the rvvd property.
     * 
     */
    public void setRvvd(boolean value) {
        this.rvvd = value;
    }

    /**
     * Gets the value of the frthrMod property.
     * 
     */
    public boolean isFrthrMod() {
        return frthrMod;
    }

    /**
     * Sets the value of the frthrMod property.
     * 
     */
    public void setFrthrMod(boolean value) {
        this.frthrMod = value;
    }

}
