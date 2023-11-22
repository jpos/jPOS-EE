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

package org.jpos.iso20022.colr_021_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashMovement5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashMovement5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CshMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}CollateralEntryType1Code"/>
 *         <element name="CshAmt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="CollMvmnt" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}YesNoIndicator"/>
 *         <element name="ClntCshMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TrptyAgtSvcPrvdrCshMvmntId" type="{urn:iso:std:iso:20022:tech:xsd:colr.021.001.01}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashMovement5", propOrder = {
    "cshMvmnt",
    "cshAmt",
    "collMvmnt",
    "clntCshMvmntId",
    "trptyAgtSvcPrvdrCshMvmntId"
})
public class CashMovement5 {

    @XmlElement(name = "CshMvmnt", required = true)
    @XmlSchemaType(name = "string")
    protected CollateralEntryType1Code cshMvmnt;
    @XmlElement(name = "CshAmt", required = true)
    protected ActiveCurrencyAndAmount cshAmt;
    @XmlElement(name = "CollMvmnt")
    protected boolean collMvmnt;
    @XmlElement(name = "ClntCshMvmntId")
    protected String clntCshMvmntId;
    @XmlElement(name = "TrptyAgtSvcPrvdrCshMvmntId")
    protected String trptyAgtSvcPrvdrCshMvmntId;

    /**
     * Gets the value of the cshMvmnt property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public CollateralEntryType1Code getCshMvmnt() {
        return cshMvmnt;
    }

    /**
     * Sets the value of the cshMvmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralEntryType1Code }
     *     
     */
    public void setCshMvmnt(CollateralEntryType1Code value) {
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
