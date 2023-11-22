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

package org.jpos.iso20022.seev_001_001_10;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeetingEventReference1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="MeetingEventReference1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtId" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}MeetingEventReference1Choice"/>
 *         <element name="LkgTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}ProcessingPosition3Code" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingEventReference1", propOrder = {
    "evtId",
    "lkgTp"
})
public class MeetingEventReference1 {

    @XmlElement(name = "EvtId", required = true)
    protected MeetingEventReference1Choice evtId;
    @XmlElement(name = "LkgTp")
    @XmlSchemaType(name = "string")
    protected ProcessingPosition3Code lkgTp;

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingEventReference1Choice }
     *     
     */
    public MeetingEventReference1Choice getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingEventReference1Choice }
     *     
     */
    public void setEvtId(MeetingEventReference1Choice value) {
        this.evtId = value;
    }

    /**
     * Gets the value of the lkgTp property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingPosition3Code }
     *     
     */
    public ProcessingPosition3Code getLkgTp() {
        return lkgTp;
    }

    /**
     * Sets the value of the lkgTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingPosition3Code }
     *     
     */
    public void setLkgTp(ProcessingPosition3Code value) {
        this.lkgTp = value;
    }

}
