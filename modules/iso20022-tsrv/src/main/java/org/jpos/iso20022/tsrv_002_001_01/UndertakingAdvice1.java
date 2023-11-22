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

package org.jpos.iso20022.tsrv_002_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingAdvice1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingAdvice1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgIssncMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}UndertakingIssuanceMessage"/>
 *         <element name="FrstAdvsgPtyAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}AdvisingPartyAdditionalInformation1" minOccurs="0"/>
 *         <element name="ScndAdvsgPtyAddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}AdvisingPartyAdditionalInformation1" minOccurs="0"/>
 *         <element name="ConfDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}UndertakingConfirmation1" minOccurs="0"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.002.001.01}PartyAndSignature2" maxOccurs="3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAdvice1", propOrder = {
    "udrtkgIssncMsg",
    "frstAdvsgPtyAddtlInf",
    "scndAdvsgPtyAddtlInf",
    "confDtls",
    "dgtlSgntr"
})
public class UndertakingAdvice1 {

    @XmlElement(name = "UdrtkgIssncMsg", required = true)
    protected UndertakingIssuanceMessage udrtkgIssncMsg;
    @XmlElement(name = "FrstAdvsgPtyAddtlInf")
    protected AdvisingPartyAdditionalInformation1 frstAdvsgPtyAddtlInf;
    @XmlElement(name = "ScndAdvsgPtyAddtlInf")
    protected AdvisingPartyAdditionalInformation1 scndAdvsgPtyAddtlInf;
    @XmlElement(name = "ConfDtls")
    protected UndertakingConfirmation1 confDtls;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;

    /**
     * Gets the value of the udrtkgIssncMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public UndertakingIssuanceMessage getUdrtkgIssncMsg() {
        return udrtkgIssncMsg;
    }

    /**
     * Sets the value of the udrtkgIssncMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingIssuanceMessage }
     *     
     */
    public void setUdrtkgIssncMsg(UndertakingIssuanceMessage value) {
        this.udrtkgIssncMsg = value;
    }

    /**
     * Gets the value of the frstAdvsgPtyAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public AdvisingPartyAdditionalInformation1 getFrstAdvsgPtyAddtlInf() {
        return frstAdvsgPtyAddtlInf;
    }

    /**
     * Sets the value of the frstAdvsgPtyAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public void setFrstAdvsgPtyAddtlInf(AdvisingPartyAdditionalInformation1 value) {
        this.frstAdvsgPtyAddtlInf = value;
    }

    /**
     * Gets the value of the scndAdvsgPtyAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public AdvisingPartyAdditionalInformation1 getScndAdvsgPtyAddtlInf() {
        return scndAdvsgPtyAddtlInf;
    }

    /**
     * Sets the value of the scndAdvsgPtyAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public void setScndAdvsgPtyAddtlInf(AdvisingPartyAdditionalInformation1 value) {
        this.scndAdvsgPtyAddtlInf = value;
    }

    /**
     * Gets the value of the confDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingConfirmation1 }
     *     
     */
    public UndertakingConfirmation1 getConfDtls() {
        return confDtls;
    }

    /**
     * Sets the value of the confDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingConfirmation1 }
     *     
     */
    public void setConfDtls(UndertakingConfirmation1 value) {
        this.confDtls = value;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     * @return
     *     The value of the dgtlSgntr property.
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<>();
        }
        return this.dgtlSgntr;
    }

}
