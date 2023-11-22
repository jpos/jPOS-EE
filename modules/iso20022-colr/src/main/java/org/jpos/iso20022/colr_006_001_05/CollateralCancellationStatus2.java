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

package org.jpos.iso20022.colr_006_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollateralCancellationStatus2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CollateralCancellationStatus2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CollStsCd" type="{urn:iso:std:iso:20022:tech:xsd:colr.006.001.05}Status4Code"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.006.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RjctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:colr.006.001.05}RejectionStatus3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralCancellationStatus2", propOrder = {
    "collStsCd",
    "addtlInf",
    "rjctnDtls"
})
public class CollateralCancellationStatus2 {

    @XmlElement(name = "CollStsCd", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code collStsCd;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;
    @XmlElement(name = "RjctnDtls")
    protected RejectionStatus3 rjctnDtls;

    /**
     * Gets the value of the collStsCd property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getCollStsCd() {
        return collStsCd;
    }

    /**
     * Sets the value of the collStsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public void setCollStsCd(Status4Code value) {
        this.collStsCd = value;
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

    /**
     * Gets the value of the rjctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionStatus3 }
     *     
     */
    public RejectionStatus3 getRjctnDtls() {
        return rjctnDtls;
    }

    /**
     * Sets the value of the rjctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionStatus3 }
     *     
     */
    public void setRjctnDtls(RejectionStatus3 value) {
        this.rjctnDtls = value;
    }

}
