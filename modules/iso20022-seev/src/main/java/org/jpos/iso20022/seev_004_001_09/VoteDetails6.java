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

package org.jpos.iso20022.seev_004_001_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteDetails6 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteDetails6">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VoteInstrForAgndRsltn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Vote15Choice"/>
 *         <element name="VoteInstrForMtgRsltn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}VoteInstructionForMeetingResolution3Choice" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteDetails6", propOrder = {
    "voteInstrForAgndRsltn",
    "voteInstrForMtgRsltn"
})
public class VoteDetails6 {

    @XmlElement(name = "VoteInstrForAgndRsltn", required = true)
    protected Vote15Choice voteInstrForAgndRsltn;
    @XmlElement(name = "VoteInstrForMtgRsltn")
    protected VoteInstructionForMeetingResolution3Choice voteInstrForMtgRsltn;

    /**
     * Gets the value of the voteInstrForAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote15Choice }
     *     
     */
    public Vote15Choice getVoteInstrForAgndRsltn() {
        return voteInstrForAgndRsltn;
    }

    /**
     * Sets the value of the voteInstrForAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote15Choice }
     *     
     */
    public void setVoteInstrForAgndRsltn(Vote15Choice value) {
        this.voteInstrForAgndRsltn = value;
    }

    /**
     * Gets the value of the voteInstrForMtgRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionForMeetingResolution3Choice }
     *     
     */
    public VoteInstructionForMeetingResolution3Choice getVoteInstrForMtgRsltn() {
        return voteInstrForMtgRsltn;
    }

    /**
     * Sets the value of the voteInstrForMtgRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionForMeetingResolution3Choice }
     *     
     */
    public void setVoteInstrForMtgRsltn(VoteInstructionForMeetingResolution3Choice value) {
        this.voteInstrForMtgRsltn = value;
    }

}
