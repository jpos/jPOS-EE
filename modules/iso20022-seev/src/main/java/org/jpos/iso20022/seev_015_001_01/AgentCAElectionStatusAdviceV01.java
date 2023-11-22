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

package org.jpos.iso20022.seev_015_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAElectionStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAElectionStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCAElctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAElctnCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAElctnAmdmntReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}CorporateActionInformation1"/>
 *         <choice>
 *           <element name="ElctnAdvcSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}ElectionAdviceStatus1Choice"/>
 *           <element name="ElctnCxlReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}ElectionCancellationStatus1Choice"/>
 *           <element name="ElctnAmdmntReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.015.001.01}ElectionAmendmentStatus1Choice"/>
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
@XmlType(name = "AgentCAElectionStatusAdviceV01", propOrder = {
    "id",
    "agtCAElctnAdvcId",
    "agtCAElctnCxlReqId",
    "agtCAElctnAmdmntReqId",
    "corpActnGnlInf",
    "elctnAdvcSts",
    "elctnCxlReqSts",
    "elctnAmdmntReqSts"
})
public class AgentCAElectionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnAdvcId")
    protected DocumentIdentification8 agtCAElctnAdvcId;
    @XmlElement(name = "AgtCAElctnCxlReqId")
    protected DocumentIdentification8 agtCAElctnCxlReqId;
    @XmlElement(name = "AgtCAElctnAmdmntReqId")
    protected DocumentIdentification8 agtCAElctnAmdmntReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "ElctnAdvcSts")
    protected ElectionAdviceStatus1Choice elctnAdvcSts;
    @XmlElement(name = "ElctnCxlReqSts")
    protected ElectionCancellationStatus1Choice elctnCxlReqSts;
    @XmlElement(name = "ElctnAmdmntReqSts")
    protected ElectionAmendmentStatus1Choice elctnAmdmntReqSts;

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
     * Gets the value of the agtCAElctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAdvcId() {
        return agtCAElctnAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnAdvcId = value;
    }

    /**
     * Gets the value of the agtCAElctnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnCxlReqId() {
        return agtCAElctnCxlReqId;
    }

    /**
     * Sets the value of the agtCAElctnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnCxlReqId(DocumentIdentification8 value) {
        this.agtCAElctnCxlReqId = value;
    }

    /**
     * Gets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnAmdmntReqId() {
        return agtCAElctnAmdmntReqId;
    }

    /**
     * Sets the value of the agtCAElctnAmdmntReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnAmdmntReqId(DocumentIdentification8 value) {
        this.agtCAElctnAmdmntReqId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public CorporateActionInformation1 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation1 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation1 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the elctnAdvcSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionAdviceStatus1Choice }
     *     
     */
    public ElectionAdviceStatus1Choice getElctnAdvcSts() {
        return elctnAdvcSts;
    }

    /**
     * Sets the value of the elctnAdvcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionAdviceStatus1Choice }
     *     
     */
    public void setElctnAdvcSts(ElectionAdviceStatus1Choice value) {
        this.elctnAdvcSts = value;
    }

    /**
     * Gets the value of the elctnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionCancellationStatus1Choice }
     *     
     */
    public ElectionCancellationStatus1Choice getElctnCxlReqSts() {
        return elctnCxlReqSts;
    }

    /**
     * Sets the value of the elctnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionCancellationStatus1Choice }
     *     
     */
    public void setElctnCxlReqSts(ElectionCancellationStatus1Choice value) {
        this.elctnCxlReqSts = value;
    }

    /**
     * Gets the value of the elctnAmdmntReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link ElectionAmendmentStatus1Choice }
     *     
     */
    public ElectionAmendmentStatus1Choice getElctnAmdmntReqSts() {
        return elctnAmdmntReqSts;
    }

    /**
     * Sets the value of the elctnAmdmntReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectionAmendmentStatus1Choice }
     *     
     */
    public void setElctnAmdmntReqSts(ElectionAmendmentStatus1Choice value) {
        this.elctnAmdmntReqSts = value;
    }

}
