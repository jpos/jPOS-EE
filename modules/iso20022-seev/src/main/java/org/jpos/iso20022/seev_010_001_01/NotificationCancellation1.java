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
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationCancellation1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="NotificationCancellation1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnCxlTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}CorporateActionNotificationType2Code"/>
 *         <element name="LkdAgtCANtfctnAdvcId" type="{urn:iso:std:iso:20022:tech:xsd:seev.010.001.01}DocumentIdentification8"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationCancellation1", propOrder = {
    "ntfctnCxlTp",
    "lkdAgtCANtfctnAdvcId"
})
public class NotificationCancellation1 {

    @XmlElement(name = "NtfctnCxlTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType2Code ntfctnCxlTp;
    @XmlElement(name = "LkdAgtCANtfctnAdvcId", required = true)
    protected DocumentIdentification8 lkdAgtCANtfctnAdvcId;

    /**
     * Gets the value of the ntfctnCxlTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType2Code }
     *     
     */
    public CorporateActionNotificationType2Code getNtfctnCxlTp() {
        return ntfctnCxlTp;
    }

    /**
     * Sets the value of the ntfctnCxlTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType2Code }
     *     
     */
    public void setNtfctnCxlTp(CorporateActionNotificationType2Code value) {
        this.ntfctnCxlTp = value;
    }

    /**
     * Gets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public DocumentIdentification8 getLkdAgtCANtfctnAdvcId() {
        return lkdAgtCANtfctnAdvcId;
    }

    /**
     * Sets the value of the lkdAgtCANtfctnAdvcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification8 }
     *     
     */
    public void setLkdAgtCANtfctnAdvcId(DocumentIdentification8 value) {
        this.lkdAgtCANtfctnAdvcId = value;
    }

}
