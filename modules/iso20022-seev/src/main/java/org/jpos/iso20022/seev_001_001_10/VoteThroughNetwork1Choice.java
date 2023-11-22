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

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VoteThroughNetwork1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="VoteThroughNetwork1Choice">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <choice>
 *         <element name="VoteChanl" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}VoteChannel1Code"/>
 *         <element name="VoteDrctlyToIssr" type="{urn:iso:std:iso:20022:tech:xsd:seev.001.001.10}AnyBICDec2014Identifier" maxOccurs="5"/>
 *       </choice>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VoteThroughNetwork1Choice", propOrder = {
    "voteChanl",
    "voteDrctlyToIssr"
})
public class VoteThroughNetwork1Choice {

    @XmlElement(name = "VoteChanl")
    @XmlSchemaType(name = "string")
    protected VoteChannel1Code voteChanl;
    @XmlElement(name = "VoteDrctlyToIssr")
    protected List<String> voteDrctlyToIssr;

    /**
     * Gets the value of the voteChanl property.
     * 
     * @return
     *     possible object is
     *     {@link VoteChannel1Code }
     *     
     */
    public VoteChannel1Code getVoteChanl() {
        return voteChanl;
    }

    /**
     * Sets the value of the voteChanl property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoteChannel1Code }
     *     
     */
    public void setVoteChanl(VoteChannel1Code value) {
        this.voteChanl = value;
    }

    /**
     * Gets the value of the voteDrctlyToIssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the voteDrctlyToIssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVoteDrctlyToIssr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the voteDrctlyToIssr property.
     */
    public List<String> getVoteDrctlyToIssr() {
        if (voteDrctlyToIssr == null) {
            voteDrctlyToIssr = new ArrayList<>();
        }
        return this.voteDrctlyToIssr;
    }

}
