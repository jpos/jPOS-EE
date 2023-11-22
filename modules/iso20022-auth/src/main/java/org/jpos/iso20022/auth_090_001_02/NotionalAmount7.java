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

package org.jpos.iso20022.auth_090_001_02;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotionalAmount7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NotionalAmount7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Amt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd19DecimalAmount" minOccurs="0"/>
 *         <element name="AmtInFct" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyAnd19DecimalAmount" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="WghtdAvrgDlta" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}LongFraction19DecimalNumber" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotionalAmount7", propOrder = {
    "amt",
    "amtInFct",
    "wghtdAvrgDlta"
})
public class NotionalAmount7 {

    @XmlElement(name = "Amt")
    protected ActiveOrHistoricCurrencyAnd19DecimalAmount amt;
    @XmlElement(name = "AmtInFct")
    protected List<ActiveOrHistoricCurrencyAnd19DecimalAmount> amtInFct;
    @XmlElement(name = "WghtdAvrgDlta")
    protected BigDecimal wghtdAvrgDlta;

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd19DecimalAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     *     
     */
    public void setAmt(ActiveOrHistoricCurrencyAnd19DecimalAmount value) {
        this.amt = value;
    }

    /**
     * Gets the value of the amtInFct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the amtInFct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmtInFct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActiveOrHistoricCurrencyAnd19DecimalAmount }
     * 
     * 
     * @return
     *     The value of the amtInFct property.
     */
    public List<ActiveOrHistoricCurrencyAnd19DecimalAmount> getAmtInFct() {
        if (amtInFct == null) {
            amtInFct = new ArrayList<>();
        }
        return this.amtInFct;
    }

    /**
     * Gets the value of the wghtdAvrgDlta property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWghtdAvrgDlta() {
        return wghtdAvrgDlta;
    }

    /**
     * Sets the value of the wghtdAvrgDlta property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWghtdAvrgDlta(BigDecimal value) {
        this.wghtdAvrgDlta = value;
    }

}
