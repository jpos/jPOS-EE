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

package org.jpos.iso20022.casp_015_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetailerPaymentResult5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RetailerPaymentResult5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TxTp" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentServiceType12Code"/>
 *         <element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentServiceType9Code" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SvcAttr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentServiceType14Code" minOccurs="0"/>
 *         <element name="ReqdTx" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentTransaction127" minOccurs="0"/>
 *         <element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardPaymentTransaction128" minOccurs="0"/>
 *         <element name="CstmrOrdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CustomerOrder1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ImgCaptrdSgntr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CapturedSignature1" minOccurs="0"/>
 *         <element name="PrtctdCaptrdSgntr" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}ContentInformationType35" minOccurs="0"/>
 *         <element name="MrchntOvrrdFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}TrueFalseIndicator" minOccurs="0"/>
 *         <element name="CstmrLang" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}LanguageCode" minOccurs="0"/>
 *         <element name="OnlnFlg" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}TrueFalseIndicator" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerPaymentResult5", propOrder = {
    "txTp",
    "addtlSvc",
    "svcAttr",
    "reqdTx",
    "txRspn",
    "cstmrOrdr",
    "imgCaptrdSgntr",
    "prtctdCaptrdSgntr",
    "mrchntOvrrdFlg",
    "cstmrLang",
    "onlnFlg"
})
public class RetailerPaymentResult5 {

    @XmlElement(name = "TxTp", required = true)
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType12Code txTp;
    @XmlElement(name = "AddtlSvc")
    @XmlSchemaType(name = "string")
    protected List<CardPaymentServiceType9Code> addtlSvc;
    @XmlElement(name = "SvcAttr")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType14Code svcAttr;
    @XmlElement(name = "ReqdTx")
    protected CardPaymentTransaction127 reqdTx;
    @XmlElement(name = "TxRspn")
    protected CardPaymentTransaction128 txRspn;
    @XmlElement(name = "CstmrOrdr")
    protected List<CustomerOrder1> cstmrOrdr;
    @XmlElement(name = "ImgCaptrdSgntr")
    protected CapturedSignature1 imgCaptrdSgntr;
    @XmlElement(name = "PrtctdCaptrdSgntr")
    protected ContentInformationType35 prtctdCaptrdSgntr;
    @XmlElement(name = "MrchntOvrrdFlg")
    protected Boolean mrchntOvrrdFlg;
    @XmlElement(name = "CstmrLang")
    protected String cstmrLang;
    @XmlElement(name = "OnlnFlg")
    protected Boolean onlnFlg;

    /**
     * Gets the value of the txTp property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public CardPaymentServiceType12Code getTxTp() {
        return txTp;
    }

    /**
     * Sets the value of the txTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType12Code }
     *     
     */
    public void setTxTp(CardPaymentServiceType12Code value) {
        this.txTp = value;
    }

    /**
     * Gets the value of the addtlSvc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlSvc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlSvc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CardPaymentServiceType9Code }
     * 
     * 
     * @return
     *     The value of the addtlSvc property.
     */
    public List<CardPaymentServiceType9Code> getAddtlSvc() {
        if (addtlSvc == null) {
            addtlSvc = new ArrayList<>();
        }
        return this.addtlSvc;
    }

    /**
     * Gets the value of the svcAttr property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public CardPaymentServiceType14Code getSvcAttr() {
        return svcAttr;
    }

    /**
     * Sets the value of the svcAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType14Code }
     *     
     */
    public void setSvcAttr(CardPaymentServiceType14Code value) {
        this.svcAttr = value;
    }

    /**
     * Gets the value of the reqdTx property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public CardPaymentTransaction127 getReqdTx() {
        return reqdTx;
    }

    /**
     * Sets the value of the reqdTx property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction127 }
     *     
     */
    public void setReqdTx(CardPaymentTransaction127 value) {
        this.reqdTx = value;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentTransaction128 }
     *     
     */
    public CardPaymentTransaction128 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentTransaction128 }
     *     
     */
    public void setTxRspn(CardPaymentTransaction128 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the cstmrOrdr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cstmrOrdr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCstmrOrdr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerOrder1 }
     * 
     * 
     * @return
     *     The value of the cstmrOrdr property.
     */
    public List<CustomerOrder1> getCstmrOrdr() {
        if (cstmrOrdr == null) {
            cstmrOrdr = new ArrayList<>();
        }
        return this.cstmrOrdr;
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

    /**
     * Gets the value of the prtctdCaptrdSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType35 }
     *     
     */
    public ContentInformationType35 getPrtctdCaptrdSgntr() {
        return prtctdCaptrdSgntr;
    }

    /**
     * Sets the value of the prtctdCaptrdSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType35 }
     *     
     */
    public void setPrtctdCaptrdSgntr(ContentInformationType35 value) {
        this.prtctdCaptrdSgntr = value;
    }

    /**
     * Gets the value of the mrchntOvrrdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMrchntOvrrdFlg() {
        return mrchntOvrrdFlg;
    }

    /**
     * Sets the value of the mrchntOvrrdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMrchntOvrrdFlg(Boolean value) {
        this.mrchntOvrrdFlg = value;
    }

    /**
     * Gets the value of the cstmrLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrLang() {
        return cstmrLang;
    }

    /**
     * Sets the value of the cstmrLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCstmrLang(String value) {
        this.cstmrLang = value;
    }

    /**
     * Gets the value of the onlnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOnlnFlg() {
        return onlnFlg;
    }

    /**
     * Sets the value of the onlnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOnlnFlg(Boolean value) {
        this.onlnFlg = value;
    }

}
