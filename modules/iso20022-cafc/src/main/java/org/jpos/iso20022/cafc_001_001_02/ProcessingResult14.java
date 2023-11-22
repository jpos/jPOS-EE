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

package org.jpos.iso20022.cafc_001_001_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessingResult14 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ProcessingResult14">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RspnSrc" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ApprovalEntity2" minOccurs="0"/>
 *         <element name="RsltData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ResultData10" minOccurs="0"/>
 *         <element name="ErrDtl" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ErrorDetails2" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="OrgnlRsltData" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}ResultData7" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:cafc.001.001.02}AdditionalInformation30" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingResult14", propOrder = {
    "rspnSrc",
    "rsltData",
    "errDtl",
    "orgnlRsltData",
    "addtlInf"
})
public class ProcessingResult14 {

    @XmlElement(name = "RspnSrc")
    protected ApprovalEntity2 rspnSrc;
    @XmlElement(name = "RsltData")
    protected ResultData10 rsltData;
    @XmlElement(name = "ErrDtl")
    protected List<ErrorDetails2> errDtl;
    @XmlElement(name = "OrgnlRsltData")
    protected ResultData7 orgnlRsltData;
    @XmlElement(name = "AddtlInf")
    protected List<AdditionalInformation30> addtlInf;

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
     *     {@link ResultData10 }
     *     
     */
    public ResultData10 getRsltData() {
        return rsltData;
    }

    /**
     * Sets the value of the rsltData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultData10 }
     *     
     */
    public void setRsltData(ResultData10 value) {
        this.rsltData = value;
    }

    /**
     * Gets the value of the errDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the errDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorDetails2 }
     * 
     * 
     * @return
     *     The value of the errDtl property.
     */
    public List<ErrorDetails2> getErrDtl() {
        if (errDtl == null) {
            errDtl = new ArrayList<>();
        }
        return this.errDtl;
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
     * {@link AdditionalInformation30 }
     * 
     * 
     * @return
     *     The value of the addtlInf property.
     */
    public List<AdditionalInformation30> getAddtlInf() {
        if (addtlInf == null) {
            addtlInf = new ArrayList<>();
        }
        return this.addtlInf;
    }

}
