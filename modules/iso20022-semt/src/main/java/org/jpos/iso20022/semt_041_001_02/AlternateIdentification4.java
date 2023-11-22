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

package org.jpos.iso20022.semt_041_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlternateIdentification4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AlternateIdentification4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Max35Text"/>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}OtherIdentification4Choice"/>
 *         <element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}Max35Text" minOccurs="0"/>
 *         <element name="IsseDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}ISODate" minOccurs="0"/>
 *         <element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}ISODate" minOccurs="0"/>
 *         <element name="IssrCtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.041.001.02}CountryCode" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlternateIdentification4", propOrder = {
    "id",
    "tp",
    "issr",
    "isseDt",
    "xpryDt",
    "issrCtry"
})
public class AlternateIdentification4 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "Tp", required = true)
    protected OtherIdentification4Choice tp;
    @XmlElement(name = "Issr")
    protected String issr;
    @XmlElement(name = "IsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar isseDt;
    @XmlElement(name = "XpryDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "IssrCtry")
    protected String issrCtry;

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
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdentification4Choice }
     *     
     */
    public OtherIdentification4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdentification4Choice }
     *     
     */
    public void setTp(OtherIdentification4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssr(String value) {
        this.issr = value;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIsseDt(XMLGregorianCalendar value) {
        this.isseDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the issrCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssrCtry() {
        return issrCtry;
    }

    /**
     * Sets the value of the issrCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssrCtry(String value) {
        this.issrCtry = value;
    }

}
