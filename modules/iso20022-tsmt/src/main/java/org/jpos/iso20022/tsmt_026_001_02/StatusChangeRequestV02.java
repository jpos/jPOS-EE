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

package org.jpos.iso20022.tsmt_026_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusChangeRequestV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusChangeRequestV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="ReqId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.026.001.02}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.026.001.02}SimpleIdentificationInformation"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.026.001.02}SimpleIdentificationInformation" minOccurs="0"/>
 *         <element name="ReqdSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.026.001.02}TransactionStatus3"/>
 *         <element name="ReqRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.026.001.02}Reason2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeRequestV02", propOrder = {
    "reqId",
    "txId",
    "submitrTxRef",
    "reqdSts",
    "reqRsn"
})
public class StatusChangeRequestV02 {

    @XmlElement(name = "ReqId", required = true)
    protected MessageIdentification1 reqId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "ReqdSts", required = true)
    protected TransactionStatus3 reqdSts;
    @XmlElement(name = "ReqRsn")
    protected Reason2 reqRsn;

    /**
     * Gets the value of the reqId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getReqId() {
        return reqId;
    }

    /**
     * Sets the value of the reqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setReqId(MessageIdentification1 value) {
        this.reqId = value;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public void setTxId(SimpleIdentificationInformation value) {
        this.txId = value;
    }

    /**
     * Gets the value of the submitrTxRef property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public SimpleIdentificationInformation getSubmitrTxRef() {
        return submitrTxRef;
    }

    /**
     * Sets the value of the submitrTxRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleIdentificationInformation }
     *     
     */
    public void setSubmitrTxRef(SimpleIdentificationInformation value) {
        this.submitrTxRef = value;
    }

    /**
     * Gets the value of the reqdSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getReqdSts() {
        return reqdSts;
    }

    /**
     * Sets the value of the reqdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public void setReqdSts(TransactionStatus3 value) {
        this.reqdSts = value;
    }

    /**
     * Gets the value of the reqRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getReqRsn() {
        return reqRsn;
    }

    /**
     * Sets the value of the reqRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public void setReqRsn(Reason2 value) {
        this.reqRsn = value;
    }

}
