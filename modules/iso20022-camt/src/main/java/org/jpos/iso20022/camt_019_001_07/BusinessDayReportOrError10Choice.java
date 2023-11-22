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

package org.jpos.iso20022.camt_019_001_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessDayReportOrError10Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BusinessDayReportOrError10Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="BizDayInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}BusinessDay9"/>
 *         <element name="BizErr" type="{urn:iso:std:iso:20022:tech:xsd:camt.019.001.07}ErrorHandling5" maxOccurs="unbounded"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayReportOrError10Choice", propOrder = {
    "bizDayInf",
    "bizErr"
})
public class BusinessDayReportOrError10Choice {

    @XmlElement(name = "BizDayInf")
    protected BusinessDay9 bizDayInf;
    @XmlElement(name = "BizErr")
    protected List<ErrorHandling5> bizErr;

    /**
     * Gets the value of the bizDayInf property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDay9 }
     *     
     */
    public BusinessDay9 getBizDayInf() {
        return bizDayInf;
    }

    /**
     * Sets the value of the bizDayInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDay9 }
     *     
     */
    public void setBizDayInf(BusinessDay9 value) {
        this.bizDayInf = value;
    }

    /**
     * Gets the value of the bizErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the bizErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBizErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorHandling5 }
     * 
     * 
     * @return
     *     The value of the bizErr property.
     */
    public List<ErrorHandling5> getBizErr() {
        if (bizErr == null) {
            bizErr = new ArrayList<>();
        }
        return this.bizErr;
    }

}
