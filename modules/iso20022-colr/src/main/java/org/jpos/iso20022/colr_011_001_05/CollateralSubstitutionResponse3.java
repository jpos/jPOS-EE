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

package org.jpos.iso20022.colr_011_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralSubstitutionResponse3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralSubstitutionResponse3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollSbstitnReqId" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}Max35Text"/>
 *         <element name="RjctdAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}ActiveCurrencyAndAmount"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}RejectionReason68Code"/>
 *         <element name="RjctnRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.011.001.05}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralSubstitutionResponse3", propOrder = {
    "collSbstitnReqId",
    "rjctdAmt",
    "rjctnRsn",
    "rjctnRsnInf"
})
public class CollateralSubstitutionResponse3 {

    @XmlElement(name = "CollSbstitnReqId", required = true)
    protected String collSbstitnReqId;
    @XmlElement(name = "RjctdAmt", required = true)
    protected ActiveCurrencyAndAmount rjctdAmt;
    @XmlElement(name = "RjctnRsn", required = true)
    @XmlSchemaType(name = "string")
    protected RejectionReason68Code rjctnRsn;
    @XmlElement(name = "RjctnRsnInf")
    protected String rjctnRsnInf;

    /**
     * Gets the value of the collSbstitnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollSbstitnReqId() {
        return collSbstitnReqId;
    }

    /**
     * Sets the value of the collSbstitnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollSbstitnReqId(String value) {
        this.collSbstitnReqId = value;
    }

    /**
     * Gets the value of the rjctdAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getRjctdAmt() {
        return rjctdAmt;
    }

    /**
     * Sets the value of the rjctdAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setRjctdAmt(ActiveCurrencyAndAmount value) {
        this.rjctdAmt = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason68Code }
     *     
     */
    public RejectionReason68Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason68Code }
     *     
     */
    public void setRjctnRsn(RejectionReason68Code value) {
        this.rjctnRsn = value;
    }

    /**
     * Gets the value of the rjctnRsnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnRsnInf() {
        return rjctnRsnInf;
    }

    /**
     * Sets the value of the rjctnRsnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctnRsnInf(String value) {
        this.rjctnRsnInf = value;
    }

}
