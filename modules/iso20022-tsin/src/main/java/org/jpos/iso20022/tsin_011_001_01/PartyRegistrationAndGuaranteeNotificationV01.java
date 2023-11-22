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

package org.jpos.iso20022.tsin_011_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyRegistrationAndGuaranteeNotificationV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyRegistrationAndGuaranteeNotificationV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}BusinessLetter1"/>
 *         <element name="NtfctnList" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}FinancingAgreementList1" maxOccurs="unbounded"/>
 *         <element name="NtfctnCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="ItmCnt" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}Max15NumericText" minOccurs="0"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}DecimalNumber" minOccurs="0"/>
 *         <element name="AttchdMsg" type="{urn:iso:std:iso:20022:tech:xsd:tsin.011.001.01}EncapsulatedBusinessMessage1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyRegistrationAndGuaranteeNotificationV01", propOrder = {
    "hdr",
    "ntfctnList",
    "ntfctnCnt",
    "itmCnt",
    "ctrlSum",
    "attchdMsg"
})
public class PartyRegistrationAndGuaranteeNotificationV01 {

    @XmlElement(name = "Hdr", required = true)
    protected BusinessLetter1 hdr;
    @XmlElement(name = "NtfctnList", required = true)
    protected List<FinancingAgreementList1> ntfctnList;
    @XmlElement(name = "NtfctnCnt")
    protected String ntfctnCnt;
    @XmlElement(name = "ItmCnt")
    protected String itmCnt;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "AttchdMsg")
    protected List<EncapsulatedBusinessMessage1> attchdMsg;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessLetter1 }
     *     
     */
    public BusinessLetter1 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessLetter1 }
     *     
     */
    public void setHdr(BusinessLetter1 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the ntfctnList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ntfctnList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNtfctnList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingAgreementList1 }
     * 
     * 
     * @return
     *     The value of the ntfctnList property.
     */
    public List<FinancingAgreementList1> getNtfctnList() {
        if (ntfctnList == null) {
            ntfctnList = new ArrayList<>();
        }
        return this.ntfctnList;
    }

    /**
     * Gets the value of the ntfctnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNtfctnCnt() {
        return ntfctnCnt;
    }

    /**
     * Sets the value of the ntfctnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNtfctnCnt(String value) {
        this.ntfctnCnt = value;
    }

    /**
     * Gets the value of the itmCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItmCnt() {
        return itmCnt;
    }

    /**
     * Sets the value of the itmCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItmCnt(String value) {
        this.itmCnt = value;
    }

    /**
     * Gets the value of the ctrlSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCtrlSum() {
        return ctrlSum;
    }

    /**
     * Sets the value of the ctrlSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCtrlSum(BigDecimal value) {
        this.ctrlSum = value;
    }

    /**
     * Gets the value of the attchdMsg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the attchdMsg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttchdMsg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncapsulatedBusinessMessage1 }
     * 
     * 
     * @return
     *     The value of the attchdMsg property.
     */
    public List<EncapsulatedBusinessMessage1> getAttchdMsg() {
        if (attchdMsg == null) {
            attchdMsg = new ArrayList<>();
        }
        return this.attchdMsg;
    }

}
