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

package org.jpos.iso20022.seev_030_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCADeactivationStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCADeactivationStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCADeactvtnInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}DocumentIdentification8"/>
 *           <element name="AgtCADeactvtnCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionInformation1"/>
 *         <choice>
 *           <element name="DeactvtnInstrSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionDeactivationInstructionStatus1" maxOccurs="unbounded"/>
 *           <element name="DeactvtnCxlReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.030.001.01}CorporateActionDeactivationCancellationStatus1Choice"/>
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
@XmlType(name = "AgentCADeactivationStatusAdviceV01", propOrder = {
    "id",
    "agtCADeactvtnInstrId",
    "agtCADeactvtnCxlReqId",
    "corpActnGnlInf",
    "deactvtnInstrSts",
    "deactvtnCxlReqSts"
})
public class AgentCADeactivationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCADeactvtnInstrId")
    protected DocumentIdentification8 agtCADeactvtnInstrId;
    @XmlElement(name = "AgtCADeactvtnCxlReqId")
    protected DocumentIdentification8 agtCADeactvtnCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "DeactvtnInstrSts")
    protected List<CorporateActionDeactivationInstructionStatus1> deactvtnInstrSts;
    @XmlElement(name = "DeactvtnCxlReqSts")
    protected CorporateActionDeactivationCancellationStatus1Choice deactvtnCxlReqSts;

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
     * Gets the value of the agtCADeactvtnInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnInstrId() {
        return agtCADeactvtnInstrId;
    }

    /**
     * Sets the value of the agtCADeactvtnInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCADeactvtnInstrId(DocumentIdentification8 value) {
        this.agtCADeactvtnInstrId = value;
    }

    /**
     * Gets the value of the agtCADeactvtnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCADeactvtnCxlReqId() {
        return agtCADeactvtnCxlReqId;
    }

    /**
     * Sets the value of the agtCADeactvtnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCADeactvtnCxlReqId(DocumentIdentification8 value) {
        this.agtCADeactvtnCxlReqId = value;
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
     * Gets the value of the deactvtnInstrSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the deactvtnInstrSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeactvtnInstrSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporateActionDeactivationInstructionStatus1 }
     * 
     * 
     * @return
     *     The value of the deactvtnInstrSts property.
     */
    public List<CorporateActionDeactivationInstructionStatus1> getDeactvtnInstrSts() {
        if (deactvtnInstrSts == null) {
            deactvtnInstrSts = new ArrayList<>();
        }
        return this.deactvtnInstrSts;
    }

    /**
     * Gets the value of the deactvtnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionDeactivationCancellationStatus1Choice }
     *     
     */
    public CorporateActionDeactivationCancellationStatus1Choice getDeactvtnCxlReqSts() {
        return deactvtnCxlReqSts;
    }

    /**
     * Sets the value of the deactvtnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionDeactivationCancellationStatus1Choice }
     *     
     */
    public void setDeactvtnCxlReqSts(CorporateActionDeactivationCancellationStatus1Choice value) {
        this.deactvtnCxlReqSts = value;
    }

}
