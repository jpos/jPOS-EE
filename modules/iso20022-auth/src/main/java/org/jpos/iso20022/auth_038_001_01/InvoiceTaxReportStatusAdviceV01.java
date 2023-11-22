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

package org.jpos.iso20022.auth_038_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceTaxReportStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="InvoiceTaxReportStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="StsRptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}InvoiceTaxStatusReportHeader1"/>
 *         <element name="TxSts" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}InvoiceTaxReportTransactionStatus1" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.038.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceTaxReportStatusAdviceV01", propOrder = {
    "stsRptHdr",
    "txSts",
    "splmtryData"
})
public class InvoiceTaxReportStatusAdviceV01 {

    @XmlElement(name = "StsRptHdr", required = true)
    protected InvoiceTaxStatusReportHeader1 stsRptHdr;
    @XmlElement(name = "TxSts")
    protected List<InvoiceTaxReportTransactionStatus1> txSts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the stsRptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceTaxStatusReportHeader1 }
     *     
     */
    public InvoiceTaxStatusReportHeader1 getStsRptHdr() {
        return stsRptHdr;
    }

    /**
     * Sets the value of the stsRptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceTaxStatusReportHeader1 }
     *     
     */
    public void setStsRptHdr(InvoiceTaxStatusReportHeader1 value) {
        this.stsRptHdr = value;
    }

    /**
     * Gets the value of the txSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceTaxReportTransactionStatus1 }
     * 
     * 
     * @return
     *     The value of the txSts property.
     */
    public List<InvoiceTaxReportTransactionStatus1> getTxSts() {
        if (txSts == null) {
            txSts = new ArrayList<>();
        }
        return this.txSts;
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
