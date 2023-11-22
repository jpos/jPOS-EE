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

package org.jpos.iso20022.tsmt_016_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElementIdentification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ElementIdentification3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ElmtPth" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}Max350Text"/>
 *         <element name="ElmtNm" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}Max35Text"/>
 *         <element name="ElmtVal" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.016.001.03}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementIdentification3", propOrder = {
    "elmtPth",
    "elmtNm",
    "elmtVal"
})
public class ElementIdentification3 {

    @XmlElement(name = "ElmtPth", required = true)
    protected String elmtPth;
    @XmlElement(name = "ElmtNm", required = true)
    protected String elmtNm;
    @XmlElement(name = "ElmtVal")
    protected String elmtVal;

    /**
     * Gets the value of the elmtPth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtPth() {
        return elmtPth;
    }

    /**
     * Sets the value of the elmtPth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmtPth(String value) {
        this.elmtPth = value;
    }

    /**
     * Gets the value of the elmtNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtNm() {
        return elmtNm;
    }

    /**
     * Sets the value of the elmtNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmtNm(String value) {
        this.elmtNm = value;
    }

    /**
     * Gets the value of the elmtVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElmtVal() {
        return elmtVal;
    }

    /**
     * Sets the value of the elmtVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElmtVal(String value) {
        this.elmtVal = value;
    }

}
