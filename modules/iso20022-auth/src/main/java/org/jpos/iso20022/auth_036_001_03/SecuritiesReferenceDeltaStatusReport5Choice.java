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

package org.jpos.iso20022.auth_036_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesReferenceDeltaStatusReport5Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesReferenceDeltaStatusReport5Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ModfdRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}SecuritiesReferenceDataReport6"/>
 *         <element name="NewRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}SecuritiesReferenceDataReport6"/>
 *         <element name="TermntdRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}SecuritiesReferenceDataReport6"/>
 *         <element name="CancRcrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.036.001.03}SecuritiesReferenceDataReport7"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesReferenceDeltaStatusReport5Choice", propOrder = {
    "modfdRcrd",
    "newRcrd",
    "termntdRcrd",
    "cancRcrd"
})
public class SecuritiesReferenceDeltaStatusReport5Choice {

    @XmlElement(name = "ModfdRcrd")
    protected SecuritiesReferenceDataReport6 modfdRcrd;
    @XmlElement(name = "NewRcrd")
    protected SecuritiesReferenceDataReport6 newRcrd;
    @XmlElement(name = "TermntdRcrd")
    protected SecuritiesReferenceDataReport6 termntdRcrd;
    @XmlElement(name = "CancRcrd")
    protected SecuritiesReferenceDataReport7 cancRcrd;

    /**
     * Gets the value of the modfdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getModfdRcrd() {
        return modfdRcrd;
    }

    /**
     * Sets the value of the modfdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public void setModfdRcrd(SecuritiesReferenceDataReport6 value) {
        this.modfdRcrd = value;
    }

    /**
     * Gets the value of the newRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getNewRcrd() {
        return newRcrd;
    }

    /**
     * Sets the value of the newRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public void setNewRcrd(SecuritiesReferenceDataReport6 value) {
        this.newRcrd = value;
    }

    /**
     * Gets the value of the termntdRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public SecuritiesReferenceDataReport6 getTermntdRcrd() {
        return termntdRcrd;
    }

    /**
     * Sets the value of the termntdRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport6 }
     *     
     */
    public void setTermntdRcrd(SecuritiesReferenceDataReport6 value) {
        this.termntdRcrd = value;
    }

    /**
     * Gets the value of the cancRcrd property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesReferenceDataReport7 }
     *     
     */
    public SecuritiesReferenceDataReport7 getCancRcrd() {
        return cancRcrd;
    }

    /**
     * Sets the value of the cancRcrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesReferenceDataReport7 }
     *     
     */
    public void setCancRcrd(SecuritiesReferenceDataReport7 value) {
        this.cancRcrd = value;
    }

}
