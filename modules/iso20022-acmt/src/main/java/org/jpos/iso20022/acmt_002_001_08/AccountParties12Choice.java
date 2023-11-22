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

package org.jpos.iso20022.acmt_002_001_08;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountParties12Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountParties12Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PmryOwnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16"/>
 *         <element name="Trstee" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="5"/>
 *         <element name="Nmnee" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16"/>
 *         <element name="JntOwnr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.002.001.08}InvestmentAccountOwnershipInformation16" maxOccurs="5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountParties12Choice", propOrder = {
    "pmryOwnr",
    "trstee",
    "nmnee",
    "jntOwnr"
})
public class AccountParties12Choice {

    @XmlElement(name = "PmryOwnr")
    protected InvestmentAccountOwnershipInformation16 pmryOwnr;
    @XmlElement(name = "Trstee")
    protected List<InvestmentAccountOwnershipInformation16> trstee;
    @XmlElement(name = "Nmnee")
    protected InvestmentAccountOwnershipInformation16 nmnee;
    @XmlElement(name = "JntOwnr")
    protected List<InvestmentAccountOwnershipInformation16> jntOwnr;

    /**
     * Gets the value of the pmryOwnr property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public InvestmentAccountOwnershipInformation16 getPmryOwnr() {
        return pmryOwnr;
    }

    /**
     * Sets the value of the pmryOwnr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public void setPmryOwnr(InvestmentAccountOwnershipInformation16 value) {
        this.pmryOwnr = value;
    }

    /**
     * Gets the value of the trstee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trstee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrstee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the trstee property.
     */
    public List<InvestmentAccountOwnershipInformation16> getTrstee() {
        if (trstee == null) {
            trstee = new ArrayList<>();
        }
        return this.trstee;
    }

    /**
     * Gets the value of the nmnee property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public InvestmentAccountOwnershipInformation16 getNmnee() {
        return nmnee;
    }

    /**
     * Sets the value of the nmnee property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccountOwnershipInformation16 }
     *     
     */
    public void setNmnee(InvestmentAccountOwnershipInformation16 value) {
        this.nmnee = value;
    }

    /**
     * Gets the value of the jntOwnr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the jntOwnr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJntOwnr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentAccountOwnershipInformation16 }
     * 
     * 
     * @return
     *     The value of the jntOwnr property.
     */
    public List<InvestmentAccountOwnershipInformation16> getJntOwnr() {
        if (jntOwnr == null) {
            jntOwnr = new ArrayList<>();
        }
        return this.jntOwnr;
    }

}
