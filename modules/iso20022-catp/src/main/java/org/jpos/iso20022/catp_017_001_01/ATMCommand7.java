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

package org.jpos.iso20022.catp_017_001_01;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ATMCommand7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ATMCommand7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCommand4Code"/>
 *         <element name="Urgcy" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}TMSContactLevel2Code"/>
 *         <element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ISODateTime" minOccurs="0"/>
 *         <element name="CmdId" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCommandIdentification1" minOccurs="0"/>
 *         <element name="CmdParams" type="{urn:iso:std:iso:20022:tech:xsd:catp.017.001.01}ATMCommandParameters1Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMCommand7", propOrder = {
    "tp",
    "urgcy",
    "dtTm",
    "cmdId",
    "cmdParams"
})
public class ATMCommand7 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected ATMCommand4Code tp;
    @XmlElement(name = "Urgcy", required = true)
    @XmlSchemaType(name = "string")
    protected TMSContactLevel2Code urgcy;
    @XmlElement(name = "DtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtTm;
    @XmlElement(name = "CmdId")
    protected ATMCommandIdentification1 cmdId;
    @XmlElement(name = "CmdParams")
    protected ATMCommandParameters1Choice cmdParams;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommand4Code }
     *     
     */
    public ATMCommand4Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommand4Code }
     *     
     */
    public void setTp(ATMCommand4Code value) {
        this.tp = value;
    }

    /**
     * Gets the value of the urgcy property.
     * 
     * @return
     *     possible object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public TMSContactLevel2Code getUrgcy() {
        return urgcy;
    }

    /**
     * Sets the value of the urgcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMSContactLevel2Code }
     *     
     */
    public void setUrgcy(TMSContactLevel2Code value) {
        this.urgcy = value;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtTm(XMLGregorianCalendar value) {
        this.dtTm = value;
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
     * Gets the value of the cmdParams property.
     * 
     * @return
     *     possible object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public ATMCommandParameters1Choice getCmdParams() {
        return cmdParams;
    }

    /**
     * Sets the value of the cmdParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMCommandParameters1Choice }
     *     
     */
    public void setCmdParams(ATMCommandParameters1Choice value) {
        this.cmdParams = value;
    }

}
