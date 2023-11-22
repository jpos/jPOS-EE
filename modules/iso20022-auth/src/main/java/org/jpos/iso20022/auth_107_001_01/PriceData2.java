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

package org.jpos.iso20022.auth_107_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceData2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceData2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}SecuritiesTransactionPrice17Choice" minOccurs="0"/>
 *         <element name="SchdlPrd" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}Schedule1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}UnitOfMeasure8Choice" minOccurs="0"/>
 *         <element name="PricMltplr" type="{urn:iso:std:iso:20022:tech:xsd:auth.107.001.01}LongFraction19DecimalNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceData2", propOrder = {
    "pric",
    "schdlPrd",
    "unitOfMeasr",
    "pricMltplr"
})
public class PriceData2 {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice17Choice pric;
    @XmlElement(name = "SchdlPrd")
    protected List<Schedule1> schdlPrd;
    @XmlElement(name = "UnitOfMeasr")
    protected UnitOfMeasure8Choice unitOfMeasr;
    @XmlElement(name = "PricMltplr")
    protected BigDecimal pricMltplr;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public SecuritiesTransactionPrice17Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice17Choice }
     *     
     */
    public void setPric(SecuritiesTransactionPrice17Choice value) {
        this.pric = value;
    }

    /**
     * Gets the value of the schdlPrd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the schdlPrd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchdlPrd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Schedule1 }
     * 
     * 
     * @return
     *     The value of the schdlPrd property.
     */
    public List<Schedule1> getSchdlPrd() {
        if (schdlPrd == null) {
            schdlPrd = new ArrayList<>();
        }
        return this.schdlPrd;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public UnitOfMeasure8Choice getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure8Choice }
     *     
     */
    public void setUnitOfMeasr(UnitOfMeasure8Choice value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the pricMltplr property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricMltplr() {
        return pricMltplr;
    }

    /**
     * Sets the value of the pricMltplr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricMltplr(BigDecimal value) {
        this.pricMltplr = value;
    }

}
