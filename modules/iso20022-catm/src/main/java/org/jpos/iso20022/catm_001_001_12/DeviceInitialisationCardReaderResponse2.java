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

package org.jpos.iso20022.catm_001_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceInitialisationCardReaderResponse2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeviceInitialisationCardReaderResponse2">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="CardNtryMd" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}CardDataReading8Code" minOccurs="0"/>
 *         <element name="ICCRstData" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}ICCResetData1" minOccurs="0"/>
 *         <element name="AddtlInf" type="{urn:iso:std:iso:20022:tech:xsd:catm.001.001.12}Max10000Binary" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceInitialisationCardReaderResponse2", propOrder = {
    "cardNtryMd",
    "iccRstData",
    "addtlInf"
})
public class DeviceInitialisationCardReaderResponse2 {

    @XmlElement(name = "CardNtryMd")
    @XmlSchemaType(name = "string")
    protected CardDataReading8Code cardNtryMd;
    @XmlElement(name = "ICCRstData")
    protected ICCResetData1 iccRstData;
    @XmlElement(name = "AddtlInf")
    protected byte[] addtlInf;

    /**
     * Gets the value of the cardNtryMd property.
     * 
     * @return
     *     possible object is
     *     {@link CardDataReading8Code }
     *     
     */
    public CardDataReading8Code getCardNtryMd() {
        return cardNtryMd;
    }

    /**
     * Sets the value of the cardNtryMd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardDataReading8Code }
     *     
     */
    public void setCardNtryMd(CardDataReading8Code value) {
        this.cardNtryMd = value;
    }

    /**
     * Gets the value of the iccRstData property.
     * 
     * @return
     *     possible object is
     *     {@link ICCResetData1 }
     *     
     */
    public ICCResetData1 getICCRstData() {
        return iccRstData;
    }

    /**
     * Sets the value of the iccRstData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ICCResetData1 }
     *     
     */
    public void setICCRstData(ICCResetData1 value) {
        this.iccRstData = value;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAddtlInf(byte[] value) {
        this.addtlInf = value;
    }

}
