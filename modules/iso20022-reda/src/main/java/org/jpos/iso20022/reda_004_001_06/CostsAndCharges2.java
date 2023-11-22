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

package org.jpos.iso20022.reda_004_001_06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CostsAndCharges2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CostsAndCharges2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ExAnteRefDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}ISODate" minOccurs="0"/>
 *         <element name="IndvCostOrChrg" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}IndividualCostOrCharge2" maxOccurs="unbounded"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:reda.004.001.06}AdditionalInformation15" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CostsAndCharges2", propOrder = {
    "exAnteRefDt",
    "indvCostOrChrg",
    "addtlInf"
})
public class CostsAndCharges2 {

    @XmlElement(name = "ExAnteRefDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exAnteRefDt;
    @XmlElement(name = "IndvCostOrChrg", required = true)
    protected List<IndividualCostOrCharge2> indvCostOrChrg;
    @XmlElement(name = "AddtlInf")
    protected AdditionalInformation15 addtlInf;

    /**
     * Gets the value of the exAnteRefDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExAnteRefDt() {
        return exAnteRefDt;
    }

    /**
     * Sets the value of the exAnteRefDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExAnteRefDt(XMLGregorianCalendar value) {
        this.exAnteRefDt = value;
    }

    /**
     * Gets the value of the indvCostOrChrg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvCostOrChrg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvCostOrChrg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualCostOrCharge2 }
     * 
     * 
     * @return
     *     The value of the indvCostOrChrg property.
     */
    public List<IndividualCostOrCharge2> getIndvCostOrChrg() {
        if (indvCostOrChrg == null) {
            indvCostOrChrg = new ArrayList<>();
        }
        return this.indvCostOrChrg;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public AdditionalInformation15 getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation15 }
     *     
     */
    public void setAddtlInf(AdditionalInformation15 value) {
        this.addtlInf = value;
    }

}
