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

package org.jpos.iso20022.reda_043_001_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartyAuditTrailReport3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="PartyAuditTrailReport3">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="PtyAudtTrlOrErr" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}PartyAuditTrailOrError2Choice"/>
 *         <element name="DtPrd" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}DatePeriod3Choice" minOccurs="0"/>
 *         <element name="PtyId" type="{urn:iso:std:iso:20022:tech:xsd:reda.043.001.01}SystemPartyIdentification8"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyAuditTrailReport3", propOrder = {
    "ptyAudtTrlOrErr",
    "dtPrd",
    "ptyId"
})
public class PartyAuditTrailReport3 {

    @XmlElement(name = "PtyAudtTrlOrErr", required = true)
    protected PartyAuditTrailOrError2Choice ptyAudtTrlOrErr;
    @XmlElement(name = "DtPrd")
    protected DatePeriod3Choice dtPrd;
    @XmlElement(name = "PtyId", required = true)
    protected SystemPartyIdentification8 ptyId;

    /**
     * Gets the value of the ptyAudtTrlOrErr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAuditTrailOrError2Choice }
     *     
     */
    public PartyAuditTrailOrError2Choice getPtyAudtTrlOrErr() {
        return ptyAudtTrlOrErr;
    }

    /**
     * Sets the value of the ptyAudtTrlOrErr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAuditTrailOrError2Choice }
     *     
     */
    public void setPtyAudtTrlOrErr(PartyAuditTrailOrError2Choice value) {
        this.ptyAudtTrlOrErr = value;
    }

    /**
     * Gets the value of the dtPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod3Choice }
     *     
     */
    public DatePeriod3Choice getDtPrd() {
        return dtPrd;
    }

    /**
     * Sets the value of the dtPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod3Choice }
     *     
     */
    public void setDtPrd(DatePeriod3Choice value) {
        this.dtPrd = value;
    }

    /**
     * Gets the value of the ptyId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public SystemPartyIdentification8 getPtyId() {
        return ptyId;
    }

    /**
     * Sets the value of the ptyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification8 }
     *     
     */
    public void setPtyId(SystemPartyIdentification8 value) {
        this.ptyId = value;
    }

}
