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

package org.jpos.iso20022.tsrv_019_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UndertakingStatusReportV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="UndertakingStatusReportV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="UdrtkgStsRptDtls" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}UndertakingStatusAdvice1"/>
 *         <element name="DgtlSgntr" type="{urn:iso:std:iso:20022:tech:xsd:tsrv.019.001.01}PartyAndSignature2" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingStatusReportV01", propOrder = {
    "udrtkgStsRptDtls",
    "dgtlSgntr"
})
public class UndertakingStatusReportV01 {

    @XmlElement(name = "UdrtkgStsRptDtls", required = true)
    protected UndertakingStatusAdvice1 udrtkgStsRptDtls;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgStsRptDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public UndertakingStatusAdvice1 getUdrtkgStsRptDtls() {
        return udrtkgStsRptDtls;
    }

    /**
     * Sets the value of the udrtkgStsRptDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingStatusAdvice1 }
     *     
     */
    public void setUdrtkgStsRptDtls(UndertakingStatusAdvice1 value) {
        this.udrtkgStsRptDtls = value;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public void setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
    }

}
