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

package org.jpos.iso20022.casr_001_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementTotals2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementTotals2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcqrrTtls" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}SettlementCategoryTotal2" minOccurs="0"/>
 *         <element name="IssrTtls" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}SettlementCategoryTotal2" minOccurs="0"/>
 *         <element name="OthrTtls" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}SettlementCategoryTotal2" minOccurs="0"/>
 *         <element name="TtlSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}SettlementCategoryTotal2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTotals2", propOrder = {
    "acqrrTtls",
    "issrTtls",
    "othrTtls",
    "ttlSttlmAmt"
})
public class SettlementTotals2 {

    @XmlElement(name = "AcqrrTtls")
    protected SettlementCategoryTotal2 acqrrTtls;
    @XmlElement(name = "IssrTtls")
    protected SettlementCategoryTotal2 issrTtls;
    @XmlElement(name = "OthrTtls")
    protected SettlementCategoryTotal2 othrTtls;
    @XmlElement(name = "TtlSttlmAmt")
    protected SettlementCategoryTotal2 ttlSttlmAmt;

    /**
     * Gets the value of the acqrrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getAcqrrTtls() {
        return acqrrTtls;
    }

    /**
     * Sets the value of the acqrrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public void setAcqrrTtls(SettlementCategoryTotal2 value) {
        this.acqrrTtls = value;
    }

    /**
     * Gets the value of the issrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getIssrTtls() {
        return issrTtls;
    }

    /**
     * Sets the value of the issrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public void setIssrTtls(SettlementCategoryTotal2 value) {
        this.issrTtls = value;
    }

    /**
     * Gets the value of the othrTtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getOthrTtls() {
        return othrTtls;
    }

    /**
     * Sets the value of the othrTtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public void setOthrTtls(SettlementCategoryTotal2 value) {
        this.othrTtls = value;
    }

    /**
     * Gets the value of the ttlSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public SettlementCategoryTotal2 getTtlSttlmAmt() {
        return ttlSttlmAmt;
    }

    /**
     * Sets the value of the ttlSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementCategoryTotal2 }
     *     
     */
    public void setTtlSttlmAmt(SettlementCategoryTotal2 value) {
        this.ttlSttlmAmt = value;
    }

}
