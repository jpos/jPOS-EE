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

package org.jpos.iso20022.auth_079_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingPartyAndTime14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ClearingPartyAndTime14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CCP" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="ClrDtTm" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="RptTrckgNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Max52Text" minOccurs="0"/>
 *         <element name="PrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.079.001.02}Max52Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingPartyAndTime14", propOrder = {
    "ccp",
    "clrDtTm",
    "rptTrckgNb",
    "prtflCd"
})
public class ClearingPartyAndTime14 {

    @XmlElement(name = "CCP")
    protected OrganisationIdentification15Choice ccp;
    @XmlElement(name = "ClrDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clrDtTm;
    @XmlElement(name = "RptTrckgNb")
    protected String rptTrckgNb;
    @XmlElement(name = "PrtflCd")
    protected String prtflCd;

    /**
     * Gets the value of the ccp property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getCCP() {
        return ccp;
    }

    /**
     * Sets the value of the ccp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setCCP(OrganisationIdentification15Choice value) {
        this.ccp = value;
    }

    /**
     * Gets the value of the clrDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClrDtTm() {
        return clrDtTm;
    }

    /**
     * Sets the value of the clrDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClrDtTm(XMLGregorianCalendar value) {
        this.clrDtTm = value;
    }

    /**
     * Gets the value of the rptTrckgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptTrckgNb() {
        return rptTrckgNb;
    }

    /**
     * Sets the value of the rptTrckgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRptTrckgNb(String value) {
        this.rptTrckgNb = value;
    }

    /**
     * Gets the value of the prtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtflCd() {
        return prtflCd;
    }

    /**
     * Sets the value of the prtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtflCd(String value) {
        this.prtflCd = value;
    }

}
