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

package org.jpos.iso20022.auth_024_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionCertificateContract2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionCertificateContract2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CtrctRef" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ContractRegistrationReference2Choice" minOccurs="0"/>
 *         <element name="TxAmtInCtrctCcy" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="XpctdShipmntDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ISODate" minOccurs="0"/>
 *         <element name="XpctdAdvncPmtRtrDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}ISODate" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:auth.024.001.03}Max1025Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificateContract2", propOrder = {
    "ctrctRef",
    "txAmtInCtrctCcy",
    "xpctdShipmntDt",
    "xpctdAdvncPmtRtrDt",
    "addtlInf"
})
public class TransactionCertificateContract2 {

    @XmlElement(name = "CtrctRef")
    protected ContractRegistrationReference2Choice ctrctRef;
    @XmlElement(name = "TxAmtInCtrctCcy")
    protected ActiveCurrencyAndAmount txAmtInCtrctCcy;
    @XmlElement(name = "XpctdShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdShipmntDt;
    @XmlElement(name = "XpctdAdvncPmtRtrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdAdvncPmtRtrDt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public ContractRegistrationReference2Choice getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public void setCtrctRef(ContractRegistrationReference2Choice value) {
        this.ctrctRef = value;
    }

    /**
     * Gets the value of the txAmtInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxAmtInCtrctCcy() {
        return txAmtInCtrctCcy;
    }

    /**
     * Sets the value of the txAmtInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setTxAmtInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.txAmtInCtrctCcy = value;
    }

    /**
     * Gets the value of the xpctdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdShipmntDt() {
        return xpctdShipmntDt;
    }

    /**
     * Sets the value of the xpctdShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdShipmntDt(XMLGregorianCalendar value) {
        this.xpctdShipmntDt = value;
    }

    /**
     * Gets the value of the xpctdAdvncPmtRtrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdAdvncPmtRtrDt() {
        return xpctdAdvncPmtRtrDt;
    }

    /**
     * Sets the value of the xpctdAdvncPmtRtrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpctdAdvncPmtRtrDt(XMLGregorianCalendar value) {
        this.xpctdAdvncPmtRtrDt = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlInf(String value) {
        this.addtlInf = value;
    }

}
