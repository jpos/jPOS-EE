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

package org.jpos.iso20022.caaa_011_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardPaymentDataSetTransaction11Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CardPaymentDataSetTransaction11Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Cmpltn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentDataSetTransaction42"/>
 *         <element name="Cxl" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentDataSetTransaction43"/>
 *         <element name="AuthstnReq" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentDataSetTransaction44"/>
 *         <element name="AuthstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}CardPaymentDataSetTransaction45"/>
 *         <element name="TknReq" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TokenRequestComponent3"/>
 *         <element name="TknRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.011.001.12}TokenRequestComponent3"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentDataSetTransaction11Choice", propOrder = {
    "cmpltn",
    "cxl",
    "authstnReq",
    "authstnRspn",
    "tknReq",
    "tknRspn"
})
public class CardPaymentDataSetTransaction11Choice {

    @XmlElement(name = "Cmpltn")
    protected CardPaymentDataSetTransaction42 cmpltn;
    @XmlElement(name = "Cxl")
    protected CardPaymentDataSetTransaction43 cxl;
    @XmlElement(name = "AuthstnReq")
    protected CardPaymentDataSetTransaction44 authstnReq;
    @XmlElement(name = "AuthstnRspn")
    protected CardPaymentDataSetTransaction45 authstnRspn;
    @XmlElement(name = "TknReq")
    protected TokenRequestComponent3 tknReq;
    @XmlElement(name = "TknRspn")
    protected TokenRequestComponent3 tknRspn;

    /**
     * Gets the value of the cmpltn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction42 }
     *     
     */
    public CardPaymentDataSetTransaction42 getCmpltn() {
        return cmpltn;
    }

    /**
     * Sets the value of the cmpltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction42 }
     *     
     */
    public void setCmpltn(CardPaymentDataSetTransaction42 value) {
        this.cmpltn = value;
    }

    /**
     * Gets the value of the cxl property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction43 }
     *     
     */
    public CardPaymentDataSetTransaction43 getCxl() {
        return cxl;
    }

    /**
     * Sets the value of the cxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction43 }
     *     
     */
    public void setCxl(CardPaymentDataSetTransaction43 value) {
        this.cxl = value;
    }

    /**
     * Gets the value of the authstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction44 }
     *     
     */
    public CardPaymentDataSetTransaction44 getAuthstnReq() {
        return authstnReq;
    }

    /**
     * Sets the value of the authstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction44 }
     *     
     */
    public void setAuthstnReq(CardPaymentDataSetTransaction44 value) {
        this.authstnReq = value;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentDataSetTransaction45 }
     *     
     */
    public CardPaymentDataSetTransaction45 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentDataSetTransaction45 }
     *     
     */
    public void setAuthstnRspn(CardPaymentDataSetTransaction45 value) {
        this.authstnRspn = value;
    }

    /**
     * Gets the value of the tknReq property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public TokenRequestComponent3 getTknReq() {
        return tknReq;
    }

    /**
     * Sets the value of the tknReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public void setTknReq(TokenRequestComponent3 value) {
        this.tknReq = value;
    }

    /**
     * Gets the value of the tknRspn property.
     * 
     * @return
     *     possible object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public TokenRequestComponent3 getTknRspn() {
        return tknRspn;
    }

    /**
     * Sets the value of the tknRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenRequestComponent3 }
     *     
     */
    public void setTknRspn(TokenRequestComponent3 value) {
        this.tknRspn = value;
    }

}
