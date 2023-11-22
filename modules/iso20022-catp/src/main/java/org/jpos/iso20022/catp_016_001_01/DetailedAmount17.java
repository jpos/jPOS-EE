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

package org.jpos.iso20022.catp_016_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetailedAmount17 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DetailedAmount17">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AmtToTrf" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ImpliedCurrencyAndAmount"/>
 *         <element name="Ccy" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}ActiveCurrencyCode" minOccurs="0"/>
 *         <element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}DetailedAmount18" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Dontn" type="{urn:iso:std:iso:20022:tech:xsd:catp.016.001.01}DetailedAmount18" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetailedAmount17", propOrder = {
    "amtToTrf",
    "ccy",
    "fees",
    "dontn"
})
public class DetailedAmount17 {

    @XmlElement(name = "AmtToTrf", required = true)
    protected BigDecimal amtToTrf;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "Fees")
    protected List<DetailedAmount18> fees;
    @XmlElement(name = "Dontn")
    protected List<DetailedAmount18> dontn;

    /**
     * Gets the value of the amtToTrf property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmtToTrf() {
        return amtToTrf;
    }

    /**
     * Sets the value of the amtToTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmtToTrf(BigDecimal value) {
        this.amtToTrf = value;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcy(String value) {
        this.ccy = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fees property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFees().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     * @return
     *     The value of the fees property.
     */
    public List<DetailedAmount18> getFees() {
        if (fees == null) {
            fees = new ArrayList<>();
        }
        return this.fees;
    }

    /**
     * Gets the value of the dontn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dontn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetailedAmount18 }
     * 
     * 
     * @return
     *     The value of the dontn property.
     */
    public List<DetailedAmount18> getDontn() {
        if (dontn == null) {
            dontn = new ArrayList<>();
        }
        return this.dontn;
    }

}
