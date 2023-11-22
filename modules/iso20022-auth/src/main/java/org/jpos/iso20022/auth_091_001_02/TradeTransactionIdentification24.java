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

package org.jpos.iso20022.auth_091_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionIdentification24 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeTransactionIdentification24">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}Max140Text" minOccurs="0"/>
 *         <element name="ActnTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}TransactionOperationType10Code" minOccurs="0"/>
 *         <element name="RptgTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="DerivEvtTp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}DerivativeEventType3Code" minOccurs="0"/>
 *         <element name="DerivEvtTmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}DateAndDateTime2Choice" minOccurs="0"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}PartyIdentification248Choice" minOccurs="0"/>
 *         <element name="UnqIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}UniqueTransactionIdentifier2Choice" minOccurs="0"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}MasterAgreement8" minOccurs="0"/>
 *         <element name="CollPrtflCd" type="{urn:iso:std:iso:20022:tech:xsd:auth.091.001.02}CollateralPortfolioCode5Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionIdentification24", propOrder = {
    "techRcrdId",
    "actnTp",
    "rptgTmStmp",
    "derivEvtTp",
    "derivEvtTmStmp",
    "othrCtrPty",
    "unqIdr",
    "mstrAgrmt",
    "collPrtflCd"
})
public class TradeTransactionIdentification24 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "ActnTp")
    @XmlSchemaType(name = "string")
    protected TransactionOperationType10Code actnTp;
    @XmlElement(name = "RptgTmStmp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgTmStmp;
    @XmlElement(name = "DerivEvtTp")
    @XmlSchemaType(name = "string")
    protected DerivativeEventType3Code derivEvtTp;
    @XmlElement(name = "DerivEvtTmStmp")
    protected DateAndDateTime2Choice derivEvtTmStmp;
    @XmlElement(name = "OthrCtrPty")
    protected PartyIdentification248Choice othrCtrPty;
    @XmlElement(name = "UnqIdr")
    protected UniqueTransactionIdentifier2Choice unqIdr;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement8 mstrAgrmt;
    @XmlElement(name = "CollPrtflCd")
    protected CollateralPortfolioCode5Choice collPrtflCd;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechRcrdId(String value) {
        this.techRcrdId = value;
    }

    /**
     * Gets the value of the actnTp property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public TransactionOperationType10Code getActnTp() {
        return actnTp;
    }

    /**
     * Sets the value of the actnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionOperationType10Code }
     *     
     */
    public void setActnTp(TransactionOperationType10Code value) {
        this.actnTp = value;
    }

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRptgTmStmp(XMLGregorianCalendar value) {
        this.rptgTmStmp = value;
    }

    /**
     * Gets the value of the derivEvtTp property.
     * 
     * @return
     *     possible object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public DerivativeEventType3Code getDerivEvtTp() {
        return derivEvtTp;
    }

    /**
     * Sets the value of the derivEvtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DerivativeEventType3Code }
     *     
     */
    public void setDerivEvtTp(DerivativeEventType3Code value) {
        this.derivEvtTp = value;
    }

    /**
     * Gets the value of the derivEvtTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getDerivEvtTmStmp() {
        return derivEvtTmStmp;
    }

    /**
     * Sets the value of the derivEvtTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public void setDerivEvtTmStmp(DateAndDateTime2Choice value) {
        this.derivEvtTmStmp = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public void setOthrCtrPty(PartyIdentification248Choice value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the unqIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getUnqIdr() {
        return unqIdr;
    }

    /**
     * Sets the value of the unqIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public void setUnqIdr(UniqueTransactionIdentifier2Choice value) {
        this.unqIdr = value;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement8 }
     *     
     */
    public MasterAgreement8 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement8 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement8 value) {
        this.mstrAgrmt = value;
    }

    /**
     * Gets the value of the collPrtflCd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public CollateralPortfolioCode5Choice getCollPrtflCd() {
        return collPrtflCd;
    }

    /**
     * Sets the value of the collPrtflCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralPortfolioCode5Choice }
     *     
     */
    public void setCollPrtflCd(CollateralPortfolioCode5Choice value) {
        this.collPrtflCd = value;
    }

}
