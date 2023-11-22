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

package org.jpos.iso20022.auth_072_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SettlementInternaliserReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="SettlementInternaliserReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RptHdr" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SettlementInternaliserReportHeader1"/>
 *         <element name="SttlmIntlr" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SettlementInternaliser1"/>
 *         <element name="IssrCSD" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}IssuerCSDReport1" maxOccurs="unbounded"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:auth.072.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserReportV01", propOrder = {
    "rptHdr",
    "sttlmIntlr",
    "issrCSD",
    "splmtryData"
})
public class SettlementInternaliserReportV01 {

    @XmlElement(name = "RptHdr", required = true)
    protected SettlementInternaliserReportHeader1 rptHdr;
    @XmlElement(name = "SttlmIntlr", required = true)
    protected SettlementInternaliser1 sttlmIntlr;
    @XmlElement(name = "IssrCSD", required = true)
    protected List<IssuerCSDReport1> issrCSD;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptHdr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliserReportHeader1 }
     *     
     */
    public SettlementInternaliserReportHeader1 getRptHdr() {
        return rptHdr;
    }

    /**
     * Sets the value of the rptHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliserReportHeader1 }
     *     
     */
    public void setRptHdr(SettlementInternaliserReportHeader1 value) {
        this.rptHdr = value;
    }

    /**
     * Gets the value of the sttlmIntlr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInternaliser1 }
     *     
     */
    public SettlementInternaliser1 getSttlmIntlr() {
        return sttlmIntlr;
    }

    /**
     * Sets the value of the sttlmIntlr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInternaliser1 }
     *     
     */
    public void setSttlmIntlr(SettlementInternaliser1 value) {
        this.sttlmIntlr = value;
    }

    /**
     * Gets the value of the issrCSD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the issrCSD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssrCSD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuerCSDReport1 }
     * 
     * 
     * @return
     *     The value of the issrCSD property.
     */
    public List<IssuerCSDReport1> getIssrCSD() {
        if (issrCSD == null) {
            issrCSD = new ArrayList<>();
        }
        return this.issrCSD;
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
