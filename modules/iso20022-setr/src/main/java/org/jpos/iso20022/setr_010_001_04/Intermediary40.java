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

package org.jpos.iso20022.setr_010_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Intermediary40 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Intermediary40">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}PartyIdentification113"/>
 *         <element name="Acct" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}Account22" minOccurs="0"/>
 *         <element name="OrdrOrgtrElgblty" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}OrderOriginatorEligibility1Code" minOccurs="0"/>
 *         <element name="Role" type="{urn:iso:std:iso:20022:tech:xsd:setr.010.001.04}InvestmentFundRole2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Intermediary40", propOrder = {
    "id",
    "acct",
    "ordrOrgtrElgblty",
    "role"
})
public class Intermediary40 {

    @XmlElement(name = "Id", required = true)
    protected PartyIdentification113 id;
    @XmlElement(name = "Acct")
    protected Account22 acct;
    @XmlElement(name = "OrdrOrgtrElgblty")
    @XmlSchemaType(name = "string")
    protected OrderOriginatorEligibility1Code ordrOrgtrElgblty;
    @XmlElement(name = "Role")
    protected InvestmentFundRole2Choice role;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setId(PartyIdentification113 value) {
        this.id = value;
    }

    /**
     * Gets the value of the acct property.
     * 
     * @return
     *     possible object is
     *     {@link Account22 }
     *     
     */
    public Account22 getAcct() {
        return acct;
    }

    /**
     * Sets the value of the acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link Account22 }
     *     
     */
    public void setAcct(Account22 value) {
        this.acct = value;
    }

    /**
     * Gets the value of the ordrOrgtrElgblty property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public OrderOriginatorEligibility1Code getOrdrOrgtrElgblty() {
        return ordrOrgtrElgblty;
    }

    /**
     * Sets the value of the ordrOrgtrElgblty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOriginatorEligibility1Code }
     *     
     */
    public void setOrdrOrgtrElgblty(OrderOriginatorEligibility1Code value) {
        this.ordrOrgtrElgblty = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentFundRole2Choice }
     *     
     */
    public InvestmentFundRole2Choice getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentFundRole2Choice }
     *     
     */
    public void setRole(InvestmentFundRole2Choice value) {
        this.role = value;
    }

}
