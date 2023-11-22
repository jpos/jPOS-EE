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

package org.jpos.iso20022.setr_016_001_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndividualOrderStatusAndReason7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="IndividualOrderStatusAndReason7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text" minOccurs="0"/>
 *         <element name="OrdrRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text"/>
 *         <element name="ClntRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text" minOccurs="0"/>
 *         <element name="DealRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text" minOccurs="0"/>
 *         <element name="CxlRef" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Max35Text" minOccurs="0"/>
 *         <element name="OrdrSts" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}OrderStatus5Choice"/>
 *         <element name="RprdFee" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}Fee3" maxOccurs="10" minOccurs="0"/>
 *         <element name="StsInitr" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}PartyIdentification113" minOccurs="0"/>
 *         <element name="OrdrData" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}FundOrderData5" minOccurs="0"/>
 *         <element name="NewDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}ExpectedExecutionDetails4" minOccurs="0"/>
 *         <element name="GtgOrHldBckDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.016.001.04}HoldBackInformation3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderStatusAndReason7", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "cxlRef",
    "ordrSts",
    "rprdFee",
    "stsInitr",
    "ordrData",
    "newDtls",
    "gtgOrHldBckDtls"
})
public class IndividualOrderStatusAndReason7 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "CxlRef")
    protected String cxlRef;
    @XmlElement(name = "OrdrSts", required = true)
    protected OrderStatus5Choice ordrSts;
    @XmlElement(name = "RprdFee")
    protected List<Fee3> rprdFee;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification113 stsInitr;
    @XmlElement(name = "OrdrData")
    protected FundOrderData5 ordrData;
    @XmlElement(name = "NewDtls")
    protected ExpectedExecutionDetails4 newDtls;
    @XmlElement(name = "GtgOrHldBckDtls")
    protected HoldBackInformation3 gtgOrHldBckDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMstrRef(String value) {
        this.mstrRef = value;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdrRef(String value) {
        this.ordrRef = value;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClntRef(String value) {
        this.clntRef = value;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealRef(String value) {
        this.dealRef = value;
    }

    /**
     * Gets the value of the cxlRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRef() {
        return cxlRef;
    }

    /**
     * Sets the value of the cxlRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCxlRef(String value) {
        this.cxlRef = value;
    }

    /**
     * Gets the value of the ordrSts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus5Choice }
     *     
     */
    public OrderStatus5Choice getOrdrSts() {
        return ordrSts;
    }

    /**
     * Sets the value of the ordrSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus5Choice }
     *     
     */
    public void setOrdrSts(OrderStatus5Choice value) {
        this.ordrSts = value;
    }

    /**
     * Gets the value of the rprdFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rprdFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRprdFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee3 }
     * 
     * 
     * @return
     *     The value of the rprdFee property.
     */
    public List<Fee3> getRprdFee() {
        if (rprdFee == null) {
            rprdFee = new ArrayList<>();
        }
        return this.rprdFee;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification113 }
     *     
     */
    public PartyIdentification113 getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification113 }
     *     
     */
    public void setStsInitr(PartyIdentification113 value) {
        this.stsInitr = value;
    }

    /**
     * Gets the value of the ordrData property.
     * 
     * @return
     *     possible object is
     *     {@link FundOrderData5 }
     *     
     */
    public FundOrderData5 getOrdrData() {
        return ordrData;
    }

    /**
     * Sets the value of the ordrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundOrderData5 }
     *     
     */
    public void setOrdrData(FundOrderData5 value) {
        this.ordrData = value;
    }

    /**
     * Gets the value of the newDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ExpectedExecutionDetails4 }
     *     
     */
    public ExpectedExecutionDetails4 getNewDtls() {
        return newDtls;
    }

    /**
     * Sets the value of the newDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpectedExecutionDetails4 }
     *     
     */
    public void setNewDtls(ExpectedExecutionDetails4 value) {
        this.newDtls = value;
    }

    /**
     * Gets the value of the gtgOrHldBckDtls property.
     * 
     * @return
     *     possible object is
     *     {@link HoldBackInformation3 }
     *     
     */
    public HoldBackInformation3 getGtgOrHldBckDtls() {
        return gtgOrHldBckDtls;
    }

    /**
     * Sets the value of the gtgOrHldBckDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldBackInformation3 }
     *     
     */
    public void setGtgOrHldBckDtls(HoldBackInformation3 value) {
        this.gtgOrHldBckDtls = value;
    }

}
