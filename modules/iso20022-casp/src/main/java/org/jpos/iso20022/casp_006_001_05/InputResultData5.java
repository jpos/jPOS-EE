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

package org.jpos.iso20022.casp_006_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InputResultData5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InputResultData5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="InptCmd" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}InputCommand1Code"/>
 *         <element name="ConfdFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="FctnKey" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Number" minOccurs="0"/>
 *         <element name="InptMsg" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}Max20000Text" minOccurs="0"/>
 *         <element name="Pwd" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}ContentInformationType34" minOccurs="0"/>
 *         <element name="ImgCaptrdSgntr" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}CapturedSignature1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputResultData5", propOrder = {
    "inptCmd",
    "confdFlg",
    "fctnKey",
    "inptMsg",
    "pwd",
    "imgCaptrdSgntr"
})
public class InputResultData5 {

    @XmlElement(name = "InptCmd", required = true)
    @XmlSchemaType(name = "string")
    protected InputCommand1Code inptCmd;
    @XmlElement(name = "ConfdFlg")
    protected Boolean confdFlg;
    @XmlElement(name = "FctnKey")
    protected BigDecimal fctnKey;
    @XmlElement(name = "InptMsg")
    protected String inptMsg;
    @XmlElement(name = "Pwd")
    protected ContentInformationType34 pwd;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;

    /**
     * Gets the value of the inptCmd property.
     * 
     * @return
     *     possible object is
     *     {@link InputCommand1Code }
     *     
     */
    public InputCommand1Code getInptCmd() {
        return inptCmd;
    }

    /**
     * Sets the value of the inptCmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InputCommand1Code }
     *     
     */
    public void setInptCmd(InputCommand1Code value) {
        this.inptCmd = value;
    }

    /**
     * Gets the value of the confdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfdFlg() {
        return confdFlg;
    }

    /**
     * Sets the value of the confdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfdFlg(Boolean value) {
        this.confdFlg = value;
    }

    /**
     * Gets the value of the fctnKey property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFctnKey() {
        return fctnKey;
    }

    /**
     * Sets the value of the fctnKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFctnKey(BigDecimal value) {
        this.fctnKey = value;
    }

    /**
     * Gets the value of the inptMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInptMsg() {
        return inptMsg;
    }

    /**
     * Sets the value of the inptMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInptMsg(String value) {
        this.inptMsg = value;
    }

    /**
     * Gets the value of the pwd property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType34 }
     *     
     */
    public ContentInformationType34 getPwd() {
        return pwd;
    }

    /**
     * Sets the value of the pwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType34 }
     *     
     */
    public void setPwd(ContentInformationType34 value) {
        this.pwd = value;
    }

    /**
     * Gets the value of the imgCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link CapturedSignature1 }
     *     
     */
    public CapturedSignature1 getImgCaptrdSgntr() {
        return imgCaptrdSgntr;
    }

    /**
     * Sets the value of the imgCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CapturedSignature1 }
     *     
     */
    public void setImgCaptrdSgntr(CapturedSignature1 value) {
        this.imgCaptrdSgntr = value;
    }

}
