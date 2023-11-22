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

package org.jpos.iso20022.reda_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecuritiesSearchCriteria4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SecuritiesSearchCriteria4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FinInstrmId" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SecurityIdentification39" minOccurs="0"/>
 *         <element name="ClssfctnFinInstrm" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}CFIOct2015Identifier" minOccurs="0"/>
 *         <element name="MtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}DatePeriodSearch1Choice" minOccurs="0"/>
 *         <element name="IsseCcy" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}ActiveOrHistoricCurrencyCode" minOccurs="0"/>
 *         <element name="CtryOfIsse" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}CountryCode" minOccurs="0"/>
 *         <element name="SctySts" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SecurityStatus3Choice" minOccurs="0"/>
 *         <element name="MntngCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="InvstrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="IssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="TechIssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *         <element name="CSD" type="{urn:iso:std:iso:20022:tech:xsd:reda.010.001.01}SystemPartyIdentification2Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesSearchCriteria4", propOrder = {
    "finInstrmId",
    "clssfctnFinInstrm",
    "mtrtyDt",
    "isseDt",
    "isseCcy",
    "ctryOfIsse",
    "sctySts",
    "mntngCSD",
    "invstrCSD",
    "issrCSD",
    "techIssrCSD",
    "csd"
})
public class SecuritiesSearchCriteria4 {

    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification39 finInstrmId;
    @XmlElement(name = "ClssfctnFinInstrm")
    protected String clssfctnFinInstrm;
    @XmlElement(name = "MtrtyDt")
    protected DatePeriodSearch1Choice mtrtyDt;
    @XmlElement(name = "IsseDt")
    protected DatePeriodSearch1Choice isseDt;
    @XmlElement(name = "IsseCcy")
    protected String isseCcy;
    @XmlElement(name = "CtryOfIsse")
    protected String ctryOfIsse;
    @XmlElement(name = "SctySts")
    protected SecurityStatus3Choice sctySts;
    @XmlElement(name = "MntngCSD")
    protected SystemPartyIdentification2Choice mntngCSD;
    @XmlElement(name = "InvstrCSD")
    protected SystemPartyIdentification2Choice invstrCSD;
    @XmlElement(name = "IssrCSD")
    protected SystemPartyIdentification2Choice issrCSD;
    @XmlElement(name = "TechIssrCSD")
    protected SystemPartyIdentification2Choice techIssrCSD;
    @XmlElement(name = "CSD")
    protected SystemPartyIdentification2Choice csd;

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public SecurityIdentification39 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification39 }
     *     
     */
    public void setFinInstrmId(SecurityIdentification39 value) {
        this.finInstrmId = value;
    }

    /**
     * Gets the value of the clssfctnFinInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClssfctnFinInstrm() {
        return clssfctnFinInstrm;
    }

    /**
     * Sets the value of the clssfctnFinInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClssfctnFinInstrm(String value) {
        this.clssfctnFinInstrm = value;
    }

    /**
     * Gets the value of the mtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getMtrtyDt() {
        return mtrtyDt;
    }

    /**
     * Sets the value of the mtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setMtrtyDt(DatePeriodSearch1Choice value) {
        this.mtrtyDt = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public DatePeriodSearch1Choice getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodSearch1Choice }
     *     
     */
    public void setIsseDt(DatePeriodSearch1Choice value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the isseCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsseCcy() {
        return isseCcy;
    }

    /**
     * Sets the value of the isseCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsseCcy(String value) {
        this.isseCcy = value;
    }

    /**
     * Gets the value of the ctryOfIsse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfIsse() {
        return ctryOfIsse;
    }

    /**
     * Sets the value of the ctryOfIsse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfIsse(String value) {
        this.ctryOfIsse = value;
    }

    /**
     * Gets the value of the sctySts property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public SecurityStatus3Choice getSctySts() {
        return sctySts;
    }

    /**
     * Sets the value of the sctySts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityStatus3Choice }
     *     
     */
    public void setSctySts(SecurityStatus3Choice value) {
        this.sctySts = value;
    }

    /**
     * Gets the value of the mntngCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getMntngCSD() {
        return mntngCSD;
    }

    /**
     * Sets the value of the mntngCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setMntngCSD(SystemPartyIdentification2Choice value) {
        this.mntngCSD = value;
    }

    /**
     * Gets the value of the invstrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getInvstrCSD() {
        return invstrCSD;
    }

    /**
     * Sets the value of the invstrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setInvstrCSD(SystemPartyIdentification2Choice value) {
        this.invstrCSD = value;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getIssrCSD() {
        return issrCSD;
    }

    /**
     * Sets the value of the issrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setIssrCSD(SystemPartyIdentification2Choice value) {
        this.issrCSD = value;
    }

    /**
     * Gets the value of the techIssrCSD property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getTechIssrCSD() {
        return techIssrCSD;
    }

    /**
     * Sets the value of the techIssrCSD property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setTechIssrCSD(SystemPartyIdentification2Choice value) {
        this.techIssrCSD = value;
    }

    /**
     * Gets the value of the csd property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public SystemPartyIdentification2Choice getCSD() {
        return csd;
    }

    /**
     * Sets the value of the csd property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification2Choice }
     *     
     */
    public void setCSD(SystemPartyIdentification2Choice value) {
        this.csd = value;
    }

}
