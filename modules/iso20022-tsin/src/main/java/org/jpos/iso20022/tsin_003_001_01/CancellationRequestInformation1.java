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

package org.jpos.iso20022.tsin_003_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CancellationRequestInformation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CancellationRequestInformation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OrgnlGrpId" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}Max35Text"/>
 *         <element name="OrgnlCreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}ISODateTime"/>
 *         <element name="NbOfInvcReqs" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="TtlBlkInvcAmt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="CxlRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}Max105Text"/>
 *         <element name="FincgRqstr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}PartyIdentificationAndAccount6" minOccurs="0"/>
 *         <element name="IntrmyAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}FinancialInstitutionIdentification6" minOccurs="0"/>
 *         <element name="FrstAgt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.003.001.01}FinancialInstitutionIdentification6" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationRequestInformation1", propOrder = {
    "orgnlGrpId",
    "orgnlCreDtTm",
    "nbOfInvcReqs",
    "ttlBlkInvcAmt",
    "cxlRsn",
    "fincgRqstr",
    "intrmyAgt",
    "frstAgt"
})
public class CancellationRequestInformation1 {

    @XmlElement(name = "OrgnlGrpId", required = true)
    protected String orgnlGrpId;
    @XmlElement(name = "OrgnlCreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orgnlCreDtTm;
    @XmlElement(name = "NbOfInvcReqs")
    protected String nbOfInvcReqs;
    @XmlElement(name = "TtlBlkInvcAmt")
    protected ActiveCurrencyAndAmount ttlBlkInvcAmt;
    @XmlElement(name = "CxlRsn", required = true)
    protected String cxlRsn;
    @XmlElement(name = "FincgRqstr")
    protected PartyIdentificationAndAccount6 fincgRqstr;
    @XmlElement(name = "IntrmyAgt")
    protected FinancialInstitutionIdentification6 intrmyAgt;
    @XmlElement(name = "FrstAgt")
    protected FinancialInstitutionIdentification6 frstAgt;

    /**
     * Gets the value of the orgnlGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlGrpId() {
        return orgnlGrpId;
    }

    /**
     * Sets the value of the orgnlGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlGrpId(String value) {
        this.orgnlGrpId = value;
    }

    /**
     * Gets the value of the orgnlCreDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrgnlCreDtTm() {
        return orgnlCreDtTm;
    }

    /**
     * Sets the value of the orgnlCreDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrgnlCreDtTm(XMLGregorianCalendar value) {
        this.orgnlCreDtTm = value;
    }

    /**
     * Gets the value of the nbOfInvcReqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfInvcReqs() {
        return nbOfInvcReqs;
    }

    /**
     * Sets the value of the nbOfInvcReqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfInvcReqs(String value) {
        this.nbOfInvcReqs = value;
    }

    /**
     * Gets the value of the ttlBlkInvcAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTtlBlkInvcAmt() {
        return ttlBlkInvcAmt;
    }

    /**
     * Sets the value of the ttlBlkInvcAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTtlBlkInvcAmt(ActiveCurrencyAndAmount value) {
        this.ttlBlkInvcAmt = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRsn(String value) {
        this.cxlRsn = value;
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

}
