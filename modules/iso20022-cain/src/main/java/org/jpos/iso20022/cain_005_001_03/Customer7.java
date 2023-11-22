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

package org.jpos.iso20022.cain_005_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Customer7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Customer7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CstmrId" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max35Text" minOccurs="0"/>
 *         <element name="CstmrDsgnt" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Max2NumericText" minOccurs="0"/>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}CardholderName3" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Address2" minOccurs="0"/>
 *         <element name="CtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Contact6" minOccurs="0"/>
 *         <element name="Crdntls" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}Credentials2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Ntlty" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISOMax3ACountryCode" minOccurs="0"/>
 *         <element name="CtryOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISOMax3ACountryCode" minOccurs="0"/>
 *         <element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}ISODate" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}LocalData3" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.005.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer7", propOrder = {
    "cstmrId",
    "cstmrDsgnt",
    "nm",
    "adr",
    "ctctInf",
    "crdntls",
    "ntlty",
    "ctryOfBirth",
    "dtOfBirth",
    "lclData",
    "addtlData"
})
public class Customer7 {

    @XmlElement(name = "CstmrId")
    protected String cstmrId;
    @XmlElement(name = "CstmrDsgnt")
    protected String cstmrDsgnt;
    @XmlElement(name = "Nm")
    protected CardholderName3 nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "CtctInf")
    protected Contact6 ctctInf;
    @XmlElement(name = "Crdntls")
    protected List<Credentials2> crdntls;
    @XmlElement(name = "Ntlty")
    protected String ntlty;
    @XmlElement(name = "CtryOfBirth")
    protected String ctryOfBirth;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "LclData")
    protected LocalData3 lclData;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;

    /**
     * Gets the value of the cstmrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrId() {
        return cstmrId;
    }

    /**
     * Sets the value of the cstmrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrId(String value) {
        this.cstmrId = value;
    }

    /**
     * Gets the value of the cstmrDsgnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrDsgnt() {
        return cstmrDsgnt;
    }

    /**
     * Sets the value of the cstmrDsgnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrDsgnt(String value) {
        this.cstmrDsgnt = value;
    }

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setNm(CardholderName3 value) {
        this.nm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the ctctInf property.
     * 
     * @return
     *     possible object is
     *     {@link Contact6 }
     *     
     */
    public Contact6 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact6 }
     *     
     */
    public void setCtctInf(Contact6 value) {
        this.ctctInf = value;
    }

    /**
     * Gets the value of the crdntls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the crdntls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCrdntls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials2 }
     * 
     * 
     * @return
     *     The value of the crdntls property.
     */
    public List<Credentials2> getCrdntls() {
        if (crdntls == null) {
            crdntls = new ArrayList<>();
        }
        return this.crdntls;
    }

    /**
     * Gets the value of the ntlty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtlty() {
        return ntlty;
    }

    /**
     * Sets the value of the ntlty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtlty(String value) {
        this.ntlty = value;
    }

    /**
     * Gets the value of the ctryOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtryOfBirth() {
        return ctryOfBirth;
    }

    /**
     * Sets the value of the ctryOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtryOfBirth(String value) {
        this.ctryOfBirth = value;
    }

    /**
     * Gets the value of the dtOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfBirth() {
        return dtOfBirth;
    }

    /**
     * Sets the value of the dtOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfBirth(XMLGregorianCalendar value) {
        this.dtOfBirth = value;
    }

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData3 }
     *     
     */
    public LocalData3 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData3 }
     *     
     */
    public void setLclData(LocalData3 value) {
        this.lclData = value;
    }

    /**
     * Gets the value of the addtlData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlData property.
     */
    public List<AdditionalData1> getAddtlData() {
        if (addtlData == null) {
            addtlData = new ArrayList<>();
        }
        return this.addtlData;
    }

}
