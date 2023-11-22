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

package org.jpos.iso20022.semt_018_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Status38Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Status38Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="Prtry" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}ProprietaryStatusAndReason6"/>
 *         <element name="MtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}MatchingStatus24Choice"/>
 *         <element name="IfrrdMtchgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}MatchingStatus24Choice"/>
 *         <element name="SttlmSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}SettlementStatus30Choice"/>
 *         <element name="InstrPrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:semt.018.001.13}InstructionProcessingStatus42Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status38Choice", propOrder = {
    "prtry",
    "mtchgSts",
    "ifrrdMtchgSts",
    "sttlmSts",
    "instrPrcgSts"
})
public class Status38Choice {

    @XmlElement(name = "Prtry")
    protected ProprietaryStatusAndReason6 prtry;
    @XmlElement(name = "MtchgSts")
    protected MatchingStatus24Choice mtchgSts;
    @XmlElement(name = "IfrrdMtchgSts")
    protected MatchingStatus24Choice ifrrdMtchgSts;
    @XmlElement(name = "SttlmSts")
    protected SettlementStatus30Choice sttlmSts;
    @XmlElement(name = "InstrPrcgSts")
    protected InstructionProcessingStatus42Choice instrPrcgSts;

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public ProprietaryStatusAndReason6 getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryStatusAndReason6 }
     *     
     */
    public void setPrtry(ProprietaryStatusAndReason6 value) {
        this.prtry = value;
    }

    /**
     * Gets the value of the mtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public MatchingStatus24Choice getMtchgSts() {
        return mtchgSts;
    }

    /**
     * Sets the value of the mtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public void setMtchgSts(MatchingStatus24Choice value) {
        this.mtchgSts = value;
    }

    /**
     * Gets the value of the ifrrdMtchgSts property.
     * 
     * @return
     *     possible object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public MatchingStatus24Choice getIfrrdMtchgSts() {
        return ifrrdMtchgSts;
    }

    /**
     * Sets the value of the ifrrdMtchgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchingStatus24Choice }
     *     
     */
    public void setIfrrdMtchgSts(MatchingStatus24Choice value) {
        this.ifrrdMtchgSts = value;
    }

    /**
     * Gets the value of the sttlmSts property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementStatus30Choice }
     *     
     */
    public SettlementStatus30Choice getSttlmSts() {
        return sttlmSts;
    }

    /**
     * Sets the value of the sttlmSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementStatus30Choice }
     *     
     */
    public void setSttlmSts(SettlementStatus30Choice value) {
        this.sttlmSts = value;
    }

    /**
     * Gets the value of the instrPrcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionProcessingStatus42Choice }
     *     
     */
    public InstructionProcessingStatus42Choice getInstrPrcgSts() {
        return instrPrcgSts;
    }

    /**
     * Sets the value of the instrPrcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionProcessingStatus42Choice }
     *     
     */
    public void setInstrPrcgSts(InstructionProcessingStatus42Choice value) {
        this.instrPrcgSts = value;
    }

}
