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

package org.jpos.iso20022.auth_061_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RepurchaseAgreementType3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RepurchaseAgreementType3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SpcfcColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}SpecificCollateral2"/>
 *         <element name="GnlColl" type="{urn:iso:std:iso:20022:tech:xsd:auth.061.001.01}GeneralCollateral3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepurchaseAgreementType3Choice", propOrder = {
    "spcfcColl",
    "gnlColl"
})
public class RepurchaseAgreementType3Choice {

    @XmlElement(name = "SpcfcColl")
    protected SpecificCollateral2 spcfcColl;
    @XmlElement(name = "GnlColl")
    protected GeneralCollateral3 gnlColl;

    /**
     * Gets the value of the spcfcColl property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificCollateral2 }
     *     
     */
    public SpecificCollateral2 getSpcfcColl() {
        return spcfcColl;
    }

    /**
     * Sets the value of the spcfcColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificCollateral2 }
     *     
     */
    public void setSpcfcColl(SpecificCollateral2 value) {
        this.spcfcColl = value;
    }

    /**
     * Gets the value of the gnlColl property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralCollateral3 }
     *     
     */
    public GeneralCollateral3 getGnlColl() {
        return gnlColl;
    }

    /**
     * Sets the value of the gnlColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralCollateral3 }
     *     
     */
    public void setGnlColl(GeneralCollateral3 value) {
        this.gnlColl = value;
    }

}
