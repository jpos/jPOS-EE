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

package org.jpos.iso20022.auth_067_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Document complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Document">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CCPCollRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.067.001.01}CCPCollateralReportV01"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "ccpCollRpt"
})
public class Document {

    @XmlElement(name = "CCPCollRpt", required = true)
    protected CCPCollateralReportV01 ccpCollRpt;

    /**
     * Gets the value of the ccpCollRpt property.
     * 
     * @return
     *     possible object is
     *     {@link CCPCollateralReportV01 }
     *     
     */
    public CCPCollateralReportV01 getCCPCollRpt() {
        return ccpCollRpt;
    }

    /**
     * Sets the value of the ccpCollRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCPCollateralReportV01 }
     *     
     */
    public void setCCPCollRpt(CCPCollateralReportV01 value) {
        this.ccpCollRpt = value;
    }

}
