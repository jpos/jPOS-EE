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

package org.jpos.iso20022.auth_052_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CounterpartyData89 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CounterpartyData89">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CounterpartyIdentification11"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}CounterpartyIdentification12"/>
 *         <element name="NttyRspnsblForRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="OthrPtyData" type="{urn:iso:std:iso:20022:tech:xsd:auth.052.001.02}TransactionCounterpartyData11" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartyData89", propOrder = {
    "rptgCtrPty",
    "othrCtrPty",
    "nttyRspnsblForRpt",
    "othrPtyData"
})
public class CounterpartyData89 {

    @XmlElement(name = "RptgCtrPty", required = true)
    protected CounterpartyIdentification11 rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected CounterpartyIdentification12 othrCtrPty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;
    @XmlElement(name = "OthrPtyData")
    protected TransactionCounterpartyData11 othrPtyData;

    /**
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification11 }
     *     
     */
    public CounterpartyIdentification11 getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification11 }
     *     
     */
    public void setRptgCtrPty(CounterpartyIdentification11 value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyIdentification12 }
     *     
     */
    public CounterpartyIdentification12 getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyIdentification12 }
     *     
     */
    public void setOthrCtrPty(CounterpartyIdentification12 value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
    }

    /**
     * Gets the value of the othrPtyData property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionCounterpartyData11 }
     *     
     */
    public TransactionCounterpartyData11 getOthrPtyData() {
        return othrPtyData;
    }

    /**
     * Sets the value of the othrPtyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionCounterpartyData11 }
     *     
     */
    public void setOthrPtyData(TransactionCounterpartyData11 value) {
        this.othrPtyData = value;
    }

}
