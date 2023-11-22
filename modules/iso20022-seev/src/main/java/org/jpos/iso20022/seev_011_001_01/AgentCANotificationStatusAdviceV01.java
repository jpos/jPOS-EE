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

package org.jpos.iso20022.seev_011_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCANotificationStatusAdviceV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCANotificationStatusAdviceV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}DocumentIdentification8"/>
 *         <choice>
 *           <element name="AgtCANtfctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}DocumentIdentification8"/>
 *           <element name="AgtCANtfctnCxlReqId" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}DocumentIdentification8"/>
 *         </choice>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}CorporateActionInformation2"/>
 *         <choice>
 *           <element name="NtfctnCxlReqSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}NotificationCancellationRequestStatus1Choice"/>
 *           <element name="NtfctnAdvcSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.011.001.01}NotificationAdviceStatus1Choice"/>
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
@XmlType(name = "AgentCANotificationStatusAdviceV01", propOrder = {
    "id",
    "agtCANtfctnAdvcId",
    "agtCANtfctnCxlReqId",
    "corpActnGnlInf",
    "ntfctnCxlReqSts",
    "ntfctnAdvcSts"
})
public class AgentCANotificationStatusAdviceV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "AgtCANtfctnAdvcId")
    protected DocumentIdentification8 agtCANtfctnAdvcId;
    @XmlElement(name = "AgtCANtfctnCxlReqId")
    protected DocumentIdentification8 agtCANtfctnCxlReqId;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "NtfctnCxlReqSts")
    protected NotificationCancellationRequestStatus1Choice ntfctnCxlReqSts;
    @XmlElement(name = "NtfctnAdvcSts")
    protected NotificationAdviceStatus1Choice ntfctnAdvcSts;

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
     * Gets the value of the agtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCANtfctnAdvcId() {
        return agtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the agtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.agtCANtfctnAdvcId = value;
    }

    /**
     * Gets the value of the agtCANtfctnCxlReqId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getAgtCANtfctnCxlReqId() {
        return agtCANtfctnCxlReqId;
    }

    /**
     * Sets the value of the agtCANtfctnCxlReqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setAgtCANtfctnCxlReqId(DocumentIdentification8 value) {
        this.agtCANtfctnCxlReqId = value;
    }

    /**
     * Gets the value of the corpActnGnlInf property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public CorporateActionInformation2 getCorpActnGnlInf() {
        return corpActnGnlInf;
    }

    /**
     * Sets the value of the corpActnGnlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionInformation2 }
     *     
     */
    public void setCorpActnGnlInf(CorporateActionInformation2 value) {
        this.corpActnGnlInf = value;
    }

    /**
     * Gets the value of the ntfctnCxlReqSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellationRequestStatus1Choice }
     *     
     */
    public NotificationCancellationRequestStatus1Choice getNtfctnCxlReqSts() {
        return ntfctnCxlReqSts;
    }

    /**
     * Sets the value of the ntfctnCxlReqSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellationRequestStatus1Choice }
     *     
     */
    public void setNtfctnCxlReqSts(NotificationCancellationRequestStatus1Choice value) {
        this.ntfctnCxlReqSts = value;
    }

    /**
     * Gets the value of the ntfctnAdvcSts property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationAdviceStatus1Choice }
     *     
     */
    public NotificationAdviceStatus1Choice getNtfctnAdvcSts() {
        return ntfctnAdvcSts;
    }

    /**
     * Sets the value of the ntfctnAdvcSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationAdviceStatus1Choice }
     *     
     */
    public void setNtfctnAdvcSts(NotificationAdviceStatus1Choice value) {
        this.ntfctnAdvcSts = value;
    }

}
