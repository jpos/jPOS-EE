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

package org.jpos.iso20022.colr_008_001_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CashCollateralResponse3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CashCollateralResponse3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnTp" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}Status4Code"/>
 *         <element name="CollId" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}Max35Text" minOccurs="0"/>
 *         <element name="AsstNb" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}Max35Text" minOccurs="0"/>
 *         <element name="CshAcctId" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}AccountIdentification4Choice" minOccurs="0"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}RejectionReason68Code" minOccurs="0"/>
 *         <element name="RjctnInf" type="{urn:iso:std:iso:20022:tech:xsd:colr.008.001.06}Max35Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashCollateralResponse3", propOrder = {
    "rspnTp",
    "collId",
    "asstNb",
    "cshAcctId",
    "rjctnRsn",
    "rjctnInf"
})
public class CashCollateralResponse3 {

    @XmlElement(name = "RspnTp", required = true)
    @XmlSchemaType(name = "string")
    protected Status4Code rspnTp;
    @XmlElement(name = "CollId")
    protected String collId;
    @XmlElement(name = "AsstNb")
    protected String asstNb;
    @XmlElement(name = "CshAcctId")
    protected AccountIdentification4Choice cshAcctId;
    @XmlElement(name = "RjctnRsn")
    @XmlSchemaType(name = "string")
    protected RejectionReason68Code rjctnRsn;
    @XmlElement(name = "RjctnInf")
    protected String rjctnInf;

    /**
     * Gets the value of the rspnTp property.
     * 
     * @return
     *     possible object is
     *     {@link Status4Code }
     *     
     */
    public Status4Code getRspnTp() {
        return rspnTp;
    }

    /**
     * Sets the value of the rspnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status4Code }
     *     
     */
    public void setRspnTp(Status4Code value) {
        this.rspnTp = value;
    }

    /**
     * Gets the value of the collId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollId() {
        return collId;
    }

    /**
     * Sets the value of the collId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollId(String value) {
        this.collId = value;
    }

    /**
     * Gets the value of the asstNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsstNb() {
        return asstNb;
    }

    /**
     * Sets the value of the asstNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsstNb(String value) {
        this.asstNb = value;
    }

    /**
     * Gets the value of the cshAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public AccountIdentification4Choice getCshAcctId() {
        return cshAcctId;
    }

    /**
     * Sets the value of the cshAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountIdentification4Choice }
     *     
     */
    public void setCshAcctId(AccountIdentification4Choice value) {
        this.cshAcctId = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason68Code }
     *     
     */
    public RejectionReason68Code getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason68Code }
     *     
     */
    public void setRjctnRsn(RejectionReason68Code value) {
        this.rjctnRsn = value;
    }

    /**
     * Gets the value of the rjctnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnInf() {
        return rjctnInf;
    }

    /**
     * Sets the value of the rjctnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctnInf(String value) {
        this.rjctnInf = value;
    }

}
