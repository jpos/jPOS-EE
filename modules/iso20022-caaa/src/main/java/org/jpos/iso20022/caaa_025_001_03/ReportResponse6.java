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

package org.jpos.iso20022.caaa_025_001_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportResponse6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReportResponse6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}CardPaymentEnvironment79"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}CardPaymentContext30"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}RetailerService7Code"/>
 *         <element name="RptTxRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ReportTransactionResponse5" minOccurs="0"/>
 *         <element name="RptGetTtlsRspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ReportGetTotalsResponse1" minOccurs="0"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}ResponseType11"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:caaa.025.001.03}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportResponse6", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "rptTxRspn",
    "rptGetTtlsRspn",
    "rspn",
    "splmtryData"
})
public class ReportResponse6 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService7Code svcCntt;
    @XmlElement(name = "RptTxRspn")
    protected ReportTransactionResponse5 rptTxRspn;
    @XmlElement(name = "RptGetTtlsRspn")
    protected ReportGetTotalsResponse1 rptGetTtlsRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
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
     *     {@link RetailerService7Code }
     *     
     */
    public RetailerService7Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService7Code }
     *     
     */
    public void setSvcCntt(RetailerService7Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the rptTxRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTransactionResponse5 }
     *     
     */
    public ReportTransactionResponse5 getRptTxRspn() {
        return rptTxRspn;
    }

    /**
     * Sets the value of the rptTxRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTransactionResponse5 }
     *     
     */
    public void setRptTxRspn(ReportTransactionResponse5 value) {
        this.rptTxRspn = value;
    }

    /**
     * Gets the value of the rptGetTtlsRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportGetTotalsResponse1 }
     *     
     */
    public ReportGetTotalsResponse1 getRptGetTtlsRspn() {
        return rptGetTtlsRspn;
    }

    /**
     * Sets the value of the rptGetTtlsRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportGetTotalsResponse1 }
     *     
     */
    public void setRptGetTtlsRspn(ReportGetTotalsResponse1 value) {
        this.rptGetTtlsRspn = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
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
