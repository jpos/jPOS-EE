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

package org.jpos.iso20022.casp_006_001_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceResponse6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceResponse6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Envt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}CardPaymentEnvironment79" minOccurs="0"/>
 *         <element name="Cntxt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}CardPaymentContext30" minOccurs="0"/>
 *         <element name="SvcCntt" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}RetailerService9Code"/>
 *         <element name="DispRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceDisplayResponse2" minOccurs="0"/>
 *         <element name="InptRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceInputResponse5" minOccurs="0"/>
 *         <element name="PrtRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DevicePrintResponse1" minOccurs="0"/>
 *         <element name="ScrInptRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceSecureInputResponse5" minOccurs="0"/>
 *         <element name="InitlstnCardRdrRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceInitialisationCardReaderResponse2" minOccurs="0"/>
 *         <element name="CardRdrApplPrtcolDataUnitRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceSendApplicationProtocolDataUnitCardReaderResponse1" minOccurs="0"/>
 *         <element name="TrnsmssnRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}DeviceTransmitMessageResponse1" minOccurs="0"/>
 *         <element name="Rspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}ResponseType11"/>
 *         <element name="SplmtryData" type="{urn:iso:std:iso:20022:tech:xsd:casp.006.001.05}SupplementaryData1" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceResponse6", propOrder = {
    "envt",
    "cntxt",
    "svcCntt",
    "dispRspn",
    "inptRspn",
    "prtRspn",
    "scrInptRspn",
    "initlstnCardRdrRspn",
    "cardRdrApplPrtcolDataUnitRspn",
    "trnsmssnRspn",
    "rspn",
    "splmtryData"
})
public class DeviceResponse6 {

    @XmlElement(name = "Envt")
    protected CardPaymentEnvironment79 envt;
    @XmlElement(name = "Cntxt")
    protected CardPaymentContext30 cntxt;
    @XmlElement(name = "SvcCntt", required = true)
    @XmlSchemaType(name = "string")
    protected RetailerService9Code svcCntt;
    @XmlElement(name = "DispRspn")
    protected DeviceDisplayResponse2 dispRspn;
    @XmlElement(name = "InptRspn")
    protected DeviceInputResponse5 inptRspn;
    @XmlElement(name = "PrtRspn")
    protected DevicePrintResponse1 prtRspn;
    @XmlElement(name = "ScrInptRspn")
    protected DeviceSecureInputResponse5 scrInptRspn;
    @XmlElement(name = "InitlstnCardRdrRspn")
    protected DeviceInitialisationCardReaderResponse2 initlstnCardRdrRspn;
    @XmlElement(name = "CardRdrApplPrtcolDataUnitRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 cardRdrApplPrtcolDataUnitRspn;
    @XmlElement(name = "TrnsmssnRspn")
    protected DeviceTransmitMessageResponse1 trnsmssnRspn;
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
     *     {@link RetailerService9Code }
     *     
     */
    public RetailerService9Code getSvcCntt() {
        return svcCntt;
    }

    /**
     * Sets the value of the svcCntt property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerService9Code }
     *     
     */
    public void setSvcCntt(RetailerService9Code value) {
        this.svcCntt = value;
    }

    /**
     * Gets the value of the dispRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public DeviceDisplayResponse2 getDispRspn() {
        return dispRspn;
    }

    /**
     * Sets the value of the dispRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceDisplayResponse2 }
     *     
     */
    public void setDispRspn(DeviceDisplayResponse2 value) {
        this.dispRspn = value;
    }

    /**
     * Gets the value of the inptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInputResponse5 }
     *     
     */
    public DeviceInputResponse5 getInptRspn() {
        return inptRspn;
    }

    /**
     * Sets the value of the inptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInputResponse5 }
     *     
     */
    public void setInptRspn(DeviceInputResponse5 value) {
        this.inptRspn = value;
    }

    /**
     * Gets the value of the prtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public DevicePrintResponse1 getPrtRspn() {
        return prtRspn;
    }

    /**
     * Sets the value of the prtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePrintResponse1 }
     *     
     */
    public void setPrtRspn(DevicePrintResponse1 value) {
        this.prtRspn = value;
    }

    /**
     * Gets the value of the scrInptRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSecureInputResponse5 }
     *     
     */
    public DeviceSecureInputResponse5 getScrInptRspn() {
        return scrInptRspn;
    }

    /**
     * Sets the value of the scrInptRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSecureInputResponse5 }
     *     
     */
    public void setScrInptRspn(DeviceSecureInputResponse5 value) {
        this.scrInptRspn = value;
    }

    /**
     * Gets the value of the initlstnCardRdrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public DeviceInitialisationCardReaderResponse2 getInitlstnCardRdrRspn() {
        return initlstnCardRdrRspn;
    }

    /**
     * Sets the value of the initlstnCardRdrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceInitialisationCardReaderResponse2 }
     *     
     */
    public void setInitlstnCardRdrRspn(DeviceInitialisationCardReaderResponse2 value) {
        this.initlstnCardRdrRspn = value;
    }

    /**
     * Gets the value of the cardRdrApplPrtcolDataUnitRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 getCardRdrApplPrtcolDataUnitRspn() {
        return cardRdrApplPrtcolDataUnitRspn;
    }

    /**
     * Sets the value of the cardRdrApplPrtcolDataUnitRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public void setCardRdrApplPrtcolDataUnitRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
        this.cardRdrApplPrtcolDataUnitRspn = value;
    }

    /**
     * Gets the value of the trnsmssnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public DeviceTransmitMessageResponse1 getTrnsmssnRspn() {
        return trnsmssnRspn;
    }

    /**
     * Sets the value of the trnsmssnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceTransmitMessageResponse1 }
     *     
     */
    public void setTrnsmssnRspn(DeviceTransmitMessageResponse1 value) {
        this.trnsmssnRspn = value;
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
