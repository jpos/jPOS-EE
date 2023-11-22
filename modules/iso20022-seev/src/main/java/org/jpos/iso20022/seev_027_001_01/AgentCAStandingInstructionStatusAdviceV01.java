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

package org.jpos.iso20022.seev_027_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAStandingInstructionStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAStandingInstructionStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCAStgInstrReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAStgInstrCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="StgInstrGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}CorporateActionStandingInstructionGeneralInformation1"/>
 *         <choice>
 *           <element name="StgInstrReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}StandingInstructionStatus1Choice"/>
 *           <element name="StgInstrCxlReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.027.001.01}StandingInstructionCancellationStatus1Choice"/>
 *         </choice>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAStandingInstructionStatusAdviceV01", propOrder = {
    "id",
    "agtCAStgInstrReqId",
    "agtCAStgInstrCxlReqId",
    "stgInstrGnlInf",
    "stgInstrReqSts",
    "stgInstrCxlReqSts"
})
public class AgentCAStandingInstructionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAStgInstrReqId")
    protected DocumentIdentification8 agtCAStgInstrReqId;
    @XmlElement(name = "AgtCAStgInstrCxlReqId")
    protected DocumentIdentification8 agtCAStgInstrCxlReqId;
    @XmlElement(name = "StgInstrGnlInf", required = true)
    protected CorporateActionStandingInstructionGeneralInformation1 stgInstrGnlInf;
    @XmlElement(name = "StgInstrReqSts")
    protected StandingInstructionStatus1Choice stgInstrReqSts;
    @XmlElement(name = "StgInstrCxlReqSts")
    protected StandingInstructionCancellationStatus1Choice stgInstrCxlReqSts;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setId(DocumentIdentification8 value) {
        this.id = value;
    }

    /**
     * Gets the value of the agtCAStgInstrReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAStgInstrReqId() {
        return agtCAStgInstrReqId;
    }

    /**
     * Sets the value of the agtCAStgInstrReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAStgInstrReqId(DocumentIdentification8 value) {
        this.agtCAStgInstrReqId = value;
    }

    /**
     * Gets the value of the agtCAStgInstrCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAStgInstrCxlReqId() {
        return agtCAStgInstrCxlReqId;
    }

    /**
     * Sets the value of the agtCAStgInstrCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAStgInstrCxlReqId(DocumentIdentification8 value) {
        this.agtCAStgInstrCxlReqId = value;
    }

    /**
     * Gets the value of the stgInstrGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public CorporateActionStandingInstructionGeneralInformation1 getStgInstrGnlInf() {
        return stgInstrGnlInf;
    }

    /**
     * Sets the value of the stgInstrGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstructionGeneralInformation1 }
     *     
     */
    public void setStgInstrGnlInf(CorporateActionStandingInstructionGeneralInformation1 value) {
        this.stgInstrGnlInf = value;
    }

    /**
     * Gets the value of the stgInstrReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionStatus1Choice }
     *     
     */
    public StandingInstructionStatus1Choice getStgInstrReqSts() {
        return stgInstrReqSts;
    }

    /**
     * Sets the value of the stgInstrReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionStatus1Choice }
     *     
     */
    public void setStgInstrReqSts(StandingInstructionStatus1Choice value) {
        this.stgInstrReqSts = value;
    }

    /**
     * Gets the value of the stgInstrCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link StandingInstructionCancellationStatus1Choice }
     *     
     */
    public StandingInstructionCancellationStatus1Choice getStgInstrCxlReqSts() {
        return stgInstrCxlReqSts;
    }

    /**
     * Sets the value of the stgInstrCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandingInstructionCancellationStatus1Choice }
     *     
     */
    public void setStgInstrCxlReqSts(StandingInstructionCancellationStatus1Choice value) {
        this.stgInstrCxlReqSts = value;
    }

}
