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

package org.jpos.iso20022.acmt_020_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountContract4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AccountContract4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TrgtClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:acmt.020.001.03}ISODate" minOccurs="0"/>
 *         <element name="UrgcyFlg" type="{urn:iso:std:iso:20022:tech:xsd:acmt.020.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="RmvlInd" type="{urn:iso:std:iso:20022:tech:xsd:acmt.020.001.03}YesNoIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountContract4", propOrder = {
    "trgtClsgDt",
    "urgcyFlg",
    "rmvlInd"
})
public class AccountContract4 {

    @XmlElement(name = "TrgtClsgDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trgtClsgDt;
    @XmlElement(name = "UrgcyFlg")
    protected Boolean urgcyFlg;
    @XmlElement(name = "RmvlInd")
    protected Boolean rmvlInd;

    /**
     * Gets the value of the trgtClsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrgtClsgDt() {
        return trgtClsgDt;
    }

    /**
     * Sets the value of the trgtClsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrgtClsgDt(XMLGregorianCalendar value) {
        this.trgtClsgDt = value;
    }

    /**
     * Gets the value of the urgcyFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUrgcyFlg() {
        return urgcyFlg;
    }

    /**
     * Sets the value of the urgcyFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUrgcyFlg(Boolean value) {
        this.urgcyFlg = value;
    }

    /**
     * Gets the value of the rmvlInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRmvlInd() {
        return rmvlInd;
    }

    /**
     * Sets the value of the rmvlInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRmvlInd(Boolean value) {
        this.rmvlInd = value;
    }

}
