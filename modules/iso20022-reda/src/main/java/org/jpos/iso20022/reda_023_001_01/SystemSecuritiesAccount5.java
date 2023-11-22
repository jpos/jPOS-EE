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

package org.jpos.iso20022.reda_023_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SystemSecuritiesAccount5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SystemSecuritiesAccount5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}ISODate" minOccurs="0"/>
 *         <element name="HldInd" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="NegPos" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="EndInvstrFlg" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *         <element name="PricgSchme" type="{urn:iso:std:iso:20022:tech:xsd:reda.023.001.01}Exact4AlphaNumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemSecuritiesAccount5", propOrder = {
    "clsgDt",
    "hldInd",
    "negPos",
    "endInvstrFlg",
    "pricgSchme"
})
public class SystemSecuritiesAccount5 {

    @XmlElement(name = "ClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar clsgDt;
    @XmlElement(name = "HldInd")
    protected Boolean hldInd;
    @XmlElement(name = "NegPos")
    protected Boolean negPos;
    @XmlElement(name = "EndInvstrFlg")
    protected String endInvstrFlg;
    @XmlElement(name = "PricgSchme")
    protected String pricgSchme;

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClsgDt(XMLGregorianCalendar value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the hldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHldInd() {
        return hldInd;
    }

    /**
     * Sets the value of the hldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHldInd(Boolean value) {
        this.hldInd = value;
    }

    /**
     * Gets the value of the negPos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNegPos() {
        return negPos;
    }

    /**
     * Sets the value of the negPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNegPos(Boolean value) {
        this.negPos = value;
    }

    /**
     * Gets the value of the endInvstrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndInvstrFlg() {
        return endInvstrFlg;
    }

    /**
     * Sets the value of the endInvstrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndInvstrFlg(String value) {
        this.endInvstrFlg = value;
    }

    /**
     * Gets the value of the pricgSchme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricgSchme() {
        return pricgSchme;
    }

    /**
     * Sets the value of the pricgSchme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricgSchme(String value) {
        this.pricgSchme = value;
    }

}
