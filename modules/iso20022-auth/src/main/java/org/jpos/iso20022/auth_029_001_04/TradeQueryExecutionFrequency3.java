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

package org.jpos.iso20022.auth_029_001_04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeQueryExecutionFrequency3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeQueryExecutionFrequency3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrqcyTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}Frequency14Code"/>
 *         <element name="DlvryDay" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}WeekDay3Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="DayOfMnth" type="{urn:iso:std:iso:20022:tech:xsd:auth.029.001.04}DayOfMonthNumber" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryExecutionFrequency3", propOrder = {
    "frqcyTp",
    "dlvryDay",
    "dayOfMnth"
})
public class TradeQueryExecutionFrequency3 {

    @XmlElement(name = "FrqcyTp", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency14Code frqcyTp;
    @XmlElement(name = "DlvryDay")
    @XmlSchemaType(name = "string")
    protected List<WeekDay3Code> dlvryDay;
    @XmlElement(name = "DayOfMnth")
    protected List<BigDecimal> dayOfMnth;

    /**
     * Gets the value of the frqcyTp property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency14Code }
     *     
     */
    public Frequency14Code getFrqcyTp() {
        return frqcyTp;
    }

    /**
     * Sets the value of the frqcyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency14Code }
     *     
     */
    public void setFrqcyTp(Frequency14Code value) {
        this.frqcyTp = value;
    }

    /**
     * Gets the value of the dlvryDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dlvryDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekDay3Code }
     * 
     * 
     * @return
     *     The value of the dlvryDay property.
     */
    public List<WeekDay3Code> getDlvryDay() {
        if (dlvryDay == null) {
            dlvryDay = new ArrayList<>();
        }
        return this.dlvryDay;
    }

    /**
     * Gets the value of the dayOfMnth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dayOfMnth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfMnth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     * @return
     *     The value of the dayOfMnth property.
     */
    public List<BigDecimal> getDayOfMnth() {
        if (dayOfMnth == null) {
            dayOfMnth = new ArrayList<>();
        }
        return this.dayOfMnth;
    }

}
