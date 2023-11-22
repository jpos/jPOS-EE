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

package org.jpos.iso20022.secl_003_001_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Clearing4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Clearing4">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SttlmNetgElgblCd" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}NettingEligible1Code"/>
 *         <element name="ClrSgmt" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}PartyIdentification35Choice" minOccurs="0"/>
 *         <element name="GrntedTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}YesNoIndicator" minOccurs="0"/>
 *         <element name="NonGrntedTrad" type="{urn:iso:std:iso:20022:tech:xsd:secl.003.001.03}NonGuaranteedTrade3" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Clearing4", propOrder = {
    "sttlmNetgElgblCd",
    "clrSgmt",
    "grntedTrad",
    "nonGrntedTrad"
})
public class Clearing4 {

    @XmlElement(name = "SttlmNetgElgblCd", required = true)
    @XmlSchemaType(name = "string")
    protected NettingEligible1Code sttlmNetgElgblCd;
    @XmlElement(name = "ClrSgmt")
    protected PartyIdentification35Choice clrSgmt;
    @XmlElement(name = "GrntedTrad")
    protected Boolean grntedTrad;
    @XmlElement(name = "NonGrntedTrad")
    protected NonGuaranteedTrade3 nonGrntedTrad;

    /**
     * Gets the value of the sttlmNetgElgblCd property.
     * 
     * @return
     *     possible object is
     *     {@link NettingEligible1Code }
     *     
     */
    public NettingEligible1Code getSttlmNetgElgblCd() {
        return sttlmNetgElgblCd;
    }

    /**
     * Sets the value of the sttlmNetgElgblCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link NettingEligible1Code }
     *     
     */
    public void setSttlmNetgElgblCd(NettingEligible1Code value) {
        this.sttlmNetgElgblCd = value;
    }

    /**
     * Gets the value of the clrSgmt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public PartyIdentification35Choice getClrSgmt() {
        return clrSgmt;
    }

    /**
     * Sets the value of the clrSgmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification35Choice }
     *     
     */
    public void setClrSgmt(PartyIdentification35Choice value) {
        this.clrSgmt = value;
    }

    /**
     * Gets the value of the grntedTrad property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGrntedTrad() {
        return grntedTrad;
    }

    /**
     * Sets the value of the grntedTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGrntedTrad(Boolean value) {
        this.grntedTrad = value;
    }

    /**
     * Gets the value of the nonGrntedTrad property.
     * 
     * @return
     *     possible object is
     *     {@link NonGuaranteedTrade3 }
     *     
     */
    public NonGuaranteedTrade3 getNonGrntedTrad() {
        return nonGrntedTrad;
    }

    /**
     * Sets the value of the nonGrntedTrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonGuaranteedTrade3 }
     *     
     */
    public void setNonGrntedTrad(NonGuaranteedTrade3 value) {
        this.nonGrntedTrad = value;
    }

}
