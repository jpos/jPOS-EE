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

package org.jpos.iso20022.camt_006_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatusCode6Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentStatusCode6Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Pdg" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}PendingStatus4Code"/>
 *         <element name="Fnl" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}FinalStatus1Code"/>
 *         <element name="RTGS" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max4AlphaNumericText"/>
 *         <element name="Sttlm" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max4AlphaNumericText"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.006.001.10}Max35Text"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusCode6Choice", propOrder = {
    "pdg",
    "fnl",
    "rtgs",
    "sttlm",
    "prtry"
})
public class PaymentStatusCode6Choice {

    @XmlElement(name = "Pdg")
    @XmlSchemaType(name = "string")
    protected PendingStatus4Code pdg;
    @XmlElement(name = "Fnl")
    @XmlSchemaType(name = "string")
    protected FinalStatus1Code fnl;
    @XmlElement(name = "RTGS")
    protected String rtgs;
    @XmlElement(name = "Sttlm")
    protected String sttlm;
    @XmlElement(name = "Prtry")
    protected String prtry;

    /**
     * Gets the value of the pdg property.
     * 
     * @return
     *     possible object is
     *     {@link PendingStatus4Code }
     *     
     */
    public PendingStatus4Code getPdg() {
        return pdg;
    }

    /**
     * Sets the value of the pdg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingStatus4Code }
     *     
     */
    public void setPdg(PendingStatus4Code value) {
        this.pdg = value;
    }

    /**
     * Gets the value of the fnl property.
     * 
     * @return
     *     possible object is
     *     {@link FinalStatus1Code }
     *     
     */
    public FinalStatus1Code getFnl() {
        return fnl;
    }

    /**
     * Sets the value of the fnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalStatus1Code }
     *     
     */
    public void setFnl(FinalStatus1Code value) {
        this.fnl = value;
    }

    /**
     * Gets the value of the rtgs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRTGS() {
        return rtgs;
    }

    /**
     * Sets the value of the rtgs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRTGS(String value) {
        this.rtgs = value;
    }

    /**
     * Gets the value of the sttlm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlm() {
        return sttlm;
    }

    /**
     * Sets the value of the sttlm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSttlm(String value) {
        this.sttlm = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

}
