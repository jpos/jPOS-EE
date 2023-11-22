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

package org.jpos.iso20022.seev_039_001_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateActionEventStatus1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="CorporateActionEventStatus1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="EvtCmpltnsSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}EventCompletenessStatus1Code"/>
 *         <element name="EvtConfSts" type="{urn:iso:std:iso:20022:tech:xsd:seev.039.001.12}EventConfirmationStatus1Code"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionEventStatus1", propOrder = {
    "evtCmpltnsSts",
    "evtConfSts"
})
public class CorporateActionEventStatus1 {

    @XmlElement(name = "EvtCmpltnsSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventCompletenessStatus1Code evtCmpltnsSts;
    @XmlElement(name = "EvtConfSts", required = true)
    @XmlSchemaType(name = "string")
    protected EventConfirmationStatus1Code evtConfSts;

    /**
     * Gets the value of the evtCmpltnsSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public EventCompletenessStatus1Code getEvtCmpltnsSts() {
        return evtCmpltnsSts;
    }

    /**
     * Sets the value of the evtCmpltnsSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCompletenessStatus1Code }
     *     
     */
    public void setEvtCmpltnsSts(EventCompletenessStatus1Code value) {
        this.evtCmpltnsSts = value;
    }

    /**
     * Gets the value of the evtConfSts property.
     * 
     * @return
     *     possible object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public EventConfirmationStatus1Code getEvtConfSts() {
        return evtConfSts;
    }

    /**
     * Sets the value of the evtConfSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventConfirmationStatus1Code }
     *     
     */
    public void setEvtConfSts(EventConfirmationStatus1Code value) {
        this.evtConfSts = value;
    }

}
