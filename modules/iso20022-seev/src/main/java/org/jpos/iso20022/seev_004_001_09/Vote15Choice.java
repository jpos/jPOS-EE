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
 * <p>Java class for Vote15Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vote15Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="VotePerAgndRsltn" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Vote16Choice"/>
 *         <element name="VoteForAllAgndRsltns" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}VoteInstructionType1Choice"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote15Choice", propOrder = {
    "votePerAgndRsltn",
    "voteForAllAgndRsltns"
})
public class Vote15Choice {

    @XmlElement(name = "VotePerAgndRsltn")
    protected Vote16Choice votePerAgndRsltn;
    @XmlElement(name = "VoteForAllAgndRsltns")
    protected VoteInstructionType1Choice voteForAllAgndRsltns;

    /**
     * Gets the value of the votePerAgndRsltn property.
     * 
     * @return
     *     possible object is
     *     {@link Vote16Choice }
     *     
     */
    public Vote16Choice getVotePerAgndRsltn() {
        return votePerAgndRsltn;
    }

    /**
     * Sets the value of the votePerAgndRsltn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vote16Choice }
     *     
     */
    public void setVotePerAgndRsltn(Vote16Choice value) {
        this.votePerAgndRsltn = value;
    }

    /**
     * Gets the value of the voteForAllAgndRsltns property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1Choice getVoteForAllAgndRsltns() {
        return voteForAllAgndRsltns;
    }

    /**
     * Sets the value of the voteForAllAgndRsltns property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public void setVoteForAllAgndRsltns(VoteInstructionType1Choice value) {
        this.voteForAllAgndRsltns = value;
    }

}
