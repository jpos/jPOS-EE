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

package org.jpos.iso20022.caaa_022_001_02;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionMessage9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ActionMessage9">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgDstn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}UserInterface4Code"/>
 *         <element name="InfQlfr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}InformationQualify1Code" minOccurs="0"/>
 *         <element name="Frmt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}OutputFormat3Code" minOccurs="0"/>
 *         <element name="MsgCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Max20000Text" minOccurs="0"/>
 *         <element name="MsgCnttSgntr" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}ContentInformationType29" minOccurs="0"/>
 *         <element name="OutptBrcd" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}OutputBarcode1" minOccurs="0"/>
 *         <element name="RspnReqrdFlg" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="MinDispTm" type="{urn:iso:std:iso:20022:tech:xsd:caaa.022.001.02}Number" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionMessage9", propOrder = {
    "msgDstn",
    "infQlfr",
    "frmt",
    "msgCntt",
    "msgCnttSgntr",
    "outptBrcd",
    "rspnReqrdFlg",
    "minDispTm"
})
public class ActionMessage9 {

    @XmlElement(name = "MsgDstn", required = true)
    @XmlSchemaType(name = "string")
    protected UserInterface4Code msgDstn;
    @XmlElement(name = "InfQlfr")
    @XmlSchemaType(name = "string")
    protected InformationQualify1Code infQlfr;
    @XmlElement(name = "Frmt")
    @XmlSchemaType(name = "string")
    protected OutputFormat3Code frmt;
    @XmlElement(name = "MsgCntt")
    protected String msgCntt;
    @XmlElement(name = "MsgCnttSgntr")
    protected ContentInformationType29 msgCnttSgntr;
    @XmlElement(name = "OutptBrcd")
    protected OutputBarcode1 outptBrcd;
    @XmlElement(name = "RspnReqrdFlg")
    protected Boolean rspnReqrdFlg;
    @XmlElement(name = "MinDispTm")
    protected BigDecimal minDispTm;

    /**
     * Gets the value of the msgDstn property.
     * 
     * @return
     *     possible object is
     *     {@link UserInterface4Code }
     *     
     */
    public UserInterface4Code getMsgDstn() {
        return msgDstn;
    }

    /**
     * Sets the value of the msgDstn property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserInterface4Code }
     *     
     */
    public void setMsgDstn(UserInterface4Code value) {
        this.msgDstn = value;
    }

    /**
     * Gets the value of the infQlfr property.
     * 
     * @return
     *     possible object is
     *     {@link InformationQualify1Code }
     *     
     */
    public InformationQualify1Code getInfQlfr() {
        return infQlfr;
    }

    /**
     * Sets the value of the infQlfr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationQualify1Code }
     *     
     */
    public void setInfQlfr(InformationQualify1Code value) {
        this.infQlfr = value;
    }

    /**
     * Gets the value of the frmt property.
     * 
     * @return
     *     possible object is
     *     {@link OutputFormat3Code }
     *     
     */
    public OutputFormat3Code getFrmt() {
        return frmt;
    }

    /**
     * Sets the value of the frmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputFormat3Code }
     *     
     */
    public void setFrmt(OutputFormat3Code value) {
        this.frmt = value;
    }

    /**
     * Gets the value of the msgCntt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCntt() {
        return msgCntt;
    }

    /**
     * Sets the value of the msgCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCntt(String value) {
        this.msgCntt = value;
    }

    /**
     * Gets the value of the msgCnttSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType29 }
     *     
     */
    public ContentInformationType29 getMsgCnttSgntr() {
        return msgCnttSgntr;
    }

    /**
     * Sets the value of the msgCnttSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType29 }
     *     
     */
    public void setMsgCnttSgntr(ContentInformationType29 value) {
        this.msgCnttSgntr = value;
    }

    /**
     * Gets the value of the outptBrcd property.
     * 
     * @return
     *     possible object is
     *     {@link OutputBarcode1 }
     *     
     */
    public OutputBarcode1 getOutptBrcd() {
        return outptBrcd;
    }

    /**
     * Sets the value of the outptBrcd property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputBarcode1 }
     *     
     */
    public void setOutptBrcd(OutputBarcode1 value) {
        this.outptBrcd = value;
    }

    /**
     * Gets the value of the rspnReqrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRspnReqrdFlg() {
        return rspnReqrdFlg;
    }

    /**
     * Sets the value of the rspnReqrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRspnReqrdFlg(Boolean value) {
        this.rspnReqrdFlg = value;
    }

    /**
     * Gets the value of the minDispTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinDispTm() {
        return minDispTm;
    }

    /**
     * Sets the value of the minDispTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinDispTm(BigDecimal value) {
        this.minDispTm = value;
    }

}
