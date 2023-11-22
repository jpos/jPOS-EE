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

package org.jpos.iso20022.acmt_003_001_08;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HighFrequencyTradingProfile1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="HighFrequencyTradingProfile1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ISODate" minOccurs="0"/>
 *         <element name="SttlmFrqcy" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}SettlementFrequency1Choice" minOccurs="0"/>
 *         <element name="CnsldtnTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}ConsolidationType1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighFrequencyTradingProfile1", propOrder = {
    "dt",
    "sttlmFrqcy",
    "cnsldtnTp"
})
public class HighFrequencyTradingProfile1 {

    @XmlElement(name = "Dt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "SttlmFrqcy")
    protected SettlementFrequency1Choice sttlmFrqcy;
    @XmlElement(name = "CnsldtnTp")
    protected ConsolidationType1Choice cnsldtnTp;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the sttlmFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public SettlementFrequency1Choice getSttlmFrqcy() {
        return sttlmFrqcy;
    }

    /**
     * Sets the value of the sttlmFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementFrequency1Choice }
     *     
     */
    public void setSttlmFrqcy(SettlementFrequency1Choice value) {
        this.sttlmFrqcy = value;
    }

    /**
     * Gets the value of the cnsldtnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public ConsolidationType1Choice getCnsldtnTp() {
        return cnsldtnTp;
    }

    /**
     * Sets the value of the cnsldtnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidationType1Choice }
     *     
     */
    public void setCnsldtnTp(ConsolidationType1Choice value) {
        this.cnsldtnTp = value;
    }

}
