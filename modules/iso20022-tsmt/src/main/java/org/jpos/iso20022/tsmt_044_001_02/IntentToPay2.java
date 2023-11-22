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

package org.jpos.iso20022.tsmt_044_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntentToPay2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntentToPay2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Brkdwn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.02}BreakDown1Choice"/>
 *         <element name="XpctdPmtDt" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.02}ISODate"/>
 *         <element name="SttlmTerms" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.044.001.02}SettlementTerms3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntentToPay2", propOrder = {
    "brkdwn",
    "xpctdPmtDt",
    "sttlmTerms"
})
public class IntentToPay2 {

    @XmlElement(name = "Brkdwn", required = true)
    protected BreakDown1Choice brkdwn;
    @XmlElement(name = "XpctdPmtDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdPmtDt;
    @XmlElement(name = "SttlmTerms")
    protected SettlementTerms3 sttlmTerms;

    /**
     * Gets the value of the brkdwn property.
     * 
     * @return
     *     possible object is
     *     {@link BreakDown1Choice }
     *     
     */
    public BreakDown1Choice getBrkdwn() {
        return brkdwn;
    }

    /**
     * Sets the value of the brkdwn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BreakDown1Choice }
     *     
     */
    public void setBrkdwn(BreakDown1Choice value) {
        this.brkdwn = value;
    }

    /**
     * Gets the value of the xpctdPmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdPmtDt() {
        return xpctdPmtDt;
    }

    /**
     * Sets the value of the xpctdPmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdPmtDt(XMLGregorianCalendar value) {
        this.xpctdPmtDt = value;
    }

    /**
     * Gets the value of the sttlmTerms property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTerms3 }
     *     
     */
    public SettlementTerms3 getSttlmTerms() {
        return sttlmTerms;
    }

    /**
     * Sets the value of the sttlmTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTerms3 }
     *     
     */
    public void setSttlmTerms(SettlementTerms3 value) {
        this.sttlmTerms = value;
    }

}
