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

package org.jpos.iso20022.auth_023_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractRegistrationStatementCriteria1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractRegistrationStatementCriteria1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="SpprtgDocJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlSpprtgDocJrnl" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="RgltryRuleVldtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.023.001.03}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractRegistrationStatementCriteria1", propOrder = {
    "txJrnl",
    "spprtgDocJrnl",
    "addtlSpprtgDocJrnl",
    "rgltryRuleVldtn"
})
public class ContractRegistrationStatementCriteria1 {

    @XmlElement(name = "TxJrnl")
    protected Boolean txJrnl;
    @XmlElement(name = "SpprtgDocJrnl")
    protected Boolean spprtgDocJrnl;
    @XmlElement(name = "AddtlSpprtgDocJrnl")
    protected Boolean addtlSpprtgDocJrnl;
    @XmlElement(name = "RgltryRuleVldtn")
    protected Boolean rgltryRuleVldtn;

    /**
     * Gets the value of the txJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTxJrnl() {
        return txJrnl;
    }

    /**
     * Sets the value of the txJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTxJrnl(Boolean value) {
        this.txJrnl = value;
    }

    /**
     * Gets the value of the spprtgDocJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpprtgDocJrnl() {
        return spprtgDocJrnl;
    }

    /**
     * Sets the value of the spprtgDocJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpprtgDocJrnl(Boolean value) {
        this.spprtgDocJrnl = value;
    }

    /**
     * Gets the value of the addtlSpprtgDocJrnl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddtlSpprtgDocJrnl() {
        return addtlSpprtgDocJrnl;
    }

    /**
     * Sets the value of the addtlSpprtgDocJrnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddtlSpprtgDocJrnl(Boolean value) {
        this.addtlSpprtgDocJrnl = value;
    }

    /**
     * Gets the value of the rgltryRuleVldtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRgltryRuleVldtn() {
        return rgltryRuleVldtn;
    }

    /**
     * Sets the value of the rgltryRuleVldtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRgltryRuleVldtn(Boolean value) {
        this.rgltryRuleVldtn = value;
    }

}
