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

package org.jpos.iso20022.semt_005_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intermediary11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Intermediary11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:swift:xsd:semt.005.001.02}PartyIdentification2Choice"/>
 *         <element name="Acct" type="{urn:swift:xsd:semt.005.001.02}Account7" minOccurs="0"/>
 *         <choice>
 *           <element name="Role" type="{urn:swift:xsd:semt.005.001.02}InvestmentFundRole2Code" minOccurs="0"/>
 *           <element name="XtndedRole" type="{urn:swift:xsd:semt.005.001.02}Extended350Code" minOccurs="0"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary11", propOrder = {
    "id",
    "acct",
    "role",
    "xtndedRole"
})
public class Intermediary11 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification2Choice id;
    @XmlElement(name = "Acct")
    protected Account7 acct;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected InvestmentFundRole2Code role;
    @XmlElement(name = "XtndedRole")
    protected String xtndedRole;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public void setId(PartyIdentification2Choice value) {
        this.id = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account7 }
     *     
     */
    public Account7 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account7 }
     *     
     */
    public void setAcct(Account7 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundRole2Code }
     *     
     */
    public InvestmentFundRole2Code getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundRole2Code }
     *     
     */
    public void setRole(InvestmentFundRole2Code value) {
        this.role = value;
    }

    /**
     * Gets the value of the xtndedRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedRole() {
        return xtndedRole;
    }

    /**
     * Sets the value of the xtndedRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtndedRole(String value) {
        this.xtndedRole = value;
    }

}
