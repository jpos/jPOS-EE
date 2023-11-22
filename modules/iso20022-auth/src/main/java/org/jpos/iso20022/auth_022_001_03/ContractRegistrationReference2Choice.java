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

package org.jpos.iso20022.auth_022_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRegistrationReference2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractRegistrationReference2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="RegdCtrctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}Max35Text"/>
 *         <element name="Ctrct" type="{urn:iso:std:iso:20022:tech:xsd:auth.022.001.03}DocumentIdentification35"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationReference2Choice", propOrder = {
    "regdCtrctId",
    "ctrct"
})
public class ContractRegistrationReference2Choice {

    @XmlElement(name = "RegdCtrctId")
    protected String regdCtrctId;
    @XmlElement(name = "Ctrct")
    protected DocumentIdentification35 ctrct;

    /**
     * Gets the value of the regdCtrctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegdCtrctId() {
        return regdCtrctId;
    }

    /**
     * Sets the value of the regdCtrctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegdCtrctId(String value) {
        this.regdCtrctId = value;
    }

    /**
     * Gets the value of the ctrct property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification35 }
     *     
     */
    public DocumentIdentification35 getCtrct() {
        return ctrct;
    }

    /**
     * Sets the value of the ctrct property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification35 }
     *     
     */
    public void setCtrct(DocumentIdentification35 value) {
        this.ctrct = value;
    }

}
