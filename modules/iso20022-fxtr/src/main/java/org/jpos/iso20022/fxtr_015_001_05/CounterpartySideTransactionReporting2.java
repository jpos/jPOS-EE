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

package org.jpos.iso20022.fxtr_015_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartySideTransactionReporting2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartySideTransactionReporting2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgJursdctn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}Max35Text" minOccurs="0"/>
 *         <element name="RptgPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="CtrPtySdUnqTxIdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.015.001.05}UniqueTransactionIdentifier2" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartySideTransactionReporting2", propOrder = {
    "rptgJursdctn",
    "rptgPty",
    "ctrPtySdUnqTxIdr"
})
public class CounterpartySideTransactionReporting2 {

    @XmlElement(name = "RptgJursdctn")
    protected String rptgJursdctn;
    @XmlElement(name = "RptgPty")
    protected PartyIdentification242Choice rptgPty;
    @XmlElement(name = "CtrPtySdUnqTxIdr")
    protected List<UniqueTransactionIdentifier2> ctrPtySdUnqTxIdr;

    /**
     * Gets the value of the rptgJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgJursdctn() {
        return rptgJursdctn;
    }

    /**
     * Sets the value of the rptgJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptgJursdctn(String value) {
        this.rptgJursdctn = value;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setRptgPty(PartyIdentification242Choice value) {
        this.rptgPty = value;
    }

    /**
     * Gets the value of the ctrPtySdUnqTxIdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ctrPtySdUnqTxIdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCtrPtySdUnqTxIdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniqueTransactionIdentifier2 }
     * 
     * 
     * @return
     *     The value of the ctrPtySdUnqTxIdr property.
     */
    public List<UniqueTransactionIdentifier2> getCtrPtySdUnqTxIdr() {
        if (ctrPtySdUnqTxIdr == null) {
            ctrPtySdUnqTxIdr = new ArrayList<>();
        }
        return this.ctrPtySdUnqTxIdr;
    }

}
