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

package org.jpos.iso20022.admi_005_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountIdentificationSearchCriteria2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountIdentificationSearchCriteria2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="EQ" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}AccountIdentification4Choice"/>
 *         <element name="CTTxt" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}Max35Text"/>
 *         <element name="NCTTxt" type="{urn:iso:std:iso:20022:tech:xsd:admi.005.001.01}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentificationSearchCriteria2Choice", propOrder = {
    "eq",
    "ctTxt",
    "nctTxt"
})
public class AccountIdentificationSearchCriteria2Choice {

    @XmlElement(name = "EQ")
    protected AccountIdentification4Choice eq;
    @XmlElement(name = "CTTxt")
    protected String ctTxt;
    @XmlElement(name = "NCTTxt")
    protected String nctTxt;

    /**
     * Gets the value of the eq property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getEQ() {
        return eq;
    }

    /**
     * Sets the value of the eq property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setEQ(AccountIdentification4Choice value) {
        this.eq = value;
    }

    /**
     * Gets the value of the ctTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCTTxt() {
        return ctTxt;
    }

    /**
     * Sets the value of the ctTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCTTxt(String value) {
        this.ctTxt = value;
    }

    /**
     * Gets the value of the nctTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCTTxt() {
        return nctTxt;
    }

    /**
     * Sets the value of the nctTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCTTxt(String value) {
        this.nctTxt = value;
    }

}
