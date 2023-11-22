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

package org.jpos.iso20022.seev_010_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentCANotificationCancellationRequestV01 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="AgentCANotificationCancellationRequestV01">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DocumentIdentification8"/>
 *         <element name="NtfctnCxlTpAndLkg" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}NotificationCancellation1"/>
 *         <element name="CorpActnGnlInf" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionInformation2"/>
 *         <element name="CorpActnNtfctnDtls" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionNotificationAdvice1" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentCANotificationCancellationRequestV01", propOrder = {
    "id",
    "ntfctnCxlTpAndLkg",
    "corpActnGnlInf",
    "corpActnNtfctnDtls"
})
public class AgentCANotificationCancellationRequestV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification8 id;
    @XmlElement(name = "NtfctnCxlTpAndLkg", required = true)
    protected NotificationCancellation1 ntfctnCxlTpAndLkg;
    @XmlElement(name = "CorpActnGnlInf", required = true)
    protected CorporateActionInformation2 corpActnGnlInf;
    @XmlElement(name = "CorpActnNtfctnDtls")
    protected CorporateActionNotificationAdvice1 corpActnNtfctnDtls;

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
     * Gets the value of the ntfctnCxlTpAndLkg property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCancellation1 }
     *     
     */
    public NotificationCancellation1 getNtfctnCxlTpAndLkg() {
        return ntfctnCxlTpAndLkg;
    }

    /**
     * Sets the value of the ntfctnCxlTpAndLkg property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCancellation1 }
     *     
     */
    public void setNtfctnCxlTpAndLkg(NotificationCancellation1 value) {
        this.ntfctnCxlTpAndLkg = value;
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
     * Gets the value of the corpActnNtfctnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationAdvice1 }
     *     
     */
    public CorporateActionNotificationAdvice1 getCorpActnNtfctnDtls() {
        return corpActnNtfctnDtls;
    }

    /**
     * Sets the value of the corpActnNtfctnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationAdvice1 }
     *     
     */
    public void setCorpActnNtfctnDtls(CorporateActionNotificationAdvice1 value) {
        this.corpActnNtfctnDtls = value;
    }

}
