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

package org.jpos.iso20022.semt_018_002_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status39Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status39Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}ProprietaryStatusAndReason7"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}MatchingStatus32Choice"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}MatchingStatus32Choice"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}SettlementStatus31Choice"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.002.13}InstructionProcessingStatus45Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status39Choice", propOrder = {
    "prtry",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "instrPrcgSts"
})
public class Status39Choice {

    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason7 prtry;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus32Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus32Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus31Choice sttlmSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus45Choice instrPrcgSts;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public ProprietaryStatusAndReason7 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason7 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason7 value) {
        this.prtry = value;
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
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus31Choice }
     *     
     */
    public SettlementStatus31Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus31Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus31Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus45Choice }
     *     
     */
    public InstructionProcessingStatus45Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus45Choice }
     *     
     */
    public void setInstrPrcgSts(InstructionProcessingStatus45Choice value) {
        this.instrPrcgSts = value;
    }

}
