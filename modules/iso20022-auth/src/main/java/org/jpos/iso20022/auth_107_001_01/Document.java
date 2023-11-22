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

package org.jpos.iso20022.auth_107_001_01;

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
 *         <element name="DerivsTradStatRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}DerivativesTradeStateReportV01"/>
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
    "derivsTradStatRpt"
})
public class Document {

    @XmlElement(name = "DerivsTradStatRpt", required = true)
    protected DerivativesTradeStateReportV01 derivsTradStatRpt;

    /**
     * Gets the value of the derivsTradStatRpt property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativesTradeStateReportV01 }
     *     
     */
    public DerivativesTradeStateReportV01 getDerivsTradStatRpt() {
        return derivsTradStatRpt;
    }

    /**
     * Sets the value of the derivsTradStatRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativesTradeStateReportV01 }
     *     
     */
    public void setDerivsTradStatRpt(DerivativesTradeStateReportV01 value) {
        this.derivsTradStatRpt = value;
    }

}
