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

package org.jpos.iso20022.fxtr_015_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FundIdentification5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FundIdentification5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FndId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification60"/>
 *         <element name="AcctIdWthCtdn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="CtdnId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundIdentification5", propOrder = {
    "fndId",
    "acctIdWthCtdn",
    "ctdnId"
})
public class FundIdentification5 {

    @XmlElement(name = "FndId", required = true)
    protected PartyIdentification60 fndId;
    @XmlElement(name = "AcctIdWthCtdn")
    protected String acctIdWthCtdn;
    @XmlElement(name = "CtdnId")
    protected PartyIdentification242Choice ctdnId;

    /**
     * Gets the value of the fndId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification60 }
     *     
     */
    public PartyIdentification60 getFndId() {
        return fndId;
    }

    /**
     * Sets the value of the fndId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification60 }
     *     
     */
    public void setFndId(PartyIdentification60 value) {
        this.fndId = value;
    }

    /**
     * Gets the value of the acctIdWthCtdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctIdWthCtdn() {
        return acctIdWthCtdn;
    }

    /**
     * Sets the value of the acctIdWthCtdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctIdWthCtdn(String value) {
        this.acctIdWthCtdn = value;
    }

    /**
     * Gets the value of the ctdnId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getCtdnId() {
        return ctdnId;
    }

    /**
     * Sets the value of the ctdnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setCtdnId(PartyIdentification242Choice value) {
        this.ctdnId = value;
    }

}
