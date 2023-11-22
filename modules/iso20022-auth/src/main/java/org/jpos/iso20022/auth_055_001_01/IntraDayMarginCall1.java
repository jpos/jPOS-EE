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

package org.jpos.iso20022.auth_055_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntraDayMarginCall1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IntraDayMarginCall1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MrgnAcctId" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}GenericIdentification165"/>
 *         <element name="IntraDayCall" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ActiveCurrencyAndAmount"/>
 *         <element name="TmStmp" type="{urn:iso:std:iso:20022:tech:xsd:auth.055.001.01}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraDayMarginCall1", propOrder = {
    "mrgnAcctId",
    "intraDayCall",
    "tmStmp"
})
public class IntraDayMarginCall1 {

    @XmlElement(name = "MrgnAcctId", required = true)
    protected GenericIdentification165 mrgnAcctId;
    @XmlElement(name = "IntraDayCall", required = true)
    protected ActiveCurrencyAndAmount intraDayCall;
    @XmlElement(name = "TmStmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;

    /**
     * Gets the value of the mrgnAcctId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification165 }
     *     
     */
    public GenericIdentification165 getMrgnAcctId() {
        return mrgnAcctId;
    }

    /**
     * Sets the value of the mrgnAcctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification165 }
     *     
     */
    public void setMrgnAcctId(GenericIdentification165 value) {
        this.mrgnAcctId = value;
    }

    /**
     * Gets the value of the intraDayCall property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getIntraDayCall() {
        return intraDayCall;
    }

    /**
     * Sets the value of the intraDayCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setIntraDayCall(ActiveCurrencyAndAmount value) {
        this.intraDayCall = value;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTmStmp(XMLGregorianCalendar value) {
        this.tmStmp = value;
    }

}
