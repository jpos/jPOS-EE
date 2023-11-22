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

package org.jpos.iso20022.fxtr_036_001_01;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header23 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Header23">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="FrmtVrsn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}Max6Text"/>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}Max3NumericText"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}GenericIdentification32"/>
 *         <element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}GenericIdentification32" minOccurs="0"/>
 *         <element name="MsgSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}Number"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}ISODateTime"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header23", propOrder = {
    "frmtVrsn",
    "xchgId",
    "initgPty",
    "rcptPty",
    "msgSeqNb",
    "creDtTm"
})
public class Header23 {

    @XmlElement(name = "FrmtVrsn", required = true)
    protected String frmtVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification32 initgPty;
    @XmlElement(name = "RcptPty")
    protected GenericIdentification32 rcptPty;
    @XmlElement(name = "MsgSeqNb", required = true)
    protected BigDecimal msgSeqNb;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;

    /**
     * Gets the value of the frmtVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrmtVrsn() {
        return frmtVrsn;
    }

    /**
     * Sets the value of the frmtVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrmtVrsn(String value) {
        this.frmtVrsn = value;
    }

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public void setInitgPty(GenericIdentification32 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification32 }
     *     
     */
    public GenericIdentification32 getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification32 }
     *     
     */
    public void setRcptPty(GenericIdentification32 value) {
        this.rcptPty = value;
    }

    /**
     * Gets the value of the msgSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMsgSeqNb() {
        return msgSeqNb;
    }

    /**
     * Sets the value of the msgSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMsgSeqNb(BigDecimal value) {
        this.msgSeqNb = value;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreDtTm(XMLGregorianCalendar value) {
        this.creDtTm = value;
    }

}
