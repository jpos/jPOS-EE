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

package org.jpos.iso20022.seev_022_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAMovementStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAMovementStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCAElctnStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAGblDstrbtnStsAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAMvmntInstrId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}DocumentIdentification8"/>
 *           <element name="AgtCAMvmntCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionInformation1"/>
 *         <choice>
 *           <element name="MvmntStsDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateActionMovementStatus1Choice"/>
 *           <element name="MvmntCxlStsDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.022.001.01}CorporateMovementStatus2"/>
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
@XmlType(name = "AgentCAMovementStatusAdviceV01", propOrder = {
    "id",
    "agtCAElctnStsAdvcId",
    "agtCAGblDstrbtnStsAdvcId",
    "agtCAMvmntInstrId",
    "agtCAMvmntCxlReqId",
    "corpActnGnlInf",
    "mvmntStsDtls",
    "mvmntCxlStsDtls"
})
public class AgentCAMovementStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAElctnStsAdvcId")
    protected DocumentIdentification8 agtCAElctnStsAdvcId;
    @XmlElement(name = "AgtCAGblDstrbtnStsAdvcId")
    protected DocumentIdentification8 agtCAGblDstrbtnStsAdvcId;
    @XmlElement(name = "AgtCAMvmntInstrId")
    protected DocumentIdentification8 agtCAMvmntInstrId;
    @XmlElement(name = "AgtCAMvmntCxlReqId")
    protected DocumentIdentification8 agtCAMvmntCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "MvmntStsDtls")
    protected CorporateActionMovementStatus1Choice mvmntStsDtls;
    @XmlElement(name = "MvmntCxlStsDtls")
    protected CorporateMovementStatus2 mvmntCxlStsDtls;

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
     * Gets the value of the agtCAElctnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAElctnStsAdvcId() {
        return agtCAElctnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAElctnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAElctnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAElctnStsAdvcId = value;
    }

    /**
     * Gets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnStsAdvcId() {
        return agtCAGblDstrbtnStsAdvcId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnStsAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAGblDstrbtnStsAdvcId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnStsAdvcId = value;
    }

    /**
     * Gets the value of the agtCAMvmntInstrId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntInstrId() {
        return agtCAMvmntInstrId;
    }

    /**
     * Sets the value of the agtCAMvmntInstrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAMvmntInstrId(DocumentIdentification8 value) {
        this.agtCAMvmntInstrId = value;
    }

    /**
     * Gets the value of the agtCAMvmntCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAMvmntCxlReqId() {
        return agtCAMvmntCxlReqId;
    }

    /**
     * Sets the value of the agtCAMvmntCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAMvmntCxlReqId(DocumentIdentification8 value) {
        this.agtCAMvmntCxlReqId = value;
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
     * Gets the value of the mvmntStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementStatus1Choice }
     *     
     */
    public CorporateActionMovementStatus1Choice getMvmntStsDtls() {
        return mvmntStsDtls;
    }

    /**
     * Sets the value of the mvmntStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementStatus1Choice }
     *     
     */
    public void setMvmntStsDtls(CorporateActionMovementStatus1Choice value) {
        this.mvmntStsDtls = value;
    }

    /**
     * Gets the value of the mvmntCxlStsDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateMovementStatus2 }
     *     
     */
    public CorporateMovementStatus2 getMvmntCxlStsDtls() {
        return mvmntCxlStsDtls;
    }

    /**
     * Sets the value of the mvmntCxlStsDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateMovementStatus2 }
     *     
     */
    public void setMvmntCxlStsDtls(CorporateMovementStatus2 value) {
        this.mvmntCxlStsDtls = value;
    }

}
