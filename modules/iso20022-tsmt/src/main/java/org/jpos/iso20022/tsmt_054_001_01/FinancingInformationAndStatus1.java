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

package org.jpos.iso20022.tsmt_054_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancingInformationAndStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="FinancingInformationAndStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FincgAllwdSummry" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}FinancingAllowedSummary1"/>
 *         <element name="InvcFincgDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.054.001.01}InvoiceFinancingDetails1" maxOccurs="unbounded"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancingInformationAndStatus1", propOrder = {
    "fincgAllwdSummry",
    "invcFincgDtls"
})
public class FinancingInformationAndStatus1 {

    @XmlElement(name = "FincgAllwdSummry", required = true)
    protected FinancingAllowedSummary1 fincgAllwdSummry;
    @XmlElement(name = "InvcFincgDtls", required = true)
    protected List<InvoiceFinancingDetails1> invcFincgDtls;

    /**
     * Gets the value of the fincgAllwdSummry property.
     * 
     * @return
     *     possible object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public FinancingAllowedSummary1 getFincgAllwdSummry() {
        return fincgAllwdSummry;
    }

    /**
     * Sets the value of the fincgAllwdSummry property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancingAllowedSummary1 }
     *     
     */
    public void setFincgAllwdSummry(FinancingAllowedSummary1 value) {
        this.fincgAllwdSummry = value;
    }

    /**
     * Gets the value of the invcFincgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the invcFincgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvcFincgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceFinancingDetails1 }
     * 
     * 
     * @return
     *     The value of the invcFincgDtls property.
     */
    public List<InvoiceFinancingDetails1> getInvcFincgDtls() {
        if (invcFincgDtls == null) {
            invcFincgDtls = new ArrayList<>();
        }
        return this.invcFincgDtls;
    }

}
