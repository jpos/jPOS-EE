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

package org.jpos.iso20022.fxtr_036_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForeignExchangeTradeConfirmationRequestCancellationRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ForeignExchangeTradeConfirmationRequestCancellationRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Hdr" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}Header23"/>
 *         <element name="CxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}MessageIdentification1" minOccurs="0"/>
 *         <element name="TradgSdId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}TradePartyIdentification7"/>
 *         <element name="CtrPtyRoleId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}TradePartyIdentification7"/>
 *         <element name="TradId" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}Max35Text"/>
 *         <element name="UndrlygPdctTp" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}UnderlyingProductIdentifier1Code"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:fxtr.036.001.01}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignExchangeTradeConfirmationRequestCancellationRequestV01", propOrder = {
    "hdr",
    "cxlReqId",
    "tradgSdId",
    "ctrPtyRoleId",
    "tradId",
    "undrlygPdctTp",
    "splmtryData"
})
public class ForeignExchangeTradeConfirmationRequestCancellationRequestV01 {

    @XmlElement(name = "Hdr", required = true)
    protected Header23 hdr;
    @XmlElement(name = "CxlReqId")
    protected MessageIdentification1 cxlReqId;
    @XmlElement(name = "TradgSdId", required = true)
    protected TradePartyIdentification7 tradgSdId;
    @XmlElement(name = "CtrPtyRoleId", required = true)
    protected TradePartyIdentification7 ctrPtyRoleId;
    @XmlElement(name = "TradId", required = true)
    protected String tradId;
    @XmlElement(name = "UndrlygPdctTp", required = true)
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctTp;
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
     * Gets the value of the cxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getCxlReqId() {
        return cxlReqId;
    }

    /**
     * Sets the value of the cxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setCxlReqId(MessageIdentification1 value) {
        this.cxlReqId = value;
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
     * Gets the value of the ctrPtyRoleId property.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public TradePartyIdentification7 getCtrPtyRoleId() {
        return ctrPtyRoleId;
    }

    /**
     * Sets the value of the ctrPtyRoleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyIdentification7 }
     *     
     */
    public void setCtrPtyRoleId(TradePartyIdentification7 value) {
        this.ctrPtyRoleId = value;
    }

    /**
     * Gets the value of the tradId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradId() {
        return tradId;
    }

    /**
     * Sets the value of the tradId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradId(String value) {
        this.tradId = value;
    }

    /**
     * Gets the value of the undrlygPdctTp property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctTp() {
        return undrlygPdctTp;
    }

    /**
     * Sets the value of the undrlygPdctTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public void setUndrlygPdctTp(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctTp = value;
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
