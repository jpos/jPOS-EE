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

package org.jpos.iso20022.sese_011_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditTransfer9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CreditTransfer9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Dbtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PartyIdentification132" minOccurs="0"/>
 *         <element name="DbtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6" minOccurs="0"/>
 *         <element name="DbtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstitutionIdentification16" minOccurs="0"/>
 *         <element name="DbtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6" minOccurs="0"/>
 *         <element name="IntrmyAgt1" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstitutionIdentification16" minOccurs="0"/>
 *         <element name="IntrmyAgt1Acct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6" minOccurs="0"/>
 *         <element name="IntrmyAgt2" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstitutionIdentification16" minOccurs="0"/>
 *         <element name="IntrmyAgt2Acct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6" minOccurs="0"/>
 *         <element name="CdtrAgt" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}FinancialInstitutionIdentification16"/>
 *         <element name="CdtrAgtAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6" minOccurs="0"/>
 *         <element name="Cdtr" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}PartyIdentification132" minOccurs="0"/>
 *         <element name="CdtrAcct" type="{urn:iso:std:iso:20022:tech:xsd:sese.011.001.09}AccountIdentificationAndName6"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditTransfer9", propOrder = {
    "dbtr",
    "dbtrAcct",
    "dbtrAgt",
    "dbtrAgtAcct",
    "intrmyAgt1",
    "intrmyAgt1Acct",
    "intrmyAgt2",
    "intrmyAgt2Acct",
    "cdtrAgt",
    "cdtrAgtAcct",
    "cdtr",
    "cdtrAcct"
})
public class CreditTransfer9 {

    @XmlElement(name = "Dbtr")
    protected PartyIdentification132 dbtr;
    @XmlElement(name = "DbtrAcct")
    protected AccountIdentificationAndName6 dbtrAcct;
    @XmlElement(name = "DbtrAgt")
    protected FinancialInstitutionIdentification16 dbtrAgt;
    @XmlElement(name = "DbtrAgtAcct")
    protected AccountIdentificationAndName6 dbtrAgtAcct;
    @XmlElement(name = "IntrmyAgt1")
    protected FinancialInstitutionIdentification16 intrmyAgt1;
    @XmlElement(name = "IntrmyAgt1Acct")
    protected AccountIdentificationAndName6 intrmyAgt1Acct;
    @XmlElement(name = "IntrmyAgt2")
    protected FinancialInstitutionIdentification16 intrmyAgt2;
    @XmlElement(name = "IntrmyAgt2Acct")
    protected AccountIdentificationAndName6 intrmyAgt2Acct;
    @XmlElement(name = "CdtrAgt", required = true)
    protected FinancialInstitutionIdentification16 cdtrAgt;
    @XmlElement(name = "CdtrAgtAcct")
    protected AccountIdentificationAndName6 cdtrAgtAcct;
    @XmlElement(name = "Cdtr")
    protected PartyIdentification132 cdtr;
    @XmlElement(name = "CdtrAcct", required = true)
    protected AccountIdentificationAndName6 cdtrAcct;

    /**
     * Gets the value of the dbtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getDbtr() {
        return dbtr;
    }

    /**
     * Sets the value of the dbtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setDbtr(PartyIdentification132 value) {
        this.dbtr = value;
    }

    /**
     * Gets the value of the dbtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getDbtrAcct() {
        return dbtrAcct;
    }

    /**
     * Sets the value of the dbtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setDbtrAcct(AccountIdentificationAndName6 value) {
        this.dbtrAcct = value;
    }

    /**
     * Gets the value of the dbtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getDbtrAgt() {
        return dbtrAgt;
    }

    /**
     * Sets the value of the dbtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public void setDbtrAgt(FinancialInstitutionIdentification16 value) {
        this.dbtrAgt = value;
    }

    /**
     * Gets the value of the dbtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getDbtrAgtAcct() {
        return dbtrAgtAcct;
    }

    /**
     * Sets the value of the dbtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setDbtrAgtAcct(AccountIdentificationAndName6 value) {
        this.dbtrAgtAcct = value;
    }

    /**
     * Gets the value of the intrmyAgt1 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getIntrmyAgt1() {
        return intrmyAgt1;
    }

    /**
     * Sets the value of the intrmyAgt1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public void setIntrmyAgt1(FinancialInstitutionIdentification16 value) {
        this.intrmyAgt1 = value;
    }

    /**
     * Gets the value of the intrmyAgt1Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getIntrmyAgt1Acct() {
        return intrmyAgt1Acct;
    }

    /**
     * Sets the value of the intrmyAgt1Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setIntrmyAgt1Acct(AccountIdentificationAndName6 value) {
        this.intrmyAgt1Acct = value;
    }

    /**
     * Gets the value of the intrmyAgt2 property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getIntrmyAgt2() {
        return intrmyAgt2;
    }

    /**
     * Sets the value of the intrmyAgt2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public void setIntrmyAgt2(FinancialInstitutionIdentification16 value) {
        this.intrmyAgt2 = value;
    }

    /**
     * Gets the value of the intrmyAgt2Acct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getIntrmyAgt2Acct() {
        return intrmyAgt2Acct;
    }

    /**
     * Sets the value of the intrmyAgt2Acct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setIntrmyAgt2Acct(AccountIdentificationAndName6 value) {
        this.intrmyAgt2Acct = value;
    }

    /**
     * Gets the value of the cdtrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public FinancialInstitutionIdentification16 getCdtrAgt() {
        return cdtrAgt;
    }

    /**
     * Sets the value of the cdtrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstitutionIdentification16 }
     *     
     */
    public void setCdtrAgt(FinancialInstitutionIdentification16 value) {
        this.cdtrAgt = value;
    }

    /**
     * Gets the value of the cdtrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getCdtrAgtAcct() {
        return cdtrAgtAcct;
    }

    /**
     * Sets the value of the cdtrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setCdtrAgtAcct(AccountIdentificationAndName6 value) {
        this.cdtrAgtAcct = value;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification132 }
     *     
     */
    public PartyIdentification132 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification132 }
     *     
     */
    public void setCdtr(PartyIdentification132 value) {
        this.cdtr = value;
    }

    /**
     * Gets the value of the cdtrAcct property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public AccountIdentificationAndName6 getCdtrAcct() {
        return cdtrAcct;
    }

    /**
     * Sets the value of the cdtrAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentificationAndName6 }
     *     
     */
    public void setCdtrAcct(AccountIdentificationAndName6 value) {
        this.cdtrAcct = value;
    }

}
