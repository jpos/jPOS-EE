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

package org.jpos.iso20022.casp_001_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRequest6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceRequest6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentEnvironment79"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardPaymentContext30"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}RetailerService2Code"/>
 *         <element name="PmtReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}PaymentRequest5" minOccurs="0"/>
 *         <element name="RvslReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}ReversalRequest5" minOccurs="0"/>
 *         <element name="BalNqryReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}BalanceInquiryRequest6" minOccurs="0"/>
 *         <element name="LltyReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}LoyaltyRequest5" minOccurs="0"/>
 *         <element name="StordValReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}StoredValueRequest6" minOccurs="0"/>
 *         <element name="BtchReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}BatchRequest5" minOccurs="0"/>
 *         <element name="NblSvcReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}EnableServiceRequest5" minOccurs="0"/>
 *         <element name="CardAcqstnReq" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}CardAcquisitionRequest3" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:casp.001.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRequest6", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "pmtReq",
    "rvslReq",
    "balNqryReq",
    "lltyReq",
    "stordValReq",
    "btchReq",
    "nblSvcReq",
    "cardAcqstnReq",
    "splmtryData"
})
public class ServiceRequest6 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService2Code svcCntt;
    @XmlElement(name = "PmtReq")
    protected PaymentRequest5 pmtReq;
    @XmlElement(name = "RvslReq")
    protected ReversalRequest5 rvslReq;
    @XmlElement(name = "BalNqryReq")
    protected BalanceInquiryRequest6 balNqryReq;
    @XmlElement(name = "LltyReq")
    protected LoyaltyRequest5 lltyReq;
    @XmlElement(name = "StordValReq")
    protected StoredValueRequest6 stordValReq;
    @XmlElement(name = "BtchReq")
    protected BatchRequest5 btchReq;
    @XmlElement(name = "NblSvcReq")
    protected EnableServiceRequest5 nblSvcReq;
    @XmlElement(name = "CardAcqstnReq")
    protected CardAcquisitionRequest3 cardAcqstnReq;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the envt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public CardPaymentEnvironment79 getEnvt() {
        return envt;
    }

    /**
     * Sets the value of the envt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentEnvironment79 }
     *     
     */
    public void setEnvt(CardPaymentEnvironment79 value) {
        this.envt = value;
    }

    /**
     * Gets the value of the cntxt property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public CardPaymentContext30 getCntxt() {
        return cntxt;
    }

    /**
     * Sets the value of the cntxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentContext30 }
     *     
     */
    public void setCntxt(CardPaymentContext30 value) {
        this.cntxt = value;
    }

    /**
     * Gets the value of the svcCntt property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerService2Code }
     *     
     */
    public RetailerService2Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService2Code }
     *     
     */
    public void setSvcCntt(RetailerService2Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the pmtReq property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentRequest5 }
     *     
     */
    public PaymentRequest5 getPmtReq() {
        return pmtReq;
    }

    /**
     * Sets the value of the pmtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentRequest5 }
     *     
     */
    public void setPmtReq(PaymentRequest5 value) {
        this.pmtReq = value;
    }

    /**
     * Gets the value of the rvslReq property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalRequest5 }
     *     
     */
    public ReversalRequest5 getRvslReq() {
        return rvslReq;
    }

    /**
     * Sets the value of the rvslReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalRequest5 }
     *     
     */
    public void setRvslReq(ReversalRequest5 value) {
        this.rvslReq = value;
    }

    /**
     * Gets the value of the balNqryReq property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryRequest6 }
     *     
     */
    public BalanceInquiryRequest6 getBalNqryReq() {
        return balNqryReq;
    }

    /**
     * Sets the value of the balNqryReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryRequest6 }
     *     
     */
    public void setBalNqryReq(BalanceInquiryRequest6 value) {
        this.balNqryReq = value;
    }

    /**
     * Gets the value of the lltyReq property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public LoyaltyRequest5 getLltyReq() {
        return lltyReq;
    }

    /**
     * Sets the value of the lltyReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRequest5 }
     *     
     */
    public void setLltyReq(LoyaltyRequest5 value) {
        this.lltyReq = value;
    }

    /**
     * Gets the value of the stordValReq property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public StoredValueRequest6 getStordValReq() {
        return stordValReq;
    }

    /**
     * Sets the value of the stordValReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueRequest6 }
     *     
     */
    public void setStordValReq(StoredValueRequest6 value) {
        this.stordValReq = value;
    }

    /**
     * Gets the value of the btchReq property.
     * 
     * @return
     *     possible object is
     *     {@link BatchRequest5 }
     *     
     */
    public BatchRequest5 getBtchReq() {
        return btchReq;
    }

    /**
     * Sets the value of the btchReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchRequest5 }
     *     
     */
    public void setBtchReq(BatchRequest5 value) {
        this.btchReq = value;
    }

    /**
     * Gets the value of the nblSvcReq property.
     * 
     * @return
     *     possible object is
     *     {@link EnableServiceRequest5 }
     *     
     */
    public EnableServiceRequest5 getNblSvcReq() {
        return nblSvcReq;
    }

    /**
     * Sets the value of the nblSvcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnableServiceRequest5 }
     *     
     */
    public void setNblSvcReq(EnableServiceRequest5 value) {
        this.nblSvcReq = value;
    }

    /**
     * Gets the value of the cardAcqstnReq property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionRequest3 }
     *     
     */
    public CardAcquisitionRequest3 getCardAcqstnReq() {
        return cardAcqstnReq;
    }

    /**
     * Sets the value of the cardAcqstnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionRequest3 }
     *     
     */
    public void setCardAcqstnReq(CardAcquisitionRequest3 value) {
        this.cardAcqstnReq = value;
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
