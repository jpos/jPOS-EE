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

package org.jpos.iso20022.colr_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecurityCharacteristics3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecurityCharacteristics3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SecurityIdentification19" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Pos" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}SecuritiesPosition1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ValtnPric" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}AmountPricePerFinancialInstrumentQuantity9"/>
 *         <element name="CollVal" type="{urn:iso:std:iso:20022:tech:xsd:colr.002.001.01}ActiveCurrencyAndAmount"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityCharacteristics3", propOrder = {
    "id",
    "pos",
    "valtnPric",
    "collVal"
})
public class SecurityCharacteristics3 {

    @XmlElement(name = "Id")
    protected List<SecurityIdentification19> id;
    @XmlElement(name = "Pos")
    protected List<SecuritiesPosition1> pos;
    @XmlElement(name = "ValtnPric", required = true)
    protected AmountPricePerFinancialInstrumentQuantity9 valtnPric;
    @XmlElement(name = "CollVal", required = true)
    protected ActiveCurrencyAndAmount collVal;

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification19 }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<SecurityIdentification19> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
    }

    /**
     * Gets the value of the pos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecuritiesPosition1 }
     * 
     * 
     * @return
     *     The value of the pos property.
     */
    public List<SecuritiesPosition1> getPos() {
        if (pos == null) {
            pos = new ArrayList<>();
        }
        return this.pos;
    }

    /**
     * Gets the value of the valtnPric property.
     * 
     * @return
     *     possible object is
     *     {@link AmountPricePerFinancialInstrumentQuantity9 }
     *     
     */
    public AmountPricePerFinancialInstrumentQuantity9 getValtnPric() {
        return valtnPric;
    }

    /**
     * Sets the value of the valtnPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountPricePerFinancialInstrumentQuantity9 }
     *     
     */
    public void setValtnPric(AmountPricePerFinancialInstrumentQuantity9 value) {
        this.valtnPric = value;
    }

    /**
     * Gets the value of the collVal property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCollVal() {
        return collVal;
    }

    /**
     * Sets the value of the collVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCollVal(ActiveCurrencyAndAmount value) {
        this.collVal = value;
    }

}
