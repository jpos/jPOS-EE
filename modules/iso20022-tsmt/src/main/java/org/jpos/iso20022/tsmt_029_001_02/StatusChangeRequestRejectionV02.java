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

package org.jpos.iso20022.tsmt_029_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusChangeRequestRejectionV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusChangeRequestRejectionV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02}SimpleIdentificationInformation"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02}SimpleIdentificationInformation" minOccurs="0"/>
 *         <element name="RjctdStsChng" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02}TransactionStatus3"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.029.001.02}Reason2"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeRequestRejectionV02", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "rjctdStsChng",
    "rjctnRsn"
})
public class StatusChangeRequestRejectionV02 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "RjctdStsChng", required = true)
    protected TransactionStatus3 rjctdStsChng;
    @XmlElement(name = "RjctnRsn", required = true)
    protected Reason2 rjctnRsn;

    /**
     * Gets the value of the rjctnId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRjctnId() {
        return rjctnId;
    }

    /**
     * Sets the value of the rjctnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRjctnId(MessageIdentification1 value) {
        this.rjctnId = value;
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
     * Gets the value of the rjctdStsChng property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getRjctdStsChng() {
        return rjctdStsChng;
    }

    /**
     * Sets the value of the rjctdStsChng property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public void setRjctdStsChng(TransactionStatus3 value) {
        this.rjctdStsChng = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link Reason2 }
     *     
     */
    public Reason2 getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reason2 }
     *     
     */
    public void setRjctnRsn(Reason2 value) {
        this.rjctnRsn = value;
    }

}
