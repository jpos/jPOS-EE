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

package org.jpos.iso20022.secl_009_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyIn2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyIn2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="BuyInNtfctnId" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}Max35Text" minOccurs="0"/>
 *         <element name="BuyInId" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}Max35Text"/>
 *         <element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}ISODate"/>
 *         <element name="Pric" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}Price4" minOccurs="0"/>
 *         <element name="SctiesBuyIn" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}SecuritiesCompensation1" minOccurs="0"/>
 *         <element name="ReqrdCshCompstn" type="{urn:iso:std:iso:20022:tech:xsd:secl.009.001.03}CashCompensation1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn2", propOrder = {
    "buyInNtfctnId",
    "buyInId",
    "dt",
    "pric",
    "sctiesBuyIn",
    "reqrdCshCompstn"
})
public class BuyIn2 {

    @XmlElement(name = "BuyInNtfctnId")
    protected String buyInNtfctnId;
    @XmlElement(name = "BuyInId", required = true)
    protected String buyInId;
    @XmlElement(name = "Dt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dt;
    @XmlElement(name = "Pric")
    protected Price4 pric;
    @XmlElement(name = "SctiesBuyIn")
    protected SecuritiesCompensation1 sctiesBuyIn;
    @XmlElement(name = "ReqrdCshCompstn")
    protected CashCompensation1 reqrdCshCompstn;

    /**
     * Gets the value of the buyInNtfctnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInNtfctnId() {
        return buyInNtfctnId;
    }

    /**
     * Sets the value of the buyInNtfctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyInNtfctnId(String value) {
        this.buyInNtfctnId = value;
    }

    /**
     * Gets the value of the buyInId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyInId() {
        return buyInId;
    }

    /**
     * Sets the value of the buyInId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyInId(String value) {
        this.buyInId = value;
    }

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDt(XMLGregorianCalendar value) {
        this.dt = value;
    }

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public void setPric(Price4 value) {
        this.pric = value;
    }

    /**
     * Gets the value of the sctiesBuyIn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesCompensation1 }
     *     
     */
    public SecuritiesCompensation1 getSctiesBuyIn() {
        return sctiesBuyIn;
    }

    /**
     * Sets the value of the sctiesBuyIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesCompensation1 }
     *     
     */
    public void setSctiesBuyIn(SecuritiesCompensation1 value) {
        this.sctiesBuyIn = value;
    }

    /**
     * Gets the value of the reqrdCshCompstn property.
     * 
     * @return
     *     possible object is
     *     {@link CashCompensation1 }
     *     
     */
    public CashCompensation1 getReqrdCshCompstn() {
        return reqrdCshCompstn;
    }

    /**
     * Sets the value of the reqrdCshCompstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashCompensation1 }
     *     
     */
    public void setReqrdCshCompstn(CashCompensation1 value) {
        this.reqrdCshCompstn = value;
    }

}
