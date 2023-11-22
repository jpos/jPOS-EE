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

package org.jpos.iso20022.colr_020_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PendingStatus56Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PendingStatus56Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="NoSpcfdRsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}NoReasonCode"/>
 *         <element name="Rsn" type="{urn:iso:std:iso:20022:tech:xsd:colr.020.001.01}PendingReason27"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingStatus56Choice", propOrder = {
    "noSpcfdRsn",
    "rsn"
})
public class PendingStatus56Choice {

    @XmlElement(name = "NoSpcfdRsn")
    @XmlSchemaType(name = "string")
    protected NoReasonCode noSpcfdRsn;
    @XmlElement(name = "Rsn")
    protected PendingReason27 rsn;

    /**
     * Gets the value of the noSpcfdRsn property.
     * 
     * @return
     *     possible object is
     *     {@link NoReasonCode }
     *     
     */
    public NoReasonCode getNoSpcfdRsn() {
        return noSpcfdRsn;
    }

    /**
     * Sets the value of the noSpcfdRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoReasonCode }
     *     
     */
    public void setNoSpcfdRsn(NoReasonCode value) {
        this.noSpcfdRsn = value;
    }

    /**
     * Gets the value of the rsn property.
     * 
     * @return
     *     possible object is
     *     {@link PendingReason27 }
     *     
     */
    public PendingReason27 getRsn() {
        return rsn;
    }

    /**
     * Sets the value of the rsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingReason27 }
     *     
     */
    public void setRsn(PendingReason27 value) {
        this.rsn = value;
    }

}
