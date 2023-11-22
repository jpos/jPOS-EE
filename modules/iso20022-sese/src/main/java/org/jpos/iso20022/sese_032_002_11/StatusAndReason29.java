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

package org.jpos.iso20022.sese_032_002_11;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusAndReason29 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="StatusAndReason29">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}ProcessingStatus62Choice" minOccurs="0"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}MatchingStatus32Choice" minOccurs="0"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}MatchingStatus32Choice" minOccurs="0"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:sese.032.002.11}SettlementStatus22Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusAndReason29", propOrder = {
    "prcgSts",
    "ifrrdMtchgSts",
    "mtchgSts",
    "sttlmSts"
})
public class StatusAndReason29 {

    @XmlElement(name = "PrcgSts")
    protected ProcessingStatus62Choice prcgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus32Choice ifrrdMtchgSts;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus32Choice mtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus22Choice sttlmSts;

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingStatus62Choice }
     *     
     */
    public ProcessingStatus62Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingStatus62Choice }
     *     
     */
    public void setPrcgSts(ProcessingStatus62Choice value) {
        this.prcgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public MatchingStatus32Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus32Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public MatchingStatus32Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus32Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus32Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public SettlementStatus22Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus22Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus22Choice value) {
        this.sttlmSts = value;
    }

}
