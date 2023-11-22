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

package org.jpos.iso20022.tsmt_027_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusChangeRequestAcceptanceV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusChangeRequestAcceptanceV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="AccptncId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.027.001.02}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.027.001.02}SimpleIdentificationInformation"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.027.001.02}SimpleIdentificationInformation" minOccurs="0"/>
 *         <element name="AccptdSts" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.027.001.02}TransactionStatus3"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeRequestAcceptanceV02", propOrder = {
    "accptncId",
    "txId",
    "submitrTxRef",
    "accptdSts"
})
public class StatusChangeRequestAcceptanceV02 {

    @XmlElement(name = "AccptncId", required = true)
    protected MessageIdentification1 accptncId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "AccptdSts", required = true)
    protected TransactionStatus3 accptdSts;

    /**
     * Gets the value of the accptncId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getAccptncId() {
        return accptncId;
    }

    /**
     * Sets the value of the accptncId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setAccptncId(MessageIdentification1 value) {
        this.accptncId = value;
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
     * Gets the value of the accptdSts property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatus3 }
     *     
     */
    public TransactionStatus3 getAccptdSts() {
        return accptdSts;
    }

    /**
     * Sets the value of the accptdSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatus3 }
     *     
     */
    public void setAccptdSts(TransactionStatus3 value) {
        this.accptdSts = value;
    }

}
