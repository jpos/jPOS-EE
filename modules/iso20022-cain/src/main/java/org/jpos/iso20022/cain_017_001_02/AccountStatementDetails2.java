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

package org.jpos.iso20022.cain_017_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatementDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountStatementDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISODate"/>
 *         <element name="PdgInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="TxPstngDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}ISODate" minOccurs="0"/>
 *         <element name="TxAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Amount7" minOccurs="0"/>
 *         <element name="CrdhldrBllgAmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Amount7" minOccurs="0"/>
 *         <element name="CdtDbt" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}CreditDebit3Code" minOccurs="0"/>
 *         <element name="AccptrNmAndLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max99Text" minOccurs="0"/>
 *         <element name="ShrtTxDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max70Text" minOccurs="0"/>
 *         <element name="LngTxDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.017.001.02}Max256Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountStatementDetails2", propOrder = {
    "txDt",
    "pdgInd",
    "txPstngDt",
    "txAmt",
    "crdhldrBllgAmt",
    "cdtDbt",
    "accptrNmAndLctn",
    "shrtTxDesc",
    "lngTxDesc"
})
public class AccountStatementDetails2 {

    @XmlElement(name = "TxDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txDt;
    @XmlElement(name = "PdgInd")
    protected Boolean pdgInd;
    @XmlElement(name = "TxPstngDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar txPstngDt;
    @XmlElement(name = "TxAmt")
    protected Amount7 txAmt;
    @XmlElement(name = "CrdhldrBllgAmt")
    protected Amount7 crdhldrBllgAmt;
    @XmlElement(name = "CdtDbt")
    @XmlSchemaType(name = "string")
    protected CreditDebit3Code cdtDbt;
    @XmlElement(name = "AccptrNmAndLctn")
    protected String accptrNmAndLctn;
    @XmlElement(name = "ShrtTxDesc")
    protected String shrtTxDesc;
    @XmlElement(name = "LngTxDesc")
    protected String lngTxDesc;

    /**
     * Gets the value of the txDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxDt() {
        return txDt;
    }

    /**
     * Sets the value of the txDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxDt(XMLGregorianCalendar value) {
        this.txDt = value;
    }

    /**
     * Gets the value of the pdgInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPdgInd() {
        return pdgInd;
    }

    /**
     * Sets the value of the pdgInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPdgInd(Boolean value) {
        this.pdgInd = value;
    }

    /**
     * Gets the value of the txPstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTxPstngDt() {
        return txPstngDt;
    }

    /**
     * Sets the value of the txPstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTxPstngDt(XMLGregorianCalendar value) {
        this.txPstngDt = value;
    }

    /**
     * Gets the value of the txAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount7 }
     *     
     */
    public Amount7 getTxAmt() {
        return txAmt;
    }

    /**
     * Sets the value of the txAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount7 }
     *     
     */
    public void setTxAmt(Amount7 value) {
        this.txAmt = value;
    }

    /**
     * Gets the value of the crdhldrBllgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link Amount7 }
     *     
     */
    public Amount7 getCrdhldrBllgAmt() {
        return crdhldrBllgAmt;
    }

    /**
     * Sets the value of the crdhldrBllgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount7 }
     *     
     */
    public void setCrdhldrBllgAmt(Amount7 value) {
        this.crdhldrBllgAmt = value;
    }

    /**
     * Gets the value of the cdtDbt property.
     * 
     * @return
     *     possible object is
     *     {@link CreditDebit3Code }
     *     
     */
    public CreditDebit3Code getCdtDbt() {
        return cdtDbt;
    }

    /**
     * Sets the value of the cdtDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditDebit3Code }
     *     
     */
    public void setCdtDbt(CreditDebit3Code value) {
        this.cdtDbt = value;
    }

    /**
     * Gets the value of the accptrNmAndLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccptrNmAndLctn() {
        return accptrNmAndLctn;
    }

    /**
     * Sets the value of the accptrNmAndLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccptrNmAndLctn(String value) {
        this.accptrNmAndLctn = value;
    }

    /**
     * Gets the value of the shrtTxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShrtTxDesc() {
        return shrtTxDesc;
    }

    /**
     * Sets the value of the shrtTxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShrtTxDesc(String value) {
        this.shrtTxDesc = value;
    }

    /**
     * Gets the value of the lngTxDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLngTxDesc() {
        return lngTxDesc;
    }

    /**
     * Sets the value of the lngTxDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLngTxDesc(String value) {
        this.lngTxDesc = value;
    }

}
