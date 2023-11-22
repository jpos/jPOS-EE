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

package org.jpos.iso20022.camt_036_001_05;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebitAuthorisationConfirmation2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DebitAuthorisationConfirmation2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DbtAuthstn" type="{urn:iso:std:iso:20022:tech:xsd:camt.036.001.05}YesNoIndicator"/>
 *         <element name="AmtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.036.001.05}ActiveCurrencyAndAmount" minOccurs="0"/>
 *         <element name="ValDtToDbt" type="{urn:iso:std:iso:20022:tech:xsd:camt.036.001.05}ISODate" minOccurs="0"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:camt.036.001.05}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationConfirmation2", propOrder = {
    "dbtAuthstn",
    "amtToDbt",
    "valDtToDbt",
    "rsn"
})
public class DebitAuthorisationConfirmation2 {

    @XmlElement(name = "DbtAuthstn")
    protected boolean dbtAuthstn;
    @XmlElement(name = "AmtToDbt")
    protected ActiveCurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valDtToDbt;
    @XmlElement(name = "Rsn")
    protected String rsn;

    /**
     * Gets the value of the dbtAuthstn property.
     * 
     */
    public boolean isDbtAuthstn() {
        return dbtAuthstn;
    }

    /**
     * Sets the value of the dbtAuthstn property.
     * 
     */
    public void setDbtAuthstn(boolean value) {
        this.dbtAuthstn = value;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public void setAmtToDbt(ActiveCurrencyAndAmount value) {
        this.amtToDbt = value;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValDtToDbt(XMLGregorianCalendar value) {
        this.valDtToDbt = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsn(String value) {
        this.rsn = value;
    }

}
