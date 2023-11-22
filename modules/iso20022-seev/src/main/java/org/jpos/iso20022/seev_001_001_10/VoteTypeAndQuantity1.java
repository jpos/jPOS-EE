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

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteTypeAndQuantity1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteTypeAndQuantity1">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="VoteInstrTp" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteInstructionType1Choice"/>
 *         <element name="VoteQty" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}Number"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteTypeAndQuantity1", propOrder = {
    "voteInstrTp",
    "voteQty"
})
public class VoteTypeAndQuantity1 {

    @XmlElement(name = "VoteInstrTp", required = true)
    protected VoteInstructionType1Choice voteInstrTp;
    @XmlElement(name = "VoteQty", required = true)
    protected BigDecimal voteQty;

    /**
     * Gets the value of the voteInstrTp property.
     * 
     * @return
     *     possible object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public VoteInstructionType1Choice getVoteInstrTp() {
        return voteInstrTp;
    }

    /**
     * Sets the value of the voteInstrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteInstructionType1Choice }
     *     
     */
    public void setVoteInstrTp(VoteInstructionType1Choice value) {
        this.voteInstrTp = value;
    }

    /**
     * Gets the value of the voteQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVoteQty() {
        return voteQty;
    }

    /**
     * Sets the value of the voteQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVoteQty(BigDecimal value) {
        this.voteQty = value;
    }

}
