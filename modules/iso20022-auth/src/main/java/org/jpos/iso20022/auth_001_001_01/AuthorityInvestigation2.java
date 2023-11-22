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

package org.jpos.iso20022.auth_001_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityInvestigation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AuthorityInvestigation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AuthorityRequestType1"/>
 *         <element name="InvstgtdRoles" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice"/>
 *         <element name="AddtlInvstgtdPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}Max500Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityInvestigation2", propOrder = {
    "tp",
    "invstgtdRoles",
    "addtlInvstgtdPties",
    "addtlInf"
})
public class AuthorityInvestigation2 {

    @XmlElement(name = "Tp", required = true)
    protected AuthorityRequestType1 tp;
    @XmlElement(name = "InvstgtdRoles", required = true)
    protected InvestigatedParties1Choice invstgtdRoles;
    @XmlElement(name = "AddtlInvstgtdPties")
    protected InvestigatedParties1Choice addtlInvstgtdPties;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public AuthorityRequestType1 getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequestType1 }
     *     
     */
    public void setTp(AuthorityRequestType1 value) {
        this.tp = value;
    }

    /**
     * Gets the value of the invstgtdRoles property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdRoles() {
        return invstgtdRoles;
    }

    /**
     * Sets the value of the invstgtdRoles property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setInvstgtdRoles(InvestigatedParties1Choice value) {
        this.invstgtdRoles = value;
    }

    /**
     * Gets the value of the addtlInvstgtdPties property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getAddtlInvstgtdPties() {
        return addtlInvstgtdPties;
    }

    /**
     * Sets the value of the addtlInvstgtdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setAddtlInvstgtdPties(InvestigatedParties1Choice value) {
        this.addtlInvstgtdPties = value;
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
