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

package org.jpos.iso20022.semt_041_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialInstrumentAggregateBalance1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancialInstrumentAggregateBalance1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ItmDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}ISODate"/>
 *         <element name="Hldgs" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}FinancialInstrumentAggregateBalance1Choice"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Price6" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialInstrumentAggregateBalance1", propOrder = {
    "itmDt",
    "hldgs",
    "pric"
})
public class FinancialInstrumentAggregateBalance1 {

    @XmlElement(name = "ItmDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itmDt;
    @XmlElement(name = "Hldgs", required = true)
    protected FinancialInstrumentAggregateBalance1Choice hldgs;
    @XmlElement(name = "Pric")
    protected List<Price6> pric;

    /**
     * Gets the value of the itmDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItmDt() {
        return itmDt;
    }

    /**
     * Sets the value of the itmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItmDt(XMLGregorianCalendar value) {
        this.itmDt = value;
    }

    /**
     * Gets the value of the hldgs property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAggregateBalance1Choice }
     *     
     */
    public FinancialInstrumentAggregateBalance1Choice getHldgs() {
        return hldgs;
    }

    /**
     * Sets the value of the hldgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAggregateBalance1Choice }
     *     
     */
    public void setHldgs(FinancialInstrumentAggregateBalance1Choice value) {
        this.hldgs = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the pric property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPric().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Price6 }
     * 
     * 
     * @return
     *     The value of the pric property.
     */
    public List<Price6> getPric() {
        if (pric == null) {
            pric = new ArrayList<>();
        }
        return this.pric;
    }

}
