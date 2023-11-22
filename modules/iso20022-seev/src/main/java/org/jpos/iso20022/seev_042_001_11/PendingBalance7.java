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

package org.jpos.iso20022.seev_042_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingBalance7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PendingBalance7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SignedQuantityFormat10"/>
 *         <element name="PdgTxs" type="{urn:iso:std:iso:20022:tech:xsd:seev.042.001.11}SettlementTypeAndIdentification25" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingBalance7", propOrder = {
    "bal",
    "pdgTxs"
})
public class PendingBalance7 {

    @XmlElement(name = "Bal", required = true)
    protected SignedQuantityFormat10 bal;
    @XmlElement(name = "PdgTxs")
    protected List<SettlementTypeAndIdentification25> pdgTxs;

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public SignedQuantityFormat10 getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignedQuantityFormat10 }
     *     
     */
    public void setBal(SignedQuantityFormat10 value) {
        this.bal = value;
    }

    /**
     * Gets the value of the pdgTxs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pdgTxs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPdgTxs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementTypeAndIdentification25 }
     * 
     * 
     * @return
     *     The value of the pdgTxs property.
     */
    public List<SettlementTypeAndIdentification25> getPdgTxs() {
        if (pdgTxs == null) {
            pdgTxs = new ArrayList<>();
        }
        return this.pdgTxs;
    }

}
