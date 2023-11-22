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

package org.jpos.iso20022.tsin_009_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeParty1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeParty1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}PartyIdentification45"/>
 *         <element name="LglOrg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}LegalOrganisation1" minOccurs="0"/>
 *         <element name="TaxPty" type="{urn:iso:std:iso:20022:tech:xsd:tsin.009.001.01}TaxParty3" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeParty1", propOrder = {
    "ptyId",
    "lglOrg",
    "taxPty"
})
public class TradeParty1 {

    @XmlElement(name = "PtyId", required = true)
    protected PartyIdentification45 ptyId;
    @XmlElement(name = "LglOrg")
    protected LegalOrganisation1 lglOrg;
    @XmlElement(name = "TaxPty")
    protected List<TaxParty3> taxPty;

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification45 }
     *     
     */
    public PartyIdentification45 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification45 }
     *     
     */
    public void setPtyId(PartyIdentification45 value) {
        this.ptyId = value;
    }

    /**
     * Gets the value of the lglOrg property.
     * 
     * @return
     *     possible object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public LegalOrganisation1 getLglOrg() {
        return lglOrg;
    }

    /**
     * Sets the value of the lglOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalOrganisation1 }
     *     
     */
    public void setLglOrg(LegalOrganisation1 value) {
        this.lglOrg = value;
    }

    /**
     * Gets the value of the taxPty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxPty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxParty3 }
     * 
     * 
     * @return
     *     The value of the taxPty property.
     */
    public List<TaxParty3> getTaxPty() {
        if (taxPty == null) {
            taxPty = new ArrayList<>();
        }
        return this.taxPty;
    }

}
