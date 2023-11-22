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

package org.jpos.iso20022.fxtr_016_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementParties120 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementParties120">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvryAgt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="Intrmy" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *         <element name="RcvgAgt" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice"/>
 *         <element name="BnfcryInstn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.016.001.05}PartyIdentification242Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementParties120", propOrder = {
    "dlvryAgt",
    "intrmy",
    "rcvgAgt",
    "bnfcryInstn"
})
public class SettlementParties120 {

    @XmlElement(name = "DlvryAgt")
    protected PartyIdentification242Choice dlvryAgt;
    @XmlElement(name = "Intrmy")
    protected PartyIdentification242Choice intrmy;
    @XmlElement(name = "RcvgAgt", required = true)
    protected PartyIdentification242Choice rcvgAgt;
    @XmlElement(name = "BnfcryInstn")
    protected PartyIdentification242Choice bnfcryInstn;

    /**
     * Gets the value of the dlvryAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getDlvryAgt() {
        return dlvryAgt;
    }

    /**
     * Sets the value of the dlvryAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setDlvryAgt(PartyIdentification242Choice value) {
        this.dlvryAgt = value;
    }

    /**
     * Gets the value of the intrmy property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getIntrmy() {
        return intrmy;
    }

    /**
     * Sets the value of the intrmy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setIntrmy(PartyIdentification242Choice value) {
        this.intrmy = value;
    }

    /**
     * Gets the value of the rcvgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getRcvgAgt() {
        return rcvgAgt;
    }

    /**
     * Sets the value of the rcvgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setRcvgAgt(PartyIdentification242Choice value) {
        this.rcvgAgt = value;
    }

    /**
     * Gets the value of the bnfcryInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public PartyIdentification242Choice getBnfcryInstn() {
        return bnfcryInstn;
    }

    /**
     * Sets the value of the bnfcryInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification242Choice }
     *     
     */
    public void setBnfcryInstn(PartyIdentification242Choice value) {
        this.bnfcryInstn = value;
    }

}
