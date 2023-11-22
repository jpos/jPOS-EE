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

package org.jpos.iso20022.camt_086_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillingServiceIdentification3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BillingServiceIdentification3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max35Text"/>
 *         <element name="SubSvc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingSubServiceIdentification1" minOccurs="0"/>
 *         <element name="Desc" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max70Text"/>
 *         <element name="CmonCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BillingServiceCommonIdentification1" minOccurs="0"/>
 *         <element name="BkTxCd" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}BankTransactionCodeStructure4" minOccurs="0"/>
 *         <element name="SvcTp" type="{urn:iso:std:iso:20022:tech:xsd:camt.086.001.04}Max12Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceIdentification3", propOrder = {
    "id",
    "subSvc",
    "desc",
    "cmonCd",
    "bkTxCd",
    "svcTp"
})
public class BillingServiceIdentification3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SubSvc")
    protected BillingSubServiceIdentification1 subSvc;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "CmonCd")
    protected BillingServiceCommonIdentification1 cmonCd;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "SvcTp")
    protected String svcTp;

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
     * Gets the value of the subSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingSubServiceIdentification1 getSubSvc() {
        return subSvc;
    }

    /**
     * Sets the value of the subSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public void setSubSvc(BillingSubServiceIdentification1 value) {
        this.subSvc = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the cmonCd property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceCommonIdentification1 }
     *     
     */
    public BillingServiceCommonIdentification1 getCmonCd() {
        return cmonCd;
    }

    /**
     * Sets the value of the cmonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceCommonIdentification1 }
     *     
     */
    public void setCmonCd(BillingServiceCommonIdentification1 value) {
        this.cmonCd = value;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public void setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcTp(String value) {
        this.svcTp = value;
    }

}
