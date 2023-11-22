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

package org.jpos.iso20022.fxtr_035_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeConfirmationRequestAmendmentRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Header23"/>
 *         <element name="AmdmntReqId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}MessageIdentification1"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}TradePartyIdentification7" minOccurs="0"/>
 *         <element name="CtrPtySdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}TradePartyIdentification7" minOccurs="0"/>
 *         <element name="TradDtl" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Trade2"/>
 *         <element name="QryPrd" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Period4"/>
 *         <element name="QryStartNb" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}Max35NumericText"/>
 *         <element name="QryTradSts" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}QueryTradeStatus1Code"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.035.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestAmendmentRequestV01", propOrder = {
    "hdr",
    "amdmntReqId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "qryPrd",
    "qryStartNb",
    "qryTradSts",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationRequestAmendmentRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "AmdmntReqId", required = true)
    protected MessageIdentification1 amdmntReqId;
    @XmlElement(name = "TradgSdId")
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId")
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl", required = true)
    protected Trade2 tradDtl;
    @XmlElement(name = "QryPrd", required = true)
    protected Period4 qryPrd;
    @XmlElement(name = "QryStartNb", required = true)
    protected String qryStartNb;
    @XmlElement(name = "QryTradSts", required = true)
    @XmlSchemaType(name = "string")
    protected QueryTradeStatus1Code qryTradSts;
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
     * Gets the value of the amdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAmdmntReqId() {
        return amdmntReqId;
    }

    /**
     * Sets the value of the amdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setAmdmntReqId(MessageIdentification1 value) {
        this.amdmntReqId = value;
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
     *     {@link Trade2 }
     *     
     */
    public Trade2 getTradDtl() {
        return tradDtl;
    }

    /**
     * Sets the value of the tradDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade2 }
     *     
     */
    public void setTradDtl(Trade2 value) {
        this.tradDtl = value;
    }

    /**
     * Gets the value of the qryPrd property.
     * 
     * @return
     *     possible object is
     *     {@link Period4 }
     *     
     */
    public Period4 getQryPrd() {
        return qryPrd;
    }

    /**
     * Sets the value of the qryPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period4 }
     *     
     */
    public void setQryPrd(Period4 value) {
        this.qryPrd = value;
    }

    /**
     * Gets the value of the qryStartNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryStartNb() {
        return qryStartNb;
    }

    /**
     * Sets the value of the qryStartNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQryStartNb(String value) {
        this.qryStartNb = value;
    }

    /**
     * Gets the value of the qryTradSts property.
     * 
     * @return
     *     possible object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public QueryTradeStatus1Code getQryTradSts() {
        return qryTradSts;
    }

    /**
     * Sets the value of the qryTradSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryTradeStatus1Code }
     *     
     */
    public void setQryTradSts(QueryTradeStatus1Code value) {
        this.qryTradSts = value;
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
