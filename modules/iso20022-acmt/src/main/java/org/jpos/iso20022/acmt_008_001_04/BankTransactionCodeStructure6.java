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

package org.jpos.iso20022.acmt_008_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankTransactionCodeStructure6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BankTransactionCodeStructure6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Cd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}ExternalBankTransactionFamily1Code"/>
 *         <element name="SubFmlyCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.008.001.04}ExternalBankTransactionSubFamily1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankTransactionCodeStructure6", propOrder = {
    "cd",
    "subFmlyCd"
})
public class BankTransactionCodeStructure6 {

    @XmlElement(name = "Cd", required = true)
    protected String cd;
    @XmlElement(name = "SubFmlyCd", required = true)
    protected String subFmlyCd;

    /**
     * Gets the value of the cd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCd() {
        return cd;
    }

    /**
     * Sets the value of the cd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCd(String value) {
        this.cd = value;
    }

    /**
     * Gets the value of the subFmlyCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubFmlyCd() {
        return subFmlyCd;
    }

    /**
     * Sets the value of the subFmlyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubFmlyCd(String value) {
        this.subFmlyCd = value;
    }

}
