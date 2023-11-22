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

package org.jpos.iso20022.acmt_034_001_04;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSwitchDetails1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountSwitchDetails1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UnqRefNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}Max35Text"/>
 *         <element name="RtgUnqRefNb" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}Max35Text"/>
 *         <element name="SwtchRcvdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}ISODateTime" minOccurs="0"/>
 *         <element name="SwtchDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}ISODate" minOccurs="0"/>
 *         <element name="SwtchTp" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}SwitchType1Code"/>
 *         <element name="SwtchSts" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}SwitchStatus1Code" minOccurs="0"/>
 *         <element name="BalTrfWndw" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}BalanceTransferWindow1Code" minOccurs="0"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:acmt.034.001.04}ResponseDetails1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSwitchDetails1", propOrder = {
    "unqRefNb",
    "rtgUnqRefNb",
    "swtchRcvdDtTm",
    "swtchDt",
    "swtchTp",
    "swtchSts",
    "balTrfWndw",
    "rspn"
})
public class AccountSwitchDetails1 {

    @XmlElement(name = "UnqRefNb", required = true)
    protected String unqRefNb;
    @XmlElement(name = "RtgUnqRefNb", required = true)
    protected String rtgUnqRefNb;
    @XmlElement(name = "SwtchRcvdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar swtchRcvdDtTm;
    @XmlElement(name = "SwtchDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar swtchDt;
    @XmlElement(name = "SwtchTp", required = true)
    @XmlSchemaType(name = "string")
    protected SwitchType1Code swtchTp;
    @XmlElement(name = "SwtchSts")
    @XmlSchemaType(name = "string")
    protected SwitchStatus1Code swtchSts;
    @XmlElement(name = "BalTrfWndw")
    @XmlSchemaType(name = "string")
    protected BalanceTransferWindow1Code balTrfWndw;
    @XmlElement(name = "Rspn")
    protected List<ResponseDetails1> rspn;

    /**
     * Gets the value of the unqRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnqRefNb() {
        return unqRefNb;
    }

    /**
     * Sets the value of the unqRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnqRefNb(String value) {
        this.unqRefNb = value;
    }

    /**
     * Gets the value of the rtgUnqRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtgUnqRefNb() {
        return rtgUnqRefNb;
    }

    /**
     * Sets the value of the rtgUnqRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtgUnqRefNb(String value) {
        this.rtgUnqRefNb = value;
    }

    /**
     * Gets the value of the swtchRcvdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSwtchRcvdDtTm() {
        return swtchRcvdDtTm;
    }

    /**
     * Sets the value of the swtchRcvdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSwtchRcvdDtTm(XMLGregorianCalendar value) {
        this.swtchRcvdDtTm = value;
    }

    /**
     * Gets the value of the swtchDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSwtchDt() {
        return swtchDt;
    }

    /**
     * Sets the value of the swtchDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSwtchDt(XMLGregorianCalendar value) {
        this.swtchDt = value;
    }

    /**
     * Gets the value of the swtchTp property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchType1Code }
     *     
     */
    public SwitchType1Code getSwtchTp() {
        return swtchTp;
    }

    /**
     * Sets the value of the swtchTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchType1Code }
     *     
     */
    public void setSwtchTp(SwitchType1Code value) {
        this.swtchTp = value;
    }

    /**
     * Gets the value of the swtchSts property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public SwitchStatus1Code getSwtchSts() {
        return swtchSts;
    }

    /**
     * Sets the value of the swtchSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchStatus1Code }
     *     
     */
    public void setSwtchSts(SwitchStatus1Code value) {
        this.swtchSts = value;
    }

    /**
     * Gets the value of the balTrfWndw property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public BalanceTransferWindow1Code getBalTrfWndw() {
        return balTrfWndw;
    }

    /**
     * Sets the value of the balTrfWndw property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceTransferWindow1Code }
     *     
     */
    public void setBalTrfWndw(BalanceTransferWindow1Code value) {
        this.balTrfWndw = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseDetails1 }
     * 
     * 
     * @return
     *     The value of the rspn property.
     */
    public List<ResponseDetails1> getRspn() {
        if (rspn == null) {
            rspn = new ArrayList<>();
        }
        return this.rspn;
    }

}
