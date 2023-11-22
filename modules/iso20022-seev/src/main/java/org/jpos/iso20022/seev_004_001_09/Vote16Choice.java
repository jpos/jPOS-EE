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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Vote16Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="Vote16Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="VoteInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Vote14" maxOccurs="1000"/>
 *         <element name="GblVoteInstr" type="{urn:iso:std:iso:20022:tech:xsd:seev.004.001.09}Vote15" maxOccurs="1000"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Vote16Choice", propOrder = {
    "voteInstr",
    "gblVoteInstr"
})
public class Vote16Choice {

    @XmlElement(name = "VoteInstr")
    protected List<Vote14> voteInstr;
    @XmlElement(name = "GblVoteInstr")
    protected List<Vote15> gblVoteInstr;

    /**
     * Gets the value of the voteInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote14 }
     * 
     * 
     * @return
     *     The value of the voteInstr property.
     */
    public List<Vote14> getVoteInstr() {
        if (voteInstr == null) {
            voteInstr = new ArrayList<>();
        }
        return this.voteInstr;
    }

    /**
     * Gets the value of the gblVoteInstr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the gblVoteInstr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGblVoteInstr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vote15 }
     * 
     * 
     * @return
     *     The value of the gblVoteInstr property.
     */
    public List<Vote15> getGblVoteInstr() {
        if (gblVoteInstr == null) {
            gblVoteInstr = new ArrayList<>();
        }
        return this.gblVoteInstr;
    }

}
