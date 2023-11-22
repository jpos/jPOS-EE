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

package org.jpos.iso20022.auth_018_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyControlHeader4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CurrencyControlHeader4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}ISODateTime"/>
 *         <element name="NbOfItms" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}Max15NumericText"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}PartyIdentification135"/>
 *         <element name="FwdgAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.018.001.03}BranchAndFinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyControlHeader4", propOrder = {
    "msgId",
    "creDtTm",
    "nbOfItms",
    "initgPty",
    "fwdgAgt"
})
public class CurrencyControlHeader4 {

    @XmlElement(name = "MsgId", required = true)
    protected String msgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "NbOfItms", required = true)
    protected String nbOfItms;
    @XmlElement(name = "InitgPty", required = true)
    protected PartyIdentification135 initgPty;
    @XmlElement(name = "FwdgAgt")
    protected BranchAndFinancialInstitutionIdentification6 fwdgAgt;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgId(String value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

    /**
     * Gets the value of the nbOfItms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfItms() {
        return nbOfItms;
    }

    /**
     * Sets the value of the nbOfItms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfItms(String value) {
        this.nbOfItms = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public void setInitgPty(PartyIdentification135 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the fwdgAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getFwdgAgt() {
        return fwdgAgt;
    }

    /**
     * Sets the value of the fwdgAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public void setFwdgAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.fwdgAgt = value;
    }

}
