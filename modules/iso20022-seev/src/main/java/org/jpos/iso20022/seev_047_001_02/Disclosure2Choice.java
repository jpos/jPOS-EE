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

package org.jpos.iso20022.seev_047_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Disclosure2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Disclosure2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NoDsclsr" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}NoReasonCode"/>
 *         <element name="SfkpgAcctAndHldgs" type="{urn:iso:std:iso:20022:tech:xsd:seev.047.001.02}SafekeepingAccount11" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Disclosure2Choice", propOrder = {
    "noDsclsr",
    "sfkpgAcctAndHldgs"
})
public class Disclosure2Choice {

    @XmlElement(name = "NoDsclsr")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noDsclsr;
    @XmlElement(name = "SfkpgAcctAndHldgs")
    protected List<SafekeepingAccount11> sfkpgAcctAndHldgs;

    /**
     * Gets the value of the noDsclsr property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoDsclsr() {
        return noDsclsr;
    }

    /**
     * Sets the value of the noDsclsr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNoDsclsr(NoReasonCode value) {
        this.noDsclsr = value;
    }

    /**
     * Gets the value of the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sfkpgAcctAndHldgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSfkpgAcctAndHldgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SafekeepingAccount11 }
     * 
     * 
     * @return
     *     The value of the sfkpgAcctAndHldgs property.
     */
    public List<SafekeepingAccount11> getSfkpgAcctAndHldgs() {
        if (sfkpgAcctAndHldgs == null) {
            sfkpgAcctAndHldgs = new ArrayList<>();
        }
        return this.sfkpgAcctAndHldgs;
    }

}
