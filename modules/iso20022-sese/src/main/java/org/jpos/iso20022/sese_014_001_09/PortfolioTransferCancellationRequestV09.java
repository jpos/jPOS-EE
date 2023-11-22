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

package org.jpos.iso20022.sese_014_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioTransferCancellationRequestV09 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PortfolioTransferCancellationRequestV09">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="MsgRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}MessageIdentification1"/>
 *         <element name="PoolRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}AdditionalReference11" minOccurs="0"/>
 *         <element name="PrvsRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="RltdRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}AdditionalReference10" minOccurs="0"/>
 *         <element name="MstrRef" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}Max35Text" minOccurs="0"/>
 *         <element name="TrfRefs" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}TransferReference14"/>
 *         <element name="MktPrctcVrsn" type="{urn:iso:std:iso:20022:tech:xsd:sese.014.001.09}MarketPracticeVersion1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioTransferCancellationRequestV09", propOrder = {
    "msgRef",
    "poolRef",
    "prvsRef",
    "rltdRef",
    "mstrRef",
    "trfRefs",
    "mktPrctcVrsn"
})
public class PortfolioTransferCancellationRequestV09 {

    @XmlElement(name = "MsgRef", required = true)
    protected MessageIdentification1 msgRef;
    @XmlElement(name = "PoolRef")
    protected AdditionalReference11 poolRef;
    @XmlElement(name = "PrvsRef")
    protected AdditionalReference10 prvsRef;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "TrfRefs", required = true)
    protected TransferReference14 trfRefs;
    @XmlElement(name = "MktPrctcVrsn")
    protected MarketPracticeVersion1 mktPrctcVrsn;

    /**
     * Gets the value of the msgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getMsgRef() {
        return msgRef;
    }

    /**
     * Sets the value of the msgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setMsgRef(MessageIdentification1 value) {
        this.msgRef = value;
    }

    /**
     * Gets the value of the poolRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference11 }
     *     
     */
    public AdditionalReference11 getPoolRef() {
        return poolRef;
    }

    /**
     * Sets the value of the poolRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference11 }
     *     
     */
    public void setPoolRef(AdditionalReference11 value) {
        this.poolRef = value;
    }

    /**
     * Gets the value of the prvsRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getPrvsRef() {
        return prvsRef;
    }

    /**
     * Sets the value of the prvsRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setPrvsRef(AdditionalReference10 value) {
        this.prvsRef = value;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public void setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
    }

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
     * Gets the value of the trfRefs property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReference14 }
     *     
     */
    public TransferReference14 getTrfRefs() {
        return trfRefs;
    }

    /**
     * Sets the value of the trfRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReference14 }
     *     
     */
    public void setTrfRefs(TransferReference14 value) {
        this.trfRefs = value;
    }

    /**
     * Gets the value of the mktPrctcVrsn property.
     * 
     * @return
     *     possible object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public MarketPracticeVersion1 getMktPrctcVrsn() {
        return mktPrctcVrsn;
    }

    /**
     * Sets the value of the mktPrctcVrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketPracticeVersion1 }
     *     
     */
    public void setMktPrctcVrsn(MarketPracticeVersion1 value) {
        this.mktPrctcVrsn = value;
    }

}
