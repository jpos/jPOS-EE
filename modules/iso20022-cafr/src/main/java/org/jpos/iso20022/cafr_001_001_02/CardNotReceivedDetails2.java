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

package org.jpos.iso20022.cafr_001_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardNotReceivedDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardNotReceivedDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DtOfCardMld" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISODate"/>
 *         <element name="MlngAdr" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Address2" minOccurs="0"/>
 *         <element name="MlngAdrUstrd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max256Text" minOccurs="0"/>
 *         <element name="MldFrPstlCd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}Max16Text"/>
 *         <element name="VldFr" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}ISODate" minOccurs="0"/>
 *         <element name="CardSctyCdInd" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CardSctyCpblty" type="{urn:iso:std:iso:20022:tech:xsd:cafr.001.001.02}CardSecurityCapability1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardNotReceivedDetails2", propOrder = {
    "dtOfCardMld",
    "mlngAdr",
    "mlngAdrUstrd",
    "mldFrPstlCd",
    "vldFr",
    "cardSctyCdInd",
    "cardSctyCpblty"
})
public class CardNotReceivedDetails2 {

    @XmlElement(name = "DtOfCardMld", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtOfCardMld;
    @XmlElement(name = "MlngAdr")
    protected Address2 mlngAdr;
    @XmlElement(name = "MlngAdrUstrd")
    protected String mlngAdrUstrd;
    @XmlElement(name = "MldFrPstlCd", required = true)
    protected String mldFrPstlCd;
    @XmlElement(name = "VldFr")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vldFr;
    @XmlElement(name = "CardSctyCdInd")
    protected Boolean cardSctyCdInd;
    @XmlElement(name = "CardSctyCpblty")
    protected List<CardSecurityCapability1> cardSctyCpblty;

    /**
     * Gets the value of the dtOfCardMld property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtOfCardMld() {
        return dtOfCardMld;
    }

    /**
     * Sets the value of the dtOfCardMld property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtOfCardMld(XMLGregorianCalendar value) {
        this.dtOfCardMld = value;
    }

    /**
     * Gets the value of the mlngAdr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getMlngAdr() {
        return mlngAdr;
    }

    /**
     * Sets the value of the mlngAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setMlngAdr(Address2 value) {
        this.mlngAdr = value;
    }

    /**
     * Gets the value of the mlngAdrUstrd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMlngAdrUstrd() {
        return mlngAdrUstrd;
    }

    /**
     * Sets the value of the mlngAdrUstrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMlngAdrUstrd(String value) {
        this.mlngAdrUstrd = value;
    }

    /**
     * Gets the value of the mldFrPstlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMldFrPstlCd() {
        return mldFrPstlCd;
    }

    /**
     * Sets the value of the mldFrPstlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMldFrPstlCd(String value) {
        this.mldFrPstlCd = value;
    }

    /**
     * Gets the value of the vldFr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVldFr() {
        return vldFr;
    }

    /**
     * Sets the value of the vldFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVldFr(XMLGregorianCalendar value) {
        this.vldFr = value;
    }

    /**
     * Gets the value of the cardSctyCdInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCardSctyCdInd() {
        return cardSctyCdInd;
    }

    /**
     * Sets the value of the cardSctyCdInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCardSctyCdInd(Boolean value) {
        this.cardSctyCdInd = value;
    }

    /**
     * Gets the value of the cardSctyCpblty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cardSctyCpblty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardSctyCpblty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardSecurityCapability1 }
     * 
     * 
     * @return
     *     The value of the cardSctyCpblty property.
     */
    public List<CardSecurityCapability1> getCardSctyCpblty() {
        if (cardSctyCpblty == null) {
            cardSctyCpblty = new ArrayList<>();
        }
        return this.cardSctyCpblty;
    }

}
