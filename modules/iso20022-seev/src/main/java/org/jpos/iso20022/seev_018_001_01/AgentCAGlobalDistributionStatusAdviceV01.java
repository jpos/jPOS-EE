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

package org.jpos.iso20022.seev_018_001_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCAGlobalDistributionStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCAGlobalDistributionStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}DocumentIdentification8"/>
 *         <element name="AgtCAGblDstrbtnAuthstnReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}DocumentIdentification8"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}CorporateActionInformation1"/>
 *         <choice>
 *           <element name="GblMvmntSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}GlobalDistributionStatus1"/>
 *           <element name="IndvMvmntSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.018.001.01}IndividualMovementStatus1" maxOccurs="unbounded"/>
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
@XmlType(name = "AgentCAGlobalDistributionStatusAdviceV01", propOrder = {
    "id",
    "agtCAGblDstrbtnAuthstnReqId",
    "corpActnGnlInf",
    "gblMvmntSts",
    "indvMvmntSts"
})
public class AgentCAGlobalDistributionStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCAGblDstrbtnAuthstnReqId", required = true)
    protected DocumentIdentification8 agtCAGblDstrbtnAuthstnReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation1 corpActnGnlInf;
    @XmlElement(name = "GblMvmntSts")
    protected GlobalDistributionStatus1 gblMvmntSts;
    @XmlElement(name = "IndvMvmntSts")
    protected List<IndividualMovementStatus1> indvMvmntSts;

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
     * Gets the value of the agtCAGblDstrbtnAuthstnReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCAGblDstrbtnAuthstnReqId() {
        return agtCAGblDstrbtnAuthstnReqId;
    }

    /**
     * Sets the value of the agtCAGblDstrbtnAuthstnReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCAGblDstrbtnAuthstnReqId(DocumentIdentification8 value) {
        this.agtCAGblDstrbtnAuthstnReqId = value;
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
     * Gets the value of the gblMvmntSts property.
     * 
     * @return
     *     possible object is
     *     {@link GlobalDistributionStatus1 }
     *     
     */
    public GlobalDistributionStatus1 getGblMvmntSts() {
        return gblMvmntSts;
    }

    /**
     * Sets the value of the gblMvmntSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link GlobalDistributionStatus1 }
     *     
     */
    public void setGblMvmntSts(GlobalDistributionStatus1 value) {
        this.gblMvmntSts = value;
    }

    /**
     * Gets the value of the indvMvmntSts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvMvmntSts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvMvmntSts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualMovementStatus1 }
     * 
     * 
     * @return
     *     The value of the indvMvmntSts property.
     */
    public List<IndividualMovementStatus1> getIndvMvmntSts() {
        if (indvMvmntSts == null) {
            indvMvmntSts = new ArrayList<>();
        }
        return this.indvMvmntSts;
    }

}
