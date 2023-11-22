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

package org.jpos.iso20022.tsmt_050_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleAndBaselineRejectionV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="RoleAndBaselineRejectionV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RjctnId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01}MessageIdentification1"/>
 *         <element name="RltdMsgRef" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01}MessageIdentification1"/>
 *         <element name="TxId" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01}SimpleIdentificationInformation"/>
 *         <element name="RjctnRsn" type="{urn:iso:std:iso:20022:tech:xsd:tsmt.050.001.01}Reason2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleAndBaselineRejectionV01", propOrder = {
    "rjctnId",
    "rltdMsgRef",
    "txId",
    "rjctnRsn"
})
public class RoleAndBaselineRejectionV01 {

    @XmlElement(name = "RjctnId", required = true)
    protected MessageIdentification1 rjctnId;
    @XmlElement(name = "RltdMsgRef", required = true)
    protected MessageIdentification1 rltdMsgRef;
    @XmlElement(name = "TxId", required = true)
    protected SimpleIdentificationInformation txId;
    @XmlElement(name = "RjctnRsn")
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
     * Gets the value of the rltdMsgRef property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdentification1 }
     *     
     */
    public MessageIdentification1 getRltdMsgRef() {
        return rltdMsgRef;
    }

    /**
     * Sets the value of the rltdMsgRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdentification1 }
     *     
     */
    public void setRltdMsgRef(MessageIdentification1 value) {
        this.rltdMsgRef = value;
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
