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

package org.jpos.iso20022.fxtr_037_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyIdentificationAndAccount119 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyIdentificationAndAccount119">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}PartyIdentification90" maxOccurs="unbounded"/>
 *         <element name="AcctId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}AccountIdentification30" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyIdentificationAndAccount119", propOrder = {
    "ptyId",
    "acctId"
})
public class PartyIdentificationAndAccount119 {

    @XmlElement(name = "PtyId", required = true)
    protected List<PartyIdentification90> ptyId;
    @XmlElement(name = "AcctId", required = true)
    protected List<AccountIdentification30> acctId;

    /**
     * Gets the value of the ptyId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ptyId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPtyId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyIdentification90 }
     * 
     * 
     * @return
     *     The value of the ptyId property.
     */
    public List<PartyIdentification90> getPtyId() {
        if (ptyId == null) {
            ptyId = new ArrayList<>();
        }
        return this.ptyId;
    }

    /**
     * Gets the value of the acctId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountIdentification30 }
     * 
     * 
     * @return
     *     The value of the acctId property.
     */
    public List<AccountIdentification30> getAcctId() {
        if (acctId == null) {
            acctId = new ArrayList<>();
        }
        return this.acctId;
    }

}
