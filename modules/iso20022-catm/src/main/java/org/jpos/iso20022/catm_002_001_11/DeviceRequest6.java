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

package org.jpos.iso20022.catm_002_001_11;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceRequest6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceRequest6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}CardPaymentEnvironment79" minOccurs="0"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}CardPaymentContext30" minOccurs="0"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}RetailerService8Code"/>
 *         <element name="DispReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceDisplayRequest5" minOccurs="0"/>
 *         <element name="InptReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceInputRequest5" minOccurs="0"/>
 *         <element name="PrtReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DevicePrintRequest5" minOccurs="0"/>
 *         <element name="PlayRsrcReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DevicePlayResourceRequest1" minOccurs="0"/>
 *         <element name="ScrInptReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceSecureInputRequest5" minOccurs="0"/>
 *         <element name="InitlstnCardRdrReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceInitialisationCardReaderRequest5" minOccurs="0"/>
 *         <element name="CardRdrAPDUReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceSendApplicationProtocolDataUnitCardReaderRequest1" minOccurs="0"/>
 *         <element name="PwrOffCardRdrReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DevicePoweroffCardReaderRequest5" minOccurs="0"/>
 *         <element name="TrnsmssnReq" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceTransmitMessageRequest2" minOccurs="0"/>
 *         <element name="InptNtfctn" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}DeviceInputNotification5" minOccurs="0"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:catm.002.001.11}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceRequest6", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispReq",
    "inptReq",
    "prtReq",
    "playRsrcReq",
    "scrInptReq",
    "initlstnCardRdrReq",
    "cardRdrAPDUReq",
    "pwrOffCardRdrReq",
    "trnsmssnReq",
    "inptNtfctn",
    "splmtryData"
})
public class DeviceRequest6 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService8Code svcCntt;
    @XmlElement(name = "DispReq")
    protected DeviceDisplayRequest5 dispReq;
    @XmlElement(name = "InptReq")
    protected DeviceInputRequest5 inptReq;
    @XmlElement(name = "PrtReq")
    protected DevicePrintRequest5 prtReq;
    @XmlElement(name = "PlayRsrcReq")
    protected DevicePlayResourceRequest1 playRsrcReq;
    @XmlElement(name = "ScrInptReq")
    protected DeviceSecureInputRequest5 scrInptReq;
    @XmlElement(name = "InitlstnCardRdrReq")
    protected DeviceInitialisationCardReaderRequest5 initlstnCardRdrReq;
    @XmlElement(name = "CardRdrAPDUReq")
    protected DeviceSendApplicationProtocolDataUnitCardReaderRequest1 cardRdrAPDUReq;
    @XmlElement(name = "PwrOffCardRdrReq")
    protected DevicePoweroffCardReaderRequest5 pwrOffCardRdrReq;
    @XmlElement(name = "TrnsmssnReq")
    protected DeviceTransmitMessageRequest2 trnsmssnReq;
    @XmlElement(name = "InptNtfctn")
    protected DeviceInputNotification5 inptNtfctn;
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
     *     {@link RetailerService8Code }
     *     
     */
    public RetailerService8Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService8Code }
     *     
     */
    public void setSvcCntt(RetailerService8Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the dispReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayRequest5 }
     *     
     */
    public DeviceDisplayRequest5 getDispReq() {
        return dispReq;
    }

    /**
     * Sets the value of the dispReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayRequest5 }
     *     
     */
    public void setDispReq(DeviceDisplayRequest5 value) {
        this.dispReq = value;
    }

    /**
     * Gets the value of the inptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputRequest5 }
     *     
     */
    public DeviceInputRequest5 getInptReq() {
        return inptReq;
    }

    /**
     * Sets the value of the inptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputRequest5 }
     *     
     */
    public void setInptReq(DeviceInputRequest5 value) {
        this.inptReq = value;
    }

    /**
     * Gets the value of the prtReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintRequest5 }
     *     
     */
    public DevicePrintRequest5 getPrtReq() {
        return prtReq;
    }

    /**
     * Sets the value of the prtReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintRequest5 }
     *     
     */
    public void setPrtReq(DevicePrintRequest5 value) {
        this.prtReq = value;
    }

    /**
     * Gets the value of the playRsrcReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePlayResourceRequest1 }
     *     
     */
    public DevicePlayResourceRequest1 getPlayRsrcReq() {
        return playRsrcReq;
    }

    /**
     * Sets the value of the playRsrcReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePlayResourceRequest1 }
     *     
     */
    public void setPlayRsrcReq(DevicePlayResourceRequest1 value) {
        this.playRsrcReq = value;
    }

    /**
     * Gets the value of the scrInptReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputRequest5 }
     *     
     */
    public DeviceSecureInputRequest5 getScrInptReq() {
        return scrInptReq;
    }

    /**
     * Sets the value of the scrInptReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputRequest5 }
     *     
     */
    public void setScrInptReq(DeviceSecureInputRequest5 value) {
        this.scrInptReq = value;
    }

    /**
     * Gets the value of the initlstnCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderRequest5 }
     *     
     */
    public DeviceInitialisationCardReaderRequest5 getInitlstnCardRdrReq() {
        return initlstnCardRdrReq;
    }

    /**
     * Sets the value of the initlstnCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderRequest5 }
     *     
     */
    public void setInitlstnCardRdrReq(DeviceInitialisationCardReaderRequest5 value) {
        this.initlstnCardRdrReq = value;
    }

    /**
     * Gets the value of the cardRdrAPDUReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderRequest1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderRequest1 getCardRdrAPDUReq() {
        return cardRdrAPDUReq;
    }

    /**
     * Sets the value of the cardRdrAPDUReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderRequest1 }
     *     
     */
    public void setCardRdrAPDUReq(DeviceSendApplicationProtocolDataUnitCardReaderRequest1 value) {
        this.cardRdrAPDUReq = value;
    }

    /**
     * Gets the value of the pwrOffCardRdrReq property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePoweroffCardReaderRequest5 }
     *     
     */
    public DevicePoweroffCardReaderRequest5 getPwrOffCardRdrReq() {
        return pwrOffCardRdrReq;
    }

    /**
     * Sets the value of the pwrOffCardRdrReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePoweroffCardReaderRequest5 }
     *     
     */
    public void setPwrOffCardRdrReq(DevicePoweroffCardReaderRequest5 value) {
        this.pwrOffCardRdrReq = value;
    }

    /**
     * Gets the value of the trnsmssnReq property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransmitMessageRequest2 }
     *     
     */
    public DeviceTransmitMessageRequest2 getTrnsmssnReq() {
        return trnsmssnReq;
    }

    /**
     * Sets the value of the trnsmssnReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransmitMessageRequest2 }
     *     
     */
    public void setTrnsmssnReq(DeviceTransmitMessageRequest2 value) {
        this.trnsmssnReq = value;
    }

    /**
     * Gets the value of the inptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputNotification5 }
     *     
     */
    public DeviceInputNotification5 getInptNtfctn() {
        return inptNtfctn;
    }

    /**
     * Sets the value of the inptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputNotification5 }
     *     
     */
    public void setInptNtfctn(DeviceInputNotification5 value) {
        this.inptNtfctn = value;
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
