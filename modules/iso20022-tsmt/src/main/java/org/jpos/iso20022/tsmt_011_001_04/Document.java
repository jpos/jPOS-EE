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

package org.jpos.iso20022.tsmt_011_001_04;

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
 *         <element name="BaselnRpt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.011.001.04}BaselineReportV04"/>
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
    "baselnRpt"
})
public class Document {

    @XmlElement(name = "BaselnRpt", required = true)
    protected BaselineReportV04 baselnRpt;

    /**
     * Gets the value of the baselnRpt property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineReportV04 }
     *     
     */
    public BaselineReportV04 getBaselnRpt() {
        return baselnRpt;
    }

    /**
     * Sets the value of the baselnRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineReportV04 }
     *     
     */
    public void setBaselnRpt(BaselineReportV04 value) {
        this.baselnRpt = value;
    }

}
