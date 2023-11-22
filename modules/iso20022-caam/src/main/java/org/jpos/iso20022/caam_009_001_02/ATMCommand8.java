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

package org.jpos.iso20022.caam_009_001_02;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand8 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommand8">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMCommand5Code"/>
 *         <element name="ReqrdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ISODateTime" minOccurs="0"/>
 *         <element name="PrcdDtTm" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ISODateTime"/>
 *         <element name="CmdId" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}ATMCommandIdentification1" minOccurs="0"/>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}TerminalManagementActionResult2Code"/>
 *         <element name="AddtlErrInf" type="{urn:iso:std:iso:20022:tech:xsd:caam.009.001.02}Max140Text" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand8", propOrder = {
    "tp",
    "reqrdDtTm",
    "prcdDtTm",
    "cmdId",
    "rslt",
    "addtlErrInf"
})
public class ATMCommand8 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand5Code tp;
    @XmlElement(name = "ReqrdDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqrdDtTm;
    @XmlElement(name = "PrcdDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar prcdDtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "Rslt", required = true)
    @XmlSchemaType(name = "string")
    protected TerminalManagementActionResult2Code rslt;
    @XmlElement(name = "AddtlErrInf")
    protected String addtlErrInf;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand5Code }
     *     
     */
    public ATMCommand5Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand5Code }
     *     
     */
    public void setTp(ATMCommand5Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the reqrdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqrdDtTm() {
        return reqrdDtTm;
    }

    /**
     * Sets the value of the reqrdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqrdDtTm(XMLGregorianCalendar value) {
        this.reqrdDtTm = value;
    }

    /**
     * Gets the value of the prcdDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrcdDtTm() {
        return prcdDtTm;
    }

    /**
     * Sets the value of the prcdDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrcdDtTm(XMLGregorianCalendar value) {
        this.prcdDtTm = value;
    }

    /**
     * Gets the value of the cmdId property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public ATMCommandIdentification1 getCmdId() {
        return cmdId;
    }

    /**
     * Sets the value of the cmdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandIdentification1 }
     *     
     */
    public void setCmdId(ATMCommandIdentification1 value) {
        this.cmdId = value;
    }

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalManagementActionResult2Code }
     *     
     */
    public TerminalManagementActionResult2Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalManagementActionResult2Code }
     *     
     */
    public void setRslt(TerminalManagementActionResult2Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the addtlErrInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlErrInf() {
        return addtlErrInf;
    }

    /**
     * Sets the value of the addtlErrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddtlErrInf(String value) {
        this.addtlErrInf = value;
    }

}
