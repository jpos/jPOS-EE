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

package org.jpos.iso20022.camt_055_001_11;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginalPaymentInstruction44 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="OriginalPaymentInstruction44">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PmtCxlId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}Max35Text" minOccurs="0"/>
 *         <element name="Case" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}Case5" minOccurs="0"/>
 *         <element name="OrgnlPmtInfId" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}Max35Text"/>
 *         <element name="OrgnlGrpInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}OriginalGroupInformation29" minOccurs="0"/>
 *         <element name="NbOfTxs" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}Max15NumericText" minOccurs="0"/>
 *         <element name="CtrlSum" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}DecimalNumber" minOccurs="0"/>
 *         <element name="PmtInfCxl" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}GroupCancellationIndicator" minOccurs="0"/>
 *         <element name="CxlRsnInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}PaymentCancellationReason5" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="TxInf" type="{urn:iso:std:iso:20022:tech:xsd:camt.055.001.11}PaymentTransaction140" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalPaymentInstruction44", propOrder = {
    "pmtCxlId",
    "_case",
    "orgnlPmtInfId",
    "orgnlGrpInf",
    "nbOfTxs",
    "ctrlSum",
    "pmtInfCxl",
    "cxlRsnInf",
    "txInf"
})
public class OriginalPaymentInstruction44 {

    @XmlElement(name = "PmtCxlId")
    protected String pmtCxlId;
    @XmlElement(name = "Case")
    protected Case5 _case;
    @XmlElement(name = "OrgnlPmtInfId", required = true)
    protected String orgnlPmtInfId;
    @XmlElement(name = "OrgnlGrpInf")
    protected OriginalGroupInformation29 orgnlGrpInf;
    @XmlElement(name = "NbOfTxs")
    protected String nbOfTxs;
    @XmlElement(name = "CtrlSum")
    protected BigDecimal ctrlSum;
    @XmlElement(name = "PmtInfCxl")
    protected Boolean pmtInfCxl;
    @XmlElement(name = "CxlRsnInf")
    protected List<PaymentCancellationReason5> cxlRsnInf;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction140> txInf;

    /**
     * Gets the value of the pmtCxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtCxlId() {
        return pmtCxlId;
    }

    /**
     * Sets the value of the pmtCxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtCxlId(String value) {
        this.pmtCxlId = value;
    }

    /**
     * Gets the value of the case property.
     * 
     * @return
     *     possible object is
     *     {@link Case5 }
     *     
     */
    public Case5 getCase() {
        return _case;
    }

    /**
     * Sets the value of the case property.
     * 
     * @param value
     *     allowed object is
     *     {@link Case5 }
     *     
     */
    public void setCase(Case5 value) {
        this._case = value;
    }

    /**
     * Gets the value of the orgnlPmtInfId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgnlPmtInfId() {
        return orgnlPmtInfId;
    }

    /**
     * Sets the value of the orgnlPmtInfId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgnlPmtInfId(String value) {
        this.orgnlPmtInfId = value;
    }

    /**
     * Gets the value of the orgnlGrpInf property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public OriginalGroupInformation29 getOrgnlGrpInf() {
        return orgnlGrpInf;
    }

    /**
     * Sets the value of the orgnlGrpInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupInformation29 }
     *     
     */
    public void setOrgnlGrpInf(OriginalGroupInformation29 value) {
        this.orgnlGrpInf = value;
    }

    /**
     * Gets the value of the nbOfTxs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbOfTxs() {
        return nbOfTxs;
    }

    /**
     * Sets the value of the nbOfTxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbOfTxs(String value) {
        this.nbOfTxs = value;
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
     * Gets the value of the pmtInfCxl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPmtInfCxl() {
        return pmtInfCxl;
    }

    /**
     * Sets the value of the pmtInfCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPmtInfCxl(Boolean value) {
        this.pmtInfCxl = value;
    }

    /**
     * Gets the value of the cxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCancellationReason5 }
     * 
     * 
     * @return
     *     The value of the cxlRsnInf property.
     */
    public List<PaymentCancellationReason5> getCxlRsnInf() {
        if (cxlRsnInf == null) {
            cxlRsnInf = new ArrayList<>();
        }
        return this.cxlRsnInf;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction140 }
     * 
     * 
     * @return
     *     The value of the txInf property.
     */
    public List<PaymentTransaction140> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<>();
        }
        return this.txInf;
    }

}
