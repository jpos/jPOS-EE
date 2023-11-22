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

package org.jpos.iso20022.catp_007_001_02;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Header31 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Header31">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgFctn" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ATMMessageFunction2"/>
 *         <element name="PrtcolVrsn" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max6Text"/>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max3NumericText"/>
 *         <element name="CreDtTm" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}ISODateTime"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text"/>
 *         <element name="RcptPty" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="PrcStat" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Max35Text" minOccurs="0"/>
 *         <element name="Tracblt" type="{urn:iso:std:iso:20022:tech:xsd:catp.007.001.02}Traceability4" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Header31", propOrder = {
    "msgFctn",
    "prtcolVrsn",
    "xchgId",
    "creDtTm",
    "initgPty",
    "rcptPty",
    "prcStat",
    "tracblt"
})
public class Header31 {

    @XmlElement(name = "MsgFctn", required = true)
    protected ATMMessageFunction2 msgFctn;
    @XmlElement(name = "PrtcolVrsn", required = true)
    protected String prtcolVrsn;
    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "CreDtTm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creDtTm;
    @XmlElement(name = "InitgPty", required = true)
    protected String initgPty;
    @XmlElement(name = "RcptPty")
    protected String rcptPty;
    @XmlElement(name = "PrcStat")
    protected String prcStat;
    @XmlElement(name = "Tracblt")
    protected List<Traceability4> tracblt;

    /**
     * Gets the value of the msgFctn property.
     * 
     * @return
     *     possible object is
     *     {@link ATMMessageFunction2 }
     *     
     */
    public ATMMessageFunction2 getMsgFctn() {
        return msgFctn;
    }

    /**
     * Sets the value of the msgFctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATMMessageFunction2 }
     *     
     */
    public void setMsgFctn(ATMMessageFunction2 value) {
        this.msgFctn = value;
    }

    /**
     * Gets the value of the prtcolVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtcolVrsn() {
        return prtcolVrsn;
    }

    /**
     * Sets the value of the prtcolVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrtcolVrsn(String value) {
        this.prtcolVrsn = value;
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

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitgPty(String value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the rcptPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcptPty() {
        return rcptPty;
    }

    /**
     * Sets the value of the rcptPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcptPty(String value) {
        this.rcptPty = value;
    }

    /**
     * Gets the value of the prcStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcStat() {
        return prcStat;
    }

    /**
     * Sets the value of the prcStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcStat(String value) {
        this.prcStat = value;
    }

    /**
     * Gets the value of the tracblt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the tracblt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracblt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Traceability4 }
     * 
     * 
     * @return
     *     The value of the tracblt property.
     */
    public List<Traceability4> getTracblt() {
        if (tracblt == null) {
            tracblt = new ArrayList<>();
        }
        return this.tracblt;
    }

}
