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

package org.jpos.iso20022.auth_054_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingAccount1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingAccount1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AcctTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}ClearingAccountType3Code"/>
 *         <element name="CollAcctOwnr" type="{urn:iso:std:iso:20022:tech:xsd:auth.054.001.01}CollateralAccount5" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingAccount1", propOrder = {
    "acctTp",
    "collAcctOwnr"
})
public class ClearingAccount1 {

    @XmlElement(name = "AcctTp", required = true)
    @XmlSchemaType(name = "string")
    protected ClearingAccountType3Code acctTp;
    @XmlElement(name = "CollAcctOwnr", required = true)
    protected List<CollateralAccount5> collAcctOwnr;

    /**
     * Gets the value of the acctTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingAccountType3Code }
     *     
     */
    public ClearingAccountType3Code getAcctTp() {
        return acctTp;
    }

    /**
     * Sets the value of the acctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingAccountType3Code }
     *     
     */
    public void setAcctTp(ClearingAccountType3Code value) {
        this.acctTp = value;
    }

    /**
     * Gets the value of the collAcctOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the collAcctOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollAcctOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollateralAccount5 }
     * 
     * 
     * @return
     *     The value of the collAcctOwnr property.
     */
    public List<CollateralAccount5> getCollAcctOwnr() {
        if (collAcctOwnr == null) {
            collAcctOwnr = new ArrayList<>();
        }
        return this.collAcctOwnr;
    }

}
