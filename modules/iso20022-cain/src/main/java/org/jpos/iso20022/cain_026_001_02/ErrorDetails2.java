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

package org.jpos.iso20022.cain_026_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorDetails2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ErrorDetails2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgErrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.026.001.02}MessageError1Code"/>
 *         <element name="OthrMsgErrTp" type="{urn:iso:std:iso:20022:tech:xsd:cain.026.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ErrCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.026.001.02}Max35Text" minOccurs="0"/>
 *         <element name="ErrDesc" type="{urn:iso:std:iso:20022:tech:xsd:cain.026.001.02}Max500Text" minOccurs="0"/>
 *         <element name="DataElmtInErr" type="{urn:iso:std:iso:20022:tech:xsd:cain.026.001.02}Max4000Text" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorDetails2", propOrder = {
    "msgErrTp",
    "othrMsgErrTp",
    "errCd",
    "errDesc",
    "dataElmtInErr"
})
public class ErrorDetails2 {

    @XmlElement(name = "MsgErrTp", required = true)
    @XmlSchemaType(name = "string")
    protected MessageError1Code msgErrTp;
    @XmlElement(name = "OthrMsgErrTp")
    protected String othrMsgErrTp;
    @XmlElement(name = "ErrCd")
    protected String errCd;
    @XmlElement(name = "ErrDesc")
    protected String errDesc;
    @XmlElement(name = "DataElmtInErr")
    protected List<String> dataElmtInErr;

    /**
     * Gets the value of the msgErrTp property.
     * 
     * @return
     *     possible object is
     *     {@link MessageError1Code }
     *     
     */
    public MessageError1Code getMsgErrTp() {
        return msgErrTp;
    }

    /**
     * Sets the value of the msgErrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageError1Code }
     *     
     */
    public void setMsgErrTp(MessageError1Code value) {
        this.msgErrTp = value;
    }

    /**
     * Gets the value of the othrMsgErrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrMsgErrTp() {
        return othrMsgErrTp;
    }

    /**
     * Sets the value of the othrMsgErrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrMsgErrTp(String value) {
        this.othrMsgErrTp = value;
    }

    /**
     * Gets the value of the errCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrCd() {
        return errCd;
    }

    /**
     * Sets the value of the errCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrCd(String value) {
        this.errCd = value;
    }

    /**
     * Gets the value of the errDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrDesc() {
        return errDesc;
    }

    /**
     * Sets the value of the errDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrDesc(String value) {
        this.errDesc = value;
    }

    /**
     * Gets the value of the dataElmtInErr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dataElmtInErr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataElmtInErr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the dataElmtInErr property.
     */
    public List<String> getDataElmtInErr() {
        if (dataElmtInErr == null) {
            dataElmtInErr = new ArrayList<>();
        }
        return this.dataElmtInErr;
    }

}
