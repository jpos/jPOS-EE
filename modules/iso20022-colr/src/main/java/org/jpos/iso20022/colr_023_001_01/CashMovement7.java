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

package org.jpos.iso20022.colr_023_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashMovement7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashMovement7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}CreditDebit3Code"/>
 *         <element name="CshAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CshAcct" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}CashAccountIdentification5Choice" minOccurs="0"/>
 *         <element name="MvmntSts" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}ProprietaryStatusAndReason6" minOccurs="0"/>
 *         <element name="CollMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator"/>
 *         <element name="CshMvmntApprvd" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="PosTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="ClntCshMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCshMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.023.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMovement7", propOrder = {
    "cshMvmnt",
    "cshAmt",
    "cshAcct",
    "mvmntSts",
    "collMvmnt",
    "cshMvmntApprvd",
    "posTp",
    "clntCshMvmntId",
    "trptyAgtSvcPrvdrCshMvmntId"
})
public class CashMovement7 {

    @XmlElement(name = "CshMvmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cshMvmnt;
    @XmlElement(name = "CshAmt", required = true)
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CshAcct")
    protected CashAccountIdentification5Choice cshAcct;
    @XmlElement(name = "MvmntSts")
    protected ProprietaryStatusAndReason6 mvmntSts;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "CshMvmntApprvd")
    protected Boolean cshMvmntApprvd;
    @XmlElement(name = "PosTp")
    protected Boolean posTp;
    @XmlElement(name = "ClntCshMvmntId")
    protected String clntCshMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCshMvmntId")
    protected String trptyAgtSvcPrvdrCshMvmntId;

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCshMvmnt() {
        return cshMvmnt;
    }

    /**
     * Sets the value of the cshMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCshMvmnt(CreditDebit3Code value) {
        this.cshMvmnt = value;
    }

    /**
     * Gets the value of the cshAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getCshAmt() {
        return cshAmt;
    }

    /**
     * Sets the value of the cshAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setCshAmt(ActiveCurrencyAndAmount value) {
        this.cshAmt = value;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public CashAccountIdentification5Choice getCshAcct() {
        return cshAcct;
    }

    /**
     * Sets the value of the cshAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccountIdentification5Choice }
     *     
     */
    public void setCshAcct(CashAccountIdentification5Choice value) {
        this.cshAcct = value;
    }

    /**
     * Gets the value of the mvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getMvmntSts() {
        return mvmntSts;
    }

    /**
     * Sets the value of the mvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setMvmntSts(ProprietaryStatusAndReason6 value) {
        this.mvmntSts = value;
    }

    /**
     * Gets the value of the collMvmnt property.
     * 
     */
    public boolean isCollMvmnt() {
        return collMvmnt;
    }

    /**
     * Sets the value of the collMvmnt property.
     * 
     */
    public void setCollMvmnt(boolean value) {
        this.collMvmnt = value;
    }

    /**
     * Gets the value of the cshMvmntApprvd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCshMvmntApprvd() {
        return cshMvmntApprvd;
    }

    /**
     * Sets the value of the cshMvmntApprvd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCshMvmntApprvd(Boolean value) {
        this.cshMvmntApprvd = value;
    }

    /**
     * Gets the value of the posTp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPosTp() {
        return posTp;
    }

    /**
     * Sets the value of the posTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPosTp(Boolean value) {
        this.posTp = value;
    }

    /**
     * Gets the value of the clntCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntCshMvmntId() {
        return clntCshMvmntId;
    }

    /**
     * Sets the value of the clntCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntCshMvmntId(String value) {
        this.clntCshMvmntId = value;
    }

    /**
     * Gets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrptyAgtSvcPrvdrCshMvmntId() {
        return trptyAgtSvcPrvdrCshMvmntId;
    }

    /**
     * Sets the value of the trptyAgtSvcPrvdrCshMvmntId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrptyAgtSvcPrvdrCshMvmntId(String value) {
        this.trptyAgtSvcPrvdrCshMvmntId = value;
    }

}
