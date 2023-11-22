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

package org.jpos.iso20022.fxtr_014_001_05;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpeningConditions1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OpeningConditions1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmCcy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05}ActiveCurrencyCode"/>
 *         <element name="ValtnDt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05}ISODate"/>
 *         <element name="SttlmRateSrc" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.014.001.05}SettlementRateSource1" maxOccurs="2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpeningConditions1", propOrder = {
    "sttlmCcy",
    "valtnDt",
    "sttlmRateSrc"
})
public class OpeningConditions1 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "ValtnDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valtnDt;
    @XmlElement(name = "SttlmRateSrc", required = true)
    protected List<SettlementRateSource1> sttlmRateSrc;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlmCcy(String value) {
        this.sttlmCcy = value;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValtnDt(XMLGregorianCalendar value) {
        this.valtnDt = value;
    }

    /**
     * Gets the value of the sttlmRateSrc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sttlmRateSrc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSttlmRateSrc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SettlementRateSource1 }
     * 
     * 
     * @return
     *     The value of the sttlmRateSrc property.
     */
    public List<SettlementRateSource1> getSttlmRateSrc() {
        if (sttlmRateSrc == null) {
            sttlmRateSrc = new ArrayList<>();
        }
        return this.sttlmRateSrc;
    }

}
