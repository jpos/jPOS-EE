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

package org.jpos.iso20022.auth_090_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherPayment6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OtherPayment6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="PmtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PaymentType5Choice" minOccurs="0"/>
 *         <element name="PmtDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}ISODate" minOccurs="0"/>
 *         <element name="PmtPyer" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PartyIdentification236Choice" minOccurs="0"/>
 *         <element name="PmtRcvr" type="{urn:iso:std:iso:20022:tech:xsd:auth.090.001.02}PartyIdentification236Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherPayment6", propOrder = {
    "pmtCcy",
    "pmtTp",
    "pmtDt",
    "pmtPyer",
    "pmtRcvr"
})
public class OtherPayment6 {

    @XmlElement(name = "PmtCcy")
    protected String pmtCcy;
    @XmlElement(name = "PmtTp")
    protected PaymentType5Choice pmtTp;
    @XmlElement(name = "PmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pmtDt;
    @XmlElement(name = "PmtPyer")
    protected PartyIdentification236Choice pmtPyer;
    @XmlElement(name = "PmtRcvr")
    protected PartyIdentification236Choice pmtRcvr;

    /**
     * Gets the value of the pmtCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCcy() {
        return pmtCcy;
    }

    /**
     * Sets the value of the pmtCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCcy(String value) {
        this.pmtCcy = value;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType5Choice }
     *     
     */
    public PaymentType5Choice getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType5Choice }
     *     
     */
    public void setPmtTp(PaymentType5Choice value) {
        this.pmtTp = value;
    }

    /**
     * Gets the value of the pmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPmtDt() {
        return pmtDt;
    }

    /**
     * Sets the value of the pmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPmtDt(XMLGregorianCalendar value) {
        this.pmtDt = value;
    }

    /**
     * Gets the value of the pmtPyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getPmtPyer() {
        return pmtPyer;
    }

    /**
     * Sets the value of the pmtPyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public void setPmtPyer(PartyIdentification236Choice value) {
        this.pmtPyer = value;
    }

    /**
     * Gets the value of the pmtRcvr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getPmtRcvr() {
        return pmtRcvr;
    }

    /**
     * Sets the value of the pmtRcvr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public void setPmtRcvr(PartyIdentification236Choice value) {
        this.pmtRcvr = value;
    }

}
