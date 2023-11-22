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

package org.jpos.iso20022.auth_045_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrumentOrSubClassIdentification2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstrumentOrSubClassIdentification2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ISINAndSubClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}InstrumentAndSubClassIdentification2"/>
 *         <element name="AsstClssAndSubClss" type="{urn:iso:std:iso:20022:tech:xsd:auth.045.001.03}AssetClassAndSubClassIdentification2"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentOrSubClassIdentification2Choice", propOrder = {
    "isinAndSubClss",
    "asstClssAndSubClss"
})
public class InstrumentOrSubClassIdentification2Choice {

    @XmlElement(name = "ISINAndSubClss")
    protected InstrumentAndSubClassIdentification2 isinAndSubClss;
    @XmlElement(name = "AsstClssAndSubClss")
    protected AssetClassAndSubClassIdentification2 asstClssAndSubClss;

    /**
     * Gets the value of the isinAndSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentAndSubClassIdentification2 }
     *     
     */
    public InstrumentAndSubClassIdentification2 getISINAndSubClss() {
        return isinAndSubClss;
    }

    /**
     * Sets the value of the isinAndSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentAndSubClassIdentification2 }
     *     
     */
    public void setISINAndSubClss(InstrumentAndSubClassIdentification2 value) {
        this.isinAndSubClss = value;
    }

    /**
     * Gets the value of the asstClssAndSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassAndSubClassIdentification2 }
     *     
     */
    public AssetClassAndSubClassIdentification2 getAsstClssAndSubClss() {
        return asstClssAndSubClss;
    }

    /**
     * Sets the value of the asstClssAndSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassAndSubClassIdentification2 }
     *     
     */
    public void setAsstClssAndSubClss(AssetClassAndSubClassIdentification2 value) {
        this.asstClssAndSubClss = value;
    }

}
