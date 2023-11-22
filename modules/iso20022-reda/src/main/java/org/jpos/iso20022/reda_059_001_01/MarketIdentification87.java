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

package org.jpos.iso20022.reda_059_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketIdentification87 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketIdentification87">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ctry" type="{urn:iso:std:iso:20022:tech:xsd:reda.059.001.01}CountryCode"/>
 *         <element name="ClssfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:reda.059.001.01}ClassificationType1Choice"/>
 *         <element name="SttlmPurp" type="{urn:iso:std:iso:20022:tech:xsd:reda.059.001.01}Purpose3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentification87", propOrder = {
    "ctry",
    "clssfctnTp",
    "sttlmPurp"
})
public class MarketIdentification87 {

    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "ClssfctnTp", required = true)
    protected ClassificationType1Choice clssfctnTp;
    @XmlElement(name = "SttlmPurp")
    protected Purpose3Choice sttlmPurp;

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtry(String value) {
        this.ctry = value;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public ClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public void setClssfctnTp(ClassificationType1Choice value) {
        this.clssfctnTp = value;
    }

    /**
     * Gets the value of the sttlmPurp property.
     * 
     * @return
     *     possible object is
     *     {@link Purpose3Choice }
     *     
     */
    public Purpose3Choice getSttlmPurp() {
        return sttlmPurp;
    }

    /**
     * Sets the value of the sttlmPurp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Purpose3Choice }
     *     
     */
    public void setSttlmPurp(Purpose3Choice value) {
        this.sttlmPurp = value;
    }

}
