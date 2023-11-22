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

package org.jpos.iso20022.tsin_002_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalRequestInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalRequestInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}Max35Text"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}ISODateTime"/>
 *         <element name="FincgRqstr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}PartyIdentificationAndAccount6" minOccurs="0"/>
 *         <element name="IntrmyAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}FinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="FrstAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}FinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="VldtnStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}ValidationStatusInformation1"/>
 *         <element name="CxlStsInf" type="{urn:iso:std:iso:20022:tech:xsd:tsin.002.001.01}CancellationStatusInformation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalRequestInformation1", propOrder = {
    "id",
    "creDtTm",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt",
    "vldtnStsInf",
    "cxlStsInf"
})
public class OriginalRequestInformation1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "FincgRqstr")
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt")
    protected FinancialInstitutionIdentification6 frstAgt;
    @XmlElement(name = "VldtnStsInf", required = true)
    protected ValidationStatusInformation1 vldtnStsInf;
    @XmlElement(name = "CxlStsInf")
    protected CancellationStatusInformation1 cxlStsInf;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the fincgRqstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public PartyIdentificationAndAccount6 getFincgRqstr() {
        return fincgRqstr;
    }

    /**
     * Sets the value of the fincgRqstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount6 }
     *     
     */
    public void setFincgRqstr(PartyIdentificationAndAccount6 value) {
        this.fincgRqstr = value;
    }

    /**
     * Gets the value of the intrmyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getIntrmyAgt() {
        return intrmyAgt;
    }

    /**
     * Sets the value of the intrmyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public void setIntrmyAgt(FinancialInstitutionIdentification6 value) {
        this.intrmyAgt = value;
    }

    /**
     * Gets the value of the frstAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public FinancialInstitutionIdentification6 getFrstAgt() {
        return frstAgt;
    }

    /**
     * Sets the value of the frstAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification6 }
     *     
     */
    public void setFrstAgt(FinancialInstitutionIdentification6 value) {
        this.frstAgt = value;
    }

    /**
     * Gets the value of the vldtnStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public ValidationStatusInformation1 getVldtnStsInf() {
        return vldtnStsInf;
    }

    /**
     * Sets the value of the vldtnStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidationStatusInformation1 }
     *     
     */
    public void setVldtnStsInf(ValidationStatusInformation1 value) {
        this.vldtnStsInf = value;
    }

    /**
     * Gets the value of the cxlStsInf property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationStatusInformation1 }
     *     
     */
    public CancellationStatusInformation1 getCxlStsInf() {
        return cxlStsInf;
    }

    /**
     * Sets the value of the cxlStsInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationStatusInformation1 }
     *     
     */
    public void setCxlStsInf(CancellationStatusInformation1 value) {
        this.cxlStsInf = value;
    }

}
