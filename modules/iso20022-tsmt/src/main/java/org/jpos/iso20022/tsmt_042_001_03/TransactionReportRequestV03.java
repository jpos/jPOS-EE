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

package org.jpos.iso20022.tsmt_042_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionReportRequestV03 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TransactionReportRequestV03">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}MessageIdentification1"/>
 *         <element name="RptSpcfctn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.042.001.03}ReportSpecification4"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionReportRequestV03", propOrder = {
    "reqId",
    "rptSpcfctn"
})
public class TransactionReportRequestV03 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "RptSpcfctn", required = true)
    protected ReportSpecification4 rptSpcfctn;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setReqId(MessageIdentification1 value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the rptSpcfctn property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSpecification4 }
     *     
     */
    public ReportSpecification4 getRptSpcfctn() {
        return rptSpcfctn;
    }

    /**
     * Sets the value of the rptSpcfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSpecification4 }
     *     
     */
    public void setRptSpcfctn(ReportSpecification4 value) {
        this.rptSpcfctn = value;
    }

}
