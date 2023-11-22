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

package org.jpos.iso20022.auth_101_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementFailsData4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementFailsData4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Ttl" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}SettlementTotalData1"/>
 *         <element name="FailrRsn" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}SettlementFailureReason3"/>
 *         <element name="ElgblForDrgtn" type="{urn:iso:std:iso:20022:tech:xsd:auth.101.001.01}SettlementFailsDerogation1"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsData4", propOrder = {
    "ttl",
    "failrRsn",
    "elgblForDrgtn"
})
public class SettlementFailsData4 {

    @XmlElement(name = "Ttl", required = true)
    protected SettlementTotalData1 ttl;
    @XmlElement(name = "FailrRsn", required = true)
    protected SettlementFailureReason3 failrRsn;
    @XmlElement(name = "ElgblForDrgtn", required = true)
    protected SettlementFailsDerogation1 elgblForDrgtn;

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public void setTtl(SettlementTotalData1 value) {
        this.ttl = value;
    }

    /**
     * Gets the value of the failrRsn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public SettlementFailureReason3 getFailrRsn() {
        return failrRsn;
    }

    /**
     * Sets the value of the failrRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailureReason3 }
     *     
     */
    public void setFailrRsn(SettlementFailureReason3 value) {
        this.failrRsn = value;
    }

    /**
     * Gets the value of the elgblForDrgtn property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFailsDerogation1 }
     *     
     */
    public SettlementFailsDerogation1 getElgblForDrgtn() {
        return elgblForDrgtn;
    }

    /**
     * Sets the value of the elgblForDrgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFailsDerogation1 }
     *     
     */
    public void setElgblForDrgtn(SettlementFailsDerogation1 value) {
        this.elgblForDrgtn = value;
    }

}
