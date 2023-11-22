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

package org.jpos.iso20022.colr_010_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementDetails206 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementDetails206">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}ISODateTime"/>
 *         <element name="SttlmPties" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}SettlementParties36Choice" minOccurs="0"/>
 *         <element name="CollOwnrsh" type="{urn:iso:std:iso:20022:tech:xsd:colr.010.001.05}CollateralOwnership4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails206", propOrder = {
    "tradDt",
    "sttlmPties",
    "collOwnrsh"
})
public class SettlementDetails206 {

    @XmlElement(name = "TradDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradDt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties36Choice sttlmPties;
    @XmlElement(name = "CollOwnrsh", required = true)
    protected CollateralOwnership4 collOwnrsh;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradDt(XMLGregorianCalendar value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties36Choice }
     *     
     */
    public SettlementParties36Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties36Choice }
     *     
     */
    public void setSttlmPties(SettlementParties36Choice value) {
        this.sttlmPties = value;
    }

    /**
     * Gets the value of the collOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralOwnership4 }
     *     
     */
    public CollateralOwnership4 getCollOwnrsh() {
        return collOwnrsh;
    }

    /**
     * Sets the value of the collOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralOwnership4 }
     *     
     */
    public void setCollOwnrsh(CollateralOwnership4 value) {
        this.collOwnrsh = value;
    }

}
