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

package org.jpos.iso20022.auth_020_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractCessionData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ContractCessionData1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}TradeParty5"/>
 *         <element name="DocNb" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}Max35Text" minOccurs="0"/>
 *         <element name="DocDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.020.001.03}ISODate" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractCessionData1", propOrder = {
    "pty",
    "docNb",
    "docDt"
})
public class ContractCessionData1 {

    @XmlElement(name = "Pty", required = true)
    protected TradeParty5 pty;
    @XmlElement(name = "DocNb")
    protected String docNb;
    @XmlElement(name = "DocDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docDt;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeParty5 }
     *     
     */
    public TradeParty5 getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeParty5 }
     *     
     */
    public void setPty(TradeParty5 value) {
        this.pty = value;
    }

    /**
     * Gets the value of the docNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNb() {
        return docNb;
    }

    /**
     * Sets the value of the docNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNb(String value) {
        this.docNb = value;
    }

    /**
     * Gets the value of the docDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocDt() {
        return docDt;
    }

    /**
     * Sets the value of the docDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocDt(XMLGregorianCalendar value) {
        this.docDt = value;
    }

}
