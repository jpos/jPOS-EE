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

package org.jpos.iso20022.colr_002_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralValueReportOrError6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralValueReportOrError6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="BizErr" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ErrorHandling5"/>
 *         <element name="CollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}CollateralValuePosition3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralValueReportOrError6Choice", propOrder = {
    "bizErr",
    "collVal"
})
public class CollateralValueReportOrError6Choice {

    @XmlElement(name = "BizErr")
    protected ErrorHandling5 bizErr;
    @XmlElement(name = "CollVal")
    protected CollateralValuePosition3 collVal;

    /**
     * Gets the value of the bizErr property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorHandling5 }
     *     
     */
    public ErrorHandling5 getBizErr() {
        return bizErr;
    }

    /**
     * Sets the value of the bizErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorHandling5 }
     *     
     */
    public void setBizErr(ErrorHandling5 value) {
        this.bizErr = value;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralValuePosition3 }
     *     
     */
    public CollateralValuePosition3 getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralValuePosition3 }
     *     
     */
    public void setCollVal(CollateralValuePosition3 value) {
        this.collVal = value;
    }

}
