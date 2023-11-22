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

package org.jpos.iso20022.reda_057_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarketIdentificationOrCashPurpose1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MarketIdentificationOrCashPurpose1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="SttlmInstrMktId" type="{urn:iso:std:iso:20022:tech:xsd:reda.057.001.01}MarketIdentification87"/>
 *         <element name="CshSSIPurp" type="{urn:iso:std:iso:20022:tech:xsd:reda.057.001.01}ExternalMarketArea1Code" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketIdentificationOrCashPurpose1Choice", propOrder = {
    "sttlmInstrMktId",
    "cshSSIPurp"
})
public class MarketIdentificationOrCashPurpose1Choice {

    @XmlElement(name = "SttlmInstrMktId")
    protected MarketIdentification87 sttlmInstrMktId;
    @XmlElement(name = "CshSSIPurp")
    protected List<String> cshSSIPurp;

    /**
     * Gets the value of the sttlmInstrMktId property.
     * 
     * @return
     *     possible object is
     *     {@link MarketIdentification87 }
     *     
     */
    public MarketIdentification87 getSttlmInstrMktId() {
        return sttlmInstrMktId;
    }

    /**
     * Sets the value of the sttlmInstrMktId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketIdentification87 }
     *     
     */
    public void setSttlmInstrMktId(MarketIdentification87 value) {
        this.sttlmInstrMktId = value;
    }

    /**
     * Gets the value of the cshSSIPurp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cshSSIPurp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshSSIPurp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the cshSSIPurp property.
     */
    public List<String> getCshSSIPurp() {
        if (cshSSIPurp == null) {
            cshSSIPurp = new ArrayList<>();
        }
        return this.cshSSIPurp;
    }

}
