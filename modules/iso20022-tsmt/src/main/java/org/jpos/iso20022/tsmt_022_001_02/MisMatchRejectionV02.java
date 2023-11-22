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

package org.jpos.iso20022.tsmt_022_001_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MisMatchRejectionV02 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MisMatchRejectionV02">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}SimpleIdentificationInformation"/>
 *         <element name="SubmitrTxRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}SimpleIdentificationInformation" minOccurs="0"/>
 *         <element name="DataSetMtchRptRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}MessageIdentification1"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.022.001.02}RejectionReason1Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MisMatchRejectionV02", propOrder = {
    "rjctnId",
    "txId",
    "submitrTxRef",
    "dataSetMtchRptRef",
    "rjctnRsn"
})
public class MisMatchRejectionV02 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "SubmitrTxRef")
    protected SimpleIdentificationInformation submitrTxRef;
    @XmlElement(name = "DataSetMtchRptRef", required = true)
    protected MessageIdentification1 dataSetMtchRptRef;
    @XmlElement(name = "RjctnRsn", required = true)
    protected RejectionReason1Choice rjctnRsn;

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
     * Gets the value of the dataSetMtchRptRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getDataSetMtchRptRef() {
        return dataSetMtchRptRef;
    }

    /**
     * Sets the value of the dataSetMtchRptRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setDataSetMtchRptRef(MessageIdentification1 value) {
        this.dataSetMtchRptRef = value;
    }

    /**
     * Gets the value of the rjctnRsn property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public RejectionReason1Choice getRjctnRsn() {
        return rjctnRsn;
    }

    /**
     * Sets the value of the rjctnRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason1Choice }
     *     
     */
    public void setRjctnRsn(RejectionReason1Choice value) {
        this.rjctnRsn = value;
    }

}
