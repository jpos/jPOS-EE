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

package org.jpos.iso20022.casp_016_001_05;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceTransmitMessageRequest2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceTransmitMessageRequest2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DstnAdr" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}NetworkParameters7"/>
 *         <element name="MaxTrnsmssnTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Number"/>
 *         <element name="MaxWtgTm" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Number" minOccurs="0"/>
 *         <element name="MsgToSnd" type="{urn:iso:std:iso:20022:tech:xsd:casp.016.001.05}Max100KBinary"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceTransmitMessageRequest2", propOrder = {
    "dstnAdr",
    "maxTrnsmssnTm",
    "maxWtgTm",
    "msgToSnd"
})
public class DeviceTransmitMessageRequest2 {

    @XmlElement(name = "DstnAdr", required = true)
    protected NetworkParameters7 dstnAdr;
    @XmlElement(name = "MaxTrnsmssnTm", required = true)
    protected BigDecimal maxTrnsmssnTm;
    @XmlElement(name = "MaxWtgTm")
    protected BigDecimal maxWtgTm;
    @XmlElement(name = "MsgToSnd", required = true)
    protected byte[] msgToSnd;

    /**
     * Gets the value of the dstnAdr property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkParameters7 }
     *     
     */
    public NetworkParameters7 getDstnAdr() {
        return dstnAdr;
    }

    /**
     * Sets the value of the dstnAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkParameters7 }
     *     
     */
    public void setDstnAdr(NetworkParameters7 value) {
        this.dstnAdr = value;
    }

    /**
     * Gets the value of the maxTrnsmssnTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxTrnsmssnTm() {
        return maxTrnsmssnTm;
    }

    /**
     * Sets the value of the maxTrnsmssnTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxTrnsmssnTm(BigDecimal value) {
        this.maxTrnsmssnTm = value;
    }

    /**
     * Gets the value of the maxWtgTm property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWtgTm() {
        return maxWtgTm;
    }

    /**
     * Sets the value of the maxWtgTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWtgTm(BigDecimal value) {
        this.maxWtgTm = value;
    }

    /**
     * Gets the value of the msgToSnd property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getMsgToSnd() {
        return msgToSnd;
    }

    /**
     * Sets the value of the msgToSnd property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setMsgToSnd(byte[] value) {
        this.msgToSnd = value;
    }

}
