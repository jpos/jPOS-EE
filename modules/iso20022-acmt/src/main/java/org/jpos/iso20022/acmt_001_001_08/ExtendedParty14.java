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

package org.jpos.iso20022.acmt_001_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedParty14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ExtendedParty14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XtndedPtyRole" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}Extended350Code"/>
 *         <element name="OthrPtyDtls" type="{urn:iso:std:iso:20022:tech:xsd:acmt.001.001.08}InvestmentAccountOwnershipInformation16"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedParty14", propOrder = {
    "xtndedPtyRole",
    "othrPtyDtls"
})
public class ExtendedParty14 {

    @XmlElement(name = "XtndedPtyRole", required = true)
    protected String xtndedPtyRole;
    @XmlElement(name = "OthrPtyDtls", required = true)
    protected InvestmentAccountOwnershipInformation16 othrPtyDtls;

    /**
     * Gets the value of the xtndedPtyRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedPtyRole() {
        return xtndedPtyRole;
    }

    /**
     * Sets the value of the xtndedPtyRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedPtyRole(String value) {
        this.xtndedPtyRole = value;
    }

    /**
     * Gets the value of the othrPtyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public InvestmentAccountOwnershipInformation16 getOthrPtyDtls() {
        return othrPtyDtls;
    }

    /**
     * Sets the value of the othrPtyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public void setOthrPtyDtls(InvestmentAccountOwnershipInformation16 value) {
        this.othrPtyDtls = value;
    }

}
