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
 * <p>Java class for VoteInstructionForMeetingResolution3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteInstructionForMeetingResolution3Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="VoteIndctn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}VoteInstructionType1Choice"/>
 *         <element name="Shrhldr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}NameAndAddress9"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteInstructionForMeetingResolution3Choice", propOrder = {
    "voteIndctn",
    "shrhldr"
})
public class VoteInstructionForMeetingResolution3Choice {

    @XmlElement(name = "VoteIndctn")
    protected VoteInstructionType1Choice voteIndctn;
    @XmlElement(name = "Shrhldr")
    protected NameAndAddress9 shrhldr;

    /**
     * Gets the value of the voteIndctn property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1Choice getVoteIndctn() {
        return voteIndctn;
    }

    /**
     * Sets the value of the voteIndctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public void setVoteIndctn(VoteInstructionType1Choice value) {
        this.voteIndctn = value;
    }

    /**
     * Gets the value of the shrhldr property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress9 }
     *     
     */
    public NameAndAddress9 getShrhldr() {
        return shrhldr;
    }

    /**
     * Sets the value of the shrhldr property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress9 }
     *     
     */
    public void setShrhldr(NameAndAddress9 value) {
        this.shrhldr = value;
    }

}
