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

package org.jpos.iso20022.camt_016_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyQueryDefinition3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyQueryDefinition3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="QryTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.016.001.04}QueryType2Code" minOccurs="0"/>
 *         <element name="CcyCrit" type="{urn:iso:std:iso:20022:tech:xsd:camt.016.001.04}CurrencyCriteriaDefinition1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyQueryDefinition3", propOrder = {
    "qryTp",
    "ccyCrit"
})
public class CurrencyQueryDefinition3 {

    @XmlElement(name = "QryTp")
    @XmlSchemaType(name = "string")
    protected QueryType2Code qryTp;
    @XmlElement(name = "CcyCrit")
    protected CurrencyCriteriaDefinition1Choice ccyCrit;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link QueryType2Code }
     *     
     */
    public QueryType2Code getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryType2Code }
     *     
     */
    public void setQryTp(QueryType2Code value) {
        this.qryTp = value;
    }

    /**
     * Gets the value of the ccyCrit property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCriteriaDefinition1Choice }
     *     
     */
    public CurrencyCriteriaDefinition1Choice getCcyCrit() {
        return ccyCrit;
    }

    /**
     * Sets the value of the ccyCrit property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCriteriaDefinition1Choice }
     *     
     */
    public void setCcyCrit(CurrencyCriteriaDefinition1Choice value) {
        this.ccyCrit = value;
    }

}
