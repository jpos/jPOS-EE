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

package org.jpos.iso20022.auth_086_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityReuseData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityReuseData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ISIN" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}ISINOct2015Identifier"/>
 *         <element name="ReuseVal" type="{urn:iso:std:iso:20022:tech:xsd:auth.086.001.02}ReuseValue1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityReuseData1", propOrder = {
    "isin",
    "reuseVal"
})
public class SecurityReuseData1 {

    @XmlElement(name = "ISIN", required = true)
    protected String isin;
    @XmlElement(name = "ReuseVal", required = true)
    protected ReuseValue1Choice reuseVal;

    /**
     * Gets the value of the isin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISIN() {
        return isin;
    }

    /**
     * Sets the value of the isin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISIN(String value) {
        this.isin = value;
    }

    /**
     * Gets the value of the reuseVal property.
     * 
     * @return
     *     possible object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public ReuseValue1Choice getReuseVal() {
        return reuseVal;
    }

    /**
     * Sets the value of the reuseVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReuseValue1Choice }
     *     
     */
    public void setReuseVal(ReuseValue1Choice value) {
        this.reuseVal = value;
    }

}
