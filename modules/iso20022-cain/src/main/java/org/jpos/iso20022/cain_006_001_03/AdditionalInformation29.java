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

package org.jpos.iso20022.cain_006_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalInformation29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AdditionalInformation29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rcpt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}PartyType22Code" minOccurs="0"/>
 *         <element name="OthrRcpt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Trgt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}UserInterface6Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OthrTrgt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}OutputFormat4Code" minOccurs="0"/>
 *         <element name="OthrFrmt" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Lang" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}ISOMax3ALanguageCode"/>
 *         <element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:cain.006.001.03}Max20KText"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation29", propOrder = {
    "rcpt",
    "othrRcpt",
    "trgt",
    "othrTrgt",
    "frmt",
    "othrFrmt",
    "tp",
    "lang",
    "val"
})
public class AdditionalInformation29 {

    @XmlElement(name = "Rcpt")
    @XmlSchemaType(name = "string")
    protected PartyType22Code rcpt;
    @XmlElement(name = "OthrRcpt")
    protected String othrRcpt;
    @XmlElement(name = "Trgt")
    @XmlSchemaType(name = "string")
    protected List<UserInterface6Code> trgt;
    @XmlElement(name = "OthrTrgt")
    protected String othrTrgt;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat4Code frmt;
    @XmlElement(name = "OthrFrmt")
    protected String othrFrmt;
    @XmlElement(name = "Tp")
    protected String tp;
    @XmlElement(name = "Lang", required = true)
    protected String lang;
    @XmlElement(name = "Val", required = true)
    protected String val;

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType22Code }
     *     
     */
    public PartyType22Code getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType22Code }
     *     
     */
    public void setRcpt(PartyType22Code value) {
        this.rcpt = value;
    }

    /**
     * Gets the value of the othrRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRcpt() {
        return othrRcpt;
    }

    /**
     * Sets the value of the othrRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRcpt(String value) {
        this.othrRcpt = value;
    }

    /**
     * Gets the value of the trgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the trgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterface6Code }
     * 
     * 
     * @return
     *     The value of the trgt property.
     */
    public List<UserInterface6Code> getTrgt() {
        if (trgt == null) {
            trgt = new ArrayList<>();
        }
        return this.trgt;
    }

    /**
     * Gets the value of the othrTrgt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTrgt() {
        return othrTrgt;
    }

    /**
     * Sets the value of the othrTrgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrTrgt(String value) {
        this.othrTrgt = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat4Code }
     *     
     */
    public OutputFormat4Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat4Code }
     *     
     */
    public void setFrmt(OutputFormat4Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the othrFrmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrFrmt() {
        return othrFrmt;
    }

    /**
     * Sets the value of the othrFrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrFrmt(String value) {
        this.othrFrmt = value;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVal(String value) {
        this.val = value;
    }

}
