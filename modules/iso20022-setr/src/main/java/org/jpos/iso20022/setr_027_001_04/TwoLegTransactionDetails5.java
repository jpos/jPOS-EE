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

package org.jpos.iso20022.setr_027_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TwoLegTransactionDetails5 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="TwoLegTransactionDetails5">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="TradDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TradeDate8Choice" minOccurs="0"/>
 *         <element name="OpngLegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="ClsgLegId" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max35Text" minOccurs="0"/>
 *         <element name="GrssTradAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection29" minOccurs="0"/>
 *         <element name="OthrAmts" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}OtherAmounts16" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="ScndLegNrrtv" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Max140Text" minOccurs="0"/>
 *         <element name="EndPric" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}Price14" minOccurs="0"/>
 *         <element name="ClsgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}ClosingDate4Choice" minOccurs="0"/>
 *         <element name="ClsgSttlmAmt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}AmountAndDirection5" minOccurs="0"/>
 *         <element name="PrcgDt" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TradeDate7Choice" minOccurs="0"/>
 *         <element name="TwoLegTxTp" type="{urn:iso:std:iso:20022:tech:xsd:setr.027.001.04}TwoLegTransactionType4Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoLegTransactionDetails5", propOrder = {
    "tradDt",
    "opngLegId",
    "clsgLegId",
    "grssTradAmt",
    "othrAmts",
    "scndLegNrrtv",
    "endPric",
    "clsgDt",
    "clsgSttlmAmt",
    "prcgDt",
    "twoLegTxTp"
})
public class TwoLegTransactionDetails5 {

    @XmlElement(name = "TradDt")
    protected TradeDate8Choice tradDt;
    @XmlElement(name = "OpngLegId")
    protected String opngLegId;
    @XmlElement(name = "ClsgLegId")
    protected String clsgLegId;
    @XmlElement(name = "GrssTradAmt")
    protected AmountAndDirection29 grssTradAmt;
    @XmlElement(name = "OthrAmts")
    protected List<OtherAmounts16> othrAmts;
    @XmlElement(name = "ScndLegNrrtv")
    protected String scndLegNrrtv;
    @XmlElement(name = "EndPric")
    protected Price14 endPric;
    @XmlElement(name = "ClsgDt")
    protected ClosingDate4Choice clsgDt;
    @XmlElement(name = "ClsgSttlmAmt")
    protected AmountAndDirection5 clsgSttlmAmt;
    @XmlElement(name = "PrcgDt")
    protected TradeDate7Choice prcgDt;
    @XmlElement(name = "TwoLegTxTp")
    protected TwoLegTransactionType4Choice twoLegTxTp;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate8Choice }
     *     
     */
    public TradeDate8Choice getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate8Choice }
     *     
     */
    public void setTradDt(TradeDate8Choice value) {
        this.tradDt = value;
    }

    /**
     * Gets the value of the opngLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpngLegId() {
        return opngLegId;
    }

    /**
     * Sets the value of the opngLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpngLegId(String value) {
        this.opngLegId = value;
    }

    /**
     * Gets the value of the clsgLegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClsgLegId() {
        return clsgLegId;
    }

    /**
     * Sets the value of the clsgLegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClsgLegId(String value) {
        this.clsgLegId = value;
    }

    /**
     * Gets the value of the grssTradAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public AmountAndDirection29 getGrssTradAmt() {
        return grssTradAmt;
    }

    /**
     * Sets the value of the grssTradAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection29 }
     *     
     */
    public void setGrssTradAmt(AmountAndDirection29 value) {
        this.grssTradAmt = value;
    }

    /**
     * Gets the value of the othrAmts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the othrAmts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrAmts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAmounts16 }
     * 
     * 
     * @return
     *     The value of the othrAmts property.
     */
    public List<OtherAmounts16> getOthrAmts() {
        if (othrAmts == null) {
            othrAmts = new ArrayList<>();
        }
        return this.othrAmts;
    }

    /**
     * Gets the value of the scndLegNrrtv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScndLegNrrtv() {
        return scndLegNrrtv;
    }

    /**
     * Sets the value of the scndLegNrrtv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScndLegNrrtv(String value) {
        this.scndLegNrrtv = value;
    }

    /**
     * Gets the value of the endPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price14 }
     *     
     */
    public Price14 getEndPric() {
        return endPric;
    }

    /**
     * Sets the value of the endPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price14 }
     *     
     */
    public void setEndPric(Price14 value) {
        this.endPric = value;
    }

    /**
     * Gets the value of the clsgDt property.
     * 
     * @return
     *     possible object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public ClosingDate4Choice getClsgDt() {
        return clsgDt;
    }

    /**
     * Sets the value of the clsgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClosingDate4Choice }
     *     
     */
    public void setClsgDt(ClosingDate4Choice value) {
        this.clsgDt = value;
    }

    /**
     * Gets the value of the clsgSttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public AmountAndDirection5 getClsgSttlmAmt() {
        return clsgSttlmAmt;
    }

    /**
     * Sets the value of the clsgSttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection5 }
     *     
     */
    public void setClsgSttlmAmt(AmountAndDirection5 value) {
        this.clsgSttlmAmt = value;
    }

    /**
     * Gets the value of the prcgDt property.
     * 
     * @return
     *     possible object is
     *     {@link TradeDate7Choice }
     *     
     */
    public TradeDate7Choice getPrcgDt() {
        return prcgDt;
    }

    /**
     * Sets the value of the prcgDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeDate7Choice }
     *     
     */
    public void setPrcgDt(TradeDate7Choice value) {
        this.prcgDt = value;
    }

    /**
     * Gets the value of the twoLegTxTp property.
     * 
     * @return
     *     possible object is
     *     {@link TwoLegTransactionType4Choice }
     *     
     */
    public TwoLegTransactionType4Choice getTwoLegTxTp() {
        return twoLegTxTp;
    }

    /**
     * Sets the value of the twoLegTxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TwoLegTransactionType4Choice }
     *     
     */
    public void setTwoLegTxTp(TwoLegTransactionType4Choice value) {
        this.twoLegTxTp = value;
    }

}
