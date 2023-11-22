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

package org.jpos.iso20022.camt_005_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstructionStatusSearch5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InstructionStatusSearch5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtInstrSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PaymentStatusCodeSearch2Choice" minOccurs="0"/>
 *         <element name="PmtInstrStsDtTm" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}DateTimePeriod1Choice" minOccurs="0"/>
 *         <element name="PrtryStsRsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}Max4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstructionStatusSearch5", propOrder = {
    "pmtInstrSts",
    "pmtInstrStsDtTm",
    "prtryStsRsn"
})
public class InstructionStatusSearch5 {

    @XmlElement(name = "PmtInstrSts")
    protected PaymentStatusCodeSearch2Choice pmtInstrSts;
    @XmlElement(name = "PmtInstrStsDtTm")
    protected DateTimePeriod1Choice pmtInstrStsDtTm;
    @XmlElement(name = "PrtryStsRsn")
    protected String prtryStsRsn;

    /**
     * Gets the value of the pmtInstrSts property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public PaymentStatusCodeSearch2Choice getPmtInstrSts() {
        return pmtInstrSts;
    }

    /**
     * Sets the value of the pmtInstrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusCodeSearch2Choice }
     *     
     */
    public void setPmtInstrSts(PaymentStatusCodeSearch2Choice value) {
        this.pmtInstrSts = value;
    }

    /**
     * Gets the value of the pmtInstrStsDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public DateTimePeriod1Choice getPmtInstrStsDtTm() {
        return pmtInstrStsDtTm;
    }

    /**
     * Sets the value of the pmtInstrStsDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1Choice }
     *     
     */
    public void setPmtInstrStsDtTm(DateTimePeriod1Choice value) {
        this.pmtInstrStsDtTm = value;
    }

    /**
     * Gets the value of the prtryStsRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtryStsRsn() {
        return prtryStsRsn;
    }

    /**
     * Sets the value of the prtryStsRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtryStsRsn(String value) {
        this.prtryStsRsn = value;
    }

}
