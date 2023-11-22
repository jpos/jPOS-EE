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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountAndParties1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountAndParties1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}CashAccount25"/>
 *         <element name="InvstgtdPties" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}InvestigatedParties1Choice"/>
 *         <element name="AuthrtyReqTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.001.001.01}AuthorityRequestType1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountAndParties1", propOrder = {
    "id",
    "invstgtdPties",
    "authrtyReqTp"
})
public class AccountAndParties1 {

    @XmlElement(name = "Id", required = true)
    protected CashAccount25 id;
    @XmlElement(name = "InvstgtdPties", required = true)
    protected InvestigatedParties1Choice invstgtdPties;
    @XmlElement(name = "AuthrtyReqTp", required = true)
    protected List<AuthorityRequestType1> authrtyReqTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount25 }
     *     
     */
    public CashAccount25 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount25 }
     *     
     */
    public void setId(CashAccount25 value) {
        this.id = value;
    }

    /**
     * Gets the value of the invstgtdPties property.
     * 
     * @return
     *     possible object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public InvestigatedParties1Choice getInvstgtdPties() {
        return invstgtdPties;
    }

    /**
     * Sets the value of the invstgtdPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestigatedParties1Choice }
     *     
     */
    public void setInvstgtdPties(InvestigatedParties1Choice value) {
        this.invstgtdPties = value;
    }

    /**
     * Gets the value of the authrtyReqTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the authrtyReqTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthrtyReqTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityRequestType1 }
     * 
     * 
     * @return
     *     The value of the authrtyReqTp property.
     */
    public List<AuthorityRequestType1> getAuthrtyReqTp() {
        if (authrtyReqTp == null) {
            authrtyReqTp = new ArrayList<>();
        }
        return this.authrtyReqTp;
    }

}
