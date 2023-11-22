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

package org.jpos.iso20022.casp_015_001_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageStatusResponseData7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MessageStatusResponseData7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XchgId" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}Max35Text"/>
 *         <element name="InitgPty" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}GenericIdentification177"/>
 *         <element name="TxRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}ResponseType11"/>
 *         <element name="RpeatdLltyRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}LoyaltyResponse3" minOccurs="0"/>
 *         <element name="RpeatdPmtRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}PaymentResponse5" minOccurs="0"/>
 *         <element name="RpeatdRvslRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}ReversalResponse7" minOccurs="0"/>
 *         <element name="RpeatdStordValRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}StoredValueResponse6" minOccurs="0"/>
 *         <element name="RpeatdCardAcqstnRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}CardAcquisitionResponse3" minOccurs="0"/>
 *         <element name="RpeatdSndApplPrtcolDataUnitCardRdrRspn" type="{urn:iso:std:iso:20022:tech:xsd:casp.015.001.05}DeviceSendApplicationProtocolDataUnitCardReaderResponse1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageStatusResponseData7", propOrder = {
    "xchgId",
    "initgPty",
    "txRspn",
    "rpeatdLltyRspn",
    "rpeatdPmtRspn",
    "rpeatdRvslRspn",
    "rpeatdStordValRspn",
    "rpeatdCardAcqstnRspn",
    "rpeatdSndApplPrtcolDataUnitCardRdrRspn"
})
public class MessageStatusResponseData7 {

    @XmlElement(name = "XchgId", required = true)
    protected String xchgId;
    @XmlElement(name = "InitgPty", required = true)
    protected GenericIdentification177 initgPty;
    @XmlElement(name = "TxRspn", required = true)
    protected ResponseType11 txRspn;
    @XmlElement(name = "RpeatdLltyRspn")
    protected LoyaltyResponse3 rpeatdLltyRspn;
    @XmlElement(name = "RpeatdPmtRspn")
    protected PaymentResponse5 rpeatdPmtRspn;
    @XmlElement(name = "RpeatdRvslRspn")
    protected ReversalResponse7 rpeatdRvslRspn;
    @XmlElement(name = "RpeatdStordValRspn")
    protected StoredValueResponse6 rpeatdStordValRspn;
    @XmlElement(name = "RpeatdCardAcqstnRspn")
    protected CardAcquisitionResponse3 rpeatdCardAcqstnRspn;
    @XmlElement(name = "RpeatdSndApplPrtcolDataUnitCardRdrRspn")
    protected DeviceSendApplicationProtocolDataUnitCardReaderResponse1 rpeatdSndApplPrtcolDataUnitCardRdrRspn;

    /**
     * Gets the value of the xchgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXchgId() {
        return xchgId;
    }

    /**
     * Sets the value of the xchgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXchgId(String value) {
        this.xchgId = value;
    }

    /**
     * Gets the value of the initgPty property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification177 }
     *     
     */
    public GenericIdentification177 getInitgPty() {
        return initgPty;
    }

    /**
     * Sets the value of the initgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification177 }
     *     
     */
    public void setInitgPty(GenericIdentification177 value) {
        this.initgPty = value;
    }

    /**
     * Gets the value of the txRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType11 }
     *     
     */
    public ResponseType11 getTxRspn() {
        return txRspn;
    }

    /**
     * Sets the value of the txRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType11 }
     *     
     */
    public void setTxRspn(ResponseType11 value) {
        this.txRspn = value;
    }

    /**
     * Gets the value of the rpeatdLltyRspn property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public LoyaltyResponse3 getRpeatdLltyRspn() {
        return rpeatdLltyRspn;
    }

    /**
     * Sets the value of the rpeatdLltyRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyResponse3 }
     *     
     */
    public void setRpeatdLltyRspn(LoyaltyResponse3 value) {
        this.rpeatdLltyRspn = value;
    }

    /**
     * Gets the value of the rpeatdPmtRspn property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentResponse5 }
     *     
     */
    public PaymentResponse5 getRpeatdPmtRspn() {
        return rpeatdPmtRspn;
    }

    /**
     * Sets the value of the rpeatdPmtRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentResponse5 }
     *     
     */
    public void setRpeatdPmtRspn(PaymentResponse5 value) {
        this.rpeatdPmtRspn = value;
    }

    /**
     * Gets the value of the rpeatdRvslRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalResponse7 }
     *     
     */
    public ReversalResponse7 getRpeatdRvslRspn() {
        return rpeatdRvslRspn;
    }

    /**
     * Sets the value of the rpeatdRvslRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalResponse7 }
     *     
     */
    public void setRpeatdRvslRspn(ReversalResponse7 value) {
        this.rpeatdRvslRspn = value;
    }

    /**
     * Gets the value of the rpeatdStordValRspn property.
     * 
     * @return
     *     possible object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public StoredValueResponse6 getRpeatdStordValRspn() {
        return rpeatdStordValRspn;
    }

    /**
     * Sets the value of the rpeatdStordValRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link StoredValueResponse6 }
     *     
     */
    public void setRpeatdStordValRspn(StoredValueResponse6 value) {
        this.rpeatdStordValRspn = value;
    }

    /**
     * Gets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public CardAcquisitionResponse3 getRpeatdCardAcqstnRspn() {
        return rpeatdCardAcqstnRspn;
    }

    /**
     * Sets the value of the rpeatdCardAcqstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAcquisitionResponse3 }
     *     
     */
    public void setRpeatdCardAcqstnRspn(CardAcquisitionResponse3 value) {
        this.rpeatdCardAcqstnRspn = value;
    }

    /**
     * Gets the value of the rpeatdSndApplPrtcolDataUnitCardRdrRspn property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public DeviceSendApplicationProtocolDataUnitCardReaderResponse1 getRpeatdSndApplPrtcolDataUnitCardRdrRspn() {
        return rpeatdSndApplPrtcolDataUnitCardRdrRspn;
    }

    /**
     * Sets the value of the rpeatdSndApplPrtcolDataUnitCardRdrRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceSendApplicationProtocolDataUnitCardReaderResponse1 }
     *     
     */
    public void setRpeatdSndApplPrtcolDataUnitCardRdrRspn(DeviceSendApplicationProtocolDataUnitCardReaderResponse1 value) {
        this.rpeatdSndApplPrtcolDataUnitCardRdrRspn = value;
    }

}
