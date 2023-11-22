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

package org.jpos.iso20022.camt_007_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentOrigin1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PaymentOrigin1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="FINMT" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}Max3NumericText"/>
 *         <element name="XMLMsgNm" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}Max35Text"/>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}Max35Text"/>
 *         <element name="Instrm" type="{urn:iso:std:iso:20022:tech:xsd:camt.007.001.09}PaymentInstrument1Code"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOrigin1Choice", propOrder = {
    "finmt",
    "xmlMsgNm",
    "prtry",
    "instrm"
})
public class PaymentOrigin1Choice {

    @XmlElement(name = "FINMT")
    protected String finmt;
    @XmlElement(name = "XMLMsgNm")
    protected String xmlMsgNm;
    @XmlElement(name = "Prtry")
    protected String prtry;
    @XmlElement(name = "Instrm")
    @XmlSchemaType(name = "string")
    protected PaymentInstrument1Code instrm;

    /**
     * Gets the value of the finmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINMT() {
        return finmt;
    }

    /**
     * Sets the value of the finmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINMT(String value) {
        this.finmt = value;
    }

    /**
     * Gets the value of the xmlMsgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLMsgNm() {
        return xmlMsgNm;
    }

    /**
     * Sets the value of the xmlMsgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLMsgNm(String value) {
        this.xmlMsgNm = value;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtry(String value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument1Code }
     *     
     */
    public PaymentInstrument1Code getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument1Code }
     *     
     */
    public void setInstrm(PaymentInstrument1Code value) {
        this.instrm = value;
    }

}
