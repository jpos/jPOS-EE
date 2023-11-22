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

package org.jpos.iso20022.acmt_003_001_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectDebitMandate7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DirectDebitMandate7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}AccountIdentificationAndName5"/>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="DbtrTaxIdNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="DbtrNtlRegnNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}PartyIdentification125Choice" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}FinancialInstitutionIdentification11Choice"/>
 *         <element name="DbtrAgtBrnch" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}BranchData4" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}FinancialInstitutionIdentification11Choice" minOccurs="0"/>
 *         <element name="CdtrAgtBrnch" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}BranchData4" minOccurs="0"/>
 *         <element name="RegnId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *         <element name="MndtId" type="{urn:iso:std:iso:20022:tech:xsd:acmt.003.001.08}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitMandate7", propOrder = {
    "dbtrAcct",
    "dbtr",
    "dbtrTaxIdNb",
    "dbtrNtlRegnNb",
    "cdtr",
    "dbtrAgt",
    "dbtrAgtBrnch",
    "cdtrAgt",
    "cdtrAgtBrnch",
    "regnId",
    "mndtId"
})
public class DirectDebitMandate7 {

    @XmlElement(name = "DbtrAcct", required = true)
    protected AccountIdentificationAndName5 dbtrAcct;
    @XmlElement(name = "Dbtr")
    protected PartyIdentification125Choice dbtr;
    @XmlElement(name = "DbtrTaxIdNb")
    protected String dbtrTaxIdNb;
    @XmlElement(name = "DbtrNtlRegnNb")
    protected String dbtrNtlRegnNb;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification125Choice cdtr;
    @XmlElement(name = "DbtrAgt", required = true)
    protected FinancialInstitutionIdentification11Choice dbtrAgt;
    @XmlElement(name = "DbtrAgtBrnch")
    protected BranchData4 dbtrAgtBrnch;
    @XmlElement(name = "CdtrAgt")
    protected FinancialInstitutionIdentification11Choice cdtrAgt;
    @XmlElement(name = "CdtrAgtBrnch")
    protected BranchData4 cdtrAgtBrnch;
    @XmlElement(name = "RegnId")
    protected String regnId;
    @XmlElement(name = "MndtId")
    protected String mndtId;

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public AccountIdentificationAndName5 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName5 }
     *     
     */
    public void setDbtrAcct(AccountIdentificationAndName5 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setDbtr(PartyIdentification125Choice value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrTaxIdNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrTaxIdNb() {
        return dbtrTaxIdNb;
    }

    /**
     * Sets the value of the dbtrTaxIdNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrTaxIdNb(String value) {
        this.dbtrTaxIdNb = value;
    }

    /**
     * Gets the value of the dbtrNtlRegnNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbtrNtlRegnNb() {
        return dbtrNtlRegnNb;
    }

    /**
     * Sets the value of the dbtrNtlRegnNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbtrNtlRegnNb(String value) {
        this.dbtrNtlRegnNb = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public void setCdtr(PartyIdentification125Choice value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public void setDbtrAgt(FinancialInstitutionIdentification11Choice value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getDbtrAgtBrnch() {
        return dbtrAgtBrnch;
    }

    /**
     * Sets the value of the dbtrAgtBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public void setDbtrAgtBrnch(BranchData4 value) {
        this.dbtrAgtBrnch = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public FinancialInstitutionIdentification11Choice getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification11Choice }
     *     
     */
    public void setCdtrAgt(FinancialInstitutionIdentification11Choice value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgtBrnch property.
     * 
     * @return
     *     possible object is
     *     {@link BranchData4 }
     *     
     */
    public BranchData4 getCdtrAgtBrnch() {
        return cdtrAgtBrnch;
    }

    /**
     * Sets the value of the cdtrAgtBrnch property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchData4 }
     *     
     */
    public void setCdtrAgtBrnch(BranchData4 value) {
        this.cdtrAgtBrnch = value;
    }

    /**
     * Gets the value of the regnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnId() {
        return regnId;
    }

    /**
     * Sets the value of the regnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnId(String value) {
        this.regnId = value;
    }

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMndtId(String value) {
        this.mndtId = value;
    }

}
