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

package org.jpos.iso20022.fxtr_037_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeConfirmationStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeConfirmationStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Header23"/>
 *         <element name="AdvcId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}MessageIdentification1" minOccurs="0"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}TradePartyIdentification7"/>
 *         <element name="CtrPtySdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}TradePartyIdentification7"/>
 *         <element name="TradDtl" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Trade2"/>
 *         <element name="ConfInf" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}Confirmation1"/>
 *         <element name="Ref" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}AdditionalReferences" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.037.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationStatusAdviceV01", propOrder = {
    "hdr",
    "advcId",
    "tradgSdId",
    "ctrPtySdId",
    "tradDtl",
    "confInf",
    "ref",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationStatusAdviceV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "AdvcId")
    protected MessageIdentification1 advcId;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtySdId", required = true)
    protected TradePartyIdentification7 ctrPtySdId;
    @XmlElement(name = "TradDtl", required = true)
    protected Trade2 tradDtl;
    @XmlElement(name = "ConfInf", required = true)
    protected Confirmation1 confInf;
    @XmlElement(name = "Ref")
    protected AdditionalReferences ref;
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
     * Gets the value of the advcId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAdvcId() {
        return advcId;
    }

    /**
     * Sets the value of the advcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setAdvcId(MessageIdentification1 value) {
        this.advcId = value;
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
     * Gets the value of the confInf property.
     * 
     * @return
     *     possible object is
     *     {@link Confirmation1 }
     *     
     */
    public Confirmation1 getConfInf() {
        return confInf;
    }

    /**
     * Sets the value of the confInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confirmation1 }
     *     
     */
    public void setConfInf(Confirmation1 value) {
        this.confInf = value;
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
