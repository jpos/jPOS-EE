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

package org.jpos.iso20022.casp_010_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponse7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ServiceResponse7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}CardPaymentEnvironment79"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}CardPaymentContext30"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}RetailerService3Code"/>
 *         <element name="PmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}PaymentResponse5" minOccurs="0"/>
 *         <element name="RvslRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ReversalResponse7" minOccurs="0"/>
 *         <element name="BalNqryRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}BalanceInquiryResponse5" minOccurs="0"/>
 *         <element name="LltyRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}LoyaltyResponse3" minOccurs="0"/>
 *         <element name="StordValRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}StoredValueResponse6" minOccurs="0"/>
 *         <element name="BtchRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}BatchResponse5" minOccurs="0"/>
 *         <element name="CardAcqstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}CardAcquisitionResponse3" minOccurs="0"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}ResponseType11"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:casp.010.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse7", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "pmtRspn",
    "rvslRspn",
    "balNqryRspn",
    "lltyRspn",
    "stordValRspn",
    "btchRspn",
    "cardAcqstnRspn",
    "rspn",
    "splmtryData"
})
public class ServiceResponse7 {

    @XmlElement(name = "Envt", required = true)
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt", required = true)
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService3Code svcCntt;
    @XmlElement(name = "PmtRspn")
    protected PaymentResponse5 pmtRspn;
    @XmlElement(name = "RvslRspn")
    protected ReversalResponse7 rvslRspn;
    @XmlElement(name = "BalNqryRspn")
    protected BalanceInquiryResponse5 balNqryRspn;
    @XmlElement(name = "LltyRspn")
    protected LoyaltyResponse3 lltyRspn;
    @XmlElement(name = "StordValRspn")
    protected StoredValueResponse6 stordValRspn;
    @XmlElement(name = "BtchRspn")
    protected BatchResponse5 btchRspn;
    @XmlElement(name = "CardAcqstnRspn")
    protected CardAcquisitionResponse3 cardAcqstnRspn;
    @XmlElement(name = "Rspn", required = true)
    protected ResponseType11 rspn;
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
     *     {@link RetailerService3Code }
     *     
     */
    public RetailerService3Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService3Code }
     *     
     */
    public void setSvcCntt(RetailerService3Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the pmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse5 }
     *     
     */
    public PaymentResponse5 getPmtRspn() {
        return pmtRspn;
    }

    /**
     * Sets the value of the pmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse5 }
     *     
     */
    public void setPmtRspn(PaymentResponse5 value) {
        this.pmtRspn = value;
    }

    /**
     * Gets the value of the rvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponse7 }
     *     
     */
    public ReversalResponse7 getRvslRspn() {
        return rvslRspn;
    }

    /**
     * Sets the value of the rvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponse7 }
     *     
     */
    public void setRvslRspn(ReversalResponse7 value) {
        this.rvslRspn = value;
    }

    /**
     * Gets the value of the balNqryRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceInquiryResponse5 }
     *     
     */
    public BalanceInquiryResponse5 getBalNqryRspn() {
        return balNqryRspn;
    }

    /**
     * Sets the value of the balNqryRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceInquiryResponse5 }
     *     
     */
    public void setBalNqryRspn(BalanceInquiryResponse5 value) {
        this.balNqryRspn = value;
    }

    /**
     * Gets the value of the lltyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public LoyaltyResponse3 getLltyRspn() {
        return lltyRspn;
    }

    /**
     * Sets the value of the lltyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public void setLltyRspn(LoyaltyResponse3 value) {
        this.lltyRspn = value;
    }

    /**
     * Gets the value of the stordValRspn property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public StoredValueResponse6 getStordValRspn() {
        return stordValRspn;
    }

    /**
     * Sets the value of the stordValRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public void setStordValRspn(StoredValueResponse6 value) {
        this.stordValRspn = value;
    }

    /**
     * Gets the value of the btchRspn property.
     * 
     * @return
     *     possible object is
     *     {@link BatchResponse5 }
     *     
     */
    public BatchResponse5 getBtchRspn() {
        return btchRspn;
    }

    /**
     * Sets the value of the btchRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchResponse5 }
     *     
     */
    public void setBtchRspn(BatchResponse5 value) {
        this.btchRspn = value;
    }

    /**
     * Gets the value of the cardAcqstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public CardAcquisitionResponse3 getCardAcqstnRspn() {
        return cardAcqstnRspn;
    }

    /**
     * Sets the value of the cardAcqstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public void setCardAcqstnRspn(CardAcquisitionResponse3 value) {
        this.cardAcqstnRspn = value;
    }

    /**
     * Gets the value of the rspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getRspn() {
        return rspn;
    }

    /**
     * Sets the value of the rspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setRspn(ResponseType11 value) {
        this.rspn = value;
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
