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

package org.jpos.iso20022.camt_079_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraBalanceStatusAndReason2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraBalanceStatusAndReason2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}ProcessingStatus67Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}SettlementStatus16Choice" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Sttld" type="{urn:iso:std:iso:20022:tech:xsd:camt.079.001.01}ProprietaryReason4" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraBalanceStatusAndReason2", propOrder = {
    "prcgSts",
    "sttlmSts",
    "sttld"
})
public class IntraBalanceStatusAndReason2 {

    @XmlElement(name = "PrcgSts")
    protected List<ProcessingStatus67Choice> prcgSts;
    @XmlElement(name = "SttlmSts")
    protected List<SettlementStatus16Choice> sttlmSts;
    @XmlElement(name = "Sttld")
    protected ProprietaryReason4 sttld;

    /**
     * Gets the value of the prcgSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prcgSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrcgSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingStatus67Choice }
     * 
     * 
     * @return
     *     The value of the prcgSts property.
     */
    public List<ProcessingStatus67Choice> getPrcgSts() {
        if (prcgSts == null) {
            prcgSts = new ArrayList<>();
        }
        return this.prcgSts;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementStatus16Choice }
     * 
     * 
     * @return
     *     The value of the sttlmSts property.
     */
    public List<SettlementStatus16Choice> getSttlmSts() {
        if (sttlmSts == null) {
            sttlmSts = new ArrayList<>();
        }
        return this.sttlmSts;
    }

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public ProprietaryReason4 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryReason4 }
     *     
     */
    public void setSttld(ProprietaryReason4 value) {
        this.sttld = value;
    }

}
