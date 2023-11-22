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

package org.jpos.iso20022.seev_026_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAStandingInstructionCancellationRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAStandingInstructionCancellationRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}DocumentIdentification8"/>
 *         <element name="AgtCAStgInstrReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}DocumentIdentification8"/>
 *         <element name="StgInstrGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}CorporateActionStandingInstructionGeneralInformation1"/>
 *         <element name="StgInstrDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.026.001.01}CorporateActionStandingInstruction1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCAStandingInstructionCancellationRequestV01", propOrder = {
    "id",
    "agtCAStgInstrReqId",
    "stgInstrGnlInf",
    "stgInstrDtls"
})
public class AgentCAStandingInstructionCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAStgInstrReqId", required = true)
    protected DocumentIdentification8 agtCAStgInstrReqId;
    @XmlElement(name = "StgInstrGnlInf", required = true)
    protected CorporateActionStandingInstructionGeneralInformation1 stgInstrGnlInf;
    @XmlElement(name = "StgInstrDtls")
    protected CorporateActionStandingInstruction1 stgInstrDtls;

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
     * Gets the value of the stgInstrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public CorporateActionStandingInstruction1 getStgInstrDtls() {
        return stgInstrDtls;
    }

    /**
     * Sets the value of the stgInstrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionStandingInstruction1 }
     *     
     */
    public void setStgInstrDtls(CorporateActionStandingInstruction1 value) {
        this.stgInstrDtls = value;
    }

}
