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

package org.jpos.iso20022.sese_012_001_11;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreviousYear1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PreviousYear1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="AllPrvsYrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}PreviousAll"/>
 *         <element name="SpcfcPrvsYrs" type="{urn:iso:std:iso:20022:tech:xsd:sese.012.001.11}ISOYear" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousYear1Choice", propOrder = {
    "allPrvsYrs",
    "spcfcPrvsYrs"
})
public class PreviousYear1Choice {

    @XmlElement(name = "AllPrvsYrs")
    protected String allPrvsYrs;
    @XmlElement(name = "SpcfcPrvsYrs")
    @XmlSchemaType(name = "gYear")
    protected List<XMLGregorianCalendar> spcfcPrvsYrs;

    /**
     * Gets the value of the allPrvsYrs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllPrvsYrs() {
        return allPrvsYrs;
    }

    /**
     * Sets the value of the allPrvsYrs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllPrvsYrs(String value) {
        this.allPrvsYrs = value;
    }

    /**
     * Gets the value of the spcfcPrvsYrs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the spcfcPrvsYrs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpcfcPrvsYrs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLGregorianCalendar }
     * 
     * 
     * @return
     *     The value of the spcfcPrvsYrs property.
     */
    public List<XMLGregorianCalendar> getSpcfcPrvsYrs() {
        if (spcfcPrvsYrs == null) {
            spcfcPrvsYrs = new ArrayList<>();
        }
        return this.spcfcPrvsYrs;
    }

}
