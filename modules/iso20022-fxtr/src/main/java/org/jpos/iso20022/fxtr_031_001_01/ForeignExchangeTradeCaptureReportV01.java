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

package org.jpos.iso20022.fxtr_031_001_01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeCaptureReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeCaptureReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Header23"/>
 *         <element name="RptId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}MessageIdentification1" minOccurs="0"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}TradePartyIdentification7" minOccurs="0"/>
 *         <element name="CtrPtySdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}TradePartyIdentification7" minOccurs="0"/>
 *         <element name="TradDtl" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Trade1" minOccurs="0"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}AdditionalReferences" minOccurs="0"/>
 *         <element name="ReqRspndr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}YesNoIndicator"/>
 *         <element name="ReqRjctd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="QryRjctRsn" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Max35Text" minOccurs="0"/>
 *         <element name="TtlNbTrds" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}Number" minOccurs="0"/>
 *         <element name="LastRptReqd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}YesNoIndicator" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.031.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeCaptureReportV01", propOrder = {
    "hdr",
    "rptId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "ref",
    "reqRspndr",
    "reqRjctd",
    "qryRjctRsn",
    "ttlNbTrds",
    "lastRptReqd",
    "splmtryData"
})
public class ForeignExchangeTradeCaptureReportV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "RptId")
    protected MessageIdentification1 rptId;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl")
    protected Trade1 tradDtl;
    @XmlElement(name = "Ref")
    protected AdditionalReferences ref;
    @XmlElement(name = "ReqRspndr")
    protected boolean reqRspndr;
    @XmlElement(name = "ReqRjctd")
    protected Boolean reqRjctd;
    @XmlElement(name = "QryRjctRsn")
    protected String qryRjctRsn;
    @XmlElement(name = "TtlNbTrds")
    protected BigDecimal ttlNbTrds;
    @XmlElement(name = "LastRptReqd")
    protected Boolean lastRptReqd;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the hdr property.
     * 
     * @return
     *     possible object is
     *     {@link Header23 }
     *     
     */
    public Header23 getHdr() {
        return hdr;
    }

    /**
     * Sets the value of the hdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header23 }
     *     
     */
    public void setHdr(Header23 value) {
        this.hdr = value;
    }

    /**
     * Gets the value of the rptId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRptId() {
        return rptId;
    }

    /**
     * Sets the value of the rptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRptId(MessageIdentification1 value) {
        this.rptId = value;
    }

    /**
     * Gets the value of the tradgSdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getTradgSdId() {
        return tradgSdId;
    }

    /**
     * Sets the value of the tradgSdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public void setTradgSdId(TradePartyIdentification7 value) {
        this.tradgSdId = value;
    }

    /**
     * Gets the value of the ctrPtySdId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getCtrPtySdId() {
        return ctrPtySdId;
    }

    /**
     * Sets the value of the ctrPtySdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public void setCtrPtySdId(TradePartyIdentification7 value) {
        this.ctrPtySdId = value;
    }

    /**
     * Gets the value of the tradDtl property.
     * 
     * @return
     *     possible object is
     *     {@link Trade1 }
     *     
     */
    public Trade1 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade1 }
     *     
     */
    public void setTradDtl(Trade1 value) {
        this.tradDtl = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReferences }
     *     
     */
    public AdditionalReferences getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReferences }
     *     
     */
    public void setRef(AdditionalReferences value) {
        this.ref = value;
    }

    /**
     * Gets the value of the reqRspndr property.
     * 
     */
    public boolean isReqRspndr() {
        return reqRspndr;
    }

    /**
     * Sets the value of the reqRspndr property.
     * 
     */
    public void setReqRspndr(boolean value) {
        this.reqRspndr = value;
    }

    /**
     * Gets the value of the reqRjctd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReqRjctd() {
        return reqRjctd;
    }

    /**
     * Sets the value of the reqRjctd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReqRjctd(Boolean value) {
        this.reqRjctd = value;
    }

    /**
     * Gets the value of the qryRjctRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryRjctRsn() {
        return qryRjctRsn;
    }

    /**
     * Sets the value of the qryRjctRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryRjctRsn(String value) {
        this.qryRjctRsn = value;
    }

    /**
     * Gets the value of the ttlNbTrds property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTtlNbTrds() {
        return ttlNbTrds;
    }

    /**
     * Sets the value of the ttlNbTrds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTtlNbTrds(BigDecimal value) {
        this.ttlNbTrds = value;
    }

    /**
     * Gets the value of the lastRptReqd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLastRptReqd() {
        return lastRptReqd;
    }

    /**
     * Sets the value of the lastRptReqd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLastRptReqd(Boolean value) {
        this.lastRptReqd = value;
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
