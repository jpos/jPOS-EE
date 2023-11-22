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

package org.jpos.iso20022.caad_008_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoyaltyMember2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="LoyaltyMember2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}CardholderName3" minOccurs="0"/>
 *         <element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Address2" minOccurs="0"/>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="MmbSts" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="XprtnDt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}ISODate" minOccurs="0"/>
 *         <element name="LltyVal" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumericText" minOccurs="0"/>
 *         <element name="LltyValTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}LoyaltyValueType1Code" minOccurs="0"/>
 *         <element name="OthrLltyValTp" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max35Text" minOccurs="0"/>
 *         <element name="ValToCdt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumericText" minOccurs="0"/>
 *         <element name="ValToDbt" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumericText" minOccurs="0"/>
 *         <element name="Bal" type="{urn:iso:std:iso:20022:tech:xsd:caad.008.001.01}Max10NumericText" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyMember2", propOrder = {
    "nm",
    "adr",
    "id",
    "mmbSts",
    "xprtnDt",
    "lltyVal",
    "lltyValTp",
    "othrLltyValTp",
    "valToCdt",
    "valToDbt",
    "bal"
})
public class LoyaltyMember2 {

    @XmlElement(name = "Nm")
    protected CardholderName3 nm;
    @XmlElement(name = "Adr")
    protected Address2 adr;
    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "MmbSts")
    protected String mmbSts;
    @XmlElement(name = "XprtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xprtnDt;
    @XmlElement(name = "LltyVal")
    protected String lltyVal;
    @XmlElement(name = "LltyValTp")
    @XmlSchemaType(name = "string")
    protected LoyaltyValueType1Code lltyValTp;
    @XmlElement(name = "OthrLltyValTp")
    protected String othrLltyValTp;
    @XmlElement(name = "ValToCdt")
    protected String valToCdt;
    @XmlElement(name = "ValToDbt")
    protected String valToDbt;
    @XmlElement(name = "Bal")
    protected String bal;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link CardholderName3 }
     *     
     */
    public CardholderName3 getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardholderName3 }
     *     
     */
    public void setNm(CardholderName3 value) {
        this.nm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link Address2 }
     *     
     */
    public Address2 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address2 }
     *     
     */
    public void setAdr(Address2 value) {
        this.adr = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the mmbSts property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMmbSts() {
        return mmbSts;
    }

    /**
     * Sets the value of the mmbSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMmbSts(String value) {
        this.mmbSts = value;
    }

    /**
     * Gets the value of the xprtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXprtnDt() {
        return xprtnDt;
    }

    /**
     * Sets the value of the xprtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXprtnDt(XMLGregorianCalendar value) {
        this.xprtnDt = value;
    }

    /**
     * Gets the value of the lltyVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLltyVal() {
        return lltyVal;
    }

    /**
     * Sets the value of the lltyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLltyVal(String value) {
        this.lltyVal = value;
    }

    /**
     * Gets the value of the lltyValTp property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public LoyaltyValueType1Code getLltyValTp() {
        return lltyValTp;
    }

    /**
     * Sets the value of the lltyValTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyValueType1Code }
     *     
     */
    public void setLltyValTp(LoyaltyValueType1Code value) {
        this.lltyValTp = value;
    }

    /**
     * Gets the value of the othrLltyValTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrLltyValTp() {
        return othrLltyValTp;
    }

    /**
     * Sets the value of the othrLltyValTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrLltyValTp(String value) {
        this.othrLltyValTp = value;
    }

    /**
     * Gets the value of the valToCdt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToCdt() {
        return valToCdt;
    }

    /**
     * Sets the value of the valToCdt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValToCdt(String value) {
        this.valToCdt = value;
    }

    /**
     * Gets the value of the valToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValToDbt() {
        return valToDbt;
    }

    /**
     * Sets the value of the valToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValToDbt(String value) {
        this.valToDbt = value;
    }

    /**
     * Gets the value of the bal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBal() {
        return bal;
    }

    /**
     * Sets the value of the bal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBal(String value) {
        this.bal = value;
    }

}
