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

package org.jpos.iso20022.auth_017_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradingVenueAttributes1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TradingVenueAttributes1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}MICIdentifier"/>
 *         <element name="IssrReq" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}TrueFalseIndicator"/>
 *         <element name="AdmssnApprvlDtByIssr" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="ReqForAdmssnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="FrstTradDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="TermntnDt" type="{urn:iso:std:iso:20022:tech:xsd:auth.017.001.02}ISODateTime" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradingVenueAttributes1", propOrder = {
    "id",
    "issrReq",
    "admssnApprvlDtByIssr",
    "reqForAdmssnDt",
    "frstTradDt",
    "termntnDt"
})
public class TradingVenueAttributes1 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "IssrReq")
    protected boolean issrReq;
    @XmlElement(name = "AdmssnApprvlDtByIssr")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar admssnApprvlDtByIssr;
    @XmlElement(name = "ReqForAdmssnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqForAdmssnDt;
    @XmlElement(name = "FrstTradDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar frstTradDt;
    @XmlElement(name = "TermntnDt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar termntnDt;

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
     * Gets the value of the issrReq property.
     * 
     */
    public boolean isIssrReq() {
        return issrReq;
    }

    /**
     * Sets the value of the issrReq property.
     * 
     */
    public void setIssrReq(boolean value) {
        this.issrReq = value;
    }

    /**
     * Gets the value of the admssnApprvlDtByIssr property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAdmssnApprvlDtByIssr() {
        return admssnApprvlDtByIssr;
    }

    /**
     * Sets the value of the admssnApprvlDtByIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAdmssnApprvlDtByIssr(XMLGregorianCalendar value) {
        this.admssnApprvlDtByIssr = value;
    }

    /**
     * Gets the value of the reqForAdmssnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqForAdmssnDt() {
        return reqForAdmssnDt;
    }

    /**
     * Sets the value of the reqForAdmssnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqForAdmssnDt(XMLGregorianCalendar value) {
        this.reqForAdmssnDt = value;
    }

    /**
     * Gets the value of the frstTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFrstTradDt() {
        return frstTradDt;
    }

    /**
     * Sets the value of the frstTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFrstTradDt(XMLGregorianCalendar value) {
        this.frstTradDt = value;
    }

    /**
     * Gets the value of the termntnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTermntnDt() {
        return termntnDt;
    }

    /**
     * Sets the value of the termntnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTermntnDt(XMLGregorianCalendar value) {
        this.termntnDt = value;
    }

}
