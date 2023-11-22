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

package org.jpos.iso20022.sese_003_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CopyInformation5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CopyInformation5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CpyInd" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}YesNoIndicator"/>
 *         <element name="OrgnlRcvr" type="{urn:iso:std:iso:20022:tech:xsd:sese.003.001.09}AnyBICDec2014Identifier" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyInformation5", propOrder = {
    "cpyInd",
    "orgnlRcvr"
})
public class CopyInformation5 {

    @XmlElement(name = "CpyInd")
    protected boolean cpyInd;
    @XmlElement(name = "OrgnlRcvr")
    protected String orgnlRcvr;

    /**
     * Gets the value of the cpyInd property.
     * 
     */
    public boolean isCpyInd() {
        return cpyInd;
    }

    /**
     * Sets the value of the cpyInd property.
     * 
     */
    public void setCpyInd(boolean value) {
        this.cpyInd = value;
    }

    /**
     * Gets the value of the orgnlRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlRcvr() {
        return orgnlRcvr;
    }

    /**
     * Sets the value of the orgnlRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlRcvr(String value) {
        this.orgnlRcvr = value;
    }

}
