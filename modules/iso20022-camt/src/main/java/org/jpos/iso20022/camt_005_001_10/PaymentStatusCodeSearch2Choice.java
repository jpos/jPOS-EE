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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCodeSearch2Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentStatusCodeSearch2Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="PdgSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}PendingStatus4Code"/>
 *         <element name="FnlSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}FinalStatusCode"/>
 *         <element name="PdgAndFnlSts" type="{urn:iso:std:iso:20022:tech:xsd:camt.005.001.10}CashPaymentStatus2Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCodeSearch2Choice", propOrder = {
    "pdgSts",
    "fnlSts",
    "pdgAndFnlSts"
})
public class PaymentStatusCodeSearch2Choice {

    @XmlElement(name = "PdgSts")
    @XmlSchemaType(name = "string")
    protected PendingStatus4Code pdgSts;
    @XmlElement(name = "FnlSts")
    @XmlSchemaType(name = "string")
    protected FinalStatusCode fnlSts;
    @XmlElement(name = "PdgAndFnlSts")
    @XmlSchemaType(name = "string")
    protected CashPaymentStatus2Code pdgAndFnlSts;

    /**
     * Gets the value of the pdgSts property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PendingStatus4Code getPdgSts() {
        return pdgSts;
    }

    /**
     * Sets the value of the pdgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus4Code }
     *     
     */
    public void setPdgSts(PendingStatus4Code value) {
        this.pdgSts = value;
    }

    /**
     * Gets the value of the fnlSts property.
     * 
     * @return
     *     possible object is
     *     {@link FinalStatusCode }
     *     
     */
    public FinalStatusCode getFnlSts() {
        return fnlSts;
    }

    /**
     * Sets the value of the fnlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalStatusCode }
     *     
     */
    public void setFnlSts(FinalStatusCode value) {
        this.fnlSts = value;
    }

    /**
     * Gets the value of the pdgAndFnlSts property.
     * 
     * @return
     *     possible object is
     *     {@link CashPaymentStatus2Code }
     *     
     */
    public CashPaymentStatus2Code getPdgAndFnlSts() {
        return pdgAndFnlSts;
    }

    /**
     * Sets the value of the pdgAndFnlSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashPaymentStatus2Code }
     *     
     */
    public void setPdgAndFnlSts(CashPaymentStatus2Code value) {
        this.pdgAndFnlSts = value;
    }

}
