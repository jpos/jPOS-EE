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

package org.jpos.iso20022.cain_001_001_03;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Ticket2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Ticket2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TcktNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="TcktIssr" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}PartyIdentification258" minOccurs="0"/>
 *         <element name="TcktIsseDt" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ISODate" minOccurs="0"/>
 *         <element name="TcktIsseLctn" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max140Text" minOccurs="0"/>
 *         <element name="CnjnctnTcktNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RstrctdTcktInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="OpnTcktInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="Rstrctns" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max70Text" minOccurs="0"/>
 *         <element name="XchgdTcktInd" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="XchgdTcktNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="RcrdLctrNb" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}Max35Text" minOccurs="0"/>
 *         <element name="Rsvatn" type="{urn:iso:std:iso:20022:tech:xsd:cain.001.001.03}ReservationDetails3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ticket2", propOrder = {
    "tcktNb",
    "tcktIssr",
    "tcktIsseDt",
    "tcktIsseLctn",
    "cnjnctnTcktNb",
    "rstrctdTcktInd",
    "opnTcktInd",
    "rstrctns",
    "xchgdTcktInd",
    "xchgdTcktNb",
    "rcrdLctrNb",
    "rsvatn"
})
public class Ticket2 {

    @XmlElement(name = "TcktNb")
    protected String tcktNb;
    @XmlElement(name = "TcktIssr")
    protected PartyIdentification258 tcktIssr;
    @XmlElement(name = "TcktIsseDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tcktIsseDt;
    @XmlElement(name = "TcktIsseLctn")
    protected String tcktIsseLctn;
    @XmlElement(name = "CnjnctnTcktNb")
    protected String cnjnctnTcktNb;
    @XmlElement(name = "RstrctdTcktInd")
    protected Boolean rstrctdTcktInd;
    @XmlElement(name = "OpnTcktInd")
    protected Boolean opnTcktInd;
    @XmlElement(name = "Rstrctns")
    protected String rstrctns;
    @XmlElement(name = "XchgdTcktInd")
    protected Boolean xchgdTcktInd;
    @XmlElement(name = "XchgdTcktNb")
    protected String xchgdTcktNb;
    @XmlElement(name = "RcrdLctrNb")
    protected String rcrdLctrNb;
    @XmlElement(name = "Rsvatn")
    protected ReservationDetails3 rsvatn;

    /**
     * Gets the value of the tcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktNb() {
        return tcktNb;
    }

    /**
     * Sets the value of the tcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcktNb(String value) {
        this.tcktNb = value;
    }

    /**
     * Gets the value of the tcktIssr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification258 }
     *     
     */
    public PartyIdentification258 getTcktIssr() {
        return tcktIssr;
    }

    /**
     * Sets the value of the tcktIssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification258 }
     *     
     */
    public void setTcktIssr(PartyIdentification258 value) {
        this.tcktIssr = value;
    }

    /**
     * Gets the value of the tcktIsseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTcktIsseDt() {
        return tcktIsseDt;
    }

    /**
     * Sets the value of the tcktIsseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTcktIsseDt(XMLGregorianCalendar value) {
        this.tcktIsseDt = value;
    }

    /**
     * Gets the value of the tcktIsseLctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcktIsseLctn() {
        return tcktIsseLctn;
    }

    /**
     * Sets the value of the tcktIsseLctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcktIsseLctn(String value) {
        this.tcktIsseLctn = value;
    }

    /**
     * Gets the value of the cnjnctnTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnjnctnTcktNb() {
        return cnjnctnTcktNb;
    }

    /**
     * Sets the value of the cnjnctnTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnjnctnTcktNb(String value) {
        this.cnjnctnTcktNb = value;
    }

    /**
     * Gets the value of the rstrctdTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRstrctdTcktInd() {
        return rstrctdTcktInd;
    }

    /**
     * Sets the value of the rstrctdTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRstrctdTcktInd(Boolean value) {
        this.rstrctdTcktInd = value;
    }

    /**
     * Gets the value of the opnTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnTcktInd() {
        return opnTcktInd;
    }

    /**
     * Sets the value of the opnTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOpnTcktInd(Boolean value) {
        this.opnTcktInd = value;
    }

    /**
     * Gets the value of the rstrctns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRstrctns() {
        return rstrctns;
    }

    /**
     * Sets the value of the rstrctns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRstrctns(String value) {
        this.rstrctns = value;
    }

    /**
     * Gets the value of the xchgdTcktInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXchgdTcktInd() {
        return xchgdTcktInd;
    }

    /**
     * Sets the value of the xchgdTcktInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXchgdTcktInd(Boolean value) {
        this.xchgdTcktInd = value;
    }

    /**
     * Gets the value of the xchgdTcktNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgdTcktNb() {
        return xchgdTcktNb;
    }

    /**
     * Sets the value of the xchgdTcktNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgdTcktNb(String value) {
        this.xchgdTcktNb = value;
    }

    /**
     * Gets the value of the rcrdLctrNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRcrdLctrNb() {
        return rcrdLctrNb;
    }

    /**
     * Sets the value of the rcrdLctrNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRcrdLctrNb(String value) {
        this.rcrdLctrNb = value;
    }

    /**
     * Gets the value of the rsvatn property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationDetails3 }
     *     
     */
    public ReservationDetails3 getRsvatn() {
        return rsvatn;
    }

    /**
     * Sets the value of the rsvatn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationDetails3 }
     *     
     */
    public void setRsvatn(ReservationDetails3 value) {
        this.rsvatn = value;
    }

}
