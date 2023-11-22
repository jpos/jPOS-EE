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

package org.jpos.iso20022.reda_002_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceReportCancellationV04 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PriceReportCancellationV04">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgId" type="{urn:swift:xsd:reda.002.001.04}MessageIdentification1"/>
 *         <element name="PoolRef" type="{urn:swift:xsd:reda.002.001.04}AdditionalReference3" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:swift:xsd:reda.002.001.04}AdditionalReference3" minOccurs="0"/>
 *         <element name="MsgPgntn" type="{urn:swift:xsd:reda.002.001.04}Pagination"/>
 *         <element name="PricRptId" type="{urn:swift:xsd:reda.002.001.04}Max35Text"/>
 *         <element name="CxlId" type="{urn:swift:xsd:reda.002.001.04}Max35Text"/>
 *         <element name="CxlRsn" type="{urn:swift:xsd:reda.002.001.04}Max350Text" minOccurs="0"/>
 *         <element name="XpctdPricCrrctnDt" type="{urn:swift:xsd:reda.002.001.04}DateAndDateTime1Choice" minOccurs="0"/>
 *         <element name="CmpltPricCxl" type="{urn:swift:xsd:reda.002.001.04}YesNoIndicator"/>
 *         <element name="CancPricValtnDtls" type="{urn:swift:xsd:reda.002.001.04}PriceReport3" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="Xtnsn" type="{urn:swift:xsd:reda.002.001.04}Extension1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceReportCancellationV04", propOrder = {
    "msgId",
    "poolRef",
    "prvsRef",
    "msgPgntn",
    "pricRptId",
    "cxlId",
    "cxlRsn",
    "xpctdPricCrrctnDt",
    "cmpltPricCxl",
    "cancPricValtnDtls",
    "xtnsn"
})
public class PriceReportCancellationV04 {

    @XmlElement(name = "MsgId", required = true)
    protected MessageIdentification1 msgId;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference3 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference3 prvsRef;
    @XmlElement(name = "MsgPgntn", required = true)
    protected Pagination msgPgntn;
    @XmlElement(name = "PricRptId", required = true)
    protected String pricRptId;
    @XmlElement(name = "CxlId", required = true)
    protected String cxlId;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;
    @XmlElement(name = "XpctdPricCrrctnDt")
    protected DateAndDateTime1Choice xpctdPricCrrctnDt;
    @XmlElement(name = "CmpltPricCxl")
    protected boolean cmpltPricCxl;
    @XmlElement(name = "CancPricValtnDtls")
    protected List<PriceReport3> cancPricValtnDtls;
    @XmlElement(name = "Xtnsn")
    protected List<Extension1> xtnsn;

    /**
     * Gets the value of the msgId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgId() {
        return msgId;
    }

    /**
     * Sets the value of the msgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgId(MessageIdentification1 value) {
        this.msgId = value;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public void setPoolRef(AdditionalReference3 value) {
        this.poolRef = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference3 }
     *     
     */
    public AdditionalReference3 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference3 }
     *     
     */
    public void setPrvsRef(AdditionalReference3 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the msgPgntn property.
     * 
     * @return
     *     possible object is
     *     {@link Pagination }
     *     
     */
    public Pagination getMsgPgntn() {
        return msgPgntn;
    }

    /**
     * Sets the value of the msgPgntn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagination }
     *     
     */
    public void setMsgPgntn(Pagination value) {
        this.msgPgntn = value;
    }

    /**
     * Gets the value of the pricRptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricRptId() {
        return pricRptId;
    }

    /**
     * Sets the value of the pricRptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricRptId(String value) {
        this.pricRptId = value;
    }

    /**
     * Gets the value of the cxlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlId() {
        return cxlId;
    }

    /**
     * Sets the value of the cxlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlId(String value) {
        this.cxlId = value;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRsn(String value) {
        this.cxlRsn = value;
    }

    /**
     * Gets the value of the xpctdPricCrrctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public DateAndDateTime1Choice getXpctdPricCrrctnDt() {
        return xpctdPricCrrctnDt;
    }

    /**
     * Sets the value of the xpctdPricCrrctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime1Choice }
     *     
     */
    public void setXpctdPricCrrctnDt(DateAndDateTime1Choice value) {
        this.xpctdPricCrrctnDt = value;
    }

    /**
     * Gets the value of the cmpltPricCxl property.
     * 
     */
    public boolean isCmpltPricCxl() {
        return cmpltPricCxl;
    }

    /**
     * Sets the value of the cmpltPricCxl property.
     * 
     */
    public void setCmpltPricCxl(boolean value) {
        this.cmpltPricCxl = value;
    }

    /**
     * Gets the value of the cancPricValtnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the cancPricValtnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancPricValtnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceReport3 }
     * 
     * 
     * @return
     *     The value of the cancPricValtnDtls property.
     */
    public List<PriceReport3> getCancPricValtnDtls() {
        if (cancPricValtnDtls == null) {
            cancPricValtnDtls = new ArrayList<>();
        }
        return this.cancPricValtnDtls;
    }

    /**
     * Gets the value of the xtnsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xtnsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXtnsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension1 }
     * 
     * 
     * @return
     *     The value of the xtnsn property.
     */
    public List<Extension1> getXtnsn() {
        if (xtnsn == null) {
            xtnsn = new ArrayList<>();
        }
        return this.xtnsn;
    }

}
