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

package org.jpos.iso20022.secl_007_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BuyIn4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="BuyIn4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="WrngInd" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="XpctdBuyInDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}DateFormat15Choice"/>
 *         <element name="CxlLmtDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}ISODate" minOccurs="0"/>
 *         <element name="BuyInRvrsnDt" type="{urn:iso:std:iso:20022:tech:xsd:secl.007.001.03}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyIn4", propOrder = {
    "wrngInd",
    "xpctdBuyInDt",
    "cxlLmtDt",
    "buyInRvrsnDt"
})
public class BuyIn4 {

    @XmlElement(name = "WrngInd")
    protected Boolean wrngInd;
    @XmlElement(name = "XpctdBuyInDt", required = true)
    protected DateFormat15Choice xpctdBuyInDt;
    @XmlElement(name = "CxlLmtDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cxlLmtDt;
    @XmlElement(name = "BuyInRvrsnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buyInRvrsnDt;

    /**
     * Gets the value of the wrngInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWrngInd() {
        return wrngInd;
    }

    /**
     * Sets the value of the wrngInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWrngInd(Boolean value) {
        this.wrngInd = value;
    }

    /**
     * Gets the value of the xpctdBuyInDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat15Choice }
     *     
     */
    public DateFormat15Choice getXpctdBuyInDt() {
        return xpctdBuyInDt;
    }

    /**
     * Sets the value of the xpctdBuyInDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat15Choice }
     *     
     */
    public void setXpctdBuyInDt(DateFormat15Choice value) {
        this.xpctdBuyInDt = value;
    }

    /**
     * Gets the value of the cxlLmtDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCxlLmtDt() {
        return cxlLmtDt;
    }

    /**
     * Sets the value of the cxlLmtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCxlLmtDt(XMLGregorianCalendar value) {
        this.cxlLmtDt = value;
    }

    /**
     * Gets the value of the buyInRvrsnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyInRvrsnDt() {
        return buyInRvrsnDt;
    }

    /**
     * Sets the value of the buyInRvrsnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyInRvrsnDt(XMLGregorianCalendar value) {
        this.buyInRvrsnDt = value;
    }

}
