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

package org.jpos.iso20022.acmt_028_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cheque11 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cheque11">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ChqTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ChequeType2Code" minOccurs="0"/>
 *         <element name="ChqNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="ChqFr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}NameAndAddress16" minOccurs="0"/>
 *         <element name="DlvryMtd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ChequeDeliveryMethod1Choice" minOccurs="0"/>
 *         <element name="DlvrTo" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}NameAndAddress16" minOccurs="0"/>
 *         <element name="InstrPrty" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Priority2Code" minOccurs="0"/>
 *         <element name="ChqMtrtyDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}ISODate" minOccurs="0"/>
 *         <element name="FrmsCd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="MemoFld" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" maxOccurs="2" minOccurs="0"/>
 *         <element name="RgnlClrZone" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="PrtLctn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max35Text" minOccurs="0"/>
 *         <element name="Sgntr" type="{urn:iso:std:iso:20022:tech:xsd:acmt.028.001.04}Max70Text" maxOccurs="5" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque11", propOrder = {
    "chqTp",
    "chqNb",
    "chqFr",
    "dlvryMtd",
    "dlvrTo",
    "instrPrty",
    "chqMtrtyDt",
    "frmsCd",
    "memoFld",
    "rgnlClrZone",
    "prtLctn",
    "sgntr"
})
public class Cheque11 {

    @XmlElement(name = "ChqTp")
    @XmlSchemaType(name = "string")
    protected ChequeType2Code chqTp;
    @XmlElement(name = "ChqNb")
    protected String chqNb;
    @XmlElement(name = "ChqFr")
    protected NameAndAddress16 chqFr;
    @XmlElement(name = "DlvryMtd")
    protected ChequeDeliveryMethod1Choice dlvryMtd;
    @XmlElement(name = "DlvrTo")
    protected NameAndAddress16 dlvrTo;
    @XmlElement(name = "InstrPrty")
    @XmlSchemaType(name = "string")
    protected Priority2Code instrPrty;
    @XmlElement(name = "ChqMtrtyDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chqMtrtyDt;
    @XmlElement(name = "FrmsCd")
    protected String frmsCd;
    @XmlElement(name = "MemoFld")
    protected List<String> memoFld;
    @XmlElement(name = "RgnlClrZone")
    protected String rgnlClrZone;
    @XmlElement(name = "PrtLctn")
    protected String prtLctn;
    @XmlElement(name = "Sgntr")
    protected List<String> sgntr;

    /**
     * Gets the value of the chqTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeType2Code }
     *     
     */
    public ChequeType2Code getChqTp() {
        return chqTp;
    }

    /**
     * Sets the value of the chqTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeType2Code }
     *     
     */
    public void setChqTp(ChequeType2Code value) {
        this.chqTp = value;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChqNb(String value) {
        this.chqNb = value;
    }

    /**
     * Gets the value of the chqFr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress16 }
     *     
     */
    public NameAndAddress16 getChqFr() {
        return chqFr;
    }

    /**
     * Sets the value of the chqFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress16 }
     *     
     */
    public void setChqFr(NameAndAddress16 value) {
        this.chqFr = value;
    }

    /**
     * Gets the value of the dlvryMtd property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public ChequeDeliveryMethod1Choice getDlvryMtd() {
        return dlvryMtd;
    }

    /**
     * Sets the value of the dlvryMtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeDeliveryMethod1Choice }
     *     
     */
    public void setDlvryMtd(ChequeDeliveryMethod1Choice value) {
        this.dlvryMtd = value;
    }

    /**
     * Gets the value of the dlvrTo property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress16 }
     *     
     */
    public NameAndAddress16 getDlvrTo() {
        return dlvrTo;
    }

    /**
     * Sets the value of the dlvrTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress16 }
     *     
     */
    public void setDlvrTo(NameAndAddress16 value) {
        this.dlvrTo = value;
    }

    /**
     * Gets the value of the instrPrty property.
     * 
     * @return
     *     possible object is
     *     {@link Priority2Code }
     *     
     */
    public Priority2Code getInstrPrty() {
        return instrPrty;
    }

    /**
     * Sets the value of the instrPrty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority2Code }
     *     
     */
    public void setInstrPrty(Priority2Code value) {
        this.instrPrty = value;
    }

    /**
     * Gets the value of the chqMtrtyDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChqMtrtyDt() {
        return chqMtrtyDt;
    }

    /**
     * Sets the value of the chqMtrtyDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChqMtrtyDt(XMLGregorianCalendar value) {
        this.chqMtrtyDt = value;
    }

    /**
     * Gets the value of the frmsCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmsCd() {
        return frmsCd;
    }

    /**
     * Sets the value of the frmsCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmsCd(String value) {
        this.frmsCd = value;
    }

    /**
     * Gets the value of the memoFld property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the memoFld property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoFld().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the memoFld property.
     */
    public List<String> getMemoFld() {
        if (memoFld == null) {
            memoFld = new ArrayList<>();
        }
        return this.memoFld;
    }

    /**
     * Gets the value of the rgnlClrZone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgnlClrZone() {
        return rgnlClrZone;
    }

    /**
     * Sets the value of the rgnlClrZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgnlClrZone(String value) {
        this.rgnlClrZone = value;
    }

    /**
     * Gets the value of the prtLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtLctn() {
        return prtLctn;
    }

    /**
     * Sets the value of the prtLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtLctn(String value) {
        this.prtLctn = value;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the sgntr property.
     */
    public List<String> getSgntr() {
        if (sgntr == null) {
            sgntr = new ArrayList<>();
        }
        return this.sgntr;
    }

}
