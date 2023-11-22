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

package org.jpos.iso20022.auth_084_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransactionIdentification20 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradeTransactionIdentification20">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TechRcrdId" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max140Text" minOccurs="0"/>
 *         <element name="RptgCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}OrganisationIdentification15Choice"/>
 *         <element name="OthrCtrPty" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}PartyIdentification236Choice"/>
 *         <element name="NttyRspnsblForRpt" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="UnqTradIdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}Max52Text" minOccurs="0"/>
 *         <element name="MstrAgrmt" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}MasterAgreement7" minOccurs="0"/>
 *         <element name="AgtLndr" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *         <element name="TrptyAgt" type="{urn:iso:std:iso:20022:tech:xsd:auth.084.001.02}OrganisationIdentification15Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransactionIdentification20", propOrder = {
    "techRcrdId",
    "rptgCtrPty",
    "othrCtrPty",
    "nttyRspnsblForRpt",
    "unqTradIdr",
    "mstrAgrmt",
    "agtLndr",
    "trptyAgt"
})
public class TradeTransactionIdentification20 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "RptgCtrPty", required = true)
    protected OrganisationIdentification15Choice rptgCtrPty;
    @XmlElement(name = "OthrCtrPty", required = true)
    protected PartyIdentification236Choice othrCtrPty;
    @XmlElement(name = "NttyRspnsblForRpt")
    protected OrganisationIdentification15Choice nttyRspnsblForRpt;
    @XmlElement(name = "UnqTradIdr")
    protected String unqTradIdr;
    @XmlElement(name = "MstrAgrmt")
    protected MasterAgreement7 mstrAgrmt;
    @XmlElement(name = "AgtLndr")
    protected OrganisationIdentification15Choice agtLndr;
    @XmlElement(name = "TrptyAgt")
    protected OrganisationIdentification15Choice trptyAgt;

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
     * Gets the value of the rptgCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getRptgCtrPty() {
        return rptgCtrPty;
    }

    /**
     * Sets the value of the rptgCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setRptgCtrPty(OrganisationIdentification15Choice value) {
        this.rptgCtrPty = value;
    }

    /**
     * Gets the value of the othrCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public PartyIdentification236Choice getOthrCtrPty() {
        return othrCtrPty;
    }

    /**
     * Sets the value of the othrCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification236Choice }
     *     
     */
    public void setOthrCtrPty(PartyIdentification236Choice value) {
        this.othrCtrPty = value;
    }

    /**
     * Gets the value of the nttyRspnsblForRpt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getNttyRspnsblForRpt() {
        return nttyRspnsblForRpt;
    }

    /**
     * Sets the value of the nttyRspnsblForRpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setNttyRspnsblForRpt(OrganisationIdentification15Choice value) {
        this.nttyRspnsblForRpt = value;
    }

    /**
     * Gets the value of the unqTradIdr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqTradIdr() {
        return unqTradIdr;
    }

    /**
     * Sets the value of the unqTradIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqTradIdr(String value) {
        this.unqTradIdr = value;
    }

    /**
     * Gets the value of the mstrAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link MasterAgreement7 }
     *     
     */
    public MasterAgreement7 getMstrAgrmt() {
        return mstrAgrmt;
    }

    /**
     * Sets the value of the mstrAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterAgreement7 }
     *     
     */
    public void setMstrAgrmt(MasterAgreement7 value) {
        this.mstrAgrmt = value;
    }

    /**
     * Gets the value of the agtLndr property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getAgtLndr() {
        return agtLndr;
    }

    /**
     * Sets the value of the agtLndr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setAgtLndr(OrganisationIdentification15Choice value) {
        this.agtLndr = value;
    }

    /**
     * Gets the value of the trptyAgt property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public OrganisationIdentification15Choice getTrptyAgt() {
        return trptyAgt;
    }

    /**
     * Sets the value of the trptyAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationIdentification15Choice }
     *     
     */
    public void setTrptyAgt(OrganisationIdentification15Choice value) {
        this.trptyAgt = value;
    }

}
