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

package org.jpos.iso20022.casr_001_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Environment27 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Environment27">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmInstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Orgtr" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Sndr" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Rcvr" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="Dstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification263" minOccurs="0"/>
 *         <element name="FI" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}FinancialInstitution6" minOccurs="0"/>
 *         <element name="OthrInstn" type="{urn:iso:std:iso:20022:tech:xsd:casr.001.001.02}PartyIdentification258" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Environment27", propOrder = {
    "sttlmInstn",
    "orgtr",
    "sndr",
    "rcvr",
    "dstn",
    "fi",
    "othrInstn"
})
public class Environment27 {

    @XmlElement(name = "SttlmInstn")
    protected PartyIdentification263 sttlmInstn;
    @XmlElement(name = "Orgtr")
    protected PartyIdentification263 orgtr;
    @XmlElement(name = "Sndr")
    protected PartyIdentification263 sndr;
    @XmlElement(name = "Rcvr")
    protected PartyIdentification263 rcvr;
    @XmlElement(name = "Dstn")
    protected PartyIdentification263 dstn;
    @XmlElement(name = "FI")
    protected FinancialInstitution6 fi;
    @XmlElement(name = "OthrInstn")
    protected PartyIdentification258 othrInstn;

    /**
     * Gets the value of the sttlmInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSttlmInstn() {
        return sttlmInstn;
    }

    /**
     * Sets the value of the sttlmInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setSttlmInstn(PartyIdentification263 value) {
        this.sttlmInstn = value;
    }

    /**
     * Gets the value of the orgtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getOrgtr() {
        return orgtr;
    }

    /**
     * Sets the value of the orgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setOrgtr(PartyIdentification263 value) {
        this.orgtr = value;
    }

    /**
     * Gets the value of the sndr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getSndr() {
        return sndr;
    }

    /**
     * Sets the value of the sndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setSndr(PartyIdentification263 value) {
        this.sndr = value;
    }

    /**
     * Gets the value of the rcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getRcvr() {
        return rcvr;
    }

    /**
     * Sets the value of the rcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setRcvr(PartyIdentification263 value) {
        this.rcvr = value;
    }

    /**
     * Gets the value of the dstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification263 }
     *     
     */
    public PartyIdentification263 getDstn() {
        return dstn;
    }

    /**
     * Sets the value of the dstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification263 }
     *     
     */
    public void setDstn(PartyIdentification263 value) {
        this.dstn = value;
    }

    /**
     * Gets the value of the fi property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public FinancialInstitution6 getFI() {
        return fi;
    }

    /**
     * Sets the value of the fi property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitution6 }
     *     
     */
    public void setFI(FinancialInstitution6 value) {
        this.fi = value;
    }

    /**
     * Gets the value of the othrInstn property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getOthrInstn() {
        return othrInstn;
    }

    /**
     * Sets the value of the othrInstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setOthrInstn(PartyIdentification258 value) {
        this.othrInstn = value;
    }

}
