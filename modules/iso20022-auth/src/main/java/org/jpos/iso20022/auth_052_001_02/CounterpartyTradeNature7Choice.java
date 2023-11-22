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

package org.jpos.iso20022.auth_052_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyTradeNature7Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyTradeNature7Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FinancialPartyClassification1"/>
 *         <element name="NFI" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}FinancialPartyClassification2" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyTradeNature7Choice", propOrder = {
    "fi",
    "nfi"
})
public class CounterpartyTradeNature7Choice {

    @XmlElement(name = "FI")
    protected FinancialPartyClassification1 fi;
    @XmlElement(name = "NFI")
    protected List<FinancialPartyClassification2> nfi;

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialPartyClassification1 }
     *     
     */
    public FinancialPartyClassification1 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialPartyClassification1 }
     *     
     */
    public void setFI(FinancialPartyClassification1 value) {
        this.fi = value;
    }

    /**
     * Gets the value of the nfi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the nfi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNFI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialPartyClassification2 }
     * 
     * 
     * @return
     *     The value of the nfi property.
     */
    public List<FinancialPartyClassification2> getNFI() {
        if (nfi == null) {
            nfi = new ArrayList<>();
        }
        return this.nfi;
    }

}
