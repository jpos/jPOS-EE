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

package org.jpos.iso20022.reda_056_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties35 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties35">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StgSttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}SettlementParties32"/>
 *         <element name="LclMktId" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}GenericIdentification49" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="RegnDtls" type="{urn:iso:std:iso:20022:tech:xsd:reda.056.001.01}PartyIdentification99Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties35", propOrder = {
    "stgSttlmPties",
    "lclMktId",
    "regnDtls"
})
public class SettlementParties35 {

    @XmlElement(name = "StgSttlmPties", required = true)
    protected SettlementParties32 stgSttlmPties;
    @XmlElement(name = "LclMktId")
    protected List<GenericIdentification49> lclMktId;
    @XmlElement(name = "RegnDtls")
    protected PartyIdentification99Choice regnDtls;

    /**
     * Gets the value of the stgSttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties32 }
     *     
     */
    public SettlementParties32 getStgSttlmPties() {
        return stgSttlmPties;
    }

    /**
     * Sets the value of the stgSttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties32 }
     *     
     */
    public void setStgSttlmPties(SettlementParties32 value) {
        this.stgSttlmPties = value;
    }

    /**
     * Gets the value of the lclMktId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lclMktId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLclMktId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericIdentification49 }
     * 
     * 
     * @return
     *     The value of the lclMktId property.
     */
    public List<GenericIdentification49> getLclMktId() {
        if (lclMktId == null) {
            lclMktId = new ArrayList<>();
        }
        return this.lclMktId;
    }

    /**
     * Gets the value of the regnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification99Choice }
     *     
     */
    public PartyIdentification99Choice getRegnDtls() {
        return regnDtls;
    }

    /**
     * Sets the value of the regnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification99Choice }
     *     
     */
    public void setRegnDtls(PartyIdentification99Choice value) {
        this.regnDtls = value;
    }

}
