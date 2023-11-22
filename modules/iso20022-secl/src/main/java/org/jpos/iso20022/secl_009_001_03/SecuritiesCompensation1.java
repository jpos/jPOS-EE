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

package org.jpos.iso20022.secl_009_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesCompensation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesCompensation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dpstry" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}PartyIdentification34Choice"/>
 *         <element name="SttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}AmountAndDirection20"/>
 *         <element name="Fees" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}AmountAndDirection20" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesCompensation1", propOrder = {
    "dpstry",
    "sttlmAmt",
    "fees"
})
public class SecuritiesCompensation1 {

    @XmlElement(name = "Dpstry", required = true)
    protected PartyIdentification34Choice dpstry;
    @XmlElement(name = "SttlmAmt", required = true)
    protected AmountAndDirection20 sttlmAmt;
    @XmlElement(name = "Fees")
    protected AmountAndDirection20 fees;

    /**
     * Gets the value of the dpstry property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public PartyIdentification34Choice getDpstry() {
        return dpstry;
    }

    /**
     * Sets the value of the dpstry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification34Choice }
     *     
     */
    public void setDpstry(PartyIdentification34Choice value) {
        this.dpstry = value;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setSttlmAmt(AmountAndDirection20 value) {
        this.sttlmAmt = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public AmountAndDirection20 getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection20 }
     *     
     */
    public void setFees(AmountAndDirection20 value) {
        this.fees = value;
    }

}
