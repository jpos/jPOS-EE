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

package org.jpos.iso20022.tsmt_019_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultimodalTransport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MultimodalTransport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TakngInChrg" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max35Text"/>
 *         <element name="PlcOfFnlDstn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.05}Max35Text"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimodalTransport3", propOrder = {
    "takngInChrg",
    "plcOfFnlDstn"
})
public class MultimodalTransport3 {

    @XmlElement(name = "TakngInChrg", required = true)
    protected String takngInChrg;
    @XmlElement(name = "PlcOfFnlDstn", required = true)
    protected String plcOfFnlDstn;

    /**
     * Gets the value of the takngInChrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTakngInChrg() {
        return takngInChrg;
    }

    /**
     * Sets the value of the takngInChrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTakngInChrg(String value) {
        this.takngInChrg = value;
    }

    /**
     * Gets the value of the plcOfFnlDstn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcOfFnlDstn() {
        return plcOfFnlDstn;
    }

    /**
     * Sets the value of the plcOfFnlDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlcOfFnlDstn(String value) {
        this.plcOfFnlDstn = value;
    }

}
