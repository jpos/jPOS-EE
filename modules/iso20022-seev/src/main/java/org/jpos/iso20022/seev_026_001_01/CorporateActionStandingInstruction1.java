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

package org.jpos.iso20022.seev_026_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionStandingInstruction1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionStandingInstruction1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <choice>
 *           <element name="NetOrGrss" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}StandingInstructionGrossNet1Code"/>
 *           <element name="CshDstrbtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}CashAccount17"/>
 *           <element name="SctiesDstrbtnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}SecuritiesAccount6"/>
 *         </choice>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}Max350Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionStandingInstruction1", propOrder = {
    "netOrGrss",
    "cshDstrbtnDtls",
    "sctiesDstrbtnDtls",
    "addtlInf"
})
public class CorporateActionStandingInstruction1 {

    @XmlElement(name = "NetOrGrss")
    @XmlSchemaType(name = "string")
    protected StandingInstructionGrossNet1Code netOrGrss;
    @XmlElement(name = "CshDstrbtnDtls")
    protected CashAccount17 cshDstrbtnDtls;
    @XmlElement(name = "SctiesDstrbtnDtls")
    protected SecuritiesAccount6 sctiesDstrbtnDtls;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the netOrGrss property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionGrossNet1Code }
     *     
     */
    public StandingInstructionGrossNet1Code getNetOrGrss() {
        return netOrGrss;
    }

    /**
     * Sets the value of the netOrGrss property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionGrossNet1Code }
     *     
     */
    public void setNetOrGrss(StandingInstructionGrossNet1Code value) {
        this.netOrGrss = value;
    }

    /**
     * Gets the value of the cshDstrbtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount17 }
     *     
     */
    public CashAccount17 getCshDstrbtnDtls() {
        return cshDstrbtnDtls;
    }

    /**
     * Sets the value of the cshDstrbtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount17 }
     *     
     */
    public void setCshDstrbtnDtls(CashAccount17 value) {
        this.cshDstrbtnDtls = value;
    }

    /**
     * Gets the value of the sctiesDstrbtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount6 }
     *     
     */
    public SecuritiesAccount6 getSctiesDstrbtnDtls() {
        return sctiesDstrbtnDtls;
    }

    /**
     * Sets the value of the sctiesDstrbtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount6 }
     *     
     */
    public void setSctiesDstrbtnDtls(SecuritiesAccount6 value) {
        this.sctiesDstrbtnDtls = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
