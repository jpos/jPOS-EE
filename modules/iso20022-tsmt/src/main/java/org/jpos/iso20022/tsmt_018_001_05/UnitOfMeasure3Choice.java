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

package org.jpos.iso20022.tsmt_018_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnitOfMeasure3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UnitOfMeasure3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="UnitOfMeasrCd" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}UnitOfMeasure4Code"/>
 *         <element name="OthrUnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.018.001.05}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitOfMeasure3Choice", propOrder = {
    "unitOfMeasrCd",
    "othrUnitOfMeasr"
})
public class UnitOfMeasure3Choice {

    @XmlElement(name = "UnitOfMeasrCd")
    protected String unitOfMeasrCd;
    @XmlElement(name = "OthrUnitOfMeasr")
    protected String othrUnitOfMeasr;

    /**
     * Gets the value of the unitOfMeasrCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasrCd() {
        return unitOfMeasrCd;
    }

    /**
     * Sets the value of the unitOfMeasrCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasrCd(String value) {
        this.unitOfMeasrCd = value;
    }

    /**
     * Gets the value of the othrUnitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrUnitOfMeasr() {
        return othrUnitOfMeasr;
    }

    /**
     * Sets the value of the othrUnitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrUnitOfMeasr(String value) {
        this.othrUnitOfMeasr = value;
    }

}
