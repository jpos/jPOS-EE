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

package org.jpos.iso20022.setr_009_001_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveringPartiesAndAccount16 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="DeliveringPartiesAndAccount16">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DlvrrsCtdnDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="DlvrrsIntrmy1Dtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="DlvrrsIntrmy2Dtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentificationAndAccount147" minOccurs="0"/>
 *         <element name="DlvrgAgtDtls" type="{urn:iso:std:iso:20022:tech:xsd:setr.009.001.04}PartyIdentificationAndAccount147"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveringPartiesAndAccount16", propOrder = {
    "dlvrrsCtdnDtls",
    "dlvrrsIntrmy1Dtls",
    "dlvrrsIntrmy2Dtls",
    "dlvrgAgtDtls"
})
public class DeliveringPartiesAndAccount16 {

    @XmlElement(name = "DlvrrsCtdnDtls")
    protected PartyIdentificationAndAccount147 dlvrrsCtdnDtls;
    @XmlElement(name = "DlvrrsIntrmy1Dtls")
    protected PartyIdentificationAndAccount147 dlvrrsIntrmy1Dtls;
    @XmlElement(name = "DlvrrsIntrmy2Dtls")
    protected PartyIdentificationAndAccount147 dlvrrsIntrmy2Dtls;
    @XmlElement(name = "DlvrgAgtDtls", required = true)
    protected PartyIdentificationAndAccount147 dlvrgAgtDtls;

    /**
     * Gets the value of the dlvrrsCtdnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsCtdnDtls() {
        return dlvrrsCtdnDtls;
    }

    /**
     * Sets the value of the dlvrrsCtdnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setDlvrrsCtdnDtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsCtdnDtls = value;
    }

    /**
     * Gets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsIntrmy1Dtls() {
        return dlvrrsIntrmy1Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy1Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setDlvrrsIntrmy1Dtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsIntrmy1Dtls = value;
    }

    /**
     * Gets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrrsIntrmy2Dtls() {
        return dlvrrsIntrmy2Dtls;
    }

    /**
     * Sets the value of the dlvrrsIntrmy2Dtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setDlvrrsIntrmy2Dtls(PartyIdentificationAndAccount147 value) {
        this.dlvrrsIntrmy2Dtls = value;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public PartyIdentificationAndAccount147 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount147 }
     *     
     */
    public void setDlvrgAgtDtls(PartyIdentificationAndAccount147 value) {
        this.dlvrgAgtDtls = value;
    }

}
