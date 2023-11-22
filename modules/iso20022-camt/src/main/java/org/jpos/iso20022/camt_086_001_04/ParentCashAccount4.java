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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParentCashAccount4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ParentCashAccount4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Lvl" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}AccountLevel1Code" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}CashAccount40"/>
 *         <element name="Svcr" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentCashAccount4", propOrder = {
    "lvl",
    "id",
    "svcr"
})
public class ParentCashAccount4 {

    @XmlElement(name = "Lvl")
    @XmlSchemaType(name = "string")
    protected AccountLevel1Code lvl;
    @XmlElement(name = "Id", required = true)
    protected CashAccount40 id;
    @XmlElement(name = "Svcr")
    protected BranchAndFinancialInstitutionIdentification6 svcr;

    /**
     * Gets the value of the lvl property.
     * 
     * @return
     *     possible object is
     *     {@link AccountLevel1Code }
     *     
     */
    public AccountLevel1Code getLvl() {
        return lvl;
    }

    /**
     * Sets the value of the lvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountLevel1Code }
     *     
     */
    public void setLvl(AccountLevel1Code value) {
        this.lvl = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public void setId(CashAccount40 value) {
        this.id = value;
    }

    /**
     * Gets the value of the svcr property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getSvcr() {
        return svcr;
    }

    /**
     * Sets the value of the svcr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setSvcr(BranchAndFinancialInstitutionIdentification6 value) {
        this.svcr = value;
    }

}
