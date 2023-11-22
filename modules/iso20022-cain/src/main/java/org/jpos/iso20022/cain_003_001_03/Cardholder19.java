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

package org.jpos.iso20022.cain_003_001_03;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cardholder19 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Cardholder19">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CrdhldrNm" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}CardholderName3" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Credentials2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Address2" minOccurs="0"/>
 *         <element name="CtctInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}Contact1" minOccurs="0"/>
 *         <element name="DtOfBirth" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}ISODate" minOccurs="0"/>
 *         <element name="HghValCstmrInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="LclData" type="{urn:iso:std:iso:20022:tech:xsd:cain.003.001.03}LocalData7" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cardholder19", propOrder = {
    "crdhldrNm",
    "id",
    "adr",
    "ctctInf",
    "dtOfBirth",
    "hghValCstmrInd",
    "addtlData",
    "lclData"
})
public class Cardholder19 {

    @XmlElement(name = "CrdhldrNm")
    protected CardholderName3 crdhldrNm;
    @XmlElement(name = "Id")
    protected List<Credentials2> id;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "CtctInf")
    protected Contact1 ctctInf;
    @XmlElement(name = "DtOfBirth")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfBirth;
    @XmlElement(name = "HghValCstmrInd")
    protected Boolean hghValCstmrInd;
    @XmlElement(name = "AddtlData")
    protected List<AdditionalData1> addtlData;
    @XmlElement(name = "LclData")
    protected LocalData7 lclData;

    /**
     * Gets the value of the crdhldrNm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getCrdhldrNm() {
        return crdhldrNm;
    }

    /**
     * Sets the value of the crdhldrNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setCrdhldrNm(CardholderName3 value) {
        this.crdhldrNm = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the id property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Credentials2 }
     * 
     * 
     * @return
     *     The value of the id property.
     */
    public List<Credentials2> getId() {
        if (id == null) {
            id = new ArrayList<>();
        }
        return this.id;
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
     *     {@link Contact1 }
     *     
     */
    public Contact1 getCtctInf() {
        return ctctInf;
    }

    /**
     * Sets the value of the ctctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact1 }
     *     
     */
    public void setCtctInf(Contact1 value) {
        this.ctctInf = value;
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
     * Gets the value of the hghValCstmrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHghValCstmrInd() {
        return hghValCstmrInd;
    }

    /**
     * Sets the value of the hghValCstmrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHghValCstmrInd(Boolean value) {
        this.hghValCstmrInd = value;
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

    /**
     * Gets the value of the lclData property.
     * 
     * @return
     *     possible object is
     *     {@link LocalData7 }
     *     
     */
    public LocalData7 getLclData() {
        return lclData;
    }

    /**
     * Sets the value of the lclData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalData7 }
     *     
     */
    public void setLclData(LocalData7 value) {
        this.lclData = value;
    }

}
