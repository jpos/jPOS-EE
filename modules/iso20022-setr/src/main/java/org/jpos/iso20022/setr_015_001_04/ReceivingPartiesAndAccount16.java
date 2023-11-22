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

package org.jpos.iso20022.setr_015_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceivingPartiesAndAccount16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="ReceivingPartiesAndAccount16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="RcvrsCtdnDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="RcvrsIntrmy1Dtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="RcvrsIntrmy2Dtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="RcvgAgtDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.015.001.04}PartyIdentificationAndAccount147"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivingPartiesAndAccount16", propOrder = {
    "rcvrsCtdnDtls",
    "rcvrsIntrmy1Dtls",
    "rcvrsIntrmy2Dtls",
    "rcvgAgtDtls"
})
public class ReceivingPartiesAndAccount16 {

    @XmlElement(name = "RcvrsCtdnDtls")
    protected PartyIdentificationAndAccount147 rcvrsCtdnDtls;
    @XmlElement(name = "RcvrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount147 rcvrsIntrmy1Dtls;
    @XmlElement(name = "RcvrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount147 rcvrsIntrmy2Dtls;
    @XmlElement(name = "RcvgAgtDtls", required = true)
    protected PartyIdentificationAndAccount147 rcvgAgtDtls;

    /**
     * Gets the value of the rcvrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsCtdnDtls() {
        return rcvrsCtdnDtls;
    }

    /**
     * Sets the value of the rcvrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setRcvrsCtdnDtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsCtdnDtls = value;
    }

    /**
     * Gets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsIntrmy1Dtls() {
        return rcvrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setRcvrsIntrmy1Dtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsIntrmy1Dtls = value;
    }

    /**
     * Gets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvrsIntrmy2Dtls() {
        return rcvrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the rcvrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setRcvrsIntrmy2Dtls(PartyIdentificationAndAccount147 value) {
        this.rcvrsIntrmy2Dtls = value;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setRcvgAgtDtls(PartyIdentificationAndAccount147 value) {
        this.rcvgAgtDtls = value;
    }

}
