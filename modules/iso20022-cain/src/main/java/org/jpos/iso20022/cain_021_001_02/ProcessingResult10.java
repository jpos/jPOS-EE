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

package org.jpos.iso20022.cain_021_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingResult10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingResult10">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnSrc" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}ApprovalEntity2" minOccurs="0"/>
 *         <element name="RsltData" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}ResultData7"/>
 *         <element name="ApprvlCd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Exact6AlphaNumericText" minOccurs="0"/>
 *         <element name="ErrDtl" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}ErrorDetails2" minOccurs="0"/>
 *         <element name="OrgnlRsltData" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}ResultData7" minOccurs="0"/>
 *         <element name="ActnReqrd" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}YesNoIndicator" minOccurs="0"/>
 *         <element name="Actn" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}Action13" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlActn" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}AdditionalAction1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cain.021.001.02}AdditionalInformation29" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult10", propOrder = {
    "rspnSrc",
    "rsltData",
    "apprvlCd",
    "errDtl",
    "orgnlRsltData",
    "actnReqrd",
    "actn",
    "addtlActn",
    "addtlInf"
})
public class ProcessingResult10 {

    @XmlElement(name = "RspnSrc")
    protected ApprovalEntity2 rspnSrc;
    @XmlElement(name = "RsltData", required = true)
    protected ResultData7 rsltData;
    @XmlElement(name = "ApprvlCd")
    protected String apprvlCd;
    @XmlElement(name = "ErrDtl")
    protected ErrorDetails2 errDtl;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData7 orgnlRsltData;
    @XmlElement(name = "ActnReqrd")
    protected Boolean actnReqrd;
    @XmlElement(name = "Actn")
    protected List<Action13> actn;
    @XmlElement(name = "AddtlActn")
    protected List<AdditionalAction1> addtlActn;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation29> addtlInf;

    /**
     * Gets the value of the rspnSrc property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public ApprovalEntity2 getRspnSrc() {
        return rspnSrc;
    }

    /**
     * Sets the value of the rspnSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalEntity2 }
     *     
     */
    public void setRspnSrc(ApprovalEntity2 value) {
        this.rspnSrc = value;
    }

    /**
     * Gets the value of the rsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public void setRsltData(ResultData7 value) {
        this.rsltData = value;
    }

    /**
     * Gets the value of the apprvlCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprvlCd() {
        return apprvlCd;
    }

    /**
     * Sets the value of the apprvlCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprvlCd(String value) {
        this.apprvlCd = value;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorDetails2 }
     *     
     */
    public ErrorDetails2 getErrDtl() {
        return errDtl;
    }

    /**
     * Sets the value of the errDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorDetails2 }
     *     
     */
    public void setErrDtl(ErrorDetails2 value) {
        this.errDtl = value;
    }

    /**
     * Gets the value of the orgnlRsltData property.
     * 
     * @return
     *     possible object is
     *     {@link ResultData7 }
     *     
     */
    public ResultData7 getOrgnlRsltData() {
        return orgnlRsltData;
    }

    /**
     * Sets the value of the orgnlRsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData7 }
     *     
     */
    public void setOrgnlRsltData(ResultData7 value) {
        this.orgnlRsltData = value;
    }

    /**
     * Gets the value of the actnReqrd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActnReqrd() {
        return actnReqrd;
    }

    /**
     * Sets the value of the actnReqrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActnReqrd(Boolean value) {
        this.actnReqrd = value;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action13 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action13> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the addtlActn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlActn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalAction1 }
     * 
     * 
     * @return
     *     The value of the addtlActn property.
     */
    public List<AdditionalAction1> getAddtlActn() {
        if (addtlActn == null) {
            addtlActn = new ArrayList<>();
        }
        return this.addtlActn;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalInformation29 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation29> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
