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

package org.jpos.iso20022.casp_009_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportRequest6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportRequest6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}CardPaymentEnvironment79"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}CardPaymentContext30"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}RetailerService6Code"/>
 *         <element name="RptTxReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}ReportTransactionRequest1" minOccurs="0"/>
 *         <element name="RptGetTtlsReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}ReportGetTotalsRequest1" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:casp.009.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportRequest6", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "rptTxReq",
    "rptGetTtlsReq",
    "splmtryData"
})
public class ReportRequest6 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService6Code svcCntt;
    @XmlElement(name = "RptTxReq")
    protected ReportTransactionRequest1 rptTxReq;
    @XmlElement(name = "RptGetTtlsReq")
    protected ReportGetTotalsRequest1 rptGetTtlsReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public CardPaymentEnvironment79 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment79 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public void setCntxt(CardPaymentContext30 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService6Code }
     *     
     */
    public RetailerService6Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService6Code }
     *     
     */
    public void setSvcCntt(RetailerService6Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the rptTxReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTransactionRequest1 }
     *     
     */
    public ReportTransactionRequest1 getRptTxReq() {
        return rptTxReq;
    }

    /**
     * Sets the value of the rptTxReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTransactionRequest1 }
     *     
     */
    public void setRptTxReq(ReportTransactionRequest1 value) {
        this.rptTxReq = value;
    }

    /**
     * Gets the value of the rptGetTtlsReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReportGetTotalsRequest1 }
     *     
     */
    public ReportGetTotalsRequest1 getRptGetTtlsReq() {
        return rptGetTtlsReq;
    }

    /**
     * Sets the value of the rptGetTtlsReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportGetTotalsRequest1 }
     *     
     */
    public void setRptGetTtlsReq(ReportGetTotalsRequest1 value) {
        this.rptGetTtlsReq = value;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
        }
        return this.splmtryData;
    }

}
