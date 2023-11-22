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

package org.jpos.iso20022.cafc_002_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultData7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ResultData7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Rslt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Response8Code" minOccurs="0"/>
 *         <element name="OthrRslt" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/>
 *         <element name="RsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}ISO8583ResponseCode"/>
 *         <element name="OthrRsltDtls" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}Max35Text" minOccurs="0"/>
 *         <element name="TempScrCardDataReusePrtd" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="AddtlRsltInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.002.001.02}AdditionalData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultData7", propOrder = {
    "rslt",
    "othrRslt",
    "rsltDtls",
    "othrRsltDtls",
    "tempScrCardDataReusePrtd",
    "addtlRsltInf"
})
public class ResultData7 {

    @XmlElement(name = "Rslt")
    @XmlSchemaType(name = "string")
    protected Response8Code rslt;
    @XmlElement(name = "OthrRslt")
    protected String othrRslt;
    @XmlElement(name = "RsltDtls", required = true)
    protected String rsltDtls;
    @XmlElement(name = "OthrRsltDtls")
    protected String othrRsltDtls;
    @XmlElement(name = "TempScrCardDataReusePrtd")
    protected Boolean tempScrCardDataReusePrtd;
    @XmlElement(name = "AddtlRsltInf")
    protected List<AdditionalData1> addtlRsltInf;

    /**
     * Gets the value of the rslt property.
     * 
     * @return
     *     possible object is
     *     {@link Response8Code }
     *     
     */
    public Response8Code getRslt() {
        return rslt;
    }

    /**
     * Sets the value of the rslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response8Code }
     *     
     */
    public void setRslt(Response8Code value) {
        this.rslt = value;
    }

    /**
     * Gets the value of the othrRslt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRslt() {
        return othrRslt;
    }

    /**
     * Sets the value of the othrRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRslt(String value) {
        this.othrRslt = value;
    }

    /**
     * Gets the value of the rsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsltDtls() {
        return rsltDtls;
    }

    /**
     * Sets the value of the rsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsltDtls(String value) {
        this.rsltDtls = value;
    }

    /**
     * Gets the value of the othrRsltDtls property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrRsltDtls() {
        return othrRsltDtls;
    }

    /**
     * Sets the value of the othrRsltDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOthrRsltDtls(String value) {
        this.othrRsltDtls = value;
    }

    /**
     * Gets the value of the tempScrCardDataReusePrtd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTempScrCardDataReusePrtd() {
        return tempScrCardDataReusePrtd;
    }

    /**
     * Sets the value of the tempScrCardDataReusePrtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTempScrCardDataReusePrtd(Boolean value) {
        this.tempScrCardDataReusePrtd = value;
    }

    /**
     * Gets the value of the addtlRsltInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlRsltInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlRsltInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalData1 }
     * 
     * 
     * @return
     *     The value of the addtlRsltInf property.
     */
    public List<AdditionalData1> getAddtlRsltInf() {
        if (addtlRsltInf == null) {
            addtlRsltInf = new ArrayList<>();
        }
        return this.addtlRsltInf;
    }

}
