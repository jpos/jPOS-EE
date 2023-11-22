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

package org.jpos.iso20022.seev_031_002_13;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountIdentification57Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountIdentification57Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="ForAllAccts" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}AccountIdentification10"/>
 *         <element name="AcctsListAndBalDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.002.13}AccountAndBalance56" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountIdentification57Choice", propOrder = {
    "forAllAccts",
    "acctsListAndBalDtls"
})
public class AccountIdentification57Choice {

    @XmlElement(name = "ForAllAccts")
    protected AccountIdentification10 forAllAccts;
    @XmlElement(name = "AcctsListAndBalDtls")
    protected List<AccountAndBalance56> acctsListAndBalDtls;

    /**
     * Gets the value of the forAllAccts property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification10 }
     *     
     */
    public AccountIdentification10 getForAllAccts() {
        return forAllAccts;
    }

    /**
     * Sets the value of the forAllAccts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification10 }
     *     
     */
    public void setForAllAccts(AccountIdentification10 value) {
        this.forAllAccts = value;
    }

    /**
     * Gets the value of the acctsListAndBalDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctsListAndBalDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctsListAndBalDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountAndBalance56 }
     * 
     * 
     * @return
     *     The value of the acctsListAndBalDtls property.
     */
    public List<AccountAndBalance56> getAcctsListAndBalDtls() {
        if (acctsListAndBalDtls == null) {
            acctsListAndBalDtls = new ArrayList<>();
        }
        return this.acctsListAndBalDtls;
    }

}
