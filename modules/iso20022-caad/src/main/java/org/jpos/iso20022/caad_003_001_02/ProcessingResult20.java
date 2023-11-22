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

package org.jpos.iso20022.caad_003_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingResult20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingResult20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RsltData" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}ResultData8"/>
 *         <element name="OrgnlRsltData" type="{urn:iso:std:iso:20022:tech:xsd:caad.003.001.02}ResultData7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult20", propOrder = {
    "rsltData",
    "orgnlRsltData"
})
public class ProcessingResult20 {

    @XmlElement(name = "RsltData", required = true)
    protected ResultData8 rsltData;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData7 orgnlRsltData;

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData8 }
     *     
     */
    public ResultData8 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData8 }
     *     
     */
    public void setRsltData(ResultData8 value) {
        this.rsltData = value;
    }

    /**
     * Gets the value of the orgnlRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Sets the value of the orgnlRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public void setOrgnlRsltData(ResultData7 value) {
        this.orgnlRsltData = value;
    }

}
