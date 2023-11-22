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

package org.jpos.iso20022.seev_031_001_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionNotification7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionNotification7">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="NtfctnTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionNotificationType1Code"/>
 *         <element name="PrcgSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.031.001.13}CorporateActionProcessingStatus5Choice"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotification7", propOrder = {
    "ntfctnTp",
    "prcgSts"
})
public class CorporateActionNotification7 {

    @XmlElement(name = "NtfctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionNotificationType1Code ntfctnTp;
    @XmlElement(name = "PrcgSts", required = true)
    protected CorporateActionProcessingStatus5Choice prcgSts;

    /**
     * Gets the value of the ntfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public CorporateActionNotificationType1Code getNtfctnTp() {
        return ntfctnTp;
    }

    /**
     * Sets the value of the ntfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionNotificationType1Code }
     *     
     */
    public void setNtfctnTp(CorporateActionNotificationType1Code value) {
        this.ntfctnTp = value;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionProcessingStatus5Choice }
     *     
     */
    public CorporateActionProcessingStatus5Choice getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionProcessingStatus5Choice }
     *     
     */
    public void setPrcgSts(CorporateActionProcessingStatus5Choice value) {
        this.prcgSts = value;
    }

}
